package rased.vpn.app.service.vpn;

import android.content.Context;
import android.content.Intent;
import android.net.VpnService;
import android.util.Log;
import com.mxtunnel.pro.R;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import rased.vpn.app.service.vpn.Tunnel;
import rased.vpn.app.service.vpn.logger.SkStatus;

/* loaded from: classes2.dex */
public class TunnelVpnManager implements Tunnel.HostService {
    private static final String TAG = "TunnelManager";
    public static final String VPN_SETTINGS = "vpnSettings";
    private TunnelVpnSettings mSettings;
    private TunnelVpnService m_parentService;
    private Tunnel m_tunnel;
    private Thread m_tunnelThread;
    private CountDownLatch m_tunnelThreadStopSignal;
    private AtomicBoolean m_isStopping = new AtomicBoolean(false);
    private AtomicBoolean m_isReconnecting = new AtomicBoolean(false);

    public interface ManagerListener {
        void onLog(String str);
    }

    public TunnelVpnManager(TunnelVpnService tunnelVpnService) {
        this.m_tunnel = null;
        this.m_parentService = tunnelVpnService;
        this.m_tunnel = Tunnel.newTunnel(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runTunnel(String str, String[] strArr, boolean z, String str2, boolean z2) {
        this.m_isStopping.set(false);
        try {
            try {
            } catch (Exception e) {
                Log.e(TAG, "Start tunnel failed: " + e.getMessage());
                this.m_parentService.broadcastVpnStart(false);
                if (this.m_isReconnecting.get()) {
                }
            }
            if (!this.m_tunnel.startTunneling(str, strArr, z, str2, z2)) {
                throw new Exception("application is not prepared or revoked");
            }
            Log.i(TAG, "VPN service running");
            this.m_parentService.broadcastVpnStart(true);
            try {
                this.m_tunnelThreadStopSignal.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            this.m_isStopping.set(true);
        } finally {
            if (this.m_isReconnecting.get()) {
                Log.i(TAG, "Parando tunnel.");
                this.m_tunnel.stopTunneling();
            } else {
                Log.i(TAG, "Parando VPN and tunnel.");
                this.m_tunnel.stop();
                this.m_parentService.stopForeground(true);
                this.m_parentService.stopSelf();
            }
            this.m_isReconnecting.set(false);
        }
    }

    private void startTunnel() {
        this.m_tunnelThreadStopSignal = new CountDownLatch(1);
        Thread thread = new Thread(new Runnable() { // from class: rased.vpn.app.service.vpn.TunnelVpnManager.1
            @Override // java.lang.Runnable
            public void run() {
                TunnelVpnManager tunnelVpnManager = TunnelVpnManager.this;
                tunnelVpnManager.runTunnel(tunnelVpnManager.mSettings.mSocksServer, TunnelVpnManager.this.mSettings.mDnsResolver, TunnelVpnManager.this.mSettings.mDnsForward, "127.0.0.1:7300", true);
            }
        });
        this.m_tunnelThread = thread;
        thread.start();
    }

    @Override // rased.vpn.app.service.vpn.Tunnel.HostService
    public String getAppName() {
        return getContext().getString(R.string.app);
    }

    @Override // rased.vpn.app.service.vpn.Tunnel.HostService
    public Context getContext() {
        return this.m_parentService;
    }

    @Override // rased.vpn.app.service.vpn.Tunnel.HostService
    public VpnService getVpnService() {
        return this.m_parentService;
    }

    @Override // rased.vpn.app.service.vpn.Tunnel.HostService
    public VpnService.Builder newVpnServiceBuilder() {
        return this.m_parentService.newBuilder();
    }

    public void onDestroy() throws InterruptedException {
        if (this.m_tunnelThread == null) {
            return;
        }
        signalStopService();
        try {
            this.m_tunnelThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        this.m_tunnelThreadStopSignal = null;
        this.m_tunnelThread = null;
    }

    @Override // rased.vpn.app.service.vpn.Tunnel.HostService
    public void onDiagnosticMessage(String str) {
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        String str;
        Log.i(TAG, "onStartCommand");
        if (intent == null) {
            str = "Failed to receive intent";
        } else {
            TunnelVpnSettings tunnelVpnSettings = (TunnelVpnSettings) intent.getParcelableExtra(VPN_SETTINGS);
            this.mSettings = tunnelVpnSettings;
            if (tunnelVpnSettings == null) {
                str = "Failed to receive the Vpn Settings.";
            } else if (tunnelVpnSettings.mSocksServer == null) {
                str = "Failed to receive the socks server address.";
            } else {
                if (tunnelVpnSettings.mDnsResolver != null) {
                    try {
                        if (this.m_tunnel.startRouting(tunnelVpnSettings)) {
                            return 2;
                        }
                        Log.e(TAG, "Failed to establish VPN");
                        this.m_parentService.broadcastVpnStart(false);
                        return 2;
                    } catch (Exception e) {
                        Log.e(TAG, "Failed to establish VPN: " + e.getMessage());
                        this.m_parentService.broadcastVpnStart(false);
                        return 2;
                    }
                }
                str = "Failed to receive the dns resolvers.";
            }
        }
        Log.e(TAG, str);
        this.m_parentService.broadcastVpnStart(false);
        return 0;
    }

    @Override // rased.vpn.app.service.vpn.Tunnel.HostService
    public void onTunnelConnected() {
        SkStatus.logInfo("<strong>VPN Connected</strong>");
    }

    @Override // rased.vpn.app.service.vpn.Tunnel.HostService
    public void onVpnEstablished() {
        startTunnel();
    }

    public void restartTunnel(String str) {
        Log.i(TAG, "Restarting tunnel.");
        if (str == null || str.equals(this.mSettings.mSocksServer)) {
            this.m_parentService.broadcastVpnStart(true);
            return;
        }
        this.mSettings.mSocksServer = str;
        this.m_isReconnecting.set(true);
        signalStopService();
    }

    public void signalStopService() {
        CountDownLatch countDownLatch = this.m_tunnelThreadStopSignal;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
