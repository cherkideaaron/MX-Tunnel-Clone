package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: wD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3585wD implements InterfaceC3508ur, Serializable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(C3585wD.class, Object.class, "b");
    public volatile InterfaceC0606cn a;
    public volatile Object b;

    @Override // defpackage.InterfaceC3508ur
    public final Object getValue() {
        Object obj = this.b;
        C0360Uh c0360Uh = C0360Uh.n;
        if (obj != c0360Uh) {
            return obj;
        }
        InterfaceC0606cn interfaceC0606cn = this.a;
        if (interfaceC0606cn != null) {
            Object objInvoke = interfaceC0606cn.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0360Uh, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c0360Uh) {
                }
            }
            this.a = null;
            return objInvoke;
        }
        return this.b;
    }

    public final String toString() {
        return this.b != C0360Uh.n ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
