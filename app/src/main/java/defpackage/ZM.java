package defpackage;

/* loaded from: classes.dex */
public abstract class ZM implements InterfaceC0053Cg {
    public int a;
    public C2566dc b;
    public ZC c;
    public int d;
    public final C0325Sg e = new C0325Sg(this);
    public int f = 0;
    public boolean g = false;
    public final C0121Gg h = new C0121Gg(this);
    public final C0121Gg i = new C0121Gg(this);
    public int j = 1;

    public ZM(C2566dc c2566dc) {
        this.b = c2566dc;
    }

    public static void b(C0121Gg c0121Gg, C0121Gg c0121Gg2, int i) {
        c0121Gg.l.add(c0121Gg2);
        c0121Gg.f = i;
        c0121Gg2.k.add(c0121Gg);
    }

    public static C0121Gg h(C0167Jb c0167Jb) {
        ZM zm;
        ZM zm2;
        C0167Jb c0167Jb2 = c0167Jb.f;
        if (c0167Jb2 == null) {
            return null;
        }
        int iA = AbstractC3264qG.A(c0167Jb2.e);
        C2566dc c2566dc = c0167Jb2.d;
        if (iA == 1) {
            zm = c2566dc.d;
        } else {
            if (iA != 2) {
                if (iA == 3) {
                    zm2 = c2566dc.d;
                } else {
                    if (iA != 4) {
                        if (iA != 5) {
                            return null;
                        }
                        return c2566dc.e.k;
                    }
                    zm2 = c2566dc.e;
                }
                return zm2.i;
            }
            zm = c2566dc.e;
        }
        return zm.h;
    }

    public static C0121Gg i(C0167Jb c0167Jb, int i) {
        C0167Jb c0167Jb2 = c0167Jb.f;
        if (c0167Jb2 == null) {
            return null;
        }
        C2566dc c2566dc = c0167Jb2.d;
        ZM zm = i == 0 ? c2566dc.d : c2566dc.e;
        int iA = AbstractC3264qG.A(c0167Jb2.e);
        if (iA == 1 || iA == 2) {
            return zm.h;
        }
        if (iA == 3 || iA == 4) {
            return zm.i;
        }
        return null;
    }

    public final void c(C0121Gg c0121Gg, C0121Gg c0121Gg2, int i, C0325Sg c0325Sg) {
        c0121Gg.l.add(c0121Gg2);
        c0121Gg.l.add(this.e);
        c0121Gg.h = i;
        c0121Gg.i = c0325Sg;
        c0121Gg2.k.add(c0121Gg);
        c0325Sg.k.add(c0121Gg);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int iMax;
        if (i2 == 0) {
            C2566dc c2566dc = this.b;
            int i3 = c2566dc.u;
            iMax = Math.max(c2566dc.t, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            C2566dc c2566dc2 = this.b;
            int i4 = c2566dc2.x;
            iMax = Math.max(c2566dc2.w, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    public long j() {
        if (this.e.j) {
            return r0.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.C0167Jb r12, defpackage.C0167Jb r13, int r14) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ZM.l(Jb, Jb, int):void");
    }
}
