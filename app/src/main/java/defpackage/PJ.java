package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class PJ implements Cloneable {
    public static final Animator[] D = new Animator[0];
    public static final int[] E = {2, 1, 3, 4};
    public static final C0360Uh F = new C0360Uh(29);
    public static final ThreadLocal G = new ThreadLocal();
    public AbstractC3279qd B;
    public ArrayList q;
    public ArrayList r;
    public OJ[] s;
    public final String a = getClass().getName();
    public long b = -1;
    public long c = -1;
    public TimeInterpolator d = null;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public C3532vE m = new C3532vE(6);
    public C3532vE n = new C3532vE(6);
    public VJ o = null;
    public final int[] p = E;
    public final ArrayList t = new ArrayList();
    public Animator[] u = D;
    public int v = 0;
    public boolean w = false;
    public boolean x = false;
    public PJ y = null;
    public ArrayList z = null;
    public ArrayList A = new ArrayList();
    public C0360Uh C = F;

    public static void c(C3532vE c3532vE, View view, YJ yj) {
        ((Z3) c3532vE.a).put(view, yj);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) c3532vE.b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = UL.a;
        String strF = ML.f(view);
        if (strF != null) {
            Z3 z3 = (Z3) c3532vE.d;
            if (z3.containsKey(strF)) {
                z3.put(strF, null);
            } else {
                z3.put(strF, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C3240pt c3240pt = (C3240pt) c3532vE.c;
                if (c3240pt.a) {
                    int i = c3240pt.d;
                    long[] jArr = c3240pt.b;
                    Object[] objArr = c3240pt.c;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != AbstractC0115Ga.f) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    c3240pt.a = false;
                    c3240pt.d = i2;
                }
                if (AbstractC0115Ga.e(c3240pt.b, c3240pt.d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c3240pt.g(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c3240pt.d(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c3240pt.g(itemIdAtPosition, null);
                }
            }
        }
    }

    public static Z3 q() {
        ThreadLocal threadLocal = G;
        Z3 z3 = (Z3) threadLocal.get();
        if (z3 != null) {
            return z3;
        }
        Z3 z32 = new Z3();
        threadLocal.set(z32);
        return z32;
    }

    public static boolean v(YJ yj, YJ yj2, String str) {
        Object obj = yj.a.get(str);
        Object obj2 = yj2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(ViewGroup viewGroup) {
        if (this.w) {
            if (!this.x) {
                ArrayList arrayList = this.t;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.u);
                this.u = D;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.u = animatorArr;
                w(this, LH.f);
            }
            this.w = false;
        }
    }

    public void B() {
        I();
        Z3 z3Q = q();
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (z3Q.containsKey(animator)) {
                I();
                if (animator != null) {
                    animator.addListener(new MJ(this, z3Q));
                    long j = this.c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C3028m0(this, 5));
                    animator.start();
                }
            }
        }
        this.A.clear();
        n();
    }

    public void C(long j) {
        this.c = j;
    }

    public void D(AbstractC3279qd abstractC3279qd) {
        this.B = abstractC3279qd;
    }

    public void E(TimeInterpolator timeInterpolator) {
        this.d = timeInterpolator;
    }

    public void F(C0360Uh c0360Uh) {
        if (c0360Uh == null) {
            c0360Uh = F;
        }
        this.C = c0360Uh;
    }

    public void H(long j) {
        this.b = j;
    }

    public final void I() {
        if (this.v == 0) {
            w(this, LH.b);
            this.x = false;
        }
        this.v++;
    }

    public String J(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.c != -1) {
            sb.append("dur(");
            sb.append(this.c);
            sb.append(") ");
        }
        if (this.b != -1) {
            sb.append("dly(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.d != null) {
            sb.append("interp(");
            sb.append(this.d);
            sb.append(") ");
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(OJ oj) {
        if (this.z == null) {
            this.z = new ArrayList();
        }
        this.z.add(oj);
    }

    public void b(View view) {
        this.f.add(view);
    }

    public void d() {
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.u);
        this.u = D;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.u = animatorArr;
        w(this, LH.d);
    }

    public abstract void e(YJ yj);

    public final void f(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            YJ yj = new YJ(view);
            if (z) {
                h(yj);
            } else {
                e(yj);
            }
            yj.c.add(this);
            g(yj);
            c(z ? this.m : this.n, view, yj);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), z);
            }
        }
    }

    public abstract void h(YJ yj);

    public final void i(ViewGroup viewGroup, boolean z) {
        j(z);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        if (size <= 0 && arrayList2.size() <= 0) {
            f(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                YJ yj = new YJ(viewFindViewById);
                if (z) {
                    h(yj);
                } else {
                    e(yj);
                }
                yj.c.add(this);
                g(yj);
                c(z ? this.m : this.n, viewFindViewById, yj);
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            YJ yj2 = new YJ(view);
            if (z) {
                h(yj2);
            } else {
                e(yj2);
            }
            yj2.c.add(this);
            g(yj2);
            c(z ? this.m : this.n, view, yj2);
        }
    }

    public final void j(boolean z) {
        C3532vE c3532vE;
        if (z) {
            ((Z3) this.m.a).clear();
            ((SparseArray) this.m.b).clear();
            c3532vE = this.m;
        } else {
            ((Z3) this.n.a).clear();
            ((SparseArray) this.n.b).clear();
            c3532vE = this.n;
        }
        ((C3240pt) c3532vE.c).b();
    }

    @Override // 
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public PJ clone() {
        try {
            PJ pj = (PJ) super.clone();
            pj.A = new ArrayList();
            pj.m = new C3532vE(6);
            pj.n = new C3532vE(6);
            pj.q = null;
            pj.r = null;
            pj.y = this;
            pj.z = null;
            return pj;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator l(ViewGroup viewGroup, YJ yj, YJ yj2) {
        return null;
    }

    public void m(ViewGroup viewGroup, C3532vE c3532vE, C3532vE c3532vE2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        YJ yj;
        Animator animator;
        YJ yj2;
        Z3 z3Q = q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        p().getClass();
        int i2 = 0;
        while (i2 < size) {
            YJ yj3 = (YJ) arrayList.get(i2);
            YJ yj4 = (YJ) arrayList2.get(i2);
            if (yj3 != null && !yj3.c.contains(this)) {
                yj3 = null;
            }
            if (yj4 != null && !yj4.c.contains(this)) {
                yj4 = null;
            }
            if ((yj3 != null || yj4 != null) && (yj3 == null || yj4 == null || t(yj3, yj4))) {
                Animator animatorL = l(viewGroup, yj3, yj4);
                if (animatorL != null) {
                    String str = this.a;
                    if (yj4 != null) {
                        String[] strArrR = r();
                        view = yj4.b;
                        if (strArrR != null && strArrR.length > 0) {
                            yj2 = new YJ(view);
                            YJ yj5 = (YJ) ((Z3) c3532vE2.a).get(view);
                            i = size;
                            if (yj5 != null) {
                                int i3 = 0;
                                while (i3 < strArrR.length) {
                                    HashMap map = yj2.a;
                                    String str2 = strArrR[i3];
                                    map.put(str2, yj5.a.get(str2));
                                    i3++;
                                    strArrR = strArrR;
                                }
                            }
                            int i4 = z3Q.c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = animatorL;
                                    break;
                                }
                                NJ nj = (NJ) z3Q.get((Animator) z3Q.g(i5));
                                if (nj.c != null && nj.a == view && nj.b.equals(str) && nj.c.equals(yj2)) {
                                    animator = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator = animatorL;
                            yj2 = null;
                        }
                        animatorL = animator;
                        yj = yj2;
                    } else {
                        i = size;
                        view = yj3.b;
                        yj = null;
                    }
                    if (animatorL != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        NJ nj2 = new NJ();
                        nj2.a = view;
                        nj2.b = str;
                        nj2.c = yj;
                        nj2.d = windowId;
                        nj2.e = this;
                        nj2.f = animatorL;
                        z3Q.put(animatorL, nj2);
                        this.A.add(animatorL);
                    }
                }
                i2++;
                size = i;
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                NJ nj3 = (NJ) z3Q.get((Animator) this.A.get(sparseIntArray.keyAt(i6)));
                nj3.f.setStartDelay(nj3.f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final void n() {
        int i = this.v - 1;
        this.v = i;
        if (i == 0) {
            w(this, LH.c);
            for (int i2 = 0; i2 < ((C3240pt) this.m.c).h(); i2++) {
                View view = (View) ((C3240pt) this.m.c).i(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((C3240pt) this.n.c).h(); i3++) {
                View view2 = (View) ((C3240pt) this.n.c).i(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.x = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return (defpackage.YJ) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.YJ o(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            VJ r0 = r5.o
            if (r0 == 0) goto L9
            YJ r6 = r0.o(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.q
            goto L10
        Le:
            java.util.ArrayList r0 = r5.r
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            YJ r4 = (defpackage.YJ) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r6 = r5.r
            goto L36
        L34:
            java.util.ArrayList r6 = r5.q
        L36:
            java.lang.Object r6 = r6.get(r3)
            r1 = r6
            YJ r1 = (defpackage.YJ) r1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.PJ.o(android.view.View, boolean):YJ");
    }

    public final PJ p() {
        VJ vj = this.o;
        return vj != null ? vj.p() : this;
    }

    public String[] r() {
        return null;
    }

    public final YJ s(View view, boolean z) {
        VJ vj = this.o;
        if (vj != null) {
            return vj.s(view, z);
        }
        return (YJ) ((Z3) (z ? this.m : this.n).a).get(view);
    }

    public boolean t(YJ yj, YJ yj2) {
        if (yj == null || yj2 == null) {
            return false;
        }
        String[] strArrR = r();
        if (strArrR == null) {
            Iterator it = yj.a.keySet().iterator();
            while (it.hasNext()) {
                if (v(yj, yj2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrR) {
            if (!v(yj, yj2, str)) {
            }
        }
        return false;
        return true;
    }

    public final String toString() {
        return J("");
    }

    public final boolean u(View view) {
        int id = view.getId();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final void w(PJ pj, LH lh) {
        PJ pj2 = this.y;
        if (pj2 != null) {
            pj2.w(pj, lh);
        }
        ArrayList arrayList = this.z;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.z.size();
        OJ[] ojArr = this.s;
        if (ojArr == null) {
            ojArr = new OJ[size];
        }
        this.s = null;
        OJ[] ojArr2 = (OJ[]) this.z.toArray(ojArr);
        for (int i = 0; i < size; i++) {
            lh.b(ojArr2[i], pj);
            ojArr2[i] = null;
        }
        this.s = ojArr2;
    }

    public void x(View view) {
        if (this.x) {
            return;
        }
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.u);
        this.u = D;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.u = animatorArr;
        w(this, LH.e);
        this.w = true;
    }

    public PJ y(OJ oj) {
        PJ pj;
        ArrayList arrayList = this.z;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(oj) && (pj = this.y) != null) {
            pj.y(oj);
        }
        if (this.z.size() == 0) {
            this.z = null;
        }
        return this;
    }

    public void z(View view) {
        this.f.remove(view);
    }

    public void g(YJ yj) {
    }

    public void G() {
    }
}
