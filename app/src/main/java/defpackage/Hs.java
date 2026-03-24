package defpackage;

/* loaded from: classes.dex */
public abstract class Hs {
    public final Tw a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ Is d;

    public Hs(Is is, Tw tw) {
        this.d = is;
        this.a = tw;
    }

    public final void d(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        Is is = this.d;
        int i2 = is.c;
        is.c = i + i2;
        if (!is.d) {
            is.d = true;
            while (true) {
                try {
                    int i3 = is.c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        is.e();
                    } else if (z3) {
                        is.f();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    is.d = false;
                    throw th;
                }
            }
            is.d = false;
        }
        if (this.b) {
            is.c(this);
        }
    }

    public boolean j(Or or) {
        return false;
    }

    public abstract boolean k();

    public void i() {
    }
}
