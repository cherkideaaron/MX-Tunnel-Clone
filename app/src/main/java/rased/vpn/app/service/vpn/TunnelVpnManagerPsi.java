package rased.vpn.app.service.vpn;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import ca.psiphon.PsiphonTunnel;
import com.mxtunnel.pro.R;
import defpackage.AbstractC3279qd;
import defpackage.C3492ub;
import defpackage.DA;
import defpackage.FA;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.service.vpn.logger.SkStatus;
import rased.vpn.app.utils.PUtils;

/* loaded from: classes2.dex */
public class TunnelVpnManagerPsi implements PsiphonTunnel.HostService {
    private static final String TAG = Deobfuscator$MHRTUNNELVPN$app.getString(-110358536876986L);
    private static PsiphonTunnel m_tunnel;
    public static SocksListener socksListener;
    private C3492ub mConfig;
    private Context mContext;
    private PsiphonVpnService m_parentService;
    private Thread m_tunnelThread;
    private CountDownLatch m_tunnelThreadStopSignal;
    private AtomicBoolean m_isStopping = new AtomicBoolean(false);
    private AtomicBoolean m_isReconnecting = new AtomicBoolean(false);

    public interface ManagerListener {
        void onLog(String str);
    }

    public interface SocksListener {
        void addStatus(String str);

        void restartSocksOpenVPN();

        void startSocksOpenVPN();

        void stopSocksOpenVPN();
    }

    public TunnelVpnManagerPsi(Context context, PsiphonVpnService psiphonVpnService) {
        this.mContext = context;
        this.m_parentService = psiphonVpnService;
        m_tunnel = PsiphonTunnel.newPsiphonTunnel(this, true);
        this.mConfig = C3492ub.c(context);
    }

    public static String getServerEntries(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append(Deobfuscator$MHRTUNNELVPN$app.getString(-110349946942394L));
        }
        return sb.toString();
    }

    public static String loadServerDat(Context context, String str) {
        return AbstractC3279qd.Y(context, str);
    }

    private static byte[] readInputStreamToBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        while (true) {
            int i = inputStream.read(bArr, 0, 16384);
            if (i == -1) {
                byteArrayOutputStream.flush();
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    private static String readInputStreamToString(InputStream inputStream) {
        return new String(readInputStreamToBytes(inputStream), Deobfuscator$MHRTUNNELVPN$app.getString(-110045004264378L));
    }

    public static void setSocksListener(SocksListener socksListener2) {
        socksListener = socksListener2;
    }

    private void startTunnel() {
        this.m_tunnelThreadStopSignal = new CountDownLatch(1);
        Thread thread = new Thread(new Runnable() { // from class: rased.vpn.app.service.vpn.TunnelVpnManagerPsi.1
            @Override // java.lang.Runnable
            public void run() {
                TunnelVpnManagerPsi.this.startPsiphon();
            }
        });
        this.m_tunnelThread = thread;
        thread.start();
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public String getAppName() {
        return this.mContext.getString(R.string.app);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public Context getContext() {
        return this.m_parentService;
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public String getPsiphonConfig() {
        Context context;
        StringBuilder sb;
        long j;
        try {
            return new JSONObject(readInputStreamToString(this.mContext.getResources().openRawResource(R.raw.psiphon_config))).toString();
        } catch (IOException e) {
            e = e;
            context = this.mContext;
            sb = new StringBuilder();
            j = -109426528973754L;
            sb.append(Deobfuscator$MHRTUNNELVPN$app.getString(j));
            sb.append(e.getMessage());
            AbstractC3279qd.i0(context, sb.toString());
            socksListener.stopSocksOpenVPN();
            TunnelManagerHelper.stopPsiphon(this.mContext);
            return Deobfuscator$MHRTUNNELVPN$app.getString(-109692816946106L);
        } catch (JSONException e2) {
            e = e2;
            context = this.mContext;
            sb = new StringBuilder();
            j = -109559672959930L;
            sb.append(Deobfuscator$MHRTUNNELVPN$app.getString(j));
            sb.append(e.getMessage());
            AbstractC3279qd.i0(context, sb.toString());
            socksListener.stopSocksOpenVPN();
            TunnelManagerHelper.stopPsiphon(this.mContext);
            return Deobfuscator$MHRTUNNELVPN$app.getString(-109692816946106L);
        }
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public Object getVpnService() {
        return this.m_parentService;
    }

    @Override // ca.psiphon.PsiphonTunnel.HostLibraryLoader
    public final /* synthetic */ void loadLibrary(String str) {
        DA.a(this, str);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public Object newVpnServiceBuilder() {
        return this.m_parentService.newBuilder();
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onActiveAuthorizationIDs(List list) {
        FA.a(this, list);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onApplicationParameters(Object obj) {
        FA.b(this, obj);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public void onAvailableEgressRegions(List<String> list) {
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onBytesTransferred(long j, long j2) {
        FA.d(this, j, j2);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onClientAddress(String str) {
        FA.e(this, str);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onClientIsLatestVersion() {
        FA.f(this);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onClientRegion(String str) {
        FA.g(this, str);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onClientUpgradeDownloaded(String str) {
        FA.h(this, str);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public void onConnected() {
        socksListener.addStatus(Deobfuscator$MHRTUNNELVPN$app.getString(-109048571851706L));
        socksListener.startSocksOpenVPN();
        SkStatus.updateStateString(Deobfuscator$MHRTUNNELVPN$app.getString(-109091521524666L), Deobfuscator$MHRTUNNELVPN$app.getString(-109134471197626L));
        SkStatus.logInfo(Deobfuscator$MHRTUNNELVPN$app.getString(-109211780608954L));
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public void onConnecting() {
        socksListener.addStatus(Deobfuscator$MHRTUNNELVPN$app.getString(-109001327211450L));
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

    @Override // ca.psiphon.PsiphonTunnel.HostLogger
    public void onDiagnosticMessage(String str) {
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onExiting() {
        FA.k(this);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public void onHomepage(String str) {
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public void onHttpProxyPortInUse(int i) {
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public void onListeningHttpProxyPort(int i) {
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public void onListeningSocksProxyPort(int i) {
        SkStatus.logInfo(R.string.connecting, new Object[0]);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onServerAlert(String str, String str2, List list) {
        FA.p(this, str, str2, list);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public void onSocksProxyPortInUse(int i) {
        SocksListener socksListener2 = socksListener;
        if (socksListener2 != null) {
            socksListener2.stopSocksOpenVPN();
        } else {
            AbstractC3279qd.j0(this.mContext, Deobfuscator$MHRTUNNELVPN$app.getString(-108567535514554L));
        }
        SkStatus.logInfo(Deobfuscator$MHRTUNNELVPN$app.getString(-108696384533434L));
        TunnelManagerHelper.stopPsiphon(this.mContext);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onSplitTunnelRegions(List list) {
        FA.r(this, list);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Log.i(Deobfuscator$MHRTUNNELVPN$app.getString(-109697111913402L), Deobfuscator$MHRTUNNELVPN$app.getString(-109770126357434L));
        try {
            startTunnel();
            return 2;
        } catch (Exception unused) {
            this.m_parentService.broadcastVpnStart(false);
            return 2;
        }
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onStartedWaitingForNetworkConnectivity() {
        FA.s(this);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onStoppedWaitingForNetworkConnectivity() {
        FA.t(this);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onTrafficRateLimits(long j, long j2) {
        FA.u(this, j, j2);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onUntunneledAddress(String str) {
        FA.v(this, str);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public void onUpstreamProxyError(String str) {
        socksListener.stopSocksOpenVPN();
        TunnelManagerHelper.stopPsiphon(this.mContext);
    }

    public void restartTunnel() {
        Log.i(Deobfuscator$MHRTUNNELVPN$app.getString(-109890385441722L), Deobfuscator$MHRTUNNELVPN$app.getString(-109963399885754L));
        this.m_isReconnecting.set(true);
        m_tunnel = PsiphonTunnel.newPsiphonTunnel(this, true);
        startTunnel();
    }

    public void signalStopService() {
        CountDownLatch countDownLatch = this.m_tunnelThreadStopSignal;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        PsiphonTunnel psiphonTunnel = m_tunnel;
        if (psiphonTunnel != null) {
            psiphonTunnel.stop();
            m_tunnel = null;
        }
        socksListener.addStatus(Deobfuscator$MHRTUNNELVPN$app.getString(-109834550866874L));
    }

    public void startPsiphon() {
        String strH = this.mConfig.h();
        String string = Deobfuscator$MHRTUNNELVPN$app.getString(-110070774068154L);
        try {
            string = loadServerDat(this.mContext, Deobfuscator$MHRTUNNELVPN$app.getString(-110075069035450L));
        } catch (Exception e) {
            AbstractC3279qd.i0(this.mContext, Deobfuscator$MHRTUNNELVPN$app.getString(-110122313675706L) + e.getMessage());
            socksListener.stopSocksOpenVPN();
            TunnelManagerHelper.stopPsiphon(this.mContext);
        }
        try {
            m_tunnel.startRouting();
            if (strH.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-110225392890810L))) {
                m_tunnel.startTunneling(PUtils.pDecrypt(this.mContext, string));
            } else {
                m_tunnel.startTunneling(strH);
            }
        } catch (PsiphonTunnel.Exception e2) {
            AbstractC3279qd.i0(this.mContext, Deobfuscator$MHRTUNNELVPN$app.getString(-110246867727290L) + e2.getMessage());
            socksListener.stopSocksOpenVPN();
            TunnelManagerHelper.stopPsiphon(this.mContext);
        }
    }
}
