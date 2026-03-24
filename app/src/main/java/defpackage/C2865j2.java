package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: j2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2865j2 extends CheckBox implements InterfaceC2719gJ, InterfaceC2774hJ {
    public final C2975l2 a;
    public final C2702g2 b;
    public final C3196p3 c;
    public L2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2865j2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC2555dJ.a(context);
        PI.a(this, getContext());
        C2975l2 c2975l2 = new C2975l2(this);
        this.a = c2975l2;
        c2975l2.c(attributeSet, i);
        C2702g2 c2702g2 = new C2702g2(this);
        this.b = c2702g2;
        c2702g2.t(attributeSet, i);
        C3196p3 c3196p3 = new C3196p3(this);
        this.c = c3196p3;
        c3196p3.f(attributeSet, i);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private L2 getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new L2(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2702g2 c2702g2 = this.b;
        if (c2702g2 != null) {
            c2702g2.a();
        }
        C3196p3 c3196p3 = this.c;
        if (c3196p3 != null) {
            c3196p3.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2702g2 c2702g2 = this.b;
        if (c2702g2 != null) {
            return c2702g2.r();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2702g2 c2702g2 = this.b;
        if (c2702g2 != null) {
            return c2702g2.s();
        }
        return null;
    }

    @Override // defpackage.InterfaceC2719gJ
    public ColorStateList getSupportButtonTintList() {
        C2975l2 c2975l2 = this.a;
        if (c2975l2 != null) {
            return c2975l2.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C2975l2 c2975l2 = this.a;
        if (c2975l2 != null) {
            return c2975l2.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2702g2 c2702g2 = this.b;
        if (c2702g2 != null) {
            c2702g2.u();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2702g2 c2702g2 = this.b;
        if (c2702g2 != null) {
            c2702g2.v(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0500aq.F(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3196p3 c3196p3 = this.c;
        if (c3196p3 != null) {
            c3196p3.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3196p3 c3196p3 = this.c;
        if (c3196p3 != null) {
            c3196p3.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2702g2 c2702g2 = this.b;
        if (c2702g2 != null) {
            c2702g2.x(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2702g2 c2702g2 = this.b;
        if (c2702g2 != null) {
            c2702g2.y(mode);
        }
    }

    @Override // defpackage.InterfaceC2719gJ
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C2975l2 c2975l2 = this.a;
        if (c2975l2 != null) {
            c2975l2.a = colorStateList;
            c2975l2.c = true;
            c2975l2.a();
        }
    }

    @Override // defpackage.InterfaceC2719gJ
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C2975l2 c2975l2 = this.a;
        if (c2975l2 != null) {
            c2975l2.b = mode;
            c2975l2.d = true;
            c2975l2.a();
        }
    }

    @Override // defpackage.InterfaceC2774hJ
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C3196p3 c3196p3 = this.c;
        c3196p3.l(colorStateList);
        c3196p3.b();
    }

    @Override // defpackage.InterfaceC2774hJ
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C3196p3 c3196p3 = this.c;
        c3196p3.m(mode);
        c3196p3.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C2975l2 c2975l2 = this.a;
        if (c2975l2 != null) {
            if (c2975l2.e) {
                c2975l2.e = false;
            } else {
                c2975l2.e = true;
                c2975l2.a();
            }
        }
    }
}
