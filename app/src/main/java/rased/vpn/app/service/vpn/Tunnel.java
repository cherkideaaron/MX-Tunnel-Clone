package rased.vpn.app.service.vpn;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.VpnService;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.ConnectionResult;
import defpackage.C2544d8;
import defpackage.C3133nw;
import defpackage.C3188ow;
import defpackage.C3492ub;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import org.uproxy.tun2socks.Tun2SocksJni;
import rased.vpn.app.service.PsiphonDNSService;
import rased.vpn.app.service.SocksDNSService;
import rased.vpn.app.service.XRayDNSService;
import rased.vpn.app.service.vpn.Tun2Socks;
import rased.vpn.app.service.vpn.VpnUtils;
import rased.vpn.app.service.vpn.logger.SkStatus;

/* loaded from: classes2.dex */
public class Tunnel {
    private static final String DNS_RESOLVER_IP = "8.8.8.8";
    private static final int DNS_RESOLVER_PORT = 53;
    private static final String VPN_INTERFACE_NETMASK = "255.255.255.0";
    private static Tunnel mTunnel;
    private final HostService mHostService;
    private Pdnsd mPdnsd;
    private VpnUtils.PrivateAddress mPrivateAddress;
    private C3188ow mRoutes;
    private Tun2Socks mTun2Socks;
    private Thread mTun2SocksThread;
    private int mMtu = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
    private AtomicReference<ParcelFileDescriptor> mTunFd = new AtomicReference<>();
    private AtomicBoolean mRoutingThroughTunnel = new AtomicBoolean(false);

    public interface HostService {
        String getAppName();

        Context getContext();

        Object getVpnService();

        Object newVpnServiceBuilder();

        void onDiagnosticMessage(String str);

        void onTunnelConnected();

        void onVpnEstablished();
    }

    private Tunnel(HostService hostService) {
        this.mHostService = hostService;
        C3188ow c3188ow = new C3188ow();
        c3188ow.a = new TreeSet();
        this.mRoutes = c3188ow;
    }

    public static synchronized Tunnel newTunnel(HostService hostService) {
        Tunnel tunnel;
        try {
            Tunnel tunnel2 = mTunnel;
            if (tunnel2 != null) {
                tunnel2.stop();
            }
            tunnel = new Tunnel(hostService);
            mTunnel = tunnel;
        } catch (Throwable th) {
            throw th;
        }
        return tunnel;
    }

    private boolean routeThroughTunnel(String str, String[] strArr, boolean z, String str2, boolean z2) {
        ParcelFileDescriptor parcelFileDescriptor;
        String str3;
        if (!this.mRoutingThroughTunnel.compareAndSet(false, true) || (parcelFileDescriptor = this.mTunFd.get()) == null) {
            return false;
        }
        if (z) {
            int iFindAvailablePort = VpnUtils.findAvailablePort(8091, 10);
            Locale locale = Locale.ENGLISH;
            str3 = this.mPrivateAddress.mIpAddress + ":" + iFindAvailablePort;
            Pdnsd pdnsd = new Pdnsd(this.mHostService.getContext(), strArr, DNS_RESOLVER_PORT, this.mPrivateAddress.mIpAddress, iFindAvailablePort);
            this.mPdnsd = pdnsd;
            pdnsd.start();
        } else {
            str3 = null;
        }
        Tun2Socks tun2Socks = new Tun2Socks(this.mHostService.getContext(), parcelFileDescriptor, this.mMtu, this.mPrivateAddress.mRouter, VPN_INTERFACE_NETMASK, str, str2, str3, z2);
        this.mTun2Socks = tun2Socks;
        tun2Socks.setOnTun2SocksListener(new Tun2Socks.OnTun2SocksListener() { // from class: rased.vpn.app.service.vpn.Tunnel.1
            @Override // rased.vpn.app.service.vpn.Tun2Socks.OnTun2SocksListener
            public void onStart() {
                Tunnel.this.mHostService.onDiagnosticMessage("tun2socks started");
            }

            @Override // rased.vpn.app.service.vpn.Tun2Socks.OnTun2SocksListener
            public void onStop() {
                Tunnel.this.mHostService.onDiagnosticMessage("tun2socks stopped");
                Tunnel.this.stop();
            }
        });
        this.mTun2Socks.start();
        this.mHostService.onTunnelConnected();
        return true;
    }

    private void startTun2Socks(final ParcelFileDescriptor parcelFileDescriptor, final int i, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final boolean z, final boolean z2) {
        if (this.mTun2SocksThread != null) {
            return;
        }
        Thread thread = new Thread(new Runnable() { // from class: rased.vpn.app.service.vpn.Tunnel.2
            @Override // java.lang.Runnable
            public void run() {
                Tun2SocksJni.runTun2Socks(parcelFileDescriptor.getFd(), i, str, str2, str3, str4, str5, str6, z ? 1 : 0, z2 ? 1 : 0);
            }
        });
        this.mTun2SocksThread = thread;
        thread.start();
        this.mHostService.onDiagnosticMessage("tun2socks started");
    }

    private boolean startVpn(boolean z, String[] strArr, String[] strArr2, boolean z2, boolean z3, String[] strArr3, boolean z4, boolean z5) {
        int i;
        boolean z6;
        boolean z7;
        boolean z8 = z;
        StringBuilder sb = new StringBuilder("Routes: ");
        this.mPrivateAddress = VpnUtils.selectPrivateAddress();
        int length = strArr2.length;
        int i2 = 0;
        while (true) {
            i = 32;
            if (i2 >= length) {
                break;
            }
            this.mRoutes.a(new C2544d8(strArr2[i2], 32), false);
            i2++;
        }
        Locale locale = Locale.getDefault();
        try {
            try {
                try {
                    try {
                        Locale.setDefault(new Locale("en"));
                        VpnService.Builder builder = (VpnService.Builder) this.mHostService.newVpnServiceBuilder();
                        VpnUtils.PrivateAddress privateAddress = this.mPrivateAddress;
                        VpnService.Builder builderAddAddress = builder.addAddress(privateAddress.mIpAddress, privateAddress.mPrefixLength);
                        this.mRoutes.a(new C2544d8("0.0.0.0", 0), true);
                        this.mRoutes.a(new C2544d8("10.0.0.0", 8), false);
                        C3188ow c3188ow = this.mRoutes;
                        VpnUtils.PrivateAddress privateAddress2 = this.mPrivateAddress;
                        c3188ow.a(new C2544d8(privateAddress2.mSubnet, privateAddress2.mPrefixLength), false);
                        if (z4) {
                            this.mRoutes.a(new C2544d8("192.168.42.0", 23), false);
                            this.mRoutes.a(new C2544d8("192.168.44.0", 24), false);
                            this.mRoutes.a(new C2544d8("192.168.49.0", 24), false);
                        }
                        this.mRoutes.a(new C2544d8("169.254.1.0", 24), false);
                        C3492ub c3492ub = new C3492ub(this.mHostService.getContext());
                        this.mRoutes.a(new C2544d8(c3492ub.h(), 32), false);
                        if (z8) {
                            int length2 = strArr.length;
                            int i3 = 0;
                            while (i3 < length2) {
                                String str = strArr[i3];
                                try {
                                    builderAddAddress.addDnsServer(str);
                                    this.mRoutes.a(new C2544d8(str, i), z8);
                                } catch (IllegalArgumentException e) {
                                    this.mHostService.onDiagnosticMessage("Error adding dns " + str + ", " + e.getLocalizedMessage());
                                }
                                i3++;
                                i = 32;
                                z8 = z;
                            }
                        }
                        String str2 = Build.VERSION.RELEASE;
                        builderAddAddress.setMtu(this.mMtu);
                        Iterator it = this.mRoutes.c(true).iterator();
                        while (it.hasNext()) {
                            C3133nw c3133nw = (C3133nw) it.next();
                            sb.append(String.format("%s/%d", c3133nw.b(), Integer.valueOf(c3133nw.b)));
                            sb.append(", ");
                        }
                        sb.deleteCharAt(sb.lastIndexOf(", "));
                        Iterator it2 = this.mRoutes.c(false).iterator();
                        while (it2.hasNext()) {
                        }
                        this.mHostService.onDiagnosticMessage(sb.toString());
                        C3133nw c3133nw2 = new C3133nw(new C2544d8("224.0.0.0", 3), true);
                        Iterator it3 = this.mRoutes.d().iterator();
                        while (it3.hasNext()) {
                            C3133nw c3133nw3 = (C3133nw) it3.next();
                            try {
                                BigInteger bigIntegerA = c3133nw2.a();
                                BigInteger bigIntegerC = c3133nw2.c();
                                BigInteger bigIntegerA2 = c3133nw3.a();
                                BigInteger bigIntegerC2 = c3133nw3.c();
                                z6 = bigIntegerA.compareTo(bigIntegerA2) != 1;
                                z7 = bigIntegerC.compareTo(bigIntegerC2) != -1;
                            } catch (IllegalArgumentException unused) {
                            }
                            if (z6 && z7) {
                                SkStatus.logDebug("VPN: Ignoring multicast route: " + c3133nw3.toString());
                            } else {
                                builderAddAddress.addRoute(c3133nw3.b(), c3133nw3.b);
                            }
                        }
                        if (c3492ub.a.getBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-169139459290042L), false)) {
                            if (c3492ub.b()) {
                                for (String str3 : c3492ub.a()) {
                                    try {
                                        builderAddAddress.addDisallowedApplication(str3);
                                        SkStatus.logInfo("Disallowed Application: " + str3);
                                    } catch (PackageManager.NameNotFoundException unused2) {
                                    }
                                }
                            } else {
                                for (String str4 : c3492ub.a()) {
                                    try {
                                        builderAddAddress.addAllowedApplication(str4);
                                        SkStatus.logInfo("Allowed Application: " + str4);
                                    } catch (PackageManager.NameNotFoundException unused3) {
                                    }
                                }
                            }
                        }
                        ParcelFileDescriptor parcelFileDescriptorEstablish = (c3492ub.q().booleanValue() ? builderAddAddress.setSession(this.mHostService.getAppName()).setConfigureIntent(XRayDNSService.b(this.mHostService.getContext())) : c3492ub.o().booleanValue() ? builderAddAddress.setSession(this.mHostService.getAppName()).setConfigureIntent(PsiphonDNSService.b(this.mHostService.getContext())) : builderAddAddress.setSession(this.mHostService.getAppName()).setConfigureIntent(SocksDNSService.b(this.mHostService.getContext()))).establish();
                        if (parcelFileDescriptorEstablish == null) {
                            Locale.setDefault(locale);
                            return false;
                        }
                        this.mTunFd.set(parcelFileDescriptorEstablish);
                        this.mRoutingThroughTunnel.set(false);
                        this.mHostService.onVpnEstablished();
                        this.mRoutes.b();
                        Locale.setDefault(locale);
                        return true;
                    } catch (SecurityException e2) {
                        throw new Exception("startVpn failed", e2);
                    }
                } catch (IllegalStateException e3) {
                    throw new Exception("startVpn failed", e3);
                }
            } catch (IllegalArgumentException e4) {
                throw new Exception("startVpn failed", e4);
            }
        } catch (Throwable th) {
            Locale.setDefault(locale);
            throw th;
        }
    }

    private void stopRoutingThroughTunnel() {
        Tun2Socks tun2Socks = this.mTun2Socks;
        if (tun2Socks != null && tun2Socks.isAlive()) {
            this.mTun2Socks.interrupt();
        }
        this.mTun2Socks = null;
        Pdnsd pdnsd = this.mPdnsd;
        if (pdnsd != null && pdnsd.isAlive()) {
            this.mPdnsd.interrupt();
        }
        this.mPdnsd = null;
    }

    private void stopTun2Socks() throws InterruptedException {
        if (this.mTun2SocksThread != null) {
            try {
                Tun2SocksJni.terminateTun2Socks();
                this.mTun2SocksThread.join();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            this.mTun2SocksThread = null;
            this.mRoutingThroughTunnel.set(false);
            this.mHostService.onDiagnosticMessage("tun2socks stopped");
        }
    }

    private void stopVpn() throws IOException {
        stopRoutingThroughTunnel();
        ParcelFileDescriptor andSet = this.mTunFd.getAndSet(null);
        if (andSet != null) {
            try {
                this.mHostService.onDiagnosticMessage("<strong>Disconnected</strong>");
                andSet.close();
            } catch (IOException unused) {
            }
        }
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public synchronized boolean startRouting(TunnelVpnSettings tunnelVpnSettings) {
        return startVpn(tunnelVpnSettings.mDnsForward, tunnelVpnSettings.mDnsResolver, tunnelVpnSettings.mExcludeIps, tunnelVpnSettings.mEnableFilterApps, tunnelVpnSettings.mFilterBypassMode, tunnelVpnSettings.mFilterApps, tunnelVpnSettings.mTetheringSubnet, tunnelVpnSettings.bypass);
    }

    public synchronized boolean startTunneling(String str, String[] strArr, boolean z, String str2, boolean z2) {
        return routeThroughTunnel(str, strArr, z, str2, z2);
    }

    public synchronized void stop() {
        stopVpn();
    }

    public synchronized void stopTunneling() {
        stopRoutingThroughTunnel();
    }
}
