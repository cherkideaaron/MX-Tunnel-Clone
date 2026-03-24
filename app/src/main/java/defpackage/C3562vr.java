package defpackage;

/* renamed from: vr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3562vr implements InterfaceC3258qA {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile InterfaceC3258qA b;

    public C3562vr(InterfaceC3258qA interfaceC3258qA) {
        this.b = interfaceC3258qA;
    }

    @Override // defpackage.InterfaceC3258qA
    public final Object get() {
        Object obj = this.a;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.a;
                    if (obj == obj2) {
                        obj = this.b.get();
                        this.a = obj;
                        this.b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
