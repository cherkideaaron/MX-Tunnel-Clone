package defpackage;

/* loaded from: classes2.dex */
public final class SE {
    public final InterfaceC2660fF a;
    public final InterfaceC2660fF b;

    public SE(InterfaceC2660fF interfaceC2660fF, InterfaceC2660fF interfaceC2660fF2) {
        AbstractC0500aq.m(interfaceC2660fF, "localOverrideSettings");
        AbstractC0500aq.m(interfaceC2660fF2, "remoteSettings");
        this.a = interfaceC2660fF;
        this.b = interfaceC2660fF2;
    }

    public final double a() {
        Double d = this.a.d();
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double d2 = this.b.d();
        if (d2 != null) {
            double dDoubleValue2 = d2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.InterfaceC3493uc r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.RE
            if (r0 == 0) goto L13
            r0 = r6
            RE r0 = (defpackage.RE) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            RE r0 = new RE
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.AbstractC0115Ga.U(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            SE r2 = r0.a
            defpackage.AbstractC0115Ga.U(r6)
            goto L49
        L38:
            defpackage.AbstractC0115Ga.U(r6)
            r0.a = r5
            r0.d = r4
            fF r6 = r5.a
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r2 = r5
        L49:
            fF r6 = r2.b
            r2 = 0
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            DK r6 = defpackage.DK.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SE.b(uc):java.lang.Object");
    }
}
