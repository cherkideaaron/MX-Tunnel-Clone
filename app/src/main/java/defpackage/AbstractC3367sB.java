package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: sB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3367sB {
    public C3094nB a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(JB jb) {
        RecyclerView recyclerView;
        int i = jb.j;
        if (jb.h() || (i & 4) != 0 || (recyclerView = jb.r) == null) {
            return;
        }
        recyclerView.F(jb);
    }

    public abstract boolean a(JB jb, JB jb2, LA la, LA la2);

    public final void c(JB jb) {
        C3094nB c3094nB = this.a;
        if (c3094nB != null) {
            boolean z = true;
            jb.p(true);
            if (jb.h != null && jb.i == null) {
                jb.h = null;
            }
            jb.i = null;
            if ((jb.j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c3094nB.a;
            recyclerView.c0();
            D3 d3 = recyclerView.e;
            C2827iH c2827iH = (C2827iH) d3.b;
            RecyclerView recyclerView2 = (RecyclerView) c2827iH.b;
            View view = jb.a;
            int iIndexOfChild = recyclerView2.indexOfChild(view);
            if (iIndexOfChild == -1) {
                d3.V(view);
            } else {
                D9 d9 = (D9) d3.c;
                if (d9.d(iIndexOfChild)) {
                    d9.f(iIndexOfChild);
                    d3.V(view);
                    c2827iH.C(iIndexOfChild);
                } else {
                    z = false;
                }
            }
            if (z) {
                JB jbI = RecyclerView.I(view);
                BB bb = recyclerView.b;
                bb.k(jbI);
                bb.h(jbI);
            }
            recyclerView.d0(!z);
            if (z || !jb.l()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(JB jb);

    public abstract void e();

    public abstract boolean f();
}
