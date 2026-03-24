package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3609wk extends BroadcastReceiver {
    public static final AtomicReference b = new AtomicReference();
    public final Context a;

    public C3609wk(Context context) {
        this.a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (C3663xk.k) {
            try {
                Iterator it = ((S3) C3663xk.l.values()).iterator();
                while (it.hasNext()) {
                    ((C3663xk) it.next()).g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.unregisterReceiver(this);
    }
}
