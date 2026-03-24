package defpackage;

import android.content.Context;

/* renamed from: m2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3030m2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ RunnableC3030m2(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            r11 = this;
            int r0 = r11.a
            switch(r0) {
                case 0: goto L31;
                case 1: goto L14;
                default: goto L5;
            }
        L5:
            P3 r0 = new P3
            r1 = 1
            r0.<init>(r1)
            Uh r1 = defpackage.AbstractC0115Ga.g
            r2 = 0
            android.content.Context r3 = r11.b
            defpackage.AbstractC0115Ga.W(r3, r0, r1, r2)
            return
        L14:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10)
            m2 r1 = new m2
            android.content.Context r2 = r11.b
            r3 = 2
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
        L31:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto Lb1
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r4 = r11.b
            java.lang.String r5 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r4, r5)
            android.content.pm.PackageManager r5 = r4.getPackageManager()
            int r5 = r5.getComponentEnabledSetting(r3)
            if (r5 == r1) goto Lb1
            java.lang.String r5 = "locale"
            if (r0 < r2) goto L8a
            c4 r0 = defpackage.AbstractC3304r2.m
            r0.getClass()
            W3 r2 = new W3
            r2.<init>(r0)
        L59:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            r2 r0 = (defpackage.AbstractC3304r2) r0
            if (r0 == 0) goto L59
            F2 r0 = (defpackage.F2) r0
            android.content.Context r0 = r0.q
            if (r0 == 0) goto L59
            java.lang.Object r0 = r0.getSystemService(r5)
            goto L79
        L78:
            r0 = 0
        L79:
            if (r0 == 0) goto L8f
            android.os.LocaleList r0 = defpackage.AbstractC3140o2.a(r0)
            Us r2 = new Us
            Ys r6 = new Ys
            r6.<init>(r0)
            r2.<init>(r6)
            goto L91
        L8a:
            Us r2 = defpackage.AbstractC3304r2.c
            if (r2 == 0) goto L8f
            goto L91
        L8f:
            Us r2 = defpackage.Us.b
        L91:
            Xs r0 = r2.a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Laa
            java.lang.String r0 = defpackage.AbstractC0136He.F(r4)
            java.lang.Object r2 = r4.getSystemService(r5)
            if (r2 == 0) goto Laa
            android.os.LocaleList r0 = defpackage.AbstractC3085n2.a(r0)
            defpackage.AbstractC3140o2.b(r2, r0)
        Laa:
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        Lb1:
            defpackage.AbstractC3304r2.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC3030m2.run():void");
    }
}
