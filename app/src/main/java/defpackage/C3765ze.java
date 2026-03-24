package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: ze, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3765ze implements TH {
    public Context a;

    public C0017Ae a() {
        Context context = this.a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        C0017Ae c0017Ae = new C0017Ae();
        c0017Ae.a = C2844ih.a(AbstractC0069Df.f);
        C0565c0 c0565c0 = new C0565c0(context);
        c0017Ae.b = c0565c0;
        c0017Ae.c = C2844ih.a(new C0495al(c0565c0, new C0390Wd(c0565c0), 1));
        C0565c0 c0565c02 = c0017Ae.b;
        c0017Ae.d = new C0390Wd((InterfaceC3203pA) c0565c02);
        InterfaceC3203pA interfaceC3203pAA = C2844ih.a(new C2570dg(c0017Ae.d, C2844ih.a(new C2737gj(c0565c02, 0))));
        c0017Ae.e = interfaceC3203pAA;
        C0412Xi c0412Xi = new C0412Xi();
        C0565c0 c0565c03 = c0017Ae.b;
        C2684fl c2684fl = new C2684fl(c0565c03, interfaceC3203pAA, c0412Xi);
        InterfaceC3203pA interfaceC3203pA = c0017Ae.a;
        InterfaceC3203pA interfaceC3203pA2 = c0017Ae.c;
        C2570dg c2570dg = new C2570dg(interfaceC3203pA, interfaceC3203pA2, c2684fl, interfaceC3203pAA, interfaceC3203pAA, 0);
        C0108Fk c0108Fk = AbstractC0069Df.i;
        C3397so c3397so = AbstractC0500aq.i;
        C3308r6 c3308r6 = new C3308r6();
        c3308r6.a = c0565c03;
        c3308r6.b = interfaceC3203pA2;
        c3308r6.c = interfaceC3203pAA;
        c3308r6.d = c2684fl;
        c3308r6.e = interfaceC3203pA;
        c3308r6.f = interfaceC3203pAA;
        c3308r6.m = c0108Fk;
        c3308r6.n = c3397so;
        c3308r6.o = interfaceC3203pAA;
        c0017Ae.f = C2844ih.a(new C2570dg(c2570dg, c3308r6, new KJ(interfaceC3203pA, interfaceC3203pAA, c2684fl, interfaceC3203pAA)));
        return c0017Ae;
    }

    @Override // defpackage.TH
    public UH b(C0312Rk c0312Rk) {
        N2 n2 = (N2) c0312Rk.d;
        if (n2 == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        Context context = this.a;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        String str = (String) c0312Rk.c;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        C0312Rk c0312Rk2 = new C0312Rk(context, str, n2, true);
        return new C0450Zm((Context) c0312Rk2.b, (String) c0312Rk2.c, (N2) c0312Rk2.d, c0312Rk2.a);
    }
}
