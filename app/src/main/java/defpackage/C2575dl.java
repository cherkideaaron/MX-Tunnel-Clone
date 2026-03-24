package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: dl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2575dl {
    public static final C2575dl a = new C2575dl();
    public static final Map b = Collections.synchronizedMap(new LinkedHashMap());

    public static C0550bl a(OE oe) {
        Map map = b;
        AbstractC0500aq.l(map, "dependencies");
        Object obj = map.get(oe);
        if (obj != null) {
            return (C0550bl) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + oe + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3 A[Catch: all -> 0x00cc, TRY_ENTER, TryCatch #0 {all -> 0x00cc, blocks: (B:22:0x009c, B:25:0x00b3, B:26:0x00cb), top: B:31:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009a -> B:21:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.InterfaceC3493uc r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.C0604cl
            if (r0 == 0) goto L13
            r0 = r11
            cl r0 = (defpackage.C0604cl) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            cl r0 = new cl
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.m
            Sc r1 = defpackage.EnumC0321Sc.a
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r2 = r0.f
            java.util.Map r4 = r0.e
            java.util.Map r4 = (java.util.Map) r4
            Tv r5 = r0.d
            OE r6 = r0.c
            java.util.Iterator r7 = r0.b
            java.util.Map r8 = r0.a
            java.util.Map r8 = (java.util.Map) r8
            defpackage.AbstractC0115Ga.U(r11)
            goto L9b
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L3f:
            defpackage.AbstractC0115Ga.U(r11)
            java.util.Map r11 = defpackage.C2575dl.b
            java.lang.String r2 = "dependencies"
            defpackage.AbstractC0500aq.l(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r11.size()
            int r4 = defpackage.Ht.U(r4)
            r2.<init>(r4)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r7 = r11
            r4 = r2
        L60:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto Ld3
            java.lang.Object r11 = r7.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r5 = r11.getKey()
            r6 = r5
            OE r6 = (defpackage.OE) r6
            java.lang.Object r11 = r11.getValue()
            bl r11 = (defpackage.C0550bl) r11
            Tv r11 = r11.a
            r5 = r4
            java.util.Map r5 = (java.util.Map) r5
            r0.a = r5
            r0.b = r7
            r0.c = r6
            r0.d = r11
            r0.e = r5
            r0.f = r2
            r0.o = r3
            r5 = r11
            Vv r5 = (defpackage.Vv) r5
            java.lang.Object r11 = r5.d(r0)
            if (r11 != r1) goto L9a
            return r1
        L9a:
            r8 = r4
        L9b:
            r11 = 0
            java.lang.String r9 = "subscriberName"
            defpackage.AbstractC0500aq.m(r6, r9)     // Catch: java.lang.Throwable -> Lcc
            bl r9 = a(r6)     // Catch: java.lang.Throwable -> Lcc
            ad r9 = r9.b     // Catch: java.lang.Throwable -> Lcc
            if (r9 == 0) goto Lb3
            Vv r5 = (defpackage.Vv) r5
            r5.f(r11)
            r4.put(r2, r9)
            r4 = r8
            goto L60
        Lb3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r2 = "Subscriber "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lcc
            r1.append(r6)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r2 = " has not been registered."
            r1.append(r2)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lcc
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lcc
            throw r0     // Catch: java.lang.Throwable -> Lcc
        Lcc:
            r0 = move-exception
            Vv r5 = (defpackage.Vv) r5
            r5.f(r11)
            throw r0
        Ld3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2575dl.b(uc):java.lang.Object");
    }
}
