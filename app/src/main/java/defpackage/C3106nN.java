package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* renamed from: nN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3106nN {
    public AbstractC3051mN a;

    public C3106nN(int i, Interpolator interpolator, long j) {
        this.a = Build.VERSION.SDK_INT >= 30 ? new C2996lN(S.j(i, interpolator, j)) : new C2833iN(i, interpolator, j);
    }
}
