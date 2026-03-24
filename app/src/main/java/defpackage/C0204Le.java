package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: Le, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204Le extends AbstractC3547vc {
    public Serializable a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0360Uh d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0204Le(C0360Uh c0360Uh, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.d = c0360Uh;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return C0360Uh.o(this.d, null, null, this);
    }
}
