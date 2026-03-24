package defpackage;

/* loaded from: classes.dex */
public final class VF extends WH implements InterfaceC3396sn {
    public InterfaceC3396sn a;
    public int b;
    public final /* synthetic */ KJ c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VF(KJ kj, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.c = kj;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new VF(this.c, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((VF) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0059 -> B:18:0x005c). Please report as a decompilation issue!!! */
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
            r2 = 2
            r3 = 1
            KJ r4 = r6.c
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            defpackage.AbstractC0115Ga.U(r7)
            goto L5c
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            sn r1 = r6.a
            defpackage.AbstractC0115Ga.U(r7)
            goto L50
        L20:
            defpackage.AbstractC0115Ga.U(r7)
            java.lang.Object r7 = r4.d
            co r7 = (defpackage.C0607co) r7
            java.lang.Object r7 = r7.a
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L6d
        L31:
            java.lang.Object r7 = r4.a
            Rc r7 = (defpackage.InterfaceC0304Rc) r7
            Jc r7 = r7.g()
            defpackage.AbstractC3296qu.q(r7)
            java.lang.Object r7 = r4.b
            r1 = r7
            sn r1 = (defpackage.InterfaceC3396sn) r1
            r6.a = r1
            r6.b = r3
            java.lang.Object r7 = r4.c
            R7 r7 = (defpackage.R7) r7
            java.lang.Object r7 = r7.z(r6)
            if (r7 != r0) goto L50
            return r0
        L50:
            r5 = 0
            r6.a = r5
            r6.b = r2
            java.lang.Object r7 = r1.invoke(r7, r6)
            if (r7 != r0) goto L5c
            return r0
        L5c:
            java.lang.Object r7 = r4.d
            co r7 = (defpackage.C0607co) r7
            java.lang.Object r7 = r7.a
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L31
            DK r7 = defpackage.DK.a
            return r7
        L6d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.VF.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
