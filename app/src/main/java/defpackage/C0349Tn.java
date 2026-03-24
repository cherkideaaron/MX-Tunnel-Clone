package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: Tn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0349Tn implements InterfaceC2553dH {
    public final C2776hL a;
    public final TaskCompletionSource b;

    public C0349Tn(C2776hL c2776hL, TaskCompletionSource taskCompletionSource) {
        this.a = c2776hL;
        this.b = taskCompletionSource;
    }

    @Override // defpackage.InterfaceC2553dH
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override // defpackage.InterfaceC2553dH
    public final boolean b(C3686y6 c3686y6) {
        if (c3686y6.b != 4 || this.a.a(c3686y6)) {
            return false;
        }
        String str = c3686y6.c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.b.setResult(new C3199p6(str, c3686y6.e, c3686y6.f));
        return true;
    }
}
