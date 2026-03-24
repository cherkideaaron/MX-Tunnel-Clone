package defpackage;

/* loaded from: classes2.dex */
public final class XC extends AbstractC0500aq {
    @Override // defpackage.AbstractC0500aq
    public final void E(C3425tF c3425tF, float f, float f2) {
        float f3 = f2 * f;
        c3425tF.d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        C3208pF c3208pF = new C3208pF(0.0f, 0.0f, f4, f4);
        c3208pF.f = 180.0f;
        c3208pF.g = 90.0f;
        c3425tF.g.add(c3208pF);
        C3098nF c3098nF = new C3098nF(c3208pF);
        c3425tF.a(180.0f);
        c3425tF.h.add(c3098nF);
        c3425tF.e = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        double d = 270.0f;
        c3425tF.c = (((float) Math.cos(Math.toRadians(d))) * f6) + f5;
        c3425tF.d = (f6 * ((float) Math.sin(Math.toRadians(d)))) + f5;
    }
}
