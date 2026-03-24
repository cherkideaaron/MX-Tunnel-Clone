package defpackage;

import android.content.res.Resources;

/* renamed from: kK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2938kK {
    public static final AbstractC0069Df a;
    public static final C3348rt b;

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    static {
        /*
            java.lang.String r0 = "TypefaceCompat static init"
            defpackage.AbstractC0115Ga.c(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L13
            pK r0 = new pK
            r0.<init>()
        L10:
            defpackage.AbstractC2938kK.a = r0
            goto L44
        L13:
            r1 = 28
            if (r0 < r1) goto L1d
            oK r0 = new oK
            r0.<init>()
            goto L10
        L1d:
            r1 = 26
            if (r0 < r1) goto L27
            nK r0 = new nK
            r0.<init>()
            goto L10
        L27:
            r1 = 24
            if (r0 < r1) goto L3e
            java.lang.reflect.Method r0 = defpackage.C3048mK.m
            if (r0 != 0) goto L36
            java.lang.String r1 = "TypefaceCompatApi24Impl"
            java.lang.String r2 = "Unable to collect necessary private methods.Fallback to legacy implementation."
            android.util.Log.w(r1, r2)
        L36:
            if (r0 == 0) goto L3e
            mK r0 = new mK
            r0.<init>()
            goto L10
        L3e:
            lK r0 = new lK
            r0.<init>()
            goto L10
        L44:
            rt r0 = new rt
            r1 = 16
            r0.<init>(r1)
            defpackage.AbstractC2938kK.b = r0
            android.os.Trace.endSection()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2938kK.<clinit>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r16, defpackage.InterfaceC0313Rl r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, defpackage.AbstractC3296qu r23, boolean r24) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC2938kK.a(android.content.Context, Rl, android.content.res.Resources, int, java.lang.String, int, int, qu, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
