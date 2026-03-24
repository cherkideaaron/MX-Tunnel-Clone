package defpackage;

/* renamed from: Kq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0199Kq extends GC implements InterfaceC3396sn {
    public C3513uw b;
    public C0558bt c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C0267Oq f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0199Kq(InterfaceC3493uc interfaceC3493uc, C0267Oq c0267Oq) {
        super(2, interfaceC3493uc);
        this.f = c0267Oq;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C0199Kq c0199Kq = new C0199Kq(interfaceC3493uc, this.f);
        c0199Kq.e = obj;
        return c0199Kq;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C0199Kq) create((C2932kE) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0069 -> B:25:0x007e). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC2543d7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            Sc r0 = defpackage.EnumC0321Sc.a
            int r1 = r6.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            bt r1 = r6.c
            uw r3 = r6.b
            java.lang.Object r4 = r6.e
            kE r4 = (defpackage.C2932kE) r4
            defpackage.AbstractC0115Ga.U(r7)
            goto L7e
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            defpackage.AbstractC0115Ga.U(r7)
            goto L83
        L24:
            defpackage.AbstractC0115Ga.U(r7)
            java.lang.Object r7 = r6.e
            kE r7 = (defpackage.C2932kE) r7
            Oq r1 = r6.f
            r1.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = defpackage.C0267Oq.a
            java.lang.Object r1 = r4.get(r1)
            boolean r4 = r1 instanceof defpackage.C9
            if (r4 == 0) goto L44
            C9 r1 = (defpackage.C9) r1
            E9 r1 = r1.e
            r6.d = r3
            r7.d(r6, r1)
            return r0
        L44:
            boolean r3 = r1 instanceof defpackage.InterfaceC3344rp
            if (r3 == 0) goto L83
            rp r1 = (defpackage.InterfaceC3344rp) r1
            uw r1 = r1.b()
            if (r1 == 0) goto L83
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.C0558bt.a
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            defpackage.AbstractC0500aq.k(r3, r4)
            bt r3 = (defpackage.C0558bt) r3
            r4 = r7
            r5 = r3
            r3 = r1
            r1 = r5
        L61:
            boolean r7 = defpackage.AbstractC0500aq.b(r1, r3)
            if (r7 != 0) goto L83
            boolean r7 = r1 instanceof defpackage.C9
            if (r7 == 0) goto L7e
            r7 = r1
            C9 r7 = (defpackage.C9) r7
            r6.e = r4
            r6.b = r3
            r6.c = r1
            r6.d = r2
            E9 r7 = r7.e
            r4.d(r6, r7)
            Sc r7 = defpackage.EnumC0321Sc.a
            return r0
        L7e:
            bt r1 = r1.g()
            goto L61
        L83:
            DK r7 = defpackage.DK.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0199Kq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
