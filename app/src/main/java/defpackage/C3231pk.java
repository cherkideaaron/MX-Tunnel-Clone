package defpackage;

/* renamed from: pk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3231pk extends C2683fk {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.InterfaceC3493uc r6, java.lang.Object r7) throws java.io.IOException {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C3176ok
            if (r0 == 0) goto L13
            r0 = r6
            ok r0 = (defpackage.C3176ok) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ok r0 = new ok
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.io.FileOutputStream r7 = r0.b
            java.io.FileOutputStream r0 = r0.a
            defpackage.AbstractC0115Ga.U(r6)     // Catch: java.lang.Throwable -> L2b
            goto L5e
        L2b:
            r6 = move-exception
            goto L6f
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.AbstractC0115Ga.U(r6)
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.c
            boolean r6 = r6.get()
            r6 = r6 ^ r3
            if (r6 == 0) goto L75
            java.io.FileOutputStream r6 = new java.io.FileOutputStream
            java.io.File r2 = r5.a
            r6.<init>(r2)
            uE r2 = r5.b     // Catch: java.lang.Throwable -> L6c
            xK r4 = new xK     // Catch: java.lang.Throwable -> L6c
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L6c
            r0.a = r6     // Catch: java.lang.Throwable -> L6c
            r0.b = r6     // Catch: java.lang.Throwable -> L6c
            r0.e = r3     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r7 = r2.writeTo(r7, r4, r0)     // Catch: java.lang.Throwable -> L6c
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r7 = r6
            r0 = r7
        L5e:
            java.io.FileDescriptor r6 = r7.getFD()     // Catch: java.lang.Throwable -> L2b
            r6.sync()     // Catch: java.lang.Throwable -> L2b
            r6 = 0
            defpackage.AbstractC2883jK.m(r0, r6)
            DK r6 = defpackage.DK.a
            return r6
        L6c:
            r7 = move-exception
            r0 = r6
            r6 = r7
        L6f:
            throw r6     // Catch: java.lang.Throwable -> L70
        L70:
            r7 = move-exception
            defpackage.AbstractC2883jK.m(r0, r6)
            throw r7
        L75:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "This scope has already been closed."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3231pk.b(uc, java.lang.Object):java.lang.Object");
    }
}
