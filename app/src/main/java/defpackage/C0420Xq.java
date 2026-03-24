package defpackage;

/* renamed from: Xq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0420Xq extends AbstractC0094En implements InterfaceC3396sn {
    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3207pE interfaceC3207pE = (InterfaceC3207pE) obj;
        int iIntValue = ((Number) obj2).intValue();
        AbstractC0500aq.m(interfaceC3207pE, "p0");
        C0437Yq c0437Yq = (C0437Yq) this.receiver;
        c0437Yq.getClass();
        boolean z = !interfaceC3207pE.j(iIntValue) && interfaceC3207pE.i(iIntValue).c();
        c0437Yq.b = z;
        return Boolean.valueOf(z);
    }
}
