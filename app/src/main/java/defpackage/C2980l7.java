package defpackage;

import android.os.Handler;

/* renamed from: l7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2980l7 implements Handler.Callback {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r9) {
        /*
            r8 = this;
            r0 = 4
            r1 = 2
            r2 = 0
            int r3 = r9.what
            r4 = 1
            if (r3 == 0) goto L99
            if (r3 == r4) goto Lb
            return r2
        Lb:
            java.lang.Object r0 = r9.obj
            r7 r0 = (defpackage.AbstractC3309r7) r0
            int r9 = r9.arg1
            android.view.accessibility.AccessibilityManager r3 = r0.s
            if (r3 != 0) goto L16
            goto L22
        L16:
            java.util.List r3 = r3.getEnabledAccessibilityServiceList(r4)
            if (r3 == 0) goto L95
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L95
        L22:
            q7 r3 = r0.i
            int r5 = r3.getVisibility()
            if (r5 != 0) goto L95
            int r5 = r3.getAnimationMode()
            if (r5 != r4) goto L58
            float[] r1 = new float[r1]
            r1 = {x00e8: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            android.animation.TimeInterpolator r3 = r0.d
            r1.setInterpolator(r3)
            k7 r3 = new k7
            r3.<init>(r0, r2)
            r1.addUpdateListener(r3)
            int r3 = r0.b
            long r5 = (long) r3
            r1.setDuration(r5)
            j7 r3 = new j7
            r3.<init>(r0, r9, r2)
            r1.addListener(r3)
            r1.start()
            goto L98
        L58:
            android.animation.ValueAnimator r5 = new android.animation.ValueAnimator
            r5.<init>()
            int r6 = r3.getHeight()
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            boolean r7 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L6e
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r3 = r3.bottomMargin
            int r6 = r6 + r3
        L6e:
            int[] r2 = new int[]{r2, r6}
            r5.setIntValues(r2)
            android.animation.TimeInterpolator r2 = r0.e
            r5.setInterpolator(r2)
            int r2 = r0.c
            long r2 = (long) r2
            r5.setDuration(r2)
            j7 r2 = new j7
            r2.<init>(r0, r9, r1)
            r5.addListener(r2)
            k7 r9 = new k7
            r1 = 3
            r9.<init>(r0, r1)
            r5.addUpdateListener(r9)
            r5.start()
            goto L98
        L95:
            r0.c()
        L98:
            return r4
        L99:
            java.lang.Object r9 = r9.obj
            r7 r9 = (defpackage.AbstractC3309r7) r9
            q7 r1 = r9.i
            android.view.ViewParent r3 = r1.getParent()
            if (r3 != 0) goto Lda
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r5 = r3 instanceof defpackage.C0049Cc
            if (r5 == 0) goto Lcb
            Cc r3 = (defpackage.C0049Cc) r3
            com.google.android.material.snackbar.BaseTransientBottomBar$Behavior r5 = new com.google.android.material.snackbar.BaseTransientBottomBar$Behavior
            r5.<init>()
            co r6 = r5.j
            r6.getClass()
            o7 r7 = r9.t
            r6.a = r7
            iH r6 = new iH
            r6.<init>(r9, r0)
            r5.b = r6
            r3.b(r5)
            r5 = 80
            r3.g = r5
        Lcb:
            r1.q = r4
            android.view.ViewGroup r3 = r9.g
            r3.addView(r1)
            r1.q = r2
            r9.f()
            r1.setVisibility(r0)
        Lda:
            boolean r0 = r1.isLaidOut()
            if (r0 == 0) goto Le4
            r9.e()
            goto Le6
        Le4:
            r9.r = r4
        Le6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2980l7.handleMessage(android.os.Message):boolean");
    }
}
