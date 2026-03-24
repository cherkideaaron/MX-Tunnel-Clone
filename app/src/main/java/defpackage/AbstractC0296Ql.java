package defpackage;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: Ql, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0296Ql {
    public static final C3348rt a = new C3348rt(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final WF d;

    static {
        ThreadFactoryC3205pC threadFactoryC3205pC = new ThreadFactoryC3205pC();
        threadFactoryC3205pC.a = "fonts-androidx";
        threadFactoryC3205pC.b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), threadFactoryC3205pC);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new WF(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((C0194Kl) list.get(i2)).e);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bc, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        r8 = move-exception;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C0279Pl b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            r0 = 1
            java.lang.String r1 = "getFontSync"
            defpackage.AbstractC0115Ga.c(r1)
            rt r1 = defpackage.AbstractC0296Ql.a
            java.lang.Object r2 = r1.get(r8)     // Catch: java.lang.Throwable -> L19
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L1c
            Pl r8 = new Pl     // Catch: java.lang.Throwable -> L19
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r8
        L19:
            r8 = move-exception
            goto Lb9
        L1c:
            q1 r10 = defpackage.AbstractC0177Jl.a(r9, r10)     // Catch: java.lang.Throwable -> L19 android.content.pm.PackageManager.NameNotFoundException -> Laf
            int r2 = r10.b     // Catch: java.lang.Throwable -> L19
            r3 = 0
            java.lang.Object r10 = r10.c
            java.util.List r10 = (java.util.List) r10
            r4 = -3
            if (r2 == 0) goto L30
            if (r2 == r0) goto L2e
        L2c:
            r2 = r4
            goto L50
        L2e:
            r2 = -2
            goto L50
        L30:
            java.lang.Object r2 = r10.get(r3)     // Catch: java.lang.Throwable -> L19
            Vl[] r2 = (defpackage.C0381Vl[]) r2     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L4f
            int r5 = r2.length     // Catch: java.lang.Throwable -> L19
            if (r5 != 0) goto L3c
            goto L4f
        L3c:
            int r5 = r2.length     // Catch: java.lang.Throwable -> L19
            r6 = r3
        L3e:
            if (r6 >= r5) goto L4d
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L19
            int r7 = r7.e     // Catch: java.lang.Throwable -> L19
            if (r7 == 0) goto L4b
            if (r7 >= 0) goto L49
            goto L2c
        L49:
            r2 = r7
            goto L50
        L4b:
            int r6 = r6 + r0
            goto L3e
        L4d:
            r2 = r3
            goto L50
        L4f:
            r2 = r0
        L50:
            if (r2 == 0) goto L5b
            Pl r8 = new Pl     // Catch: java.lang.Throwable -> L19
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r8
        L5b:
            int r2 = r10.size()     // Catch: java.lang.Throwable -> L19
            if (r2 <= r0) goto L7d
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L19
            r2 = 29
            if (r0 < r2) goto L7d
            Df r0 = defpackage.AbstractC2938kK.a     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "TypefaceCompat.createFromFontInfoWithFallback"
            defpackage.AbstractC0115Ga.c(r0)     // Catch: java.lang.Throwable -> L19
            Df r0 = defpackage.AbstractC2938kK.a     // Catch: java.lang.Throwable -> L78
            android.graphics.Typeface r9 = r0.l(r11, r9, r10)     // Catch: java.lang.Throwable -> L78
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L19
            goto L93
        L78:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L19
            throw r8     // Catch: java.lang.Throwable -> L19
        L7d:
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> L19
            Vl[] r10 = (defpackage.C0381Vl[]) r10     // Catch: java.lang.Throwable -> L19
            Df r0 = defpackage.AbstractC2938kK.a     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = "TypefaceCompat.createFromFontInfo"
            defpackage.AbstractC0115Ga.c(r0)     // Catch: java.lang.Throwable -> L19
            Df r0 = defpackage.AbstractC2938kK.a     // Catch: java.lang.Throwable -> Laa
            android.graphics.Typeface r9 = r0.k(r9, r10, r11)     // Catch: java.lang.Throwable -> Laa
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L19
        L93:
            if (r9 == 0) goto La1
            r1.put(r8, r9)     // Catch: java.lang.Throwable -> L19
            Pl r8 = new Pl     // Catch: java.lang.Throwable -> L19
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r8
        La1:
            Pl r8 = new Pl     // Catch: java.lang.Throwable -> L19
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r8
        Laa:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L19
            throw r8     // Catch: java.lang.Throwable -> L19
        Laf:
            Pl r8 = new Pl     // Catch: java.lang.Throwable -> L19
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            return r8
        Lb9:
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0296Ql.b(java.lang.String, android.content.Context, java.util.List, int):Pl");
    }
}
