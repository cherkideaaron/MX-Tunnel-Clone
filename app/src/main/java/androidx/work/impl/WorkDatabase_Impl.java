package androidx.work.impl;

import android.content.Context;
import defpackage.C0087Eg;
import defpackage.C0312Rk;
import defpackage.C2881jI;
import defpackage.C2962kq;
import defpackage.C3178om;
import defpackage.C3308r6;
import defpackage.C3532vE;
import defpackage.C3766zf;
import defpackage.D3;
import defpackage.N2;
import defpackage.R2;
import defpackage.TC;
import defpackage.UH;
import defpackage.WN;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public static final /* synthetic */ int s = 0;
    public volatile C3308r6 l;
    public volatile R2 m;
    public volatile C3178om n;
    public volatile D3 o;
    public volatile C3178om p;
    public volatile C3532vE q;
    public volatile C3178om r;

    @Override // defpackage.TC
    public final C2962kq d() {
        return new C2962kq(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.TC
    public final UH e(C3766zf c3766zf) {
        N2 n2 = new N2(c3766zf, new WN(this));
        Context context = c3766zf.b;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return c3766zf.a.b(new C0312Rk(context, c3766zf.c, n2, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final R2 i() {
        R2 r2;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new R2(this);
                }
                r2 = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return r2;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C3178om j() {
        C3178om c3178om;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    this.r = new C3178om((TC) this, 8);
                }
                c3178om = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3178om;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final D3 k() {
        D3 d3;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new D3(this);
                }
                d3 = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d3;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C3178om l() {
        C3178om c3178om;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    this.p = new C3178om((TC) this, 20);
                }
                c3178om = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3178om;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C3532vE m() {
        C3532vE c3532vE;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    C3532vE c3532vE2 = new C3532vE();
                    c3532vE2.a = this;
                    c3532vE2.b = new C0087Eg(this, 4);
                    c3532vE2.c = new C2881jI(this, 1);
                    c3532vE2.d = new C2881jI(this, 2);
                    this.q = c3532vE2;
                }
                c3532vE = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3532vE;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C3308r6 n() {
        C3308r6 c3308r6;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            try {
                if (this.l == null) {
                    this.l = new C3308r6(this);
                }
                c3308r6 = this.l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3308r6;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C3178om o() {
        C3178om c3178om;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new C3178om((TC) this, 21);
                }
                c3178om = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3178om;
    }
}
