package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: iL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2831iL {
    public static DisplayMetrics a = null;
    public static int b = 50;
    public static int c = 8000;
    public static final Rect d;
    public static final Paint.FontMetrics e;
    public static final Rect f;
    public static final C2827iH g;
    public static final Rect h;
    public static final Paint.FontMetrics i;

    static {
        Double.longBitsToDouble(Double.doubleToLongBits(1.0d) + 1);
        Float.intBitsToFloat(Float.floatToIntBits(1.0f) + 1);
        d = new Rect();
        e = new Paint.FontMetrics();
        f = new Rect();
        g = new C2827iH(1);
        h = new Rect();
        i = new Paint.FontMetrics();
    }

    public static int a(Paint paint, String str) {
        Rect rect = d;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static C3770zj b(Paint paint, String str) {
        C3770zj c3770zj = (C3770zj) C3770zj.d.b();
        c3770zj.b = 0.0f;
        c3770zj.c = 0.0f;
        Rect rect = f;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        c3770zj.b = rect.width();
        c3770zj.c = rect.height();
        return c3770zj;
    }

    public static float c(float f2) {
        if (a != null) {
            return (r0.densityDpi / 160.0f) * f2;
        }
        Log.e("MPChartLib-Utils", "Utils NOT INITIALIZED. You need to call Utils.init(...) at least once before calling Utils.convertDpToPixel(...). Otherwise conversion does not take place.");
        return f2;
    }

    public static float d(double d2) {
        if (Double.isInfinite(d2) || Double.isNaN(d2) || d2 == 0.0d) {
            return 0.0f;
        }
        return Math.round(d2 * r0) / ((float) Math.pow(10.0d, 1 - ((int) Math.ceil((float) Math.log10(d2 < 0.0d ? -d2 : d2)))));
    }
}
