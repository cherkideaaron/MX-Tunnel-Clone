package defpackage;

import android.view.ViewGroup;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;

/* renamed from: s2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3358s2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ F2 b;

    public /* synthetic */ RunnableC3358s2(F2 f2, int i) {
        this.a = i;
        this.b = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                F2 f2 = this.b;
                if ((f2.f0 & 1) != 0) {
                    f2.v(0);
                }
                if ((f2.f0 & 4096) != 0) {
                    f2.v(FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS);
                }
                f2.e0 = false;
                f2.f0 = 0;
                break;
            default:
                F2 f22 = this.b;
                f22.C.showAtLocation(f22.B, 55, 0, 0);
                C2885jM c2885jM = f22.E;
                if (c2885jM != null) {
                    c2885jM.b();
                }
                if (!(f22.F && (viewGroup = f22.G) != null && viewGroup.isLaidOut())) {
                    f22.B.setAlpha(1.0f);
                    f22.B.setVisibility(0);
                    break;
                } else {
                    f22.B.setAlpha(0.0f);
                    C2885jM c2885jMA = UL.a(f22.B);
                    c2885jMA.a(1.0f);
                    f22.E = c2885jMA;
                    c2885jMA.d(new C3466u2(this, 0));
                    break;
                }
                break;
        }
    }
}
