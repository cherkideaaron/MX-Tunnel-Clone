package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* renamed from: qs, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3294qs implements Pu, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public MenuC3511uu c;
    public ExpandedMenuView d;
    public Ou e;
    public C3239ps f;

    public C3294qs(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // defpackage.Pu
    public final void a(MenuC3511uu menuC3511uu, boolean z) {
        Ou ou = this.e;
        if (ou != null) {
            ou.a(menuC3511uu, z);
        }
    }

    @Override // defpackage.Pu
    public final boolean c(FH fh) {
        if (!fh.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC3565vu dialogInterfaceOnKeyListenerC3565vu = new DialogInterfaceOnKeyListenerC3565vu();
        dialogInterfaceOnKeyListenerC3565vu.a = fh;
        Context context = fh.a;
        C3249q1 c3249q1 = new C3249q1(context);
        C3084n1 c3084n1 = (C3084n1) c3249q1.c;
        C3294qs c3294qs = new C3294qs(c3084n1.a);
        dialogInterfaceOnKeyListenerC3565vu.c = c3294qs;
        c3294qs.e = dialogInterfaceOnKeyListenerC3565vu;
        fh.b(c3294qs, context);
        C3294qs c3294qs2 = dialogInterfaceOnKeyListenerC3565vu.c;
        if (c3294qs2.f == null) {
            c3294qs2.f = new C3239ps(c3294qs2);
        }
        c3084n1.p = c3294qs2.f;
        c3084n1.q = dialogInterfaceOnKeyListenerC3565vu;
        View view = fh.o;
        if (view != null) {
            c3084n1.f = view;
        } else {
            c3084n1.d = fh.n;
            c3084n1.e = fh.m;
        }
        c3084n1.o = dialogInterfaceOnKeyListenerC3565vu;
        DialogInterfaceC3303r1 dialogInterfaceC3303r1A = c3249q1.a();
        dialogInterfaceOnKeyListenerC3565vu.b = dialogInterfaceC3303r1A;
        dialogInterfaceC3303r1A.setOnDismissListener(dialogInterfaceOnKeyListenerC3565vu);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC3565vu.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC3565vu.b.show();
        Ou ou = this.e;
        if (ou == null) {
            return true;
        }
        ou.q(fh);
        return true;
    }

    @Override // defpackage.Pu
    public final boolean d() {
        return false;
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

    @Override // defpackage.Pu
    public final void h() {
        C3239ps c3239ps = this.f;
        if (c3239ps != null) {
            c3239ps.notifyDataSetChanged();
        }
    }

    @Override // defpackage.Pu
    public final void j(Context context, MenuC3511uu menuC3511uu) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = menuC3511uu;
        C3239ps c3239ps = this.f;
        if (c3239ps != null) {
            c3239ps.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.f.getItem(i), this, 0);
    }
}
