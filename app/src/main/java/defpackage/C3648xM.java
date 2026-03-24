package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: xM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3648xM extends C3594wM {
    @Override // defpackage.MO
    public final void J(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.C3594wM, defpackage.MO
    public final void K(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.C3594wM
    public final void R(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.C3594wM
    public final void S(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.C3594wM
    public final void T(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // defpackage.MO
    public final float t(View view) {
        return view.getTransitionAlpha();
    }
}
