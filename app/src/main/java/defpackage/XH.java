package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes2.dex */
public final class XH extends AbstractC0069Df {
    public int k;
    public int l = -1;
    public final /* synthetic */ SwipeDismissBehavior m;

    public XH(SwipeDismissBehavior swipeDismissBehavior) {
        this.m = swipeDismissBehavior;
    }

    @Override // defpackage.AbstractC0069Df
    public final void O(View view, int i) {
        this.l = i;
        this.k = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.m;
            swipeDismissBehavior.d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.d = false;
        }
    }

    @Override // defpackage.AbstractC0069Df
    public final void P(int i) {
        C2827iH c2827iH = this.m.b;
        if (c2827iH != null) {
            AbstractC3309r7 abstractC3309r7 = (AbstractC3309r7) c2827iH.b;
            if (i == 0) {
                C3532vE.d().k(abstractC3309r7.t);
            } else if (i == 1 || i == 2) {
                C3532vE.d().j(abstractC3309r7.t);
            }
        }
    }

    @Override // defpackage.AbstractC0069Df
    public final void Q(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.m;
        float f = width * swipeDismissBehavior.g;
        float width2 = view.getWidth() * swipeDismissBehavior.h;
        float fAbs = Math.abs(i - this.k);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    @Override // defpackage.AbstractC0069Df
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.l = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.m
            r4 = 0
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r2) goto L18
            r5 = r2
            goto L19
        L18:
            r5 = r4
        L19:
            int r6 = r3.e
            r7 = 2
            if (r6 != r7) goto L1f
            goto L50
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L64
            goto L50
        L28:
            if (r1 <= 0) goto L64
            goto L50
        L2b:
            if (r6 != r2) goto L64
            if (r5 == 0) goto L32
            if (r1 <= 0) goto L64
            goto L50
        L32:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L64
            goto L50
        L37:
            int r1 = r9.getLeft()
            int r5 = r8.k
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r3.f
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L64
        L50:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5f
            int r10 = r9.getLeft()
            int r0 = r8.k
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L67
        L5f:
            int r10 = r8.k
            int r0 = r10 - r11
            goto L67
        L64:
            int r0 = r8.k
            r2 = r4
        L67:
            WL r10 = r3.a
            int r11 = r9.getTop()
            boolean r10 = r10.q(r0, r11)
            if (r10 == 0) goto L7c
            gg r10 = new gg
            r10.<init>(r3, r9, r2)
            r9.postOnAnimation(r10)
            goto L85
        L7c:
            if (r2 == 0) goto L85
            iH r10 = r3.b
            if (r10 == 0) goto L85
            r10.y(r9)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XH.R(android.view.View, float, float):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // defpackage.AbstractC0069Df
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(android.view.View r4, int r5) {
        /*
            r3 = this;
            int r0 = r4.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L9
            r0 = r1
            goto La
        L9:
            r0 = 0
        La:
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r3.m
            int r2 = r2.e
            if (r2 != 0) goto L24
            if (r0 == 0) goto L1c
        L12:
            int r0 = r3.k
            int r4 = r4.getWidth()
            int r0 = r0 - r4
            int r4 = r3.k
            goto L37
        L1c:
            int r0 = r3.k
            int r4 = r4.getWidth()
            int r4 = r4 + r0
            goto L37
        L24:
            if (r2 != r1) goto L29
            if (r0 == 0) goto L12
            goto L1c
        L29:
            int r0 = r3.k
            int r1 = r4.getWidth()
            int r0 = r0 - r1
            int r1 = r3.k
            int r4 = r4.getWidth()
            int r4 = r4 + r1
        L37:
            int r5 = java.lang.Math.max(r0, r5)
            int r4 = java.lang.Math.min(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XH.f(android.view.View, int):int");
    }

    @Override // defpackage.AbstractC0069Df
    public final boolean f0(View view, int i) {
        int i2 = this.l;
        return (i2 == -1 || i2 == i) && this.m.s(view);
    }

    @Override // defpackage.AbstractC0069Df
    public final int g(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.AbstractC0069Df
    public final int y(View view) {
        return view.getWidth();
    }
}
