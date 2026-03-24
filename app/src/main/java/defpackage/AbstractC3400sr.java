package defpackage;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* renamed from: sr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3400sr implements InterfaceC0060Cn, Serializable {
    private final int arity;

    public AbstractC3400sr(int i) {
        this.arity = i;
    }

    @Override // defpackage.InterfaceC0060Cn
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        PB.a.getClass();
        String strA = QB.a(this);
        AbstractC0500aq.l(strA, "renderLambdaToString(...)");
        return strA;
    }
}
