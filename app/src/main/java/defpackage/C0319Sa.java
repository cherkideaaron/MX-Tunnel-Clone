package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: Sa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0319Sa {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final InterfaceC2892jb f;
    public final Set g;

    public C0319Sa(String str, Set set, Set set2, int i, int i2, InterfaceC2892jb interfaceC2892jb, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = interfaceC2892jb;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static C0302Ra a(KA ka) {
        return new C0302Ra(ka, new KA[0]);
    }

    public static C0302Ra b(Class cls) {
        return new C0302Ra(cls, new Class[0]);
    }

    public static C0319Sa c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(KA.a(cls));
        for (Class cls2 : clsArr) {
            AbstractC3279qd.l(cls2, "Null interface");
            hashSet.add(KA.a(cls2));
        }
        return new C0319Sa(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C0285Qa(obj, 0), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
