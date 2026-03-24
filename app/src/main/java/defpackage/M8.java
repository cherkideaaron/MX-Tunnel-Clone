package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.mxtunnel.pro.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class M8 extends Hu implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public int A;
    public boolean C;
    public Ou D;
    public ViewTreeObserver E;
    public PopupWindow.OnDismissListener F;
    public boolean G;
    public final Context b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final Handler m;
    public View u;
    public View v;
    public int w;
    public boolean x;
    public boolean y;
    public int z;
    public final ArrayList n = new ArrayList();
    public final ArrayList o = new ArrayList();
    public final Y2 p = new Y2(this, 2);
    public final J8 q = new J8(this, 0);
    public final C0607co r = new C0607co(this);
    public int s = 0;
    public int t = 0;
    public boolean B = false;

    public M8(Context context, View view, int i, int i2, boolean z) {
        this.b = context;
        this.u = view;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.w = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.m = new Handler();
    }

    @Override // defpackage.Pu
    public final void a(MenuC3511uu menuC3511uu, boolean z) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC3511uu == ((L8) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((L8) arrayList.get(i2)).b.c(false);
        }
        L8 l8 = (L8) arrayList.remove(i);
        l8.b.r(this);
        boolean z2 = this.G;
        Nu nu = l8.a;
        if (z2) {
            Ku.b(nu.F, null);
            nu.F.setAnimationStyle(0);
        }
        nu.dismiss();
        int size2 = arrayList.size();
        this.w = size2 > 0 ? ((L8) arrayList.get(size2 - 1)).c : this.u.getLayoutDirection() == 1 ? 0 : 1;
        if (size2 != 0) {
            if (z) {
                ((L8) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        Ou ou = this.D;
        if (ou != null) {
            ou.a(menuC3511uu, true);
        }
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.E.removeGlobalOnLayoutListener(this.p);
            }
            this.E = null;
        }
        this.v.removeOnAttachStateChangeListener(this.q);
        this.F.onDismiss();
    }

    @Override // defpackage.RF
    public final boolean b() {
        ArrayList arrayList = this.o;
        return arrayList.size() > 0 && ((L8) arrayList.get(0)).a.F.isShowing();
    }

    @Override // defpackage.Pu
    public final boolean c(FH fh) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            L8 l8 = (L8) it.next();
            if (fh == l8.b) {
                l8.a.c.requestFocus();
                return true;
            }
        }
        if (!fh.hasVisibleItems()) {
            return false;
        }
        k(fh);
        Ou ou = this.D;
        if (ou != null) {
            ou.q(fh);
        }
        return true;
    }

    @Override // defpackage.Pu
    public final boolean d() {
        return false;
    }

    @Override // defpackage.RF
    public final void dismiss() {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        if (size > 0) {
            L8[] l8Arr = (L8[]) arrayList.toArray(new L8[size]);
            for (int i = size - 1; i >= 0; i--) {
                L8 l8 = l8Arr[i];
                if (l8.a.F.isShowing()) {
                    l8.a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.Pu
    public final void f(Ou ou) {
        this.D = ou;
    }

    @Override // defpackage.Pu
    public final void h() {
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((L8) it.next()).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C3349ru) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.RF
    public final C0054Ch i() {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((L8) arrayList.get(arrayList.size() - 1)).a.c;
    }

    @Override // defpackage.Hu
    public final void k(MenuC3511uu menuC3511uu) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        menuC3511uu.b(this, this.b);
        if (b()) {
            u(menuC3511uu);
        } else {
            this.n.add(menuC3511uu);
        }
    }

    @Override // defpackage.Hu
    public final void m(View view) {
        if (this.u != view) {
            this.u = view;
            this.t = Gravity.getAbsoluteGravity(this.s, view.getLayoutDirection());
        }
    }

    @Override // defpackage.Hu
    public final void n(boolean z) {
        this.B = z;
    }

    @Override // defpackage.Hu
    public final void o(int i) {
        if (this.s != i) {
            this.s = i;
            this.t = Gravity.getAbsoluteGravity(i, this.u.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        L8 l8;
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                l8 = null;
                break;
            }
            l8 = (L8) arrayList.get(i);
            if (!l8.a.F.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (l8 != null) {
            l8.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.Hu
    public final void p(int i) {
        this.x = true;
        this.z = i;
    }

    @Override // defpackage.Hu
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.F = onDismissListener;
    }

    @Override // defpackage.Hu
    public final void r(boolean z) {
        this.C = z;
    }

    @Override // defpackage.Hu
    public final void s(int i) {
        this.y = true;
        this.A = i;
    }

    @Override // defpackage.RF
    public final void show() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.n;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((MenuC3511uu) it.next());
        }
        arrayList.clear();
        View view = this.u;
        this.v = view;
        if (view != null) {
            boolean z = this.E == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.E = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.p);
            }
            this.v.addOnAttachStateChangeListener(this.q);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(defpackage.MenuC3511uu r19) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.M8.u(uu):void");
    }
}
