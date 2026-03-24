package defpackage;

import java.util.Set;

/* renamed from: cK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585cK implements InterfaceC0531bK {
    public final Set a;
    public final J6 b;
    public final C2610eK c;

    public C0585cK(Set set, J6 j6, C2610eK c2610eK) {
        this.a = set;
        this.b = j6;
        this.c = c2610eK;
    }

    public final C2556dK a(String str, C0174Ji c0174Ji, LJ lj) {
        Set set = this.a;
        if (set.contains(c0174Ji)) {
            return new C2556dK(this.b, str, c0174Ji, lj, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c0174Ji, set));
    }
}
