package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Qf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0290Qf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ C0392Wf c;

    public /* synthetic */ RunnableC0290Qf(C0392Wf c0392Wf, ArrayList arrayList, int i) {
        this.a = i;
        this.c = c0392Wf;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    C0392Wf c0392Wf = this.c;
                    if (!zHasNext) {
                        arrayList.clear();
                        c0392Wf.m.remove(arrayList);
                        break;
                    } else {
                        C0375Vf c0375Vf = (C0375Vf) it2.next();
                        JB jb = c0375Vf.a;
                        c0392Wf.getClass();
                        View view = jb.a;
                        int i = c0375Vf.d - c0375Vf.b;
                        int i2 = c0375Vf.e - c0375Vf.c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c0392Wf.p.add(jb);
                        viewPropertyAnimatorAnimate.setDuration(c0392Wf.e).setListener(new C0324Sf(c0392Wf, jb, i, view, i2, viewPropertyAnimatorAnimate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it3.hasNext();
                    C0392Wf c0392Wf2 = this.c;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        c0392Wf2.n.remove(arrayList2);
                        break;
                    } else {
                        C0358Uf c0358Uf = (C0358Uf) it3.next();
                        c0392Wf2.getClass();
                        JB jb2 = c0358Uf.a;
                        View view2 = jb2 == null ? null : jb2.a;
                        JB jb3 = c0358Uf.b;
                        View view3 = jb3 != null ? jb3.a : null;
                        ArrayList arrayList3 = c0392Wf2.r;
                        long j = c0392Wf2.f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(c0358Uf.a);
                            duration.translationX(c0358Uf.e - c0358Uf.c);
                            duration.translationY(c0358Uf.f - c0358Uf.d);
                            it = it3;
                            duration.alpha(0.0f).setListener(new C0341Tf(c0392Wf2, c0358Uf, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c0358Uf.b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C0341Tf(c0392Wf2, c0358Uf, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it4.hasNext();
                    C0392Wf c0392Wf3 = this.c;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        c0392Wf3.l.remove(arrayList4);
                        break;
                    } else {
                        JB jb4 = (JB) it4.next();
                        c0392Wf3.getClass();
                        View view4 = jb4.a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c0392Wf3.o.add(jb4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c0392Wf3.c).setListener(new C0307Rf(c0392Wf3, jb4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                }
        }
    }
}
