package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: lk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3011lk implements InterfaceC2838ia {
    public final File a;
    public final InterfaceC3478uE b;
    public final InterfaceC0334Sp c;
    public final InterfaceC0606cn d;
    public final AtomicBoolean e;
    public final Vv f;

    public C3011lk(File file, InterfaceC3478uE interfaceC3478uE, InterfaceC0334Sp interfaceC0334Sp, C2793hk c2793hk) {
        AbstractC0500aq.m(interfaceC3478uE, "serializer");
        AbstractC0500aq.m(interfaceC0334Sp, "coordinator");
        this.a = file;
        this.b = interfaceC3478uE;
        this.c = interfaceC0334Sp;
        this.d = c2793hk;
        this.e = new AtomicBoolean(false);
        this.f = AbstractC0069Df.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x007c, blocks: (B:33:0x007b, B:42:0x008c, B:41:0x0089, B:38:0x0084), top: B:54:0x0020, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [lk] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jk] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [lk] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [Ye] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.C0425Ye r9, defpackage.InterfaceC3493uc r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.C2901jk
            if (r0 == 0) goto L13
            r0 = r10
            jk r0 = (defpackage.C2901jk) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            jk r0 = new jk
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.d
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            boolean r9 = r0.c
            fk r1 = r0.b
            lk r0 = r0.a
            defpackage.AbstractC0115Ga.U(r10)     // Catch: java.lang.Throwable -> L2e
            goto L6b
        L2e:
            r10 = move-exception
            goto L84
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            defpackage.AbstractC0115Ga.U(r10)
            java.util.concurrent.atomic.AtomicBoolean r10 = r8.e
            boolean r10 = r10.get()
            r10 = r10 ^ r3
            if (r10 == 0) goto L9a
            Vv r10 = r8.f
            boolean r10 = r10.e(r4)
            fk r2 = new fk     // Catch: java.lang.Throwable -> L8d
            java.io.File r5 = r8.a     // Catch: java.lang.Throwable -> L8d
            uE r6 = r8.b     // Catch: java.lang.Throwable -> L8d
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L7e
            r0.a = r8     // Catch: java.lang.Throwable -> L7e
            r0.b = r2     // Catch: java.lang.Throwable -> L7e
            r0.c = r10     // Catch: java.lang.Throwable -> L7e
            r0.f = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r9 = r9.b(r2, r5, r0)     // Catch: java.lang.Throwable -> L7e
            if (r9 != r1) goto L66
            return r1
        L66:
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L6b:
            r1.close()     // Catch: java.lang.Throwable -> L70
            r1 = r4
            goto L71
        L70:
            r1 = move-exception
        L71:
            if (r1 != 0) goto L7b
            if (r9 == 0) goto L7a
            Vv r9 = r0.f
            r9.f(r4)
        L7a:
            return r10
        L7b:
            throw r1     // Catch: java.lang.Throwable -> L7c
        L7c:
            r10 = move-exception
            goto L92
        L7e:
            r9 = move-exception
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L84:
            r1.close()     // Catch: java.lang.Throwable -> L88
            goto L8c
        L88:
            r1 = move-exception
            defpackage.MO.a(r10, r1)     // Catch: java.lang.Throwable -> L7c
        L8c:
            throw r10     // Catch: java.lang.Throwable -> L7c
        L8d:
            r9 = move-exception
            r0 = r8
            r7 = r10
            r10 = r9
            r9 = r7
        L92:
            if (r9 == 0) goto L99
            Vv r9 = r0.f
            r9.f(r4)
        L99:
            throw r10
        L9a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "StorageConnection has already been disposed."
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3011lk.a(Ye, uc):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3 A[Catch: all -> 0x0113, IOException -> 0x0115, TRY_ENTER, TryCatch #2 {all -> 0x0113, blocks: (B:43:0x00e3, B:45:0x00e9, B:48:0x00f2, B:49:0x0112, B:56:0x0120, B:65:0x012f, B:67:0x0135, B:68:0x0138, B:63:0x012d, B:62:0x012a, B:33:0x009f, B:34:0x00bb), top: B:77:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0120 A[Catch: all -> 0x0113, IOException -> 0x0115, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0113, blocks: (B:43:0x00e3, B:45:0x00e9, B:48:0x00f2, B:49:0x0112, B:56:0x0120, B:65:0x012f, B:67:0x0135, B:68:0x0138, B:63:0x012d, B:62:0x012a, B:33:0x009f, B:34:0x00bb), top: B:77:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.C3604wf r12, defpackage.InterfaceC3493uc r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3011lk.b(wf, uc):java.lang.Object");
    }

    @Override // defpackage.InterfaceC2838ia
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }
}
