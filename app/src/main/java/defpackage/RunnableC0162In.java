package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: In, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0162In implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final G3 f = new G3(3);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    public static JB c(RecyclerView recyclerView, int i, long j) {
        int iE = recyclerView.e.E();
        for (int i2 = 0; i2 < iE; i2++) {
            JB jbI = RecyclerView.I(recyclerView.e.D(i2));
            if (jbI.c == i && !jbI.h()) {
                return null;
            }
        }
        BB bb = recyclerView.b;
        try {
            recyclerView.P();
            JB jbJ = bb.j(i, j);
            if (jbJ != null) {
                if (!jbJ.g() || jbJ.h()) {
                    bb.a(jbJ, false);
                } else {
                    bb.g(jbJ.a);
                }
            }
            recyclerView.Q(false);
            return jbJ;
        } catch (Throwable th) {
            recyclerView.Q(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.w && this.b == 0) {
            this.b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0463a7 c0463a7 = recyclerView.i0;
        c0463a7.a = i;
        c0463a7.b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(long r17) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC0162In.b(long):void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = JJ.a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.a;
            if (arrayList.isEmpty()) {
                this.b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.c);
                this.b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.b = 0L;
            int i3 = JJ.a;
            Trace.endSection();
            throw th;
        }
    }
}
