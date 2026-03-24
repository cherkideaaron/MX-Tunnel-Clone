package defpackage;

import android.util.Log;

/* loaded from: classes2.dex */
public final class HF extends WH implements InterfaceC3504un {
    public int a;
    public /* synthetic */ InterfaceC3177ol b;
    public /* synthetic */ Throwable c;
    public final /* synthetic */ PF d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HF(PF pf, InterfaceC3493uc interfaceC3493uc) {
        super(3, interfaceC3493uc);
        this.d = pf;
    }

    @Override // defpackage.InterfaceC3504un
    public final Object b(Object obj, Object obj2, Object obj3) {
        HF hf = new HF(this.d, (InterfaceC3493uc) obj3);
        hf.b = (InterfaceC3177ol) obj;
        hf.c = (Throwable) obj2;
        return hf.invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            InterfaceC3177ol interfaceC3177ol = this.b;
            Throwable th = this.c;
            FE feA = this.d.b.a(null);
            BE be = new BE(feA, null, null);
            Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th.getMessage() + ". Emit fallback session " + feA.a);
            this.b = null;
            this.a = 1;
            if (interfaceC3177ol.d(be, this) == enumC0321Sc) {
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
