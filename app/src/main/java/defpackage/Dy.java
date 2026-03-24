package defpackage;

/* loaded from: classes2.dex */
public final class Dy implements InterfaceC3258qA {
    public static final C0220Md c = new C0220Md(26);
    public static final C3002lb d = new C3002lb(6);
    public InterfaceC3062mg a;
    public volatile InterfaceC3258qA b;

    public Dy(C0220Md c0220Md, InterfaceC3258qA interfaceC3258qA) {
        this.a = c0220Md;
        this.b = interfaceC3258qA;
    }

    public final void a(InterfaceC3062mg interfaceC3062mg) {
        InterfaceC3258qA interfaceC3258qA;
        InterfaceC3258qA interfaceC3258qA2;
        InterfaceC3258qA interfaceC3258qA3 = this.b;
        C3002lb c3002lb = d;
        if (interfaceC3258qA3 != c3002lb) {
            interfaceC3062mg.b(interfaceC3258qA3);
            return;
        }
        synchronized (this) {
            interfaceC3258qA = this.b;
            if (interfaceC3258qA != c3002lb) {
                interfaceC3258qA2 = interfaceC3258qA;
            } else {
                this.a = new C2947kb(4, this.a, interfaceC3062mg);
                interfaceC3258qA2 = null;
            }
        }
        if (interfaceC3258qA2 != null) {
            interfaceC3062mg.b(interfaceC3258qA);
        }
    }

    @Override // defpackage.InterfaceC3258qA
    public final Object get() {
        return this.b.get();
    }
}
