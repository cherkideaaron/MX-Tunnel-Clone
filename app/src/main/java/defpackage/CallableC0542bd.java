package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC0542bd implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ C3308r6 d;
    public final /* synthetic */ boolean e = false;
    public final /* synthetic */ C2567dd f;

    public CallableC0542bd(C2567dd c2567dd, long j, Throwable th, Thread thread, C3308r6 c3308r6) {
        this.f = c2567dd;
        this.a = j;
        this.b = th;
        this.c = thread;
        this.d = c3308r6;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        JG jg;
        JG jg2;
        long j = this.a;
        long j2 = j / 1000;
        C2567dd c2567dd = this.f;
        NavigableSet navigableSetC = ((C0254Od) c2567dd.m.b).c();
        String str = !navigableSetC.isEmpty() ? (String) navigableSetC.first() : null;
        String str2 = "FirebaseCrashlytics";
        if (str == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        c2567dd.c.o();
        H2 h2 = c2567dd.m;
        h2.getClass();
        String strConcat = "Persisting fatal event for session ".concat(str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        C0072Di c0072Di = C0072Di.a;
        C0203Ld c0203Ld = (C0203Ld) h2.a;
        Context context = c0203Ld.a;
        int i = context.getResources().getConfiguration().orientation;
        Stack stack = new Stack();
        for (Throwable cause = this.b; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        KJ kj = null;
        while (true) {
            boolean zIsEmpty = stack.isEmpty();
            jg = c0203Ld.d;
            if (zIsEmpty) {
                break;
            }
            Throwable th = (Throwable) stack.pop();
            kj = new KJ(th.getLocalizedMessage(), th.getClass().getName(), jg.c(th.getStackTrace()), kj);
            stack = stack;
            str2 = str2;
            j = j;
        }
        long j3 = j;
        String str3 = str2;
        I5 i5 = new I5();
        i5.b = AppMeasurement.CRASH_ORIGIN;
        i5.a = j2;
        i5.g = (byte) (i5.g | 1);
        AbstractC3764zd abstractC3764zdW = C0360Uh.m.w(context);
        int i2 = ((T5) abstractC3764zdW).c;
        Boolean boolValueOf = i2 > 0 ? Boolean.valueOf(i2 != 100) : null;
        ArrayList arrayListV = C0360Uh.v(context);
        byte b = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) kj.c;
        Thread thread = this.c;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b2 = (byte) 1;
        List listD = C0203Ld.d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        String str4 = str;
        if (b2 != 1) {
            StringBuilder sb = new StringBuilder();
            if ((1 & b2) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException(AbstractC3264qG.i("Missing required properties:", sb));
        }
        arrayList.add(new P5(name, 4, listD));
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            if (key.equals(thread)) {
                jg2 = jg;
            } else {
                StackTraceElement[] stackTraceElementArrC = jg.c(entry.getValue());
                String name2 = key.getName();
                if (name2 == null) {
                    throw new NullPointerException("Null name");
                }
                List listD2 = C0203Ld.d(stackTraceElementArrC, 0);
                if (listD2 == null) {
                    throw new NullPointerException("Null frames");
                }
                if (b2 != 1) {
                    StringBuilder sb2 = new StringBuilder();
                    if ((1 & b2) == 0) {
                        sb2.append(" importance");
                    }
                    throw new IllegalStateException(AbstractC3264qG.i("Missing required properties:", sb2));
                }
                jg2 = jg;
                arrayList.add(new P5(name2, 0, listD2));
            }
            jg = jg2;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        N5 n5C = C0203Ld.c(kj, 0);
        if (b2 != 1) {
            StringBuilder sb3 = new StringBuilder();
            if ((1 & b2) == 0) {
                sb3.append(" address");
            }
            throw new IllegalStateException(AbstractC3264qG.i("Missing required properties:", sb3));
        }
        O5 o5 = new O5("0", "0", 0L);
        List listA = c0203Ld.a();
        if (listA == null) {
            throw new NullPointerException("Null binaries");
        }
        L5 l5 = new L5(listUnmodifiableList, n5C, null, o5, listA);
        if (b != 1) {
            StringBuilder sb4 = new StringBuilder();
            if ((1 & b) == 0) {
                sb4.append(" uiOrientation");
            }
            throw new IllegalStateException(AbstractC3264qG.i("Missing required properties:", sb4));
        }
        i5.c = new K5(l5, null, null, boolValueOf, abstractC3764zdW, arrayListV, i);
        i5.d = c0203Ld.b(i);
        J5 j5A = i5.a();
        R2 r2 = (R2) h2.d;
        C3429tJ c3429tJ = (C3429tJ) h2.e;
        ((C0254Od) h2.b).d(H2.b(H2.a(j5A, r2, c3429tJ, c0072Di), c3429tJ), str4, true);
        try {
            C3121nk c3121nk = c2567dd.g;
            String str5 = ".ae" + j3;
            c3121nk.getClass();
            if (!new File((File) c3121nk.c, str5).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Log.w(str3, "Could not create app exception marker file.", e);
        }
        C3308r6 c3308r6 = this.d;
        c2567dd.b(false, c3308r6, false);
        c2567dd.c(new C2598e8().a, Boolean.valueOf(this.e));
        return !c2567dd.b.a() ? Tasks.forResult(null) : ((TaskCompletionSource) ((AtomicReference) c3308r6.o).get()).getTask().onSuccessTask((ExecutorC0305Rd) c2567dd.e.b, new R2(17, this, str4));
    }
}
