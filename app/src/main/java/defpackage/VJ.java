package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class VJ extends PJ {
    public int J;
    public ArrayList H = new ArrayList();
    public boolean I = true;
    public boolean K = false;
    public int L = 0;

    @Override // defpackage.PJ
    public final void A(ViewGroup viewGroup) {
        super.A(viewGroup);
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((PJ) this.H.get(i)).A(viewGroup);
        }
    }

    @Override // defpackage.PJ
    public final void B() {
        if (this.H.isEmpty()) {
            I();
            n();
            return;
        }
        UJ uj = new UJ();
        uj.b = this;
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            ((PJ) it.next()).a(uj);
        }
        this.J = this.H.size();
        if (this.I) {
            Iterator it2 = this.H.iterator();
            while (it2.hasNext()) {
                ((PJ) it2.next()).B();
            }
            return;
        }
        for (int i = 1; i < this.H.size(); i++) {
            ((PJ) this.H.get(i - 1)).a(new UJ((PJ) this.H.get(i)));
        }
        PJ pj = (PJ) this.H.get(0);
        if (pj != null) {
            pj.B();
        }
    }

    @Override // defpackage.PJ
    public final void C(long j) {
        ArrayList arrayList;
        this.c = j;
        if (j < 0 || (arrayList = this.H) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((PJ) this.H.get(i)).C(j);
        }
    }

    @Override // defpackage.PJ
    public final void D(AbstractC3279qd abstractC3279qd) {
        this.B = abstractC3279qd;
        this.L |= 8;
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((PJ) this.H.get(i)).D(abstractC3279qd);
        }
    }

    @Override // defpackage.PJ
    public final void E(TimeInterpolator timeInterpolator) {
        this.L |= 1;
        ArrayList arrayList = this.H;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((PJ) this.H.get(i)).E(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // defpackage.PJ
    public final void F(C0360Uh c0360Uh) {
        super.F(c0360Uh);
        this.L |= 4;
        if (this.H != null) {
            for (int i = 0; i < this.H.size(); i++) {
                ((PJ) this.H.get(i)).F(c0360Uh);
            }
        }
    }

    @Override // defpackage.PJ
    public final void G() {
        this.L |= 2;
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((PJ) this.H.get(i)).G();
        }
    }

    @Override // defpackage.PJ
    public final void H(long j) {
        this.b = j;
    }

    @Override // defpackage.PJ
    public final String J(String str) {
        String strJ = super.J(str);
        for (int i = 0; i < this.H.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strJ);
            sb.append("\n");
            sb.append(((PJ) this.H.get(i)).J(str + "  "));
            strJ = sb.toString();
        }
        return strJ;
    }

    public final void K(PJ pj) {
        this.H.add(pj);
        pj.o = this;
        long j = this.c;
        if (j >= 0) {
            pj.C(j);
        }
        if ((this.L & 1) != 0) {
            pj.E(this.d);
        }
        if ((this.L & 2) != 0) {
            pj.G();
        }
        if ((this.L & 4) != 0) {
            pj.F(this.C);
        }
        if ((this.L & 8) != 0) {
            pj.D(this.B);
        }
    }

    @Override // defpackage.PJ
    public final void a(OJ oj) {
        super.a(oj);
    }

    @Override // defpackage.PJ
    public final void b(View view) {
        for (int i = 0; i < this.H.size(); i++) {
            ((PJ) this.H.get(i)).b(view);
        }
        this.f.add(view);
    }

    @Override // defpackage.PJ
    public final void d() {
        super.d();
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((PJ) this.H.get(i)).d();
        }
    }

    @Override // defpackage.PJ
    public final void e(YJ yj) {
        if (u(yj.b)) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                PJ pj = (PJ) it.next();
                if (pj.u(yj.b)) {
                    pj.e(yj);
                    yj.c.add(pj);
                }
            }
        }
    }

    @Override // defpackage.PJ
    public final void g(YJ yj) {
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((PJ) this.H.get(i)).g(yj);
        }
    }

    @Override // defpackage.PJ
    public final void h(YJ yj) {
        if (u(yj.b)) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                PJ pj = (PJ) it.next();
                if (pj.u(yj.b)) {
                    pj.h(yj);
                    yj.c.add(pj);
                }
            }
        }
    }

    @Override // defpackage.PJ
    /* renamed from: k */
    public final PJ clone() {
        VJ vj = (VJ) super.clone();
        vj.H = new ArrayList();
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            PJ pjClone = ((PJ) this.H.get(i)).clone();
            vj.H.add(pjClone);
            pjClone.o = vj;
        }
        return vj;
    }

    @Override // defpackage.PJ
    public final void m(ViewGroup viewGroup, C3532vE c3532vE, C3532vE c3532vE2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            PJ pj = (PJ) this.H.get(i);
            if (j > 0 && (this.I || i == 0)) {
                long j2 = pj.b;
                if (j2 > 0) {
                    pj.H(j2 + j);
                } else {
                    pj.H(j);
                }
            }
            pj.m(viewGroup, c3532vE, c3532vE2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.PJ
    public final void x(View view) {
        super.x(view);
        int size = this.H.size();
        for (int i = 0; i < size; i++) {
            ((PJ) this.H.get(i)).x(view);
        }
    }

    @Override // defpackage.PJ
    public final PJ y(OJ oj) {
        super.y(oj);
        return this;
    }

    @Override // defpackage.PJ
    public final void z(View view) {
        for (int i = 0; i < this.H.size(); i++) {
            ((PJ) this.H.get(i)).z(view);
        }
        this.f.remove(view);
    }
}
