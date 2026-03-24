package org.achartengine.renderer;

import android.graphics.Paint;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class SimpleSeriesRenderer implements Serializable {
    private boolean mDisplayChartValues;
    private int mGradientStartColor;
    private double mGradientStartValue;
    private int mGradientStopColor;
    private double mGradientStopValue;
    private BasicStroke mStroke;
    private int mColor = -16776961;
    private float mChartValuesTextSize = 10.0f;
    private Paint.Align mChartValuesTextAlign = Paint.Align.CENTER;
    private float mChartValuesSpacing = 5.0f;
    private boolean mGradientEnabled = false;

    public float getChartValuesSpacing() {
        return this.mChartValuesSpacing;
    }

    public Paint.Align getChartValuesTextAlign() {
        return this.mChartValuesTextAlign;
    }

    public float getChartValuesTextSize() {
        return this.mChartValuesTextSize;
    }

    public int getColor() {
        return this.mColor;
    }

    public int getGradientStartColor() {
        return this.mGradientStartColor;
    }

    public double getGradientStartValue() {
        return this.mGradientStartValue;
    }

    public int getGradientStopColor() {
        return this.mGradientStopColor;
    }

    public double getGradientStopValue() {
        return this.mGradientStopValue;
    }

    public BasicStroke getStroke() {
        return this.mStroke;
    }

    public boolean isDisplayChartValues() {
        return this.mDisplayChartValues;
    }

    public boolean isGradientEnabled() {
        return this.mGradientEnabled;
    }

    public void setChartValuesSpacing(float f) {
        this.mChartValuesSpacing = f;
    }

    public void setChartValuesTextAlign(Paint.Align align) {
        this.mChartValuesTextAlign = align;
    }

    public void setChartValuesTextSize(float f) {
        this.mChartValuesTextSize = f;
    }

    public void setColor(int i) {
        this.mColor = i;
    }

    public void setDisplayChartValues(boolean z) {
        this.mDisplayChartValues = z;
    }

    public void setGradientEnabled(boolean z) {
        this.mGradientEnabled = z;
    }

    public void setGradientStart(double d, int i) {
        this.mGradientStartValue = d;
        this.mGradientStartColor = i;
    }

    public void setGradientStop(double d, int i) {
        this.mGradientStopValue = d;
        this.mGradientStopColor = i;
    }

    public void setStroke(BasicStroke basicStroke) {
        this.mStroke = basicStroke;
    }
}
