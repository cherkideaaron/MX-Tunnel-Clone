package cn.pedant.SweetAlert;

import android.content.Context;
import android.os.SystemClock;
import com.pnikosis.materialishprogress.ProgressWheel;

/* loaded from: classes.dex */
public class ProgressHelper {
    private int mBarColor;
    private int mBarWidth;
    private int mCircleRadius;
    private ProgressWheel mProgressWheel;
    private boolean mToSpin = true;
    private float mSpinSpeed = 0.75f;
    private int mRimWidth = 0;
    private int mRimColor = 0;
    private boolean mIsInstantProgress = false;
    private float mProgressVal = -1.0f;

    public ProgressHelper(Context context) {
        this.mBarWidth = context.getResources().getDimensionPixelSize(R.dimen.common_circle_width) + 1;
        this.mBarColor = context.getResources().getColor(R.color.success_stroke_color);
        this.mCircleRadius = context.getResources().getDimensionPixelOffset(R.dimen.progress_circle_radius);
    }

    private void updatePropsIfNeed() {
        ProgressWheel progressWheel = this.mProgressWheel;
        if (progressWheel != null) {
            boolean z = this.mToSpin;
            if (!z && progressWheel.z) {
                progressWheel.z = false;
                progressWheel.x = 0.0f;
                progressWheel.y = 0.0f;
                progressWheel.invalidate();
            } else if (z && !progressWheel.z) {
                progressWheel.v = SystemClock.uptimeMillis();
                progressWheel.z = true;
                progressWheel.invalidate();
            }
            if (this.mSpinSpeed != this.mProgressWheel.getSpinSpeed()) {
                this.mProgressWheel.setSpinSpeed(this.mSpinSpeed);
            }
            if (this.mBarWidth != this.mProgressWheel.getBarWidth()) {
                this.mProgressWheel.setBarWidth(this.mBarWidth);
            }
            if (this.mBarColor != this.mProgressWheel.getBarColor()) {
                this.mProgressWheel.setBarColor(this.mBarColor);
            }
            if (this.mRimWidth != this.mProgressWheel.getRimWidth()) {
                this.mProgressWheel.setRimWidth(this.mRimWidth);
            }
            if (this.mRimColor != this.mProgressWheel.getRimColor()) {
                this.mProgressWheel.setRimColor(this.mRimColor);
            }
            if (this.mProgressVal != this.mProgressWheel.getProgress()) {
                if (this.mIsInstantProgress) {
                    this.mProgressWheel.setInstantProgress(this.mProgressVal);
                } else {
                    this.mProgressWheel.setProgress(this.mProgressVal);
                }
            }
            if (this.mCircleRadius != this.mProgressWheel.getCircleRadius()) {
                this.mProgressWheel.setCircleRadius(this.mCircleRadius);
            }
        }
    }

    public int getBarColor() {
        return this.mBarColor;
    }

    public int getBarWidth() {
        return this.mBarWidth;
    }

    public int getCircleRadius() {
        return this.mCircleRadius;
    }

    public float getProgress() {
        return this.mProgressVal;
    }

    public ProgressWheel getProgressWheel() {
        return this.mProgressWheel;
    }

    public int getRimColor() {
        return this.mRimColor;
    }

    public int getRimWidth() {
        return this.mRimWidth;
    }

    public float getSpinSpeed() {
        return this.mSpinSpeed;
    }

    public boolean isSpinning() {
        return this.mToSpin;
    }

    public void resetCount() {
        ProgressWheel progressWheel = this.mProgressWheel;
        if (progressWheel != null) {
            progressWheel.x = 0.0f;
            progressWheel.y = 0.0f;
            progressWheel.invalidate();
        }
    }

    public void setBarColor(int i) {
        this.mBarColor = i;
        updatePropsIfNeed();
    }

    public void setBarWidth(int i) {
        this.mBarWidth = i;
        updatePropsIfNeed();
    }

    public void setCircleRadius(int i) {
        this.mCircleRadius = i;
        updatePropsIfNeed();
    }

    public void setInstantProgress(float f) {
        this.mProgressVal = f;
        this.mIsInstantProgress = true;
        updatePropsIfNeed();
    }

    public void setProgress(float f) {
        this.mIsInstantProgress = false;
        this.mProgressVal = f;
        updatePropsIfNeed();
    }

    public void setProgressWheel(ProgressWheel progressWheel) {
        this.mProgressWheel = progressWheel;
        updatePropsIfNeed();
    }

    public void setRimColor(int i) {
        this.mRimColor = i;
        updatePropsIfNeed();
    }

    public void setRimWidth(int i) {
        this.mRimWidth = i;
        updatePropsIfNeed();
    }

    public void setSpinSpeed(float f) {
        this.mSpinSpeed = f;
        updatePropsIfNeed();
    }

    public void spin() {
        this.mToSpin = true;
        updatePropsIfNeed();
    }

    public void stopSpinning() {
        this.mToSpin = false;
        updatePropsIfNeed();
    }
}
