package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* renamed from: ui, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3499ui extends AbstractC0500aq {
    public final C3445ti k;

    public C3499ui(TextView textView) {
        this.k = new C3445ti(textView);
    }

    @Override // defpackage.AbstractC0500aq
    public final InputFilter[] G(InputFilter[] inputFilterArr) {
        return (C2626ei.k != null) ^ true ? inputFilterArr : this.k.G(inputFilterArr);
    }

    @Override // defpackage.AbstractC0500aq
    public final boolean O() {
        return this.k.m;
    }

    @Override // defpackage.AbstractC0500aq
    public final void X(boolean z) {
        if (!(C2626ei.k != null)) {
            return;
        }
        this.k.X(z);
    }

    @Override // defpackage.AbstractC0500aq
    public final void Y(boolean z) {
        boolean z2 = !(C2626ei.k != null);
        C3445ti c3445ti = this.k;
        if (z2) {
            c3445ti.m = z;
        } else {
            c3445ti.Y(z);
        }
    }

    @Override // defpackage.AbstractC0500aq
    public final TransformationMethod e0(TransformationMethod transformationMethod) {
        return (C2626ei.k != null) ^ true ? transformationMethod : this.k.e0(transformationMethod);
    }
}
