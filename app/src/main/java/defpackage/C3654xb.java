package defpackage;

/* renamed from: xb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3654xb extends R7 {
    public final N7 r;

    public C3654xb(int i, N7 n7, InterfaceC2631en interfaceC2631en) {
        super(i, interfaceC2631en);
        this.r = n7;
        if (n7 != N7.a) {
            if (i < 1) {
                throw new IllegalArgumentException(Vs.l(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + PB.a(R7.class).b() + " instead").toString());
        }
    }

    public final Object H(Object obj, boolean z) {
        C2764h9 c2764h9;
        InterfaceC2631en interfaceC2631en;
        C0234Na c0234NaG;
        N7 n7 = N7.c;
        DK dk = DK.a;
        if (this.r == n7) {
            Object objH = super.h(obj);
            if ((!(objH instanceof C2654f9)) || (objH instanceof C2599e9)) {
                return objH;
            }
            if (!z || (interfaceC2631en = this.b) == null || (c0234NaG = AbstractC3279qd.g(interfaceC2631en, obj, null)) == null) {
                return dk;
            }
            throw c0234NaG;
        }
        VH vh = T7.d;
        C2764h9 c2764h92 = (C2764h9) R7.m.get(this);
        while (true) {
            long andIncrement = R7.c.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zU = u(andIncrement, false);
            int i = T7.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (c2764h92.c != j3) {
                C2764h9 c2764h9A = R7.a(this, j3, c2764h92);
                if (c2764h9A != null) {
                    c2764h9 = c2764h9A;
                } else if (zU) {
                    return new C2599e9(r());
                }
            } else {
                c2764h9 = c2764h92;
            }
            int iE = R7.e(this, c2764h9, i2, obj, j, vh, zU);
            if (iE == 0) {
                c2764h9.b();
                return dk;
            }
            if (iE == 1) {
                return dk;
            }
            if (iE == 2) {
                if (zU) {
                    c2764h9.i();
                    return new C2599e9(r());
                }
                IM im = vh instanceof IM ? (IM) vh : null;
                if (im != null) {
                    im.b(c2764h9, i2 + i);
                }
                m((c2764h9.c * j2) + i2);
                return dk;
            }
            if (iE == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iE == 4) {
                if (j < R7.d.get(this)) {
                    c2764h9.b();
                }
                return new C2599e9(r());
            }
            if (iE == 5) {
                c2764h9.b();
            }
            c2764h92 = c2764h9;
        }
    }

    @Override // defpackage.R7, defpackage.InterfaceC2769hE
    public final Object d(InterfaceC3493uc interfaceC3493uc, Object obj) throws Throwable {
        C0234Na c0234NaG;
        if (!(H(obj, true) instanceof C2599e9)) {
            return DK.a;
        }
        InterfaceC2631en interfaceC2631en = this.b;
        if (interfaceC2631en == null || (c0234NaG = AbstractC3279qd.g(interfaceC2631en, obj, null)) == null) {
            throw r();
        }
        MO.a(c0234NaG, r());
        throw c0234NaG;
    }

    @Override // defpackage.R7, defpackage.InterfaceC2769hE
    public final Object h(Object obj) {
        return H(obj, false);
    }

    @Override // defpackage.R7
    public final boolean v() {
        return this.r == N7.b;
    }
}
