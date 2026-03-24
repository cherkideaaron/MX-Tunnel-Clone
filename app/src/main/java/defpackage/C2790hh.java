package defpackage;

/* renamed from: hh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2790hh implements InterfaceC3148oA {
    public static final Object c = new Object();
    public volatile InterfaceC3148oA a;
    public volatile Object b;

    public static InterfaceC3148oA a(InterfaceC0192Kj interfaceC0192Kj) {
        if (interfaceC0192Kj instanceof C2790hh) {
            return interfaceC0192Kj;
        }
        C2790hh c2790hh = new C2790hh();
        c2790hh.b = c;
        c2790hh.a = interfaceC0192Kj;
        return c2790hh;
    }

    @Override // defpackage.InterfaceC3203pA
    public final Object get() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.b;
                    if (obj == obj2) {
                        obj = this.a.get();
                        Object obj3 = this.b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.b = obj;
                        this.a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
