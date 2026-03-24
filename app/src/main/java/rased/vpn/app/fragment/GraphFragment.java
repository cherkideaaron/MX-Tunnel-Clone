package rased.vpn.app.fragment;

import android.app.Fragment;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.charts.LineChart;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.mxtunnel.pro.R;
import defpackage.AbstractC2831iL;
import defpackage.AbstractC3419t9;
import defpackage.Br;
import defpackage.C0327Si;
import defpackage.C0502as;
import defpackage.C2717gH;
import defpackage.C2772hH;
import defpackage.C2827iH;
import defpackage.C2832iM;
import defpackage.C3704yO;
import defpackage.HO;
import defpackage.RunnableC2705g5;
import defpackage.Ur;
import defpackage.Yr;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class GraphFragment extends Fragment {
    public LineChart a;
    public boolean b = false;
    public C2772hH c;
    public ArrayList d;
    public ArrayList e;
    public ArrayList f;
    public ArrayList m;

    public final void a() {
        ArrayList arrayList;
        float f;
        AbstractC3419t9 abstractC3419t9 = (Yr) this.a.getData();
        toString();
        if (abstractC3419t9 != null) {
            C2772hH c2772hH = this.c;
            synchronized (c2772hH) {
                c2772hH.d();
                ArrayList arrayList2 = c2772hH.e;
                arrayList = new ArrayList();
                for (int i = 0; i < arrayList2.size(); i++) {
                    arrayList.add(Long.valueOf(((C2717gH) arrayList2.get(i)).b));
                }
            }
            this.f = arrayList;
            this.m = this.c.c();
            this.d = new ArrayList();
            this.e = new ArrayList();
            float f2 = 0.0f;
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                float fLongValue = ((Long) this.f.get(i2)).longValue() / 1024.0f;
                float fLongValue2 = ((Long) this.m.get(i2)).longValue() / 1024.0f;
                float f3 = i2;
                this.d.add(new C0327Si(f3, fLongValue));
                this.e.add(new C0327Si(f3, fLongValue2));
                if (f2 < fLongValue) {
                    f2 = fLongValue;
                }
                if (f2 < fLongValue2) {
                    f2 = fLongValue2;
                }
            }
            float f4 = 256.0f;
            if (f2 > 224.0f) {
                if (f2 > 256.0f) {
                    if (f2 <= 896.0f) {
                        f4 = 1024.0f;
                    } else {
                        f4 = 2048.0f;
                        f = (f2 >= 1024.0f && f2 >= 1792.0f) ? f2 < 3584.0f ? 4096.0f : f2 < 7168.0f ? 8192.0f : f2 < 14336.0f ? 16384.0f : 32768.0f : 512.0f;
                    }
                }
                f4 = f;
            }
            C0502as c0502as = new C0502as("Download", this.e);
            c0502as.z = 3;
            c0502as.E = 0.2f;
            c0502as.y = true;
            c0502as.j = false;
            c0502as.v = Color.parseColor("#FF0000");
            c0502as.w = 5000;
            c0502as.h(0.5f);
            c0502as.f(0.5f);
            c0502as.j = false;
            c0502as.g(Color.parseColor("#0000FF"));
            c0502as.e();
            c0502as.B = 0;
            c0502as.H = false;
            C0502as c0502as2 = new C0502as("Upload", this.d);
            c0502as2.z = 3;
            c0502as2.E = 0.2f;
            c0502as2.y = true;
            c0502as2.j = false;
            c0502as2.v = Color.parseColor("#0000FF");
            c0502as2.w = 5000;
            c0502as2.h(0.5f);
            c0502as2.f(0.5f);
            c0502as2.g(Color.parseColor("#FF0000"));
            c0502as2.e();
            c0502as2.B = 0;
            c0502as2.r = Color.rgb(0, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, 0);
            c0502as2.j = false;
            c0502as2.H = false;
            toString();
            Ur ur = new Ur(f2);
            ur.h = AbstractC2831iL.c(1.0f);
            ur.l = new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f);
            ur.m = 1;
            ur.a();
            ur.f = Color.parseColor("#428EAE");
            ur.i = 0;
            Typeface typeface = Typeface.DEFAULT;
            ur.d = typeface;
            C3704yO xAxis = this.a.getXAxis();
            xAxis.z = 2;
            xAxis.n = true;
            xAxis.o = true;
            xAxis.l = 2;
            xAxis.m = true;
            xAxis.a();
            xAxis.t = true;
            xAxis.w = 0.0f;
            xAxis.x = Math.abs(xAxis.v - 0.0f);
            xAxis.p = true;
            xAxis.d = typeface;
            xAxis.f = Color.parseColor("#428EAE");
            xAxis.a = false;
            xAxis.q = new DashPathEffect(new float[]{5.0f, 5.0f}, 1.0f);
            HO axisLeft = this.a.getAxisLeft();
            axisLeft.getClass();
            axisLeft.l = 2;
            axisLeft.m = true;
            axisLeft.u = true;
            axisLeft.v = f4;
            axisLeft.x = Math.abs(f4 - axisLeft.w);
            axisLeft.t = true;
            axisLeft.w = 0.0f;
            axisLeft.x = Math.abs(axisLeft.v - 0.0f);
            axisLeft.q = new DashPathEffect(new float[]{5.0f, 5.0f}, 1.0f);
            axisLeft.r.clear();
            ArrayList arrayList3 = axisLeft.r;
            arrayList3.add(ur);
            if (arrayList3.size() > 6) {
                Log.e("MPAndroiChart", "Warning! You have more than 6 LimitLines on your axis, do you really want that?");
            }
            axisLeft.s = true;
            axisLeft.f = Color.parseColor("#428EAE");
            axisLeft.a();
            axisLeft.a = false;
            this.a.getAxisRight().a = true;
            HO axisRight = this.a.getAxisRight();
            axisRight.getClass();
            axisRight.l = 10;
            axisRight.m = true;
            float f5 = f4 / 1024.0f;
            axisRight.u = true;
            axisRight.v = f5;
            axisRight.x = Math.abs(f5 - axisRight.w);
            axisRight.t = true;
            axisRight.w = 0.0f;
            axisRight.x = Math.abs(axisRight.v - 0.0f);
            axisRight.q = new DashPathEffect(new float[]{5.0f, 5.0f}, 1.0f);
            axisRight.n = false;
            axisRight.a();
            axisRight.f = Color.parseColor("#428EAE");
            abstractC3419t9.g(0);
            abstractC3419t9.g(1);
            List list = abstractC3419t9.i;
            if (list != null) {
                list.clear();
            }
            abstractC3419t9.a();
            abstractC3419t9.b(c0502as2);
            abstractC3419t9.i.add(c0502as2);
            abstractC3419t9.b(c0502as);
            abstractC3419t9.i.add(c0502as);
            abstractC3419t9.a();
            Br legend = this.a.getLegend();
            legend.a();
            legend.d = Typeface.SERIF;
            legend.f = 0;
            legend.h = 1;
            legend.i = 3;
            legend.j = 1;
            legend.k = false;
            legend.a = false;
            this.a.getDescription().a = false;
            this.a.setData(abstractC3419t9);
            this.a.getViewPortHandler().e(5.0f);
            C2832iM viewPortHandler = this.a.getViewPortHandler();
            viewPortHandler.f = 5.0f;
            viewPortHandler.c(viewPortHandler.a, viewPortHandler.b);
            this.a.d();
            this.a.invalidate();
        }
    }

    public final void b() {
        new DecimalFormat("#.##");
        this.f = new ArrayList();
        this.m = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        float f = 0.0f;
        for (int i = 0; i < this.f.size(); i++) {
            toString();
            float fLongValue = ((Long) this.f.get(i)).longValue() / 1024.0f;
            float fLongValue2 = ((Long) this.m.get(i)).longValue() / 1024.0f;
            float f2 = i;
            this.d.add(new C0327Si(f2, fLongValue));
            this.e.add(new C0327Si(f2, fLongValue2));
            if (f < fLongValue) {
                f = fLongValue;
            }
            if (f < fLongValue2) {
                f = fLongValue2;
            }
        }
        C0502as c0502as = new C0502as("Download", this.d);
        c0502as.h(0.0f);
        c0502as.f(0.0f);
        c0502as.j = false;
        c0502as.g(-16711936);
        c0502as.e();
        c0502as.B = 0;
        C0502as c0502as2 = new C0502as("Upload", this.e);
        c0502as2.h(0.0f);
        c0502as2.f(0.0f);
        c0502as2.j = false;
        c0502as2.g(-65536);
        c0502as2.e();
        c0502as2.B = 0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0502as2);
        arrayList.add(c0502as);
        toString();
        Color.rgb(237, 91, 91);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        AbstractC2831iL.c(1.0f);
        new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f);
        AbstractC2831iL.c(6.0f);
        Typeface typeface = Typeface.DEFAULT;
        C3704yO xAxis = this.a.getXAxis();
        xAxis.z = 2;
        xAxis.h = -16711936;
        this.a.getAxisLeft().a = false;
        this.a.getAxisRight().a = false;
        LineChart lineChart = this.a;
        Yr yr = new Yr();
        yr.a = -3.4028235E38f;
        yr.b = Float.MAX_VALUE;
        yr.c = -3.4028235E38f;
        yr.d = Float.MAX_VALUE;
        yr.e = -3.4028235E38f;
        yr.f = Float.MAX_VALUE;
        yr.g = -3.4028235E38f;
        yr.h = Float.MAX_VALUE;
        yr.i = arrayList;
        yr.a();
        lineChart.setData(yr);
        this.a.setDrawGridBackground(true);
        this.a.setGridBackgroundColor(0);
        this.a.setTouchEnabled(false);
        this.a.getViewPortHandler().e(5.0f);
        C2832iM viewPortHandler = this.a.getViewPortHandler();
        viewPortHandler.f = 5.0f;
        viewPortHandler.c(viewPortHandler.a, viewPortHandler.b);
        this.a.getDescription().a = false;
        this.a.getLegend().a = false;
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.graph, viewGroup, false);
        this.a = (LineChart) viewInflate.findViewById(R.id.chart);
        this.c = C2827iH.s().r();
        try {
            b();
            this.b = true;
            new Thread(new RunnableC2705g5(this, 14)).start();
        } catch (Exception unused) {
        }
        return viewInflate;
    }
}
