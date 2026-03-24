package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.lang.reflect.InvocationTargetException;

/* renamed from: h2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2757h2 extends Button implements InterfaceC2774hJ {
    public final C2702g2 a;
    public final C3196p3 b;
    public L2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2757h2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC2555dJ.a(context);
        PI.a(this, getContext());
        C2702g2 c2702g2 = new C2702g2(this);
        this.a = c2702g2;
        c2702g2.t(attributeSet, i);
        C3196p3 c3196p3 = new C3196p3(this);
        this.b = c3196p3;
        c3196p3.f(attributeSet, i);
        c3196p3.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private L2 getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new L2(this);
        }
        return this.c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2702g2 c2702g2 = this.a;
        if (c2702g2 != null) {
            c2702g2.a();
        }
        C3196p3 c3196p3 = this.b;
        if (c3196p3 != null) {
            c3196p3.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AbstractC3270qM.c) {
            return super.getAutoSizeMaxTextSize();
        }
        C3196p3 c3196p3 = this.b;
        if (c3196p3 != null) {
            return Math.round(c3196p3.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC3270qM.c) {
            return super.getAutoSizeMinTextSize();
        }
        C3196p3 c3196p3 = this.b;
        if (c3196p3 != null) {
            return Math.round(c3196p3.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC3270qM.c) {
            return super.getAutoSizeStepGranularity();
        }
        C3196p3 c3196p3 = this.b;
        if (c3196p3 != null) {
            return Math.round(c3196p3.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC3270qM.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C3196p3 c3196p3 = this.b;
        return c3196p3 != null ? c3196p3.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (AbstractC3270qM.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C3196p3 c3196p3 = this.b;
        if (c3196p3 != null) {
            return c3196p3.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC3296qu.W(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2702g2 c2702g2 = this.a;
        if (c2702g2 != null) {
            return c2702g2.r();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2702g2 c2702g2 = this.a;
        if (c2702g2 != null) {
            return c2702g2.s();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C3196p3 c3196p3 = this.b;
        if (c3196p3 == null || AbstractC3270qM.c) {
            return;
        }
        c3196p3.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C3196p3 c3196p3 = this.b;
        if (c3196p3 == null || AbstractC3270qM.c) {
            return;
        }
        C3683y3 c3683y3 = c3196p3.i;
        if (c3683y3.f()) {
            c3683y3.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC3270qM.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C3196p3 c3196p3 = this.b;
        if (c3196p3 != null) {
            c3196p3.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC3270qM.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C3196p3 c3196p3 = this.b;
        if (c3196p3 != null) {
            c3196p3.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC3270qM.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C3196p3 c3196p3 = this.b;
        if (c3196p3 != null) {
            c3196p3.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2702g2 c2702g2 = this.a;
        if (c2702g2 != null) {
            c2702g2.u();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2702g2 c2702g2 = this.a;
        if (c2702g2 != null) {
            c2702g2.v(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC3296qu.X(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C3196p3 c3196p3 = this.b;
        if (c3196p3 != null) {
            c3196p3.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2702g2 c2702g2 = this.a;
        if (c2702g2 != null) {
            c2702g2.x(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2702g2 c2702g2 = this.a;
        if (c2702g2 != null) {
            c2702g2.y(mode);
        }
    }

    @Override // defpackage.InterfaceC2774hJ
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C3196p3 c3196p3 = this.b;
        c3196p3.l(colorStateList);
        c3196p3.b();
    }

    @Override // defpackage.InterfaceC2774hJ
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C3196p3 c3196p3 = this.b;
        c3196p3.m(mode);
        c3196p3.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3196p3 c3196p3 = this.b;
        if (c3196p3 != null) {
            c3196p3.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z = AbstractC3270qM.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C3196p3 c3196p3 = this.b;
        if (c3196p3 == null || z) {
            return;
        }
        C3683y3 c3683y3 = c3196p3.i;
        if (c3683y3.f()) {
            return;
        }
        c3683y3.g(i, f);
    }
}
