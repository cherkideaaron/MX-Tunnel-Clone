package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: rf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3334rf extends WH implements InterfaceC3396sn {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3658xf c;
    public final /* synthetic */ InterfaceC3396sn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3334rf(C3658xf c3658xf, InterfaceC3396sn interfaceC3396sn, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.c = c3658xf;
        this.d = interfaceC3396sn;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C3334rf c3334rf = new C3334rf(this.c, this.d, interfaceC3493uc);
        c3334rf.b = obj;
        return c3334rf;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C3334rf) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            InterfaceC0304Rc interfaceC0304Rc = (InterfaceC0304Rc) this.b;
            C0166Ja c0166JaA = AbstractC3279qd.a();
            C3658xf c3658xf = this.c;
            Uu uu = new Uu(this.d, c0166JaA, c3658xf.h.v(), interfaceC0304Rc.g());
            KJ kj = c3658xf.l;
            Object objH = ((R7) kj.c).h(uu);
            if (objH instanceof C2599e9) {
                C2599e9 c2599e9 = objH instanceof C2599e9 ? (C2599e9) objH : null;
                Throwable th = c2599e9 != null ? c2599e9.a : null;
                if (th == null) {
                    throw new C2946ka("Channel was closed normally");
                }
                throw th;
            }
            if (!(!(objH instanceof C2654f9))) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (((AtomicInteger) ((C0607co) kj.d).a).getAndIncrement() == 0) {
                AbstractC0136He.y((InterfaceC0304Rc) kj.a, new VF(kj, null));
            }
            this.a = 1;
            obj = c0166JaA.l(this);
            if (obj == enumC0321Sc) {
                return enumC0321Sc;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0115Ga.U(obj);
        }
        return obj;
    }
}
