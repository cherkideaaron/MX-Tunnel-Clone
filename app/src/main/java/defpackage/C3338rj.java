package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: rj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3338rj extends C0565c0 {
    public final /* synthetic */ I9 b;

    public C3338rj(I9 i9) {
        this.b = i9;
    }

    @Override // defpackage.C0565c0
    public final Z a(int i) {
        return new Z(AccessibilityNodeInfo.obtain(this.b.n(i).a));
    }

    @Override // defpackage.C0565c0
    public final Z b(int i) {
        I9 i9 = this.b;
        int i2 = i == 2 ? i9.k : i9.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    @Override // defpackage.C0565c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(int r7, int r8, android.os.Bundle r9) {
        /*
            r6 = this;
            I9 r0 = r6.b
            android.view.View r1 = r0.i
            r2 = -1
            if (r7 == r2) goto L84
            r9 = 1
            if (r8 == r9) goto L7f
            r2 = 2
            if (r8 == r2) goto L7a
            r2 = 64
            r3 = 65536(0x10000, float:9.1835E-41)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
            if (r8 == r2) goto L4f
            r2 = 128(0x80, float:1.8E-43)
            if (r8 == r2) goto L3f
            r1 = 16
            if (r8 != r1) goto L8a
            com.google.android.material.chip.Chip r8 = r0.n
            if (r7 != 0) goto L28
            boolean r5 = r8.performClick()
            goto L8a
        L28:
            if (r7 != r9) goto L8a
            r8.playSoundEffect(r5)
            android.view.View$OnClickListener r7 = r8.n
            if (r7 == 0) goto L35
            r7.onClick(r8)
            r5 = r9
        L35:
            boolean r7 = r8.y
            if (r7 == 0) goto L8a
            I9 r7 = r8.x
            r7.r(r9, r9)
            goto L8a
        L3f:
            int r8 = r0.k
            if (r8 != r7) goto L4c
            r0.k = r4
            r1.invalidate()
            r0.r(r7, r3)
            goto L4d
        L4c:
            r9 = r5
        L4d:
            r5 = r9
            goto L8a
        L4f:
            android.view.accessibility.AccessibilityManager r8 = r0.h
            boolean r2 = r8.isEnabled()
            if (r2 == 0) goto L4c
            boolean r8 = r8.isTouchExplorationEnabled()
            if (r8 != 0) goto L5e
            goto L4c
        L5e:
            int r8 = r0.k
            if (r8 == r7) goto L4c
            if (r8 == r4) goto L6e
            r0.k = r4
            android.view.View r2 = r0.i
            r2.invalidate()
            r0.r(r8, r3)
        L6e:
            r0.k = r7
            r1.invalidate()
            r8 = 32768(0x8000, float:4.5918E-41)
            r0.r(r7, r8)
            goto L4d
        L7a:
            boolean r5 = r0.j(r7)
            goto L8a
        L7f:
            boolean r5 = r0.q(r7)
            goto L8a
        L84:
            java.util.WeakHashMap r7 = defpackage.UL.a
            boolean r5 = r1.performAccessibilityAction(r8, r9)
        L8a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3338rj.c(int, int, android.os.Bundle):boolean");
    }
}
