package defpackage;

import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class Fv extends AbstractC3547vc {
    public FileOutputStream a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0108Fk d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fv(C0108Fk c0108Fk, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.d = c0108Fk;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return C0108Fk.c(this.d, null, this);
    }
}
