package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3555vk implements BackgroundDetector.BackgroundStateChangeListener {
    public static final AtomicReference a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        synchronized (C3663xk.k) {
            try {
                Iterator it = new ArrayList(C3663xk.l.values()).iterator();
                while (it.hasNext()) {
                    C3663xk c3663xk = (C3663xk) it.next();
                    if (c3663xk.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = c3663xk.i.iterator();
                        while (it2.hasNext()) {
                            C3663xk c3663xk2 = ((C3501uk) it2.next()).a;
                            if (z) {
                                c3663xk2.getClass();
                            } else {
                                ((C0256Of) c3663xk2.h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
