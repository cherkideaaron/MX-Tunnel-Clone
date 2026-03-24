package defpackage;

/* loaded from: classes.dex */
public final class D8 {
    public boolean a;
    public C8 b;
    public boolean c;

    public final void a() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.c = true;
                C8 c8 = this.b;
                if (c8 != null) {
                    try {
                        c8.f();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.c = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.c = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(C8 c8) {
        synchronized (this) {
            while (this.c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.b == c8) {
                return;
            }
            this.b = c8;
            if (this.a) {
                c8.f();
            }
        }
    }
}
