package defpackage;

import android.content.Context;

/* renamed from: d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2538d2 implements InterfaceC2859ix {
    public final /* synthetic */ AbstractActivityC2592e2 a;

    public C2538d2(AbstractActivityC2592e2 abstractActivityC2592e2) {
        this.a = abstractActivityC2592e2;
    }

    @Override // defpackage.InterfaceC2859ix
    public final void a(Context context) {
        AbstractActivityC2592e2 abstractActivityC2592e2 = this.a;
        AbstractC3304r2 abstractC3304r2J = abstractActivityC2592e2.j();
        abstractC3304r2J.a();
        abstractActivityC2592e2.getSavedStateRegistry().a("androidx:appcompat");
        abstractC3304r2J.e();
    }
}
