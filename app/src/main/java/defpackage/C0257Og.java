package defpackage;

/* renamed from: Og, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0257Og extends RuntimeException {
    public final transient InterfaceC0168Jc a;

    public C0257Og(InterfaceC0168Jc interfaceC0168Jc) {
        this.a = interfaceC0168Jc;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.a.toString();
    }
}
