package defpackage;

import android.os.Process;

/* renamed from: oC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3150oC extends Thread {
    public final int a;

    public C3150oC(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.a = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
