package defpackage;

/* loaded from: classes.dex */
public final class C {
    public static final C c;
    public static final C d;
    public final boolean a;
    public final Throwable b;

    static {
        if (I.d) {
            d = null;
            c = null;
        } else {
            d = new C(false, null);
            c = new C(true, null);
        }
    }

    public C(boolean z, Throwable th) {
        this.a = z;
        this.b = th;
    }
}
