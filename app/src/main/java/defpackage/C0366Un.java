package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: Un, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0366Un implements InterfaceC2553dH {
    public final TaskCompletionSource a;

    public C0366Un(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // defpackage.InterfaceC2553dH
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.InterfaceC2553dH
    public final boolean b(C3686y6 c3686y6) {
        int i = c3686y6.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.trySetResult(c3686y6.a);
        return true;
    }
}
