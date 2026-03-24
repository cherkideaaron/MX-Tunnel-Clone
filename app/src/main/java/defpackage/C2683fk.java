package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: fk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2683fk implements InterfaceC2838ia {
    public final File a;
    public final InterfaceC3478uE b;
    public final AtomicBoolean c;

    public C2683fk(File file, InterfaceC3478uE interfaceC3478uE) {
        AbstractC0500aq.m(file, "file");
        AbstractC0500aq.m(interfaceC3478uE, "serializer");
        this.a = file;
        this.b = interfaceC3478uE;
        this.c = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [fk] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(defpackage.C2683fk r7, defpackage.InterfaceC3493uc r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 190
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2683fk.a(fk, uc):java.lang.Object");
    }

    @Override // defpackage.InterfaceC2838ia
    public final void close() {
        this.c.set(true);
    }
}
