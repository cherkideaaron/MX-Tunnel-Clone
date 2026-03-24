package org.achartengine.renderer;

import android.graphics.Typeface;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DefaultRenderer implements Serializable {
    public static final int BACKGROUND_COLOR = -16777216;
    public static final int NO_COLOR = 0;
    private static final Typeface REGULAR_TEXT_FONT = Typeface.create(Typeface.SERIF, 0);
    public static final int TEXT_COLOR = -3355444;
    private boolean mApplyBackgroundColor;
    private int mBackgroundColor;
    private boolean mInScroll;
    private String mChartTitle = "";
    private float mChartTitleTextSize = 15.0f;
    private String mTextTypefaceName = REGULAR_TEXT_FONT.toString();
    private int mTextTypefaceStyle = 0;
    private boolean mShowAxes = true;
    private int mAxesColor = TEXT_COLOR;
    private boolean mShowLabels = true;
    private int mLabelsColor = TEXT_COLOR;
    private float mLabelsTextSize = 10.0f;
    private boolean mShowLegend = true;
    private float mLegendTextSize = 12.0f;
    private boolean mFitLegend = false;
    private boolean mShowGridX = false;
    private boolean mShowGridY = false;
    private boolean mShowCustomTextGrid = false;
    private List<SimpleSeriesRenderer> mRenderers = new ArrayList();
    private boolean mAntialiasing = true;
    private int mLegendHeight = 0;
    private int[] mMargins = {20, 30, 10, 20};
    private float mScale = 1.0f;
    private boolean mPanEnabled = true;
    private boolean mZoomEnabled = true;
    private boolean mZoomButtonsVisible = false;
    private float mZoomRate = 1.5f;
    private boolean mExternalZoomEnabled = false;
    private float mOriginalScale = 1.0f;
    private boolean mClickEnabled = false;
    private int selectableBuffer = 15;
    private float mStartAngle = 0.0f;

    public void addSeriesRenderer(int i, SimpleSeriesRenderer simpleSeriesRenderer) {
        this.mRenderers.add(i, simpleSeriesRenderer);
    }

    public int getAxesColor() {
        return this.mAxesColor;
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public String getChartTitle() {
        return this.mChartTitle;
    }

    public float getChartTitleTextSize() {
        return this.mChartTitleTextSize;
    }

    public int getLabelsColor() {
        return this.mLabelsColor;
    }

    public float getLabelsTextSize() {
        return this.mLabelsTextSize;
    }

    public int getLegendHeight() {
        return this.mLegendHeight;
    }

    public float getLegendTextSize() {
        return this.mLegendTextSize;
    }

    public int[] getMargins() {
        return this.mMargins;
    }

    public float getOriginalScale() {
        return this.mOriginalScale;
    }

    public float getScale() {
        return this.mScale;
    }

    public int getSelectableBuffer() {
        return this.selectableBuffer;
    }

    public SimpleSeriesRenderer getSeriesRendererAt(int i) {
        return this.mRenderers.get(i);
    }

    public int getSeriesRendererCount() {
        return this.mRenderers.size();
    }

    public SimpleSeriesRenderer[] getSeriesRenderers() {
        return (SimpleSeriesRenderer[]) this.mRenderers.toArray(new SimpleSeriesRenderer[0]);
    }

    public float getStartAngle() {
        return this.mStartAngle;
    }

    public String getTextTypefaceName() {
        return this.mTextTypefaceName;
    }

    public int getTextTypefaceStyle() {
        return this.mTextTypefaceStyle;
    }

    public float getZoomRate() {
        return this.mZoomRate;
    }

    public boolean isAntialiasing() {
        return this.mAntialiasing;
    }

    public boolean isApplyBackgroundColor() {
        return this.mApplyBackgroundColor;
    }

    public boolean isClickEnabled() {
        return this.mClickEnabled;
    }

    public boolean isExternalZoomEnabled() {
        return this.mExternalZoomEnabled;
    }

    public boolean isFitLegend() {
        return this.mFitLegend;
    }

    public boolean isInScroll() {
        return this.mInScroll;
    }

    public boolean isPanEnabled() {
        return this.mPanEnabled;
    }

    public boolean isShowAxes() {
        return this.mShowAxes;
    }

    public boolean isShowCustomTextGrid() {
        return this.mShowCustomTextGrid;
    }

    public boolean isShowGridX() {
        return this.mShowGridX;
    }

    public boolean isShowGridY() {
        return this.mShowGridY;
    }

    public boolean isShowLabels() {
        return this.mShowLabels;
    }

    public boolean isShowLegend() {
        return this.mShowLegend;
    }

    public boolean isZoomButtonsVisible() {
        return this.mZoomButtonsVisible;
    }

    public boolean isZoomEnabled() {
        return this.mZoomEnabled;
    }

    public void removeSeriesRenderer(SimpleSeriesRenderer simpleSeriesRenderer) {
        this.mRenderers.remove(simpleSeriesRenderer);
    }

    public void setAntialiasing(boolean z) {
        this.mAntialiasing = z;
    }

    public void setApplyBackgroundColor(boolean z) {
        this.mApplyBackgroundColor = z;
    }

    public void setAxesColor(int i) {
        this.mAxesColor = i;
    }

    public void setBackgroundColor(int i) {
        this.mBackgroundColor = i;
    }

    public void setChartTitle(String str) {
        this.mChartTitle = str;
    }

    public void setChartTitleTextSize(float f) {
        this.mChartTitleTextSize = f;
    }

    public void setClickEnabled(boolean z) {
        this.mClickEnabled = z;
    }

    public void setExternalZoomEnabled(boolean z) {
        this.mExternalZoomEnabled = z;
    }

    public void setFitLegend(boolean z) {
        this.mFitLegend = z;
    }

    public void setInScroll(boolean z) {
        this.mInScroll = z;
    }

    public void setLabelsColor(int i) {
        this.mLabelsColor = i;
    }

    public void setLabelsTextSize(float f) {
        this.mLabelsTextSize = f;
    }

    public void setLegendHeight(int i) {
        this.mLegendHeight = i;
    }

    public void setLegendTextSize(float f) {
        this.mLegendTextSize = f;
    }

    public void setMargins(int[] iArr) {
        this.mMargins = iArr;
    }

    public void setPanEnabled(boolean z) {
        this.mPanEnabled = z;
    }

    public void setScale(float f) {
        this.mScale = f;
    }

    public void setSelectableBuffer(int i) {
        this.selectableBuffer = i;
    }

    public void setShowAxes(boolean z) {
        this.mShowAxes = z;
    }

    public void setShowCustomTextGrid(boolean z) {
        this.mShowCustomTextGrid = z;
    }

    public void setShowGrid(boolean z) {
        setShowGridX(z);
        setShowGridY(z);
    }

    public void setShowGridX(boolean z) {
        this.mShowGridX = z;
    }

    public void setShowGridY(boolean z) {
        this.mShowGridY = z;
    }

    public void setShowLabels(boolean z) {
        this.mShowLabels = z;
    }

    public void setShowLegend(boolean z) {
        this.mShowLegend = z;
    }

    public void setStartAngle(float f) {
        this.mStartAngle = f;
    }

    public void setTextTypeface(String str, int i) {
        this.mTextTypefaceName = str;
        this.mTextTypefaceStyle = i;
    }

    public void setZoomButtonsVisible(boolean z) {
        this.mZoomButtonsVisible = z;
    }

    public void setZoomEnabled(boolean z) {
        this.mZoomEnabled = z;
    }

    public void setZoomRate(float f) {
        this.mZoomRate = f;
    }

    public void addSeriesRenderer(SimpleSeriesRenderer simpleSeriesRenderer) {
        this.mRenderers.add(simpleSeriesRenderer);
    }
}
