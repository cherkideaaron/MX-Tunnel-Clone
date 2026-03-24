package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: dF, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2551dF {
    public final YI a;
    public final InterfaceC0272Pe b;
    public final AtomicReference c;

    public C2551dF(InterfaceC0168Jc interfaceC0168Jc, YI yi, InterfaceC0272Pe interfaceC0272Pe) {
        AbstractC0500aq.m(interfaceC0168Jc, "backgroundDispatcher");
        AbstractC0500aq.m(yi, "timeProvider");
        AbstractC0500aq.m(interfaceC0272Pe, "sessionConfigsDataStore");
        this.a = yi;
        this.b = interfaceC0272Pe;
        this.c = new AtomicReference();
        AbstractC0136He.y(AbstractC0136He.a(interfaceC0168Jc), new ZE(this, null));
    }

    public final C3694yE a() throws Throwable {
        AtomicReference atomicReference = this.c;
        if (atomicReference.get() == null) {
            Object objI = AbstractC0136He.I(new C0471aF(this, null));
            while (!atomicReference.compareAndSet(null, objI) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        AbstractC0500aq.l(obj, "get(...)");
        return (C3694yE) obj;
    }

    public final boolean b() throws Throwable {
        Integer num;
        C3694yE c3694yEA = a();
        C3694yE c3694yEA2 = a();
        Long l = c3694yEA.e;
        if (l == null || (num = c3694yEA2.d) == null) {
            return true;
        }
        return this.a.a().c - l.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.C3694yE r6, defpackage.InterfaceC3493uc r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C0526bF
            if (r0 == 0) goto L13
            r0 = r7
            bF r0 = (defpackage.C0526bF) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bF r0 = new bF
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.AbstractC0115Ga.U(r7)     // Catch: java.io.IOException -> L27
            goto L58
        L27:
            r6 = move-exception
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.AbstractC0115Ga.U(r7)
            Pe r7 = r5.b     // Catch: java.io.IOException -> L27
            cF r2 = new cF     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.io.IOException -> L27
            r0.c = r3     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = r7.a(r2, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L58
            return r1
        L45:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to update config values: "
            r7.<init>(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "FirebaseSessions"
            android.util.Log.w(r7, r6)
        L58:
            DK r6 = defpackage.DK.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2551dF.c(yE, uc):java.lang.Object");
    }
}
