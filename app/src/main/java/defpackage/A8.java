package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class A8 implements InterfaceC3504un {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ A8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC3504un
    public final Object b(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                ((InterfaceC2631en) this.b).invoke(th);
                break;
            default:
                ((C2604eE) this.b).b();
                break;
        }
        return DK.a;
    }
}
