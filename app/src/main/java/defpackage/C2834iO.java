package defpackage;

/* renamed from: iO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2834iO {
    public String a;
    public int b = 1;
    public String c;
    public String d;
    public C0051Ce e;
    public C0051Ce f;
    public long g;
    public long h;
    public long i;
    public C2675fc j;
    public int k;
    public int l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public int r;

    static {
        C3130nt.f("WorkSpec");
    }

    public C2834iO(String str, String str2) {
        C0051Ce c0051Ce = C0051Ce.c;
        this.e = c0051Ce;
        this.f = c0051Ce;
        this.j = C2675fc.i;
        this.l = 1;
        this.m = 30000L;
        this.p = -1L;
        this.r = 1;
        this.a = str;
        this.c = str2;
    }

    public final long a() {
        int i;
        if (this.b == 1 && (i = this.k) > 0) {
            return Math.min(18000000L, this.l == 2 ? this.m * i : (long) Math.scalb(this.m, i - 1)) + this.n;
        }
        if (!c()) {
            long jCurrentTimeMillis = this.n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j = this.n;
        if (j == 0) {
            j = this.g + jCurrentTimeMillis2;
        }
        long j2 = this.i;
        long j3 = this.h;
        if (j2 != j3) {
            return j + j3 + (j == 0 ? j2 * (-1) : 0L);
        }
        return j + (j != 0 ? j3 : 0L);
    }

    public final boolean b() {
        return !C2675fc.i.equals(this.j);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2834iO.class != obj.getClass()) {
            return false;
        }
        C2834iO c2834iO = (C2834iO) obj;
        if (this.g != c2834iO.g || this.h != c2834iO.h || this.i != c2834iO.i || this.k != c2834iO.k || this.m != c2834iO.m || this.n != c2834iO.n || this.o != c2834iO.o || this.p != c2834iO.p || this.q != c2834iO.q || !this.a.equals(c2834iO.a) || this.b != c2834iO.b || !this.c.equals(c2834iO.c)) {
            return false;
        }
        String str = this.d;
        if (str == null ? c2834iO.d == null : str.equals(c2834iO.d)) {
            return this.e.equals(c2834iO.e) && this.f.equals(c2834iO.f) && this.j.equals(c2834iO.j) && this.l == c2834iO.l && this.r == c2834iO.r;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((AbstractC3264qG.A(this.b) + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int iHashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j = this.g;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.h;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.i;
        int iA = (AbstractC3264qG.A(this.l) + ((((this.j.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.k) * 31)) * 31;
        long j4 = this.m;
        int i3 = (iA + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.n;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.o;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.p;
        return AbstractC3264qG.A(this.r) + ((((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return AbstractC3264qG.l(new StringBuilder("{WorkSpec: "), this.a, "}");
    }
}
