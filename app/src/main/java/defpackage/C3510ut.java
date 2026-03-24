package defpackage;

/* renamed from: ut, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3510ut extends Rw {
    public static final Sw d;
    public float b = 0.0f;
    public float c = 0.0f;

    static {
        Sw swA = Sw.a(32, new C3510ut());
        d = swA;
        swA.f = 0.5f;
    }

    public static C3510ut b(float f, float f2) {
        C3510ut c3510ut = (C3510ut) d.b();
        c3510ut.b = f;
        c3510ut.c = f2;
        return c3510ut;
    }

    @Override // defpackage.Rw
    public final Rw a() {
        return new C3510ut();
    }
}
