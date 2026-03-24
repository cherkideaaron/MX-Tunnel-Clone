package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: cd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class CallableC0596cd implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ C2567dd b;

    public CallableC0596cd(C2567dd c2567dd, long j) {
        this.b = c2567dd;
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.a);
        this.b.k.n(bundle);
        return null;
    }
}
