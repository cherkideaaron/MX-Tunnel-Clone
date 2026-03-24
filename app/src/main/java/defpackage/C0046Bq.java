package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: Bq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0046Bq extends CancellationException {
    public final transient InterfaceC0029Aq a;

    public C0046Bq(String str, Throwable th, InterfaceC0029Aq interfaceC0029Aq) {
        super(str);
        this.a = interfaceC0029Aq;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0046Bq) {
                C0046Bq c0046Bq = (C0046Bq) obj;
                if (!AbstractC0500aq.b(c0046Bq.getMessage(), getMessage()) || !AbstractC0500aq.b(c0046Bq.a, this.a) || !AbstractC0500aq.b(c0046Bq.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        AbstractC0500aq.j(message);
        int iHashCode = (this.a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.a;
    }
}
