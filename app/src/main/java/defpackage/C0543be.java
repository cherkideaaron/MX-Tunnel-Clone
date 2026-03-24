package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.animation.LinearInterpolator;

/* renamed from: be, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543be extends M9 {
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0543be(int i) {
        super(1);
        this.L = i;
    }

    @Override // defpackage.BG
    public final ValueAnimator d() {
        AG ag = BG.B;
        AG ag2 = BG.z;
        switch (this.L) {
            case 0:
                Float fValueOf = Float.valueOf(1.0f);
                float[] fArr = {0.0f, 0.35f, 0.7f, 1.0f};
                FG fg = new FG(this);
                fg.c(fArr, BG.F, new Float[]{fValueOf, Float.valueOf(0.0f), fValueOf, fValueOf});
                fg.c = 1300L;
                fg.b(fArr);
                return fg.a();
            case 1:
                float[] fArr2 = {0.0f, 0.1f, 0.25f, 0.75f, 0.9f, 1.0f};
                FG fg2 = new FG(this);
                fg2.d(fArr2, BG.G, new Integer[]{0, 0, 255, 255, 0, 0});
                fg2.d(fArr2, ag2, new Integer[]{-180, -180, 0, 0, 0, 0});
                fg2.d(fArr2, ag, new Integer[]{0, 0, 0, 0, 180, 180});
                fg2.c = 2400L;
                fg2.b = new LinearInterpolator();
                return fg2.a();
            case 2:
                float[] fArr3 = {0.0f, 0.5f, 1.0f};
                FG fg3 = new FG(this);
                fg3.d(fArr3, ag2, new Integer[]{0, -180, -180});
                fg3.d(fArr3, ag, new Integer[]{0, 0, -180});
                fg3.c = 1200L;
                fg3.b(fArr3);
                return fg3.a();
            default:
                Float fValueOf2 = Float.valueOf(0.4f);
                float[] fArr4 = {0.0f, 0.2f, 0.4f, 1.0f};
                FG fg4 = new FG(this);
                fg4.c(fArr4, BG.E, new Float[]{fValueOf2, Float.valueOf(1.0f), fValueOf2, fValueOf2});
                fg4.c = 1200L;
                fg4.b(fArr4);
                return fg4.a();
        }
    }

    @Override // defpackage.BG, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        switch (this.L) {
            case 2:
                Rect rectA = BG.a(rect);
                f(rectA.left, rectA.top, rectA.right, rectA.bottom);
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }
}
