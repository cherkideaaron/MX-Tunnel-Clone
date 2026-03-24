package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: Sj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328Sj extends AbstractC3691yB {
    public final /* synthetic */ C0362Uj a;

    public C0328Sj(C0362Uj c0362Uj) {
        this.a = c0362Uj;
    }

    @Override // defpackage.AbstractC3691yB
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0362Uj c0362Uj = this.a;
        int iComputeVerticalScrollRange = c0362Uj.s.computeVerticalScrollRange();
        int i3 = c0362Uj.r;
        int i4 = iComputeVerticalScrollRange - i3;
        int i5 = c0362Uj.a;
        c0362Uj.t = i4 > 0 && i3 >= i5;
        int iComputeHorizontalScrollRange = c0362Uj.s.computeHorizontalScrollRange();
        int i6 = c0362Uj.q;
        boolean z = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0362Uj.u = z;
        boolean z2 = c0362Uj.t;
        if (!z2 && !z) {
            if (c0362Uj.v != 0) {
                c0362Uj.f(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            c0362Uj.l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            c0362Uj.k = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (c0362Uj.u) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i6;
            c0362Uj.o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            c0362Uj.n = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
        }
        int i7 = c0362Uj.v;
        if (i7 == 0 || i7 == 1) {
            c0362Uj.f(1);
        }
    }
}
