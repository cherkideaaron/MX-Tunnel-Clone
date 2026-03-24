package org.achartengine.chart;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class PieSegment implements Serializable {
    private int mDataIndex;
    private float mEndAngle;
    private float mStartAngle;
    private float mValue;

    public PieSegment(int i, float f, float f2, float f3) {
        this.mStartAngle = f2;
        this.mEndAngle = f3 + f2;
        this.mDataIndex = i;
        this.mValue = f;
    }

    public int getDataIndex() {
        return this.mDataIndex;
    }

    public float getEndAngle() {
        return this.mEndAngle;
    }

    public float getStartAngle() {
        return this.mStartAngle;
    }

    public float getValue() {
        return this.mValue;
    }

    public boolean isInSegment(double d) {
        return d >= ((double) this.mStartAngle) && d <= ((double) this.mEndAngle);
    }

    public String toString() {
        return "mDataIndex=" + this.mDataIndex + ",mValue=" + this.mValue + ",mStartAngle=" + this.mStartAngle + ",mEndAngle=" + this.mEndAngle;
    }
}
