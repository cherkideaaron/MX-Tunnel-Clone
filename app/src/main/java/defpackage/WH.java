package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class WH extends AbstractC3547vc implements InterfaceC0060Cn {
    private final int arity;

    public WH(int i, InterfaceC3493uc interfaceC3493uc) {
        super(interfaceC3493uc);
        this.arity = i;
    }

    @Override // defpackage.InterfaceC0060Cn
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.AbstractC2543d7
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        PB.a.getClass();
        String strA = QB.a(this);
        AbstractC0500aq.l(strA, "renderLambdaToString(...)");
        return strA;
    }
}
