package defpackage;

import java.io.Serializable;

/* renamed from: nf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3116nf extends WH implements InterfaceC2631en {
    public Serializable a;
    public int b;
    public final /* synthetic */ OB c;
    public final /* synthetic */ C3658xf d;
    public final /* synthetic */ NB e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3116nf(OB ob, C3658xf c3658xf, NB nb, InterfaceC3493uc interfaceC3493uc) {
        super(1, interfaceC3493uc);
        this.c = ob;
        this.d = c3658xf;
        this.e = nb;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(InterfaceC3493uc interfaceC3493uc) {
        return new C3116nf(this.c, this.d, this.e, interfaceC3493uc);
    }

    @Override // defpackage.InterfaceC2631en
    public final Object invoke(Object obj) {
        return ((C3116nf) create((InterfaceC3493uc) obj)).invokeSuspend(DK.a);
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        OB ob;
        NB nb;
        EnumC0321Sc enumC0321Sc = EnumC0321Sc.a;
        int i = this.b;
        NB nb2 = this.e;
        OB ob2 = this.c;
        C3658xf c3658xf = this.d;
        try {
        } catch (C0389Wc unused) {
            Object obj2 = ob2.a;
            this.a = nb2;
            this.b = 3;
            obj = c3658xf.j(obj2, true, this);
            if (obj == enumC0321Sc) {
                return enumC0321Sc;
            }
        }
        if (i == 0) {
            AbstractC0115Ga.U(obj);
            this.a = ob2;
            this.b = 1;
            obj = c3658xf.i(this);
            if (obj == enumC0321Sc) {
                return enumC0321Sc;
            }
            ob = ob2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    nb = (NB) this.a;
                    AbstractC0115Ga.U(obj);
                    nb.a = ((Number) obj).intValue();
                    return DK.a;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nb2 = (NB) this.a;
                AbstractC0115Ga.U(obj);
                nb2.a = ((Number) obj).intValue();
                return DK.a;
            }
            ob = (OB) this.a;
            AbstractC0115Ga.U(obj);
        }
        ob.a = obj;
        InterfaceC0334Sp interfaceC0334SpG = c3658xf.g();
        this.a = nb2;
        this.b = 2;
        obj = interfaceC0334SpG.b(this);
        if (obj == enumC0321Sc) {
            return enumC0321Sc;
        }
        nb = nb2;
        nb.a = ((Number) obj).intValue();
        return DK.a;
    }
}
