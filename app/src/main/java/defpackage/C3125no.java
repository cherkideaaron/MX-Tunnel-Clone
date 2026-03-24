package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* renamed from: no, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3125no extends AbstractC0219Mc implements InterfaceC3227pg {
    public final Handler c;
    public final String d;
    public final boolean e;
    public final C3125no f;

    public C3125no(Handler handler) {
        this(handler, null, false);
    }

    @Override // defpackage.InterfaceC3227pg
    public final InterfaceC2680fh a(long j, RunnableC0584cJ runnableC0584cJ, InterfaceC0168Jc interfaceC0168Jc) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(runnableC0584cJ, j)) {
            return new C3015lo(0, this, runnableC0584cJ);
        }
        h(interfaceC0168Jc, runnableC0584cJ);
        return C3567vw.a;
    }

    @Override // defpackage.InterfaceC3227pg
    public final void b(long j, B8 b8) {
        RunnableC3680y0 runnableC3680y0 = new RunnableC3680y0(b8, this, 12, false);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(runnableC3680y0, j)) {
            b8.u(new C3070mo(0, this, runnableC3680y0));
        } else {
            h(b8.e, runnableC3680y0);
        }
    }

    @Override // defpackage.AbstractC0219Mc
    public final void e(InterfaceC0168Jc interfaceC0168Jc, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        h(interfaceC0168Jc, runnable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3125no) {
            C3125no c3125no = (C3125no) obj;
            if (c3125no.c == this.c && c3125no.e == this.e) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC0219Mc
    public final boolean f(InterfaceC0168Jc interfaceC0168Jc) {
        return (this.e && AbstractC0500aq.b(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    public final void h(InterfaceC0168Jc interfaceC0168Jc, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC0029Aq interfaceC0029Aq = (InterfaceC0029Aq) interfaceC0168Jc.get(C0108Fk.e);
        if (interfaceC0029Aq != null) {
            interfaceC0029Aq.cancel(cancellationException);
        }
        C0545bg c0545bg = AbstractC0600ch.a;
        ExecutorC0273Pf.c.e(interfaceC0168Jc, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.c) ^ (this.e ? 1231 : 1237);
    }

    @Override // defpackage.AbstractC0219Mc
    public final String toString() {
        C3125no c3125no;
        String str;
        C0545bg c0545bg = AbstractC0600ch.a;
        C3125no c3125no2 = AbstractC3564vt.a;
        if (this == c3125no2) {
            str = "Dispatchers.Main";
        } else {
            try {
                c3125no = c3125no2.f;
            } catch (UnsupportedOperationException unused) {
                c3125no = null;
            }
            str = this == c3125no ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.d;
        if (string == null) {
            string = this.c.toString();
        }
        return this.e ? AbstractC3264qG.g(string, ".immediate") : string;
    }

    public C3125no(Handler handler, String str, boolean z) {
        this.c = handler;
        this.d = str;
        this.e = z;
        this.f = z ? this : new C3125no(handler, str, true);
    }
}
