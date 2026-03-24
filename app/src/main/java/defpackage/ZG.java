package defpackage;

import android.util.StateSet;

/* loaded from: classes2.dex */
public final class ZG {
    public int a;
    public C2878jF b;
    public int[][] c;
    public C2878jF[] d;
    public YG e;
    public YG f;
    public YG g;
    public YG h;

    public ZG(C2878jF c2878jF) {
        c();
        a(StateSet.WILD_CARD, c2878jF);
    }

    public final void a(int[] iArr, C2878jF c2878jF) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = c2878jF;
        }
        int[][] iArr2 = this.c;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.c = iArr3;
            C2878jF[] c2878jFArr = new C2878jF[i2];
            System.arraycopy(this.d, 0, c2878jFArr, 0, i);
            this.d = c2878jFArr;
        }
        int[][] iArr4 = this.c;
        int i3 = this.a;
        iArr4[i3] = iArr;
        this.d[i3] = c2878jF;
        this.a = i3 + 1;
    }

    public final C0473aH b() {
        if (this.a == 0) {
            return null;
        }
        return new C0473aH(this);
    }

    public final void c() {
        this.b = new C2878jF();
        this.c = new int[10][];
        this.d = new C2878jF[10];
    }
}
