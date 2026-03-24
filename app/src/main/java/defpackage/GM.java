package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class GM {
    public static final boolean c = HM.a;
    public final ArrayList a = new ArrayList();
    public boolean b = false;

    public final synchronized void a(long j, String str) {
        if (this.b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.a.add(new FM(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        this.b = true;
        ArrayList arrayList = this.a;
        long j = arrayList.size() == 0 ? 0L : ((FM) arrayList.get(arrayList.size() - 1)).c - ((FM) arrayList.get(0)).c;
        if (j <= 0) {
            return;
        }
        long j2 = ((FM) this.a.get(0)).c;
        HM.b("(%-4d ms) %s", Long.valueOf(j), str);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            FM fm = (FM) it.next();
            long j3 = fm.c;
            HM.b("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(fm.b), fm.a);
            j2 = j3;
        }
    }

    public final void finalize() {
        if (this.b) {
            return;
        }
        b("Request on the loose");
        HM.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
