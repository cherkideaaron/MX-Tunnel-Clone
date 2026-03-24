package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: wL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3593wL extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public C3593wL(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C3647xL c3647xL = new C3647xL();
        c3647xL.a = (VectorDrawable) this.a.newDrawable();
        return c3647xL;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C3647xL c3647xL = new C3647xL();
        c3647xL.a = (VectorDrawable) this.a.newDrawable(resources);
        return c3647xL;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C3647xL c3647xL = new C3647xL();
        c3647xL.a = (VectorDrawable) this.a.newDrawable(resources, theme);
        return c3647xL;
    }
}
