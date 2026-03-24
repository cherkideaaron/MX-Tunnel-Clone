package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public final class NM extends M9 {
    public final int L;

    public NM(int i) {
        super(1);
        this.L = i;
    }

    @Override // defpackage.BG
    public final ValueAnimator d() {
        float[] fArr = {0.0f, 0.25f, 0.5f, 0.51f, 0.75f, 1.0f};
        FG fg = new FG(this);
        int i = 0;
        fg.d(fArr, BG.A, new Integer[]{0, -90, -179, -180, -270, -360});
        fg.c(fArr, BG.C, new Float[]{Float.valueOf(0.0f), Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.0f), Float.valueOf(0.0f)});
        fg.c(fArr, BG.D, new Float[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.75f), Float.valueOf(0.0f)});
        fg.c(fArr, BG.F, new Float[]{Float.valueOf(1.0f), Float.valueOf(0.5f), Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(0.5f), Float.valueOf(1.0f)});
        fg.c = 1800L;
        fg.b(fArr);
        if (Build.VERSION.SDK_INT >= 24) {
            int i2 = this.L;
            if (i2 < 0) {
                Log.w("SpriteAnimatorBuilder", "startFrame should always be non-negative");
            } else {
                i = i2;
            }
            fg.d = i;
        }
        return fg.a();
    }
}
