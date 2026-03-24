package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;

/* loaded from: classes.dex */
public abstract class GG extends BG {
    public final BG[] H;
    public int I;

    public GG() {
        BG[] bgArrL = l();
        this.H = bgArrL;
        for (BG bg : bgArrL) {
            bg.setCallback(this);
        }
        k(this.H);
    }

    @Override // defpackage.BG
    public final int c() {
        return this.I;
    }

    @Override // defpackage.BG
    public ValueAnimator d() {
        return null;
    }

    @Override // defpackage.BG, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        h(canvas);
    }

    @Override // defpackage.BG
    public final void e(int i) {
        this.I = i;
        for (int i2 = 0; i2 < j(); i2++) {
            i(i2).e(i);
        }
    }

    public void h(Canvas canvas) {
        BG[] bgArr = this.H;
        if (bgArr != null) {
            for (BG bg : bgArr) {
                int iSave = canvas.save();
                bg.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
    }

    public final BG i(int i) {
        BG[] bgArr = this.H;
        if (bgArr == null) {
            return null;
        }
        return bgArr[i];
    }

    @Override // defpackage.BG, android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return AbstractC0115Ga.H(this.H) || super.isRunning();
    }

    public final int j() {
        BG[] bgArr = this.H;
        if (bgArr == null) {
            return 0;
        }
        return bgArr.length;
    }

    public abstract BG[] l();

    @Override // defpackage.BG, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        for (BG bg : this.H) {
            bg.setBounds(rect);
        }
    }

    @Override // defpackage.BG, android.graphics.drawable.Animatable
    public final void start() {
        super.start();
        for (BG bg : this.H) {
            bg.start();
        }
    }

    @Override // defpackage.BG, android.graphics.drawable.Animatable
    public final void stop() {
        super.stop();
        for (BG bg : this.H) {
            bg.stop();
        }
    }

    @Override // defpackage.BG
    public final void b(Canvas canvas) {
    }

    public void k(BG... bgArr) {
    }
}
