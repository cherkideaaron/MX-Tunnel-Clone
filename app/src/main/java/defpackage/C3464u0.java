package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* renamed from: u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3464u0 extends AbstractViewOnTouchListenerC2576dm {
    public final /* synthetic */ int p = 0;
    public final /* synthetic */ View q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3464u0(C3734z0 c3734z0, View view) {
        super(view);
        this.q = c3734z0;
    }

    @Override // defpackage.AbstractViewOnTouchListenerC2576dm
    public final RF b() {
        C3572w0 c3572w0;
        switch (this.p) {
            case 0:
                AbstractC3518v0 abstractC3518v0 = ((ActionMenuItemView) this.q).s;
                if (abstractC3518v0 == null || (c3572w0 = ((C3626x0) abstractC3518v0).a.z) == null) {
                    return null;
                }
                return c3572w0.a();
            default:
                C3572w0 c3572w02 = ((C3734z0) this.q).d.y;
                if (c3572w02 == null) {
                    return null;
                }
                return c3572w02.a();
        }
    }

    @Override // defpackage.AbstractViewOnTouchListenerC2576dm
    public final boolean c() {
        RF rfB;
        switch (this.p) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.q;
                InterfaceC3457tu interfaceC3457tu = actionMenuItemView.q;
                return interfaceC3457tu != null && interfaceC3457tu.a(actionMenuItemView.n) && (rfB = b()) != null && rfB.b();
            default:
                ((C3734z0) this.q).d.l();
                return true;
        }
    }

    @Override // defpackage.AbstractViewOnTouchListenerC2576dm
    public boolean d() {
        switch (this.p) {
            case 1:
                A0 a0 = ((C3734z0) this.q).d;
                if (a0.A != null) {
                    return false;
                }
                a0.i();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3464u0(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.q = actionMenuItemView;
    }
}
