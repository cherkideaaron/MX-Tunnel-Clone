package org.achartengine;

import android.graphics.RectF;
import android.view.MotionEvent;
import org.achartengine.chart.AbstractChart;
import org.achartengine.chart.RoundChart;
import org.achartengine.chart.XYChart;
import org.achartengine.renderer.DefaultRenderer;
import org.achartengine.tools.Pan;
import org.achartengine.tools.PanListener;
import org.achartengine.tools.Zoom;
import org.achartengine.tools.ZoomListener;

/* loaded from: classes2.dex */
public class TouchHandler implements ITouchHandler {
    private GraphicalView graphicalView;
    private Pan mPan;
    private Zoom mPinchZoom;
    private DefaultRenderer mRenderer;
    private float oldX;
    private float oldX2;
    private float oldY;
    private float oldY2;
    private RectF zoomR;

    public TouchHandler(GraphicalView graphicalView, AbstractChart abstractChart) {
        this.zoomR = new RectF();
        this.graphicalView = graphicalView;
        this.zoomR = graphicalView.getZoomRectangle();
        this.mRenderer = abstractChart instanceof XYChart ? ((XYChart) abstractChart).getRenderer() : ((RoundChart) abstractChart).getRenderer();
        if (this.mRenderer.isPanEnabled()) {
            this.mPan = new Pan(abstractChart);
        }
        if (this.mRenderer.isZoomEnabled()) {
            this.mPinchZoom = new Zoom(abstractChart, true, 1.0f);
        }
    }

    @Override // org.achartengine.ITouchHandler
    public void addPanListener(PanListener panListener) {
        Pan pan = this.mPan;
        if (pan != null) {
            pan.addPanListener(panListener);
        }
    }

    @Override // org.achartengine.ITouchHandler
    public void addZoomListener(ZoomListener zoomListener) {
        Zoom zoom = this.mPinchZoom;
        if (zoom != null) {
            zoom.addZoomListener(zoomListener);
        }
    }

    @Override // org.achartengine.ITouchHandler
    public boolean handleTouch(MotionEvent motionEvent) {
        Zoom zoom;
        int i;
        float f;
        int action = motionEvent.getAction();
        if (this.mRenderer == null || action != 2) {
            if (action == 0) {
                this.oldX = motionEvent.getX(0);
                this.oldY = motionEvent.getY(0);
                DefaultRenderer defaultRenderer = this.mRenderer;
                if (defaultRenderer != null && defaultRenderer.isZoomEnabled() && this.zoomR.contains(this.oldX, this.oldY)) {
                    float f2 = this.oldX;
                    RectF rectF = this.zoomR;
                    if (f2 < (rectF.width() / 3.0f) + rectF.left) {
                        this.graphicalView.zoomIn();
                        return true;
                    }
                    float f3 = this.oldX;
                    RectF rectF2 = this.zoomR;
                    if (f3 < ((rectF2.width() * 2.0f) / 3.0f) + rectF2.left) {
                        this.graphicalView.zoomOut();
                        return true;
                    }
                    this.graphicalView.zoomReset();
                    return true;
                }
            } else if (action == 1 || action == 6) {
                this.oldX = 0.0f;
                this.oldY = 0.0f;
                this.oldX2 = 0.0f;
                this.oldY2 = 0.0f;
                if (action == 6) {
                    this.oldX = -1.0f;
                    this.oldY = -1.0f;
                }
            }
        } else if (this.oldX >= 0.0f || this.oldY >= 0.0f) {
            float x = motionEvent.getX(0);
            float y = motionEvent.getY(0);
            if (motionEvent.getPointerCount() > 1 && ((this.oldX2 >= 0.0f || this.oldY2 >= 0.0f) && this.mRenderer.isZoomEnabled())) {
                float x2 = motionEvent.getX(1);
                float y2 = motionEvent.getY(1);
                float fAbs = Math.abs(x - x2);
                float fAbs2 = Math.abs(y - y2);
                float fAbs3 = Math.abs(this.oldX - this.oldX2);
                float fAbs4 = Math.abs(this.oldY - this.oldY2);
                float fAbs5 = Math.abs(y - this.oldY) / Math.abs(x - this.oldX);
                float fAbs6 = Math.abs(y2 - this.oldY2) / Math.abs(x2 - this.oldX2);
                double d = fAbs5;
                if (d <= 0.577d && fAbs6 <= 0.577d) {
                    float f4 = fAbs / fAbs3;
                    double d2 = f4;
                    if (d2 > 0.909d && d2 < 1.1d) {
                        this.mPinchZoom.setZoomRate(f4);
                        this.mPinchZoom.apply(1);
                    }
                    f = x2;
                } else if (d < 1.732d || fAbs6 < 1.732d) {
                    if (d > 0.577d && d < 1.732d) {
                        double d3 = fAbs6;
                        if (d3 > 0.577d && d3 < 1.732d) {
                            float f5 = Math.abs(x - this.oldX) >= Math.abs(y - this.oldY) ? fAbs / fAbs3 : fAbs2 / fAbs4;
                            double d4 = f5;
                            if (d4 > 0.909d && d4 < 1.1d) {
                                this.mPinchZoom.setZoomRate(f5);
                                zoom = this.mPinchZoom;
                                i = 0;
                                zoom.apply(i);
                            }
                        }
                    }
                    f = x2;
                } else {
                    float f6 = fAbs2 / fAbs4;
                    double d5 = f6;
                    if (d5 > 0.909d && d5 < 1.1d) {
                        this.mPinchZoom.setZoomRate(f6);
                        zoom = this.mPinchZoom;
                        i = 2;
                        zoom.apply(i);
                    }
                    f = x2;
                }
                this.oldX2 = f;
                this.oldY2 = y2;
            } else if (this.mRenderer.isPanEnabled()) {
                this.mPan.apply(this.oldX, this.oldY, x, y);
                this.oldX2 = 0.0f;
                this.oldY2 = 0.0f;
            }
            this.oldX = x;
            this.oldY = y;
            this.graphicalView.repaint();
            return true;
        }
        return !this.mRenderer.isClickEnabled();
    }

    @Override // org.achartengine.ITouchHandler
    public void removePanListener(PanListener panListener) {
        Pan pan = this.mPan;
        if (pan != null) {
            pan.removePanListener(panListener);
        }
    }

    @Override // org.achartengine.ITouchHandler
    public void removeZoomListener(ZoomListener zoomListener) {
        Zoom zoom = this.mPinchZoom;
        if (zoom != null) {
            zoom.removeZoomListener(zoomListener);
        }
    }
}
