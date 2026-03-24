package defpackage;

import android.graphics.Insets;

/* renamed from: Gp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130Gp {
    public static final C0130Gp e = new C0130Gp(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public C0130Gp(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static C0130Gp a(C0130Gp c0130Gp, C0130Gp c0130Gp2) {
        return b(Math.max(c0130Gp.a, c0130Gp2.a), Math.max(c0130Gp.b, c0130Gp2.b), Math.max(c0130Gp.c, c0130Gp2.c), Math.max(c0130Gp.d, c0130Gp2.d));
    }

    public static C0130Gp b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new C0130Gp(i, i2, i3, i4);
    }

    public static C0130Gp c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return N3.b(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0130Gp.class != obj.getClass()) {
            return false;
        }
        C0130Gp c0130Gp = (C0130Gp) obj;
        return this.d == c0130Gp.d && this.a == c0130Gp.a && this.c == c0130Gp.c && this.b == c0130Gp.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
