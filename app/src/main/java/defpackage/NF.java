package defpackage;

import android.util.Log;

/* loaded from: classes2.dex */
public final class NF extends WH implements InterfaceC3396sn {
    public int a;
    public final /* synthetic */ PF b;
    public final /* synthetic */ BE c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NF(PF pf, BE be, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = pf;
        this.c = be;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new NF(this.b, this.c, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((NF) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        PF pf = this.b;
        try {
        } catch (Exception e) {
            Log.d("FirebaseSessions", "App foregrounded, failed to update data. Message: " + e.getMessage());
            BE be = this.c;
            if (pf.e(be)) {
                FE feA = pf.b.a(be.a);
                pf.h = BE.a(be, feA, null, null, 4);
                LE le = (LE) pf.c;
                AbstractC0136He.y(AbstractC0136He.a(le.e), new JE(le, feA, null));
                JF jf = JF.b;
                this.a = 2;
                if (PF.a(pf, feA.a, jf, this) == enumC0321Sc) {
                    return enumC0321Sc;
                }
            }
        }
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            InterfaceC0272Pe interfaceC0272Pe = pf.e;
            MF mf = new MF(pf, null);
            this.a = 1;
            if (interfaceC0272Pe.a(mf, this) == enumC0321Sc) {
                return enumC0321Sc;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0115Ga.U(obj);
                return DK.a;
            }
            AbstractC0115Ga.U(obj);
        }
        return DK.a;
    }
}
