package ca.psiphon;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.VpnService;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import defpackage.AbstractC3264qG;
import defpackage.C3492ub;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import psi.Psi;
import psi.PsiphonProvider;
import psi.PsiphonProviderFeedbackHandler;
import psi.PsiphonProviderNetwork;
import psi.PsiphonProviderNoticeHandler;
import rased.vpn.app.service.vpn.logger.SkStatus;

/* loaded from: classes.dex */
public class PsiphonTunnel {
    private static final int UDPGW_SERVER_PORT = 7300;
    private static final int VPN_INTERFACE_MTU = 1500;
    private static final String VPN_INTERFACE_NETMASK = Deobfuscator$MHRTUNNELVPN$app.getString(-16968767992762L);
    private static C3492ub mConfig;
    private static PsiphonTunnel mPsiphonTunnel;
    private final HostService mHostService;
    private PrivateAddress mPrivateAddress;
    private final boolean mShouldRouteThroughTunnelAutomatically;
    private Thread mTun2SocksThread;
    private AtomicBoolean mVpnMode = new AtomicBoolean(false);
    private AtomicReference<ParcelFileDescriptor> mTunFd = new AtomicReference<>();
    private AtomicInteger mLocalSocksProxyPort = new AtomicInteger(0);
    private AtomicBoolean mRoutingThroughTunnel = new AtomicBoolean(false);
    private AtomicBoolean mIsWaitingForNetworkConnectivity = new AtomicBoolean(false);
    private AtomicReference<String> mClientPlatformPrefix = new AtomicReference<>(Deobfuscator$MHRTUNNELVPN$app.getString(-1438166250426L));
    private AtomicReference<String> mClientPlatformSuffix = new AtomicReference<>(Deobfuscator$MHRTUNNELVPN$app.getString(-1442461217722L));
    private AtomicReference<String> mActiveNetworkType = new AtomicReference<>(Deobfuscator$MHRTUNNELVPN$app.getString(-1446756185018L));
    private AtomicReference<String> mActiveNetworkDNSServers = new AtomicReference<>(Deobfuscator$MHRTUNNELVPN$app.getString(-1451051152314L));
    private final NetworkMonitor mNetworkMonitor = new NetworkMonitor(new NetworkMonitor.NetworkChangeListener() { // from class: ca.psiphon.PsiphonTunnel.1
        @Override // ca.psiphon.PsiphonTunnel.NetworkMonitor.NetworkChangeListener
        public void onChanged() {
            try {
                PsiphonTunnel.this.reconnectPsiphon();
            } catch (Exception e) {
                PsiphonTunnel.this.mHostService.onDiagnosticMessage(Deobfuscator$MHRTUNNELVPN$app.getString(-3647173562L) + e);
            }
        }
    });

    public static class Exception extends java.lang.Exception {
        private static final long serialVersionUID = 1;

        public Exception(String str) {
            super(str);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Exception(String str, Throwable th) {
            StringBuilder sbN = AbstractC3264qG.n(str);
            sbN.append(Deobfuscator$MHRTUNNELVPN$app.getString(-80956584890L));
            sbN.append(th.getMessage());
            super(sbN.toString());
        }
    }

    public interface HostFeedbackHandler {
        void sendFeedbackCompleted(java.lang.Exception exc);
    }

    public interface HostLibraryLoader {
        void loadLibrary(String str);
    }

    public interface HostLogger {
        void onDiagnosticMessage(String str);
    }

    public interface HostService extends HostLogger, HostLibraryLoader {
        String getAppName();

        Context getContext();

        String getPsiphonConfig();

        Object getVpnService();

        Object newVpnServiceBuilder();

        void onActiveAuthorizationIDs(List<String> list);

        void onApplicationParameters(Object obj);

        void onAvailableEgressRegions(List<String> list);

        void onBytesTransferred(long j, long j2);

        void onClientAddress(String str);

        void onClientIsLatestVersion();

        void onClientRegion(String str);

        void onClientUpgradeDownloaded(String str);

        void onConnected();

        void onConnecting();

        void onExiting();

        void onHomepage(String str);

        void onHttpProxyPortInUse(int i);

        void onListeningHttpProxyPort(int i);

        void onListeningSocksProxyPort(int i);

        void onServerAlert(String str, String str2, List<String> list);

        void onSocksProxyPortInUse(int i);

        void onSplitTunnelRegions(List<String> list);

        void onStartedWaitingForNetworkConnectivity();

        void onStoppedWaitingForNetworkConnectivity();

        void onTrafficRateLimits(long j, long j2);

        void onUntunneledAddress(String str);

        void onUpstreamProxyError(String str);
    }

    public static class NetworkMonitor {
        private final NetworkChangeListener listener;
        private ConnectivityManager.NetworkCallback networkCallback;

        public interface NetworkChangeListener {
            void onChanged();
        }

        public NetworkMonitor(NetworkChangeListener networkChangeListener) {
            this.listener = networkChangeListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void start(Context context) throws InterruptedException {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Deobfuscator$MHRTUNNELVPN$app.getString(-665072137146L));
            if (connectivityManager == null) {
                return;
            }
            this.networkCallback = new ConnectivityManager.NetworkCallback() { // from class: ca.psiphon.PsiphonTunnel.NetworkMonitor.1
                private Network currentActiveNetwork;
                private boolean isInitialState = true;

                private void consumeActiveNetwork(Network network) {
                    if (this.isInitialState) {
                        this.isInitialState = false;
                        setCurrentActiveNetworkAndProperties(network);
                    } else {
                        if (network.equals(this.currentActiveNetwork)) {
                            return;
                        }
                        setCurrentActiveNetworkAndProperties(network);
                        if (NetworkMonitor.this.listener != null) {
                            NetworkMonitor.this.listener.onChanged();
                        }
                    }
                }

                private void consumeLostNetwork(Network network) {
                    if (network.equals(this.currentActiveNetwork)) {
                        setCurrentActiveNetworkAndProperties(null);
                        if (NetworkMonitor.this.listener != null) {
                            NetworkMonitor.this.listener.onChanged();
                        }
                    }
                }

                /* JADX WARN: Can't wrap try/catch for region: R(12:5|(2:33|6)|(1:8)(2:10|(1:12)(10:13|(1:15)|16|35|17|(4:20|(2:22|38)(1:39)|23|18)|37|25|(1:27)|28))|9|16|35|17|(1:18)|37|25|(0)|28) */
                /* JADX WARN: Removed duplicated region for block: B:20:0x00a0 A[Catch: Exception -> 0x00c1, TryCatch #1 {Exception -> 0x00c1, blocks: (B:17:0x008c, B:18:0x009a, B:20:0x00a0, B:22:0x00b9, B:23:0x00bd), top: B:35:0x008c }] */
                /* JADX WARN: Removed duplicated region for block: B:27:0x00f7  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private void setCurrentActiveNetworkAndProperties(android.net.Network r7) {
                    /*
                        r6 = this;
                        r6.currentActiveNetwork = r7
                        if (r7 != 0) goto L42
                        ca.psiphon.PsiphonTunnel r7 = ca.psiphon.PsiphonTunnel.access$1600()
                        java.util.concurrent.atomic.AtomicReference r7 = ca.psiphon.PsiphonTunnel.access$1700(r7)
                        r0 = -93841486778(0xffffffea269c8c46, double:NaN)
                        java.lang.String r0 = org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app.getString(r0)
                        r7.set(r0)
                        ca.psiphon.PsiphonTunnel r7 = ca.psiphon.PsiphonTunnel.access$1600()
                        java.util.concurrent.atomic.AtomicReference r7 = ca.psiphon.PsiphonTunnel.access$1800(r7)
                        r0 = -115316323258(0xffffffe5269c8c46, double:NaN)
                        java.lang.String r0 = org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app.getString(r0)
                        r7.set(r0)
                        ca.psiphon.PsiphonTunnel r7 = ca.psiphon.PsiphonTunnel.access$1600()
                        ca.psiphon.PsiphonTunnel$HostService r7 = ca.psiphon.PsiphonTunnel.access$000(r7)
                        r0 = -119611290554(0xffffffe4269c8c46, double:NaN)
                        java.lang.String r0 = org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app.getString(r0)
                        r7.onDiagnosticMessage(r0)
                        goto L116
                    L42:
                        r0 = -312884818874(0xffffffb7269c8c46, double:NaN)
                        java.lang.String r0 = org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app.getString(r0)
                        r1 = 1
                        android.net.ConnectivityManager r2 = r2     // Catch: java.lang.Exception -> L7c
                        android.net.NetworkCapabilities r2 = r2.getNetworkCapabilities(r7)     // Catch: java.lang.Exception -> L7c
                        r3 = 4
                        boolean r3 = r2.hasTransport(r3)     // Catch: java.lang.Exception -> L7c
                        if (r3 == 0) goto L63
                        r2 = -347244557242(0xffffffaf269c8c46, double:NaN)
                    L5e:
                        java.lang.String r0 = org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app.getString(r2)     // Catch: java.lang.Exception -> L7c
                        goto L7c
                    L63:
                        r3 = 0
                        boolean r3 = r2.hasTransport(r3)     // Catch: java.lang.Exception -> L7c
                        if (r3 == 0) goto L70
                        r2 = -364424426426(0xffffffab269c8c46, double:NaN)
                        goto L5e
                    L70:
                        boolean r2 = r2.hasTransport(r1)     // Catch: java.lang.Exception -> L7c
                        if (r2 == 0) goto L7c
                        r2 = -394489197498(0xffffffa4269c8c46, double:NaN)
                        goto L5e
                    L7c:
                        ca.psiphon.PsiphonTunnel r2 = ca.psiphon.PsiphonTunnel.access$1600()
                        java.util.concurrent.atomic.AtomicReference r2 = ca.psiphon.PsiphonTunnel.access$1700(r2)
                        r2.set(r0)
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        android.net.ConnectivityManager r3 = r2     // Catch: java.lang.Exception -> Lc1
                        android.net.LinkProperties r7 = r3.getLinkProperties(r7)     // Catch: java.lang.Exception -> Lc1
                        java.util.List r7 = r7.getDnsServers()     // Catch: java.lang.Exception -> Lc1
                        java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> Lc1
                    L9a:
                        boolean r3 = r7.hasNext()     // Catch: java.lang.Exception -> Lc1
                        if (r3 == 0) goto Lc1
                        java.lang.Object r3 = r7.next()     // Catch: java.lang.Exception -> Lc1
                        java.net.InetAddress r3 = (java.net.InetAddress) r3     // Catch: java.lang.Exception -> Lc1
                        java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> Lc1
                        r4 = -415964033978(0xffffff9f269c8c46, double:NaN)
                        java.lang.String r4 = org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app.getString(r4)     // Catch: java.lang.Exception -> Lc1
                        boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Exception -> Lc1
                        if (r4 == 0) goto Lbd
                        java.lang.String r3 = r3.substring(r1)     // Catch: java.lang.Exception -> Lc1
                    Lbd:
                        r2.add(r3)     // Catch: java.lang.Exception -> Lc1
                        goto L9a
                    Lc1:
                        ca.psiphon.PsiphonTunnel r7 = ca.psiphon.PsiphonTunnel.access$1600()
                        java.util.concurrent.atomic.AtomicReference r7 = ca.psiphon.PsiphonTunnel.access$1800(r7)
                        r3 = -424553968570(0xffffff9d269c8c46, double:NaN)
                        java.lang.String r1 = org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app.getString(r3)
                        java.lang.String r1 = android.text.TextUtils.join(r1, r2)
                        r7.set(r1)
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        r7.<init>()
                        r3 = -433143903162(0xffffff9b269c8c46, double:NaN)
                        java.lang.String r1 = org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app.getString(r3)
                        r7.append(r1)
                        r7.append(r0)
                        java.lang.String r7 = r7.toString()
                        boolean r0 = r2.isEmpty()
                        if (r0 != 0) goto L10b
                        java.lang.StringBuilder r7 = defpackage.AbstractC3264qG.n(r7)
                        r0 = -622122464186(0xffffff6f269c8c46, double:NaN)
                        java.lang.String r0 = org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app.getString(r0)
                        r7.append(r0)
                        java.lang.String r7 = r7.toString()
                    L10b:
                        ca.psiphon.PsiphonTunnel r0 = ca.psiphon.PsiphonTunnel.access$1600()
                        ca.psiphon.PsiphonTunnel$HostService r0 = ca.psiphon.PsiphonTunnel.access$000(r0)
                        r0.onDiagnosticMessage(r7)
                    L116:
                        java.util.concurrent.CountDownLatch r7 = r3
                        r7.countDown()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ca.psiphon.PsiphonTunnel.NetworkMonitor.AnonymousClass1.setCurrentActiveNetworkAndProperties(android.net.Network):void");
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    super.onAvailable(network);
                    if (Build.VERSION.SDK_INT >= 26) {
                        return;
                    }
                    consumeActiveNetwork(network);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    super.onCapabilitiesChanged(network, networkCapabilities);
                    if (networkCapabilities.hasCapability(16)) {
                        consumeActiveNetwork(network);
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    super.onLost(network);
                    consumeLostNetwork(network);
                }
            };
            try {
                NetworkRequest.Builder builderAddCapability = new NetworkRequest.Builder().addCapability(12);
                if (PsiphonTunnel.mPsiphonTunnel.mVpnMode.get()) {
                    builderAddCapability.addCapability(15);
                } else {
                    builderAddCapability.removeCapability(15);
                }
                connectivityManager.requestNetwork(builderAddCapability.build(), this.networkCallback);
            } catch (RuntimeException unused) {
                this.networkCallback = null;
            }
            countDownLatch.await(1L, TimeUnit.SECONDS);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void stop(Context context) {
            ConnectivityManager connectivityManager;
            if (this.networkCallback == null || (connectivityManager = (ConnectivityManager) context.getSystemService(Deobfuscator$MHRTUNNELVPN$app.getString(-720906711994L))) == null) {
                return;
            }
            try {
                connectivityManager.unregisterNetworkCallback(this.networkCallback);
            } catch (RuntimeException unused) {
            }
            this.networkCallback = null;
        }
    }

    public static class PrivateAddress {
        public final String mIpAddress;
        public final int mPrefixLength;
        public final String mRouter;
        public final String mSubnet;

        public PrivateAddress(String str, String str2, int i, String str3) {
            this.mIpAddress = str;
            this.mSubnet = str2;
            this.mPrefixLength = i;
            this.mRouter = str3;
        }
    }

    public class PsiphonProviderShim implements PsiphonProvider {
        private PsiphonTunnel mPsiphonTunnel;

        public PsiphonProviderShim(PsiphonTunnel psiphonTunnel) {
            this.mPsiphonTunnel = psiphonTunnel;
        }

        @Override // psi.PsiphonProvider
        public String bindToDevice(long j) {
            return this.mPsiphonTunnel.bindToDevice(j);
        }

        @Override // psi.PsiphonProvider
        public String getDNSServersAsString() {
            return this.mPsiphonTunnel.getDNSServers(PsiphonTunnel.this.mHostService.getContext(), PsiphonTunnel.this.mHostService);
        }

        @Override // psi.PsiphonProvider, psi.PsiphonProviderNetwork
        public String getNetworkID() {
            return PsiphonTunnel.getNetworkID(PsiphonTunnel.this.mHostService.getContext(), this.mPsiphonTunnel.isVpnMode());
        }

        @Override // psi.PsiphonProvider, psi.PsiphonProviderNetwork
        public long hasIPv6Route() {
            return PsiphonTunnel.hasIPv6Route(PsiphonTunnel.this.mHostService.getContext(), PsiphonTunnel.this.mHostService);
        }

        @Override // psi.PsiphonProvider, psi.PsiphonProviderNetwork
        public long hasNetworkConnectivity() {
            return this.mPsiphonTunnel.hasNetworkConnectivity();
        }

        @Override // psi.PsiphonProvider, psi.PsiphonProviderNetwork
        public String iPv6Synthesize(String str) {
            return PsiphonTunnel.iPv6Synthesize(str);
        }

        @Override // psi.PsiphonProvider, psi.PsiphonProviderNoticeHandler
        public void notice(String str) throws JSONException {
            this.mPsiphonTunnel.notice(str);
        }
    }

    public static class PsiphonTunnelFeedback {
        private final ExecutorService workQueue = Executors.newSingleThreadExecutor();
        private final ExecutorService callbackQueue = Executors.newSingleThreadExecutor();

        /* renamed from: ca.psiphon.PsiphonTunnel$PsiphonTunnelFeedback$1, reason: invalid class name */
        public class AnonymousClass1 implements Runnable {
            final /* synthetic */ String val$clientPlatformPrefix;
            final /* synthetic */ String val$clientPlatformSuffix;
            final /* synthetic */ Context val$context;
            final /* synthetic */ String val$diagnosticsJson;
            final /* synthetic */ String val$feedbackConfigJson;
            final /* synthetic */ HostFeedbackHandler val$feedbackHandler;
            final /* synthetic */ HostLogger val$logger;
            final /* synthetic */ String val$uploadPath;

            public AnonymousClass1(Context context, HostLogger hostLogger, String str, String str2, String str3, String str4, String str5, HostFeedbackHandler hostFeedbackHandler) {
                this.val$context = context;
                this.val$logger = hostLogger;
                this.val$feedbackConfigJson = str;
                this.val$clientPlatformPrefix = str2;
                this.val$clientPlatformSuffix = str3;
                this.val$diagnosticsJson = str4;
                this.val$uploadPath = str5;
                this.val$feedbackHandler = hostFeedbackHandler;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Psi.startSendFeedback(PsiphonTunnel.buildPsiphonConfig(this.val$context, this.val$logger, this.val$feedbackConfigJson, this.val$clientPlatformPrefix, this.val$clientPlatformSuffix, false, 0), this.val$diagnosticsJson, this.val$uploadPath, new PsiphonProviderFeedbackHandler() { // from class: ca.psiphon.PsiphonTunnel.PsiphonTunnelFeedback.1.1
                        @Override // psi.PsiphonProviderFeedbackHandler
                        public void sendFeedbackCompleted(final java.lang.Exception exc) {
                            try {
                                PsiphonTunnelFeedback.this.callbackQueue.execute(new Runnable() { // from class: ca.psiphon.PsiphonTunnel.PsiphonTunnelFeedback.1.1.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        AnonymousClass1.this.val$feedbackHandler.sendFeedbackCompleted(exc);
                                    }
                                });
                            } catch (RejectedExecutionException unused) {
                            }
                        }
                    }, new PsiphonProviderNetwork() { // from class: ca.psiphon.PsiphonTunnel.PsiphonTunnelFeedback.1.2
                        @Override // psi.PsiphonProviderNetwork
                        public String getNetworkID() {
                            return PsiphonTunnel.getNetworkID(AnonymousClass1.this.val$context, false);
                        }

                        @Override // psi.PsiphonProviderNetwork
                        public long hasIPv6Route() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            return PsiphonTunnel.hasIPv6Route(anonymousClass1.val$context, anonymousClass1.val$logger);
                        }

                        @Override // psi.PsiphonProviderNetwork
                        public long hasNetworkConnectivity() {
                            return PsiphonTunnel.hasNetworkConnectivity(AnonymousClass1.this.val$context) ? 1L : 0L;
                        }

                        @Override // psi.PsiphonProviderNetwork
                        public String iPv6Synthesize(String str) {
                            return PsiphonTunnel.iPv6Synthesize(str);
                        }
                    }, new PsiphonProviderNoticeHandler() { // from class: ca.psiphon.PsiphonTunnel.PsiphonTunnelFeedback.1.3
                        @Override // psi.PsiphonProviderNoticeHandler
                        public void notice(String str) throws JSONException {
                            JSONObject jSONObject;
                            String string;
                            JSONObject jSONObject2;
                            try {
                                try {
                                    jSONObject = new JSONObject(str);
                                    string = jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-875525534650L));
                                } catch (java.lang.Exception e) {
                                    PsiphonTunnelFeedback.this.callbackQueue.execute(new Runnable() { // from class: ca.psiphon.PsiphonTunnel.PsiphonTunnelFeedback.1.3.2
                                        @Override // java.lang.Runnable
                                        public void run() {
                                            AnonymousClass1.this.val$logger.onDiagnosticMessage(Deobfuscator$MHRTUNNELVPN$app.getString(-776741286842L) + e.toString());
                                        }
                                    });
                                }
                                if (string == null || (jSONObject2 = jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-922770174906L))) == null) {
                                    return;
                                }
                                final String str2 = string + Deobfuscator$MHRTUNNELVPN$app.getString(-944245011386L) + jSONObject2.toString();
                                PsiphonTunnelFeedback.this.callbackQueue.execute(new Runnable() { // from class: ca.psiphon.PsiphonTunnel.PsiphonTunnelFeedback.1.3.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        AnonymousClass1.this.val$logger.onDiagnosticMessage(str2);
                                    }
                                });
                            } catch (RejectedExecutionException unused) {
                            }
                        }
                    }, false, true);
                } catch (java.lang.Exception e) {
                    try {
                        PsiphonTunnelFeedback.this.callbackQueue.execute(new Runnable() { // from class: ca.psiphon.PsiphonTunnel.PsiphonTunnelFeedback.1.4
                            @Override // java.lang.Runnable
                            public void run() {
                                AnonymousClass1.this.val$feedbackHandler.sendFeedbackCompleted(new Exception(Deobfuscator$MHRTUNNELVPN$app.getString(-957129913274L), e));
                            }
                        });
                    } catch (RejectedExecutionException unused) {
                    }
                }
            }
        }

        public void shutdown() {
            this.workQueue.execute(new Runnable() { // from class: ca.psiphon.PsiphonTunnel.PsiphonTunnelFeedback.2
                @Override // java.lang.Runnable
                public void run() {
                    Psi.stopSendFeedback();
                }
            });
            shutdownAndAwaitTermination(this.workQueue);
            shutdownAndAwaitTermination(this.callbackQueue);
        }

        public void shutdownAndAwaitTermination(ExecutorService executorService) {
            try {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (executorService.awaitTermination(5L, timeUnit)) {
                    return;
                }
                executorService.shutdownNow();
                if (executorService.awaitTermination(5L, timeUnit)) {
                    return;
                }
                System.err.println(Deobfuscator$MHRTUNNELVPN$app.getString(-1055914161082L));
            } catch (InterruptedException unused) {
                executorService.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }

        public void startSendFeedback(Context context, HostFeedbackHandler hostFeedbackHandler, HostLogger hostLogger, String str, String str2, String str3, String str4, String str5) {
            this.workQueue.execute(new AnonymousClass1(context, hostLogger, str, str4, str5, str2, str3, hostFeedbackHandler));
        }
    }

    private PsiphonTunnel(HostService hostService, boolean z) {
        this.mHostService = hostService;
        this.mShouldRouteThroughTunnelAutomatically = z;
    }

    private void applyPerAppRules(VpnService.Builder builder) {
        try {
            C3492ub c3492ubC = C3492ub.c(this.mHostService.getContext());
            c3492ubC.getClass();
            if (c3492ubC.a.getBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-169139459290042L), false)) {
                if (c3492ubC.b()) {
                    for (String str : c3492ubC.a()) {
                        try {
                            builder.addDisallowedApplication(str);
                            SkStatus.logInfo(Deobfuscator$MHRTUNNELVPN$app.getString(-1876252914618L) + str);
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
                    return;
                }
                for (String str2 : c3492ubC.a()) {
                    try {
                        builder.addAllowedApplication(str2);
                        SkStatus.logInfo(Deobfuscator$MHRTUNNELVPN$app.getString(-1983627097018L) + str2);
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                }
            }
        } catch (Throwable th) {
            this.mHostService.onDiagnosticMessage(Deobfuscator$MHRTUNNELVPN$app.getString(-2078116377530L) + th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String bindToDevice(long j) throws Exception {
        if (((VpnService) this.mHostService.getVpnService()).protect((int) j)) {
            return Deobfuscator$MHRTUNNELVPN$app.getString(-3074548790202L);
        }
        throw new Exception(Deobfuscator$MHRTUNNELVPN$app.getString(-2980059509690L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String buildPsiphonConfig(Context context, HostLogger hostLogger, String str, String str2, String str3, boolean z, Integer num) throws Exception, JSONException {
        mConfig = C3492ub.c(context);
        JSONObject jSONObject = new JSONObject(str);
        if (!jSONObject.has(Deobfuscator$MHRTUNNELVPN$app.getString(-4268549698490L))) {
            File fileDefaultDataRootDirectory = defaultDataRootDirectory(context);
            if (!fileDefaultDataRootDirectory.exists() && !fileDefaultDataRootDirectory.mkdir()) {
                throw new Exception(Deobfuscator$MHRTUNNELVPN$app.getString(-4345859109818L) + fileDefaultDataRootDirectory.getPath());
            }
            jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-4513362834362L), defaultDataRootDirectory(context));
        }
        if (!jSONObject.has(Deobfuscator$MHRTUNNELVPN$app.getString(-4590672245690L))) {
            jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-4672276624314L), context.getFilesDir());
        }
        if (!jSONObject.has(Deobfuscator$MHRTUNNELVPN$app.getString(-4783945774010L))) {
            jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-5024463942586L), new File(context.getFilesDir(), Deobfuscator$MHRTUNNELVPN$app.getString(-4925679694778L)).getAbsolutePath());
        }
        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-5213442503610L), new File(context.getFilesDir(), Deobfuscator$MHRTUNNELVPN$app.getString(-5196262634426L)).getAbsolutePath());
        if (!jSONObject.has(Deobfuscator$MHRTUNNELVPN$app.getString(-5406716031930L))) {
            jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-5535565050810L), 0);
        }
        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-5664414069690L), true);
        if (num.intValue() != 0 && (!jSONObject.has(Deobfuscator$MHRTUNNELVPN$app.getString(-5754608382906L)) || jSONObject.getInt(Deobfuscator$MHRTUNNELVPN$app.getString(-5840507728826L)) == 0)) {
            jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-5926407074746L), num);
        }
        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-6141155439546L), getDeviceRegion(context));
        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-6196990014394L), 1);
        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-6274299425722L), true);
        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-6368788706234L), Deobfuscator$MHRTUNNELVPN$app.getString(-6433213215674L));
        StringBuilder sb = new StringBuilder();
        if (str2.length() > 0) {
            sb.append(str2);
        }
        sb.append(Deobfuscator$MHRTUNNELVPN$app.getString(-6437508182970L));
        sb.append(Deobfuscator$MHRTUNNELVPN$app.getString(-6476162888634L));
        sb.append(Deobfuscator$MHRTUNNELVPN$app.getString(-6493342757818L));
        sb.append(Deobfuscator$MHRTUNNELVPN$app.getString(-6501932692410L));
        if (str3.length() > 0) {
            sb.append(str3);
        }
        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-6656551515066L), sb.toString().replaceAll(Deobfuscator$MHRTUNNELVPN$app.getString(-6720976024506L), Deobfuscator$MHRTUNNELVPN$app.getString(-6763925697466L)));
        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-6772515632058L), Deobfuscator$MHRTUNNELVPN$app.getString(-6922839487418L));
        jSONObject.put(Deobfuscator$MHRTUNNELVPN$app.getString(-10071050515386L), Deobfuscator$MHRTUNNELVPN$app.getString(-10156949861306L));
        return jSONObject.toString();
    }

    private static File defaultDataRootDirectory(Context context) {
        return context.getFileStreamPath(Deobfuscator$MHRTUNNELVPN$app.getString(-1279252460474L));
    }

    private static native int disableUdpGwKeepalive();

    private static native int enableUdpGwKeepalive();

    private static Collection<InetAddress> getActiveNetworkDNSServerAddresses(Context context, boolean z) throws Exception, IllegalAccessException, InterruptedException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Deobfuscator$MHRTUNNELVPN$app.getString(-16002400351162L);
        ArrayList arrayList = new ArrayList();
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Deobfuscator$MHRTUNNELVPN$app.getString(-16182788977594L));
        if (connectivityManager == null) {
            throw new Exception(Deobfuscator$MHRTUNNELVPN$app.getString(-16238623552442L), new Throwable(Deobfuscator$MHRTUNNELVPN$app.getString(-16419012178874L)));
        }
        try {
            Class.forName(Deobfuscator$MHRTUNNELVPN$app.getString(-16625170609082L));
            Object objInvoke = ConnectivityManager.class.getMethod(Deobfuscator$MHRTUNNELVPN$app.getString(-16741134726074L), null).invoke(connectivityManager, null);
            if (objInvoke != null) {
                Iterator<InetAddress> it = ((LinkProperties) objInvoke).getDnsServers().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        NetworkRequest.Builder builderAddCapability = new NetworkRequest.Builder().addCapability(12);
        if (z) {
            builderAddCapability.addCapability(15);
        }
        NetworkRequest networkRequestBuild = builderAddCapability.build();
        final ArrayList arrayList2 = new ArrayList();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: ca.psiphon.PsiphonTunnel.3
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                    synchronized (arrayList2) {
                        arrayList2.addAll(linkProperties.getDnsServers());
                    }
                    countDownLatch.countDown();
                }
            };
            connectivityManager.registerNetworkCallback(networkRequestBuild, networkCallback);
            countDownLatch.await(1L, TimeUnit.SECONDS);
            connectivityManager.unregisterNetworkCallback(networkCallback);
        } catch (InterruptedException unused2) {
            Thread.currentThread().interrupt();
        } catch (RuntimeException unused3) {
        }
        synchronized (arrayList2) {
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    private static Collection<String> getActiveNetworkDNSServers(Context context, boolean z) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<InetAddress> it = getActiveNetworkDNSServerAddresses(context, z).iterator();
        while (it.hasNext()) {
            String string = it.next().toString();
            if (string.startsWith(Deobfuscator$MHRTUNNELVPN$app.getString(-15860666430394L))) {
                string = string.substring(1);
            }
            arrayList.add(string);
        }
        if (arrayList.isEmpty()) {
            throw new Exception(Deobfuscator$MHRTUNNELVPN$app.getString(-15869256364986L));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getDNSServers(Context context, HostLogger hostLogger) {
        String str = this.mActiveNetworkDNSServers.get();
        if (str != Deobfuscator$MHRTUNNELVPN$app.getString(-3078843757498L)) {
            return str;
        }
        try {
            return TextUtils.join(Deobfuscator$MHRTUNNELVPN$app.getString(-3083138724794L), getActiveNetworkDNSServers(context, this.mVpnMode.get()));
        } catch (Exception e) {
            hostLogger.onDiagnosticMessage(Deobfuscator$MHRTUNNELVPN$app.getString(-3091728659386L) + e.getMessage());
            return str;
        }
    }

    public static String getDefaultUpgradeDownloadFilePath(Context context) {
        return Psi.upgradeDownloadFilePath(defaultDataRootDirectory(context).getAbsolutePath());
    }

    private static String getDeviceRegion(Context context) {
        Locale locale;
        String string = Deobfuscator$MHRTUNNELVPN$app.getString(-14378902713274L);
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Deobfuscator$MHRTUNNELVPN$app.getString(-14383197680570L));
        if (telephonyManager != null) {
            if (telephonyManager.getPhoneType() != 2 && (string = telephonyManager.getNetworkCountryIso()) == null) {
                string = Deobfuscator$MHRTUNNELVPN$app.getString(-14408967484346L);
            }
            if (string.length() == 0 && (string = telephonyManager.getSimCountryIso()) == null) {
                string = Deobfuscator$MHRTUNNELVPN$app.getString(-14413262451642L);
            }
        }
        if (string.length() == 0 && (locale = Locale.getDefault()) != null) {
            string = locale.getCountry();
        }
        return string.toUpperCase(Locale.US);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getNetworkID(Context context, boolean z) {
        NetworkCapabilities networkCapabilities;
        String str;
        String string = Deobfuscator$MHRTUNNELVPN$app.getString(-3405261271994L);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Deobfuscator$MHRTUNNELVPN$app.getString(-3439621010362L));
        NetworkInfo activeNetworkInfo = null;
        if (!z) {
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } catch (java.lang.Exception unused) {
                networkCapabilities = null;
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                return Deobfuscator$MHRTUNNELVPN$app.getString(-3495455585210L);
            }
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (java.lang.Exception unused2) {
        }
        try {
            if (activeNetworkInfo != null && activeNetworkInfo.getType() == 1) {
                String string2 = Deobfuscator$MHRTUNNELVPN$app.getString(-3512635454394L);
                WifiInfo connectionInfo = ((WifiManager) context.getSystemService(Deobfuscator$MHRTUNNELVPN$app.getString(-3534110290874L))).getConnectionInfo();
                if (connectionInfo == null) {
                    return string2;
                }
                String bssid = connectionInfo.getBSSID();
                if (bssid.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-3555585127354L))) {
                    bssid = String.valueOf(connectionInfo.getIpAddress());
                }
                str = string2 + Deobfuscator$MHRTUNNELVPN$app.getString(-3632894538682L) + bssid;
            } else {
                if (activeNetworkInfo == null || activeNetworkInfo.getType() != 0) {
                    return string;
                }
                String string3 = Deobfuscator$MHRTUNNELVPN$app.getString(-3641484473274L);
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Deobfuscator$MHRTUNNELVPN$app.getString(-3671549244346L));
                if (telephonyManager == null) {
                    return string3;
                }
                str = string3 + Deobfuscator$MHRTUNNELVPN$app.getString(-3697319048122L) + telephonyManager.getNetworkOperator();
            }
            return str;
        } catch (java.lang.Exception unused3) {
            return string;
        }
    }

    public static String getUpgradeDownloadFilePath(String str) {
        return Psi.upgradeDownloadFilePath(str);
    }

    private void handlePsiphonNotice(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(Deobfuscator$MHRTUNNELVPN$app.getString(-10483367375802L));
            if (string.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-10530612016058L))) {
                int i = jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-10564971754426L)).getInt(Deobfuscator$MHRTUNNELVPN$app.getString(-10586446590906L));
                if (i == 0) {
                    this.mHostService.onConnecting();
                } else if (i == 1) {
                    if (isVpnMode() && this.mShouldRouteThroughTunnelAutomatically) {
                        routeThroughTunnel();
                    }
                    this.mHostService.onConnected();
                }
            } else {
                int i2 = 0;
                if (string.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-10612216394682L))) {
                    JSONArray jSONArray = jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-10711000642490L)).getJSONArray(Deobfuscator$MHRTUNNELVPN$app.getString(-10732475478970L));
                    ArrayList arrayList = new ArrayList();
                    while (i2 < jSONArray.length()) {
                        arrayList.add(jSONArray.getString(i2));
                        i2++;
                    }
                    this.mHostService.onAvailableEgressRegions(arrayList);
                } else if (string.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-10766835217338L))) {
                    this.mHostService.onSocksProxyPortInUse(jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-10852734563258L)).getInt(Deobfuscator$MHRTUNNELVPN$app.getString(-10874209399738L)));
                } else if (string.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-10895684236218L))) {
                    this.mHostService.onHttpProxyPortInUse(jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-10977288614842L)).getInt(Deobfuscator$MHRTUNNELVPN$app.getString(-10998763451322L)));
                } else if (string.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-11020238287802L))) {
                    int i3 = jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-11123317502906L)).getInt(Deobfuscator$MHRTUNNELVPN$app.getString(-11144792339386L));
                    setLocalSocksProxyPort(i3);
                    this.mHostService.onListeningSocksProxyPort(i3);
                } else if (string.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-11166267175866L))) {
                    this.mHostService.onListeningHttpProxyPort(jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-11265051423674L)).getInt(Deobfuscator$MHRTUNNELVPN$app.getString(-11286526260154L)));
                } else {
                    if (string.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-11308001096634L))) {
                        this.mHostService.onUpstreamProxyError(jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-11389605475258L)).getString(Deobfuscator$MHRTUNNELVPN$app.getString(-11411080311738L)));
                        return;
                    }
                    if (string.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-11445440050106L))) {
                        this.mHostService.onClientUpgradeDownloaded(jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-11548519265210L)).getString(Deobfuscator$MHRTUNNELVPN$app.getString(-11569994101690L)));
                    } else if (string.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-11608648807354L))) {
                        this.mHostService.onClientIsLatestVersion();
                    } else if (string.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-11703138087866L))) {
                        this.mHostService.onHomepage(jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-11741792793530L)).getString(Deobfuscator$MHRTUNNELVPN$app.getString(-11763267630010L)));
                    } else if (string.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-11780447499194L))) {
                        this.mHostService.onClientRegion(jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-11836282074042L)).getString(Deobfuscator$MHRTUNNELVPN$app.getString(-11857756910522L)));
                    } else {
                        if (string.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-11887821681594L))) {
                            this.mHostService.onClientAddress(jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-11947951223738L)).getString(Deobfuscator$MHRTUNNELVPN$app.getString(-11969426060218L)));
                            return;
                        }
                        if (string.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-12003785798586L))) {
                            JSONArray jSONArray2 = jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-12085390177210L)).getJSONArray(Deobfuscator$MHRTUNNELVPN$app.getString(-12106865013690L));
                            ArrayList arrayList2 = new ArrayList();
                            while (i2 < jSONArray2.length()) {
                                arrayList2.add(jSONArray2.getString(i2));
                                i2++;
                            }
                            this.mHostService.onSplitTunnelRegions(arrayList2);
                        } else {
                            if (string.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-12141224752058L))) {
                                this.mHostService.onUntunneledAddress(jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-12188469392314L)).getString(Deobfuscator$MHRTUNNELVPN$app.getString(-12209944228794L)));
                                return;
                            }
                            if (string.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-12244303967162L))) {
                                JSONObject jSONObject2 = jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-12317318411194L));
                                this.mHostService.onBytesTransferred(jSONObject2.getLong(Deobfuscator$MHRTUNNELVPN$app.getString(-12338793247674L)), jSONObject2.getLong(Deobfuscator$MHRTUNNELVPN$app.getString(-12360268084154L)));
                                return;
                            }
                            if (string.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-12398922789818L))) {
                                JSONArray jSONArray3 = jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-12497707037626L)).getJSONArray(Deobfuscator$MHRTUNNELVPN$app.getString(-12519181874106L));
                                ArrayList arrayList3 = new ArrayList();
                                while (i2 < jSONArray3.length()) {
                                    arrayList3.add(jSONArray3.getString(i2));
                                    i2++;
                                }
                                this.mHostService.onActiveAuthorizationIDs(arrayList3);
                            } else if (string.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-12536361743290L))) {
                                this.mHostService.onExiting();
                            } else if (string.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-12570721481658L))) {
                                if (isVpnMode()) {
                                    if (jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-12626556056506L)).getBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-12648030892986L))) {
                                        disableUdpGwKeepalive();
                                    } else {
                                        enableUdpGwKeepalive();
                                    }
                                }
                            } else if (string.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-12673800696762L))) {
                                this.mHostService.onApplicationParameters(jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-12768289977274L)).get(Deobfuscator$MHRTUNNELVPN$app.getString(-12789764813754L)));
                            } else if (string.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-12837009454010L))) {
                                JSONArray jSONArray4 = jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-12888549061562L)).getJSONArray(Deobfuscator$MHRTUNNELVPN$app.getString(-12910023898042L));
                                ArrayList arrayList4 = new ArrayList();
                                while (i2 < jSONArray4.length()) {
                                    arrayList4.add(jSONArray4.getString(i2));
                                    i2++;
                                }
                                this.mHostService.onServerAlert(jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-12957268538298L)).getString(Deobfuscator$MHRTUNNELVPN$app.getString(-12978743374778L)), jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-13008808145850L)).getString(Deobfuscator$MHRTUNNELVPN$app.getString(-13030282982330L)), arrayList4);
                            }
                        }
                    }
                }
            }
            this.mHostService.onDiagnosticMessage(string + Deobfuscator$MHRTUNNELVPN$app.getString(-13064642720698L) + jSONObject.getJSONObject(Deobfuscator$MHRTUNNELVPN$app.getString(-13077527622586L)).toString());
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long hasIPv6Route(Context context, HostLogger hostLogger) {
        boolean zHasIPv6Route;
        try {
            zHasIPv6Route = hasIPv6Route(context);
        } catch (Exception e) {
            hostLogger.onDiagnosticMessage(Deobfuscator$MHRTUNNELVPN$app.getString(-3280707220410L) + e.getMessage());
            zHasIPv6Route = false;
        }
        return zHasIPv6Route ? 1L : 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long hasNetworkConnectivity() {
        boolean zHasNetworkConnectivity = hasNetworkConnectivity(this.mHostService.getContext());
        boolean andSet = this.mIsWaitingForNetworkConnectivity.getAndSet(!zHasNetworkConnectivity);
        if (!zHasNetworkConnectivity && !andSet) {
            this.mHostService.onStartedWaitingForNetworkConnectivity();
        } else if (zHasNetworkConnectivity && andSet) {
            this.mHostService.onStoppedWaitingForNetworkConnectivity();
        }
        return zHasNetworkConnectivity ? 1L : 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String iPv6Synthesize(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isVpnMode() {
        return this.mVpnMode.get();
    }

    private String loadPsiphonConfig(Context context) {
        HostService hostService = this.mHostService;
        return buildPsiphonConfig(context, hostService, hostService.getPsiphonConfig(), this.mClientPlatformPrefix.get(), this.mClientPlatformSuffix.get(), isVpnMode(), Integer.valueOf(this.mLocalSocksProxyPort.get()));
    }

    public static void logTun2Socks(String str, String str2, String str3) {
        mPsiphonTunnel.mHostService.onDiagnosticMessage(Deobfuscator$MHRTUNNELVPN$app.getString(-14572176241594L) + str + Deobfuscator$MHRTUNNELVPN$app.getString(-14623715849146L) + str2 + Deobfuscator$MHRTUNNELVPN$app.getString(-14632305783738L) + str3);
    }

    public static synchronized PsiphonTunnel newPsiphonTunnel(HostService hostService) {
        return newPsiphonTunnelImpl(hostService, true);
    }

    private static PsiphonTunnel newPsiphonTunnelImpl(HostService hostService, boolean z) {
        PsiphonTunnel psiphonTunnel = mPsiphonTunnel;
        if (psiphonTunnel != null) {
            psiphonTunnel.stop();
        }
        hostService.loadLibrary(Deobfuscator$MHRTUNNELVPN$app.getString(-1253482656698L));
        PsiphonTunnel psiphonTunnel2 = new PsiphonTunnel(hostService, z);
        mPsiphonTunnel = psiphonTunnel2;
        return psiphonTunnel2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notice(String str) throws JSONException {
        handlePsiphonNotice(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native int runTun2Socks(int i, int i2, String str, String str2, String str3, String str4, int i3);

    private static PrivateAddress selectPrivateAddress() throws Exception, SocketException {
        long j;
        HashMap map = new HashMap();
        map.put(Deobfuscator$MHRTUNNELVPN$app.getString(-14705320227770L), new PrivateAddress(Deobfuscator$MHRTUNNELVPN$app.getString(-14718205129658L), Deobfuscator$MHRTUNNELVPN$app.getString(-14756859835322L), 8, Deobfuscator$MHRTUNNELVPN$app.getString(-14795514540986L)));
        map.put(Deobfuscator$MHRTUNNELVPN$app.getString(-14834169246650L), new PrivateAddress(Deobfuscator$MHRTUNNELVPN$app.getString(-14851349115834L), Deobfuscator$MHRTUNNELVPN$app.getString(-14898593756090L), 12, Deobfuscator$MHRTUNNELVPN$app.getString(-14945838396346L)));
        map.put(Deobfuscator$MHRTUNNELVPN$app.getString(-14993083036602L), new PrivateAddress(Deobfuscator$MHRTUNNELVPN$app.getString(-15010262905786L), Deobfuscator$MHRTUNNELVPN$app.getString(-15061802513338L), 16, Deobfuscator$MHRTUNNELVPN$app.getString(-15113342120890L)));
        map.put(Deobfuscator$MHRTUNNELVPN$app.getString(-15164881728442L), new PrivateAddress(Deobfuscator$MHRTUNNELVPN$app.getString(-15182061597626L), Deobfuscator$MHRTUNNELVPN$app.getString(-15233601205178L), 24, Deobfuscator$MHRTUNNELVPN$app.getString(-15285140812730L)));
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                throw new Exception(Deobfuscator$MHRTUNNELVPN$app.getString(-15456939504570L));
            }
            Iterator it = Collections.list(networkInterfaces).iterator();
            while (it.hasNext()) {
                Iterator it2 = Collections.list(((NetworkInterface) it.next()).getInetAddresses()).iterator();
                while (it2.hasNext()) {
                    InetAddress inetAddress = (InetAddress) it2.next();
                    if (inetAddress instanceof Inet4Address) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (hostAddress.startsWith(Deobfuscator$MHRTUNNELVPN$app.getString(-15577198588858L))) {
                            j = -15594378458042L;
                        } else if (hostAddress.length() >= 6 && hostAddress.substring(0, 6).compareTo(Deobfuscator$MHRTUNNELVPN$app.getString(-15607263359930L)) >= 0 && hostAddress.substring(0, 6).compareTo(Deobfuscator$MHRTUNNELVPN$app.getString(-15637328131002L)) <= 0) {
                            j = -15667392902074L;
                        } else if (hostAddress.startsWith(Deobfuscator$MHRTUNNELVPN$app.getString(-15684572771258L))) {
                            j = -15718932509626L;
                        }
                        map.remove(Deobfuscator$MHRTUNNELVPN$app.getString(j));
                    }
                }
            }
            if (map.size() > 0) {
                return (PrivateAddress) map.values().iterator().next();
            }
            throw new Exception(Deobfuscator$MHRTUNNELVPN$app.getString(-15736112378810L));
        } catch (SocketException e) {
            throw new Exception(Deobfuscator$MHRTUNNELVPN$app.getString(-15336680420282L), e);
        }
    }

    private void setLocalSocksProxyPort(int i) {
        this.mLocalSocksProxyPort.set(i);
    }

    private static String setupTrustedCertificates(Context context, HostLogger hostLogger) throws Throwable {
        PrintStream printStream;
        Throwable th;
        File dir = context.getDir(Deobfuscator$MHRTUNNELVPN$app.getString(-13099002459066L), 0);
        Deobfuscator$MHRTUNNELVPN$app.getString(-13163426968506L);
        try {
            File file = new File(dir, Deobfuscator$MHRTUNNELVPN$app.getString(-13279391085498L));
            file.delete();
            try {
                printStream = new PrintStream(new FileOutputStream(file));
                try {
                    KeyStore keyStore = KeyStore.getInstance(Deobfuscator$MHRTUNNELVPN$app.getString(-13322340758458L));
                    keyStore.load(null, null);
                    Enumeration<String> enumerationAliases = keyStore.aliases();
                    while (enumerationAliases.hasMoreElements()) {
                        X509Certificate x509Certificate = (X509Certificate) keyStore.getCertificate(enumerationAliases.nextElement());
                        printStream.println(Deobfuscator$MHRTUNNELVPN$app.getString(-13554268992442L));
                        String str = new String(Base64.encode(x509Certificate.getEncoded(), 2), Deobfuscator$MHRTUNNELVPN$app.getString(-13674528076730L));
                        int i = 0;
                        while (i < str.length()) {
                            int i2 = i + 64;
                            printStream.println(str.substring(i, Math.min(i2, str.length())));
                            i = i2;
                        }
                        printStream.println(Deobfuscator$MHRTUNNELVPN$app.getString(-13700297880506L));
                    }
                    hostLogger.onDiagnosticMessage(Deobfuscator$MHRTUNNELVPN$app.getString(-13811967030202L));
                    String absolutePath = file.getAbsolutePath();
                    printStream.close();
                    return absolutePath;
                } catch (Throwable th2) {
                    th = th2;
                    if (printStream == null) {
                        throw th;
                    }
                    printStream.close();
                    throw th;
                }
            } catch (Throwable th3) {
                printStream = null;
                th = th3;
            }
        } catch (IOException e) {
            throw new Exception(Deobfuscator$MHRTUNNELVPN$app.getString(-14262938596282L), e);
        } catch (KeyStoreException e2) {
            throw new Exception(Deobfuscator$MHRTUNNELVPN$app.getString(-13915046245306L), e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new Exception(Deobfuscator$MHRTUNNELVPN$app.getString(-14031010362298L), e3);
        } catch (CertificateException e4) {
            throw new Exception(Deobfuscator$MHRTUNNELVPN$app.getString(-14146974479290L), e4);
        }
    }

    private ParcelFileDescriptor startDummyVpn(VpnService.Builder builder) throws Exception, SocketException {
        PrivateAddress privateAddressSelectPrivateAddress = selectPrivateAddress();
        Locale locale = Locale.getDefault();
        Deobfuscator$MHRTUNNELVPN$app.getString(-2572037616570L);
        try {
            try {
                try {
                    Locale.setDefault(new Locale(Deobfuscator$MHRTUNNELVPN$app.getString(-2662231929786L)));
                    return builder.setSession(this.mHostService.getAppName()).setMtu(1500).addAddress(privateAddressSelectPrivateAddress.mIpAddress, privateAddressSelectPrivateAddress.mPrefixLength).addRoute(Deobfuscator$MHRTUNNELVPN$app.getString(-2675116831674L), 0).addRoute(privateAddressSelectPrivateAddress.mSubnet, privateAddressSelectPrivateAddress.mPrefixLength).addDnsServer(privateAddressSelectPrivateAddress.mRouter).establish();
                } catch (IllegalArgumentException e) {
                    throw new Exception(Deobfuscator$MHRTUNNELVPN$app.getString(-2709476570042L), e);
                } catch (IllegalStateException e2) {
                    throw new Exception(Deobfuscator$MHRTUNNELVPN$app.getString(-2799670883258L), e2);
                }
            } catch (SecurityException e3) {
                throw new Exception(Deobfuscator$MHRTUNNELVPN$app.getString(-2889865196474L), e3);
            }
        } finally {
            Locale.setDefault(locale);
        }
    }

    private void startPsiphon(String str) throws Exception {
        stopPsiphon();
        this.mIsWaitingForNetworkConnectivity.set(false);
        this.mHostService.onDiagnosticMessage(Deobfuscator$MHRTUNNELVPN$app.getString(-3705908982714L));
        try {
            this.mNetworkMonitor.start(this.mHostService.getContext());
            Psi.start(loadPsiphonConfig(this.mHostService.getContext()), str, Deobfuscator$MHRTUNNELVPN$app.getString(-3813283165114L), new PsiphonProviderShim(this), isVpnMode(), false, true);
            this.mHostService.onDiagnosticMessage(Deobfuscator$MHRTUNNELVPN$app.getString(-3955017085882L));
        } catch (java.lang.Exception e) {
            throw new Exception(Deobfuscator$MHRTUNNELVPN$app.getString(-3817578132410L), e);
        }
    }

    private void startTun2Socks(final ParcelFileDescriptor parcelFileDescriptor, final int i, final String str, final String str2, final String str3, final String str4, final boolean z) {
        if (this.mTun2SocksThread != null) {
            return;
        }
        Thread thread = new Thread(new Runnable() { // from class: ca.psiphon.PsiphonTunnel.2
            @Override // java.lang.Runnable
            public void run() {
                PsiphonTunnel.runTun2Socks(parcelFileDescriptor.detachFd(), i, str, str2, str3, str4, z ? 1 : 0);
            }
        });
        this.mTun2SocksThread = thread;
        thread.start();
        this.mHostService.onDiagnosticMessage(Deobfuscator$MHRTUNNELVPN$app.getString(-14417557418938L));
    }

    private boolean startVpn() {
        this.mVpnMode.set(true);
        this.mPrivateAddress = selectPrivateAddress();
        Locale locale = Locale.getDefault();
        Deobfuscator$MHRTUNNELVPN$app.getString(-2181195592634L);
        try {
            try {
                try {
                    try {
                        Locale.setDefault(new Locale(Deobfuscator$MHRTUNNELVPN$app.getString(-2249915069370L)));
                        String str = this.mPrivateAddress.mRouter;
                        VpnService.Builder builder = (VpnService.Builder) this.mHostService.newVpnServiceBuilder();
                        applyPerAppRules(builder);
                        VpnService.Builder mtu = builder.setSession(this.mHostService.getAppName()).setMtu(1500);
                        PrivateAddress privateAddress = this.mPrivateAddress;
                        VpnService.Builder builderAddRoute = mtu.addAddress(privateAddress.mIpAddress, privateAddress.mPrefixLength).addRoute(Deobfuscator$MHRTUNNELVPN$app.getString(-2262799971258L), 0);
                        PrivateAddress privateAddress2 = this.mPrivateAddress;
                        ParcelFileDescriptor parcelFileDescriptorEstablish = builderAddRoute.addRoute(privateAddress2.mSubnet, privateAddress2.mPrefixLength).addDnsServer(str).establish();
                        if (parcelFileDescriptorEstablish == null) {
                            return false;
                        }
                        this.mTunFd.set(parcelFileDescriptorEstablish);
                        this.mRoutingThroughTunnel.set(false);
                        this.mHostService.onDiagnosticMessage(Deobfuscator$MHRTUNNELVPN$app.getString(-2297159709626L));
                        return true;
                    } catch (IllegalStateException e) {
                        throw new Exception(Deobfuscator$MHRTUNNELVPN$app.getString(-2434598663098L), e);
                    }
                } catch (IllegalArgumentException e2) {
                    throw new Exception(Deobfuscator$MHRTUNNELVPN$app.getString(-2365879186362L), e2);
                }
            } catch (SecurityException e3) {
                throw new Exception(Deobfuscator$MHRTUNNELVPN$app.getString(-2503318139834L), e3);
            }
        } finally {
            Locale.setDefault(locale);
        }
    }

    private void stopPsiphon() {
        this.mHostService.onDiagnosticMessage(Deobfuscator$MHRTUNNELVPN$app.getString(-4058096300986L));
        this.mNetworkMonitor.stop(this.mHostService.getContext());
        Psi.stop();
        this.mHostService.onDiagnosticMessage(Deobfuscator$MHRTUNNELVPN$app.getString(-4165470483386L));
    }

    private void stopTun2Socks() throws InterruptedException {
        if (this.mTun2SocksThread != null) {
            try {
                terminateTun2Socks();
                this.mTun2SocksThread.join();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            this.mTun2SocksThread = null;
            this.mHostService.onDiagnosticMessage(Deobfuscator$MHRTUNNELVPN$app.getString(-14494866830266L));
        }
    }

    private void stopVpn() throws InterruptedException, IOException {
        stopTun2Socks();
        ParcelFileDescriptor andSet = this.mTunFd.getAndSet(null);
        if (andSet != null) {
            try {
                andSet.close();
            } catch (IOException unused) {
            }
        }
        this.mRoutingThroughTunnel.set(false);
    }

    private static native int terminateTun2Socks();

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public String exportExchangePayload() {
        return Psi.exportExchangePayload();
    }

    public boolean importExchangePayload(String str) {
        return Psi.importExchangePayload(str);
    }

    public synchronized void reconnectPsiphon() {
        Psi.reconnectTunnel();
    }

    public synchronized void restartPsiphon() {
        stopPsiphon();
        startPsiphon(Deobfuscator$MHRTUNNELVPN$app.getString(-1871957947322L));
    }

    public void routeThroughTunnel() {
        ParcelFileDescriptor parcelFileDescriptor;
        if (this.mRoutingThroughTunnel.compareAndSet(false, true) && (parcelFileDescriptor = this.mTunFd.get()) != null) {
            try {
                startTun2Socks(parcelFileDescriptor.dup(), 1500, this.mPrivateAddress.mRouter, Deobfuscator$MHRTUNNELVPN$app.getString(-1579900171194L), Deobfuscator$MHRTUNNELVPN$app.getString(-1485410890682L) + Integer.toString(this.mLocalSocksProxyPort.get()), Deobfuscator$MHRTUNNELVPN$app.getString(-1532655530938L) + Integer.toString(UDPGW_SERVER_PORT), true);
                this.mHostService.onDiagnosticMessage(Deobfuscator$MHRTUNNELVPN$app.getString(-1640029713338L));
            } catch (IOException e) {
                this.mHostService.onDiagnosticMessage(Deobfuscator$MHRTUNNELVPN$app.getString(-1738813961146L) + e);
            }
        }
    }

    public void setClientPlatformAffixes(String str, String str2) {
        this.mClientPlatformPrefix.set(str);
        this.mClientPlatformSuffix.set(str2);
    }

    public synchronized boolean startRouting() {
        this.mHostService.loadLibrary(Deobfuscator$MHRTUNNELVPN$app.getString(-1455346119610L));
        return startVpn();
    }

    public synchronized void startTunneling(String str) {
        startPsiphon(str);
    }

    public synchronized void stop() {
        stopVpn();
        stopPsiphon();
        this.mVpnMode.set(false);
        this.mLocalSocksProxyPort.set(0);
    }

    public void stopRouteThroughTunnel() throws InterruptedException {
        if (this.mRoutingThroughTunnel.compareAndSet(true, false)) {
            stopTun2Socks();
        }
    }

    public void writeRuntimeProfiles(String str, int i, int i2) {
        Psi.writeRuntimeProfiles(str, i, i2);
    }

    private static boolean hasIPv6Route(Context context) throws Exception {
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                NetworkInterface networkInterface = (NetworkInterface) it.next();
                if (networkInterface.isUp() && !networkInterface.isLoopback() && !networkInterface.isPointToPoint()) {
                    Iterator it2 = Collections.list(networkInterface.getInetAddresses()).iterator();
                    while (it2.hasNext()) {
                        InetAddress inetAddress = (InetAddress) it2.next();
                        if ((inetAddress instanceof Inet6Address) && !inetAddress.isLinkLocalAddress() && !inetAddress.isSiteLocalAddress() && !inetAddress.isMulticastAddress()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (SocketException e) {
            throw new Exception(Deobfuscator$MHRTUNNELVPN$app.getString(-16882868646842L), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hasNetworkConnectivity(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Deobfuscator$MHRTUNNELVPN$app.getString(-14649485652922L));
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    public static synchronized PsiphonTunnel newPsiphonTunnel(HostService hostService, boolean z) {
        return newPsiphonTunnelImpl(hostService, z);
    }
}
