package defpackage;

/* renamed from: tt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3456tt extends Rw {
    public static final Sw d;
    public double b = 0.0d;
    public double c = 0.0d;

    static {
        Sw swA = Sw.a(64, new C3456tt());
        d = swA;
        swA.f = 0.5f;
    }

    @Override // defpackage.Rw
    public final Rw a() {
        return new C3456tt();
    }

    public final String toString() {
        return "MPPointD, x: " + this.b + ", y: " + this.c;
    }
}
