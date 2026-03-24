package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.mxtunnel.pro.R;

/* renamed from: k2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2920k2 extends CheckedTextView implements InterfaceC2774hJ {
    public final C2975l2 a;
    public final C2702g2 b;
    public final C3196p3 c;
    public L2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2920k2(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        AbstractC2555dJ.a(context);
        PI.a(this, getContext());
        C3196p3 c3196p3 = new C3196p3(this);
        this.c = c3196p3;
        c3196p3.f(attributeSet, R.attr.checkedTextViewStyle);
        c3196p3.b();
        C2702g2 c2702g2 = new C2702g2(this);
        this.b = c2702g2;
        c2702g2.t(attributeSet, R.attr.checkedTextViewStyle);
        this.a = new C2975l2(this);
        Context context2 = getContext();
        int[] iArr = AbstractC2547dB.l;
        D3 d3L = D3.L(R.attr.checkedTextViewStyle, 0, context2, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) d3L.b;
        UL.k(this, getContext(), iArr, attributeSet, (TypedArray) d3L.b, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC0500aq.F(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC0500aq.F(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(d3L.w(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(AbstractC3228ph.c(typedArray.getInt(3, -1), null));
            }
            d3L.P();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            d3L.P();
            throw th;
        }
    }

    private L2 getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new L2(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3196p3 c3196p3 = this.c;
        if (c3196p3 != null) {
            c3196p3.b();
        }
        C2702g2 c2702g2 = this.b;
        if (c2702g2 != null) {
            c2702g2.a();
        }
        C2975l2 c2975l2 = this.a;
        if (c2975l2 != null) {
            c2975l2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC3296qu.W(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        C2975l2 c2975l2 = this.a;
        if (c2975l2 != null) {
            return c2975l2.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0069Df.J(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC0500aq.F(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3196p3 c3196p3 = this.c;
        if (c3196p3 != null) {
            c3196p3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3196p3 c3196p3 = this.c;
        if (c3196p3 != null) {
            c3196p3.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC3296qu.X(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C2975l2 c2975l2 = this.a;
        if (c2975l2 != null) {
            c2975l2.a = colorStateList;
            c2975l2.c = true;
            c2975l2.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C2975l2 c2975l2 = this.a;
        if (c2975l2 != null) {
            c2975l2.b = mode;
            c2975l2.d = true;
            c2975l2.b();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3196p3 c3196p3 = this.c;
        if (c3196p3 != null) {
            c3196p3.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C2975l2 c2975l2 = this.a;
        if (c2975l2 != null) {
            if (c2975l2.e) {
                c2975l2.e = false;
            } else {
                c2975l2.e = true;
                c2975l2.b();
            }
        }
    }
}
