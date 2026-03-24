package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import org.achartengine.model.Point;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.renderer.XYMultipleSeriesRenderer;

/* loaded from: classes2.dex */
public class CubicLineChart extends LineChart {
    public static final String TYPE = "Cubic";
    private float firstMultiplier;
    private Point p1;
    private Point p2;
    private Point p3;
    private float secondMultiplier;

    public CubicLineChart() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
        this.firstMultiplier = 0.33f;
        this.secondMultiplier = 1.0f - 0.33f;
    }

    private void calc(float[] fArr, Point point, int i, int i2, float f) {
        float f2 = fArr[i];
        float f3 = fArr[i + 1];
        float f4 = fArr[i2];
        float f5 = fArr[i2 + 1] - f3;
        point.setX(((f4 - f2) * f) + f2);
        point.setY((f5 * f) + f3);
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawPath(Canvas canvas, float[] fArr, Paint paint, boolean z) {
        Path path = new Path();
        path.moveTo(fArr[0], fArr[1]);
        int length = fArr.length;
        if (z) {
            length -= 4;
        }
        int i = length;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 2;
            int i4 = i3 < i ? i3 : i2;
            int i5 = i2 + 4;
            int i6 = i5 < i ? i5 : i4;
            calc(fArr, this.p1, i2, i4, this.secondMultiplier);
            this.p2.setX(fArr[i4]);
            this.p2.setY(fArr[i4 + 1]);
            calc(fArr, this.p3, i4, i6, this.firstMultiplier);
            i2 = i3;
            path.cubicTo(this.p1.getX(), this.p1.getY(), this.p2.getX(), this.p2.getY(), this.p3.getX(), this.p3.getY());
            i = i;
        }
        int i7 = i;
        if (z) {
            for (int i8 = i7; i8 < i7 + 4; i8 += 2) {
                path.lineTo(fArr[i8], fArr[i8 + 1]);
            }
            path.lineTo(fArr[0], fArr[1]);
        }
        canvas.drawPath(path, paint);
    }

    @Override // org.achartengine.chart.LineChart, org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    public CubicLineChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, float f) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
        this.firstMultiplier = f;
        this.secondMultiplier = 1.0f - f;
    }
}
