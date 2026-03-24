package defpackage;

/* loaded from: classes2.dex */
public final class TO implements WO {
    public static final Object c = new Object();
    public volatile WO a;
    public volatile Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public static TO b(UO uo) {
        if (uo instanceof TO) {
            return (TO) uo;
        }
        TO to = new TO();
        to.b = c;
        to.a = uo;
        return to;
    }

    @Override // defpackage.WO
    public final Object a() {
        Object objA = this.b;
        Object obj = c;
        if (objA == obj) {
            synchronized (this) {
                try {
                    objA = this.b;
                    if (objA == obj) {
                        objA = this.a.a();
                        Object obj2 = this.b;
                        if (obj2 != obj && obj2 != objA) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                        }
                        this.b = objA;
                        this.a = null;
                    }
                } finally {
                }
            }
        }
        return objA;
    }
}
