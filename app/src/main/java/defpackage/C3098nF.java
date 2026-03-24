package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* renamed from: nF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3098nF extends AbstractC3371sF {
    public final C3208pF c;

    public C3098nF(C3208pF c3208pF) {
        this.c = c3208pF;
    }

    @Override // defpackage.AbstractC3371sF
    public final void a(Matrix matrix, C2770hF c2770hF, int i, Canvas canvas) {
        C3208pF c3208pF = this.c;
        float f = c3208pF.f;
        float f2 = c3208pF.g;
        RectF rectF = new RectF(c3208pF.b, c3208pF.c, c3208pF.d, c3208pF.e);
        c2770hF.getClass();
        boolean z = f2 < 0.0f;
        Path path = (Path) c2770hF.h;
        int[] iArr = C2770hF.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c2770hF.c;
            iArr[2] = c2770hF.b;
            iArr[3] = c2770hF.a;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c2770hF.a;
            iArr[2] = c2770hF.b;
            iArr[3] = c2770hF.c;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / fWidth);
        float[] fArr = C2770hF.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = (Paint) c2770hF.e;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, (Paint) c2770hF.g);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
