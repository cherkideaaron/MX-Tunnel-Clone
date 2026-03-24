package defpackage;

/* renamed from: Ln, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0213Ln implements Cloneable {
    public final AbstractC0247Nn a;
    public AbstractC0247Nn b;

    public AbstractC0213Ln(AbstractC0247Nn abstractC0247Nn) {
        this.a = abstractC0247Nn;
        if (abstractC0247Nn.j()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = abstractC0247Nn.l();
    }

    public static void d(AbstractC0247Nn abstractC0247Nn, AbstractC3733z abstractC3733z) {
        C2928kA c2928kA = C2928kA.c;
        c2928kA.getClass();
        c2928kA.a(abstractC0247Nn.getClass()).a(abstractC0247Nn, abstractC3733z);
    }

    public final AbstractC0247Nn a() {
        AbstractC0247Nn abstractC0247NnB = b();
        abstractC0247NnB.getClass();
        if (AbstractC0247Nn.i(abstractC0247NnB, true)) {
            return abstractC0247NnB;
        }
        throw new CK();
    }

    public final AbstractC0247Nn b() {
        if (!this.b.j()) {
            return this.b;
        }
        AbstractC0247Nn abstractC0247Nn = this.b;
        abstractC0247Nn.getClass();
        C2928kA c2928kA = C2928kA.c;
        c2928kA.getClass();
        c2928kA.a(abstractC0247Nn.getClass()).c(abstractC0247Nn);
        abstractC0247Nn.k();
        return this.b;
    }

    public final void c() {
        if (this.b.j()) {
            return;
        }
        AbstractC0247Nn abstractC0247NnL = this.a.l();
        d(abstractC0247NnL, this.b);
        this.b = abstractC0247NnL;
    }

    public final Object clone() {
        AbstractC0213Ln abstractC0213Ln = (AbstractC0213Ln) this.a.f(5);
        abstractC0213Ln.b = b();
        return abstractC0213Ln;
    }
}
