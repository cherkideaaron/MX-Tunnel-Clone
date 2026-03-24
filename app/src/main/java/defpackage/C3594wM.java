package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* renamed from: wM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3594wM extends MO {
    public static boolean w = true;
    public static boolean x = true;
    public static boolean y = true;
    public static boolean z = true;

    @Override // defpackage.MO
    public void K(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.K(view, i);
        } else if (z) {
            try {
                AbstractC3540vM.a(view, i);
            } catch (NoSuchMethodError unused) {
                z = false;
            }
        }
    }

    public void R(View view, int i, int i2, int i3, int i4) {
        if (y) {
            try {
                AbstractC3486uM.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                y = false;
            }
        }
    }

    public void S(View view, Matrix matrix) {
        if (w) {
            try {
                AbstractC3432tM.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                w = false;
            }
        }
    }

    public void T(View view, Matrix matrix) {
        if (x) {
            try {
                AbstractC3432tM.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                x = false;
            }
        }
    }
}
