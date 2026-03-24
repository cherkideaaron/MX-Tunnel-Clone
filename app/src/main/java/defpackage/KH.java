package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class KH implements JH, Serializable {
    public final JH a;
    public volatile transient boolean b;
    public transient Object c;

    public KH(JH jh) {
        this.a = jh;
    }

    @Override // defpackage.JH
    public final Object get() {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        Object obj = this.a.get();
                        this.c = obj;
                        this.b = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.b) {
            obj = "<supplier that returned " + this.c + ">";
        } else {
            obj = this.a;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
