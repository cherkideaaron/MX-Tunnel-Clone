package defpackage;

/* renamed from: ko, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2960ko extends ZM {
    @Override // defpackage.InterfaceC0053Cg
    public final void a(InterfaceC0053Cg interfaceC0053Cg) {
        C0121Gg c0121Gg = this.h;
        if (c0121Gg.c && !c0121Gg.j) {
            c0121Gg.d((int) ((((C0121Gg) c0121Gg.l.get(0)).g * ((C2905jo) this.b).p0) + 0.5f));
        }
    }

    @Override // defpackage.ZM
    public final void d() {
        ZM zm;
        C2566dc c2566dc = this.b;
        C2905jo c2905jo = (C2905jo) c2566dc;
        int i = c2905jo.q0;
        int i2 = c2905jo.r0;
        int i3 = c2905jo.t0;
        C0121Gg c0121Gg = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0121Gg.l.add(c2566dc.S.d.h);
                this.b.S.d.h.k.add(c0121Gg);
                c0121Gg.f = i;
            } else if (i2 != -1) {
                c0121Gg.l.add(c2566dc.S.d.i);
                this.b.S.d.i.k.add(c0121Gg);
                c0121Gg.f = -i2;
            } else {
                c0121Gg.b = true;
                c0121Gg.l.add(c2566dc.S.d.i);
                this.b.S.d.i.k.add(c0121Gg);
            }
            m(this.b.d.h);
            zm = this.b.d;
        } else {
            if (i != -1) {
                c0121Gg.l.add(c2566dc.S.e.h);
                this.b.S.e.h.k.add(c0121Gg);
                c0121Gg.f = i;
            } else if (i2 != -1) {
                c0121Gg.l.add(c2566dc.S.e.i);
                this.b.S.e.i.k.add(c0121Gg);
                c0121Gg.f = -i2;
            } else {
                c0121Gg.b = true;
                c0121Gg.l.add(c2566dc.S.e.i);
                this.b.S.e.i.k.add(c0121Gg);
            }
            m(this.b.e.h);
            zm = this.b.e;
        }
        m(zm.i);
    }

    @Override // defpackage.ZM
    public final void e() {
        C2566dc c2566dc = this.b;
        int i = ((C2905jo) c2566dc).t0;
        C0121Gg c0121Gg = this.h;
        if (i == 1) {
            c2566dc.X = c0121Gg.g;
        } else {
            c2566dc.Y = c0121Gg.g;
        }
    }

    @Override // defpackage.ZM
    public final void f() {
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
