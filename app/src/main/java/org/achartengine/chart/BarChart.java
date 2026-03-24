package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;

/* loaded from: classes2.dex */
public class BarChart extends XYChart {
    private static final int SHAPE_WIDTH = 12;
    public static final String TYPE = "Bar";
    protected Type mType;

    public enum Type {
        DEFAULT,
        STACKED
    }

    public BarChart() {
        this.mType = Type.DEFAULT;
    }

    private int getGradientPartialColor(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f2) + (Color.alpha(i) * f)), Math.round((Color.red(i2) * f2) + (Color.red(i) * f)), Math.round((Color.green(i2) * f2) + (Color.green(i) * f)), Math.round((f2 * Color.blue(i2)) + (f * Color.blue(i))));
    }

    @Override // org.achartengine.chart.XYChart
    public ClickableArea[] clickableAreasForPoints(float[] fArr, double[] dArr, float f, int i, int i2) {
        int seriesCount = this.mDataset.getSeriesCount();
        int length = fArr.length;
        ClickableArea[] clickableAreaArr = new ClickableArea[length / 2];
        float halfDiffX = getHalfDiffX(fArr, length, seriesCount);
        for (int i3 = 0; i3 < length; i3 += 2) {
            float f2 = fArr[i3];
            int i4 = i3 + 1;
            float f3 = fArr[i4];
            if (this.mType == Type.STACKED) {
                clickableAreaArr[i3 / 2] = new ClickableArea(new RectF(f2 - halfDiffX, f3, f2 + halfDiffX, f), dArr[i3], dArr[i4]);
            } else {
                float f4 = (i * 2 * halfDiffX) + (f2 - (seriesCount * halfDiffX));
                clickableAreaArr[i3 / 2] = new ClickableArea(new RectF(f4, f3, (2.0f * halfDiffX) + f4, f), dArr[i3], dArr[i4]);
            }
        }
        return clickableAreaArr;
    }

    public void drawBar(Canvas canvas, float f, float f2, float f3, float f4, float f5, int i, int i2, Paint paint) {
        float f6;
        float f7;
        int scaleNumber = this.mDataset.getSeriesAt(i2).getScaleNumber();
        if (this.mType == Type.STACKED) {
            f6 = f - f5;
            f7 = f3 + f5;
        } else {
            f6 = (i2 * 2 * f5) + (f - (i * f5));
            f7 = (2.0f * f5) + f6;
        }
        drawBar(canvas, f6, f4, f7, f2, scaleNumber, i2, paint);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawChartValuesText(Canvas canvas, XYSeries xYSeries, SimpleSeriesRenderer simpleSeriesRenderer, Paint paint, float[] fArr, int i, int i2) {
        int seriesCount = this.mDataset.getSeriesCount();
        float halfDiffX = getHalfDiffX(fArr, fArr.length, seriesCount);
        for (int i3 = 0; i3 < fArr.length; i3 += 2) {
            int i4 = (i3 / 2) + i2;
            if (!isNullValue(xYSeries.getY(i4))) {
                float f = fArr[i3];
                drawText(canvas, getLabel(xYSeries.getY(i4)), this.mType == Type.DEFAULT ? (((i * 2) * halfDiffX) - ((seriesCount - 1.5f) * halfDiffX)) + f : f, fArr[i3 + 1] - simpleSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
            }
        }
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f, float f2, int i, Paint paint) {
        canvas.drawRect(f, f2 - 6.0f, f + 12.0f, f2 + 6.0f, paint);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, float[] fArr, SimpleSeriesRenderer simpleSeriesRenderer, float f, int i, int i2) {
        int seriesCount = this.mDataset.getSeriesCount();
        int length = fArr.length;
        paint.setColor(simpleSeriesRenderer.getColor());
        paint.setStyle(Paint.Style.FILL);
        float halfDiffX = getHalfDiffX(fArr, length, seriesCount);
        for (int i3 = 0; i3 < length; i3 += 2) {
            float f2 = fArr[i3];
            drawBar(canvas, f2, f, f2, fArr[i3 + 1], halfDiffX, seriesCount, i, paint);
        }
        paint.setColor(simpleSeriesRenderer.getColor());
    }

    @Override // org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    public float getCoeficient() {
        return 1.0f;
    }

    @Override // org.achartengine.chart.XYChart
    public double getDefaultMinimum() {
        return 0.0d;
    }

    public float getHalfDiffX(float[] fArr, int i, int i2) {
        float f = (fArr[i - 2] - fArr[0]) / (i > 2 ? i - 2 : i);
        if (f == 0.0f) {
            f = 10.0f;
        }
        if (this.mType != Type.STACKED) {
            f /= i2;
        }
        return (float) (f / ((this.mRenderer.getBarSpacing() + 1.0d) * getCoeficient()));
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i) {
        return 12;
    }

    @Override // org.achartengine.chart.XYChart
    public boolean isRenderNullValues() {
        return true;
    }

    public BarChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, Type type) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        Type type2 = Type.DEFAULT;
        this.mType = type;
    }

    private void drawBar(Canvas canvas, float f, float f2, float f3, float f4, int i, int i2, Paint paint) {
        int gradientPartialColor;
        float f5 = f4;
        SimpleSeriesRenderer seriesRendererAt = this.mRenderer.getSeriesRendererAt(i2);
        if (!seriesRendererAt.isGradientEnabled()) {
            if (Math.abs(f2 - f5) < 1.0f) {
                f5 = f2 < f5 ? f2 + 1.0f : f2 - 1.0f;
            }
            canvas.drawRect(Math.round(f), Math.round(f2), Math.round(f3), Math.round(f5), paint);
            return;
        }
        float f6 = (float) toScreenPoint(new double[]{0.0d, seriesRendererAt.getGradientStopValue()}, i)[1];
        float f7 = (float) toScreenPoint(new double[]{0.0d, seriesRendererAt.getGradientStartValue()}, i)[1];
        float fMax = Math.max(f6, f2);
        float fMin = Math.min(f7, f5);
        int gradientStopColor = seriesRendererAt.getGradientStopColor();
        int gradientStartColor = seriesRendererAt.getGradientStartColor();
        if (f2 < f6) {
            paint.setColor(gradientStopColor);
            canvas.drawRect(Math.round(f), Math.round(f2), Math.round(f3), Math.round(fMax), paint);
            gradientPartialColor = gradientStopColor;
        } else {
            gradientPartialColor = getGradientPartialColor(gradientStopColor, gradientStartColor, (f7 - fMax) / (f7 - f6));
        }
        if (f5 > f7) {
            paint.setColor(gradientStartColor);
            canvas.drawRect(Math.round(f), Math.round(fMin), Math.round(f3), Math.round(f4), paint);
        } else {
            gradientStartColor = getGradientPartialColor(gradientStartColor, gradientStopColor, (fMin - f6) / (f7 - f6));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{gradientStartColor, gradientPartialColor});
        gradientDrawable.setBounds(Math.round(f), Math.round(fMax), Math.round(f3), Math.round(fMin));
        gradientDrawable.draw(canvas);
    }
}
