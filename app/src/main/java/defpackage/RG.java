package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.mxtunnel.pro.R;

/* loaded from: classes.dex */
public final class RG extends Hu implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public boolean A;
    public final Context b;
    public final MenuC3511uu c;
    public final C3349ru d;
    public final boolean e;
    public final int f;
    public final int m;
    public final int n;
    public final Nu o;
    public PopupWindow.OnDismissListener r;
    public View s;
    public View t;
    public Ou u;
    public ViewTreeObserver v;
    public boolean w;
    public boolean x;
    public int y;
    public final Y2 p = new Y2(this, 3);
    public final J8 q = new J8(this, 5);
    public int z = 0;

    public RG(int i, int i2, MenuC3511uu menuC3511uu, Context context, View view, boolean z) {
        this.b = context;
        this.c = menuC3511uu;
        this.e = z;
        this.d = new C3349ru(menuC3511uu, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.m = i;
        this.n = i2;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.s = view;
        this.o = new Nu(context, null, i, i2);
        menuC3511uu.b(this, context);
    }

    @Override // defpackage.Pu
    public final void a(MenuC3511uu menuC3511uu, boolean z) {
        if (menuC3511uu != this.c) {
            return;
        }
        dismiss();
        Ou ou = this.u;
        if (ou != null) {
            ou.a(menuC3511uu, z);
        }
    }

    @Override // defpackage.RF
    public final boolean b() {
        return !this.w && this.o.F.isShowing();
    }

    @Override // defpackage.Pu
    public final boolean c(FH fh) {
        if (fh.hasVisibleItems()) {
            View view = this.t;
            Ju ju = new Ju(this.m, this.n, fh, this.b, view, this.e);
            Ou ou = this.u;
            ju.i = ou;
            Hu hu = ju.j;
            if (hu != null) {
                hu.f(ou);
            }
            boolean zT = Hu.t(fh);
            ju.h = zT;
            Hu hu2 = ju.j;
            if (hu2 != null) {
                hu2.n(zT);
            }
            ju.k = this.r;
            this.r = null;
            this.c.c(false);
            Nu nu = this.o;
            int width = nu.f;
            int iO = nu.o();
            if ((Gravity.getAbsoluteGravity(this.z, this.s.getLayoutDirection()) & 7) == 5) {
                width += this.s.getWidth();
            }
            if (!ju.b()) {
                if (ju.f != null) {
                    ju.d(width, iO, true, true);
                }
            }
            Ou ou2 = this.u;
            if (ou2 != null) {
                ou2.q(fh);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.Pu
    public final boolean d() {
        return false;
    }

    @Override // defpackage.RF
    public final void dismiss() {
        if (b()) {
            this.o.dismiss();
        }
    }

    @Override // defpackage.Pu
    public final void f(Ou ou) {
        this.u = ou;
    }

    @Override // defpackage.Pu
    public final void h() {
        this.x = false;
        C3349ru c3349ru = this.d;
        if (c3349ru != null) {
            c3349ru.notifyDataSetChanged();
        }
    }

    @Override // defpackage.RF
    public final C0054Ch i() {
        return this.o.c;
    }

    @Override // defpackage.Hu
    public final void m(View view) {
        this.s = view;
    }

    @Override // defpackage.Hu
    public final void n(boolean z) {
        this.d.c = z;
    }

    @Override // defpackage.Hu
    public final void o(int i) {
        this.z = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.w = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.v;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.v = this.t.getViewTreeObserver();
            }
            this.v.removeGlobalOnLayoutListener(this.p);
            this.v = null;
        }
        this.t.removeOnAttachStateChangeListener(this.q);
        PopupWindow.OnDismissListener onDismissListener = this.r;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.o.f = i;
    }

    @Override // defpackage.Hu
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.r = onDismissListener;
    }

    @Override // defpackage.Hu
    public final void r(boolean z) {
        this.A = z;
    }

    @Override // defpackage.Hu
    public final void s(int i) {
        this.o.k(i);
    }

    @Override // defpackage.RF
    public final void show() {
        View view;
        if (b()) {
            return;
        }
        if (this.w || (view = this.s) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.t = view;
        Nu nu = this.o;
        nu.F.setOnDismissListener(this);
        nu.v = this;
        nu.E = true;
        nu.F.setFocusable(true);
        View view2 = this.t;
        boolean z = this.v == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.v = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.p);
        }
        view2.addOnAttachStateChangeListener(this.q);
        nu.u = view2;
        nu.r = this.z;
        boolean z2 = this.x;
        Context context = this.b;
        C3349ru c3349ru = this.d;
        if (!z2) {
            this.y = Hu.l(c3349ru, context, this.f);
            this.x = true;
        }
        nu.q(this.y);
        nu.F.setInputMethodMode(2);
        Rect rect = this.a;
        nu.D = rect != null ? new Rect(rect) : null;
        nu.show();
        C0054Ch c0054Ch = nu.c;
        c0054Ch.setOnKeyListener(this);
        if (this.A) {
            MenuC3511uu menuC3511uu = this.c;
            if (menuC3511uu.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0054Ch, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC3511uu.m);
                }
                frameLayout.setEnabled(false);
                c0054Ch.addHeaderView(frameLayout, null, false);
            }
        }
        nu.p(c3349ru);
        nu.show();
    }

    @Override // defpackage.Hu
    public final void k(MenuC3511uu menuC3511uu) {
    }
}
