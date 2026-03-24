package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class Mz implements Or {
    public static final Mz o = new Mz();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final Qr f = new Qr(this);
    public final H0 m = new H0(this, 11);
    public final C2524cp n = new C2524cp(this, 21);

    public final void a() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            if (this.c) {
                this.f.e(Hr.ON_RESUME);
                this.c = false;
            } else {
                Handler handler = this.e;
                AbstractC0500aq.j(handler);
                handler.removeCallbacks(this.m);
            }
        }
    }

    @Override // defpackage.Or
    public final Jr getLifecycle() {
        return this.f;
    }
}
