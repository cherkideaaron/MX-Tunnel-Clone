package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: Vi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0378Vi implements GH, GA {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public C0378Vi(Executor executor) {
        this.c = executor;
    }

    public final synchronized void a(Executor executor, InterfaceC0429Yi interfaceC0429Yi) {
        try {
            executor.getClass();
            if (!this.a.containsKey(AbstractC0136He.class)) {
                this.a.put(AbstractC0136He.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(AbstractC0136He.class)).put(interfaceC0429Yi, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
