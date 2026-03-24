package defpackage;

import android.content.IntentSender;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import org.lsposed.lsparanoid.Deobfuscator$MHRTUNNELVPN$app;
import rased.vpn.app.activities.OpenVPNClient;
import xyz.hasnat.sweettoast.SweetToast;

/* loaded from: classes2.dex */
public class H7 implements OnSuccessListener, NA {
    public boolean a;
    public final Object b;

    public H7(C3249q1 c3249q1) {
        AbstractC0500aq.m(c3249q1, "writer");
        this.b = c3249q1;
        this.a = true;
    }

    @Override // defpackage.NA
    public void a(MA ma, int i) {
        boolean z = this.a;
        StringBuilder sb = (StringBuilder) this.b;
        if (z) {
            this.a = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public boolean b() {
        return this.a;
    }

    public void c() {
        this.a = true;
    }

    public boolean d(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        C3397so c3397so = (C3397so) this.b;
        if (c3397so == null) {
            return b();
        }
        int iA = c3397so.a(charSequence, i);
        if (iA == 0) {
            return true;
        }
        if (iA != 1) {
            return b();
        }
        return false;
    }

    public void e() {
        this.a = false;
    }

    public void f() {
        this.a = false;
    }

    public void g(char c) {
        C3249q1 c3249q1 = (C3249q1) this.b;
        c3249q1.c(c3249q1.b, 1);
        char[] cArr = (char[]) c3249q1.c;
        int i = c3249q1.b;
        c3249q1.b = i + 1;
        cArr[i] = c;
    }

    public void h(int i) {
        long j = i;
        C3249q1 c3249q1 = (C3249q1) this.b;
        c3249q1.getClass();
        c3249q1.j(String.valueOf(j));
    }

    public void i(long j) {
        C3249q1 c3249q1 = (C3249q1) this.b;
        c3249q1.getClass();
        c3249q1.j(String.valueOf(j));
    }

    public void j(String str) {
        AbstractC0500aq.m(str, "v");
        ((C3249q1) this.b).j(str);
    }

    public void k(String str) {
        byte b;
        AbstractC0500aq.m(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        C3249q1 c3249q1 = (C3249q1) this.b;
        c3249q1.getClass();
        c3249q1.c(c3249q1.b, str.length() + 2);
        char[] cArr = (char[]) c3249q1.c;
        int i = c3249q1.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = AbstractC3319rH.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    c3249q1.c(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = AbstractC3319rH.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) c3249q1.c)[i4] = cCharAt;
                        i4 = i6;
                    } else {
                        if (b == 1) {
                            String str2 = AbstractC3319rH.a[cCharAt];
                            AbstractC0500aq.j(str2);
                            c3249q1.c(i4, str2.length());
                            str2.getChars(0, str2.length(), (char[]) c3249q1.c, i4);
                            int length3 = str2.length() + i4;
                            c3249q1.b = length3;
                            i4 = length3;
                        } else {
                            char[] cArr2 = (char[]) c3249q1.c;
                            cArr2[i4] = '\\';
                            cArr2[i4 + 1] = (char) b;
                            i4 += 2;
                            c3249q1.b = i4;
                        }
                    }
                }
                c3249q1.c(i4, 1);
                ((char[]) c3249q1.c)[i4] = '\"';
                c3249q1.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        c3249q1.b = i3 + 1;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        StringBuilder sb;
        int iUpdateAvailability;
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) obj;
        C3236pp c3236pp = (C3236pp) this.b;
        c3236pp.q.getClass();
        if (this.a) {
            if (appUpdateInfo.updateAvailability() == 2) {
                if (c3236pp.f == 1 && appUpdateInfo.isUpdateTypeAllowed(0)) {
                    try {
                        c3236pp.b.startUpdateFlowForResult(appUpdateInfo, 0, c3236pp.a, c3236pp.c);
                    } catch (IntentSender.SendIntentException e) {
                        Log.e("InAppUpdateManager", "error in startAppUpdateFlexible", e);
                        InterfaceC3181op interfaceC3181op = c3236pp.o;
                        if (interfaceC3181op != null) {
                            SweetToast.error(((OpenVPNClient) interfaceC3181op).getApplicationContext(), Deobfuscator$MHRTUNNELVPN$app.getString(-51075103290298L));
                        }
                    }
                } else if (appUpdateInfo.isUpdateTypeAllowed(1)) {
                    C3236pp.j(c3236pp, appUpdateInfo);
                }
                sb = new StringBuilder("checkForAppUpdate(): Update available. Version Code: ");
                iUpdateAvailability = appUpdateInfo.availableVersionCode();
            } else if (appUpdateInfo.updateAvailability() == 1) {
                sb = new StringBuilder("checkForAppUpdate(): No Update available. Code: ");
                iUpdateAvailability = appUpdateInfo.updateAvailability();
            }
            sb.append(iUpdateAvailability);
            Log.d("InAppUpdateManager", sb.toString());
        }
        C3236pp.d(c3236pp);
    }

    public H7(C3397so c3397so, boolean z) {
        this.b = c3397so;
        this.a = z;
    }

    public /* synthetic */ H7(Object obj, boolean z) {
        this.b = obj;
        this.a = z;
    }

    public H7(StringBuilder sb) {
        this.b = sb;
        this.a = true;
    }

    public H7(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public void l() {
    }

    public void m() {
    }
}
