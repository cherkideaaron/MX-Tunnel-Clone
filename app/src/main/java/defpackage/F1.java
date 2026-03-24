package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class F1 extends Animatable2.AnimationCallback {
    public final /* synthetic */ Vt a;

    public F1(Vt vt) {
        this.a = vt;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.a.b.u;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        Xt xt = this.a.b;
        ColorStateList colorStateList = xt.u;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(xt.y, colorStateList.getDefaultColor()));
        }
    }
}
