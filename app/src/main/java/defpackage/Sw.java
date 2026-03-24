package defpackage;

/* loaded from: classes.dex */
public final class Sw {
    public static int g;
    public int a;
    public int b;
    public Object[] c;
    public int d;
    public Rw e;
    public float f;

    public static synchronized Sw a(int i, Rw rw) {
        Sw sw;
        sw = new Sw();
        if (i <= 0) {
            throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
        }
        sw.b = i;
        sw.c = new Object[i];
        sw.d = 0;
        sw.e = rw;
        sw.f = 1.0f;
        sw.d();
        int i2 = g;
        sw.a = i2;
        g = i2 + 1;
        return sw;
    }

    public final synchronized Rw b() {
        Rw rw;
        try {
            if (this.d == -1 && this.f > 0.0f) {
                d();
            }
            Object[] objArr = this.c;
            int i = this.d;
            rw = (Rw) objArr[i];
            rw.a = -1;
            this.d = i - 1;
        } catch (Throwable th) {
            throw th;
        }
        return rw;
    }

    public final synchronized void c(Rw rw) {
        try {
            int i = rw.a;
            if (i != -1) {
                if (i == this.a) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + rw.a + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.c.length) {
                int i3 = this.b;
                int i4 = i3 * 2;
                this.b = i4;
                Object[] objArr = new Object[i4];
                for (int i5 = 0; i5 < i3; i5++) {
                    objArr[i5] = this.c[i5];
                }
                this.c = objArr;
            }
            rw.a = this.a;
            this.c[this.d] = rw;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        float f = this.f;
        int i = this.b;
        int i2 = (int) (i * f);
        if (i2 < 1) {
            i = 1;
        } else if (i2 <= i) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.c[i3] = this.e.a();
        }
        this.d = i - 1;
    }
}
