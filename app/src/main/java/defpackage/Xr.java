package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.DisplayMetrics;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Xr extends AbstractC0255Oe {
    public C0463a7 f;
    public Path g;
    public Zr h;
    public Paint i;
    public WeakReference j;
    public Canvas k;
    public Bitmap.Config l;
    public Path m;
    public Path n;
    public float[] o;
    public Path p;
    public HashMap q;
    public float[] r;

    public final void d(Canvas canvas, C0502as c0502as, Path path, C3121nk c3121nk, C0463a7 c0463a7) {
        C3397so c3397so = c0502as.F;
        Zr zr = this.h;
        c3397so.getClass();
        float fI = C3397so.i(zr, c0502as);
        path.lineTo(c0502as.b(c0463a7.a + c0463a7.c).c, fI);
        path.lineTo(c0502as.b(c0463a7.a).c, fI);
        path.close();
        c3121nk.d(path);
        int i = (c0502as.w << 24) | (c0502as.v & 16777215);
        DisplayMetrics displayMetrics = AbstractC2831iL.a;
        int iSave = canvas.save();
        canvas.clipPath(path);
        canvas.drawColor(i);
        canvas.restoreToCount(iSave);
    }
}
