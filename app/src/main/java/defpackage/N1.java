package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class N1 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public N1(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        O1 o1 = new O1(null);
        Drawable drawableNewDrawable = this.a.newDrawable();
        o1.a = drawableNewDrawable;
        drawableNewDrawable.setCallback(o1.f);
        return o1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        O1 o1 = new O1(null);
        Drawable drawableNewDrawable = this.a.newDrawable(resources);
        o1.a = drawableNewDrawable;
        drawableNewDrawable.setCallback(o1.f);
        return o1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        O1 o1 = new O1(null);
        Drawable drawableNewDrawable = this.a.newDrawable(resources, theme);
        o1.a = drawableNewDrawable;
        drawableNewDrawable.setCallback(o1.f);
        return o1;
    }
}
