package defpackage;

/* renamed from: bf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544bf extends WH implements InterfaceC3396sn {
    public C0068De a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C3658xf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0544bf(C3658xf c3658xf, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.d = c3658xf;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C0544bf c0544bf = new C0544bf(this.d, interfaceC3493uc);
        c0544bf.c = obj;
        return c0544bf;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C0544bf) create((InterfaceC3177ol) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    @Override // defpackage.AbstractC2543d7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0544bf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
