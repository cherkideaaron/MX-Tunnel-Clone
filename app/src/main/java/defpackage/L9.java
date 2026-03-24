package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;

/* loaded from: classes.dex */
public final class L9 extends GG {
    public final /* synthetic */ int J;

    @Override // defpackage.GG
    public final void h(Canvas canvas) {
        for (int i = 0; i < j(); i++) {
            BG bgI = i(i);
            int iSave = canvas.save();
            canvas.rotate((i * 360) / j(), getBounds().centerX(), getBounds().centerY());
            bgI.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // defpackage.GG
    public final BG[] l() {
        switch (this.J) {
            case 0:
                C3635x9[] c3635x9Arr = new C3635x9[12];
                for (int i = 0; i < 12; i++) {
                    C3635x9 c3635x9 = new C3635x9(1, false);
                    c3635x9.g(0.0f);
                    c3635x9Arr[i] = c3635x9;
                    c3635x9.f = Build.VERSION.SDK_INT >= 24 ? i * 100 : (i * 100) - 1200;
                }
                return c3635x9Arr;
            default:
                C3635x9[] c3635x9Arr2 = new C3635x9[12];
                for (int i2 = 0; i2 < 12; i2++) {
                    C3635x9 c3635x92 = new C3635x9(3, false);
                    c3635x92.setAlpha(0);
                    c3635x9Arr2[i2] = c3635x92;
                    c3635x92.f = Build.VERSION.SDK_INT >= 24 ? i2 * 100 : (i2 * 100) - 1200;
                }
                return c3635x9Arr2;
        }
    }

    @Override // defpackage.GG, defpackage.BG, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rectA = BG.a(rect);
        int iWidth = (int) (((rectA.width() * 3.141592653589793d) / 3.5999999046325684d) / j());
        int iCenterX = rectA.centerX() - iWidth;
        int iCenterX2 = rectA.centerX() + iWidth;
        for (int i = 0; i < j(); i++) {
            BG bgI = i(i);
            int i2 = rectA.top;
            bgI.f(iCenterX, i2, iCenterX2, (iWidth * 2) + i2);
        }
    }
}
