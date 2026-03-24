package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: Ni, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0242Ni {
    public final /* synthetic */ C0259Oi a;

    public C0242Ni(C0259Oi c0259Oi) {
        this.a = c0259Oi;
    }

    public final void a(TextInputLayout textInputLayout) {
        C0259Oi c0259Oi = this.a;
        if (c0259Oi.y == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c0259Oi.y;
        C0225Mi c0225Mi = c0259Oi.B;
        if (editText != null) {
            editText.removeTextChangedListener(c0225Mi);
            if (c0259Oi.y.getOnFocusChangeListener() == c0259Oi.b().e()) {
                c0259Oi.y.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c0259Oi.y = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c0225Mi);
        }
        c0259Oi.b().m(c0259Oi.y);
        c0259Oi.j(c0259Oi.b());
    }
}
