package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: ve, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3549ve extends C2638eu {
    public static final /* synthetic */ int O = 0;
    public C3495ue N;

    @Override // defpackage.C2638eu
    public final void g(Canvas canvas) {
        if (this.N.w.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.N.w);
        } else {
            canvas.clipRect(this.N.w, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }

    @Override // defpackage.C2638eu, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.N = new C3495ue(this.N);
        return this;
    }

    public final void u(float f, float f2, float f3, float f4) {
        RectF rectF = this.N.w;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
