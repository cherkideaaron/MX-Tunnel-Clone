package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0455a extends CancellationException {
    public final transient Object a;

    public C0455a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.a = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
