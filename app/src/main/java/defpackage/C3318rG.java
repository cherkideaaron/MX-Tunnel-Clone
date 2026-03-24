package defpackage;

import java.util.Arrays;

/* renamed from: rG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3318rG implements Comparable {
    public boolean a;
    public float e;
    public int r;
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public boolean f = false;
    public final float[] m = new float[9];
    public final float[] n = new float[9];
    public C0515b4[] o = new C0515b4[16];
    public int p = 0;
    public int q = 0;

    public C3318rG(int i) {
        this.r = i;
    }

    public final void a(C0515b4 c0515b4) {
        int i = 0;
        while (true) {
            int i2 = this.p;
            if (i >= i2) {
                C0515b4[] c0515b4Arr = this.o;
                if (i2 >= c0515b4Arr.length) {
                    this.o = (C0515b4[]) Arrays.copyOf(c0515b4Arr, c0515b4Arr.length * 2);
                }
                C0515b4[] c0515b4Arr2 = this.o;
                int i3 = this.p;
                c0515b4Arr2[i3] = c0515b4;
                this.p = i3 + 1;
                return;
            }
            if (this.o[i] == c0515b4) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(C0515b4 c0515b4) {
        int i = this.p;
        int i2 = 0;
        while (i2 < i) {
            if (this.o[i2] == c0515b4) {
                while (i2 < i - 1) {
                    C0515b4[] c0515b4Arr = this.o;
                    int i3 = i2 + 1;
                    c0515b4Arr[i2] = c0515b4Arr[i3];
                    i2 = i3;
                }
                this.p--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.r = 5;
        this.d = 0;
        this.b = -1;
        this.c = -1;
        this.e = 0.0f;
        this.f = false;
        int i = this.p;
        for (int i2 = 0; i2 < i; i2++) {
            this.o[i2] = null;
        }
        this.p = 0;
        this.q = 0;
        this.a = false;
        Arrays.fill(this.n, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b - ((C3318rG) obj).b;
    }

    public final void d(C2855is c2855is, float f) {
        this.e = f;
        this.f = true;
        int i = this.p;
        this.c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.o[i2].h(c2855is, this, false);
        }
        this.p = 0;
    }

    public final void e(C2855is c2855is, C0515b4 c0515b4) {
        int i = this.p;
        for (int i2 = 0; i2 < i; i2++) {
            this.o[i2].i(c2855is, c0515b4, false);
        }
        this.p = 0;
    }

    public final String toString() {
        return "" + this.b;
    }
}
