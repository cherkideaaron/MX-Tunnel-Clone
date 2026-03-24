package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import java.io.Serializable;
import org.achartengine.model.Point;
import org.achartengine.model.SeriesSelection;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;

/* loaded from: classes2.dex */
public abstract class AbstractChart implements Serializable {
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[PHI: r6
      0x0052: PHI (r6v4 float) = (r6v1 float), (r6v5 float) binds: [B:33:0x006f, B:24:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 float) = (r3v0 float), (r3v5 float) binds: [B:14:0x0035, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e A[PHI: r0 r3 r4
      0x001e: PHI (r0v6 float) = (r0v4 float), (r0v13 float) binds: [B:17:0x003b, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x001e: PHI (r3v1 float) = (r3v0 float), (r3v5 float) binds: [B:17:0x003b, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x001e: PHI (r4v2 float) = (r4v1 float), (r4v4 float) binds: [B:17:0x003b, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static float[] calculateDrawPoints(float r6, float r7, float r8, float r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 141
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.achartengine.chart.AbstractChart.calculateDrawPoints(float, float, float, float, int, int):float[]");
    }

    private String getFitText(String str, float f, Paint paint) {
        int length = str.length();
        String str2 = str;
        int i = 0;
        while (paint.measureText(str2) > f && i < length) {
            i++;
            str2 = str.substring(0, length - i) + "...";
        }
        return i == length ? "..." : str2;
    }

    public abstract void draw(Canvas canvas, int i, int i2, int i3, int i4, Paint paint);

    public void drawBackground(DefaultRenderer defaultRenderer, Canvas canvas, int i, int i2, int i3, int i4, Paint paint, boolean z, int i5) {
        if (defaultRenderer.isApplyBackgroundColor() || z) {
            if (z) {
                paint.setColor(i5);
            } else {
                paint.setColor(defaultRenderer.getBackgroundColor());
            }
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(i, i2, i + i3, i2 + i4, paint);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void drawLabel(android.graphics.Canvas r18, java.lang.String r19, org.achartengine.renderer.DefaultRenderer r20, java.util.List<android.graphics.RectF> r21, int r22, int r23, float r24, float r25, float r26, float r27, int r28, int r29, int r30, android.graphics.Paint r31) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.achartengine.chart.AbstractChart.drawLabel(android.graphics.Canvas, java.lang.String, org.achartengine.renderer.DefaultRenderer, java.util.List, int, int, float, float, float, float, int, int, int, android.graphics.Paint):void");
    }

    public int drawLegend(Canvas canvas, DefaultRenderer defaultRenderer, String[] strArr, int i, int i2, int i3, int i4, int i5, int i6, Paint paint, boolean z) {
        float f;
        float legendTextSize;
        float f2;
        String str;
        int i7;
        String[] strArr2 = strArr;
        float f3 = 32.0f;
        if (defaultRenderer.isShowLegend()) {
            float f4 = i;
            float f5 = ((i3 + i5) - i6) + 32.0f;
            paint.setTextAlign(Paint.Align.LEFT);
            paint.setTextSize(defaultRenderer.getLegendTextSize());
            int iMin = Math.min(strArr2.length, defaultRenderer.getSeriesRendererCount());
            float f6 = f4;
            int i8 = 0;
            while (i8 < iMin) {
                float legendShapeWidth = getLegendShapeWidth(i8);
                String str2 = strArr2[i8];
                paint.setColor(strArr2.length == defaultRenderer.getSeriesRendererCount() ? defaultRenderer.getSeriesRendererAt(i8).getColor() : DefaultRenderer.TEXT_COLOR);
                int length = str2.length();
                float[] fArr = new float[length];
                paint.getTextWidths(str2, fArr);
                float f7 = 0.0f;
                for (int i9 = 0; i9 < length; i9++) {
                    f7 += fArr[i9];
                }
                float f8 = legendShapeWidth + 10.0f + f7;
                float f9 = f6 + f8;
                if (i8 <= 0 || !getExceed(f9, defaultRenderer, i2, i4)) {
                    f = f5;
                    legendTextSize = f3;
                    f2 = f6;
                } else {
                    float legendTextSize2 = defaultRenderer.getLegendTextSize() + f5;
                    f9 = f4 + f8;
                    legendTextSize = defaultRenderer.getLegendTextSize() + f3;
                    f = legendTextSize2;
                    f2 = f4;
                }
                if (getExceed(f9, defaultRenderer, i2, i4)) {
                    float f10 = ((i2 - f2) - legendShapeWidth) - 10.0f;
                    if (isVertical(defaultRenderer)) {
                        f10 = ((i4 - f2) - legendShapeWidth) - 10.0f;
                    }
                    str = str2.substring(0, paint.breakText(str2, true, f10, fArr)) + "...";
                } else {
                    str = str2;
                }
                if (z) {
                    i7 = i8;
                } else {
                    i7 = i8;
                    drawLegendShape(canvas, defaultRenderer.getSeriesRendererAt(i8), f2, f, i8, paint);
                    drawString(canvas, str, f2 + legendShapeWidth + 5.0f, f + 5.0f, paint);
                }
                f6 = f2 + f8;
                i8 = i7 + 1;
                strArr2 = strArr;
                f5 = f;
                f3 = legendTextSize;
            }
        }
        return Math.round(defaultRenderer.getLegendTextSize() + f3);
    }

    public abstract void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f, float f2, int i, Paint paint);

    public void drawPath(Canvas canvas, float[] fArr, Paint paint, boolean z) {
        Path path = new Path();
        int height = canvas.getHeight();
        int width = canvas.getWidth();
        if (fArr.length < 4) {
            return;
        }
        float[] fArrCalculateDrawPoints = calculateDrawPoints(fArr[0], fArr[1], fArr[2], fArr[3], height, width);
        path.moveTo(fArrCalculateDrawPoints[0], fArrCalculateDrawPoints[1]);
        path.lineTo(fArrCalculateDrawPoints[2], fArrCalculateDrawPoints[3]);
        for (int i = 4; i < fArr.length; i += 2) {
            float f = fArr[i - 1];
            if (f >= 0.0f || fArr[i + 1] >= 0.0f) {
                float f2 = height;
                if (f <= f2 || fArr[i + 1] <= f2) {
                    float[] fArrCalculateDrawPoints2 = calculateDrawPoints(fArr[i - 2], f, fArr[i], fArr[i + 1], height, width);
                    if (!z) {
                        path.moveTo(fArrCalculateDrawPoints2[0], fArrCalculateDrawPoints2[1]);
                    }
                    path.lineTo(fArrCalculateDrawPoints2[2], fArrCalculateDrawPoints2[3]);
                }
            }
        }
        if (z) {
            path.lineTo(fArr[0], fArr[1]);
        }
        canvas.drawPath(path, paint);
    }

    public void drawString(Canvas canvas, String str, float f, float f2, Paint paint) {
        String[] strArrSplit = str.split("\n");
        Rect rect = new Rect();
        int iHeight = 0;
        for (int i = 0; i < strArrSplit.length; i++) {
            canvas.drawText(strArrSplit[i], f, iHeight + f2, paint);
            String str2 = strArrSplit[i];
            paint.getTextBounds(str2, 0, str2.length(), rect);
            iHeight = rect.height() + iHeight + 5;
        }
    }

    public boolean getExceed(float f, DefaultRenderer defaultRenderer, int i, int i2) {
        boolean z = f > ((float) i);
        if (isVertical(defaultRenderer)) {
            return f > ((float) i2);
        }
        return z;
    }

    public abstract int getLegendShapeWidth(int i);

    public int getLegendSize(DefaultRenderer defaultRenderer, int i, float f) {
        int legendHeight = defaultRenderer.getLegendHeight();
        if (!defaultRenderer.isShowLegend() || legendHeight != 0) {
            i = legendHeight;
        }
        return (defaultRenderer.isShowLegend() || !defaultRenderer.isShowLabels()) ? i : (int) (((defaultRenderer.getLabelsTextSize() * 4.0f) / 3.0f) + f);
    }

    public SeriesSelection getSeriesAndPointForScreenCoordinate(Point point) {
        return null;
    }

    public boolean isNullValue(double d) {
        return Double.isNaN(d) || Double.isInfinite(d) || d == Double.MAX_VALUE;
    }

    public boolean isVertical(DefaultRenderer defaultRenderer) {
        return (defaultRenderer instanceof XYMultipleSeriesRenderer) && ((XYMultipleSeriesRenderer) defaultRenderer).getOrientation() == XYMultipleSeriesRenderer.Orientation.VERTICAL;
    }
}
