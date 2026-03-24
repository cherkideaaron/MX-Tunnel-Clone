package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public final class HA extends AbstractC3479uF {
    public HA() {
        g(0.0f);
    }

    @Override // defpackage.BG
    public final ValueAnimator d() {
        Float fValueOf = Float.valueOf(1.0f);
        float[] fArr = {0.0f, 0.7f, 1.0f};
        FG fg = new FG(this);
        fg.c(fArr, BG.F, new Float[]{Float.valueOf(0.0f), fValueOf, fValueOf});
        fg.d(fArr, BG.G, new Integer[]{255, 178, 0});
        fg.c = 1000L;
        InterpolatorC3183or interpolatorC3183or = new InterpolatorC3183or(new PathInterpolator(0.21f, 0.53f, 0.56f, 0.8f), new float[0]);
        interpolatorC3183or.b = fArr;
        fg.b = interpolatorC3183or;
        return fg.a();
    }

    @Override // defpackage.AbstractC3479uF
    public final void h(Canvas canvas, Paint paint) {
        if (this.v != null) {
            paint.setStyle(Paint.Style.STROKE);
            int iMin = Math.min(this.v.width(), this.v.height()) / 2;
            paint.setStrokeWidth(iMin / 12);
            canvas.drawCircle(this.v.centerX(), this.v.centerY(), iMin, paint);
        }
    }
}
