package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYValueSeries;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* loaded from: classes2.dex */
public class BubbleChart extends XYChart {
    private static final int MAX_BUBBLE_SIZE = 20;
    private static final int MIN_BUBBLE_SIZE = 2;
    private static final int SHAPE_WIDTH = 10;
    public static final String TYPE = "Bubble";

    public BubbleChart() {
    }

    private void drawCircle(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.drawCircle(f, f2, f3, paint);
    }

    @Override // org.achartengine.chart.XYChart
    public ClickableArea[] clickableAreasForPoints(float[] fArr, double[] dArr, float f, int i, int i2) {
        int length = fArr.length;
        XYValueSeries xYValueSeries = (XYValueSeries) this.mDataset.getSeriesAt(i);
        double maxValue = 20.0d / xYValueSeries.getMaxValue();
        ClickableArea[] clickableAreaArr = new ClickableArea[length / 2];
        for (int i3 = 0; i3 < length; i3 += 2) {
            int i4 = i3 / 2;
            double value = (xYValueSeries.getValue(i2 + i4) * maxValue) + 2.0d;
            float f2 = fArr[i3];
            float f3 = (float) value;
            int i5 = i3 + 1;
            float f4 = fArr[i5];
            clickableAreaArr[i4] = new ClickableArea(new RectF(f2 - f3, f4 - f3, f2 + f3, f4 + f3), dArr[i3], dArr[i5]);
        }
        return clickableAreaArr;
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f, float f2, int i, Paint paint) {
        paint.setStyle(Paint.Style.FILL);
        drawCircle(canvas, paint, f + 10.0f, f2, 3.0f);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, float[] fArr, SimpleSeriesRenderer simpleSeriesRenderer, float f, int i, int i2) {
        paint.setColor(((XYSeriesRenderer) simpleSeriesRenderer).getColor());
        paint.setStyle(Paint.Style.FILL);
        int length = fArr.length;
        XYValueSeries xYValueSeries = (XYValueSeries) this.mDataset.getSeriesAt(i);
        double maxValue = 20.0d / xYValueSeries.getMaxValue();
        for (int i3 = 0; i3 < length; i3 += 2) {
            drawCircle(canvas, paint, fArr[i3], fArr[i3 + 1], (float) ((xYValueSeries.getValue((i3 / 2) + i2) * maxValue) + 2.0d));
        }
    }

    @Override // org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i) {
        return 10;
    }

    public BubbleChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
    }
}
