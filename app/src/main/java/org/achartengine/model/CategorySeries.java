package org.achartengine.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class CategorySeries implements Serializable {
    private String mTitle;
    private List<String> mCategories = new ArrayList();
    private List<Double> mValues = new ArrayList();

    public CategorySeries(String str) {
        this.mTitle = str;
    }

    public synchronized void add(double d) {
        add(this.mCategories.size() + "", d);
    }

    public synchronized void clear() {
        this.mCategories.clear();
        this.mValues.clear();
    }

    public synchronized String getCategory(int i) {
        return this.mCategories.get(i);
    }

    public synchronized int getItemCount() {
        return this.mCategories.size();
    }

    public String getTitle() {
        return this.mTitle;
    }

    public synchronized double getValue(int i) {
        return this.mValues.get(i).doubleValue();
    }

    public synchronized void remove(int i) {
        this.mCategories.remove(i);
        this.mValues.remove(i);
    }

    public synchronized void set(int i, String str, double d) {
        this.mCategories.set(i, str);
        this.mValues.set(i, Double.valueOf(d));
    }

    public XYSeries toXYSeries() {
        XYSeries xYSeries = new XYSeries(this.mTitle);
        Iterator<Double> it = this.mValues.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            xYSeries.add(i, it.next().doubleValue());
        }
        return xYSeries;
    }

    public synchronized void add(String str, double d) {
        this.mCategories.add(str);
        this.mValues.add(Double.valueOf(d));
    }
}
