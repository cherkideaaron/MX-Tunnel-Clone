package defpackage;

import android.animation.ValueAnimator;

/* renamed from: x9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3635x9 extends M9 {
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3635x9(int i) {
        super(0);
        this.L = i;
        switch (i) {
            case 2:
                super(0);
                setAlpha(153);
                g(0.0f);
                break;
            case 3:
            case 5:
            default:
                g(0.0f);
                break;
            case 4:
                super(0);
                g(0.0f);
                break;
            case 6:
                super(0);
                g(0.0f);
                break;
        }
    }

    @Override // defpackage.BG
    public final ValueAnimator d() {
        AG ag = BG.G;
        C3750zG c3750zG = BG.F;
        switch (this.L) {
            case 0:
                Float fValueOf = Float.valueOf(0.0f);
                float[] fArr = {0.0f, 0.5f, 1.0f};
                FG fg = new FG(this);
                fg.c(fArr, c3750zG, new Float[]{fValueOf, Float.valueOf(1.0f), fValueOf});
                fg.c = 2000L;
                fg.b(fArr);
                return fg.a();
            case 1:
                Float fValueOf2 = Float.valueOf(0.0f);
                float[] fArr2 = {0.0f, 0.5f, 1.0f};
                FG fg2 = new FG(this);
                fg2.c(fArr2, c3750zG, new Float[]{fValueOf2, Float.valueOf(1.0f), fValueOf2});
                fg2.c = 1200L;
                fg2.b(fArr2);
                return fg2.a();
            case 2:
                Float fValueOf3 = Float.valueOf(0.0f);
                float[] fArr3 = {0.0f, 0.5f, 1.0f};
                FG fg3 = new FG(this);
                fg3.c(fArr3, c3750zG, new Float[]{fValueOf3, Float.valueOf(1.0f), fValueOf3});
                fg3.c = 2000L;
                fg3.b(fArr3);
                return fg3.a();
            case 3:
                float[] fArr4 = {0.0f, 0.39f, 0.4f, 1.0f};
                FG fg4 = new FG(this);
                fg4.d(fArr4, ag, new Integer[]{0, 0, 255, 0});
                fg4.c = 1200L;
                fg4.b(fArr4);
                return fg4.a();
            case 4:
                float[] fArr5 = {0.0f, 1.0f};
                FG fg5 = new FG(this);
                fg5.c(fArr5, c3750zG, new Float[]{Float.valueOf(0.0f), Float.valueOf(1.0f)});
                fg5.d(fArr5, ag, new Integer[]{255, 0});
                fg5.c = 1000L;
                fg5.b(fArr5);
                return fg5.a();
            case 5:
                float[] fArr6 = {0.0f, 0.5f, 1.0f};
                FG fg6 = new FG(this);
                fg6.d(fArr6, BG.z, new Integer[]{0, -180, -180});
                fg6.d(fArr6, BG.B, new Integer[]{0, 0, -180});
                fg6.c = 1200L;
                fg6.b(fArr6);
                return fg6.a();
            default:
                Float fValueOf4 = Float.valueOf(0.0f);
                float[] fArr7 = {0.0f, 0.4f, 0.8f, 1.0f};
                FG fg7 = new FG(this);
                fg7.c(fArr7, c3750zG, new Float[]{fValueOf4, Float.valueOf(1.0f), fValueOf4, fValueOf4});
                fg7.c = 1400L;
                fg7.b(fArr7);
                return fg7.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3635x9(int i, boolean z) {
        super(0);
        this.L = i;
    }
}
