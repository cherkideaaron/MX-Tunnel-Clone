package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: bn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0552bn {
    public final Executor a;
    public boolean c;
    public final Object b = new Object();
    public final ArrayList d = new ArrayList();

    public C0552bn(ViewTreeObserverOnDrawListenerC0594cb viewTreeObserverOnDrawListenerC0594cb, C0336Ta c0336Ta) {
    }

    public final void a() {
        synchronized (this.b) {
            try {
                this.c = true;
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0606cn) it.next()).invoke();
                }
                this.d.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
