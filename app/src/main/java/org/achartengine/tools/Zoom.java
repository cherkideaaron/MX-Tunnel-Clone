package org.achartengine.tools;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.achartengine.chart.AbstractChart;
import org.achartengine.chart.RoundChart;
import org.achartengine.chart.XYChart;
import org.achartengine.renderer.DefaultRenderer;

/* loaded from: classes2.dex */
public class Zoom extends AbstractTool {
    public static final int ZOOM_AXIS_X = 1;
    public static final int ZOOM_AXIS_XY = 0;
    public static final int ZOOM_AXIS_Y = 2;
    private boolean limitsReachedX;
    private boolean limitsReachedY;
    private boolean mZoomIn;
    private List<ZoomListener> mZoomListeners;
    private float mZoomRate;

    public Zoom(AbstractChart abstractChart, boolean z, float f) {
        super(abstractChart);
        this.mZoomListeners = new ArrayList();
        this.limitsReachedX = false;
        this.limitsReachedY = false;
        this.mZoomIn = z;
        setZoomRate(f);
    }

    private synchronized void notifyZoomListeners(ZoomEvent zoomEvent) {
        Iterator<ZoomListener> it = this.mZoomListeners.iterator();
        while (it.hasNext()) {
            it.next().zoomApplied(zoomEvent);
        }
    }

    public synchronized void addZoomListener(ZoomListener zoomListener) {
        this.mZoomListeners.add(zoomListener);
    }

    public void apply(int i) {
        int i2;
        AbstractChart abstractChart = this.mChart;
        if (abstractChart instanceof XYChart) {
            int scalesCount = this.mRenderer.getScalesCount();
            for (int i3 = 0; i3 < scalesCount; i3++) {
                double[] range = getRange(i3);
                checkRange(range, i3);
                double[] zoomLimits = this.mRenderer.getZoomLimits();
                double d = range[0];
                double d2 = range[1];
                double d3 = (d + d2) / 2.0d;
                double d4 = range[2];
                double d5 = range[3];
                double d6 = (d4 + d5) / 2.0d;
                double d7 = d2 - d;
                double d8 = d5 - d4;
                double d9 = d7 / 2.0d;
                double d10 = d3 - d9;
                double d11 = d9 + d3;
                double d12 = d8 / 2.0d;
                double d13 = d6 - d12;
                double d14 = d6 + d12;
                if (i3 == 0) {
                    this.limitsReachedX = zoomLimits != null && (d10 <= zoomLimits[0] || d11 >= zoomLimits[1]);
                    this.limitsReachedY = zoomLimits != null && (d13 <= zoomLimits[2] || d14 >= zoomLimits[3]);
                }
                if (this.mZoomIn) {
                    if (this.mRenderer.isZoomXEnabled() && ((i == 1 || i == 0) && (!this.limitsReachedX || this.mZoomRate >= 1.0f))) {
                        d7 /= this.mZoomRate;
                    }
                    if (this.mRenderer.isZoomYEnabled() && ((i == 2 || i == 0) && (!this.limitsReachedY || this.mZoomRate >= 1.0f))) {
                        d8 /= this.mZoomRate;
                    }
                } else {
                    if (this.mRenderer.isZoomXEnabled() && !this.limitsReachedX && (i == 1 || i == 0)) {
                        d7 *= this.mZoomRate;
                    }
                    if (this.mRenderer.isZoomYEnabled() && !this.limitsReachedY && (i == 2 || i == 0)) {
                        d8 *= this.mZoomRate;
                    }
                }
                if (this.mRenderer.isZoomXEnabled() && (i == 1 || i == 0)) {
                    double d15 = d7 / 2.0d;
                    double d16 = d3 - d15;
                    double d17 = d3 + d15;
                    i2 = 2;
                    setXRange(d16, d17, i3);
                } else {
                    i2 = 2;
                }
                if (this.mRenderer.isZoomYEnabled() && (i == i2 || i == 0)) {
                    double d18 = d8 / 2.0d;
                    setYRange(d6 - d18, d6 + d18, i3);
                }
            }
        } else {
            DefaultRenderer renderer = ((RoundChart) abstractChart).getRenderer();
            renderer.setScale(this.mZoomIn ? renderer.getScale() * this.mZoomRate : renderer.getScale() / this.mZoomRate);
        }
        notifyZoomListeners(new ZoomEvent(this.mZoomIn, this.mZoomRate));
    }

    public synchronized void notifyZoomResetListeners() {
        Iterator<ZoomListener> it = this.mZoomListeners.iterator();
        while (it.hasNext()) {
            it.next().zoomReset();
        }
    }

    public synchronized void removeZoomListener(ZoomListener zoomListener) {
        this.mZoomListeners.add(zoomListener);
    }

    public void setZoomRate(float f) {
        this.mZoomRate = f;
    }
}
