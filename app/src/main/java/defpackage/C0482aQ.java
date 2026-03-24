package defpackage;

import android.app.Application;
import com.google.android.gms.common.api.internal.BackgroundDetector;

/* renamed from: aQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0482aQ {
    public final KP a;

    public C0482aQ(C3663xk c3663xk) {
        c3663xk.a();
        this.a = new KP(c3663xk);
        BackgroundDetector.initialize((Application) c3663xk.a.getApplicationContext());
        BackgroundDetector.getInstance().addListener(new C0591cQ(this));
    }
}
