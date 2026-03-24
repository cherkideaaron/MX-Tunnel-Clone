package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes.dex */
public abstract class M9 extends AbstractC3479uF {
    public final /* synthetic */ int K;

    @Override // defpackage.AbstractC3479uF
    public final void h(Canvas canvas, Paint paint) {
        switch (this.K) {
            case 0:
                if (this.v != null) {
                    canvas.drawCircle(this.v.centerX(), this.v.centerY(), Math.min(r0.width(), this.v.height()) / 2, paint);
                    break;
                }
                break;
            default:
                Rect rect = this.v;
                if (rect != null) {
                    canvas.drawRect(rect, paint);
                    break;
                }
                break;
        }
    }
}
