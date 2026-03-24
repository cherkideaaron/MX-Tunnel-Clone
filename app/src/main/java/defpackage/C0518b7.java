package defpackage;

import android.util.AttributeSet;

/* renamed from: b7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518b7 extends AbstractC0235Nb {
    public int n;
    public int o;
    public C0572c7 p;

    @Override // defpackage.AbstractC0235Nb
    public final void g(AttributeSet attributeSet) {
        C0572c7 c0572c7 = new C0572c7();
        c0572c7.r0 = 0;
        c0572c7.s0 = true;
        c0572c7.t0 = 0;
        c0572c7.u0 = false;
        this.p = c0572c7;
        this.d = c0572c7;
        i();
    }

    public boolean getAllowsGoneWidget() {
        return this.p.s0;
    }

    public int getMargin() {
        return this.p.t0;
    }

    public int getType() {
        return this.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    @Override // defpackage.AbstractC0235Nb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(defpackage.C2566dc r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.n
            r5.o = r0
            r1 = 0
            r2 = 6
            r3 = 1
            r4 = 5
            if (r7 == 0) goto L14
            if (r0 != r4) goto Lf
        Lc:
            r5.o = r3
            goto L1a
        Lf:
            if (r0 != r2) goto L1a
        L11:
            r5.o = r1
            goto L1a
        L14:
            if (r0 != r4) goto L17
            goto L11
        L17:
            if (r0 != r2) goto L1a
            goto Lc
        L1a:
            boolean r7 = r6 instanceof defpackage.C0572c7
            if (r7 == 0) goto L24
            c7 r6 = (defpackage.C0572c7) r6
            int r7 = r5.o
            r6.r0 = r7
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0518b7.h(dc, boolean):void");
    }

    public void setAllowsGoneWidget(boolean z) {
        this.p.s0 = z;
    }

    public void setDpMargin(int i) {
        this.p.t0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.p.t0 = i;
    }

    public void setType(int i) {
        this.n = i;
    }
}
