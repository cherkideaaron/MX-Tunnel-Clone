package defpackage;

/* renamed from: rN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3325rN {
    public final AN a;
    public C0130Gp[] b;

    public AbstractC3325rN() {
        this(new AN());
    }

    public final void a() {
        C0130Gp[] c0130GpArr = this.b;
        if (c0130GpArr != null) {
            C0130Gp c0130GpF = c0130GpArr[TP.a(1)];
            C0130Gp c0130GpF2 = this.b[TP.a(2)];
            AN an = this.a;
            if (c0130GpF2 == null) {
                c0130GpF2 = an.a.f(2);
            }
            if (c0130GpF == null) {
                c0130GpF = an.a.f(1);
            }
            g(C0130Gp.a(c0130GpF, c0130GpF2));
            C0130Gp c0130Gp = this.b[TP.a(16)];
            if (c0130Gp != null) {
                f(c0130Gp);
            }
            C0130Gp c0130Gp2 = this.b[TP.a(32)];
            if (c0130Gp2 != null) {
                d(c0130Gp2);
            }
            C0130Gp c0130Gp3 = this.b[TP.a(64)];
            if (c0130Gp3 != null) {
                h(c0130Gp3);
            }
        }
    }

    public abstract AN b();

    public void c(int i, C0130Gp c0130Gp) {
        if (this.b == null) {
            this.b = new C0130Gp[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[TP.a(i2)] = c0130Gp;
            }
        }
    }

    public abstract void e(C0130Gp c0130Gp);

    public abstract void g(C0130Gp c0130Gp);

    public AbstractC3325rN(AN an) {
        this.a = an;
    }

    public void d(C0130Gp c0130Gp) {
    }

    public void f(C0130Gp c0130Gp) {
    }

    public void h(C0130Gp c0130Gp) {
    }
}
