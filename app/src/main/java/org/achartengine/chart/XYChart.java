package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.achartengine.model.Point;
import org.achartengine.model.SeriesSelection;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.BasicStroke;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.util.MathHelper;

/* loaded from: classes2.dex */
public abstract class XYChart extends AbstractChart {
    private Point mCenter;
    protected XYMultipleSeriesDataset mDataset;
    protected XYMultipleSeriesRenderer mRenderer;
    private float mScale;
    private Rect mScreenR;
    private float mTranslate;
    private final Map<Integer, double[]> mCalcRange = new HashMap();
    private Map<Integer, List<ClickableArea>> clickableAreas = new HashMap();

    public XYChart() {
    }

    private int getLabelLinePos(Paint.Align align) {
        return align == Paint.Align.LEFT ? -4 : 4;
    }

    private List<Double> getValidLabels(List<Double> list) {
        ArrayList arrayList = new ArrayList(list);
        for (Double d : list) {
            if (d.isNaN()) {
                arrayList.remove(d);
            }
        }
        return arrayList;
    }

    private void setStroke(Paint.Cap cap, Paint.Join join, float f, Paint.Style style, PathEffect pathEffect, Paint paint) {
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(join);
        paint.setStrokeMiter(f);
        paint.setPathEffect(pathEffect);
        paint.setStyle(style);
    }

    private void transform(Canvas canvas, float f, boolean z) {
        if (z) {
            float f2 = this.mScale;
            canvas.scale(1.0f / f2, f2);
            float f3 = this.mTranslate;
            canvas.translate(f3, -f3);
            canvas.rotate(-f, this.mCenter.getX(), this.mCenter.getY());
            return;
        }
        canvas.rotate(f, this.mCenter.getX(), this.mCenter.getY());
        float f4 = this.mTranslate;
        canvas.translate(-f4, f4);
        float f5 = this.mScale;
        canvas.scale(f5, 1.0f / f5);
    }

    public abstract ClickableArea[] clickableAreasForPoints(float[] fArr, double[] dArr, float f, int i, int i2);

    /* JADX WARN: Removed duplicated region for block: B:122:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0988  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x09ad  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0a50  */
    /* JADX WARN: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    @Override // org.achartengine.chart.AbstractChart
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r54, int r55, int r56, int r57, int r58, android.graphics.Paint r59) {
        /*
            Method dump skipped, instructions count: 2648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.achartengine.chart.XYChart.draw(android.graphics.Canvas, int, int, int, int, android.graphics.Paint):void");
    }

    public void drawChartValuesText(Canvas canvas, XYSeries xYSeries, SimpleSeriesRenderer simpleSeriesRenderer, Paint paint, float[] fArr, int i, int i2) {
        if (fArr.length <= 1) {
            for (int i3 = 0; i3 < fArr.length; i3 += 2) {
                drawText(canvas, getLabel(xYSeries.getY((i3 / 2) + i2)), fArr[i3], fArr[i3 + 1] - simpleSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
            }
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        for (int i4 = 0; i4 < fArr.length; i4 += 2) {
            if (i4 == 2) {
                if (Math.abs(fArr[2] - fArr[0]) > 100.0f || Math.abs(fArr[3] - fArr[1]) > 100.0f) {
                    drawText(canvas, getLabel(xYSeries.getY(i2)), fArr[0], fArr[1] - simpleSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
                    drawText(canvas, getLabel(xYSeries.getY(i2 + 1)), fArr[2], fArr[3] - simpleSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
                    f = fArr[2];
                    f2 = fArr[3];
                }
            } else if (i4 > 2 && (Math.abs(fArr[i4] - f) > 100.0f || Math.abs(fArr[i4 + 1] - f2) > 100.0f)) {
                int i5 = i4 + 1;
                drawText(canvas, getLabel(xYSeries.getY((i4 / 2) + i2)), fArr[i4], fArr[i5] - simpleSeriesRenderer.getChartValuesSpacing(), paint, 0.0f);
                f = fArr[i4];
                f2 = fArr[i5];
            }
        }
    }

    public abstract void drawSeries(Canvas canvas, Paint paint, float[] fArr, SimpleSeriesRenderer simpleSeriesRenderer, float f, int i, int i2);

    public void drawSeries(XYSeries xYSeries, Canvas canvas, Paint paint, List<Float> list, SimpleSeriesRenderer simpleSeriesRenderer, float f, int i, XYMultipleSeriesRenderer.Orientation orientation, int i2) {
        ScatterChart pointsChart;
        BasicStroke stroke = simpleSeriesRenderer.getStroke();
        Paint.Cap strokeCap = paint.getStrokeCap();
        Paint.Join strokeJoin = paint.getStrokeJoin();
        float strokeMiter = paint.getStrokeMiter();
        PathEffect pathEffect = paint.getPathEffect();
        Paint.Style style = paint.getStyle();
        if (stroke != null) {
            setStroke(stroke.getCap(), stroke.getJoin(), stroke.getMiter(), Paint.Style.FILL_AND_STROKE, stroke.getIntervals() != null ? new DashPathEffect(stroke.getIntervals(), stroke.getPhase()) : null, paint);
        }
        float[] floats = MathHelper.getFloats(list);
        drawSeries(canvas, paint, floats, simpleSeriesRenderer, f, i, i2);
        if (isRenderPoints(simpleSeriesRenderer) && (pointsChart = getPointsChart()) != null) {
            pointsChart.drawSeries(canvas, paint, floats, simpleSeriesRenderer, f, i, i2);
        }
        paint.setTextSize(simpleSeriesRenderer.getChartValuesTextSize());
        paint.setTextAlign(orientation == XYMultipleSeriesRenderer.Orientation.HORIZONTAL ? Paint.Align.CENTER : Paint.Align.LEFT);
        if (simpleSeriesRenderer.isDisplayChartValues()) {
            paint.setTextAlign(simpleSeriesRenderer.getChartValuesTextAlign());
            drawChartValuesText(canvas, xYSeries, simpleSeriesRenderer, paint, floats, i, i2);
        }
        if (stroke != null) {
            setStroke(strokeCap, strokeJoin, strokeMiter, style, pathEffect, paint);
        }
    }

    public void drawText(Canvas canvas, String str, float f, float f2, Paint paint, float f3) {
        float f4 = (-this.mRenderer.getOrientation().getAngle()) + f3;
        if (f4 != 0.0f) {
            canvas.rotate(f4, f, f2);
        }
        drawString(canvas, str, f, f2, paint);
        if (f4 != 0.0f) {
            canvas.rotate(-f4, f, f2);
        }
    }

    public void drawXLabels(List<Double> list, Double[] dArr, Canvas canvas, Paint paint, int i, int i2, int i3, double d, double d2, double d3) {
        float f;
        int i4;
        boolean z;
        int size = list.size();
        boolean zIsShowLabels = this.mRenderer.isShowLabels();
        boolean zIsShowGridY = this.mRenderer.isShowGridY();
        int i5 = 0;
        while (i5 < size) {
            double dDoubleValue = list.get(i5).doubleValue();
            float f2 = (float) (((dDoubleValue - d2) * d) + i);
            if (zIsShowLabels) {
                paint.setColor(this.mRenderer.getXLabelsColor());
                float f3 = i3;
                f = f2;
                i4 = size;
                z = zIsShowLabels;
                canvas.drawLine(f2, f3, f2, (this.mRenderer.getLabelsTextSize() / 3.0f) + f3, paint);
                drawText(canvas, getLabel(dDoubleValue), f, ((this.mRenderer.getLabelsTextSize() * 4.0f) / 3.0f) + f3, paint, this.mRenderer.getXLabelsAngle());
            } else {
                f = f2;
                i4 = size;
                z = zIsShowLabels;
            }
            if (zIsShowGridY) {
                paint.setColor(this.mRenderer.getGridColor());
                canvas.drawLine(f, i3, f, i2, paint);
            }
            i5++;
            size = i4;
            zIsShowLabels = z;
        }
        drawXTextLabels(dArr, canvas, paint, zIsShowLabels, i, i2, i3, d, d2, d3);
    }

    public void drawXTextLabels(Double[] dArr, Canvas canvas, Paint paint, boolean z, int i, int i2, int i3, double d, double d2, double d3) {
        boolean zIsShowCustomTextGrid = this.mRenderer.isShowCustomTextGrid();
        if (z) {
            paint.setColor(this.mRenderer.getXLabelsColor());
            for (Double d4 : dArr) {
                if (d2 <= d4.doubleValue() && d4.doubleValue() <= d3) {
                    float fDoubleValue = (float) (((d4.doubleValue() - d2) * d) + i);
                    paint.setColor(this.mRenderer.getXLabelsColor());
                    float f = i3;
                    canvas.drawLine(fDoubleValue, f, fDoubleValue, (this.mRenderer.getLabelsTextSize() / 3.0f) + f, paint);
                    drawText(canvas, this.mRenderer.getXTextLabel(d4), fDoubleValue, ((this.mRenderer.getLabelsTextSize() * 4.0f) / 3.0f) + f, paint, this.mRenderer.getXLabelsAngle());
                    if (zIsShowCustomTextGrid) {
                        paint.setColor(this.mRenderer.getGridColor());
                        canvas.drawLine(fDoubleValue, f, fDoubleValue, i2, paint);
                    }
                }
            }
        }
    }

    public void drawYLabels(Map<Integer, List<Double>> map, Canvas canvas, Paint paint, int i, int i2, int i3, int i4, double[] dArr, double[] dArr2) {
        int i5;
        int i6;
        List<Double> list;
        boolean z;
        float f;
        int i7;
        float f2;
        float f3;
        Paint paint2;
        String label;
        float f4;
        float yLabelsAngle;
        XYChart xYChart;
        Canvas canvas2;
        float f5;
        XYMultipleSeriesRenderer.Orientation orientation = this.mRenderer.getOrientation();
        boolean zIsShowGridX = this.mRenderer.isShowGridX();
        boolean zIsShowLabels = this.mRenderer.isShowLabels();
        int i8 = i;
        int i9 = 0;
        while (i9 < i8) {
            paint.setTextAlign(this.mRenderer.getYLabelsAlign(i9));
            List<Double> list2 = map.get(Integer.valueOf(i9));
            int size = list2.size();
            int i10 = 0;
            while (i10 < size) {
                Double d = list2.get(i10);
                double dDoubleValue = d.doubleValue();
                Paint.Align yAxisAlign = this.mRenderer.getYAxisAlign(i9);
                int i11 = i10;
                if (this.mRenderer.getYTextLabel(d, i9) != null) {
                    z = true;
                    i5 = i4;
                    i6 = size;
                    list = list2;
                } else {
                    i5 = i4;
                    i6 = size;
                    list = list2;
                    z = false;
                }
                float f6 = (float) (i5 - ((dDoubleValue - dArr2[i9]) * dArr[i9]));
                if (orientation == XYMultipleSeriesRenderer.Orientation.HORIZONTAL) {
                    if (!zIsShowLabels || z) {
                        f = f6;
                        i7 = i9;
                    } else {
                        paint.setColor(this.mRenderer.getYLabelsColor(i9));
                        if (yAxisAlign == Paint.Align.LEFT) {
                            f5 = i2;
                            f = f6;
                            paint2 = paint;
                            canvas.drawLine(getLabelLinePos(yAxisAlign) + i2, f6, f5, f6, paint2);
                            label = getLabel(dDoubleValue);
                            f4 = f - 2.0f;
                            yLabelsAngle = this.mRenderer.getYLabelsAngle();
                            xYChart = this;
                            canvas2 = canvas;
                        } else {
                            f = f6;
                            float f7 = i3;
                            paint2 = paint;
                            canvas.drawLine(f7, f, getLabelLinePos(yAxisAlign) + i3, f6, paint2);
                            label = getLabel(dDoubleValue);
                            f4 = f - 2.0f;
                            yLabelsAngle = this.mRenderer.getYLabelsAngle();
                            xYChart = this;
                            canvas2 = canvas;
                            f5 = f7;
                        }
                        i7 = i9;
                        xYChart.drawText(canvas2, label, f5, f4, paint2, yLabelsAngle);
                    }
                    if (zIsShowGridX) {
                        paint.setColor(this.mRenderer.getGridColor());
                        f2 = i2;
                        f3 = i3;
                        canvas.drawLine(f2, f, f3, f, paint);
                    }
                } else {
                    f = f6;
                    if (orientation == XYMultipleSeriesRenderer.Orientation.VERTICAL) {
                        if (!zIsShowLabels || z) {
                            i7 = i9;
                        } else {
                            paint.setColor(this.mRenderer.getYLabelsColor(i9));
                            canvas.drawLine(i3 - getLabelLinePos(yAxisAlign), f, i3, f, paint);
                            i7 = i9;
                            drawText(canvas, getLabel(dDoubleValue), i3 + 10, f - 2.0f, paint, this.mRenderer.getYLabelsAngle());
                        }
                        if (zIsShowGridX) {
                            paint.setColor(this.mRenderer.getGridColor());
                            f2 = i3;
                            f3 = i2;
                            canvas.drawLine(f2, f, f3, f, paint);
                        }
                    } else {
                        i7 = i9;
                    }
                }
                i10 = i11 + 1;
                i9 = i7;
                list2 = list;
                size = i6;
            }
            i9++;
            i8 = i;
        }
    }

    public double[] getCalcRange(int i) {
        return this.mCalcRange.get(Integer.valueOf(i));
    }

    public abstract String getChartType();

    public XYMultipleSeriesDataset getDataset() {
        return this.mDataset;
    }

    public double getDefaultMinimum() {
        return Double.MAX_VALUE;
    }

    public String getLabel(double d) {
        StringBuilder sb;
        if (d == Math.round(d)) {
            sb = new StringBuilder();
            sb.append(Math.round(d));
        } else {
            sb = new StringBuilder();
            sb.append(d);
        }
        sb.append("");
        return sb.toString();
    }

    public ScatterChart getPointsChart() {
        return null;
    }

    public XYMultipleSeriesRenderer getRenderer() {
        return this.mRenderer;
    }

    public Rect getScreenR() {
        return this.mScreenR;
    }

    @Override // org.achartengine.chart.AbstractChart
    public SeriesSelection getSeriesAndPointForScreenCoordinate(Point point) {
        Map<Integer, List<ClickableArea>> map = this.clickableAreas;
        if (map != null) {
            for (int size = map.size() - 1; size >= 0; size--) {
                if (this.clickableAreas.get(Integer.valueOf(size)) != null) {
                    int i = 0;
                    for (ClickableArea clickableArea : this.clickableAreas.get(Integer.valueOf(size))) {
                        RectF rect = clickableArea.getRect();
                        if (rect != null && rect.contains(point.getX(), point.getY())) {
                            return new SeriesSelection(size, i, clickableArea.getX(), clickableArea.getY());
                        }
                        i++;
                    }
                }
            }
        }
        return super.getSeriesAndPointForScreenCoordinate(point);
    }

    public List<Double> getXLabels(double d, double d2, int i) {
        return MathHelper.getLabels(d, d2, i);
    }

    public Map<Integer, List<Double>> getYLabels(double[] dArr, double[] dArr2, int i) {
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            map.put(Integer.valueOf(i2), getValidLabels(MathHelper.getLabels(dArr[i2], dArr2[i2], this.mRenderer.getYLabels())));
        }
        return map;
    }

    public boolean isRenderNullValues() {
        return false;
    }

    public boolean isRenderPoints(SimpleSeriesRenderer simpleSeriesRenderer) {
        return false;
    }

    public void setCalcRange(double[] dArr, int i) {
        this.mCalcRange.put(Integer.valueOf(i), dArr);
    }

    public void setDatasetRenderer(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        this.mDataset = xYMultipleSeriesDataset;
        this.mRenderer = xYMultipleSeriesRenderer;
    }

    public void setScreenR(Rect rect) {
        this.mScreenR = rect;
    }

    public double[] toRealPoint(float f, float f2) {
        return toRealPoint(f, f2, 0);
    }

    public double[] toScreenPoint(double[] dArr) {
        return toScreenPoint(dArr, 0);
    }

    public XYChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        this.mDataset = xYMultipleSeriesDataset;
        this.mRenderer = xYMultipleSeriesRenderer;
    }

    public double[] toRealPoint(float f, float f2, int i) {
        double xAxisMin = this.mRenderer.getXAxisMin(i);
        double xAxisMax = this.mRenderer.getXAxisMax(i);
        double yAxisMin = this.mRenderer.getYAxisMin(i);
        double yAxisMax = this.mRenderer.getYAxisMax(i);
        Rect rect = this.mScreenR;
        double dWidth = (((xAxisMax - xAxisMin) * (f - rect.left)) / rect.width()) + xAxisMin;
        Rect rect2 = this.mScreenR;
        return new double[]{dWidth, (((yAxisMax - yAxisMin) * ((rect2.height() + rect2.top) - f2)) / this.mScreenR.height()) + yAxisMin};
    }

    public double[] toScreenPoint(double[] dArr, int i) {
        double xAxisMin = this.mRenderer.getXAxisMin(i);
        double xAxisMax = this.mRenderer.getXAxisMax(i);
        double yAxisMin = this.mRenderer.getYAxisMin(i);
        double yAxisMax = this.mRenderer.getYAxisMax(i);
        if (!this.mRenderer.isMinXSet(i) || !this.mRenderer.isMaxXSet(i) || !this.mRenderer.isMinXSet(i) || !this.mRenderer.isMaxYSet(i)) {
            double[] calcRange = getCalcRange(i);
            xAxisMin = calcRange[0];
            xAxisMax = calcRange[1];
            yAxisMin = calcRange[2];
            yAxisMax = calcRange[3];
        }
        double dWidth = ((dArr[0] - xAxisMin) * this.mScreenR.width()) / (xAxisMax - xAxisMin);
        Rect rect = this.mScreenR;
        return new double[]{dWidth + rect.left, (((yAxisMax - dArr[1]) * rect.height()) / (yAxisMax - yAxisMin)) + this.mScreenR.top};
    }
}
