package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.mxtunnel.pro.R;
import defpackage.C3397so;
import defpackage.D8;
import defpackage.ML;
import defpackage.RunnableC3680y0;
import defpackage.UL;
import defpackage.V3;
import defpackage.Vs;
import defpackage.Y3;
import defpackage.Z3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f {
    public final ViewGroup a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d = false;
    public boolean e = false;

    public f(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static void a(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                a(childAt, arrayList);
            }
        }
    }

    public static void e(Z3 z3, View view) {
        WeakHashMap weakHashMap = UL.a;
        String strF = ML.f(view);
        if (strF != null) {
            z3.put(strF, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    e(z3, childAt);
                }
            }
        }
    }

    public static f h(ViewGroup viewGroup, C3397so c3397so) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof f) {
            return (f) tag;
        }
        c3397so.getClass();
        f fVar = new f(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, fVar);
        return fVar;
    }

    public static f i(ViewGroup viewGroup, t tVar) {
        return h(viewGroup, tVar.E());
    }

    public static void k(Z3 z3, Collection collection) {
        Iterator it = ((V3) z3.entrySet()).iterator();
        while (true) {
            Y3 y3 = (Y3) it;
            if (!y3.hasNext()) {
                return;
            }
            y3.next();
            View view = (View) y3.getValue();
            WeakHashMap weakHashMap = UL.a;
            if (!collection.contains(ML.f(view))) {
                y3.remove();
            }
        }
    }

    public final void b(int i, int i2, w wVar) {
        synchronized (this.b) {
            try {
                D8 d8 = new D8();
                z zVarF = f(wVar.c);
                if (zVarF != null) {
                    zVarF.c(i, i2);
                    return;
                }
                z zVar = new z(i, i2, wVar, d8);
                this.b.add(zVar);
                zVar.d.add(new y(this, zVar));
                zVar.d.add(new RunnableC3680y0(20, this, zVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.util.ArrayList r37, boolean r38) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 2096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.f.c(java.util.ArrayList, boolean):void");
    }

    public final void d() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = UL.a;
        if (!viewGroup.isAttachedToWindow()) {
            g();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.c);
                    this.c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        z zVar = (z) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + zVar);
                        }
                        zVar.a();
                        if (!zVar.g) {
                            this.c.add(zVar);
                        }
                    }
                    l();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((z) it2.next()).d();
                    }
                    c(arrayList2, this.d);
                    this.d = false;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final z f(l lVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            if (zVar.c.equals(lVar) && !zVar.f) {
                return zVar;
            }
        }
        return null;
    }

    public final void g() {
        String str;
        String str2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.a;
        WeakHashMap weakHashMap = UL.a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            try {
                l();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((z) it.next()).d();
                }
                Iterator it2 = new ArrayList(this.c).iterator();
                while (it2.hasNext()) {
                    z zVar = (z) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(zVar);
                        Log.v("FragmentManager", sb.toString());
                    }
                    zVar.a();
                }
                Iterator it3 = new ArrayList(this.b).iterator();
                while (it3.hasNext()) {
                    z zVar2 = (z) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(zVar2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    zVar2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        synchronized (this.b) {
            try {
                l();
                this.e = false;
                int size = this.b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    z zVar = (z) this.b.get(size);
                    int iC = Vs.c(zVar.c.mView);
                    if (zVar.a == 2 && iC != 2) {
                        this.e = zVar.c.isPostponed();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            if (zVar.b == 2) {
                zVar.c(Vs.b(zVar.c.requireView().getVisibility()), 1);
            }
        }
    }
}
