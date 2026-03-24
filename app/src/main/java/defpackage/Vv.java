package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class Vv extends C2604eE implements Tv {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(Vv.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public Vv(boolean z) {
        super(z ? 1 : 0);
        this.owner$volatile = z ? null : AbstractC0069Df.g;
    }

    public final boolean c() {
        return Math.max(C2604eE.g.get(this), 0) == 0;
    }

    public final Object d(InterfaceC3493uc interfaceC3493uc) {
        boolean zE = e(null);
        DK dk = DK.a;
        if (zE) {
            return dk;
        }
        B8 b8C = AbstractC3279qd.C(AbstractC0069Df.C(interfaceC3493uc));
        try {
            a(new Uv(this, b8C));
            Object objR = b8C.r();
            EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
            if (objR != enumC0321Sc) {
                objR = dk;
            }
            return objR == enumC0321Sc ? objR : dk;
        } catch (Throwable th) {
            b8C.z();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r0 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(java.lang.Object r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.C2604eE.g
            int r1 = r0.get(r7)
            int r2 = r7.a
            if (r1 <= r2) goto L17
        La:
            int r1 = r0.get(r7)
            if (r1 <= r2) goto L0
            boolean r1 = r0.compareAndSet(r7, r1, r2)
            if (r1 == 0) goto La
            goto L0
        L17:
            r2 = 1
            r3 = 2
            r4 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.Vv.h
            if (r1 > 0) goto L3e
            if (r8 != 0) goto L22
        L20:
            r0 = r2
            goto L4a
        L22:
            boolean r0 = r7.c()
            if (r0 != 0) goto L2a
            r0 = r4
            goto L37
        L2a:
            java.lang.Object r0 = r5.get(r7)
            ri r1 = defpackage.AbstractC0069Df.g
            if (r0 == r1) goto L22
            if (r0 != r8) goto L36
            r0 = r2
            goto L37
        L36:
            r0 = r3
        L37:
            if (r0 == r2) goto L3c
            if (r0 == r3) goto L20
            goto L0
        L3c:
            r0 = r3
            goto L4a
        L3e:
            int r6 = r1 + (-1)
            boolean r0 = r0.compareAndSet(r7, r1, r6)
            if (r0 == 0) goto L0
            r5.set(r7, r8)
            r0 = r4
        L4a:
            if (r0 == 0) goto L75
            if (r0 == r2) goto L74
            if (r0 == r3) goto L5c
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L5c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "This mutex is already locked by the specified owner: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L74:
            r2 = r4
        L75:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Vv.e(java.lang.Object):boolean");
    }

    public final void f(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C3337ri c3337ri = AbstractC0069Df.g;
            if (obj2 != c3337ri) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c3337ri)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public final String toString() {
        return "Mutex@" + AbstractC0069Df.u(this) + "[isLocked=" + c() + ",owner=" + h.get(this) + ']';
    }
}
