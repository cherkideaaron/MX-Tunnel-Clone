package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0457a1 implements InterfaceC0060Cn, Serializable {
    public final Object a;
    public final boolean b = false;
    public final int c = 2;

    public C0457a1(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0457a1)) {
            return false;
        }
        C0457a1 c0457a1 = (C0457a1) obj;
        return this.b == c0457a1.b && this.c == c0457a1.c && AbstractC0500aq.b(this.a, c0457a1.a) && AbstractC0500aq.b(AtomicReference.class, AtomicReference.class);
    }

    @Override // defpackage.InterfaceC0060Cn
    public final int getArity() {
        return 2;
    }

    public final int hashCode() {
        return ((((((((((AtomicReference.class.hashCode() + ((this.a != null ? r0.hashCode() : 0) * 31)) * 31) + 113762) * 31) - 869290769) * 31) + (this.b ? 1231 : 1237)) * 31) + 2) * 31) + this.c;
    }

    public final String toString() {
        PB.a.getClass();
        return QB.a(this);
    }
}
