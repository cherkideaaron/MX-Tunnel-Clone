package defpackage;

import java.io.Serializable;

/* renamed from: cI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0583cI implements InterfaceC3508ur, Serializable {
    public InterfaceC0606cn a;
    public volatile Object b;
    public final Object c;

    public C0583cI(InterfaceC0606cn interfaceC0606cn) {
        AbstractC0500aq.m(interfaceC0606cn, "initializer");
        this.a = interfaceC0606cn;
        this.b = C0360Uh.n;
        this.c = this;
    }

    @Override // defpackage.InterfaceC3508ur
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.b;
        C0360Uh c0360Uh = C0360Uh.n;
        if (obj != c0360Uh) {
            return obj;
        }
        synchronized (this.c) {
            objInvoke = this.b;
            if (objInvoke == c0360Uh) {
                InterfaceC0606cn interfaceC0606cn = this.a;
                AbstractC0500aq.j(interfaceC0606cn);
                objInvoke = interfaceC0606cn.invoke();
                this.b = objInvoke;
                this.a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.b != C0360Uh.n ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
