package defpackage;

/* loaded from: classes2.dex */
public abstract class FC extends AbstractC2543d7 {
    public FC(InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        if (interfaceC3493uc != null && interfaceC3493uc.getContext() != C0021Ai.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // defpackage.InterfaceC3493uc
    public final InterfaceC0168Jc getContext() {
        return C0021Ai.a;
    }
}
