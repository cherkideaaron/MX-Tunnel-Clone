package defpackage;

import java.io.IOException;

/* renamed from: Ye, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0425Ye extends WH implements InterfaceC3504un {
    public final /* synthetic */ int a = 1;
    public int b;
    public /* synthetic */ Object c;

    public /* synthetic */ C0425Ye(int i, InterfaceC3493uc interfaceC3493uc) {
        super(i, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC3504un
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                return new C0425Ye((C3658xf) this.c, (InterfaceC3493uc) obj3).invokeSuspend(DK.a);
            default:
                ((Boolean) obj2).getClass();
                C0425Ye c0425Ye = new C0425Ye(3, (InterfaceC3493uc) obj3);
                c0425Ye.c = (C2683fk) obj;
                return c0425Ye.invokeSuspend(DK.a);
        }
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) throws IOException {
        switch (this.a) {
            case 0:
                EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
                int i = this.b;
                if (i == 0) {
                    AbstractC0115Ga.U(obj);
                    this.b = 1;
                    if (C3658xf.b((C3658xf) this.c, this) == enumC0321Sc) {
                        return enumC0321Sc;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0115Ga.U(obj);
                }
                return DK.a;
            default:
                EnumC0321Sc enumC0321Sc2 = EnumC0321Sc.a;
                int i2 = this.b;
                if (i2 == 0) {
                    AbstractC0115Ga.U(obj);
                    C2683fk c2683fk = (C2683fk) this.c;
                    this.b = 1;
                    c2683fk.getClass();
                    obj = C2683fk.a(c2683fk, this);
                    if (obj == enumC0321Sc2) {
                        return enumC0321Sc2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0115Ga.U(obj);
                }
                return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0425Ye(C3658xf c3658xf, InterfaceC3493uc interfaceC3493uc) {
        super(3, interfaceC3493uc);
        this.c = c3658xf;
    }
}
