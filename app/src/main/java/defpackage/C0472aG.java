package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: aG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0472aG implements InterfaceC0334Sp {
    public final Vv a = AbstractC0069Df.a();
    public final C0607co b = new C0607co(4);
    public final C2827iH c = new C2827iH(new ZF(2, null), 27);

    public C0472aG(String str) {
    }

    @Override // defpackage.InterfaceC0334Sp
    public final Object a(InterfaceC3493uc interfaceC3493uc) {
        return new Integer(((AtomicInteger) this.b.a).incrementAndGet());
    }

    @Override // defpackage.InterfaceC0334Sp
    public final Object b(InterfaceC3493uc interfaceC3493uc) {
        return new Integer(((AtomicInteger) this.b.a).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.InterfaceC0334Sp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.InterfaceC2631en r8, defpackage.InterfaceC3493uc r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.XF
            if (r0 == 0) goto L13
            r0 = r9
            XF r0 = (defpackage.XF) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            XF r0 = new XF
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.a
            Tv r8 = (defpackage.Tv) r8
            defpackage.AbstractC0115Ga.U(r9)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r9 = move-exception
            goto L71
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            Vv r8 = r0.b
            java.lang.Object r2 = r0.a
            en r2 = (defpackage.InterfaceC2631en) r2
            defpackage.AbstractC0115Ga.U(r9)
            r9 = r8
            r8 = r2
            goto L57
        L45:
            defpackage.AbstractC0115Ga.U(r9)
            r0.a = r8
            Vv r9 = r7.a
            r0.b = r9
            r0.e = r4
            java.lang.Object r2 = r9.d(r0)
            if (r2 != r1) goto L57
            return r1
        L57:
            r0.a = r9     // Catch: java.lang.Throwable -> L6d
            r0.b = r5     // Catch: java.lang.Throwable -> L6d
            r0.e = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6d
            if (r8 != r1) goto L64
            return r1
        L64:
            r6 = r9
            r9 = r8
            r8 = r6
        L67:
            Vv r8 = (defpackage.Vv) r8
            r8.f(r5)
            return r9
        L6d:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L71:
            Vv r8 = (defpackage.Vv) r8
            r8.f(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0472aG.c(en, uc):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0334Sp
    public final InterfaceC3067ml d() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.InterfaceC0334Sp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.InterfaceC3396sn r7, defpackage.InterfaceC3493uc r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.YF
            if (r0 == 0) goto L13
            r0 = r8
            YF r0 = (defpackage.YF) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            YF r0 = new YF
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r7 = r0.b
            Vv r0 = r0.a
            defpackage.AbstractC0115Ga.U(r8)     // Catch: java.lang.Throwable -> L2c
            goto L53
        L2c:
            r8 = move-exception
            goto L5d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            defpackage.AbstractC0115Ga.U(r8)
            Vv r8 = r6.a
            boolean r2 = r8.e(r4)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L59
            r0.a = r8     // Catch: java.lang.Throwable -> L59
            r0.b = r2     // Catch: java.lang.Throwable -> L59
            r0.e = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L59
            if (r7 != r1) goto L50
            return r1
        L50:
            r0 = r8
            r8 = r7
            r7 = r2
        L53:
            if (r7 == 0) goto L58
            r0.f(r4)
        L58:
            return r8
        L59:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L5d:
            if (r7 == 0) goto L62
            r0.f(r4)
        L62:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0472aG.e(sn, uc):java.lang.Object");
    }
}
