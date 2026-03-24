package rased.vpn.app.service.vpn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.util.Log;
import com.mxtunnel.pro.R;
import defpackage.AbstractC0115Ga;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.service.vpn.logger.SkStatus;

/* loaded from: classes2.dex */
public class PsiphonTunnelManagerThread implements Runnable {
    private static final int AUTH_TRIES = 1;
    private static final int RECONNECT_TRIES = 5;
    private static final String TAG = "PsiphonTunnelManagerThread";
    private Context mContext;
    private Handler mHandler;
    private OnStopCliente mListener;
    private CountDownLatch mTunnelThreadStopSignal;
    private boolean mRunning = false;
    private boolean mStopping = false;
    private boolean mStarting = false;
    private boolean mConnected = false;
    public boolean mReconnecting = false;
    private BroadcastReceiver m_vpnTunnelBroadcastReceiver = new BroadcastReceiver() { // from class: rased.vpn.app.service.vpn.PsiphonTunnelManagerThread.2
        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            PsiphonTunnelManagerThread psiphonTunnelManagerThread;
            try {
                String action = intent.getAction();
                if (Deobfuscator$MHRTUNNELVPN$app.getString(-107261865456570L).equals(action)) {
                    if (!intent.getBooleanExtra(Deobfuscator$MHRTUNNELVPN$app.getString(-107369239638970L), true)) {
                        psiphonTunnelManagerThread = PsiphonTunnelManagerThread.this;
                        psiphonTunnelManagerThread.stopAll();
                    }
                } else if (Deobfuscator$MHRTUNNELVPN$app.getString(-107489498723258L).equals(action)) {
                    psiphonTunnelManagerThread = PsiphonTunnelManagerThread.this;
                    psiphonTunnelManagerThread.stopAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    };

    public interface OnStopCliente {
        void onStop();
    }

    public PsiphonTunnelManagerThread(Handler handler, Context context) {
        this.mContext = context;
        this.mHandler = handler;
    }

    public static boolean isServiceVpnRunning() {
        return TunnelState.getTunnelState().getTunnelManagerPsi() != null;
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
        try {
            Thread.sleep(1000L);
            while (!this.mStopping) {
                if (TunnelUtils.isNetworkOnline(this.mContext)) {
                    this.mStarting = true;
                    try {
                        startClienteSSH();
                        this.mStarting = false;
                        this.mReconnecting = false;
                        return;
                    } catch (Exception unused) {
                        this.mStarting = false;
                        i = 3;
                    }
                } else {
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
        SkStatus.logInfo(Deobfuscator$MHRTUNNELVPN$app.getString(-107618347742138L) + this.mContext.getString(R.string.starting_service_ssh) + Deobfuscator$MHRTUNNELVPN$app.getString(-107657002447802L));
        int i = 0;
        while (true) {
            if (!this.mStopping) {
                try {
                } catch (Exception unused) {
                    SkStatus.logError(Deobfuscator$MHRTUNNELVPN$app.getString(-107815916237754L) + this.mContext.getString(R.string.state_disconnected) + Deobfuscator$MHRTUNNELVPN$app.getString(-107854570943418L));
                    closeSSH();
                    try {
                        Thread.sleep(3000L);
                    } catch (InterruptedException unused2) {
                        stopAll();
                    }
                }
                if (TunnelUtils.isNetworkOnline(this.mContext)) {
                    if (i > 0) {
                        SkStatus.logInfo(Deobfuscator$MHRTUNNELVPN$app.getString(-107734311859130L) + this.mContext.getString(R.string.state_reconnecting) + Deobfuscator$MHRTUNNELVPN$app.getString(-107772966564794L));
                    }
                    Thread.sleep(1000L);
                    startClienteSSH();
                    break;
                }
                SkStatus.updateStateString(Deobfuscator$MHRTUNNELVPN$app.getString(-107699952120762L), this.mContext.getString(R.string.state_nonetwork));
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
            SkStatus.updateStateString(Deobfuscator$MHRTUNNELVPN$app.getString(-108017779700666L), Deobfuscator$MHRTUNNELVPN$app.getString(-108065024340922L));
            SkStatus.logInfo(Deobfuscator$MHRTUNNELVPN$app.getString(-108146628719546L) + this.mContext.getString(R.string.state_connected) + Deobfuscator$MHRTUNNELVPN$app.getString(-108185283425210L));
            this.mConnected = true;
            startTunnelVpnService();
        } catch (Exception e) {
            this.mConnected = false;
            throw e;
        }
    }

    public void startTunnelVpnService() throws IOException {
        if (!this.mConnected) {
            throw new IOException();
        }
        SkStatus.logInfo(R.string.service_tunnel_start, new Object[0]);
        IntentFilter intentFilter = new IntentFilter(Deobfuscator$MHRTUNNELVPN$app.getString(-108228233098170L));
        intentFilter.addAction(Deobfuscator$MHRTUNNELVPN$app.getString(-108357082117050L));
        AbstractC0115Ga.O(this.mContext, this.m_vpnTunnelBroadcastReceiver, intentFilter);
        if (isServiceVpnRunning()) {
            Log.d(TAG, Deobfuscator$MHRTUNNELVPN$app.getString(-108464456299450L));
            TunnelVpnManagerPsi tunnelManagerPsi = TunnelState.getTunnelState().getTunnelManagerPsi();
            if (tunnelManagerPsi != null) {
                tunnelManagerPsi.restartTunnel();
                return;
            }
            return;
        }
        Intent intent = new Intent(this.mContext, (Class<?>) PsiphonVpnService.class);
        intent.setFlags(268435456);
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
        SkStatus.updateStateString(Deobfuscator$MHRTUNNELVPN$app.getString(-107897520616378L), this.mContext.getString(R.string.stopping_service_ssh));
        SkStatus.logInfo(Deobfuscator$MHRTUNNELVPN$app.getString(-107936175322042L) + this.mContext.getString(R.string.stopping_service_ssh) + Deobfuscator$MHRTUNNELVPN$app.getString(-107974830027706L));
        new Thread(new Runnable() { // from class: rased.vpn.app.service.vpn.PsiphonTunnelManagerThread.1
            @Override // java.lang.Runnable
            public void run() throws InterruptedException {
                PsiphonTunnelManagerThread.this.mStopping = true;
                if (PsiphonTunnelManagerThread.this.mTunnelThreadStopSignal != null) {
                    PsiphonTunnelManagerThread.this.mTunnelThreadStopSignal.countDown();
                }
                PsiphonTunnelManagerThread.this.closeSSH();
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                }
                SkStatus.updateStateString(Deobfuscator$MHRTUNNELVPN$app.getString(-107206030881722L), PsiphonTunnelManagerThread.this.mContext.getString(R.string.state_disconnected));
                PsiphonTunnelManagerThread.this.mRunning = false;
                PsiphonTunnelManagerThread.this.mStarting = false;
                PsiphonTunnelManagerThread.this.mReconnecting = false;
            }
        }).start();
    }

    public void stopForwarder() {
        stopTunnelVpnService();
    }

    public synchronized void stopTunnelVpnService() {
        if (isServiceVpnRunning()) {
            TunnelVpnManagerPsi tunnelManagerPsi = TunnelState.getTunnelState().getTunnelManagerPsi();
            if (tunnelManagerPsi != null) {
                tunnelManagerPsi.signalStopService();
            }
            try {
                this.mContext.unregisterReceiver(this.m_vpnTunnelBroadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
        }
    }
}
