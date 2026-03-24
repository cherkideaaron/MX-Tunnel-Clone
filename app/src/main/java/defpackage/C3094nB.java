package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: nB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3094nB {
    public final /* synthetic */ RecyclerView a;

    public /* synthetic */ C3094nB(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(defpackage.JB r9, defpackage.LA r10, defpackage.LA r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.a
            r0.getClass()
            r1 = 0
            r9.p(r1)
            sB r1 = r0.O
            r2 = r1
            Wf r2 = (defpackage.C0392Wf) r2
            if (r10 == 0) goto L29
            r2.getClass()
            int r4 = r10.b
            int r6 = r11.b
            if (r4 != r6) goto L1f
            int r1 = r10.c
            int r3 = r11.c
            if (r1 == r3) goto L29
        L1f:
            int r5 = r10.c
            int r7 = r11.c
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            goto L38
        L29:
            r2.l(r9)
            android.view.View r10 = r9.a
            r11 = 0
            r10.setAlpha(r11)
            java.util.ArrayList r10 = r2.i
            r10.add(r9)
            r9 = 1
        L38:
            if (r9 == 0) goto L3d
            r0.S()
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3094nB.a(JB, LA, LA):void");
    }

    public void b(JB jb, LA la, LA la2) {
        boolean zG;
        RecyclerView recyclerView = this.a;
        recyclerView.b.k(jb);
        recyclerView.f(jb);
        jb.p(false);
        C0392Wf c0392Wf = (C0392Wf) recyclerView.O;
        c0392Wf.getClass();
        int i = la.b;
        int i2 = la.c;
        View view = jb.a;
        int left = la2 == null ? view.getLeft() : la2.b;
        int top = la2 == null ? view.getTop() : la2.c;
        if (jb.j() || (i == left && i2 == top)) {
            c0392Wf.l(jb);
            c0392Wf.h.add(jb);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = c0392Wf.g(jb, i, i2, left, top);
        }
        if (zG) {
            recyclerView.S();
        }
    }
}
