package defpackage;

import android.util.Log;

/* renamed from: dC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2548dC extends WH implements InterfaceC3396sn {
    public /* synthetic */ Object a;

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C2548dC c2548dC = new C2548dC(2, interfaceC3493uc);
        c2548dC.a = obj;
        return c2548dC;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        C2548dC c2548dC = (C2548dC) create((String) obj, (InterfaceC3493uc) obj2);
        DK dk = DK.a;
        c2548dC.invokeSuspend(dk);
        return dk;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        AbstractC0115Ga.U(obj);
        Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.a));
        return DK.a;
    }
}
