package defpackage;

import android.app.PendingIntent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.security.KeyChain;
import android.security.KeyChainException;
import android.util.Base64;
import android.util.Log;
import com.mxtunnel.pro.R;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import net.openvpn.ovpn3.ClientAPI_Event;
import net.openvpn.ovpn3.ClientAPI_ExternalPKICertRequest;
import net.openvpn.ovpn3.ClientAPI_ExternalPKISignRequest;
import net.openvpn.ovpn3.ClientAPI_LLVector;
import net.openvpn.ovpn3.ClientAPI_LogInfo;
import net.openvpn.ovpn3.ClientAPI_OpenVPNClient;
import net.openvpn.ovpn3.ClientAPI_Status;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.service.OpenVPNService;
import rased.vpn.app.service.vpn.logger.SkStatus;

/* renamed from: hy, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2807hy extends ClientAPI_OpenVPNClient implements Runnable {
    public InterfaceC2752gy a;
    public C3731yy b;
    public Thread c;
    public ClientAPI_Status d;
    public boolean e;

    public final void a(ClientAPI_Status clientAPI_Status) {
        InterfaceC2752gy interfaceC2752gy;
        synchronized (this) {
            interfaceC2752gy = this.a;
            if (interfaceC2752gy != null) {
                this.d = clientAPI_Status;
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
        if (interfaceC2752gy != null) {
            ClientAPI_Status clientAPI_Status2 = this.d;
            OpenVPNService openVPNService = (OpenVPNService) interfaceC2752gy;
            boolean error = clientAPI_Status2.getError();
            String message = clientAPI_Status2.getMessage();
            Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-100986918237114L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-101051342746554L), Boolean.valueOf(error), message));
            if (openVPNService.a) {
                int iStats_n = ClientAPI_OpenVPNClient.stats_n();
                String[] strArr = new String[iStats_n];
                for (int i = 0; i < iStats_n; i++) {
                    strArr[i] = ClientAPI_OpenVPNClient.stats_name(i);
                }
                RunnableC2807hy runnableC2807hy = openVPNService.s;
                ClientAPI_LLVector clientAPI_LLVectorStats_bundle = runnableC2807hy != null ? runnableC2807hy.stats_bundle() : null;
                if (clientAPI_LLVectorStats_bundle != null) {
                    for (int i2 = 0; i2 < iStats_n; i2++) {
                        String str = strArr[i2];
                        Long l = clientAPI_LLVectorStats_bundle.get(i2);
                        if (l.longValue() > 0) {
                            Log.i(Deobfuscator$MHRTUNNELVPN$app.getString(-101781487186874L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-101845911696314L), str, l));
                        }
                    }
                }
            }
            if (error) {
                if (message == null || !message.equals(Deobfuscator$MHRTUNNELVPN$app.getString(-101227436405690L))) {
                    String status = clientAPI_Status2.getStatus();
                    if (status.length() == 0) {
                        status = Deobfuscator$MHRTUNNELVPN$app.getString(-101321925686202L);
                    }
                    openVPNService.e(1, status, message);
                } else {
                    openVPNService.e(1, Deobfuscator$MHRTUNNELVPN$app.getString(-101399235097530L), null);
                }
            }
            openVPNService.e(0, Deobfuscator$MHRTUNNELVPN$app.getString(-101493724378042L), null);
            openVPNService.a = false;
        }
    }

    @Override // net.openvpn.ovpn3.ClientAPI_OpenVPNClient
    public final void event(ClientAPI_Event clientAPI_Event) {
        InterfaceC2752gy interfaceC2752gy = this.a;
        if (interfaceC2752gy != null) {
            OpenVPNService openVPNService = (OpenVPNService) interfaceC2752gy;
            C3300qy c3300qy = new C3300qy();
            if (clientAPI_Event.getError()) {
                c3300qy.b |= 1;
            }
            c3300qy.e = clientAPI_Event.getName();
            c3300qy.d = clientAPI_Event.getInfo();
            C3190oy c3190oy = (C3190oy) openVPNService.e.get(c3300qy.e);
            if (c3190oy != null) {
                c3300qy.h = c3190oy.d;
                c3300qy.f = c3190oy.c;
                c3300qy.i = c3190oy.e;
                c3300qy.c = c3190oy.b;
                c3300qy.b = c3190oy.a | c3300qy.b;
            } else {
                c3300qy.i = R.string.unknown;
                if (openVPNService.a) {
                    openVPNService.s.reconnect(1);
                }
            }
            Handler handler = openVPNService.q;
            handler.sendMessage(handler.obtainMessage(1, c3300qy));
        }
    }

    @Override // net.openvpn.ovpn3.ClientAPI_OpenVPNClient
    public final void external_pki_cert_request(ClientAPI_ExternalPKICertRequest clientAPI_ExternalPKICertRequest) throws InterruptedException, KeyChainException {
        InterfaceC2752gy interfaceC2752gy = this.a;
        if (interfaceC2752gy != null) {
            OpenVPNService openVPNService = (OpenVPNService) interfaceC2752gy;
            try {
                X509Certificate[] certificateChain = KeyChain.getCertificateChain(openVPNService, clientAPI_ExternalPKICertRequest.getAlias());
                if (certificateChain == null) {
                    clientAPI_ExternalPKICertRequest.setError(true);
                    clientAPI_ExternalPKICertRequest.setInvalidAlias(true);
                    return;
                }
                if (certificateChain.length < 1) {
                    clientAPI_ExternalPKICertRequest.setError(true);
                    clientAPI_ExternalPKICertRequest.setInvalidAlias(true);
                    clientAPI_ExternalPKICertRequest.setErrorText(openVPNService.getResources().getString(R.string.epki_missing_cert));
                    return;
                }
                X509Certificate x509Certificate = certificateChain[0];
                int i = OpenVPNService.E;
                clientAPI_ExternalPKICertRequest.setCert(String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-99483679683514L), Base64.encodeToString(x509Certificate.getEncoded(), 0)));
                if (certificateChain.length >= 2) {
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 1; i2 < certificateChain.length; i2++) {
                        sb.append(String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-99483679683514L), Base64.encodeToString(certificateChain[i2].getEncoded(), 0)));
                    }
                    clientAPI_ExternalPKICertRequest.setSupportingChain(sb.toString());
                }
            } catch (Exception e) {
                Log.e(Deobfuscator$MHRTUNNELVPN$app.getString(-99737082753978L), Deobfuscator$MHRTUNNELVPN$app.getString(-99801507263418L), e);
                clientAPI_ExternalPKICertRequest.setError(true);
                clientAPI_ExternalPKICertRequest.setInvalidAlias(true);
                clientAPI_ExternalPKICertRequest.setErrorText(e.toString());
            }
        }
    }

    @Override // net.openvpn.ovpn3.ClientAPI_OpenVPNClient
    public final void external_pki_sign_request(ClientAPI_ExternalPKISignRequest clientAPI_ExternalPKISignRequest) throws BadPaddingException, InterruptedException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, KeyChainException, InvalidKeyException {
        byte[] bArrDoFinal;
        InterfaceC2752gy interfaceC2752gy = this.a;
        if (interfaceC2752gy != null) {
            OpenVPNService openVPNService = (OpenVPNService) interfaceC2752gy;
            try {
                Deobfuscator$MHRTUNNELVPN$app.getString(-99973305955258L);
                byte[] bArrDecode = Base64.decode(clientAPI_ExternalPKISignRequest.getData(), 0);
                Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-100162284516282L), Deobfuscator$MHRTUNNELVPN$app.getString(-100226709025722L));
                PrivateKey privateKey = KeyChain.getPrivateKey(openVPNService, clientAPI_ExternalPKISignRequest.getAlias());
                if (privateKey != null) {
                    Cipher cipher = Cipher.getInstance(Deobfuscator$MHRTUNNELVPN$app.getString(-100304018437050L));
                    cipher.init(1, privateKey);
                    bArrDoFinal = cipher.doFinal(bArrDecode);
                } else {
                    clientAPI_ExternalPKISignRequest.setError(true);
                    clientAPI_ExternalPKISignRequest.setInvalidAlias(true);
                    bArrDoFinal = null;
                }
                if (bArrDoFinal != null) {
                    clientAPI_ExternalPKISignRequest.setSig(Base64.encodeToString(bArrDoFinal, 2));
                }
            } catch (Exception e) {
                Log.e(Deobfuscator$MHRTUNNELVPN$app.getString(-100750695035834L), Deobfuscator$MHRTUNNELVPN$app.getString(-100815119545274L), e);
                clientAPI_ExternalPKISignRequest.setError(true);
                clientAPI_ExternalPKISignRequest.setInvalidAlias(true);
                clientAPI_ExternalPKISignRequest.setErrorText(e.toString());
            }
        }
    }

    @Override // net.openvpn.ovpn3.ClientAPI_OpenVPNClient
    public final void log(ClientAPI_LogInfo clientAPI_LogInfo) {
        InterfaceC2752gy interfaceC2752gy = this.a;
        if (interfaceC2752gy != null) {
            C3461ty c3461ty = new C3461ty();
            c3461ty.a = clientAPI_LogInfo.getText();
            Handler handler = ((OpenVPNService) interfaceC2752gy).q;
            handler.sendMessage(handler.obtainMessage(2, c3461ty));
        }
    }

    @Override // net.openvpn.ovpn3.ClientAPI_OpenVPNClient
    public final boolean pause_on_connection_timeout() {
        if (this.a != null) {
            Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-99286111187898L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-99350535697338L), Boolean.FALSE));
        }
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a(super.connect());
    }

    @Override // net.openvpn.ovpn3.ClientAPI_TunBuilderBase
    public final boolean tun_builder_add_address(String str, int i, String str2, boolean z, boolean z2) {
        C3731yy c3731yy = this.b;
        if (c3731yy == null) {
            return false;
        }
        try {
            Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-76535669420986L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-76600093930426L), str, Integer.valueOf(i), str2, Boolean.valueOf(z), Boolean.valueOf(z2)));
            c3731yy.addAddress(str, i);
            return true;
        } catch (Exception e) {
            C3731yy.a(Deobfuscator$MHRTUNNELVPN$app.getString(-76801957393338L), e);
            return false;
        }
    }

    @Override // net.openvpn.ovpn3.ClientAPI_TunBuilderBase
    public final boolean tun_builder_add_dns_server(String str, boolean z) {
        C3731yy c3731yy = this.b;
        if (c3731yy == null) {
            return false;
        }
        try {
            Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-78017433138106L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-78081857647546L), str, Boolean.valueOf(z)));
            c3731yy.addDnsServer(str);
            return true;
        } catch (Exception e) {
            C3731yy.a(Deobfuscator$MHRTUNNELVPN$app.getString(-78232181502906L), e);
            return false;
        }
    }

    @Override // net.openvpn.ovpn3.ClientAPI_TunBuilderBase
    public final boolean tun_builder_add_route(String str, int i, int i2, boolean z) {
        C3731yy c3731yy = this.b;
        if (c3731yy == null) {
            return false;
        }
        try {
            Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-77304468566970L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-77368893076410L), str, Integer.valueOf(i), Boolean.valueOf(z)));
            c3731yy.addRoute(str, i);
            return true;
        } catch (Exception e) {
            C3731yy.a(Deobfuscator$MHRTUNNELVPN$app.getString(-77510626997178L), e);
            return false;
        }
    }

    @Override // net.openvpn.ovpn3.ClientAPI_TunBuilderBase
    public final boolean tun_builder_add_search_domain(String str) {
        C3731yy c3731yy = this.b;
        if (c3731yy == null) {
            return false;
        }
        try {
            Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-78348145619898L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-78412570129338L), str));
            c3731yy.addSearchDomain(str);
            return true;
        } catch (Exception e) {
            C3731yy.a(Deobfuscator$MHRTUNNELVPN$app.getString(-78541419148218L), e);
            return false;
        }
    }

    @Override // net.openvpn.ovpn3.ClientAPI_TunBuilderBase
    public final int tun_builder_establish() {
        PendingIntent pendingIntentC;
        C3731yy c3731yy = this.b;
        if (c3731yy == null) {
            return -1;
        }
        try {
            Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-79421887443898L), Deobfuscator$MHRTUNNELVPN$app.getString(-79486311953338L));
            OpenVPNService openVPNService = c3731yy.a;
            int i = OpenVPNService.E;
            Iterator it = openVPNService.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    pendingIntentC = null;
                    break;
                }
                pendingIntentC = ((InterfaceC3353ry) it.next()).c(0);
                if (pendingIntentC != null) {
                    break;
                }
            }
            if (pendingIntentC != null) {
                c3731yy.setConfigureIntent(pendingIntentC);
            }
            return c3731yy.establish().detachFd();
        } catch (Exception e) {
            C3731yy.a(Deobfuscator$MHRTUNNELVPN$app.getString(-79567916331962L), e);
            return -1;
        }
    }

    @Override // net.openvpn.ovpn3.ClientAPI_TunBuilderBase
    public final boolean tun_builder_exclude_route(String str, int i, int i2, boolean z) {
        if (this.b == null) {
            return false;
        }
        try {
            Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-77605116277690L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-77669540787130L), str, Integer.valueOf(i), Boolean.valueOf(z)));
            return true;
        } catch (Exception e) {
            C3731yy.a(Deobfuscator$MHRTUNNELVPN$app.getString(-77905763988410L), e);
            return false;
        }
    }

    @Override // net.openvpn.ovpn3.ClientAPI_TunBuilderBase
    public final boolean tun_builder_new() {
        InterfaceC2752gy interfaceC2752gy = this.a;
        if (interfaceC2752gy == null) {
            return false;
        }
        this.b = new C3731yy((OpenVPNService) interfaceC2752gy);
        return true;
    }

    @Override // net.openvpn.ovpn3.ClientAPI_TunBuilderBase
    public final boolean tun_builder_reroute_gw(boolean z, boolean z2, long j) {
        C3731yy c3731yy = this.b;
        if (c3731yy == null) {
            return false;
        }
        try {
            Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-76905036608442L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-76969461117882L), Boolean.valueOf(z), Boolean.valueOf(z2), Long.valueOf(j)));
            if ((j & 65536) != 0) {
                return true;
            }
            if (z) {
                c3731yy.addRoute(Deobfuscator$MHRTUNNELVPN$app.getString(-77162734646202L), 0);
            }
            if (!z2) {
                return true;
            }
            c3731yy.addRoute(Deobfuscator$MHRTUNNELVPN$app.getString(-77197094384570L), 0);
            return true;
        } catch (Exception e) {
            C3731yy.a(Deobfuscator$MHRTUNNELVPN$app.getString(-77209979286458L), e);
            return false;
        }
    }

    @Override // net.openvpn.ovpn3.ClientAPI_TunBuilderBase
    public final boolean tun_builder_set_mtu(int i) {
        C3731yy c3731yy = this.b;
        if (c3731yy == null) {
            return false;
        }
        try {
            Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-78670268167098L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-78734692676538L), Integer.valueOf(i)));
            c3731yy.setMtu(i);
            return true;
        } catch (Exception e) {
            C3731yy.a(Deobfuscator$MHRTUNNELVPN$app.getString(-78820592022458L), e);
            return false;
        }
    }

    @Override // net.openvpn.ovpn3.ClientAPI_TunBuilderBase
    public final boolean tun_builder_set_remote_address(String str, boolean z) {
        if (this.b == null) {
            return false;
        }
        try {
            Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-76170597200826L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-76235021710266L), str, Boolean.valueOf(z)));
            return true;
        } catch (Exception e) {
            C3731yy.a(Deobfuscator$MHRTUNNELVPN$app.getString(-76402525434810L), e);
            return false;
        }
    }

    @Override // net.openvpn.ovpn3.ClientAPI_TunBuilderBase
    public final boolean tun_builder_set_session_name(String str) throws PackageManager.NameNotFoundException {
        C3731yy c3731yy = this.b;
        if (c3731yy == null) {
            return false;
        }
        OpenVPNService openVPNService = c3731yy.a;
        C3492ub c3492ub = openVPNService.A;
        c3492ub.getClass();
        if (c3492ub.a.getBoolean(Deobfuscator$MHRTUNNELVPN$app.getString(-169139459290042L), false)) {
            if (openVPNService.A.b()) {
                for (String str2 : openVPNService.A.a()) {
                    try {
                        c3731yy.addDisallowedApplication(str2);
                        SkStatus.logInfo(Deobfuscator$MHRTUNNELVPN$app.getString(-78906491368378L) + str2);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            } else {
                for (String str3 : openVPNService.A.a()) {
                    try {
                        c3731yy.addAllowedApplication(str3);
                        SkStatus.logInfo(Deobfuscator$MHRTUNNELVPN$app.getString(-79013865550778L) + str3);
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                }
            }
        }
        try {
            Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-79108354831290L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-79172779340730L), str));
            c3731yy.setSession(openVPNService.getString(R.string.app));
            return true;
        } catch (Exception e) {
            C3731yy.a(Deobfuscator$MHRTUNNELVPN$app.getString(-79297333392314L), e);
            return false;
        }
    }

    @Override // net.openvpn.ovpn3.ClientAPI_TunBuilderBase
    public final void tun_builder_teardown(boolean z) {
        if (this.b != null) {
            try {
                Log.d(Deobfuscator$MHRTUNNELVPN$app.getString(-79662405612474L), String.format(Deobfuscator$MHRTUNNELVPN$app.getString(-79726830121914L), Boolean.valueOf(z)));
            } catch (Exception e) {
                C3731yy.a(Deobfuscator$MHRTUNNELVPN$app.getString(-79864269075386L), e);
            }
        }
    }
}
