package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: Ka, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0183Ka {
    public final Object a;
    public final InterfaceC3418t8 b;
    public final InterfaceC3504un c;
    public final Object d;
    public final Throwable e;

    public C0183Ka(Object obj, InterfaceC3418t8 interfaceC3418t8, InterfaceC3504un interfaceC3504un, Object obj2, Throwable th) {
        this.a = obj;
        this.b = interfaceC3418t8;
        this.c = interfaceC3504un;
        this.d = obj2;
        this.e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0183Ka a(C0183Ka c0183Ka, InterfaceC3418t8 interfaceC3418t8, CancellationException cancellationException, int i) {
        Object obj = c0183Ka.a;
        if ((i & 2) != 0) {
            interfaceC3418t8 = c0183Ka.b;
        }
        InterfaceC3418t8 interfaceC3418t82 = interfaceC3418t8;
        InterfaceC3504un interfaceC3504un = c0183Ka.c;
        Object obj2 = c0183Ka.d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c0183Ka.e;
        }
        c0183Ka.getClass();
        return new C0183Ka(obj, interfaceC3418t82, interfaceC3504un, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0183Ka)) {
            return false;
        }
        C0183Ka c0183Ka = (C0183Ka) obj;
        return AbstractC0500aq.b(this.a, c0183Ka.a) && AbstractC0500aq.b(this.b, c0183Ka.b) && AbstractC0500aq.b(this.c, c0183Ka.c) && AbstractC0500aq.b(this.d, c0183Ka.d) && AbstractC0500aq.b(this.e, c0183Ka.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC3418t8 interfaceC3418t8 = this.b;
        int iHashCode2 = (iHashCode + (interfaceC3418t8 == null ? 0 : interfaceC3418t8.hashCode())) * 31;
        InterfaceC3504un interfaceC3504un = this.c;
        int iHashCode3 = (iHashCode2 + (interfaceC3504un == null ? 0 : interfaceC3504un.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ C0183Ka(Object obj, InterfaceC3418t8 interfaceC3418t8, InterfaceC3504un interfaceC3504un, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : interfaceC3418t8, (i & 4) != 0 ? null : interfaceC3504un, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
