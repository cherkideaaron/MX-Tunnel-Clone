package org.achartengine.util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class MathHelper {
    private static final NumberFormat FORMAT = NumberFormat.getNumberInstance();
    public static final double NULL_VALUE = Double.MAX_VALUE;

    private MathHelper() {
    }

    private static double[] computeLabels(double d, double d2, int i) {
        boolean z;
        if (Math.abs(d - d2) < 1.0000000116860974E-7d) {
            return new double[]{d, d, 0.0d};
        }
        if (d > d2) {
            z = true;
            d = d2;
            d2 = d;
        } else {
            z = false;
        }
        double dRoundUp = roundUp(Math.abs(d - d2) / i);
        double dCeil = Math.ceil(d / dRoundUp) * dRoundUp;
        double dFloor = Math.floor(d2 / dRoundUp) * dRoundUp;
        return z ? new double[]{dFloor, dCeil, dRoundUp * (-1.0d)} : new double[]{dCeil, dFloor, dRoundUp};
    }

    public static double[] getDoubles(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = list.get(i).doubleValue();
        }
        return dArr;
    }

    public static float[] getFloats(List<Float> list) {
        int size = list.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = list.get(i).floatValue();
        }
        return fArr;
    }

    public static List<Double> getLabels(double d, double d2, int i) {
        FORMAT.setMaximumFractionDigits(5);
        ArrayList arrayList = new ArrayList();
        double[] dArrComputeLabels = computeLabels(d, d2, i);
        int i2 = ((int) ((dArrComputeLabels[1] - dArrComputeLabels[0]) / dArrComputeLabels[2])) + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            double dDoubleValue = (i3 * dArrComputeLabels[2]) + dArrComputeLabels[0];
            try {
                NumberFormat numberFormat = FORMAT;
                dDoubleValue = numberFormat.parse(numberFormat.format(dDoubleValue)).doubleValue();
            } catch (ParseException unused) {
            }
            arrayList.add(Double.valueOf(dDoubleValue));
        }
        return arrayList;
    }

    public static double[] minmax(List<Double> list) {
        if (list.size() == 0) {
            return new double[2];
        }
        double dDoubleValue = list.get(0).doubleValue();
        int size = list.size();
        double dMax = dDoubleValue;
        for (int i = 1; i < size; i++) {
            double dDoubleValue2 = list.get(i).doubleValue();
            dDoubleValue = Math.min(dDoubleValue, dDoubleValue2);
            dMax = Math.max(dMax, dDoubleValue2);
        }
        return new double[]{dDoubleValue, dMax};
    }

    private static double roundUp(double d) {
        int iFloor = (int) Math.floor(Math.log10(d));
        double dPow = Math.pow(10.0d, -iFloor) * d;
        if (dPow > 5.0d) {
            dPow = 10.0d;
        } else if (dPow > 2.0d) {
            dPow = 5.0d;
        } else if (dPow > 1.0d) {
            dPow = 2.0d;
        }
        return Math.pow(10.0d, iFloor) * dPow;
    }
}
