package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.mxtunnel.pro.R;

/* loaded from: classes.dex */
public class K2 extends EditText implements InterfaceC3134nx, InterfaceC2774hJ {
    public final C2702g2 a;
    public final C3196p3 b;
    public final R2 c;
    public final NI d;
    public final R2 e;
    public J2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC2555dJ.a(context);
        PI.a(this, getContext());
        C2702g2 c2702g2 = new C2702g2(this);
        this.a = c2702g2;
        c2702g2.t(attributeSet, R.attr.editTextStyle);
        C3196p3 c3196p3 = new C3196p3(this);
        this.b = c3196p3;
        c3196p3.f(attributeSet, R.attr.editTextStyle);
        c3196p3.b();
        R2 r2 = new R2(9, false);
        r2.b = this;
        this.c = r2;
        this.d = new NI();
        R2 r22 = new R2((EditText) this, 8);
        this.e = r22;
        r22.u(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerQ = r22.q(keyListener);
            if (keyListenerQ == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerQ);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    private J2 getSuperCaller() {
        if (this.f == null) {
            this.f = new J2(this);
        }
        return this.f;
    }

    @Override // defpackage.InterfaceC3134nx
    public final C3113nc a(C3113nc c3113nc) {
        this.d.getClass();
        return NI.a(this, c3113nc);
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        R2 r2;
        if (Build.VERSION.SDK_INT >= 28 || (r2 = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) r2.c;
        return textClassifier == null ? AbstractC2813i3.a((TextView) r2.b) : textClassifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[PHI: r1
      0x0057: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:30:0x006a, B:22:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            p3 r1 = r7.b
            r1.getClass()
            defpackage.C3196p3.h(r7, r0, r8)
            defpackage.AbstractC0069Df.J(r0, r8, r7)
            if (r0 == 0) goto L77
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L77
            java.lang.String[] r2 = defpackage.UL.f(r7)
            if (r2 == 0) goto L77
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            defpackage.AbstractC0377Vh.a(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            Qa r2 = new Qa
            r6 = 7
            r2.<init>(r7, r6)
            if (r1 < r5) goto L4d
            Ap r1 = new Ap
            r1.<init>(r0, r2)
        L4b:
            r0 = r1
            goto L77
        L4d:
            java.lang.String[] r6 = defpackage.AbstractC2883jK.b
            if (r1 < r5) goto L59
            java.lang.String[] r1 = defpackage.AbstractC0377Vh.b(r8)
            if (r1 == 0) goto L6d
        L57:
            r6 = r1
            goto L6d
        L59:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5e
            goto L6d
        L5e:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L6a
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L6a:
            if (r1 == 0) goto L6d
            goto L57
        L6d:
            int r1 = r6.length
            if (r1 != 0) goto L71
            goto L77
        L71:
            Bp r1 = new Bp
            r1.<init>(r0, r2)
            goto L4b
        L77:
            R2 r1 = r7.e
            mi r8 = r1.v(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.K2.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean zA = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && UL.f(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = U2.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC2948kc c0607co;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || UL.f(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                c0607co = new C0607co(primaryClip, 1);
            } else {
                C3003lc c3003lc = new C3003lc();
                c3003lc.b = primaryClip;
                c3003lc.c = 1;
                c0607co = c3003lc;
            }
            c0607co.k(i == 16908322 ? 0 : 1);
            UL.h(this, c0607co.build());
        }
        return true;
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
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC3296qu.X(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.e.D(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.q(keyListener));
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
    public void setTextClassifier(TextClassifier textClassifier) {
        R2 r2;
        if (Build.VERSION.SDK_INT >= 28 || (r2 = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            r2.c = textClassifier;
        }
    }
}
