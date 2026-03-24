package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: qF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3263qF extends AbstractC3317rF {
    public float b;
    public float c;

    @Override // defpackage.AbstractC3317rF
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.b, this.c);
        path.transform(matrix);
    }
}
