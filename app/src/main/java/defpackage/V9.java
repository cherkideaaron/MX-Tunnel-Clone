package defpackage;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes2.dex */
public final /* synthetic */ class V9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ V9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText;
        PasswordTransformationMethod passwordTransformationMethod;
        switch (this.a) {
            case 0:
                Z9 z9 = (Z9) this.b;
                EditText editText2 = z9.i;
                if (editText2 == null) {
                    return;
                }
                Editable text = editText2.getText();
                if (text != null) {
                    text.clear();
                }
                z9.q();
                return;
            case 1:
                ((C0122Gh) this.b).u();
                return;
            case 2:
                ((C0504au) this.b).g();
                throw null;
            default:
                Ny ny = (Ny) this.b;
                EditText editText3 = ny.f;
                if (editText3 == null) {
                    return;
                }
                int selectionEnd = editText3.getSelectionEnd();
                EditText editText4 = ny.f;
                if (editText4 == null || !(editText4.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    editText = ny.f;
                    passwordTransformationMethod = PasswordTransformationMethod.getInstance();
                } else {
                    editText = ny.f;
                    passwordTransformationMethod = null;
                }
                editText.setTransformationMethod(passwordTransformationMethod);
                if (selectionEnd >= 0) {
                    ny.f.setSelection(selectionEnd);
                }
                ny.q();
                return;
        }
    }
}
