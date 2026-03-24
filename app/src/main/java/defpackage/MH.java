package defpackage;

/* loaded from: classes2.dex */
public final class MH implements JH {
    public static final LH c = new LH(0);
    public volatile JH a;
    public Object b;

    @Override // defpackage.JH
    public final Object get() {
        JH jh = this.a;
        LH lh = c;
        if (jh != lh) {
            synchronized (this) {
                try {
                    if (this.a != lh) {
                        Object obj = this.a.get();
                        this.b = obj;
                        this.a = lh;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public final String toString() {
        Object obj = this.a;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == c) {
            obj = "<supplier that returned " + this.b + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
