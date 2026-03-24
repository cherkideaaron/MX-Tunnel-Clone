package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: Ra, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0302Ra {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public int d;
    public int e;
    public InterfaceC2892jb f;
    public final HashSet g;

    public C0302Ra(KA ka, KA[] kaArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(ka);
        for (KA ka2 : kaArr) {
            AbstractC3279qd.l(ka2, "Null interface");
        }
        Collections.addAll(this.b, kaArr);
    }

    public final void a(C0036Bg c0036Bg) {
        if (!(!this.b.contains(c0036Bg.a))) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.c.add(c0036Bg);
    }

    public final C0319Sa b() {
        if (this.f != null) {
            return new C0319Sa(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final void c(int i) {
        if (!(this.d == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.d = i;
    }

    public C0302Ra(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(KA.a(cls));
        for (Class cls2 : clsArr) {
            AbstractC3279qd.l(cls2, "Null interface");
            this.b.add(KA.a(cls2));
        }
    }
}
