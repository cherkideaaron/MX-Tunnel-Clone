package defpackage;

/* renamed from: wf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3604wf extends WH implements InterfaceC3396sn {
    public NB a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ NB d;
    public final /* synthetic */ C3658xf e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3604wf(NB nb, C3658xf c3658xf, Object obj, boolean z, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.d = nb;
        this.e = c3658xf;
        this.f = obj;
        this.m = z;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C3604wf c3604wf = new C3604wf(this.d, this.e, this.f, this.m, interfaceC3493uc);
        c3604wf.c = obj;
        return c3604wf;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C3604wf) create((C3231pk) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // defpackage.AbstractC2543d7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            Sc r0 = defpackage.EnumC0321Sc.a
            int r1 = r7.b
            java.lang.Object r2 = r7.f
            xf r3 = r7.e
            NB r4 = r7.d
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            defpackage.AbstractC0115Ga.U(r8)
            goto L59
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            NB r1 = r7.a
            java.lang.Object r6 = r7.c
            pk r6 = (defpackage.C3231pk) r6
            defpackage.AbstractC0115Ga.U(r8)
            goto L43
        L28:
            defpackage.AbstractC0115Ga.U(r8)
            java.lang.Object r8 = r7.c
            pk r8 = (defpackage.C3231pk) r8
            Sp r1 = r3.g()
            r7.c = r8
            r7.a = r4
            r7.b = r6
            java.lang.Object r1 = r1.a(r7)
            if (r1 != r0) goto L40
            return r0
        L40:
            r6 = r8
            r8 = r1
            r1 = r4
        L43:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r1.a = r8
            r8 = 0
            r7.c = r8
            r7.a = r8
            r7.b = r5
            java.lang.Object r8 = r6.b(r7, r2)
            if (r8 != r0) goto L59
            return r0
        L59:
            boolean r8 = r7.m
            if (r8 == 0) goto L71
            co r8 = r3.h
            De r0 = new De
            if (r2 == 0) goto L68
            int r1 = r2.hashCode()
            goto L69
        L68:
            r1 = 0
        L69:
            int r3 = r4.a
            r0.<init>(r1, r3, r2)
            r8.M(r0)
        L71:
            DK r8 = defpackage.DK.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3604wf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
