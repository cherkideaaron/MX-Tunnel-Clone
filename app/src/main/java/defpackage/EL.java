package defpackage;

/* loaded from: classes.dex */
public final class EL extends ZM {
    public C0121Gg k;
    public C3363s7 l;

    @Override // defpackage.InterfaceC0053Cg
    public final void a(InterfaceC0053Cg interfaceC0053Cg) {
        float f;
        int i;
        float f2;
        if (AbstractC3264qG.A(this.j) == 3) {
            C2566dc c2566dc = this.b;
            l(c2566dc.I, c2566dc.K, 1);
            return;
        }
        C0325Sg c0325Sg = this.e;
        if (c0325Sg.c && !c0325Sg.j && this.d == 3) {
            C2566dc c2566dc2 = this.b;
            int i2 = c2566dc2.r;
            if (i2 == 2) {
                C2566dc c2566dc3 = c2566dc2.S;
                if (c2566dc3 != null) {
                    if (c2566dc3.e.e.j) {
                        f = r5.g * c2566dc2.y;
                        i = (int) (f + 0.5f);
                    }
                }
            } else if (i2 == 3) {
                C0325Sg c0325Sg2 = c2566dc2.d.e;
                if (c0325Sg2.j) {
                    int i3 = c2566dc2.W;
                    if (i3 == -1) {
                        f2 = c0325Sg2.g;
                    } else if (i3 == 0) {
                        f = c0325Sg2.g * c2566dc2.V;
                        i = (int) (f + 0.5f);
                    } else if (i3 != 1) {
                        i = 0;
                    } else {
                        f2 = c0325Sg2.g;
                    }
                    f = f2 / c2566dc2.V;
                    i = (int) (f + 0.5f);
                }
            }
            c0325Sg.d(i);
        }
        C0121Gg c0121Gg = this.h;
        if (c0121Gg.c) {
            C0121Gg c0121Gg2 = this.i;
            if (c0121Gg2.c) {
                if (c0121Gg.j && c0121Gg2.j && c0325Sg.j) {
                    return;
                }
                if (!c0325Sg.j && this.d == 3) {
                    C2566dc c2566dc4 = this.b;
                    if (c2566dc4.q == 0 && !c2566dc4.v()) {
                        C0121Gg c0121Gg3 = (C0121Gg) c0121Gg.l.get(0);
                        C0121Gg c0121Gg4 = (C0121Gg) c0121Gg2.l.get(0);
                        int i4 = c0121Gg3.g + c0121Gg.f;
                        int i5 = c0121Gg4.g + c0121Gg2.f;
                        c0121Gg.d(i4);
                        c0121Gg2.d(i5);
                        c0325Sg.d(i5 - i4);
                        return;
                    }
                }
                if (!c0325Sg.j && this.d == 3 && this.a == 1 && c0121Gg.l.size() > 0 && c0121Gg2.l.size() > 0) {
                    C0121Gg c0121Gg5 = (C0121Gg) c0121Gg.l.get(0);
                    int i6 = (((C0121Gg) c0121Gg2.l.get(0)).g + c0121Gg2.f) - (c0121Gg5.g + c0121Gg.f);
                    int i7 = c0325Sg.m;
                    if (i6 < i7) {
                        c0325Sg.d(i6);
                    } else {
                        c0325Sg.d(i7);
                    }
                }
                if (c0325Sg.j && c0121Gg.l.size() > 0 && c0121Gg2.l.size() > 0) {
                    C0121Gg c0121Gg6 = (C0121Gg) c0121Gg.l.get(0);
                    C0121Gg c0121Gg7 = (C0121Gg) c0121Gg2.l.get(0);
                    int i8 = c0121Gg6.g;
                    int i9 = c0121Gg.f + i8;
                    int i10 = c0121Gg7.g;
                    int i11 = c0121Gg2.f + i10;
                    float f3 = this.b.d0;
                    if (c0121Gg6 == c0121Gg7) {
                        f3 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0121Gg.d((int) ((((i10 - i8) - c0325Sg.g) * f3) + i8 + 0.5f));
                    c0121Gg2.d(c0121Gg.g + c0325Sg.g);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x030c A[PHI: r0
      0x030c: PHI (r0v22 Go) = (r0v15 Go), (r0v31 Go) binds: [B:151:0x030a, B:125:0x0298] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ZM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.EL.d():void");
    }

    @Override // defpackage.ZM
    public final void e() {
        C0121Gg c0121Gg = this.h;
        if (c0121Gg.j) {
            this.b.Y = c0121Gg.g;
        }
    }

    @Override // defpackage.ZM
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.ZM
    public final boolean k() {
        return this.d != 3 || this.b.r == 0;
    }

    public final void m() {
        this.g = false;
        C0121Gg c0121Gg = this.h;
        c0121Gg.c();
        c0121Gg.j = false;
        C0121Gg c0121Gg2 = this.i;
        c0121Gg2.c();
        c0121Gg2.j = false;
        C0121Gg c0121Gg3 = this.k;
        c0121Gg3.c();
        c0121Gg3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.g0;
    }
}
