package org.achartengine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class XYMultipleSeriesDataset implements Serializable {
    private List<XYSeries> mSeries = new ArrayList();

    public synchronized void addSeries(int i, XYSeries xYSeries) {
        this.mSeries.add(i, xYSeries);
    }

    public synchronized XYSeries[] getSeries() {
        return (XYSeries[]) this.mSeries.toArray(new XYSeries[0]);
    }

    public synchronized XYSeries getSeriesAt(int i) {
        return this.mSeries.get(i);
    }

    public synchronized int getSeriesCount() {
        return this.mSeries.size();
    }

    public synchronized void removeSeries(int i) {
        this.mSeries.remove(i);
    }

    public synchronized void addSeries(XYSeries xYSeries) {
        this.mSeries.add(xYSeries);
    }

    public synchronized void removeSeries(XYSeries xYSeries) {
        this.mSeries.remove(xYSeries);
    }
}
