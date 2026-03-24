package defpackage;

import android.view.WindowInsets;

/* renamed from: wN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3595wN extends C3541vN {
    public C0130Gp n;
    public C0130Gp o;
    public C0130Gp p;

    public C3595wN(AN an, WindowInsets windowInsets) {
        super(an, windowInsets);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    @Override // defpackage.C3703yN
    public C0130Gp g() {
        if (this.o == null) {
            this.o = C0130Gp.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.o;
    }

    @Override // defpackage.C3703yN
    public C0130Gp i() {
        if (this.n == null) {
            this.n = C0130Gp.c(this.c.getSystemGestureInsets());
        }
        return this.n;
    }

    @Override // defpackage.C3703yN
    public C0130Gp k() {
        if (this.p == null) {
            this.p = C0130Gp.c(this.c.getTappableElementInsets());
        }
        return this.p;
    }

    @Override // defpackage.AbstractC3379sN, defpackage.C3703yN
    public AN l(int i, int i2, int i3, int i4) {
        return AN.g(null, this.c.inset(i, i2, i3, i4));
    }

    @Override // defpackage.C3433tN, defpackage.C3703yN
    public void q(C0130Gp c0130Gp) {
    }
}
