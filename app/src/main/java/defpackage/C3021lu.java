package defpackage;

import android.net.Uri;

/* renamed from: lu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3021lu extends WH implements InterfaceC3396sn {
    public int a;
    public final /* synthetic */ C3076mu b;
    public final /* synthetic */ Uri c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3021lu(C3076mu c3076mu, Uri uri, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = c3076mu;
        this.c = uri;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new C3021lu(this.b, this.c, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C3021lu) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            AbstractC3241pu abstractC3241pu = this.b.a;
            this.a = 1;
            if (abstractC3241pu.i(this.c, this) == enumC0321Sc) {
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
