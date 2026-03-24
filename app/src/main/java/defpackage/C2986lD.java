package defpackage;

/* renamed from: lD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2986lD extends AbstractC3547vc implements InterfaceC3177ol {
    public final InterfaceC3177ol a;
    public final InterfaceC0168Jc b;
    public final int c;
    public InterfaceC0168Jc d;
    public InterfaceC3493uc e;

    public C2986lD(InterfaceC3177ol interfaceC3177ol, InterfaceC0168Jc interfaceC0168Jc) {
        super(C0200La.c, C0021Ai.a);
        this.a = interfaceC3177ol;
        this.b = interfaceC0168Jc;
        this.c = ((Number) interfaceC0168Jc.fold(0, new C0030Ba(5))).intValue();
    }

    @Override // defpackage.InterfaceC3177ol
    public final Object d(Object obj, InterfaceC3493uc interfaceC3493uc) {
        try {
            Object objF = f(interfaceC3493uc, obj);
            return objF == EnumC0321Sc.a ? objF : DK.a;
        } catch (Throwable th) {
            this.d = new C2953kh(interfaceC3493uc.getContext(), th);
            throw th;
        }
    }

    public final Object f(InterfaceC3493uc interfaceC3493uc, Object obj) {
        InterfaceC0168Jc context = interfaceC3493uc.getContext();
        AbstractC3296qu.q(context);
        InterfaceC0168Jc interfaceC0168Jc = this.d;
        if (interfaceC0168Jc != context) {
            if (interfaceC0168Jc instanceof C2953kh) {
                throw new IllegalStateException(AbstractC3535vH.U("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C2953kh) interfaceC0168Jc).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new InterfaceC3396sn() { // from class: oD
                /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
                @Override // defpackage.InterfaceC3396sn
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
                    /*
                        r3 = this;
                        java.lang.Integer r4 = (java.lang.Integer) r4
                        int r4 = r4.intValue()
                        Hc r5 = (defpackage.InterfaceC0134Hc) r5
                        Ic r0 = r5.getKey()
                        lD r1 = r3.a
                        Jc r1 = r1.b
                        Hc r1 = r1.get(r0)
                        Fk r2 = defpackage.C0108Fk.e
                        if (r0 == r2) goto L20
                        if (r5 == r1) goto L1d
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        goto L34
                    L1d:
                        int r4 = r4 + 1
                        goto L34
                    L20:
                        Aq r1 = (defpackage.InterfaceC0029Aq) r1
                        Aq r5 = (defpackage.InterfaceC0029Aq) r5
                    L24:
                        r0 = 0
                        if (r5 != 0) goto L29
                        r5 = r0
                        goto L30
                    L29:
                        if (r5 != r1) goto L2c
                        goto L30
                    L2c:
                        boolean r2 = r5 instanceof defpackage.TD
                        if (r2 != 0) goto L5e
                    L30:
                        if (r5 != r1) goto L39
                        if (r1 != 0) goto L1d
                    L34:
                        java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                        return r4
                    L39:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        java.lang.String r2 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
                        r0.<init>(r2)
                        r0.append(r5)
                        java.lang.String r5 = ", expected child of "
                        r0.append(r5)
                        r0.append(r1)
                        java.lang.String r5 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
                        r0.append(r5)
                        java.lang.String r5 = r0.toString()
                        java.lang.String r5 = r5.toString()
                        r4.<init>(r5)
                        throw r4
                    L5e:
                        TD r5 = (defpackage.TD) r5
                        java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.C0267Oq.b
                        java.lang.Object r5 = r2.get(r5)
                        B9 r5 = (defpackage.B9) r5
                        if (r5 == 0) goto L6f
                        Aq r5 = r5.getParent()
                        goto L24
                    L6f:
                        r5 = r0
                        goto L24
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.C3151oD.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            })).intValue() != this.c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.d = context;
        }
        this.e = interfaceC3493uc;
        InterfaceC3504un interfaceC3504un = AbstractC3096nD.a;
        InterfaceC3177ol interfaceC3177ol = this.a;
        AbstractC0500aq.k(interfaceC3177ol, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objB = interfaceC3504un.b(interfaceC3177ol, obj, this);
        if (!AbstractC0500aq.b(objB, EnumC0321Sc.a)) {
            this.e = null;
        }
        return objB;
    }

    @Override // defpackage.AbstractC2543d7, defpackage.InterfaceC0338Tc
    public final InterfaceC0338Tc getCallerFrame() {
        InterfaceC3493uc interfaceC3493uc = this.e;
        if (interfaceC3493uc instanceof InterfaceC0338Tc) {
            return (InterfaceC0338Tc) interfaceC3493uc;
        }
        return null;
    }

    @Override // defpackage.AbstractC3547vc, defpackage.InterfaceC3493uc
    public final InterfaceC0168Jc getContext() {
        InterfaceC0168Jc interfaceC0168Jc = this.d;
        return interfaceC0168Jc == null ? C0021Ai.a : interfaceC0168Jc;
    }

    @Override // defpackage.AbstractC2543d7
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        Throwable thA = IC.a(obj);
        if (thA != null) {
            this.d = new C2953kh(getContext(), thA);
        }
        InterfaceC3493uc interfaceC3493uc = this.e;
        if (interfaceC3493uc != null) {
            interfaceC3493uc.resumeWith(obj);
        }
        return EnumC0321Sc.a;
    }

    @Override // defpackage.AbstractC3547vc, defpackage.AbstractC2543d7
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
