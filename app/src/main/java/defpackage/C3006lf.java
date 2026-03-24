package defpackage;

import java.io.Serializable;

/* renamed from: lf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3006lf extends AbstractC3547vc {
    public Object a;
    public Object b;
    public Serializable c;
    public OB d;
    public boolean e;
    public int f;
    public /* synthetic */ Object m;
    public final /* synthetic */ C3658xf n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3006lf(C3658xf c3658xf, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.n = c3658xf;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return C3658xf.f(this.n, false, this);
    }
}
