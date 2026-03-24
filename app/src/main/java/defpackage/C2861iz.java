package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: iz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2861iz extends WH implements InterfaceC3396sn {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ InterfaceC3396sn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2861iz(InterfaceC3396sn interfaceC3396sn, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.c = interfaceC3396sn;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C2861iz c2861iz = new C2861iz(this.c, interfaceC3493uc);
        c2861iz.b = obj;
        return c2861iz;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C2861iz) create((Rv) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            Rv rv = (Rv) this.b;
            this.a = 1;
            obj = this.c.invoke(rv, this);
            if (obj == enumC0321Sc) {
                return enumC0321Sc;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0115Ga.U(obj);
        }
        Rv rv2 = (Rv) obj;
        AbstractC0500aq.k(rv2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) rv2.b.b).set(true);
        return rv2;
    }
}
