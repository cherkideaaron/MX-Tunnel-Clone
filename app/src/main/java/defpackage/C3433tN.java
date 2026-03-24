package defpackage;

import android.view.WindowInsets;

/* renamed from: tN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3433tN extends AbstractC3379sN {
    public C0130Gp m;

    public C3433tN(AN an, WindowInsets windowInsets) {
        super(an, windowInsets);
        this.m = null;
    }

    @Override // defpackage.C3703yN
    public AN b() {
        return AN.g(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.C3703yN
    public AN c() {
        return AN.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.C3703yN
    public final C0130Gp h() {
        if (this.m == null) {
            WindowInsets windowInsets = this.c;
            this.m = C0130Gp.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.m;
    }

    @Override // defpackage.C3703yN
    public boolean m() {
        return this.c.isConsumed();
    }

    @Override // defpackage.C3703yN
    public void q(C0130Gp c0130Gp) {
        this.m = c0130Gp;
    }
}
