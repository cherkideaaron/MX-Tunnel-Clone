package defpackage;

/* renamed from: yD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3693yD implements Mr, AutoCloseable {
    public final String a;
    public final C3639xD b;
    public boolean c;

    public C3693yD(String str, C3639xD c3639xD) {
        this.a = str;
        this.b = c3639xD;
    }

    @Override // defpackage.Mr
    public final void c(Or or, Hr hr) {
        if (hr == Hr.ON_DESTROY) {
            this.c = false;
            or.getLifecycle().b(this);
        }
    }

    public final void i(Jr jr, DD dd) {
        AbstractC0500aq.m(dd, "registry");
        AbstractC0500aq.m(jr, "lifecycle");
        if (!(!this.c)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.c = true;
        jr.a(this);
        dd.c(this.a, (C0353Ua) this.b.a.e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
