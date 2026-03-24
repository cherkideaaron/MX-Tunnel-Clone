package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class BG extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, Drawable.Callback {
    public static final C3750zG C;
    public static final C3750zG D;
    public static final C3750zG E;
    public static final C3750zG F;
    public static final AG G;
    public float d;
    public float e;
    public int f;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public float r;
    public float s;
    public ValueAnimator t;
    public static final Rect y = new Rect();
    public static final AG z = new AG("rotateX", 1);
    public static final AG A = new AG("rotate", 2);
    public static final AG B = new AG("rotateY", 3);
    public float a = 1.0f;
    public float b = 1.0f;
    public float c = 1.0f;
    public int u = 255;
    public Rect v = y;
    public final Camera w = new Camera();
    public final Matrix x = new Matrix();

    static {
        new AG("translateX", 4);
        new AG("translateY", 5);
        C = new C3750zG("translateXPercentage", 1);
        D = new C3750zG("translateYPercentage", 2);
        new C3750zG("scaleX", 3);
        E = new C3750zG("scaleY", 4);
        F = new C3750zG("scale", 0);
        G = new AG("alpha", 0);
    }

    public static Rect a(Rect rect) {
        int iMin = Math.min(rect.width(), rect.height());
        int iCenterX = rect.centerX();
        int iCenterY = rect.centerY();
        int i = iMin / 2;
        return new Rect(iCenterX - i, iCenterY - i, iCenterX + i, iCenterY + i);
    }

    public abstract void b(Canvas canvas);

    public abstract int c();

    public abstract ValueAnimator d();

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iWidth = this.o;
        if (iWidth == 0) {
            iWidth = (int) (getBounds().width() * this.r);
        }
        int iHeight = this.p;
        if (iHeight == 0) {
            iHeight = (int) (getBounds().height() * this.s);
        }
        canvas.translate(iWidth, iHeight);
        canvas.scale(this.b, this.c, this.d, this.e);
        canvas.rotate(this.q, this.d, this.e);
        if (this.m != 0 || this.n != 0) {
            Camera camera = this.w;
            camera.save();
            camera.rotateX(this.m);
            camera.rotateY(this.n);
            Matrix matrix = this.x;
            camera.getMatrix(matrix);
            matrix.preTranslate(-this.d, -this.e);
            matrix.postTranslate(this.d, this.e);
            camera.restore();
            canvas.concat(matrix);
        }
        b(canvas);
    }

    public abstract void e(int i);

    public final void f(int i, int i2, int i3, int i4) {
        this.v = new Rect(i, i2, i3, i4);
        this.d = r0.centerX();
        this.e = this.v.centerY();
    }

    public final void g(float f) {
        this.a = f;
        this.b = f;
        this.c = f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.u;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        ValueAnimator valueAnimator = this.t;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.u = i;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            if (this.t == null) {
                this.t = d();
            }
            ValueAnimator valueAnimator2 = this.t;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(this);
                this.t.setStartDelay(this.f);
            }
            ValueAnimator valueAnimator3 = this.t;
            this.t = valueAnimator3;
            if (valueAnimator3 == null) {
                return;
            }
            if (!valueAnimator3.isStarted()) {
                valueAnimator3.start();
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        this.t.removeAllUpdateListeners();
        this.t.end();
        this.a = 1.0f;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0.0f;
        this.s = 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }
}
