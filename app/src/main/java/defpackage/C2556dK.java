package defpackage;

import java.util.HashMap;

/* renamed from: dK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2556dK {
    public final J6 a;
    public final String b;
    public final C0174Ji c;
    public final LJ d;
    public final C2610eK e;

    public C2556dK(J6 j6, String str, C0174Ji c0174Ji, LJ lj, C2610eK c2610eK) {
        this.a = j6;
        this.b = str;
        this.c = c0174Ji;
        this.d = lj;
        this.e = c2610eK;
    }

    public final void a(C2651f6 c2651f6, InterfaceC2665fK interfaceC2665fK) {
        Integer num;
        J6 j6 = this.a;
        if (j6 == null) {
            throw new NullPointerException("Null transportContext");
        }
        String str = this.b;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        LJ lj = this.d;
        if (lj == null) {
            throw new NullPointerException("Null transformer");
        }
        C0174Ji c0174Ji = this.c;
        if (c0174Ji == null) {
            throw new NullPointerException("Null encoding");
        }
        C2610eK c2610eK = this.e;
        c2610eK.getClass();
        J6 j6B = j6.b(c2651f6.b);
        C2706g6 c2706g6 = new C2706g6();
        c2706g6.f = new HashMap();
        c2706g6.d = Long.valueOf(c2610eK.a.a());
        c2706g6.e = Long.valueOf(c2610eK.b.a());
        c2706g6.a = str;
        c2706g6.c(new C0123Gi(c0174Ji, (byte[]) lj.apply(c2651f6.a)));
        c2706g6.b = null;
        C3740z6 c3740z6 = c2651f6.c;
        if (c3740z6 != null && (num = c3740z6.a) != null) {
            c2706g6.g = num;
        }
        C2761h6 c2761h6B = c2706g6.b();
        C0599cg c0599cg = (C0599cg) c2610eK.c;
        c0599cg.getClass();
        c0599cg.b.execute(new RunnableC0490ag(c0599cg, j6B, interfaceC2665fK, c2761h6B, 0));
    }
}
