package defpackage;

/* loaded from: classes2.dex */
public abstract class GC extends FC implements InterfaceC0060Cn {
    public final int a;

    public GC(int i, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.a = i;
    }

    @Override // defpackage.InterfaceC0060Cn
    public final int getArity() {
        return this.a;
    }

    @Override // defpackage.AbstractC2543d7
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        PB.a.getClass();
        String strA = QB.a(this);
        AbstractC0500aq.l(strA, "renderLambdaToString(...)");
        return strA;
    }
}
