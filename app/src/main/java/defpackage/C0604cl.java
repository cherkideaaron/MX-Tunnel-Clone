package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: cl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0604cl extends AbstractC3547vc {
    public Map a;
    public Iterator b;
    public OE c;
    public Tv d;
    public Map e;
    public Object f;
    public /* synthetic */ Object m;
    public final /* synthetic */ C2575dl n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0604cl(C2575dl c2575dl, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.n = c2575dl;
    }

    @Override // defpackage.AbstractC2543d7
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(this);
    }
}
