package org.achartengine.renderer;

import android.graphics.Color;
import org.achartengine.chart.PointStyle;

/* loaded from: classes2.dex */
public class XYSeriesRenderer extends SimpleSeriesRenderer {
    private boolean mFillPoints = false;
    private boolean mFillBelowLine = false;
    private int mFillColor = Color.argb(125, 0, 0, 200);
    private PointStyle mPointStyle = PointStyle.POINT;
    private float mLineWidth = 1.0f;

    public int getFillBelowLineColor() {
        return this.mFillColor;
    }

    public float getLineWidth() {
        return this.mLineWidth;
    }

    public PointStyle getPointStyle() {
        return this.mPointStyle;
    }

    public boolean isFillBelowLine() {
        return this.mFillBelowLine;
    }

    public boolean isFillPoints() {
        return this.mFillPoints;
    }

    public void setFillBelowLine(boolean z) {
        this.mFillBelowLine = z;
    }

    public void setFillBelowLineColor(int i) {
        this.mFillColor = i;
    }

    public void setFillPoints(boolean z) {
        this.mFillPoints = z;
    }

    public void setLineWidth(float f) {
        this.mLineWidth = f;
    }

    public void setPointStyle(PointStyle pointStyle) {
        this.mPointStyle = pointStyle;
    }
}
