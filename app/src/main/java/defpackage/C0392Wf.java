package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: Wf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0392Wf extends AbstractC3367sB {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((JB) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // defpackage.AbstractC3367sB
    public final boolean a(JB jb, JB jb2, LA la, LA la2) {
        int i;
        int i2;
        int i3 = la.b;
        int i4 = la.c;
        if (jb2.q()) {
            int i5 = la.b;
            i2 = la.c;
            i = i5;
        } else {
            i = la2.b;
            i2 = la2.c;
        }
        if (jb == jb2) {
            return g(jb, i3, i4, i, i2);
        }
        View view = jb.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(jb);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(jb2);
        float f = -((int) ((i - i3) - translationX));
        View view2 = jb2.a;
        view2.setTranslationX(f);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        C0358Uf c0358Uf = new C0358Uf();
        c0358Uf.a = jb;
        c0358Uf.b = jb2;
        c0358Uf.c = i3;
        c0358Uf.d = i4;
        c0358Uf.e = i;
        c0358Uf.f = i2;
        arrayList.add(c0358Uf);
        return true;
    }

    @Override // defpackage.AbstractC3367sB
    public final void d(JB jb) {
        View view = jb.a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0375Vf) arrayList.get(size)).a == jb) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(jb);
                arrayList.remove(size);
            }
        }
        j(this.k, jb);
        if (this.h.remove(jb)) {
            view.setAlpha(1.0f);
            c(jb);
        }
        if (this.i.remove(jb)) {
            view.setAlpha(1.0f);
            c(jb);
        }
        ArrayList arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, jb);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0375Vf) arrayList5.get(size4)).a == jb) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(jb);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(jb)) {
                view.setAlpha(1.0f);
                c(jb);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(jb);
        this.o.remove(jb);
        this.r.remove(jb);
        this.p.remove(jb);
        i();
    }

    @Override // defpackage.AbstractC3367sB
    public final void e() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0375Vf c0375Vf = (C0375Vf) arrayList.get(size);
            View view = c0375Vf.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c0375Vf.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((JB) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            JB jb = (JB) arrayList3.get(size3);
            jb.a.setAlpha(1.0f);
            c(jb);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0358Uf c0358Uf = (C0358Uf) arrayList4.get(size4);
            JB jb2 = c0358Uf.a;
            if (jb2 != null) {
                k(c0358Uf, jb2);
            }
            JB jb3 = c0358Uf.b;
            if (jb3 != null) {
                k(c0358Uf, jb3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0375Vf c0375Vf2 = (C0375Vf) arrayList6.get(size6);
                    View view2 = c0375Vf2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c0375Vf2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    JB jb4 = (JB) arrayList8.get(size8);
                    jb4.a.setAlpha(1.0f);
                    c(jb4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0358Uf c0358Uf2 = (C0358Uf) arrayList10.get(size10);
                    JB jb5 = c0358Uf2.a;
                    if (jb5 != null) {
                        k(c0358Uf2, jb5);
                    }
                    JB jb6 = c0358Uf2.b;
                    if (jb6 != null) {
                        k(c0358Uf2, jb6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() > 0) {
                Vs.u(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // defpackage.AbstractC3367sB
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean g(JB jb, int i, int i2, int i3, int i4) {
        View view = jb.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) jb.a.getTranslationY());
        l(jb);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(jb);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        C0375Vf c0375Vf = new C0375Vf();
        c0375Vf.a = jb;
        c0375Vf.b = translationX;
        c0375Vf.c = translationY;
        c0375Vf.d = i3;
        c0375Vf.e = i4;
        arrayList.add(c0375Vf);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            Vs.u(arrayList.get(0));
            throw null;
        }
    }

    public final void j(ArrayList arrayList, JB jb) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0358Uf c0358Uf = (C0358Uf) arrayList.get(size);
            if (k(c0358Uf, jb) && c0358Uf.a == null && c0358Uf.b == null) {
                arrayList.remove(c0358Uf);
            }
        }
    }

    public final boolean k(C0358Uf c0358Uf, JB jb) {
        if (c0358Uf.b == jb) {
            c0358Uf.b = null;
        } else {
            if (c0358Uf.a != jb) {
                return false;
            }
            c0358Uf.a = null;
        }
        jb.a.setAlpha(1.0f);
        View view = jb.a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(jb);
        return true;
    }

    public final void l(JB jb) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        jb.a.animate().setInterpolator(s);
        d(jb);
    }
}
