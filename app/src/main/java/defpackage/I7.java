package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class I7 extends AbstractC0069Df {
    public final /* synthetic */ int k;
    public final /* synthetic */ AbstractC3763zc l;

    public /* synthetic */ I7(AbstractC3763zc abstractC3763zc, int i) {
        this.k = i;
        this.l = abstractC3763zc;
    }

    @Override // defpackage.AbstractC0069Df
    public final void P(int i) {
        switch (this.k) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.l;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.D(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.l;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.s(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.AbstractC0069Df
    public final void Q(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.k) {
            case 0:
                ((BottomSheetBehavior) this.l).v(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.l;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.a.l0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.a.e(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    Vs.u(it.next());
                    throw null;
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    @Override // defpackage.AbstractC0069Df
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.I7.R(android.view.View, float, float):void");
    }

    @Override // defpackage.AbstractC0069Df
    public final int f(View view, int i) {
        switch (this.k) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.l;
                return MO.h(i, sideSheetBehavior.a.B(), sideSheetBehavior.a.A());
        }
    }

    @Override // defpackage.AbstractC0069Df
    public final boolean f0(View view, int i) {
        WeakReference weakReference;
        switch (this.k) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.l;
                int i2 = bottomSheetBehavior.N;
                if (i2 != 1 && !bottomSheetBehavior.c0) {
                    if (i2 == 3 && bottomSheetBehavior.a0 == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.X;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    SystemClock.uptimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.W;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.l;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.p) != null && weakReference.get() == view) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.AbstractC0069Df
    public final int g(View view, int i) {
        switch (this.k) {
            case 0:
                return MO.h(i, ((BottomSheetBehavior) this.l).y(), z());
            default:
                return view.getTop();
        }
    }

    @Override // defpackage.AbstractC0069Df
    public int y(View view) {
        switch (this.k) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.l;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            default:
                return super.y(view);
        }
    }

    @Override // defpackage.AbstractC0069Df
    public int z() {
        switch (this.k) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.l;
                return bottomSheetBehavior.I ? bottomSheetBehavior.V : bottomSheetBehavior.G;
            default:
                return super.z();
        }
    }
}
