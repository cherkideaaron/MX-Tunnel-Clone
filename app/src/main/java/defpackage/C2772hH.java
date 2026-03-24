package defpackage;

import android.net.TrafficStats;
import android.os.SystemClock;
import java.util.ArrayList;

/* renamed from: hH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2772hH {
    public long a;
    public long b;
    public ArrayList c;
    public long d;
    public ArrayList e;
    public long f;

    public static void e(long j, long j2, ArrayList arrayList) {
        for (int i = 0; i < (j / j2) + 1; i++) {
            arrayList.add(arrayList.size(), new C2717gH());
            if (arrayList.size() >= 288) {
                arrayList.remove(0);
            }
        }
    }

    public final synchronized void a(long j) {
        d();
        ((C2717gH) this.c.get(r0.size() - 1)).a += j;
        ((C2717gH) this.e.get(r0.size() - 1)).a += j;
    }

    public final synchronized long b() {
        long j;
        long totalTxBytes = TrafficStats.getTotalTxBytes();
        j = totalTxBytes - this.a;
        this.a = totalTxBytes;
        return j;
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        d();
        ArrayList arrayList2 = this.e;
        arrayList = new ArrayList();
        for (int i = 0; i < arrayList2.size(); i++) {
            arrayList.add(Long.valueOf(((C2717gH) arrayList2.get(i)).a));
        }
        return arrayList;
    }

    public final void d() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.d;
        if (j >= 300000) {
            e(j, 300000L, this.c);
            this.d = (jElapsedRealtime / 300000) * 300000;
        }
        long j2 = jElapsedRealtime - this.f;
        if (j2 >= 1000) {
            e(j2, 1000L, this.e);
            this.f = (jElapsedRealtime / 1000) * 1000;
        }
    }

    public final synchronized void f() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.d = (jElapsedRealtime / 300000) * 300000;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 288; i++) {
            arrayList.add(new C2717gH());
        }
        this.c = arrayList;
        this.f = (jElapsedRealtime / 1000) * 1000;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < 288; i2++) {
            arrayList2.add(new C2717gH());
        }
        this.e = arrayList2;
    }
}
