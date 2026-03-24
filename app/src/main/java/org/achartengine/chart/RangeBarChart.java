package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.achartengine.chart.BarChart;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;

/* loaded from: classes2.dex */
public class RangeBarChart extends BarChart {
    public static final String TYPE = "RangeBar";

    public RangeBarChart() {
    }

    @Override // org.achartengine.chart.BarChart, org.achartengine.chart.XYChart
    public void drawChartValuesText(Canvas canvas, XYSeries xYSeries, SimpleSeriesRenderer simpleSeriesRenderer, Paint paint, float[] fArr, int i, int i2) {
        int i3;
        int i4;
        int seriesCount = this.mDataset.getSeriesCount();
        float halfDiffX = getHalfDiffX(fArr, fArr.length, seriesCount);
        for (int i5 = i2 > 0 ? 2 : 0; i5 < fArr.length; i5 += 4) {
            int i6 = (i5 / 2) + i2;
            float f = fArr[i5];
            float f2 = this.mType == BarChart.Type.DEFAULT ? (((i * 2) * halfDiffX) - ((seriesCount - 1.5f) * halfDiffX)) + f : f;
            int i7 = i6 + 1;
            if (!isNullValue(xYSeries.getY(i7)) && fArr.length > (i4 = i5 + 3)) {
                drawText(canvas, getLabel(xYSeries.getY(i7)), f2, fArr[i4] - simpleSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
            }
            if (!isNullValue(xYSeries.getY(i6)) && fArr.length > (i3 = i5 + 1)) {
                drawText(canvas, getLabel(xYSeries.getY(i6)), f2, (simpleSeriesRenderer.getChartValuesSpacing() + (simpleSeriesRenderer.getChartValuesTextSize() + fArr[i3])) - 3.0f, paint, 0.0f);
            }
        }
    }

    @Override // org.achartengine.chart.BarChart, org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, float[] fArr, SimpleSeriesRenderer simpleSeriesRenderer, float f, int i, int i2) {
        int i3;
        int seriesCount = this.mDataset.getSeriesCount();
        int length = fArr.length;
        paint.setColor(simpleSeriesRenderer.getColor());
        paint.setStyle(Paint.Style.FILL);
        float halfDiffX = getHalfDiffX(fArr, length, seriesCount);
        int i4 = i2 > 0 ? 2 : 0;
        while (i4 < length) {
            int i5 = i4 + 3;
            if (fArr.length > i5) {
                i3 = i4;
                drawBar(canvas, fArr[i4], fArr[i4 + 1], fArr[i4 + 2], fArr[i5], halfDiffX, seriesCount, i, paint);
            } else {
                i3 = i4;
            }
            i4 = i3 + 4;
        }
        paint.setColor(simpleSeriesRenderer.getColor());
    }

    @Override // org.achartengine.chart.BarChart, org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    @Override // org.achartengine.chart.BarChart
    public float getCoeficient() {
        return 0.5f;
    }

    public RangeBarChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, BarChart.Type type) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer, type);
    }
}
