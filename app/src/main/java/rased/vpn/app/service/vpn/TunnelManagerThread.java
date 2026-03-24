package rased.vpn.app.service.vpn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.util.Log;
import com.mxtunnel.pro.R;
import defpackage.AbstractC0115Ga;
import defpackage.AbstractC3279qd;
import defpackage.C3492ub;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.service.vpn.logger.SkStatus;

/* loaded from: classes2.dex */
public class TunnelManagerThread implements Runnable {
    private static final int AUTH_TRIES = 1;
    private static final int RECONNECT_TRIES = 5;
    private static final String TAG = "TunnelManagerThread";
    private C3492ub mConfig;
    private Context mContext;
    private Handler mHandler;
    private OnStopCliente mListener;
    private CountDownLatch mTunnelThreadStopSignal;
    private boolean mRunning = false;
    private boolean mStopping = false;
    private boolean mStarting = false;
    private boolean mConnected = false;
    public boolean mReconnecting = false;
    private BroadcastReceiver m_vpnTunnelBroadcastReceiver = new BroadcastReceiver() { // from class: rased.vpn.app.service.vpn.TunnelManagerThread.3
        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            TunnelManagerThread tunnelManagerThread;
            try {
                String action = intent.getAction();
                if (TunnelVpnService.TUNNEL_VPN_START_BROADCAST.equals(action)) {
                    if (!intent.getBooleanExtra(TunnelVpnService.TUNNEL_VPN_START_SUCCESS_EXTRA, true)) {
                        tunnelManagerThread = TunnelManagerThread.this;
                        tunnelManagerThread.stopAll();
                    }
                } else if (TunnelVpnService.TUNNEL_VPN_DISCONNECT_BROADCAST.equals(action)) {
                    tunnelManagerThread = TunnelManagerThread.this;
                    tunnelManagerThread.stopAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    };

    public interface OnStopCliente {
        void onStop();
    }

    public TunnelManagerThread(Handler handler, Context context) {
        this.mContext = context;
        this.mHandler = handler;
        this.mConfig = new C3492ub(context);
    }

    public static boolean isServiceVpnRunning() {
        TunnelState tunnelState = TunnelState.getTunnelState();
        return tunnelState.getStartingTunnelManager() || tunnelState.getTunnelManager() != null;
    }

    public synchronized void closeSSH() {
        stopForwarder();
    }

    public void reconnectSSH() {
        int i;
        if (this.mStarting || this.mStopping || this.mReconnecting) {
            return;
        }
        this.mReconnecting = true;
        closeSSH();
        SkStatus.updateStateString(SkStatus.SSH_RECONECTANDO, "Reconnecting..");
        try {
            Thread.sleep(1000L);
            while (!this.mStopping) {
                if (TunnelUtils.isNetworkOnline(this.mContext)) {
                    this.mStarting = true;
                    SkStatus.updateStateString(SkStatus.SSH_RECONECTANDO, "Reconnecting..");
                    SkStatus.logInfo("<strong>" + this.mContext.getString(R.string.state_reconnecting) + "</strong>");
                    try {
                        startClienteSSH();
                        this.mStarting = false;
                        this.mReconnecting = false;
                        return;
                    } catch (Exception unused) {
                        SkStatus.logInfo("<strong>" + this.mContext.getString(R.string.state_disconnected) + "</strong>");
                        this.mStarting = false;
                        i = 3;
                    }
                } else {
                    SkStatus.updateStateString(SkStatus.SSH_WAITING, "Waiting for network...");
                    SkStatus.logInfo(R.string.state_nonetwork, new Object[0]);
                    i = 5;
                }
                try {
                    Thread.sleep(i * 1000);
                } catch (InterruptedException unused2) {
                    this.mReconnecting = false;
                    return;
                }
            }
            this.mReconnecting = false;
        } catch (InterruptedException unused3) {
            this.mReconnecting = false;
        }
    }

    @Override // java.lang.Runnable
    public void run() throws InterruptedException {
        this.mStarting = true;
        this.mTunnelThreadStopSignal = new CountDownLatch(1);
        SkStatus.logInfo("<strong>" + this.mContext.getString(R.string.starting_service_ssh) + "</strong>");
        int i = 0;
        while (true) {
            if (!this.mStopping) {
                try {
                } catch (Exception unused) {
                    SkStatus.logError("<strong>" + this.mContext.getString(R.string.state_disconnected) + "</strong>");
                    closeSSH();
                    try {
                        Thread.sleep(3000L);
                    } catch (InterruptedException unused2) {
                        stopAll();
                    }
                }
                if (TunnelUtils.isNetworkOnline(this.mContext)) {
                    if (i > 0) {
                        SkStatus.logInfo("<strong>" + this.mContext.getString(R.string.state_reconnecting) + "</strong>");
                    }
                    Thread.sleep(1000L);
                    startClienteSSH();
                    break;
                }
                SkStatus.updateStateString(SkStatus.SSH_WAITING, this.mContext.getString(R.string.state_nonetwork));
                SkStatus.logInfo(R.string.state_nonetwork, new Object[0]);
                try {
                    Thread.sleep(5000L);
                    i++;
                } catch (InterruptedException unused3) {
                    stopAll();
                }
            } else {
                break;
            }
        }
        this.mStarting = false;
        if (!this.mStopping) {
            try {
                this.mTunnelThreadStopSignal.await();
            } catch (InterruptedException unused4) {
                Thread.currentThread().interrupt();
            }
        }
        OnStopCliente onStopCliente = this.mListener;
        if (onStopCliente != null) {
            onStopCliente.onStop();
        }
    }

    public void setOnStopClienteListener(OnStopCliente onStopCliente) {
        this.mListener = onStopCliente;
    }

    public void startClienteSSH() throws Exception {
        this.mStopping = false;
        this.mRunning = true;
        try {
            SkStatus.updateStateString(SkStatus.SSH_CONNECTED, "UDP Connected");
            SkStatus.logInfo("<strong>" + this.mContext.getString(R.string.state_connected) + "</strong>");
            this.mConnected = true;
            startTunnelVpnService();
        } catch (Exception e) {
            this.mConnected = false;
            throw e;
        }
    }

    public void startForwarder(int i) throws Exception {
        if (!this.mConnected) {
            throw new Exception();
        }
        startTunnelVpnService();
        new Thread(new Runnable() { // from class: rased.vpn.app.service.vpn.TunnelManagerThread.2
            @Override // java.lang.Runnable
            public void run() throws InterruptedException {
                while (TunnelManagerThread.this.mConnected) {
                    try {
                        Thread.sleep(2000L);
                    } catch (InterruptedException unused) {
                        return;
                    }
                }
            }
        }).start();
    }

    public void startTunnelVpnService() throws IOException {
        String str;
        boolean z;
        String[] strArr;
        if (!this.mConnected) {
            throw new IOException();
        }
        SkStatus.logInfo(R.string.service_tunnel_start, new Object[0]);
        IntentFilter intentFilter = new IntentFilter(TunnelVpnService.TUNNEL_VPN_DISCONNECT_BROADCAST);
        intentFilter.addAction(TunnelVpnService.TUNNEL_VPN_START_BROADCAST);
        AbstractC0115Ga.O(this.mContext, this.m_vpnTunnelBroadcastReceiver, intentFilter);
        if (this.mConfig.q().booleanValue()) {
            Locale locale = Locale.ENGLISH;
            str = "127.0.0.1:10808";
        } else {
            Locale locale2 = Locale.ENGLISH;
            str = "127.0.0.1:10802";
        }
        String str2 = str;
        C3492ub c3492ub = this.mConfig;
        c3492ub.getClass();
        if (c3492ub.a.getBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-169010610271162L), false)) {
            SkStatus.logInfo("<strong>Pdnsd Enabled</strong>");
            z = true;
        } else {
            z = false;
        }
        String[] strArr2 = new String[0];
        if (z) {
            C3492ub c3492ub2 = this.mConfig;
            c3492ub2.getClass();
            strArr = new String[]{c3492ub2.a.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-169620495627194L), Deobfuscator$MHRTUNNELVPN$app.getString(-169689215103930L))};
        } else {
            strArr = new String[]{VpnUtils.getNetworkDnsServer(this.mContext).get(0)};
        }
        if (isServiceVpnRunning()) {
            Log.d(TAG, "already running service");
            AbstractC3279qd.j0(this.mContext, "VPN Error, Restart Device!");
            TunnelVpnManager tunnelManager = TunnelState.getTunnelState().getTunnelManager();
            if (tunnelManager != null) {
                tunnelManager.restartTunnel(str2);
                return;
            }
            return;
        }
        Intent intent = new Intent(this.mContext, (Class<?>) TunnelVpnService.class);
        intent.setFlags(268435456);
        intent.putExtra(TunnelVpnManager.VPN_SETTINGS, new TunnelVpnSettings(str2, z, strArr, z, null, strArr2, false, false, new String[0], true, false));
        if (this.mContext.startService(intent) != null) {
            TunnelState.getTunnelState().setStartingTunnelManager();
        } else {
            SkStatus.logInfo(R.string.service_tunnel_failed, new Object[0]);
            throw new IOException(this.mContext.getString(R.string.vpn_service_failed));
        }
    }

    public void stopAll() {
        if (this.mStopping) {
            return;
        }
        SkStatus.updateStateString(SkStatus.SSH_STOPPING, this.mContext.getString(R.string.stopping_service_ssh));
        SkStatus.logInfo("<strong>" + this.mContext.getString(R.string.stopping_service_ssh) + "</strong>");
        new Thread(new Runnable() { // from class: rased.vpn.app.service.vpn.TunnelManagerThread.1
            @Override // java.lang.Runnable
            public void run() throws InterruptedException {
                TunnelManagerThread.this.mStopping = true;
                if (TunnelManagerThread.this.mTunnelThreadStopSignal != null) {
                    TunnelManagerThread.this.mTunnelThreadStopSignal.countDown();
                }
                TunnelManagerThread.this.closeSSH();
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                }
                SkStatus.updateStateString(SkStatus.SSH_DISCONNECTED, TunnelManagerThread.this.mContext.getString(R.string.state_disconnected));
                TunnelManagerThread.this.mRunning = false;
                TunnelManagerThread.this.mStarting = false;
                TunnelManagerThread.this.mReconnecting = false;
            }
        }).start();
    }

    public void stopForwarder() {
        stopTunnelVpnService();
    }

    public synchronized void stopTunnelVpnService() {
        if (isServiceVpnRunning()) {
            SkStatus.logInfo(R.string.service_tunnel_stopping, new Object[0]);
            TunnelVpnManager tunnelManager = TunnelState.getTunnelState().getTunnelManager();
            if (tunnelManager != null) {
                tunnelManager.signalStopService();
            }
            try {
                this.mContext.unregisterReceiver(this.m_vpnTunnelBroadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
        }
    }
}
