package org.achartengine.model;

import java.util.Date;

/* loaded from: classes2.dex */
public class TimeSeries extends XYSeries {
    public TimeSeries(String str) {
        super(str);
    }

    public synchronized void add(Date date, double d) {
        super.add(date.getTime(), d);
    }
}
