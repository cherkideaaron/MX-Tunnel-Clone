package defpackage;

import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;

/* renamed from: np, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3126np implements InstallStateUpdatedListener {
    public final /* synthetic */ C3236pp a;

    public C3126np(C3236pp c3236pp) {
        this.a = c3236pp;
    }

    @Override // com.google.android.play.core.listener.StateUpdatedListener
    public final void onStateUpdate(InstallState installState) {
        InstallState installState2 = installState;
        C3236pp c3236pp = this.a;
        c3236pp.q.b = installState2;
        C3236pp.d(c3236pp);
        if (installState2.installStatus() == 11) {
            C3236pp.i(c3236pp);
        }
    }
}
