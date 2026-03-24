package defpackage;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class BB {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public AB g;
    public final /* synthetic */ RecyclerView h;

    public BB(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(JB jb, boolean z) {
        RecyclerView.j(jb);
        RecyclerView recyclerView = this.h;
        LB lb = recyclerView.q0;
        if (lb != null) {
            KB kb = lb.e;
            boolean z2 = kb instanceof KB;
            View view = jb.a;
            UL.l(view, z2 ? (M) kb.e.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.s;
            if (arrayList.size() > 0) {
                Vs.u(arrayList.get(0));
                throw null;
            }
            if (recyclerView.j0 != null) {
                recyclerView.f.L(jb);
            }
        }
        jb.s = null;
        jb.r = null;
        AB abC = c();
        abC.getClass();
        int i = jb.f;
        ArrayList arrayList2 = abC.a(i).a;
        if (((C3745zB) abC.a.get(i)).b <= arrayList2.size()) {
            return;
        }
        jb.o();
        arrayList2.add(jb);
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.j0.b()) {
            return !recyclerView.j0.g ? i : recyclerView.d.p(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.j0.b() + recyclerView.y());
    }

    public final AB c() {
        if (this.g == null) {
            AB ab = new AB();
            ab.a = new SparseArray();
            ab.b = 0;
            this.g = ab;
        }
        return this.g;
    }

    public final View d(int i) {
        return j(i, Long.MAX_VALUE).a;
    }

    public final void e() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.C0;
        C0463a7 c0463a7 = this.h.i0;
        int[] iArr2 = (int[]) c0463a7.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c0463a7.c = 0;
    }

    public final void f(int i) {
        ArrayList arrayList = this.c;
        a((JB) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void g(View view) {
        JB jbI = RecyclerView.I(view);
        boolean zL = jbI.l();
        RecyclerView recyclerView = this.h;
        if (zL) {
            recyclerView.removeDetachedView(view, false);
        }
        if (jbI.k()) {
            jbI.n.k(jbI);
        } else if (jbI.r()) {
            jbI.j &= -33;
        }
        h(jbI);
        if (recyclerView.O == null || jbI.i()) {
            return;
        }
        recyclerView.O.d(jbI);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0099, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(defpackage.JB r12) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BB.h(JB):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(android.view.View r4) {
        /*
            r3 = this;
            JB r4 = androidx.recyclerview.widget.RecyclerView.I(r4)
            r0 = 12
            boolean r0 = r4.e(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r3.h
            if (r0 != 0) goto L45
            boolean r0 = r4.m()
            if (r0 == 0) goto L45
            sB r0 = r1.O
            if (r0 == 0) goto L45
            java.util.List r2 = r4.d()
            Wf r0 = (defpackage.C0392Wf) r0
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L45
            boolean r0 = r0.g
            if (r0 == 0) goto L45
            boolean r0 = r4.h()
            if (r0 == 0) goto L2f
            goto L45
        L2f:
            java.util.ArrayList r0 = r3.b
            if (r0 != 0) goto L3a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.b = r0
        L3a:
            r4.n = r3
            r0 = 1
            r4.o = r0
            java.util.ArrayList r0 = r3.b
        L41:
            r0.add(r4)
            goto L78
        L45:
            boolean r0 = r4.h()
            if (r0 == 0) goto L70
            boolean r0 = r4.j()
            if (r0 != 0) goto L70
            oB r0 = r1.q
            boolean r0 = r0.b
            if (r0 == 0) goto L58
            goto L70
        L58:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
            r0.<init>(r2)
            java.lang.String r1 = r1.y()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L70:
            r4.n = r3
            r0 = 0
            r4.o = r0
            java.util.ArrayList r0 = r3.a
            goto L41
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BB.i(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0564 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.JB j(int r27, long r28) {
        /*
            Method dump skipped, instructions count: 1438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BB.j(int, long):JB");
    }

    public final void k(JB jb) {
        (jb.o ? this.b : this.a).remove(jb);
        jb.n = null;
        jb.o = false;
        jb.j &= -33;
    }

    public final void l() {
        AbstractC3529vB abstractC3529vB = this.h.r;
        this.f = this.e + (abstractC3529vB != null ? abstractC3529vB.j : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            f(size);
        }
    }
}
