package defpackage;

import android.content.Context;
import android.view.View;
import com.mxtunnel.pro.R;

/* renamed from: w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3572w0 extends Ju {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ A0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3572w0(A0 a0, Context context, MenuC3511uu menuC3511uu, C3734z0 c3734z0) {
        super(R.attr.actionOverflowMenuStyle, 0, menuC3511uu, context, c3734z0, true);
        this.n = a0;
        this.g = 8388613;
        C0607co c0607co = a0.C;
        this.i = c0607co;
        Hu hu = this.j;
        if (hu != null) {
            hu.f(c0607co);
        }
    }

    @Override // defpackage.Ju
    public final void c() {
        switch (this.m) {
            case 0:
                this.n.z = null;
                super.c();
                break;
            default:
                A0 a0 = this.n;
                MenuC3511uu menuC3511uu = a0.c;
                if (menuC3511uu != null) {
                    menuC3511uu.c(true);
                }
                a0.y = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3572w0(A0 a0, Context context, FH fh, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, fh, context, view, false);
        this.n = a0;
        if (!fh.A.f()) {
            View view2 = a0.o;
            this.f = view2 == null ? (View) a0.n : view2;
        }
        C0607co c0607co = a0.C;
        this.i = c0607co;
        Hu hu = this.j;
        if (hu != null) {
            hu.f(c0607co);
        }
    }
}
