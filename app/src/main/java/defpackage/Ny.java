package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.mxtunnel.pro.R;

/* loaded from: classes2.dex */
public final class Ny extends AbstractC0276Pi {
    public final int e;
    public EditText f;
    public final V9 g;

    public Ny(C0259Oi c0259Oi, int i) {
        super(c0259Oi);
        this.e = R.drawable.design_password_eye;
        this.g = new V9(this, 3);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.AbstractC0276Pi
    public final void b() {
        q();
    }

    @Override // defpackage.AbstractC0276Pi
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.AbstractC0276Pi
    public final int d() {
        return this.e;
    }

    @Override // defpackage.AbstractC0276Pi
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.AbstractC0276Pi
    public final boolean k() {
        return true;
    }

    @Override // defpackage.AbstractC0276Pi
    public final boolean l() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.AbstractC0276Pi
    public final void m(EditText editText) {
        this.f = editText;
        q();
    }

    @Override // defpackage.AbstractC0276Pi
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.AbstractC0276Pi
    public final void s() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
