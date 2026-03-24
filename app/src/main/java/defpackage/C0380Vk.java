package defpackage;

/* renamed from: Vk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0380Vk extends WH implements InterfaceC3396sn {
    public int a;
    public final /* synthetic */ C0397Wk b;
    public final /* synthetic */ QE c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0380Vk(C0397Wk c0397Wk, QE qe, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = c0397Wk;
        this.c = qe;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new C0380Vk(this.b, this.c, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C0380Vk) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    @Override // defpackage.AbstractC2543d7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            Sc r0 = defpackage.EnumC0321Sc.a
            int r1 = r6.a
            r2 = 1
            java.lang.String r3 = "FirebaseSessions"
            r4 = 2
            Wk r5 = r6.b
            if (r1 == 0) goto L20
            if (r1 == r2) goto L1c
            if (r1 != r4) goto L14
            defpackage.AbstractC0115Ga.U(r7)
            goto L62
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            defpackage.AbstractC0115Ga.U(r7)
            goto L2e
        L20:
            defpackage.AbstractC0115Ga.U(r7)
            dl r7 = defpackage.C2575dl.a
            r6.a = r2
            java.lang.Object r7 = r7.b(r6)
            if (r7 != r0) goto L2e
            return r0
        L2e:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r7 = r7.values()
            boolean r1 = r7 instanceof java.util.Collection
            if (r1 == 0) goto L3f
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L3f
            goto L9e
        L3f:
            java.util.Iterator r7 = r7.iterator()
        L43:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L9e
            java.lang.Object r1 = r7.next()
            ad r1 = (defpackage.C0487ad) r1
            Fe r1 = r1.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L43
            SE r7 = r5.b
            r6.a = r4
            java.lang.Object r7 = r7.b(r6)
            if (r7 != r0) goto L62
            return r0
        L62:
            SE r7 = r5.b
            fF r0 = r7.a
            java.lang.Boolean r0 = r0.b()
            if (r0 == 0) goto L71
            boolean r2 = r0.booleanValue()
            goto L7d
        L71:
            fF r7 = r7.b
            java.lang.Boolean r7 = r7.b()
            if (r7 == 0) goto L7d
            boolean r2 = r7.booleanValue()
        L7d:
            if (r2 != 0) goto L89
            java.lang.String r7 = "Sessions SDK disabled. Not listening to lifecycle events."
        L81:
            int r7 = android.util.Log.d(r3, r7)
            defpackage.AbstractC3279qd.c(r7)
            goto La1
        L89:
            Md r7 = new Md
            r0 = 8
            r7.<init>(r0)
            xk r0 = r5.a
            r0.a()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.j
            r0.add(r7)
            goto La1
        L9e:
            java.lang.String r7 = "No Sessions subscribers. Not listening to lifecycle events."
            goto L81
        La1:
            DK r7 = defpackage.DK.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0380Vk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
