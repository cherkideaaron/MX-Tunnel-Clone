package defpackage;

import android.util.Log;

/* loaded from: classes2.dex */
public final class LF extends WH implements InterfaceC3396sn {
    public int a;
    public final /* synthetic */ PF b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LF(PF pf, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = pf;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new LF(this.b, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((LF) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        PF pf = this.b;
        try {
            if (i == 0) {
                AbstractC0115Ga.U(obj);
                InterfaceC0272Pe interfaceC0272Pe = pf.e;
                KF kf = new KF(pf, null);
                this.a = 1;
                if (interfaceC0272Pe.a(kf, this) == enumC0321Sc) {
                    return enumC0321Sc;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0115Ga.U(obj);
            }
        } catch (Exception e) {
            Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e.getMessage());
            BE be = pf.h;
            if (be == null) {
                AbstractC0500aq.d0("localSessionData");
                throw null;
            }
            pf.h = BE.a(be, null, pf.d.a(), null, 5);
        }
        return DK.a;
    }
}
