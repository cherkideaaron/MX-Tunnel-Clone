package defpackage;

/* renamed from: ih, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2844ih implements InterfaceC3203pA {
    public static final Object c = new Object();
    public volatile InterfaceC3203pA a;
    public volatile Object b;

    public static InterfaceC3203pA a(InterfaceC0209Lj interfaceC0209Lj) {
        if (interfaceC0209Lj instanceof C2844ih) {
            return interfaceC0209Lj;
        }
        C2844ih c2844ih = new C2844ih();
        c2844ih.b = c;
        c2844ih.a = interfaceC0209Lj;
        return c2844ih;
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
