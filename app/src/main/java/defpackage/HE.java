package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes2.dex */
public final class HE {
    public static final HE a = new HE();
    public static final C0607co b;

    static {
        C0386Vq c0386Vq = new C0386Vq();
        c0386Vq.a(GE.class, C2978l5.a);
        c0386Vq.a(NE.class, C3033m5.a);
        c0386Vq.a(C0170Je.class, C2868j5.a);
        c0386Vq.a(O3.class, C2815i5.a);
        c0386Vq.a(A1.class, C2760h5.a);
        c0386Vq.a(Jz.class, C2923k5.a);
        c0386Vq.d = true;
        b = new C0607co(c0386Vq);
    }

    public static O3 a(C3663xk c3663xk) throws PackageManager.NameNotFoundException {
        c3663xk.a();
        Context context = c3663xk.a;
        AbstractC0500aq.l(context, "getApplicationContext(...)");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        c3663xk.a();
        String str = c3663xk.c.b;
        AbstractC0500aq.l(str, "getApplicationId(...)");
        String str2 = Build.MODEL;
        AbstractC0500aq.l(str2, "MODEL");
        String str3 = Build.VERSION.RELEASE;
        AbstractC0500aq.l(str3, "RELEASE");
        EnumC2692ft enumC2692ft = EnumC2692ft.b;
        AbstractC0500aq.j(packageName);
        String str4 = packageInfo.versionName;
        String str5 = str4 == null ? strValueOf : str4;
        String str6 = Build.MANUFACTURER;
        AbstractC0500aq.l(str6, "MANUFACTURER");
        c3663xk.a();
        Jz jzA = AbstractC3296qu.A(context);
        c3663xk.a();
        return new O3(str, str2, str3, new A1(packageName, str5, strValueOf, str6, jzA, AbstractC3296qu.v(context)));
    }
}
