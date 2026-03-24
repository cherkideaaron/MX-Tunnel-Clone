package defpackage;

import java.util.Iterator;

/* renamed from: yo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3721yo extends ZM {
    @Override // defpackage.InterfaceC0053Cg
    public final void a(InterfaceC0053Cg interfaceC0053Cg) {
        C0572c7 c0572c7 = (C0572c7) this.b;
        int i = c0572c7.r0;
        C0121Gg c0121Gg = this.h;
        Iterator it = c0121Gg.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C0121Gg) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c0121Gg.d(i3 + c0572c7.t0);
        } else {
            c0121Gg.d(i2 + c0572c7.t0);
        }
    }

    @Override // defpackage.ZM
    public final void d() {
        ZM zm;
        C2566dc c2566dc = this.b;
        if (c2566dc instanceof C0572c7) {
            C0121Gg c0121Gg = this.h;
            c0121Gg.b = true;
            C0572c7 c0572c7 = (C0572c7) c2566dc;
            int i = c0572c7.r0;
            boolean z = c0572c7.s0;
            int i2 = 0;
            if (i == 0) {
                c0121Gg.e = 4;
                while (i2 < c0572c7.q0) {
                    C2566dc c2566dc2 = c0572c7.p0[i2];
                    if (z || c2566dc2.f0 != 8) {
                        C0121Gg c0121Gg2 = c2566dc2.d.h;
                        c0121Gg2.k.add(c0121Gg);
                        c0121Gg.l.add(c0121Gg2);
                    }
                    i2++;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        c0121Gg.e = 6;
                        while (i2 < c0572c7.q0) {
                            C2566dc c2566dc3 = c0572c7.p0[i2];
                            if (z || c2566dc3.f0 != 8) {
                                C0121Gg c0121Gg3 = c2566dc3.e.h;
                                c0121Gg3.k.add(c0121Gg);
                                c0121Gg.l.add(c0121Gg3);
                            }
                            i2++;
                        }
                    } else {
                        if (i != 3) {
                            return;
                        }
                        c0121Gg.e = 7;
                        while (i2 < c0572c7.q0) {
                            C2566dc c2566dc4 = c0572c7.p0[i2];
                            if (z || c2566dc4.f0 != 8) {
                                C0121Gg c0121Gg4 = c2566dc4.e.i;
                                c0121Gg4.k.add(c0121Gg);
                                c0121Gg.l.add(c0121Gg4);
                            }
                            i2++;
                        }
                    }
                    m(this.b.e.h);
                    zm = this.b.e;
                    m(zm.i);
                }
                c0121Gg.e = 5;
                while (i2 < c0572c7.q0) {
                    C2566dc c2566dc5 = c0572c7.p0[i2];
                    if (z || c2566dc5.f0 != 8) {
                        C0121Gg c0121Gg5 = c2566dc5.d.i;
                        c0121Gg5.k.add(c0121Gg);
                        c0121Gg.l.add(c0121Gg5);
                    }
                    i2++;
                }
            }
            m(this.b.d.h);
            zm = this.b.d;
            m(zm.i);
        }
    }

    @Override // defpackage.ZM
    public final void e() {
        C2566dc c2566dc = this.b;
        if (c2566dc instanceof C0572c7) {
            int i = ((C0572c7) c2566dc).r0;
            C0121Gg c0121Gg = this.h;
            if (i == 0 || i == 1) {
                c2566dc.X = c0121Gg.g;
            } else {
                c2566dc.Y = c0121Gg.g;
            }
        }
    }

    @Override // defpackage.ZM
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.ZM
    public final boolean k() {
        return false;
    }

    public final void m(C0121Gg c0121Gg) {
        C0121Gg c0121Gg2 = this.h;
        c0121Gg2.k.add(c0121Gg);
        c0121Gg.l.add(c0121Gg2);
    }
}
