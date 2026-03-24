package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: Tm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0348Tm extends AbstractC0263Om {
    @Override // defpackage.AbstractC0263Om
    public final void a(View view, Object obj) {
        ((PJ) obj).b(view);
    }

    @Override // defpackage.AbstractC0263Om
    public final void b(Object obj, ArrayList arrayList) {
        PJ pj = (PJ) obj;
        if (pj == null) {
            return;
        }
        int i = 0;
        if (pj instanceof VJ) {
            VJ vj = (VJ) pj;
            int size = vj.H.size();
            while (i < size) {
                b((i < 0 || i >= vj.H.size()) ? null : (PJ) vj.H.get(i), arrayList);
                i++;
            }
            return;
        }
        if (AbstractC0263Om.h(pj.e) && AbstractC0263Om.h(null) && AbstractC0263Om.h(null) && AbstractC0263Om.h(pj.f)) {
            int size2 = arrayList.size();
            while (i < size2) {
                pj.b((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.AbstractC0263Om
    public final void c(ViewGroup viewGroup, Object obj) {
        TJ.a(viewGroup, (PJ) obj);
    }

    @Override // defpackage.AbstractC0263Om
    public final boolean e(Object obj) {
        return obj instanceof PJ;
    }

    @Override // defpackage.AbstractC0263Om
    public final Object f(Object obj) {
        if (obj != null) {
            return ((PJ) obj).clone();
        }
        return null;
    }

    @Override // defpackage.AbstractC0263Om
    public final Object i(Object obj, Object obj2, Object obj3) {
        PJ pj = (PJ) obj;
        PJ pj2 = (PJ) obj2;
        PJ pj3 = (PJ) obj3;
        if (pj != null && pj2 != null) {
            VJ vj = new VJ();
            vj.K(pj);
            vj.K(pj2);
            vj.I = false;
            pj = vj;
        } else if (pj == null) {
            pj = pj2 != null ? pj2 : null;
        }
        if (pj3 == null) {
            return pj;
        }
        VJ vj2 = new VJ();
        if (pj != null) {
            vj2.K(pj);
        }
        vj2.K(pj3);
        return vj2;
    }

    @Override // defpackage.AbstractC0263Om
    public final Object j(Object obj, Object obj2) {
        VJ vj = new VJ();
        if (obj != null) {
            vj.K((PJ) obj);
        }
        vj.K((PJ) obj2);
        return vj;
    }

    @Override // defpackage.AbstractC0263Om
    public final void k(Object obj, View view, ArrayList arrayList) {
        ((PJ) obj).a(new C0297Qm(view, arrayList));
    }

    @Override // defpackage.AbstractC0263Om
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((PJ) obj).a(new C0314Rm(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.AbstractC0263Om
    public final void m(View view, Object obj) {
        if (view != null) {
            AbstractC0263Om.g(view, new Rect());
            ((PJ) obj).D(new C0280Pm());
        }
    }

    @Override // defpackage.AbstractC0263Om
    public final void n(Object obj, Rect rect) {
        ((PJ) obj).D(new C0280Pm());
    }

    @Override // defpackage.AbstractC0263Om
    public final void o(Object obj, D8 d8, RunnableC3680y0 runnableC3680y0) {
        PJ pj = (PJ) obj;
        d8.b(new C0271Pd(pj, runnableC3680y0));
        pj.a(new C0331Sm(runnableC3680y0));
    }

    @Override // defpackage.AbstractC0263Om
    public final void p(Object obj, View view, ArrayList arrayList) {
        VJ vj = (VJ) obj;
        ArrayList arrayList2 = vj.f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0263Om.d(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(vj, arrayList);
    }

    @Override // defpackage.AbstractC0263Om
    public final void q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        VJ vj = (VJ) obj;
        if (vj != null) {
            ArrayList arrayList3 = vj.f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(vj, arrayList, arrayList2);
        }
    }

    @Override // defpackage.AbstractC0263Om
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        VJ vj = new VJ();
        vj.K((PJ) obj);
        return vj;
    }

    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        PJ pj = (PJ) obj;
        int i = 0;
        if (pj instanceof VJ) {
            VJ vj = (VJ) pj;
            int size = vj.H.size();
            while (i < size) {
                s((i < 0 || i >= vj.H.size()) ? null : (PJ) vj.H.get(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (AbstractC0263Om.h(pj.e) && AbstractC0263Om.h(null) && AbstractC0263Om.h(null)) {
            ArrayList arrayList3 = pj.f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    pj.b((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    pj.z((View) arrayList.get(size3));
                }
            }
        }
    }
}
