package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* loaded from: classes2.dex */
public class LineChart extends XYChart {
    private static final int SHAPE_WIDTH = 30;
    public static final String TYPE = "Line";
    private ScatterChart pointsChart;

    public LineChart() {
    }

    @Override // org.achartengine.chart.XYChart
    public ClickableArea[] clickableAreasForPoints(float[] fArr, double[] dArr, float f, int i, int i2) {
        int length = fArr.length;
        ClickableArea[] clickableAreaArr = new ClickableArea[length / 2];
        for (int i3 = 0; i3 < length; i3 += 2) {
            int selectableBuffer = this.mRenderer.getSelectableBuffer();
            float f2 = fArr[i3];
            float f3 = selectableBuffer;
            int i4 = i3 + 1;
            float f4 = fArr[i4];
            clickableAreaArr[i3 / 2] = new ClickableArea(new RectF(f2 - f3, f4 - f3, f2 + f3, f4 + f3), dArr[i3], dArr[i4]);
        }
        return clickableAreaArr;
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f, float f2, int i, Paint paint) {
        canvas.drawLine(f, f2, f + 30.0f, f2, paint);
        if (isRenderPoints(simpleSeriesRenderer)) {
            this.pointsChart.drawLegendShape(canvas, simpleSeriesRenderer, f + 5.0f, f2, i, paint);
        }
    }

    @Override // org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, float[] fArr, SimpleSeriesRenderer simpleSeriesRenderer, float f, int i, int i2) {
        int length = fArr.length;
        XYSeriesRenderer xYSeriesRenderer = (XYSeriesRenderer) simpleSeriesRenderer;
        float strokeWidth = paint.getStrokeWidth();
        paint.setStrokeWidth(xYSeriesRenderer.getLineWidth());
        if (xYSeriesRenderer.isFillBelowLine()) {
            paint.setColor(xYSeriesRenderer.getFillBelowLineColor());
            float[] fArr2 = new float[fArr.length + 4];
            System.arraycopy(fArr, 0, fArr2, 0, length);
            fArr2[0] = fArr[0] + 1.0f;
            fArr2[length] = fArr2[length - 2];
            int i3 = length + 1;
            fArr2[i3] = f;
            fArr2[length + 2] = fArr2[0];
            fArr2[length + 3] = fArr2[i3];
            paint.setStyle(Paint.Style.FILL);
            drawPath(canvas, fArr2, paint, true);
        }
        paint.setColor(simpleSeriesRenderer.getColor());
        paint.setStyle(Paint.Style.STROKE);
        drawPath(canvas, fArr, paint, false);
        paint.setStrokeWidth(strokeWidth);
    }

    @Override // org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i) {
        return SHAPE_WIDTH;
    }

    @Override // org.achartengine.chart.XYChart
    public ScatterChart getPointsChart() {
        return this.pointsChart;
    }

    @Override // org.achartengine.chart.XYChart
    public boolean isRenderPoints(SimpleSeriesRenderer simpleSeriesRenderer) {
        return ((XYSeriesRenderer) simpleSeriesRenderer).getPointStyle() != PointStyle.POINT;
    }

    @Override // org.achartengine.chart.XYChart
    public void setDatasetRenderer(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super.setDatasetRenderer(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.pointsChart = new ScatterChart(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
    }

    public LineChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.pointsChart = new ScatterChart(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
    }
}
