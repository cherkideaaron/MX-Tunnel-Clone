package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: Jb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167Jb {
    public int b;
    public boolean c;
    public final C2566dc d;
    public final int e;
    public C0167Jb f;
    public C3318rG i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public C0167Jb(C2566dc c2566dc, int i) {
        this.d = c2566dc;
        this.e = i;
    }

    public final void a(C0167Jb c0167Jb, int i) {
        b(c0167Jb, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(C0167Jb c0167Jb, int i, int i2, boolean z) {
        if (c0167Jb == null) {
            j();
            return true;
        }
        if (!z && !i(c0167Jb)) {
            return false;
        }
        this.f = c0167Jb;
        if (c0167Jb.a == null) {
            c0167Jb.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, YM ym, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC0136He.p(((C0167Jb) it.next()).d, i, arrayList, ym);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        C0167Jb c0167Jb;
        if (this.d.f0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (c0167Jb = this.f) == null || c0167Jb.d.f0 != 8) ? this.g : i;
    }

    public final C0167Jb f() {
        int i = this.e;
        int iA = AbstractC3264qG.A(i);
        C2566dc c2566dc = this.d;
        switch (iA) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c2566dc.J;
            case 2:
                return c2566dc.K;
            case 3:
                return c2566dc.H;
            case 4:
                return c2566dc.I;
            default:
                throw new AssertionError(AbstractC3264qG.z(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C0167Jb) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    public final boolean i(C0167Jb c0167Jb) {
        if (c0167Jb == null) {
            return false;
        }
        int i = this.e;
        C2566dc c2566dc = c0167Jb.d;
        int i2 = c0167Jb.e;
        if (i2 == i) {
            return i != 6 || (c2566dc.D && this.d.D);
        }
        switch (AbstractC3264qG.A(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z = i2 == 2 || i2 == 4;
                if (c2566dc instanceof C2905jo) {
                    return z || i2 == 8;
                }
                return z;
            case 2:
            case 4:
                boolean z2 = i2 == 3 || i2 == 5;
                if (c2566dc instanceof C2905jo) {
                    return z2 || i2 == 9;
                }
                return z2;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                throw new AssertionError(AbstractC3264qG.z(i));
        }
    }

    public final void j() {
        HashSet hashSet;
        C0167Jb c0167Jb = this.f;
        if (c0167Jb != null && (hashSet = c0167Jb.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        C3318rG c3318rG = this.i;
        if (c3318rG == null) {
            this.i = new C3318rG(1);
        } else {
            c3318rG.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.g0 + ":" + AbstractC3264qG.z(this.e);
    }
}
