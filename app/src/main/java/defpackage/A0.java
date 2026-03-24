package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.mxtunnel.pro.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class A0 implements Pu {
    public RunnableC3680y0 A;
    public C3626x0 B;
    public final Context a;
    public Context b;
    public MenuC3511uu c;
    public final LayoutInflater d;
    public Ou e;
    public Su n;
    public C3734z0 o;
    public Drawable p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public C3572w0 y;
    public C3572w0 z;
    public final int f = R.layout.abc_action_menu_layout;
    public final int m = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray x = new SparseBooleanArray();
    public final C0607co C = new C0607co(this);

    public A0(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    @Override // defpackage.Pu
    public final void a(MenuC3511uu menuC3511uu, boolean z) {
        i();
        C3572w0 c3572w0 = this.z;
        if (c3572w0 != null && c3572w0.b()) {
            c3572w0.j.dismiss();
        }
        Ou ou = this.e;
        if (ou != null) {
            ou.a(menuC3511uu, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [Ru] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View b(Cu cu, View view, ViewGroup viewGroup) {
        View actionView = cu.getActionView();
        if (actionView == null || cu.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof Ru ? (Ru) view : (Ru) this.d.inflate(this.m, viewGroup, false);
            actionMenuItemView.c(cu);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.n);
            if (this.B == null) {
                this.B = new C3626x0(this);
            }
            actionMenuItemView2.setPopupCallback(this.B);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(cu.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.Pu
    public final boolean c(FH fh) {
        boolean z;
        if (!fh.hasVisibleItems()) {
            return false;
        }
        FH fh2 = fh;
        while (true) {
            MenuC3511uu menuC3511uu = fh2.z;
            if (menuC3511uu == this.c) {
                break;
            }
            fh2 = (FH) menuC3511uu;
        }
        ViewGroup viewGroup = (ViewGroup) this.n;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof Ru) && ((Ru) childAt).getItemData() == fh2.A) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        fh.A.getClass();
        int size = fh.f.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            }
            MenuItem item = fh.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        C3572w0 c3572w0 = new C3572w0(this, this.b, fh, view);
        this.z = c3572w0;
        c3572w0.h = z;
        Hu hu = c3572w0.j;
        if (hu != null) {
            hu.n(z);
        }
        C3572w0 c3572w02 = this.z;
        if (!c3572w02.b()) {
            if (c3572w02.f == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c3572w02.d(0, 0, false, false);
        }
        Ou ou = this.e;
        if (ou != null) {
            ou.q(fh);
        }
        return true;
    }

    @Override // defpackage.Pu
    public final boolean d() {
        int size;
        ArrayList arrayListL;
        int i;
        boolean z;
        MenuC3511uu menuC3511uu = this.c;
        if (menuC3511uu != null) {
            arrayListL = menuC3511uu.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i2 = this.v;
        int i3 = this.u;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.n;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            Cu cu = (Cu) arrayListL.get(i4);
            int i7 = cu.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.w && cu.C) {
                i2 = 0;
            }
            i4++;
        }
        if (this.r && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.x;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            Cu cu2 = (Cu) arrayListL.get(i9);
            int i11 = cu2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = cu2.b;
            if (z3) {
                View viewB = b(cu2, null, viewGroup);
                viewB.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewB.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                cu2.g(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                if (z5) {
                    View viewB2 = b(cu2, null, viewGroup);
                    viewB2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewB2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z5 &= i3 + i10 > 0;
                }
                if (z5 && i12 != 0) {
                    sparseBooleanArray.put(i12, true);
                } else if (z4) {
                    sparseBooleanArray.put(i12, false);
                    for (int i13 = 0; i13 < i9; i13++) {
                        Cu cu3 = (Cu) arrayListL.get(i13);
                        if (cu3.b == i12) {
                            if (cu3.f()) {
                                i8++;
                            }
                            cu3.g(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                cu2.g(z5);
            } else {
                cu2.g(false);
                i9++;
                i = 2;
                z = true;
            }
            i9++;
            i = 2;
            z = true;
        }
        return z;
    }

    @Override // defpackage.Pu
    public final boolean e(Cu cu) {
        return false;
    }

    @Override // defpackage.Pu
    public final void f(Ou ou) {
        this.e = ou;
    }

    @Override // defpackage.Pu
    public final boolean g(Cu cu) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.Pu
    public final void h() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.n;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            MenuC3511uu menuC3511uu = this.c;
            if (menuC3511uu != null) {
                menuC3511uu.i();
                ArrayList arrayListL = this.c.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    Cu cu = (Cu) arrayListL.get(i2);
                    if (cu.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        Cu itemData = childAt instanceof Ru ? ((Ru) childAt).getItemData() : null;
                        View viewB = b(cu, childAt, viewGroup);
                        if (cu != itemData) {
                            viewB.setPressed(false);
                            viewB.jumpDrawablesToCurrentState();
                        }
                        if (viewB != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewB.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewB);
                            }
                            ((ViewGroup) this.n).addView(viewB, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.o) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.n).requestLayout();
        MenuC3511uu menuC3511uu2 = this.c;
        if (menuC3511uu2 != null) {
            menuC3511uu2.i();
            ArrayList arrayList2 = menuC3511uu2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Du du = ((Cu) arrayList2.get(i3)).A;
            }
        }
        MenuC3511uu menuC3511uu3 = this.c;
        if (menuC3511uu3 != null) {
            menuC3511uu3.i();
            arrayList = menuC3511uu3.j;
        }
        if (this.r && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((Cu) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        C3734z0 c3734z0 = this.o;
        if (z) {
            if (c3734z0 == null) {
                this.o = new C3734z0(this, this.a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.o.getParent();
            if (viewGroup3 != this.n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.o);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.n;
                C3734z0 c3734z02 = this.o;
                actionMenuView.getClass();
                C0 c0J = ActionMenuView.j();
                c0J.a = true;
                actionMenuView.addView(c3734z02, c0J);
            }
        } else if (c3734z0 != null) {
            Object parent = c3734z0.getParent();
            Object obj = this.n;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.o);
            }
        }
        ((ActionMenuView) this.n).setOverflowReserved(this.r);
    }

    public final boolean i() {
        Object obj;
        RunnableC3680y0 runnableC3680y0 = this.A;
        if (runnableC3680y0 != null && (obj = this.n) != null) {
            ((View) obj).removeCallbacks(runnableC3680y0);
            this.A = null;
            return true;
        }
        C3572w0 c3572w0 = this.y;
        if (c3572w0 == null) {
            return false;
        }
        if (c3572w0.b()) {
            c3572w0.j.dismiss();
        }
        return true;
    }

    @Override // defpackage.Pu
    public final void j(Context context, MenuC3511uu menuC3511uu) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = menuC3511uu;
        Resources resources = context.getResources();
        if (!this.s) {
            this.r = true;
        }
        int i = 2;
        this.t = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.v = i;
        int measuredWidth = this.t;
        if (this.r) {
            if (this.o == null) {
                C3734z0 c3734z0 = new C3734z0(this, this.a);
                this.o = c3734z0;
                if (this.q) {
                    c3734z0.setImageDrawable(this.p);
                    this.p = null;
                    this.q = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.o.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.o.getMeasuredWidth();
        } else {
            this.o = null;
        }
        this.u = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean k() {
        C3572w0 c3572w0 = this.y;
        return c3572w0 != null && c3572w0.b();
    }

    public final boolean l() {
        MenuC3511uu menuC3511uu;
        if (!this.r || k() || (menuC3511uu = this.c) == null || this.n == null || this.A != null) {
            return false;
        }
        menuC3511uu.i();
        if (menuC3511uu.j.isEmpty()) {
            return false;
        }
        RunnableC3680y0 runnableC3680y0 = new RunnableC3680y0(0, this, new C3572w0(this, this.b, this.c, this.o));
        this.A = runnableC3680y0;
        ((View) this.n).post(runnableC3680y0);
        return true;
    }
}
