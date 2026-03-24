package defpackage;

import android.os.Build;

/* renamed from: Zh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0445Zh extends AbstractC0136He {
    public final /* synthetic */ C3573w1 w;

    public C0445Zh(C3573w1 c3573w1) {
        this.w = c3573w1;
    }

    @Override // defpackage.AbstractC0136He
    public final void B(Throwable th) {
        ((C2626ei) this.w.a).d(th);
    }

    @Override // defpackage.AbstractC0136He
    public final void C(C3532vE c3532vE) {
        C3573w1 c3573w1 = this.w;
        c3573w1.c = c3532vE;
        C3532vE c3532vE2 = (C3532vE) c3573w1.c;
        C2626ei c2626ei = (C2626ei) c3573w1.a;
        c3573w1.b = new D3(c3532vE2, c2626ei.g, c2626ei.i, Build.VERSION.SDK_INT >= 34 ? AbstractC3009li.a() : AbstractC0069Df.t());
        ((C2626ei) c3573w1.a).e();
    }
}
