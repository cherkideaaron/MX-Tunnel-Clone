package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ii, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2845ii implements InterfaceC2572di {
    public final Context a;

    public C2845ii(Context context, int i) {
        switch (i) {
            case 1:
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    public static boolean b(String str) {
        boolean z = false;
        for (String str2 : MO.r()) {
            String strG = AbstractC3264qG.g(str2, str);
            if (new File(str2, str).exists()) {
                AbstractC0136He.Q(strG + " binary detected!");
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.InterfaceC2572di
    public void a(AbstractC0136He abstractC0136He) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC3222pb("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC2736gi(this, abstractC0136He, threadPoolExecutor, 0));
    }

    public boolean c(ArrayList arrayList) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = this.a.getPackageManager();
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                packageManager.getPackageInfo(str, 0);
                AbstractC0136He.n(str + " ROOT management app detected!");
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d() {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2845ii.d():boolean");
    }
}
