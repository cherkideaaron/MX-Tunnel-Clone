package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* renamed from: uF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3479uF extends BG {
    public final Paint H;
    public int I;
    public int J;

    public AbstractC3479uF() {
        e(-1);
        Paint paint = new Paint();
        this.H = paint;
        paint.setAntiAlias(true);
        paint.setColor(this.I);
    }

    @Override // defpackage.BG
    public final void b(Canvas canvas) {
        Paint paint = this.H;
        paint.setColor(this.I);
        h(canvas, paint);
    }

    @Override // defpackage.BG
    public final int c() {
        return this.J;
    }

    @Override // defpackage.BG
    public final void e(int i) {
        this.J = i;
        i();
    }

    public abstract void h(Canvas canvas, Paint paint);

    public final void i() {
        int i = this.u;
        int i2 = this.J;
        this.I = ((((i2 >>> 24) * (i + (i >> 7))) >> 8) << 24) | ((i2 << 8) >>> 8);
    }

    @Override // defpackage.BG, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.u = i;
        i();
    }

    @Override // defpackage.BG, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.H.setColorFilter(colorFilter);
    }
}
