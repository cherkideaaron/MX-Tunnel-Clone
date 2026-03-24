package rased.vpn.app.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import defpackage.SA;

/* loaded from: classes2.dex */
public class CircleProgressBar extends View {
    public float a;
    public float b;
    public int c;
    public int d;
    public final int e;
    public int f;
    public final RectF m;
    public final Paint n;
    public final Paint o;

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 4.0f;
        this.b = 0.0f;
        this.c = 0;
        this.d = 100;
        this.e = -90;
        this.f = -12303292;
        this.m = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, SA.a, 0, 0);
        try {
            this.a = typedArrayObtainStyledAttributes.getDimension(3, this.a);
            this.b = typedArrayObtainStyledAttributes.getFloat(2, this.b);
            this.f = typedArrayObtainStyledAttributes.getInt(4, this.f);
            this.c = typedArrayObtainStyledAttributes.getInt(1, this.c);
            this.d = typedArrayObtainStyledAttributes.getInt(0, this.d);
            typedArrayObtainStyledAttributes.recycle();
            Paint paint = new Paint(1);
            this.n = paint;
            int i = this.f;
            paint.setColor(Color.argb(Math.round(Color.alpha(i) * 0.3f), Color.red(i), Color.green(i), Color.blue(i)));
            Paint paint2 = this.n;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            this.n.setStrokeWidth(this.a);
            Paint paint3 = new Paint(1);
            this.o = paint3;
            paint3.setColor(this.f);
            this.o.setStyle(style);
            this.o.setStrokeWidth(this.a);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public int getColor() {
        return this.f;
    }

    public int getMax() {
        return this.d;
    }

    public int getMin() {
        return this.c;
    }

    public float getProgress() {
        return this.b;
    }

    public float getStrokeWidth() {
        return this.a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(this.m, this.n);
        canvas.drawArc(this.m, this.e, (this.b * 360.0f) / this.d, false, this.o);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        setMeasuredDimension(iMin, iMin);
        RectF rectF = this.m;
        float f = this.a;
        float f2 = iMin;
        rectF.set((f / 2.0f) + 0.0f, (f / 2.0f) + 0.0f, f2 - (f / 2.0f), f2 - (f / 2.0f));
    }

    public void setColor(int i) {
        this.f = i;
        this.n.setColor(Color.argb(Math.round(Color.alpha(i) * 0.3f), Color.red(i), Color.green(i), Color.blue(i)));
        this.o.setColor(i);
        invalidate();
        requestLayout();
    }

    public void setMax(int i) {
        this.d = i;
        invalidate();
    }

    public void setMin(int i) {
        this.c = i;
        invalidate();
    }

    public void setProgress(float f) {
        this.b = f;
        invalidate();
    }

    public void setProgressWithAnimation(float f) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", f);
        objectAnimatorOfFloat.setDuration(1500L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.start();
    }

    public void setStrokeWidth(float f) {
        this.a = f;
        this.n.setStrokeWidth(f);
        this.o.setStrokeWidth(f);
        invalidate();
        requestLayout();
    }
}
