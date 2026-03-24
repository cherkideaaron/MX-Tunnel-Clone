package defpackage;

import android.view.WindowInsetsAnimation;

/* renamed from: lN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2996lN extends AbstractC3051mN {
    public final WindowInsetsAnimation e;

    public C2996lN(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.AbstractC3051mN
    public final long a() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.AbstractC3051mN
    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.AbstractC3051mN
    public final int c() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.AbstractC3051mN
    public final void d(float f) {
        this.e.setFraction(f);
    }
}
