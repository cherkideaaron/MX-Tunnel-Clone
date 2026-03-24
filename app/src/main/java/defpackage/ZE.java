package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ZE extends WH implements InterfaceC3396sn {
    public int a;
    public final /* synthetic */ C2551dF b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZE(C2551dF c2551dF, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = c2551dF;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new ZE(this.b, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((ZE) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            C2551dF c2551dF = this.b;
            InterfaceC3067ml data = c2551dF.b.getData();
            final AtomicReference atomicReference = c2551dF.c;
            InterfaceC3177ol interfaceC3177ol = new InterfaceC3177ol() { // from class: YE
                @Override // defpackage.InterfaceC3177ol
                public final Object d(Object obj2, InterfaceC3493uc interfaceC3493uc) {
                    atomicReference.set((C3694yE) obj2);
                    EnumC0321Sc enumC0321Sc2 = EnumC0321Sc.a;
                    return DK.a;
                }

                public final boolean equals(Object obj2) {
                    if ((obj2 instanceof InterfaceC3177ol) && (obj2 instanceof YE)) {
                        return AbstractC0500aq.b(new C0457a1(atomicReference), new C0457a1(atomicReference));
                    }
                    return false;
                }

                public final int hashCode() {
                    return ((((((((((AtomicReference.class.hashCode() + ((atomicReference != null ? r0.hashCode() : 0) * 31)) * 31) + 113762) * 31) - 869290769) * 31) + 1237) * 31) + 2) * 31) + 2;
                }
            };
            this.a = 1;
            if (data.b(interfaceC3177ol, this) == enumC0321Sc) {
                return enumC0321Sc;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0115Ga.U(obj);
        }
        return DK.a;
    }
}
