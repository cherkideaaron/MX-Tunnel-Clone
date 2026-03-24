package cn.pedant.SweetAlert;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public class SuccessTickView extends View {
    private final float CONST_LEFT_RECT_W;
    private final float CONST_RADIUS;
    private final float CONST_RECT_WEIGHT;
    private final float CONST_RIGHT_RECT_W;
    private final float MAX_RIGHT_RECT_W;
    private final float MIN_LEFT_RECT_W;
    private float mDensity;
    private boolean mLeftRectGrowMode;
    private float mLeftRectWidth;
    private float mMaxLeftRectWidth;
    private Paint mPaint;
    private float mRightRectWidth;

    public SuccessTickView(Context context) {
        super(context);
        this.mDensity = -1.0f;
        this.CONST_RADIUS = dip2px(1.2f);
        this.CONST_RECT_WEIGHT = dip2px(3.0f);
        this.CONST_LEFT_RECT_W = dip2px(15.0f);
        float fDip2px = dip2px(25.0f);
        this.CONST_RIGHT_RECT_W = fDip2px;
        this.MIN_LEFT_RECT_W = dip2px(3.3f);
        this.MAX_RIGHT_RECT_W = dip2px(6.7f) + fDip2px;
        init();
    }

    private void init() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setColor(getResources().getColor(R.color.success_stroke_color));
        this.mLeftRectWidth = this.CONST_LEFT_RECT_W;
        this.mRightRectWidth = this.CONST_RIGHT_RECT_W;
        this.mLeftRectGrowMode = false;
    }

    public float dip2px(float f) {
        if (this.mDensity == -1.0f) {
            this.mDensity = getResources().getDisplayMetrics().density;
        }
        return (f * this.mDensity) + 0.5f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        float f;
        float f2;
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        canvas.rotate(45.0f, width / 2, height / 2);
        int i = (int) (height / 1.4d);
        float f3 = (int) (width / 1.2d);
        this.mMaxLeftRectWidth = (((this.CONST_LEFT_RECT_W + f3) / 2.0f) + this.CONST_RECT_WEIGHT) - 1.0f;
        RectF rectF = new RectF();
        if (this.mLeftRectGrowMode) {
            rectF.left = 0.0f;
            rectF.right = 0.0f + this.mLeftRectWidth;
            f2 = (i + this.CONST_RIGHT_RECT_W) / 2.0f;
            rectF.top = f2;
            f = this.CONST_RECT_WEIGHT;
        } else {
            float f4 = (this.CONST_LEFT_RECT_W + f3) / 2.0f;
            f = this.CONST_RECT_WEIGHT;
            float f5 = (f4 + f) - 1.0f;
            rectF.right = f5;
            rectF.left = f5 - this.mLeftRectWidth;
            f2 = (i + this.CONST_RIGHT_RECT_W) / 2.0f;
            rectF.top = f2;
        }
        rectF.bottom = f2 + f;
        float f6 = this.CONST_RADIUS;
        canvas.drawRoundRect(rectF, f6, f6, this.mPaint);
        RectF rectF2 = new RectF();
        float f7 = (i + this.CONST_RIGHT_RECT_W) / 2.0f;
        float f8 = this.CONST_RECT_WEIGHT;
        float f9 = (f7 + f8) - 1.0f;
        rectF2.bottom = f9;
        float f10 = (f3 + this.CONST_LEFT_RECT_W) / 2.0f;
        rectF2.left = f10;
        rectF2.right = f10 + f8;
        rectF2.top = f9 - this.mRightRectWidth;
        float f11 = this.CONST_RADIUS;
        canvas.drawRoundRect(rectF2, f11, f11, this.mPaint);
    }

    public void startTickAnim() {
        this.mLeftRectWidth = 0.0f;
        this.mRightRectWidth = 0.0f;
        invalidate();
        Animation animation = new Animation() { // from class: cn.pedant.SweetAlert.SuccessTickView.1
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                super.applyTransformation(f, transformation);
                double d = f;
                if (0.54d < d && 0.7d >= d) {
                    SuccessTickView.this.mLeftRectGrowMode = true;
                    SuccessTickView successTickView = SuccessTickView.this;
                    successTickView.mLeftRectWidth = ((f - 0.54f) / 0.16f) * successTickView.mMaxLeftRectWidth;
                    if (0.65d < d) {
                        SuccessTickView successTickView2 = SuccessTickView.this;
                        successTickView2.mRightRectWidth = ((f - 0.65f) / 0.19f) * successTickView2.MAX_RIGHT_RECT_W;
                    }
                } else if (0.7d < d && 0.84d >= d) {
                    SuccessTickView.this.mLeftRectGrowMode = false;
                    SuccessTickView successTickView3 = SuccessTickView.this;
                    successTickView3.mLeftRectWidth = (1.0f - ((f - 0.7f) / 0.14f)) * successTickView3.mMaxLeftRectWidth;
                    SuccessTickView successTickView4 = SuccessTickView.this;
                    successTickView4.mLeftRectWidth = successTickView4.mLeftRectWidth < SuccessTickView.this.MIN_LEFT_RECT_W ? SuccessTickView.this.MIN_LEFT_RECT_W : SuccessTickView.this.mLeftRectWidth;
                    SuccessTickView successTickView22 = SuccessTickView.this;
                    successTickView22.mRightRectWidth = ((f - 0.65f) / 0.19f) * successTickView22.MAX_RIGHT_RECT_W;
                } else {
                    if (0.84d >= d || 1.0f < f) {
                        return;
                    }
                    SuccessTickView.this.mLeftRectGrowMode = false;
                    SuccessTickView successTickView5 = SuccessTickView.this;
                    float f2 = (f - 0.84f) / 0.16f;
                    successTickView5.mLeftRectWidth = ((SuccessTickView.this.CONST_LEFT_RECT_W - SuccessTickView.this.MIN_LEFT_RECT_W) * f2) + successTickView5.MIN_LEFT_RECT_W;
                    SuccessTickView successTickView6 = SuccessTickView.this;
                    successTickView6.mRightRectWidth = ((1.0f - f2) * (SuccessTickView.this.MAX_RIGHT_RECT_W - SuccessTickView.this.CONST_RIGHT_RECT_W)) + successTickView6.CONST_RIGHT_RECT_W;
                }
                SuccessTickView.this.invalidate();
            }
        };
        animation.setDuration(750L);
        animation.setStartOffset(100L);
        startAnimation(animation);
    }

    public SuccessTickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDensity = -1.0f;
        this.CONST_RADIUS = dip2px(1.2f);
        this.CONST_RECT_WEIGHT = dip2px(3.0f);
        this.CONST_LEFT_RECT_W = dip2px(15.0f);
        float fDip2px = dip2px(25.0f);
        this.CONST_RIGHT_RECT_W = fDip2px;
        this.MIN_LEFT_RECT_W = dip2px(3.3f);
        this.MAX_RIGHT_RECT_W = dip2px(6.7f) + fDip2px;
        init();
    }
}
