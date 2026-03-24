package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: tM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3432tM {
    public static void a(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    public static void b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void c(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
