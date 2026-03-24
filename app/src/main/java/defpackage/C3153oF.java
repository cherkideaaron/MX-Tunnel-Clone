package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: oF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3153oF extends AbstractC3371sF {
    public final C3263qF c;
    public final float d;
    public final float e;

    public C3153oF(C3263qF c3263qF, float f, float f2) {
        this.c = c3263qF;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.AbstractC3371sF
    public final void a(Matrix matrix, C2770hF c2770hF, int i, Canvas canvas) {
        C3263qF c3263qF = this.c;
        float f = c3263qF.c;
        float f2 = this.e;
        float f3 = c3263qF.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        c2770hF.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = C2770hF.i;
        iArr[0] = c2770hF.c;
        iArr[1] = c2770hF.b;
        iArr[2] = c2770hF.a;
        Paint paint = (Paint) c2770hF.f;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, C2770hF.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        C3263qF c3263qF = this.c;
        return (float) Math.toDegrees(Math.atan((c3263qF.c - this.e) / (c3263qF.b - this.d)));
    }
}
