package defpackage;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.Objects;

/* renamed from: cQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0591cQ implements BackgroundDetector.BackgroundStateChangeListener {
    public final /* synthetic */ C0482aQ a;

    public C0591cQ(C0482aQ c0482aQ) {
        Objects.requireNonNull(c0482aQ);
        this.a = c0482aQ;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        C0482aQ c0482aQ = this.a;
        if (!z) {
            c0482aQ.getClass();
            c0482aQ.getClass();
        } else {
            c0482aQ.getClass();
            KP kp = c0482aQ.a;
            kp.c.removeCallbacks(kp.d);
        }
    }
}
