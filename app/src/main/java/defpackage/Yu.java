package defpackage;

/* loaded from: classes.dex */
public final class Yu implements PD {
    public final AbstractC3733z a;
    public final FK b;
    public final C3554vj c;

    public Yu(FK fk, C3554vj c3554vj, AbstractC3733z abstractC3733z) {
        this.b = fk;
        c3554vj.getClass();
        this.c = c3554vj;
        this.a = abstractC3733z;
    }

    @Override // defpackage.PD
    public final void a(Object obj, Object obj2) {
        SD.A(this.b, obj, obj2);
    }

    @Override // defpackage.PD
    public final void b(Object obj, C2524cp c2524cp) {
        this.c.getClass();
        Vs.u(obj);
        throw null;
    }

    @Override // defpackage.PD
    public final void c(Object obj) {
        this.b.getClass();
        FK.b(obj);
        this.c.getClass();
        Vs.u(obj);
        throw null;
    }

    @Override // defpackage.PD
    public final boolean d(Object obj) {
        this.c.getClass();
        Vs.u(obj);
        throw null;
    }

    @Override // defpackage.PD
    public final void e(Object obj, C0463a7 c0463a7, C3500uj c3500uj) {
        this.b.getClass();
        FK.a(obj);
        this.c.getClass();
        Vs.u(obj);
        throw null;
    }

    @Override // defpackage.PD
    public final boolean f(Object obj, Object obj2) {
        FK fk = this.b;
        fk.getClass();
        EK ek = ((AbstractC0247Nn) obj).unknownFields;
        fk.getClass();
        return ek.equals(((AbstractC0247Nn) obj2).unknownFields);
    }

    @Override // defpackage.PD
    public final int g(Object obj) {
        this.b.getClass();
        EK ek = ((AbstractC0247Nn) obj).unknownFields;
        int i = ek.d;
        if (i != -1) {
            return i;
        }
        int iH0 = 0;
        for (int i2 = 0; i2 < ek.a; i2++) {
            int i3 = ek.b[i2] >>> 3;
            iH0 += C3221pa.h0(3, (C0519b8) ek.c[i2]) + C3221pa.x0(2, i3) + (C3221pa.w0(1) * 2);
        }
        ek.d = iH0;
        return iH0;
    }

    @Override // defpackage.PD
    public final AbstractC0247Nn h() {
        AbstractC3733z abstractC3733z = this.a;
        return abstractC3733z instanceof AbstractC0247Nn ? ((AbstractC0247Nn) abstractC3733z).l() : ((AbstractC0213Ln) ((AbstractC0247Nn) abstractC3733z).f(5)).b();
    }

    @Override // defpackage.PD
    public final int i(Object obj) {
        this.b.getClass();
        return ((AbstractC0247Nn) obj).unknownFields.hashCode();
    }
}
