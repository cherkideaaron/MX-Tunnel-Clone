package defpackage;

import android.os.Build;

/* renamed from: lw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3023lw extends AbstractC0218Mb {
    public static final String e = C3130nt.f("NetworkNotRoamingCtrlr");

    @Override // defpackage.AbstractC0218Mb
    public final boolean a(C2834iO c2834iO) {
        return c2834iO.j.a == 4;
    }

    @Override // defpackage.AbstractC0218Mb
    public final boolean b(Object obj) {
        C3243pw c3243pw = (C3243pw) obj;
        boolean z = true;
        if (Build.VERSION.SDK_INT < 24) {
            C3130nt.d().a(e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !c3243pw.a;
        }
        if (c3243pw.a && c3243pw.d) {
            z = false;
        }
        return z;
    }
}
