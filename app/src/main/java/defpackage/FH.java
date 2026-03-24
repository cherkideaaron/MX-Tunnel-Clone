package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class FH extends MenuC3511uu implements SubMenu {
    public final Cu A;
    public final MenuC3511uu z;

    public FH(Context context, MenuC3511uu menuC3511uu, Cu cu) {
        super(context);
        this.z = menuC3511uu;
        this.A = cu;
    }

    @Override // defpackage.MenuC3511uu
    public final boolean d(Cu cu) {
        return this.z.d(cu);
    }

    @Override // defpackage.MenuC3511uu
    public final boolean e(MenuC3511uu menuC3511uu, MenuItem menuItem) {
        return super.e(menuC3511uu, menuItem) || this.z.e(menuC3511uu, menuItem);
    }

    @Override // defpackage.MenuC3511uu
    public final boolean f(Cu cu) {
        return this.z.f(cu);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.MenuC3511uu
    public final String j() {
        Cu cu = this.A;
        int i = cu != null ? cu.a : 0;
        if (i == 0) {
            return null;
        }
        return Vs.k(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.MenuC3511uu
    public final MenuC3511uu k() {
        return this.z.k();
    }

    @Override // defpackage.MenuC3511uu
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.MenuC3511uu
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.MenuC3511uu
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.MenuC3511uu, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // defpackage.MenuC3511uu, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }
}
