package defpackage;

import java.util.Iterator;

/* renamed from: cG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0581cG extends GC implements InterfaceC3396sn {
    public Object b;
    public Iterator c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Iterator o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0581cG(int i, int i2, Iterator it, boolean z, boolean z2, InterfaceC3493uc interfaceC3493uc) {
        super(2, interfaceC3493uc);
        this.m = i;
        this.n = i2;
        this.o = it;
        this.p = z;
        this.q = z2;
    }

    @Override // defpackage.AbstractC2543d7
    public final InterfaceC3493uc create(Object obj, InterfaceC3493uc interfaceC3493uc) {
        C0581cG c0581cG = new C0581cG(this.m, this.n, this.o, this.p, this.q, interfaceC3493uc);
        c0581cG.f = obj;
        return c0581cG;
    }

    @Override // defpackage.InterfaceC3396sn
    public final Object invoke(Object obj, Object obj2) {
        return ((C0581cG) create((C2932kE) obj, (InterfaceC3493uc) obj2)).invokeSuspend(DK.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0164  */
    @Override // defpackage.AbstractC2543d7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0581cG.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
