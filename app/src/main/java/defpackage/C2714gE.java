package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: gE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2714gE extends ZD {
    public final /* synthetic */ AtomicReferenceArray e;

    public C2714gE(long j, C2714gE c2714gE, int i) {
        super(j, c2714gE, i);
        this.e = new AtomicReferenceArray(AbstractC2659fE.f);
    }

    @Override // defpackage.ZD
    public final int g() {
        return AbstractC2659fE.f;
    }

    @Override // defpackage.ZD
    public final void h(int i, InterfaceC0168Jc interfaceC0168Jc) {
        this.e.set(i, AbstractC2659fE.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
