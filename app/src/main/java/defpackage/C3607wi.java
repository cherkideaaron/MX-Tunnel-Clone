package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: wi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3607wi implements TextWatcher {
    public final EditText a;
    public C3553vi c;
    public final boolean b = false;
    public boolean d = true;

    public C3607wi(EditText editText) {
        this.a = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C2626ei c2626eiA = C2626ei.a();
            if (editableText == null) {
                length = 0;
            } else {
                c2626eiA.getClass();
                length = editableText.length();
            }
            c2626eiA.f(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.a;
        if (editText.isInEditMode() || !this.d) {
            return;
        }
        if ((this.b || C2626ei.k != null) && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iB = C2626ei.a().b();
            if (iB != 0) {
                if (iB == 1) {
                    C2626ei.a().f((Spannable) charSequence, i, i3 + i);
                    return;
                } else if (iB != 3) {
                    return;
                }
            }
            C2626ei c2626eiA = C2626ei.a();
            if (this.c == null) {
                this.c = new C3553vi(editText);
            }
            c2626eiA.g(this.c);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
