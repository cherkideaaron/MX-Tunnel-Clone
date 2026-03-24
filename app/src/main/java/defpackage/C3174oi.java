package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* renamed from: oi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3174oi implements InputFilter {
    public final TextView a;
    public C3119ni b;

    public C3174oi(TextView textView) {
        this.a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = C2626ei.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C2626ei.a().f(charSequence, 0, charSequence.length());
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        C2626ei c2626eiA = C2626ei.a();
        if (this.b == null) {
            this.b = new C3119ni(textView, this);
        }
        c2626eiA.g(this.b);
        return charSequence;
    }
}
