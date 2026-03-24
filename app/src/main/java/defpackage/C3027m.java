package defpackage;

/* renamed from: m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3027m {
    public static final C3027m c;
    public static final C3027m d;
    public final boolean a;
    public final Throwable b;

    static {
        if (AbstractC3463u.d) {
            d = null;
            c = null;
        } else {
            d = new C3027m(false, null);
            c = new C3027m(true, null);
        }
    }

    public C3027m(boolean z, Throwable th) {
        this.a = z;
        this.b = th;
    }
}
