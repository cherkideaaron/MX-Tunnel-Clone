package org.achartengine.chart;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.List;
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
import org.achartengine.renderer.SimpleSeriesRenderer;
import org.achartengine.renderer.XYMultipleSeriesRenderer;

/* loaded from: classes2.dex */
public class CombinedXYChart extends XYChart {
    private XYChart[] mCharts;
    private Class[] xyChartTypes;

    public CombinedXYChart(XYMultipleSeriesDataset xYMultipleSeriesDataset, XYMultipleSeriesRenderer xYMultipleSeriesRenderer, String[] strArr) {
        super(xYMultipleSeriesDataset, xYMultipleSeriesRenderer);
        this.xyChartTypes = new Class[]{TimeChart.class, LineChart.class, CubicLineChart.class, BarChart.class, BubbleChart.class, ScatterChart.class, RangeBarChart.class};
        int length = strArr.length;
        this.mCharts = new XYChart[length];
        for (int i = 0; i < length; i++) {
            try {
                this.mCharts[i] = getXYChart(strArr[i]);
            } catch (Exception unused) {
            }
            if (this.mCharts[i] == null) {
                throw new IllegalArgumentException("Unknown chart type " + strArr[i]);
            }
            XYMultipleSeriesDataset xYMultipleSeriesDataset2 = new XYMultipleSeriesDataset();
            xYMultipleSeriesDataset2.addSeries(xYMultipleSeriesDataset.getSeriesAt(i));
            XYMultipleSeriesRenderer xYMultipleSeriesRenderer2 = new XYMultipleSeriesRenderer();
            xYMultipleSeriesRenderer2.setBarSpacing(xYMultipleSeriesRenderer.getBarSpacing());
            xYMultipleSeriesRenderer2.setPointSize(xYMultipleSeriesRenderer.getPointSize());
            int scaleNumber = xYMultipleSeriesDataset.getSeriesAt(i).getScaleNumber();
            if (xYMultipleSeriesRenderer.isMinXSet(scaleNumber)) {
                xYMultipleSeriesRenderer2.setXAxisMin(xYMultipleSeriesRenderer.getXAxisMin(scaleNumber));
            }
            if (xYMultipleSeriesRenderer.isMaxXSet(scaleNumber)) {
                xYMultipleSeriesRenderer2.setXAxisMax(xYMultipleSeriesRenderer.getXAxisMax(scaleNumber));
            }
            if (xYMultipleSeriesRenderer.isMinYSet(scaleNumber)) {
                xYMultipleSeriesRenderer2.setYAxisMin(xYMultipleSeriesRenderer.getYAxisMin(scaleNumber));
            }
            if (xYMultipleSeriesRenderer.isMaxYSet(scaleNumber)) {
                xYMultipleSeriesRenderer2.setYAxisMax(xYMultipleSeriesRenderer.getYAxisMax(scaleNumber));
            }
            xYMultipleSeriesRenderer2.addSeriesRenderer(xYMultipleSeriesRenderer.getSeriesRendererAt(i));
            this.mCharts[i].setDatasetRenderer(xYMultipleSeriesDataset2, xYMultipleSeriesRenderer2);
        }
    }

    private XYChart getXYChart(String str) {
        int length = this.xyChartTypes.length;
        XYChart xYChart = null;
        for (int i = 0; i < length && xYChart == null; i++) {
            XYChart xYChart2 = (XYChart) this.xyChartTypes[i].newInstance();
            if (str.equals(xYChart2.getChartType())) {
                xYChart = xYChart2;
            }
        }
        return xYChart;
    }

    @Override // org.achartengine.chart.XYChart
    public ClickableArea[] clickableAreasForPoints(float[] fArr, double[] dArr, float f, int i, int i2) {
        return this.mCharts[i].clickableAreasForPoints(fArr, dArr, f, 0, i2);
    }

    @Override // org.achartengine.chart.AbstractChart
    public void drawLegendShape(Canvas canvas, SimpleSeriesRenderer simpleSeriesRenderer, float f, float f2, int i, Paint paint) {
        this.mCharts[i].drawLegendShape(canvas, simpleSeriesRenderer, f, f2, 0, paint);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawSeries(Canvas canvas, Paint paint, float[] fArr, SimpleSeriesRenderer simpleSeriesRenderer, float f, int i, int i2) {
        this.mCharts[i].setScreenR(getScreenR());
        this.mCharts[i].setCalcRange(getCalcRange(this.mDataset.getSeriesAt(i).getScaleNumber()), 0);
        this.mCharts[i].drawSeries(canvas, paint, fArr, simpleSeriesRenderer, f, 0, i2);
    }

    @Override // org.achartengine.chart.XYChart
    public String getChartType() {
        return "Combined";
    }

    @Override // org.achartengine.chart.AbstractChart
    public int getLegendShapeWidth(int i) {
        return this.mCharts[i].getLegendShapeWidth(0);
    }

    @Override // org.achartengine.chart.XYChart
    public void drawSeries(XYSeries xYSeries, Canvas canvas, Paint paint, List<Float> list, SimpleSeriesRenderer simpleSeriesRenderer, float f, int i, XYMultipleSeriesRenderer.Orientation orientation, int i2) {
        this.mCharts[i].setScreenR(getScreenR());
        this.mCharts[i].setCalcRange(getCalcRange(this.mDataset.getSeriesAt(i).getScaleNumber()), 0);
        this.mCharts[i].drawSeries(xYSeries, canvas, paint, list, simpleSeriesRenderer, f, 0, orientation, i2);
    }
}
