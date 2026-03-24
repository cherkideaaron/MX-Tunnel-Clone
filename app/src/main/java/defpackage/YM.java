package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class YM {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                YM ym = (YM) arrayList.get(i);
                if (this.e == ym.b) {
                    c(this.c, ym);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C2855is c2855is, int i) {
        int iN;
        C0167Jb c0167Jb;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C2620ec c2620ec = (C2620ec) ((C2566dc) arrayList.get(0)).S;
        c2855is.t();
        c2620ec.b(c2855is, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C2566dc) arrayList.get(i2)).b(c2855is, false);
        }
        if (i == 0 && c2620ec.y0 > 0) {
            AbstractC0136He.b(c2620ec, c2855is, arrayList, 0);
        }
        if (i == 1 && c2620ec.z0 > 0) {
            AbstractC0136He.b(c2620ec, c2855is, arrayList, 1);
        }
        try {
            c2855is.p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C2566dc c2566dc = (C2566dc) arrayList.get(i3);
            C0587cM c0587cM = new C0587cM();
            new WeakReference(c2566dc);
            C2855is.n(c2566dc.H);
            C2855is.n(c2566dc.I);
            C2855is.n(c2566dc.J);
            C2855is.n(c2566dc.K);
            C2855is.n(c2566dc.L);
            this.d.add(c0587cM);
        }
        if (i == 0) {
            iN = C2855is.n(c2620ec.H);
            c0167Jb = c2620ec.J;
        } else {
            iN = C2855is.n(c2620ec.I);
            c0167Jb = c2620ec.K;
        }
        int iN2 = C2855is.n(c0167Jb);
        c2855is.t();
        return iN2 - iN;
    }

    public final void c(int i, YM ym) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            C2566dc c2566dc = (C2566dc) it.next();
            ArrayList arrayList = ym.a;
            if (!arrayList.contains(c2566dc)) {
                arrayList.add(c2566dc);
            }
            int i2 = ym.b;
            if (i == 0) {
                c2566dc.m0 = i2;
            } else {
                c2566dc.n0 = i2;
            }
        }
        this.e = ym.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String strJ = AbstractC3264qG.j(sb, this.b, "] <");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            strJ = strJ + " " + ((C2566dc) it.next()).g0;
        }
        return AbstractC3264qG.g(strJ, " >");
    }
}
