package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;

/* loaded from: classes.dex */
public final class Hy extends AbstractC3637xB {
    public RecyclerView a;
    public final C2934kG b = new C2934kG(this);
    public Ey c;
    public Ey d;

    public static int b(View view, AbstractC0492ai abstractC0492ai) {
        return ((abstractC0492ai.c(view) / 2) + abstractC0492ai.e(view)) - ((abstractC0492ai.l() / 2) + abstractC0492ai.k());
    }

    public static View c(AbstractC3529vB abstractC3529vB, AbstractC0492ai abstractC0492ai) {
        int iV = abstractC3529vB.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iL = (abstractC0492ai.l() / 2) + abstractC0492ai.k();
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i2 = 0; i2 < iV; i2++) {
            View viewU = abstractC3529vB.u(i2);
            int iAbs = Math.abs(((abstractC0492ai.c(viewU) / 2) + abstractC0492ai.e(viewU)) - iL);
            if (iAbs < i) {
                view = viewU;
                i = iAbs;
            }
        }
        return view;
    }

    public final int[] a(AbstractC3529vB abstractC3529vB, View view) {
        int[] iArr = new int[2];
        if (abstractC3529vB.d()) {
            iArr[0] = b(view, d(abstractC3529vB));
        } else {
            iArr[0] = 0;
        }
        if (abstractC3529vB.e()) {
            iArr[1] = b(view, e(abstractC3529vB));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final AbstractC0492ai d(AbstractC3529vB abstractC3529vB) {
        Ey ey = this.d;
        if (ey == null || ((AbstractC3529vB) ey.b) != abstractC3529vB) {
            this.d = new Ey(abstractC3529vB, 0);
        }
        return this.d;
    }

    public final AbstractC0492ai e(AbstractC3529vB abstractC3529vB) {
        Ey ey = this.c;
        if (ey == null || ((AbstractC3529vB) ey.b) != abstractC3529vB) {
            this.c = new Ey(abstractC3529vB, 1);
        }
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0029 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r5.a
            if (r0 != 0) goto L5
            return
        L5:
            vB r0 = r0.getLayoutManager()
            if (r0 != 0) goto Lc
            return
        Lc:
            boolean r1 = r0.e()
            if (r1 == 0) goto L1b
            ai r1 = r5.e(r0)
        L16:
            android.view.View r1 = c(r0, r1)
            goto L27
        L1b:
            boolean r1 = r0.d()
            if (r1 == 0) goto L26
            ai r1 = r5.d(r0)
            goto L16
        L26:
            r1 = 0
        L27:
            if (r1 != 0) goto L2a
            return
        L2a:
            int[] r0 = r5.a(r0, r1)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L38
            r4 = r0[r3]
            if (r4 == 0) goto L3f
        L38:
            androidx.recyclerview.widget.RecyclerView r4 = r5.a
            r0 = r0[r3]
            r4.b0(r2, r0, r1)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Hy.f():void");
    }
}
