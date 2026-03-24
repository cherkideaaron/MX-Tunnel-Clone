package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.animation.LinearInterpolator;

/* renamed from: y9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3689y9 extends GG {
    public final /* synthetic */ int J;

    @Override // defpackage.GG, defpackage.BG
    public ValueAnimator d() {
        switch (this.J) {
            case 0:
                FG fg = new FG(this);
                fg.d(new float[]{0.0f, 1.0f}, BG.A, new Integer[]{0, 360});
                fg.c = 2000L;
                fg.b = new LinearInterpolator();
                return fg.a();
            default:
                return super.d();
        }
    }

    @Override // defpackage.GG
    public void h(Canvas canvas) {
        switch (this.J) {
            case 3:
                Rect rectA = BG.a(getBounds());
                for (int i = 0; i < j(); i++) {
                    int iSave = canvas.save();
                    canvas.rotate((i * 90) + 45, rectA.centerX(), rectA.centerY());
                    i(i).draw(canvas);
                    canvas.restoreToCount(iSave);
                }
                break;
            default:
                super.h(canvas);
                break;
        }
    }

    @Override // defpackage.GG
    public void k(BG... bgArr) {
        BG bg;
        int i;
        BG bg2;
        int i2;
        switch (this.J) {
            case 0:
                if (Build.VERSION.SDK_INT >= 24) {
                    bg = bgArr[1];
                    i = 1000;
                } else {
                    bg = bgArr[1];
                    i = -1000;
                }
                bg.f = i;
                break;
            case 2:
                if (Build.VERSION.SDK_INT >= 24) {
                    bg2 = bgArr[1];
                    i2 = 1000;
                } else {
                    bg2 = bgArr[1];
                    i2 = -1000;
                }
                bg2.f = i2;
                break;
            case 4:
                int i3 = 0;
                while (i3 < bgArr.length) {
                    BG bg3 = bgArr[i3];
                    i3++;
                    bg3.f = i3 * 200;
                }
                break;
            case 5:
                int i4 = 0;
                while (i4 < bgArr.length) {
                    BG bg4 = bgArr[i4];
                    i4++;
                    bg4.f = i4 * 200;
                }
                break;
            case 6:
                bgArr[1].f = 160;
                bgArr[2].f = 320;
                break;
            case 7:
                if (Build.VERSION.SDK_INT < 24) {
                    bgArr[1].f = -900;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.GG
    public final BG[] l() {
        switch (this.J) {
            case 0:
                return new BG[]{new C3635x9(0), new C3635x9(0)};
            case 1:
                int[] iArr = {200, 300, 400, 100, 200, 300, 0, 100, 200};
                C0543be[] c0543beArr = new C0543be[9];
                for (int i = 0; i < 9; i++) {
                    C0543be c0543be = new C0543be(0);
                    c0543beArr[i] = c0543be;
                    c0543be.f = iArr[i];
                }
                return c0543beArr;
            case 2:
                return new BG[]{new C3635x9(2), new C3635x9(2)};
            case 3:
                C0543be[] c0543beArr2 = new C0543be[4];
                for (int i2 = 0; i2 < 4; i2++) {
                    C0543be c0543be2 = new C0543be(1);
                    c0543be2.setAlpha(0);
                    c0543be2.m = -180;
                    c0543beArr2[i2] = c0543be2;
                    c0543be2.f = Build.VERSION.SDK_INT >= 24 ? i2 * 300 : (i2 * 300) - 1200;
                }
                return c0543beArr2;
            case 4:
                return new BG[]{new C3635x9(4), new C3635x9(4), new C3635x9(4)};
            case 5:
                return new BG[]{new HA(), new HA(), new HA()};
            case 6:
                return new BG[]{new C3635x9(6), new C3635x9(6), new C3635x9(6)};
            case 7:
                return new BG[]{new NM(0), new NM(3)};
            default:
                C0543be[] c0543beArr3 = new C0543be[5];
                for (int i3 = 0; i3 < 5; i3++) {
                    C0543be c0543be3 = new C0543be(3);
                    c0543be3.c = 0.4f;
                    c0543beArr3[i3] = c0543be3;
                    c0543be3.f = Build.VERSION.SDK_INT >= 24 ? (i3 * 100) + 600 : (i3 * 100) - 1200;
                }
                return c0543beArr3;
        }
    }

    @Override // defpackage.GG, defpackage.BG, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.J) {
            case 0:
                super.onBoundsChange(rect);
                Rect rectA = BG.a(rect);
                int iWidth = (int) (rectA.width() * 0.6f);
                BG bgI = i(0);
                int i = rectA.right;
                int i2 = rectA.top;
                bgI.f(i - iWidth, i2, i, i2 + iWidth);
                BG bgI2 = i(1);
                int i3 = rectA.right;
                int i4 = rectA.bottom;
                bgI2.f(i3 - iWidth, i4 - iWidth, i3, i4);
                break;
            case 1:
                super.onBoundsChange(rect);
                Rect rectA2 = BG.a(rect);
                int iWidth2 = (int) (rectA2.width() * 0.33f);
                int iHeight = (int) (rectA2.height() * 0.33f);
                for (int i5 = 0; i5 < j(); i5++) {
                    int i6 = ((i5 % 3) * iWidth2) + rectA2.left;
                    int i7 = ((i5 / 3) * iHeight) + rectA2.top;
                    i(i5).f(i6, i7, i6 + iWidth2, i7 + iHeight);
                }
                break;
            case 2:
            case 4:
            case 5:
            default:
                super.onBoundsChange(rect);
                break;
            case 3:
                super.onBoundsChange(rect);
                Rect rectA3 = BG.a(rect);
                int iMin = Math.min(rectA3.width(), rectA3.height()) / 2;
                int i8 = rectA3.left + iMin + 1;
                int i9 = rectA3.top + iMin + 1;
                for (int i10 = 0; i10 < j(); i10++) {
                    BG bgI3 = i(i10);
                    bgI3.f(rectA3.left, rectA3.top, i8, i9);
                    Rect rect2 = bgI3.v;
                    bgI3.d = rect2.right;
                    bgI3.e = rect2.bottom;
                }
                break;
            case 6:
                super.onBoundsChange(rect);
                Rect rectA4 = BG.a(rect);
                int iWidth3 = rectA4.width() / 8;
                int iCenterY = rectA4.centerY() - iWidth3;
                int iCenterY2 = rectA4.centerY() + iWidth3;
                for (int i11 = 0; i11 < j(); i11++) {
                    int iWidth4 = ((rectA4.width() * i11) / 3) + rectA4.left;
                    i(i11).f(iWidth4, iCenterY, (iWidth3 * 2) + iWidth4, iCenterY2);
                }
                break;
            case 7:
                Rect rectA5 = BG.a(rect);
                super.onBoundsChange(rectA5);
                for (int i12 = 0; i12 < j(); i12++) {
                    BG bgI4 = i(i12);
                    int i13 = rectA5.left;
                    bgI4.f(i13, rectA5.top, (rectA5.width() / 4) + i13, (rectA5.height() / 4) + rectA5.top);
                }
                break;
            case 8:
                super.onBoundsChange(rect);
                Rect rectA6 = BG.a(rect);
                int iWidth5 = rectA6.width() / j();
                int iWidth6 = ((rectA6.width() / 5) * 3) / 5;
                for (int i14 = 0; i14 < j(); i14++) {
                    BG bgI5 = i(i14);
                    int i15 = (iWidth5 / 5) + (i14 * iWidth5) + rectA6.left;
                    bgI5.f(i15, rectA6.top, i15 + iWidth6, rectA6.bottom);
                }
                break;
        }
    }
}
