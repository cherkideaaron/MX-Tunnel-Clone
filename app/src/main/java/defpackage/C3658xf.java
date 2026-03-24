package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.List;

/* renamed from: xf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3658xf implements InterfaceC0272Pe {
    public final InterfaceC2935kH a;
    public final InterfaceC0406Xc b;
    public final InterfaceC0304Rc c;
    public final C2827iH d;
    public final Vv e;
    public int f;
    public QG g;
    public final C0607co h;
    public final KJ i;
    public final C0583cI j;
    public final C0583cI k;
    public final KJ l;

    public C3658xf(C2847ik c2847ik, List list, InterfaceC0406Xc interfaceC0406Xc, InterfaceC0304Rc interfaceC0304Rc) {
        AbstractC0500aq.m(interfaceC0304Rc, "scope");
        this.a = c2847ik;
        this.b = interfaceC0406Xc;
        this.c = interfaceC0304Rc;
        this.d = new C2827iH(new C0544bf(this, null), 27);
        this.e = AbstractC0069Df.a();
        this.h = new C0607co(9);
        KJ kj = new KJ();
        kj.d = this;
        kj.a = AbstractC0069Df.a();
        kj.b = AbstractC3279qd.a();
        kj.c = AbstractC3383sa.j0(list);
        this.i = kj;
        this.j = AbstractC0069Df.G(new C0357Ue(this, 1));
        this.k = AbstractC0069Df.G(new C0357Ue(this, 0));
        C3388sf c3388sf = new C3388sf(this, 0);
        C3496uf c3496uf = new C3496uf(this, null);
        AbstractC0500aq.m(interfaceC0304Rc, "scope");
        KJ kj2 = new KJ();
        kj2.a = interfaceC0304Rc;
        kj2.b = c3496uf;
        kj2.c = AbstractC0500aq.a(Api.BaseClientBuilder.API_PRIORITY_OTHER, null, 6);
        kj2.d = new C0607co(4);
        InterfaceC0029Aq interfaceC0029Aq = (InterfaceC0029Aq) interfaceC0304Rc.g().get(C0108Fk.e);
        if (interfaceC0029Aq != null) {
            interfaceC0029Aq.invokeOnCompletion(new UF(c3388sf, kj2));
        }
        this.l = kj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.C3658xf r4, defpackage.InterfaceC3493uc r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof defpackage.C0598cf
            if (r0 == 0) goto L16
            r0 = r5
            cf r0 = (defpackage.C0598cf) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.e = r1
            goto L1b
        L16:
            cf r0 = new cf
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.c
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            Vv r4 = r0.b
            xf r0 = r0.a
            defpackage.AbstractC0115Ga.U(r5)
            r5 = r4
            r4 = r0
            goto L4a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            defpackage.AbstractC0115Ga.U(r5)
            r0.a = r4
            Vv r5 = r4.e
            r0.b = r5
            r0.e = r3
            java.lang.Object r0 = r5.d(r0)
            if (r0 != r1) goto L4a
            goto L64
        L4a:
            r0 = 0
            int r1 = r4.f     // Catch: java.lang.Throwable -> L5d
            int r1 = r1 + (-1)
            r4.f = r1     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L5f
            QG r1 = r4.g     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5a
            r1.cancel(r0)     // Catch: java.lang.Throwable -> L5d
        L5a:
            r4.g = r0     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r4 = move-exception
            goto L65
        L5f:
            r5.f(r0)
            DK r1 = defpackage.DK.a
        L64:
            return r1
        L65:
            r5.f(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3658xf.b(xf, uc):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(2:4|(1:6)(1:7))(0)|8|(7:73|(1:(1:(1:13)(2:18|19))(3:20|21|22))(1:23)|14|63|(1:65)(1:66)|67|68)(4:24|74|25|(9:27|71|28|(1:76)|31|63|(0)(0)|67|68)(3:38|(1:40)(1:41)|(2:43|(2:45|(2:47|75))(2:54|55))(2:56|(2:58|59)(2:60|61))))|48|69|49|(1:77)|31|63|(0)(0)|67|68|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.C3658xf r9, defpackage.Uu r10, defpackage.InterfaceC3493uc r11) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3658xf.c(xf, Uu, uc):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(defpackage.C3658xf r4, defpackage.InterfaceC3493uc r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof defpackage.C2678ff
            if (r0 == 0) goto L16
            r0 = r5
            ff r0 = (defpackage.C2678ff) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.e = r1
            goto L1b
        L16:
            ff r0 = new ff
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.c
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            Vv r4 = r0.b
            xf r0 = r0.a
            defpackage.AbstractC0115Ga.U(r5)
            r5 = r4
            r4 = r0
            goto L4a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            defpackage.AbstractC0115Ga.U(r5)
            r0.a = r4
            Vv r5 = r4.e
            r0.b = r5
            r0.e = r3
            java.lang.Object r0 = r5.d(r0)
            if (r0 != r1) goto L4a
            goto L67
        L4a:
            r0 = 0
            int r1 = r4.f     // Catch: java.lang.Throwable -> L60
            int r1 = r1 + r3
            r4.f = r1     // Catch: java.lang.Throwable -> L60
            if (r1 != r3) goto L62
            Rc r1 = r4.c     // Catch: java.lang.Throwable -> L60
            gf r2 = new gf     // Catch: java.lang.Throwable -> L60
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L60
            QG r1 = defpackage.AbstractC0136He.y(r1, r2)     // Catch: java.lang.Throwable -> L60
            r4.g = r1     // Catch: java.lang.Throwable -> L60
            goto L62
        L60:
            r4 = move-exception
            goto L68
        L62:
            r5.f(r0)
            DK r1 = defpackage.DK.a
        L67:
            return r1
        L68:
            r5.f(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3658xf.d(xf, uc):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(defpackage.C3658xf r8, boolean r9, defpackage.InterfaceC3493uc r10) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3658xf.e(xf, boolean, uc):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[Catch: Wc -> 0x0062, TryCatch #1 {Wc -> 0x0062, blocks: (B:19:0x005d, B:54:0x0103, B:24:0x006b, B:51:0x00e5, B:32:0x0088, B:40:0x00a2, B:42:0x00a8, B:36:0x0091, B:48:0x00d2), top: B:80:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142 A[Catch: all -> 0x016e, TryCatch #2 {all -> 0x016e, blocks: (B:61:0x0130, B:63:0x0142, B:64:0x014a), top: B:81:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014a A[Catch: all -> 0x016e, TRY_LEAVE, TryCatch #2 {all -> 0x016e, blocks: (B:61:0x0130, B:63:0x0142, B:64:0x014a), top: B:81:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(defpackage.C3658xf r9, boolean r10, defpackage.InterfaceC3493uc r11) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3658xf.f(xf, boolean, uc):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0272Pe
    public final Object a(InterfaceC3396sn interfaceC3396sn, InterfaceC3493uc interfaceC3493uc) {
        QK qk = (QK) interfaceC3493uc.getContext().get(C0108Fk.o);
        if (qk != null) {
            qk.a(this);
        }
        return AbstractC0136He.S(new QK(qk, this), new C3334rf(this, interfaceC3396sn, null), interfaceC3493uc);
    }

    public final InterfaceC0334Sp g() {
        return (InterfaceC0334Sp) this.k.getValue();
    }

    @Override // defpackage.InterfaceC0272Pe
    public final InterfaceC3067ml getData() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.InterfaceC3493uc r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C2788hf
            if (r0 == 0) goto L13
            r0 = r6
            hf r0 = (defpackage.C2788hf) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            hf r0 = new hf
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r1 = r0.b
            xf r0 = r0.a
            defpackage.AbstractC0115Ga.U(r6)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r6 = move-exception
            goto L6d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            xf r2 = r0.a
            defpackage.AbstractC0115Ga.U(r6)
            goto L51
        L3e:
            defpackage.AbstractC0115Ga.U(r6)
            Sp r6 = r5.g()
            r0.a = r5
            r0.e = r4
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            KJ r4 = r2.i     // Catch: java.lang.Throwable -> L69
            r0.a = r2     // Catch: java.lang.Throwable -> L69
            r0.b = r6     // Catch: java.lang.Throwable -> L69
            r0.e = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r6 = r4.j(r0)     // Catch: java.lang.Throwable -> L69
            if (r6 != r1) goto L66
            return r1
        L66:
            DK r6 = defpackage.DK.a
            return r6
        L69:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L6d:
            co r0 = r0.h
            jB r2 = new jB
            r2.<init>(r6, r1)
            r0.M(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3658xf.h(uc):java.lang.Object");
    }

    public final Object i(InterfaceC3493uc interfaceC3493uc) {
        return ((C3011lk) this.j.getValue()).a(new C0425Ye(3, (InterfaceC3493uc) null), interfaceC3493uc);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.Object r12, boolean r13, defpackage.InterfaceC3493uc r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.C3550vf
            if (r0 == 0) goto L13
            r0 = r14
            vf r0 = (defpackage.C3550vf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            vf r0 = new vf
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.b
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            NB r12 = r0.a
            defpackage.AbstractC0115Ga.U(r14)
            goto L58
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            defpackage.AbstractC0115Ga.U(r14)
            NB r14 = new NB
            r14.<init>()
            cI r2 = r11.j
            java.lang.Object r2 = r2.getValue()
            lk r2 = (defpackage.C3011lk) r2
            wf r10 = new wf
            r9 = 0
            r4 = r10
            r5 = r14
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.a = r14
            r0.d = r3
            java.lang.Object r12 = r2.b(r10, r0)
            if (r12 != r1) goto L57
            return r1
        L57:
            r12 = r14
        L58:
            int r12 = r12.a
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3658xf.j(java.lang.Object, boolean, uc):java.lang.Object");
    }
}
