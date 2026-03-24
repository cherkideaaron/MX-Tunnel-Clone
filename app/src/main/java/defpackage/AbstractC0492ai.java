package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: ai, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0492ai {
    public int a;
    public final Object b;
    public final Object c;

    public AbstractC0492ai(InterfaceC2572di interfaceC2572di) {
        this.a = 0;
        this.c = new C0205Lf();
        this.b = interfaceC2572di;
    }

    public static AbstractC0492ai a(AbstractC3529vB abstractC3529vB, int i) {
        if (i == 0) {
            return new Ey(abstractC3529vB, 0);
        }
        if (i == 1) {
            return new Ey(abstractC3529vB, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        if (Integer.MIN_VALUE == this.a) {
            return 0;
        }
        return l() - this.a;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i);

    public AbstractC0492ai(AbstractC3529vB abstractC3529vB) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = abstractC3529vB;
    }
}
