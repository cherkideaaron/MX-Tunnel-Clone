package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class JI extends M {
    public final TextInputLayout d;

    public JI(TextInputLayout textInputLayout) {
        this.d = textInputLayout;
    }

    @Override // defpackage.M
    public final void d(View view, Z z) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = z.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean z2 = !zIsEmpty;
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(hint);
        boolean z5 = !textInputLayout.B0;
        boolean z6 = !TextUtils.isEmpty(error);
        if (!z6 && TextUtils.isEmpty(counterOverflowDescription)) {
            z3 = false;
        }
        String string = z4 ? hint.toString() : "";
        SG sg = textInputLayout.b;
        View view2 = sg.b;
        if (view2.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(view2);
        } else {
            view2 = sg.d;
        }
        accessibilityNodeInfo.setTraversalAfter(view2);
        if (z2) {
            z.k(text);
        } else if (!TextUtils.isEmpty(string)) {
            z.k(string);
            if (z5 && placeholderText != null) {
                placeholderText = string + ", " + ((Object) placeholderText);
                z.k(placeholderText);
            }
        } else if (placeholderText != null) {
            z.k(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i = Build.VERSION.SDK_INT;
            if (i < 26) {
                if (z2) {
                    string = ((Object) text) + ", " + string;
                }
                z.k(string);
            } else if (i >= 26) {
                accessibilityNodeInfo.setHintText(string);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", string);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            } else {
                z.h(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z3) {
            if (!z6) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C3413t3 c3413t3 = textInputLayout.q.y;
        if (c3413t3 != null) {
            accessibilityNodeInfo.setLabelFor(c3413t3);
        }
        textInputLayout.c.b().n(z);
    }

    @Override // defpackage.M
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.d.c.b().o(accessibilityEvent);
    }
}
