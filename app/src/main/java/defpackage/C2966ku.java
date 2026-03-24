package defpackage;

import android.net.Uri;
import android.view.InputEvent;

/* renamed from: ku, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2966ku extends WH implements InterfaceC3396sn {
    public int a;
    public final /* synthetic */ C3076mu b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ InputEvent d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2966ku(C3076mu c3076mu, Uri uri, InputEvent inputEvent, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.b = c3076mu;
        this.c = uri;
        this.d = inputEvent;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        return new C2966ku(this.b, this.c, this.d, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C2966ku) create((InterfaceC0304Rc) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.a;
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            AbstractC3241pu abstractC3241pu = this.b.a;
            this.a = 1;
            if (abstractC3241pu.f(this.c, this.d, this) == enumC0321Sc) {
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
