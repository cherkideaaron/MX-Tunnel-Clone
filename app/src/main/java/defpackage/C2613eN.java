package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: eN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2613eN extends F0 implements InterfaceC3403su {
    public final Context c;
    public final MenuC3511uu d;
    public E0 e;
    public WeakReference f;
    public final /* synthetic */ C2668fN m;

    public C2613eN(C2668fN c2668fN, Context context, R2 r2) {
        this.m = c2668fN;
        this.c = context;
        this.e = r2;
        MenuC3511uu menuC3511uu = new MenuC3511uu(context);
        menuC3511uu.l = 1;
        this.d = menuC3511uu;
        menuC3511uu.e = this;
    }

    @Override // defpackage.F0
    public final void a() {
        C2668fN c2668fN = this.m;
        if (c2668fN.u != this) {
            return;
        }
        if (c2668fN.B) {
            c2668fN.v = this;
            c2668fN.w = this.e;
        } else {
            this.e.c(this);
        }
        this.e = null;
        c2668fN.U(false);
        ActionBarContextView actionBarContextView = c2668fN.r;
        if (actionBarContextView.q == null) {
            actionBarContextView.e();
        }
        c2668fN.o.setHideOnContentScrollEnabled(c2668fN.G);
        c2668fN.u = null;
    }

    @Override // defpackage.InterfaceC3403su
    public final boolean b(MenuC3511uu menuC3511uu, MenuItem menuItem) {
        E0 e0 = this.e;
        if (e0 != null) {
            return e0.a(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.F0
    public final View c() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.F0
    public final MenuC3511uu d() {
        return this.d;
    }

    @Override // defpackage.F0
    public final MenuInflater e() {
        return new RH(this.c);
    }

    @Override // defpackage.F0
    public final CharSequence f() {
        return this.m.r.getSubtitle();
    }

    @Override // defpackage.F0
    public final CharSequence g() {
        return this.m.r.getTitle();
    }

    @Override // defpackage.F0
    public final void h() {
        if (this.m.u != this) {
            return;
        }
        MenuC3511uu menuC3511uu = this.d;
        menuC3511uu.w();
        try {
            this.e.g(this, menuC3511uu);
        } finally {
            menuC3511uu.v();
        }
    }

    @Override // defpackage.F0
    public final boolean i() {
        return this.m.r.y;
    }

    @Override // defpackage.F0
    public final void j(View view) {
        this.m.r.setCustomView(view);
        this.f = new WeakReference(view);
    }

    @Override // defpackage.InterfaceC3403su
    public final void k(MenuC3511uu menuC3511uu) {
        if (this.e == null) {
            return;
        }
        h();
        A0 a0 = this.m.r.d;
        if (a0 != null) {
            a0.l();
        }
    }

    @Override // defpackage.F0
    public final void l(int i) {
        m(this.m.m.getResources().getString(i));
    }

    @Override // defpackage.F0
    public final void m(CharSequence charSequence) {
        this.m.r.setSubtitle(charSequence);
    }

    @Override // defpackage.F0
    public final void n(int i) {
        o(this.m.m.getResources().getString(i));
    }

    @Override // defpackage.F0
    public final void o(CharSequence charSequence) {
        this.m.r.setTitle(charSequence);
    }

    @Override // defpackage.F0
    public final void p(boolean z) {
        this.b = z;
        this.m.r.setTitleOptional(z);
    }
}
