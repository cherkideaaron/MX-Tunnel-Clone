package defpackage;

/* renamed from: mf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3061mf extends WH implements InterfaceC3396sn {
    public Object a;
    public int b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ C3658xf d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3061mf(C3658xf c3658xf, int i, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.d = c3658xf;
        this.e = i;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C3061mf c3061mf = new C3061mf(this.d, this.e, interfaceC3493uc);
        c3061mf.c = ((Boolean) obj).booleanValue();
        return c3061mf;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C3061mf) create(bool, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    @Override // defpackage.AbstractC2543d7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            Sc r0 = defpackage.EnumC0321Sc.a
            int r1 = r6.b
            xf r2 = r6.d
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            java.lang.Object r0 = r6.a
            defpackage.AbstractC0115Ga.U(r7)
            goto L45
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            boolean r1 = r6.c
            defpackage.AbstractC0115Ga.U(r7)
            goto L32
        L22:
            defpackage.AbstractC0115Ga.U(r7)
            boolean r1 = r6.c
            r6.c = r1
            r6.b = r4
            java.lang.Object r7 = r2.i(r6)
            if (r7 != r0) goto L32
            return r0
        L32:
            if (r1 == 0) goto L4c
            Sp r1 = r2.g()
            r6.a = r7
            r6.b = r3
            java.lang.Object r1 = r1.b(r6)
            if (r1 != r0) goto L43
            return r0
        L43:
            r0 = r7
            r7 = r1
        L45:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            goto L51
        L4c:
            int r0 = r6.e
            r5 = r0
            r0 = r7
            r7 = r5
        L51:
            De r1 = new De
            if (r0 == 0) goto L5a
            int r2 = r0.hashCode()
            goto L5b
        L5a:
            r2 = 0
        L5b:
            r1.<init>(r2, r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3061mf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
