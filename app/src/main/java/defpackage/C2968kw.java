package defpackage;

import android.os.Build;

/* renamed from: kw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2968kw extends AbstractC0218Mb {
    public static final String e = C3130nt.f("NetworkMeteredCtrlr");

    @Override // defpackage.AbstractC0218Mb
    public final boolean a(C2834iO c2834iO) {
        return c2834iO.j.a == 5;
    }

    @Override // defpackage.AbstractC0218Mb
    public final boolean b(Object obj) {
        C3243pw c3243pw = (C3243pw) obj;
        boolean z = true;
        if (Build.VERSION.SDK_INT < 26) {
            C3130nt.d().a(e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !c3243pw.a;
        }
        if (c3243pw.a && c3243pw.c) {
            z = false;
        }
        return z;
    }
}
