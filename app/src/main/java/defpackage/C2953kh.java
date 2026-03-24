package defpackage;

/* renamed from: kh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2953kh implements InterfaceC0168Jc {
    public final /* synthetic */ InterfaceC0168Jc a;
    public final Throwable b;

    public C2953kh(InterfaceC0168Jc interfaceC0168Jc, Throwable th) {
        this.a = interfaceC0168Jc;
        this.b = th;
    }

    @Override // defpackage.InterfaceC0168Jc
    public final Object fold(Object obj, InterfaceC3396sn interfaceC3396sn) {
        return this.a.fold(obj, interfaceC3396sn);
    }

    @Override // defpackage.InterfaceC0168Jc
    public final InterfaceC0134Hc get(InterfaceC0151Ic interfaceC0151Ic) {
        return this.a.get(interfaceC0151Ic);
    }

    @Override // defpackage.InterfaceC0168Jc
    public final InterfaceC0168Jc minusKey(InterfaceC0151Ic interfaceC0151Ic) {
        return this.a.minusKey(interfaceC0151Ic);
    }

    @Override // defpackage.InterfaceC0168Jc
    public final InterfaceC0168Jc plus(InterfaceC0168Jc interfaceC0168Jc) {
        return this.a.plus(interfaceC0168Jc);
    }
}
