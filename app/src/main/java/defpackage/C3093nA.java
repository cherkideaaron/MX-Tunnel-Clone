package defpackage;

/* renamed from: nA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3093nA implements InterfaceC3104nL {
    public boolean a = false;
    public boolean b = false;
    public C0430Yj c;
    public final C3038mA d;

    public C3093nA(C3038mA c3038mA) {
        this.d = c3038mA;
    }

    @Override // defpackage.InterfaceC3104nL
    public final InterfaceC3104nL b(String str) {
        if (this.a) {
            throw new C0191Ki("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.h(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.InterfaceC3104nL
    public final InterfaceC3104nL c(boolean z) {
        if (this.a) {
            throw new C0191Ki("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.c(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
