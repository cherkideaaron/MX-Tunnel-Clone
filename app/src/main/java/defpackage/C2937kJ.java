package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* renamed from: kJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2937kJ implements Pu {
    public MenuC3511uu a;
    public Cu b;
    public final /* synthetic */ Toolbar c;

    public C2937kJ(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.Pu
    public final boolean c(FH fh) {
        return false;
    }

    @Override // defpackage.Pu
    public final boolean d() {
        return false;
    }

    @Override // defpackage.Pu
    public final boolean e(Cu cu) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.o;
        if (callback instanceof InterfaceC3276qa) {
            ((Eu) ((InterfaceC3276qa) callback)).a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.o);
        toolbar.removeView(toolbar.n);
        toolbar.o = null;
        ArrayList arrayList = toolbar.K;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        cu.C = false;
        cu.n.p(false);
        toolbar.t();
        return true;
    }

    @Override // defpackage.Pu
    public final boolean g(Cu cu) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.n);
            }
            toolbar.addView(toolbar.n);
        }
        View actionView = cu.getActionView();
        toolbar.o = actionView;
        this.b = cu;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.o);
            }
            C2992lJ c2992lJH = Toolbar.h();
            c2992lJH.a = (toolbar.t & 112) | 8388611;
            c2992lJH.b = 2;
            toolbar.o.setLayoutParams(c2992lJH);
            toolbar.addView(toolbar.o);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C2992lJ) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.K.add(childAt);
            }
        }
        toolbar.requestLayout();
        cu.C = true;
        cu.n.p(false);
        KeyEvent.Callback callback = toolbar.o;
        if (callback instanceof InterfaceC3276qa) {
            ((Eu) ((InterfaceC3276qa) callback)).a.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // defpackage.Pu
    public final void h() {
        if (this.b != null) {
            MenuC3511uu menuC3511uu = this.a;
            if (menuC3511uu != null) {
                int size = menuC3511uu.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            e(this.b);
        }
    }

    @Override // defpackage.Pu
    public final void j(Context context, MenuC3511uu menuC3511uu) {
        Cu cu;
        MenuC3511uu menuC3511uu2 = this.a;
        if (menuC3511uu2 != null && (cu = this.b) != null) {
            menuC3511uu2.d(cu);
        }
        this.a = menuC3511uu;
    }

    @Override // defpackage.Pu
    public final void a(MenuC3511uu menuC3511uu, boolean z) {
    }
}
