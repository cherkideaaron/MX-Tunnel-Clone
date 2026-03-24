package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;
import org.achartengine.renderer.XYSeriesRenderer;

/* loaded from: classes2.dex */
public class ScatterChart extends XYChart {
    private static final int SHAPE_WIDTH = 10;
    private static final float SIZE = 3.0f;
    public static final String TYPE = "Scatter";
    private float size;

    /* renamed from: org.achartengine.chart.ScatterChart$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$achartengine$chart$PointStyle;

        static {
            int[] iArr = new int[PointStyle.values().length];
            $SwitchMap$org$achartengine$chart$PointStyle = iArr;
            try {
                iArr[PointStyle.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$achartengine$chart$PointStyle[PointStyle.CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$achartengine$chart$PointStyle[PointStyle.TRIANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$achartengine$chart$PointStyle[PointStyle.SQUARE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$achartengine$chart$PointStyle[PointStyle.DIAMOND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$achartengine$chart$PointStyle[PointStyle.POINT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ScatterChart() {
        this.size = SIZE;
    }

    private void drawCircle(Canvas canvas, Paint paint, float f, float f2) {
        canvas.drawCircle(f, f2, this.size, paint);
    }

    private void drawDiamond(Canvas canvas, Paint paint, float[] fArr, float f, float f2) {
        fArr[0] = f;
        float f3 = this.size;
        fArr[1] = f2 - f3;
        fArr[2] = f - f3;
        fArr[3] = f2;
        fArr[4] = f;
        fArr[5] = f2 + f3;
        fArr[6] = f + f3;
        fArr[7] = f2;
        drawPath(canvas, fArr, paint, true);
    }

    private void drawSquare(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.size;
        canvas.drawRect(f - f3, f2 - f3, f + f3, f2 + f3, paint);
    }

    private void drawTriangle(Canvas canvas, Paint paint, float[] fArr, float f, float f2) {
        fArr[0] = f;
        float f3 = this.size;
        fArr[1] = (f2 - f3) - (f3 / 2.0f);
        fArr[2] = f - f3;
        float f4 = f2 + f3;
        fArr[3] = f4;
        fArr[4] = f + f3;
        fArr[5] = f4;
        drawPath(canvas, fArr, paint, true);
    }

    private void drawX(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.size;
        canvas.drawLine(f - f3, f2 - f3, f + f3, f2 + f3, paint);
        float f4 = this.size;
        canvas.drawLine(f + f4, f2 - f4, f - f4, f2 + f4, paint);
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
        XYSeriesRenderer xYSeriesRenderer = (XYSeriesRenderer) simpleSeriesRenderer;
        paint.setStyle(xYSeriesRenderer.isFillPoints() ? Paint.Style.FILL : Paint.Style.STROKE);
        switch (AnonymousClass1.$SwitchMap$org$achartengine$chart$PointStyle[xYSeriesRenderer.getPointStyle().ordinal()]) {
            case 1:
                drawX(canvas, paint, f + 10.0f, f2);
                break;
            case 2:
                drawCircle(canvas, paint, f + 10.0f, f2);
                break;
            case 3:
                drawTriangle(canvas, paint, new float[6], f + 10.0f, f2);
                break;
            case 4:
                drawSquare(canvas, paint, f + 10.0f, f2);
                break;
            case 5:
                drawDiamond(canvas, paint, new float[8], f + 10.0f, f2);
                break;
            case 6:
                canvas.drawPoint(f + 10.0f, f2, paint);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, float[] fArr, SimpleSeriesRenderer simpleSeriesRenderer, float f, int i, int i2) {
        XYSeriesRenderer xYSeriesRenderer = (XYSeriesRenderer) simpleSeriesRenderer;
        paint.setColor(xYSeriesRenderer.getColor());
        paint.setStyle(xYSeriesRenderer.isFillPoints() ? Paint.Style.FILL : Paint.Style.STROKE);
        int length = fArr.length;
        int i3 = 0;
        switch (AnonymousClass1.$SwitchMap$org$achartengine$chart$PointStyle[xYSeriesRenderer.getPointStyle().ordinal()]) {
            case 1:
                while (i3 < length) {
                    drawX(canvas, paint, fArr[i3], fArr[i3 + 1]);
                    i3 += 2;
                }
                break;
            case 2:
                while (i3 < length) {
                    drawCircle(canvas, paint, fArr[i3], fArr[i3 + 1]);
                    i3 += 2;
                }
                break;
            case 3:
                float[] fArr2 = new float[6];
                while (i3 < length) {
                    drawTriangle(canvas, paint, fArr2, fArr[i3], fArr[i3 + 1]);
                    i3 += 2;
                }
                break;
            case 4:
                while (i3 < length) {
                    drawSquare(canvas, paint, fArr[i3], fArr[i3 + 1]);
                    i3 += 2;
                }
                break;
            case 5:
                float[] fArr3 = new float[8];
                while (i3 < length) {
                    drawDiamond(canvas, paint, fArr3, fArr[i3], fArr[i3 + 1]);
                    i3 += 2;
                }
                break;
            case 6:
                canvas.drawPoints(fArr, paint);
                break;
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

    @Override // org.achartengine.chart.XYChart
    public void setDatasetRenderer(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super.setDatasetRenderer(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.size = xYMultipleSeriesRenderer.getPointSize();
    }

    public ScatterChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.size = SIZE;
        this.size = xYMultipleSeriesRenderer.getPointSize();
    }
}
