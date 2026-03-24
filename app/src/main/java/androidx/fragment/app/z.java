package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import defpackage.AbstractC3264qG;
import defpackage.C0607co;
import defpackage.D8;
import defpackage.Vs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z {
    public int a;
    public int b;
    public final l c;
    public final ArrayList d;
    public final HashSet e;
    public boolean f;
    public boolean g;
    public final w h;

    public z(int i, int i2, w wVar, D8 d8) {
        l lVar = wVar.c;
        this.d = new ArrayList();
        this.e = new HashSet();
        this.f = false;
        this.g = false;
        this.a = i;
        this.b = i2;
        this.c = lVar;
        d8.b(new C0607co(this));
        this.h = wVar;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        HashSet hashSet = this.e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            ((D8) it.next()).a();
        }
    }

    public final void b() {
        if (!this.g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.h.j();
    }

    public final void c(int i, int i2) {
        int iA = AbstractC3264qG.A(i2);
        l lVar = this.c;
        if (iA == 0) {
            if (this.a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + lVar + " mFinalState = " + Vs.G(this.a) + " -> " + Vs.G(i) + ". ");
                }
                this.a = i;
                return;
            }
            return;
        }
        if (iA == 1) {
            if (this.a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + lVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + Vs.F(this.b) + " to ADDING.");
                }
                this.a = 2;
                this.b = 2;
                return;
            }
            return;
        }
        if (iA != 2) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + lVar + " mFinalState = " + Vs.G(this.a) + " -> REMOVED. mLifecycleImpact  = " + Vs.F(this.b) + " to REMOVING.");
        }
        this.a = 1;
        this.b = 3;
    }

    public final void d() {
        int i = this.b;
        w wVar = this.h;
        if (i != 2) {
            if (i == 3) {
                l lVar = wVar.c;
                View viewRequireView = lVar.requireView();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + lVar);
                }
                viewRequireView.clearFocus();
                return;
            }
            return;
        }
        l lVar2 = wVar.c;
        View viewFindFocus = lVar2.mView.findFocus();
        if (viewFindFocus != null) {
            lVar2.setFocusedView(viewFindFocus);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + lVar2);
            }
        }
        View viewRequireView2 = this.c.requireView();
        if (viewRequireView2.getParent() == null) {
            wVar.a();
            viewRequireView2.setAlpha(0.0f);
        }
        if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
            viewRequireView2.setVisibility(4);
        }
        viewRequireView2.setAlpha(lVar2.getPostOnViewCreatedAlpha());
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + Vs.G(this.a) + "} {mLifecycleImpact = " + Vs.F(this.b) + "} {mFragment = " + this.c + "}";
    }
}
