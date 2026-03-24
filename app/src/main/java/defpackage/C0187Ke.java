package defpackage;

import java.util.List;

/* renamed from: Ke, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187Ke extends WH implements InterfaceC3396sn {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0187Ke(List list, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.c = list;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C0187Ke c0187Ke = new C0187Ke(this.c, interfaceC3493uc);
        c0187Ke.b = obj;
        return c0187Ke;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C0187Ke) create((C0323Se) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            C0323Se c0323Se = (C0323Se) this.b;
            C0360Uh c0360Uh = AbstractC0136He.b;
            this.a = 1;
            if (C0360Uh.o(c0360Uh, this.c, c0323Se, this) == enumC0321Sc) {
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
