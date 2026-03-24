package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* renamed from: ti, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3445ti extends AbstractC0500aq {
    public final TextView k;
    public final C3174oi l;
    public boolean m = true;

    public C3445ti(TextView textView) {
        this.k = textView;
        this.l = new C3174oi(textView);
    }

    @Override // defpackage.AbstractC0500aq
    public final InputFilter[] G(InputFilter[] inputFilterArr) {
        if (!this.m) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C3174oi) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            C3174oi c3174oi = this.l;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c3174oi;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c3174oi) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.AbstractC0500aq
    public final boolean O() {
        return this.m;
    }

    @Override // defpackage.AbstractC0500aq
    public final void X(boolean z) {
        if (z) {
            TextView textView = this.k;
            textView.setTransformationMethod(e0(textView.getTransformationMethod()));
        }
    }

    @Override // defpackage.AbstractC0500aq
    public final void Y(boolean z) {
        this.m = z;
        TextView textView = this.k;
        textView.setTransformationMethod(e0(textView.getTransformationMethod()));
        textView.setFilters(G(textView.getFilters()));
    }

    @Override // defpackage.AbstractC0500aq
    public final TransformationMethod e0(TransformationMethod transformationMethod) {
        return this.m ? ((transformationMethod instanceof C3661xi) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C3661xi(transformationMethod) : transformationMethod instanceof C3661xi ? ((C3661xi) transformationMethod).a : transformationMethod;
    }
}
