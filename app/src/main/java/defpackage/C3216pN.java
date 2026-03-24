package defpackage;

import android.view.WindowInsets;

/* renamed from: pN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3216pN extends AbstractC3325rN {
    public final WindowInsets.Builder c;

    public C3216pN() {
        this.c = AbstractC3378sM.e();
    }

    @Override // defpackage.AbstractC3325rN
    public AN b() {
        a();
        AN anG = AN.g(null, this.c.build());
        anG.a.o(this.b);
        return anG;
    }

    @Override // defpackage.AbstractC3325rN
    public void d(C0130Gp c0130Gp) {
        this.c.setMandatorySystemGestureInsets(c0130Gp.d());
    }

    @Override // defpackage.AbstractC3325rN
    public void e(C0130Gp c0130Gp) {
        this.c.setStableInsets(c0130Gp.d());
    }

    @Override // defpackage.AbstractC3325rN
    public void f(C0130Gp c0130Gp) {
        this.c.setSystemGestureInsets(c0130Gp.d());
    }

    @Override // defpackage.AbstractC3325rN
    public void g(C0130Gp c0130Gp) {
        this.c.setSystemWindowInsets(c0130Gp.d());
    }

    @Override // defpackage.AbstractC3325rN
    public void h(C0130Gp c0130Gp) {
        this.c.setTappableElementInsets(c0130Gp.d());
    }

    public C3216pN(AN an) {
        super(an);
        WindowInsets windowInsetsF = an.f();
        this.c = windowInsetsF != null ? AbstractC3378sM.f(windowInsetsF) : AbstractC3378sM.e();
    }
}
