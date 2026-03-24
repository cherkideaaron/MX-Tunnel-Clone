package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class NH implements JH, Serializable {
    public final Object a;

    public NH(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof NH) {
            return AbstractC0115Ga.s(this.a, ((NH) obj).a);
        }
        return false;
    }

    @Override // defpackage.JH
    public final Object get() {
        return this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.a + ")";
    }
}
