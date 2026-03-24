package defpackage;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class OD {
    public static final String a = C3130nt.f("Schedulers");

    public static void a(C2770hF c2770hF, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        C3308r6 c3308r6N = workDatabase.n();
        workDatabase.c();
        try {
            int i = Build.VERSION.SDK_INT;
            int i2 = c2770hF.c;
            if (i == 23) {
                i2 /= 2;
            }
            ArrayList arrayListC = c3308r6N.c(i2);
            ArrayList arrayListA = c3308r6N.a();
            if (arrayListC.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListC.iterator();
                while (it.hasNext()) {
                    c3308r6N.m(jCurrentTimeMillis, ((C2834iO) it.next()).a);
                }
            }
            workDatabase.h();
            workDatabase.f();
            if (arrayListC.size() > 0) {
                C2834iO[] c2834iOArr = (C2834iO[]) arrayListC.toArray(new C2834iO[arrayListC.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    LD ld = (LD) it2.next();
                    if (ld.a()) {
                        ld.e(c2834iOArr);
                    }
                }
            }
            if (arrayListA.size() > 0) {
                C2834iO[] c2834iOArr2 = (C2834iO[]) arrayListA.toArray(new C2834iO[arrayListA.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    LD ld2 = (LD) it3.next();
                    if (!ld2.a()) {
                        ld2.e(c2834iOArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
