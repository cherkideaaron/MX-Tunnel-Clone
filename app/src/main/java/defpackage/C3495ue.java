package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: ue, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3495ue extends C2529cu {
    public final RectF w;

    public C3495ue(C3495ue c3495ue) {
        super(c3495ue);
        this.w = c3495ue.w;
    }

    @Override // defpackage.C2529cu, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C3549ve c3549ve = new C3549ve(this);
        c3549ve.N = this;
        c3549ve.invalidateSelf();
        return c3549ve;
    }

    public C3495ue(C2878jF c2878jF, RectF rectF) {
        super(c2878jF);
        this.w = rectF;
    }
}
