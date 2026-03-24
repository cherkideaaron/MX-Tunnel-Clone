package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: h9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2764h9 extends ZD {
    public final R7 e;
    public final /* synthetic */ AtomicReferenceArray f;

    public C2764h9(long j, C2764h9 c2764h9, R7 r7, int i) {
        super(j, c2764h9, i);
        this.e = r7;
        this.f = new AtomicReferenceArray(T7.b * 2);
    }

    @Override // defpackage.ZD
    public final int g() {
        return T7.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
    
        n(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        defpackage.AbstractC0500aq.j(r4);
        r7 = r4.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
    
        defpackage.AbstractC3279qd.f(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // defpackage.ZD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r7, defpackage.InterfaceC0168Jc r8) {
        /*
            r6 = this;
            int r0 = defpackage.T7.b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.l(r7)
            boolean r3 = r2 instanceof defpackage.IM
            R7 r4 = r6.e
            r5 = 0
            if (r3 != 0) goto L6b
            boolean r3 = r2 instanceof defpackage.JM
            if (r3 == 0) goto L22
            goto L6b
        L22:
            ri r3 = defpackage.T7.j
            if (r2 == r3) goto L5b
            ri r3 = defpackage.T7.k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            ri r3 = defpackage.T7.g
            if (r2 == r3) goto L12
            ri r3 = defpackage.T7.f
            if (r2 != r3) goto L34
            goto L12
        L34:
            ri r7 = defpackage.T7.i
            if (r2 == r7) goto L5a
            ri r7 = defpackage.T7.d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            ri r7 = defpackage.T7.l
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.n(r7, r5)
            if (r1 == 0) goto L6a
            defpackage.AbstractC0500aq.j(r4)
            en r7 = r4.b
            if (r7 == 0) goto L6a
            defpackage.AbstractC3279qd.f(r7, r0, r8)
        L6a:
            return
        L6b:
            if (r1 == 0) goto L70
            ri r3 = defpackage.T7.j
            goto L72
        L70:
            ri r3 = defpackage.T7.k
        L72:
            boolean r2 = r6.k(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.n(r7, r5)
            r2 = r1 ^ 1
            r6.m(r7, r2)
            if (r1 == 0) goto L8c
            defpackage.AbstractC0500aq.j(r4)
            en r7 = r4.b
            if (r7 == 0) goto L8c
            defpackage.AbstractC3279qd.f(r7, r0, r8)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2764h9.h(int, Jc):void");
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int i2 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object l(int i) {
        return this.f.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            R7 r7 = this.e;
            AbstractC0500aq.j(r7);
            r7.G((this.c * T7.b) + i);
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.f.set(i * 2, obj);
    }

    public final void o(int i, C3337ri c3337ri) {
        this.f.set((i * 2) + 1, c3337ri);
    }
}
