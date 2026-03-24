package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;

/* loaded from: classes.dex */
public final class P2 extends MultiAutoCompleteTextView implements InterfaceC2774hJ {
    public static final int[] d = {R.attr.popupBackground};
    public final C2702g2 a;
    public final C3196p3 b;
    public final R2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.mxtunnel.pro.R.attr.autoCompleteTextViewStyle);
        AbstractC2555dJ.a(context);
        PI.a(this, getContext());
        D3 d3L = D3.L(com.mxtunnel.pro.R.attr.autoCompleteTextViewStyle, 0, getContext(), attributeSet, d);
        if (((TypedArray) d3L.b).hasValue(0)) {
            setDropDownBackgroundDrawable(d3L.x(0));
        }
        d3L.P();
        C2702g2 c2702g2 = new C2702g2(this);
        this.a = c2702g2;
        c2702g2.t(attributeSet, com.mxtunnel.pro.R.attr.autoCompleteTextViewStyle);
        C3196p3 c3196p3 = new C3196p3(this);
        this.b = c3196p3;
        c3196p3.f(attributeSet, com.mxtunnel.pro.R.attr.autoCompleteTextViewStyle);
        c3196p3.b();
        R2 r2 = new R2((EditText) this, 8);
        this.c = r2;
        r2.u(attributeSet, com.mxtunnel.pro.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = isFocusable();
            boolean zIsClickable = isClickable();
            boolean zIsLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener keyListenerQ = r2.q(keyListener);
            if (keyListenerQ == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerQ);
            setRawInputType(inputType);
            setFocusable(zIsFocusable);
            setClickable(zIsClickable);
            setLongClickable(zIsLongClickable);
        }
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0069Df.J(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.c.v(inputConnectionOnCreateInputConnection, editorInfo);
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
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3196p3 c3196p3 = this.b;
        if (c3196p3 != null) {
            c3196p3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3196p3 c3196p3 = this.b;
        if (c3196p3 != null) {
            c3196p3.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC0500aq.F(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c.D(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.q(keyListener));
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
}
