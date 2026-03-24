package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: em, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2630em extends Q0 {
    public final /* synthetic */ AtomicReference a;

    public C2630em(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.Q0
    public final void a(Object obj) {
        Q0 q0 = (Q0) this.a.get();
        if (q0 == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        q0.a(obj);
    }
}
