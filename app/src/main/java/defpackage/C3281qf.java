package defpackage;

/* renamed from: qf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3281qf extends WH implements InterfaceC2631en {
    public Object a;
    public int b;
    public final /* synthetic */ C3658xf c;
    public final /* synthetic */ InterfaceC0168Jc d;
    public final /* synthetic */ InterfaceC3396sn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3281qf(C3658xf c3658xf, InterfaceC0168Jc interfaceC0168Jc, InterfaceC3396sn interfaceC3396sn, InterfaceC3493uc interfaceC3493uc) {
        super(1, interfaceC3493uc);
        this.c = c3658xf;
        this.d = interfaceC0168Jc;
        this.e = interfaceC3396sn;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(InterfaceC3493uc interfaceC3493uc) {
        return new C3281qf(this.c, this.d, this.e, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC2631en
    public final Object invoke(Object obj) {
        return ((C3281qf) create((InterfaceC3493uc) obj)).invokeSuspend(DK.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    @Override // defpackage.AbstractC2543d7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            Sc r0 = defpackage.EnumC0321Sc.a
            int r1 = r8.b
            xf r2 = r8.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2b
            if (r1 == r5) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            java.lang.Object r0 = r8.a
            defpackage.AbstractC0115Ga.U(r9)
            goto L71
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            java.lang.Object r1 = r8.a
            De r1 = (defpackage.C0068De) r1
            defpackage.AbstractC0115Ga.U(r9)
            goto L4f
        L27:
            defpackage.AbstractC0115Ga.U(r9)
            goto L37
        L2b:
            defpackage.AbstractC0115Ga.U(r9)
            r8.b = r5
            java.lang.Object r9 = defpackage.C3658xf.f(r2, r5, r8)
            if (r9 != r0) goto L37
            return r0
        L37:
            r1 = r9
            De r1 = (defpackage.C0068De) r1
            pf r9 = new pf
            sn r6 = r8.e
            r7 = 0
            r9.<init>(r6, r1, r7)
            r8.a = r1
            r8.b = r4
            Jc r4 = r8.d
            java.lang.Object r9 = defpackage.AbstractC0136He.S(r4, r9, r8)
            if (r9 != r0) goto L4f
            return r0
        L4f:
            java.lang.Object r4 = r1.b
            if (r4 == 0) goto L58
            int r4 = r4.hashCode()
            goto L59
        L58:
            r4 = 0
        L59:
            int r6 = r1.c
            if (r4 != r6) goto L73
            java.lang.Object r1 = r1.b
            boolean r1 = defpackage.AbstractC0500aq.b(r1, r9)
            if (r1 != 0) goto L72
            r8.a = r9
            r8.b = r3
            java.lang.Object r1 = r2.j(r9, r5, r8)
            if (r1 != r0) goto L70
            return r0
        L70:
            r0 = r9
        L71:
            r9 = r0
        L72:
            return r9
        L73:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3281qf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
