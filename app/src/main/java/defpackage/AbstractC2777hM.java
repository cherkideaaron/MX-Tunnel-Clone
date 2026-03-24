package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: hM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2777hM extends AbstractC3763zc {
    public C0463a7 a;
    public int b = 0;

    public AbstractC2777hM() {
    }

    @Override // defpackage.AbstractC3763zc
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        t(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new C0463a7(view);
        }
        C0463a7 c0463a7 = this.a;
        View view2 = (View) c0463a7.d;
        c0463a7.a = view2.getTop();
        c0463a7.b = view2.getLeft();
        this.a.b();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        C0463a7 c0463a72 = this.a;
        if (c0463a72.c != i2) {
            c0463a72.c = i2;
            c0463a72.b();
        }
        this.b = 0;
        return true;
    }

    public final int s() {
        C0463a7 c0463a7 = this.a;
        if (c0463a7 != null) {
            return c0463a7.c;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }

    public AbstractC2777hM(int i) {
    }
}
