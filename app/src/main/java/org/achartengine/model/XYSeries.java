package org.achartengine.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.SortedMap;
import org.achartengine.util.IndexXYMap;
import org.achartengine.util.XYEntry;

/* loaded from: classes2.dex */
public class XYSeries implements Serializable {
    private double mMaxX;
    private double mMaxY;
    private double mMinX;
    private double mMinY;
    private final int mScaleNumber;
    private String mTitle;
    private final IndexXYMap<Double, Double> mXY;

    public XYSeries(String str) {
        this(str, 0);
    }

    private void initRange() {
        this.mMinX = Double.MAX_VALUE;
        this.mMaxX = -1.7976931348623157E308d;
        this.mMinY = Double.MAX_VALUE;
        this.mMaxY = -1.7976931348623157E308d;
        int itemCount = getItemCount();
        for (int i = 0; i < itemCount; i++) {
            updateRange(getX(i), getY(i));
        }
    }

    private void updateRange(double d, double d2) {
        this.mMinX = Math.min(this.mMinX, d);
        this.mMaxX = Math.max(this.mMaxX, d);
        this.mMinY = Math.min(this.mMinY, d2);
        this.mMaxY = Math.max(this.mMaxY, d2);
    }

    public synchronized void add(double d, double d2) {
        this.mXY.put(Double.valueOf(d), Double.valueOf(d2));
        updateRange(d, d2);
    }

    public synchronized void clear() {
        this.mXY.clear();
        initRange();
    }

    public int getIndexForKey(double d) {
        return this.mXY.getIndexForKey(Double.valueOf(d));
    }

    public synchronized int getItemCount() {
        return this.mXY.size();
    }

    public double getMaxX() {
        return this.mMaxX;
    }

    public double getMaxY() {
        return this.mMaxY;
    }

    public double getMinX() {
        return this.mMinX;
    }

    public double getMinY() {
        return this.mMinY;
    }

    public synchronized SortedMap<Double, Double> getRange(double d, double d2, int i) {
        try {
            SortedMap<Double, Double> sortedMapHeadMap = this.mXY.headMap(Double.valueOf(d));
            if (!sortedMapHeadMap.isEmpty()) {
                d = sortedMapHeadMap.lastKey().doubleValue();
            }
            SortedMap<Double, Double> sortedMapTailMap = this.mXY.tailMap(Double.valueOf(d2));
            if (!sortedMapTailMap.isEmpty()) {
                Iterator<Double> it = sortedMapTailMap.keySet().iterator();
                d2 = it.hasNext() ? it.next().doubleValue() : d2 + it.next().doubleValue();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.mXY.subMap(Double.valueOf(d), Double.valueOf(d2));
    }

    public int getScaleNumber() {
        return this.mScaleNumber;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public synchronized double getX(int i) {
        return this.mXY.getXByIndex(i).doubleValue();
    }

    public synchronized double getY(int i) {
        return this.mXY.getYByIndex(i).doubleValue();
    }

    public synchronized void remove(int i) {
        try {
            XYEntry<Double, Double> xYEntryRemoveByIndex = this.mXY.removeByIndex(i);
            double dDoubleValue = xYEntryRemoveByIndex.getKey().doubleValue();
            double dDoubleValue2 = xYEntryRemoveByIndex.getValue().doubleValue();
            if (dDoubleValue == this.mMinX || dDoubleValue == this.mMaxX || dDoubleValue2 == this.mMinY || dDoubleValue2 == this.mMaxY) {
                initRange();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public XYSeries(String str, int i) {
        this.mXY = new IndexXYMap<>();
        this.mMinX = Double.MAX_VALUE;
        this.mMaxX = -1.7976931348623157E308d;
        this.mMinY = Double.MAX_VALUE;
        this.mMaxY = -1.7976931348623157E308d;
        this.mTitle = str;
        this.mScaleNumber = i;
        initRange();
    }
}
