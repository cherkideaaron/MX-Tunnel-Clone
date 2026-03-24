package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class PG extends F0 implements InterfaceC3403su {
    public Context c;
    public ActionBarContextView d;
    public E0 e;
    public WeakReference f;
    public boolean m;
    public MenuC3511uu n;

    @Override // defpackage.F0
    public final void a() {
        if (this.m) {
            return;
        }
        this.m = true;
        this.e.c(this);
    }

    @Override // defpackage.InterfaceC3403su
    public final boolean b(MenuC3511uu menuC3511uu, MenuItem menuItem) {
        return this.e.a(this, menuItem);
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
        return this.n;
    }

    @Override // defpackage.F0
    public final MenuInflater e() {
        return new RH(this.d.getContext());
    }

    @Override // defpackage.F0
    public final CharSequence f() {
        return this.d.getSubtitle();
    }

    @Override // defpackage.F0
    public final CharSequence g() {
        return this.d.getTitle();
    }

    @Override // defpackage.F0
    public final void h() {
        this.e.g(this, this.n);
    }

    @Override // defpackage.F0
    public final boolean i() {
        return this.d.y;
    }

    @Override // defpackage.F0
    public final void j(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.InterfaceC3403su
    public final void k(MenuC3511uu menuC3511uu) {
        h();
        A0 a0 = this.d.d;
        if (a0 != null) {
            a0.l();
        }
    }

    @Override // defpackage.F0
    public final void l(int i) {
        m(this.c.getString(i));
    }

    @Override // defpackage.F0
    public final void m(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // defpackage.F0
    public final void n(int i) {
        o(this.c.getString(i));
    }

    @Override // defpackage.F0
    public final void o(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // defpackage.F0
    public final void p(boolean z) {
        this.b = z;
        this.d.setTitleOptional(z);
    }
}
