package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import org.achartengine.model.CategorySeries;
import org.achartengine.model.Point;
import org.achartengine.model.SeriesSelection;
import org.achartengine.renderer.DefaultRenderer;

/* loaded from: classes2.dex */
public class PieChart extends RoundChart {
    private PieMapper mPieMapper;

    public PieChart(CategorySeries categorySeries, DefaultRenderer defaultRenderer) {
        super(categorySeries, defaultRenderer);
        this.mPieMapper = new PieMapper();
    }

    @Override // org.achartengine.chart.AbstractChart
    public void draw(Canvas canvas, int i, int i2, int i3, int i4, Paint paint) {
        String[] strArr;
        int iDrawLegend;
        float f;
        int i5;
        float f2;
        Paint paint2 = paint;
        paint2.setAntiAlias(this.mRenderer.isAntialiasing());
        paint2.setStyle(Paint.Style.FILL);
        paint2.setTextSize(this.mRenderer.getLabelsTextSize());
        float f3 = 0.0f;
        int legendSize = getLegendSize(this.mRenderer, i4 / 5, 0.0f);
        int i6 = i + i3;
        int itemCount = this.mDataset.getItemCount();
        String[] strArr2 = new String[itemCount];
        double value = 0.0d;
        for (int i7 = 0; i7 < itemCount; i7++) {
            value = this.mDataset.getValue(i7) + value;
            strArr2[i7] = this.mDataset.getCategory(i7);
        }
        if (this.mRenderer.isFitLegend()) {
            strArr = strArr2;
            iDrawLegend = drawLegend(canvas, this.mRenderer, strArr2, i, i6, i2, i3, i4, legendSize, paint, true);
        } else {
            strArr = strArr2;
            iDrawLegend = legendSize;
        }
        int i8 = (i2 + i4) - iDrawLegend;
        drawBackground(this.mRenderer, canvas, i, i2, i3, i4, paint, false, 0);
        int iMin = (int) (Math.min(Math.abs(i6 - i), Math.abs(i8 - i2)) * 0.35d * this.mRenderer.getScale());
        if (this.mCenterX == Integer.MAX_VALUE) {
            this.mCenterX = (i + i6) / 2;
        }
        if (this.mCenterY == Integer.MAX_VALUE) {
            this.mCenterY = (i8 + i2) / 2;
        }
        this.mPieMapper.setDimensions(iMin, this.mCenterX, this.mCenterY);
        boolean z = !this.mPieMapper.areAllSegmentPresent(itemCount);
        if (z) {
            this.mPieMapper.clearPieSegments();
        }
        float f4 = iMin;
        float f5 = f4 * 0.9f;
        float f6 = f4 * 1.1f;
        int i9 = this.mCenterX;
        int i10 = this.mCenterY;
        RectF rectF = new RectF(i9 - iMin, i10 - iMin, i9 + iMin, i10 + iMin);
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < itemCount) {
            paint2.setColor(this.mRenderer.getSeriesRendererAt(i11).getColor());
            float value2 = (float) this.mDataset.getValue(i11);
            float f7 = (float) ((value2 / value) * 360.0d);
            canvas.drawArc(rectF, f3, f7, true, paint);
            String category = this.mDataset.getCategory(i11);
            DefaultRenderer defaultRenderer = this.mRenderer;
            int i12 = i11;
            RectF rectF2 = rectF;
            float f8 = f3;
            int i13 = itemCount;
            drawLabel(canvas, category, defaultRenderer, arrayList, this.mCenterX, this.mCenterY, f5, f6, f3, f7, i, i6, defaultRenderer.getLabelsColor(), paint);
            if (z) {
                f = f7;
                i5 = i12;
                f2 = f8;
                this.mPieMapper.addPieSegment(i5, value2, f2, f);
            } else {
                f = f7;
                i5 = i12;
                f2 = f8;
            }
            f3 = f2 + f;
            i11 = i5 + 1;
            paint2 = paint;
            rectF = rectF2;
            itemCount = i13;
        }
        arrayList.clear();
        drawLegend(canvas, this.mRenderer, strArr, i, i6, i2, i3, i4, iDrawLegend, paint, false);
        drawTitle(canvas, i, i2, i3, paint);
    }

    @Override // org.achartengine.chart.AbstractChart
    public SeriesSelection getSeriesAndPointForScreenCoordinate(Point point) {
        return this.mPieMapper.getSeriesAndPointForScreenCoordinate(point);
    }
}
