package defpackage;

import java.util.ArrayList;

/* renamed from: b9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0520b9 implements InterfaceC0111Fn {
    public final InterfaceC0168Jc a;
    public final int b;
    public final N7 c;
    public final /* synthetic */ int d;
    public final Object e;

    public C0520b9(Object obj, InterfaceC0168Jc interfaceC0168Jc, int i, N7 n7, int i2) {
        this.d = i2;
        this.a = interfaceC0168Jc;
        this.b = i;
        this.c = n7;
        this.e = obj;
    }

    public final Object a(InterfaceC3177ol interfaceC3177ol, InterfaceC3493uc interfaceC3493uc) throws Throwable {
        Object objH = AbstractC0136He.h(new Z8(interfaceC3177ol, this, null), interfaceC3493uc);
        return objH == EnumC0321Sc.a ? objH : DK.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    @Override // defpackage.InterfaceC3067ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(defpackage.InterfaceC3177ol r6, defpackage.InterfaceC3493uc r7) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.d
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r6 = r5.a(r6, r7)
            return r6
        La:
            DK r0 = defpackage.DK.a
            int r1 = r5.b
            r2 = -3
            if (r1 != r2) goto L7e
            Jc r1 = r7.getContext()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            Ba r3 = new Ba
            r4 = 2
            r3.<init>(r4)
            Jc r4 = r5.a
            java.lang.Object r2 = r4.fold(r2, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L30
            Jc r2 = r1.plus(r4)
            goto L35
        L30:
            r2 = 0
            Jc r2 = defpackage.MO.p(r1, r4, r2)
        L35:
            boolean r3 = defpackage.AbstractC0500aq.b(r2, r1)
            if (r3 == 0) goto L4d
            java.lang.Object r1 = r5.e
            ml r1 = (defpackage.InterfaceC3067ml) r1
            java.lang.Object r6 = r1.b(r6, r7)
            Sc r7 = defpackage.EnumC0321Sc.a
            if (r6 != r7) goto L48
            goto L49
        L48:
            r6 = r0
        L49:
            if (r6 != r7) goto L87
        L4b:
            r0 = r6
            goto L87
        L4d:
            so r3 = defpackage.C3397so.b
            Hc r4 = r2.get(r3)
            Hc r1 = r1.get(r3)
            boolean r1 = defpackage.AbstractC0500aq.b(r4, r1)
            if (r1 == 0) goto L7e
            Jc r1 = r7.getContext()
            boolean r3 = r6 instanceof defpackage.C2824iE
            if (r3 != 0) goto L6b
            Al r3 = new Al
            r3.<init>(r6, r1)
            r6 = r3
        L6b:
            c9 r1 = new c9
            r3 = 0
            r1.<init>(r5, r3)
            java.lang.Object r3 = defpackage.AbstractC0136He.M(r2)
            java.lang.Object r6 = defpackage.AbstractC0069Df.i0(r2, r6, r3, r1, r7)
            Sc r7 = defpackage.EnumC0321Sc.a
            if (r6 != r7) goto L87
            goto L4b
        L7e:
            java.lang.Object r6 = r5.a(r6, r7)
            Sc r7 = defpackage.EnumC0321Sc.a
            if (r6 != r7) goto L87
            goto L4b
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0520b9.b(ol, uc):java.lang.Object");
    }

    public final Object c(Sz sz, InterfaceC3493uc interfaceC3493uc) {
        switch (this.d) {
            case 0:
                Object objInvoke = ((InterfaceC3396sn) this.e).invoke(sz, interfaceC3493uc);
                return objInvoke == EnumC0321Sc.a ? objInvoke : DK.a;
            default:
                Object objB = ((InterfaceC3067ml) this.e).b(new C2824iE(sz), interfaceC3493uc);
                EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
                DK dk = DK.a;
                if (objB != enumC0321Sc) {
                    objB = dk;
                }
                return objB == enumC0321Sc ? objB : dk;
        }
    }

    public final C0520b9 d(InterfaceC0168Jc interfaceC0168Jc, int i, N7 n7) {
        switch (this.d) {
            case 0:
                return new C0520b9((InterfaceC3396sn) this.e, interfaceC0168Jc, i, n7, 0);
            default:
                return new C0520b9((InterfaceC3067ml) this.e, interfaceC0168Jc, i, n7, 1);
        }
    }

    public final String e() {
        ArrayList arrayList = new ArrayList(4);
        C0021Ai c0021Ai = C0021Ai.a;
        InterfaceC0168Jc interfaceC0168Jc = this.a;
        if (interfaceC0168Jc != c0021Ai) {
            arrayList.add("context=" + interfaceC0168Jc);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        N7 n7 = N7.a;
        N7 n72 = this.c;
        if (n72 != n7) {
            arrayList.add("onBufferOverflow=" + n72);
        }
        return getClass().getSimpleName() + '[' + AbstractC3383sa.c0(arrayList, ", ", null, null, null, 62) + ']';
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // defpackage.InterfaceC0111Fn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.InterfaceC3067ml i(defpackage.InterfaceC0168Jc r5, int r6, defpackage.N7 r7) {
        /*
            r4 = this;
            Jc r0 = r4.a
            Jc r5 = r5.plus(r0)
            N7 r1 = defpackage.N7.a
            N7 r2 = r4.c
            int r3 = r4.b
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = defpackage.AbstractC0500aq.b(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            b9 r5 = r4.d(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0520b9.i(Jc, int, N7):ml");
    }

    public final String toString() {
        switch (this.d) {
            case 0:
                return "block[" + ((InterfaceC3396sn) this.e) + "] -> " + e();
            default:
                return ((InterfaceC3067ml) this.e) + " -> " + e();
        }
    }
}
