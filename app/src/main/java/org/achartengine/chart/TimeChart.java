package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.renderer.XYMultipleSeriesRenderer;

/* loaded from: classes2.dex */
public class TimeChart extends LineChart {
    public static final long DAY = 86400000;
    public static final String TYPE = "Time";
    private String mDateFormat;
    private Double mStartPoint;
    private boolean mXAxisSmart;

    public TimeChart() {
        this.mXAxisSmart = true;
    }

    @Override // org.achartengine.chart.XYChart
    public void drawXLabels(List<Double> list, Double[] dArr, Canvas canvas, Paint paint, int i, int i2, int i3, double d, double d2, double d3) {
        float f;
        List<Double> list2 = list;
        int size = list.size();
        if (size > 0) {
            boolean zIsShowLabels = this.mRenderer.isShowLabels();
            boolean zIsShowGridY = this.mRenderer.isShowGridY();
            DateFormat dateFormat = getDateFormat(list2.get(0).doubleValue(), list2.get(size - 1).doubleValue());
            int i4 = 0;
            while (i4 < size) {
                long jRound = Math.round(list2.get(i4).doubleValue());
                float f2 = (float) (((jRound - d2) * d) + i);
                if (zIsShowLabels) {
                    paint.setColor(this.mRenderer.getXLabelsColor());
                    float f3 = i3;
                    f = f2;
                    canvas.drawLine(f2, f3, f2, (this.mRenderer.getLabelsTextSize() / 3.0f) + f3, paint);
                    drawText(canvas, dateFormat.format(new Date(jRound)), f2, ((this.mRenderer.getLabelsTextSize() * 4.0f) / 3.0f) + f3, paint, this.mRenderer.getXLabelsAngle());
                } else {
                    f = f2;
                }
                if (zIsShowGridY) {
                    paint.setColor(this.mRenderer.getGridColor());
                    canvas.drawLine(f, i3, f, i2, paint);
                }
                i4++;
                list2 = list;
            }
        }
        drawXTextLabels(dArr, canvas, paint, true, i, i2, i3, d, d2, d3);
    }

    @Override // org.achartengine.chart.LineChart, org.achartengine.chart.XYChart
    public String getChartType() {
        return TYPE;
    }

    public String getDateFormat() {
        return this.mDateFormat;
    }

    @Override // org.achartengine.chart.XYChart
    public List<Double> getXLabels(double d, double d2, int i) {
        if (!this.mXAxisSmart) {
            return super.getXLabels(d, d2, i);
        }
        double d3 = 8.64E7d;
        if (this.mStartPoint == null) {
            this.mStartPoint = Double.valueOf((d - (d % 8.64E7d)) + 8.64E7d + (new Date(Math.round(d)).getTimezoneOffset() * 60000));
        }
        if (i > 25) {
            i = 25;
        }
        double d4 = (d2 - d) / i;
        if (d4 <= 8.64E7d) {
            while (true) {
                double d5 = d3 / 2.0d;
                if (d4 >= d5) {
                    break;
                }
                d3 = d5;
            }
        } else {
            while (d4 > d3) {
                d3 *= 2.0d;
            }
        }
        ArrayList arrayList = new ArrayList();
        double dDoubleValue = this.mStartPoint.doubleValue() - (Math.floor((this.mStartPoint.doubleValue() - d) / d3) * d3);
        int i2 = 0;
        while (dDoubleValue < d2) {
            int i3 = i2 + 1;
            if (i2 > i) {
                break;
            }
            arrayList.add(Double.valueOf(dDoubleValue));
            dDoubleValue += d3;
            i2 = i3;
        }
        return arrayList;
    }

    public boolean isXAxisSmart() {
        return this.mXAxisSmart;
    }

    public void setDateFormat(String str) {
        this.mDateFormat = str;
    }

    public void setXAxisSmart(boolean z) {
        this.mXAxisSmart = z;
    }

    public TimeChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.mXAxisSmart = true;
    }

    private DateFormat getDateFormat(double d, double d2) {
        if (this.mDateFormat != null) {
            try {
                return new SimpleDateFormat(this.mDateFormat);
            } catch (Exception unused) {
            }
        }
        double d3 = d2 - d;
        return (d3 <= 8.64E7d || d3 >= 4.32E8d) ? d3 < 8.64E7d ? DateFormat.getTimeInstance(2) : DateFormat.getDateInstance(2) : DateFormat.getDateTimeInstance(3, 3);
    }
}
