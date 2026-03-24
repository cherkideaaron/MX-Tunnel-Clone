package defpackage;

import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Lv implements InterfaceC0334Sp {
    public static final C0108Fk j = new C0108Fk(21);
    public final InterfaceC0168Jc a;
    public final File b;
    public final C0520b9 c;
    public final String d;
    public final String e;
    public final String f;
    public final Vv g;
    public final C0583cI h;
    public final C0583cI i;

    public Lv(InterfaceC0168Jc interfaceC0168Jc, File file) {
        AbstractC0500aq.m(interfaceC0168Jc, "context");
        AbstractC0500aq.m(file, "file");
        this.a = interfaceC0168Jc;
        this.b = file;
        Object obj = Ov.b;
        this.c = new C0520b9(new Nv(file, null), C0021Ai.a, -2, N7.a, 0);
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = AbstractC0069Df.a();
        this.h = AbstractC0069Df.G(new Iv(this, 2));
        this.i = AbstractC0069Df.G(new Iv(this, 1));
    }

    public static final void f(Lv lv, File file) {
        lv.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    @Override // defpackage.InterfaceC0334Sp
    public final Object a(InterfaceC3493uc interfaceC3493uc) {
        if (this.i.b != C0360Uh.n) {
            return new Integer(C3587wF.b.nativeIncrementAndGetCounterValue(((C3587wF) this.i.getValue()).a));
        }
        return AbstractC0136He.S(this.a, new Hv(this, null), interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC0334Sp
    public final Object b(InterfaceC3493uc interfaceC3493uc) {
        if (this.i.b != C0360Uh.n) {
            return new Integer(C3587wF.b.nativeGetCounterValue(((C3587wF) this.i.getValue()).a));
        }
        return AbstractC0136He.S(this.a, new Gv(this, null), interfaceC3493uc);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd A[Catch: all -> 0x00c1, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00c1, blocks: (B:42:0x00bd, B:56:0x00de, B:57:0x00e1), top: B:67:0x0022, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de A[Catch: all -> 0x00c1, TRY_ENTER, TryCatch #1 {all -> 0x00c1, blocks: (B:42:0x00bd, B:56:0x00de, B:57:0x00e1), top: B:67:0x0022, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [Sc, java.io.Closeable, java.lang.Object] */
    @Override // defpackage.InterfaceC0334Sp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.InterfaceC2631en r9, defpackage.InterfaceC3493uc r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Lv.c(en, uc):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0334Sp
    public final InterfaceC3067ml d() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00db A[Catch: all -> 0x00df, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00df, blocks: (B:59:0x00db, B:71:0x00f4, B:72:0x00f7), top: B:90:0x0027, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f4 A[Catch: all -> 0x00df, TRY_ENTER, TryCatch #7 {all -> 0x00df, blocks: (B:59:0x00db, B:71:0x00f4, B:72:0x00f7), top: B:90:0x0027, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r2v0, types: [sn] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [Kv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [Vv] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // defpackage.InterfaceC0334Sp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.InterfaceC3396sn r18, defpackage.InterfaceC3493uc r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Lv.e(sn, uc):java.lang.Object");
    }
}
