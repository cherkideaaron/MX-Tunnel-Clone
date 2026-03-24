package com.pnikosis.materialishprogress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import defpackage.C0575cA;
import defpackage.InterfaceC0521bA;
import defpackage.TA;

/* loaded from: classes2.dex */
public class ProgressWheel extends View {
    public final boolean A;
    public int a;
    public int b;
    public int c;
    public boolean d;
    public double e;
    public final double f;
    public float m;
    public boolean n;
    public long o;
    public int p;
    public int q;
    public final Paint r;
    public final Paint s;
    public RectF t;
    public float u;
    public long v;
    public boolean w;
    public float x;
    public float y;
    public boolean z;

    public ProgressWheel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 28;
        this.b = 4;
        this.c = 4;
        this.d = false;
        this.e = 0.0d;
        this.f = 460.0d;
        this.m = 0.0f;
        this.n = true;
        this.o = 0L;
        this.p = -1442840576;
        this.q = 16777215;
        this.r = new Paint();
        this.s = new Paint();
        this.t = new RectF();
        this.u = 230.0f;
        this.v = 0L;
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TA.a);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.b = (int) TypedValue.applyDimension(1, this.b, displayMetrics);
        this.c = (int) TypedValue.applyDimension(1, this.c, displayMetrics);
        int iApplyDimension = (int) TypedValue.applyDimension(1, this.a, displayMetrics);
        this.a = iApplyDimension;
        this.a = (int) typedArrayObtainStyledAttributes.getDimension(3, iApplyDimension);
        this.d = typedArrayObtainStyledAttributes.getBoolean(4, false);
        this.b = (int) typedArrayObtainStyledAttributes.getDimension(2, this.b);
        this.c = (int) typedArrayObtainStyledAttributes.getDimension(8, this.c);
        this.u = typedArrayObtainStyledAttributes.getFloat(9, this.u / 360.0f) * 360.0f;
        this.f = typedArrayObtainStyledAttributes.getInt(1, (int) this.f);
        this.p = typedArrayObtainStyledAttributes.getColor(0, this.p);
        this.q = typedArrayObtainStyledAttributes.getColor(7, this.q);
        this.w = typedArrayObtainStyledAttributes.getBoolean(5, false);
        if (typedArrayObtainStyledAttributes.getBoolean(6, false)) {
            this.v = SystemClock.uptimeMillis();
            this.z = true;
            invalidate();
        }
        typedArrayObtainStyledAttributes.recycle();
        this.A = Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public final void a() {
        Paint paint = this.r;
        paint.setColor(this.p);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(this.b);
        Paint paint2 = this.s;
        paint2.setColor(this.q);
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setStrokeWidth(this.c);
    }

    public int getBarColor() {
        return this.p;
    }

    public int getBarWidth() {
        return this.b;
    }

    public int getCircleRadius() {
        return this.a;
    }

    public float getProgress() {
        if (this.z) {
            return -1.0f;
        }
        return this.x / 360.0f;
    }

    public int getRimColor() {
        return this.q;
    }

    public int getRimWidth() {
        return this.c;
    }

    public float getSpinSpeed() {
        return this.u / 360.0f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        boolean z;
        Canvas canvas2;
        RectF rectF;
        super.onDraw(canvas);
        canvas.drawArc(this.t, 360.0f, 360.0f, false, this.s);
        if (this.A) {
            boolean z2 = this.z;
            Paint paint = this.r;
            float fPow = 0.0f;
            boolean z3 = true;
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis() - this.v;
                float f3 = (jUptimeMillis * this.u) / 1000.0f;
                long j = this.o;
                if (j >= 200) {
                    double d = this.e + jUptimeMillis;
                    this.e = d;
                    double d2 = this.f;
                    if (d > d2) {
                        this.e = d - d2;
                        this.o = 0L;
                        this.n = !this.n;
                    }
                    float fCos = (((float) Math.cos(((this.e / d2) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                    if (this.n) {
                        this.m = fCos * 254.0f;
                    } else {
                        float f4 = (1.0f - fCos) * 254.0f;
                        this.x = (this.m - f4) + this.x;
                        this.m = f4;
                    }
                } else {
                    this.o = j + jUptimeMillis;
                }
                float f5 = this.x + f3;
                this.x = f5;
                if (f5 > 360.0f) {
                    this.x = f5 - 360.0f;
                }
                this.v = SystemClock.uptimeMillis();
                float f6 = this.x - 90.0f;
                float f7 = this.m + 16.0f;
                if (isInEditMode()) {
                    f = 135.0f;
                    f2 = 0.0f;
                } else {
                    f = f7;
                    f2 = f6;
                }
                rectF = this.t;
                z = false;
                canvas2 = canvas;
            } else {
                if (this.x != this.y) {
                    this.x = Math.min(this.x + (((SystemClock.uptimeMillis() - this.v) / 1000.0f) * this.u), this.y);
                    this.v = SystemClock.uptimeMillis();
                } else {
                    z3 = false;
                }
                float fPow2 = this.x;
                if (!this.w) {
                    fPow = ((float) (1.0d - Math.pow(1.0f - (fPow2 / 360.0f), 4.0f))) * 360.0f;
                    fPow2 = ((float) (1.0d - Math.pow(1.0f - (this.x / 360.0f), 2.0f))) * 360.0f;
                }
                f = isInEditMode() ? 360.0f : fPow2;
                f2 = fPow - 90.0f;
                z = false;
                canvas2 = canvas;
                rectF = this.t;
            }
            canvas2.drawArc(rectF, f2, f, z, paint);
            if (z3) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingRight = getPaddingRight() + getPaddingLeft() + this.a;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + this.a;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            paddingRight = size;
        } else if (mode == Integer.MIN_VALUE) {
            paddingRight = Math.min(paddingRight, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingBottom = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingBottom = Math.min(paddingBottom, size2);
        }
        setMeasuredDimension(paddingRight, paddingBottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0575cA)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0575cA c0575cA = (C0575cA) parcelable;
        super.onRestoreInstanceState(c0575cA.getSuperState());
        this.x = c0575cA.a;
        this.y = c0575cA.b;
        this.z = c0575cA.c;
        this.u = c0575cA.d;
        this.b = c0575cA.e;
        this.p = c0575cA.f;
        this.c = c0575cA.m;
        this.q = c0575cA.n;
        this.a = c0575cA.o;
        this.w = c0575cA.p;
        this.d = c0575cA.q;
        this.v = SystemClock.uptimeMillis();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0575cA c0575cA = new C0575cA(super.onSaveInstanceState());
        c0575cA.a = this.x;
        c0575cA.b = this.y;
        c0575cA.c = this.z;
        c0575cA.d = this.u;
        c0575cA.e = this.b;
        c0575cA.f = this.p;
        c0575cA.m = this.c;
        c0575cA.n = this.q;
        c0575cA.o = this.a;
        c0575cA.p = this.w;
        c0575cA.q = this.d;
        return c0575cA;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (this.d) {
            int i5 = this.b;
            this.t = new RectF(paddingLeft + i5, paddingTop + i5, (i - paddingRight) - i5, (i2 - paddingBottom) - i5);
        } else {
            int i6 = (i - paddingLeft) - paddingRight;
            int iMin = Math.min(Math.min(i6, (i2 - paddingBottom) - paddingTop), (this.a * 2) - (this.b * 2));
            int i7 = ((i6 - iMin) / 2) + paddingLeft;
            int i8 = ((((i2 - paddingTop) - paddingBottom) - iMin) / 2) + paddingTop;
            int i9 = this.b;
            this.t = new RectF(i7 + i9, i8 + i9, (i7 + iMin) - i9, (i8 + iMin) - i9);
        }
        a();
        invalidate();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.v = SystemClock.uptimeMillis();
        }
    }

    public void setBarColor(int i) {
        this.p = i;
        a();
        if (this.z) {
            return;
        }
        invalidate();
    }

    public void setBarWidth(int i) {
        this.b = i;
        if (this.z) {
            return;
        }
        invalidate();
    }

    public void setCircleRadius(int i) {
        this.a = i;
        if (this.z) {
            return;
        }
        invalidate();
    }

    public void setInstantProgress(float f) {
        if (this.z) {
            this.x = 0.0f;
            this.z = false;
        }
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        if (f == this.y) {
            return;
        }
        float fMin = Math.min(f * 360.0f, 360.0f);
        this.y = fMin;
        this.x = fMin;
        this.v = SystemClock.uptimeMillis();
        invalidate();
    }

    public void setLinearProgress(boolean z) {
        this.w = z;
        if (this.z) {
            return;
        }
        invalidate();
    }

    public void setProgress(float f) {
        if (this.z) {
            this.x = 0.0f;
            this.z = false;
        }
        if (f > 1.0f) {
            f -= 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.y;
        if (f == f2) {
            return;
        }
        if (this.x == f2) {
            this.v = SystemClock.uptimeMillis();
        }
        this.y = Math.min(f * 360.0f, 360.0f);
        invalidate();
    }

    public void setRimColor(int i) {
        this.q = i;
        a();
        if (this.z) {
            return;
        }
        invalidate();
    }

    public void setRimWidth(int i) {
        this.c = i;
        if (this.z) {
            return;
        }
        invalidate();
    }

    public void setSpinSpeed(float f) {
        this.u = f * 360.0f;
    }

    public void setCallback(InterfaceC0521bA interfaceC0521bA) {
    }
}
