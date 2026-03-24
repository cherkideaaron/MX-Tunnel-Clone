package defpackage;

import java.util.Arrays;

/* renamed from: vG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3534vG implements Cloneable {
    public /* synthetic */ int[] a;
    public /* synthetic */ Object[] b;
    public /* synthetic */ int c;

    public C3534vG() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.a = new int[i4];
        this.b = new Object[i4];
    }

    public final void a(int i, Object obj) {
        int i2 = this.c;
        if (i2 != 0 && i <= this.a[i2 - 1]) {
            d(i, obj);
            return;
        }
        if (i2 >= this.a.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.a, i6);
            AbstractC0500aq.l(iArrCopyOf, "copyOf(this, newSize)");
            this.a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.b, i6);
            AbstractC0500aq.l(objArrCopyOf, "copyOf(this, newSize)");
            this.b = objArrCopyOf;
        }
        this.a[i2] = i;
        this.b[i2] = obj;
        this.c = i2 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C3534vG clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        AbstractC0500aq.k(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C3534vG c3534vG = (C3534vG) objClone;
        c3534vG.a = (int[]) this.a.clone();
        c3534vG.b = (Object[]) this.b.clone();
        return c3534vG;
    }

    public final Object c(int i) {
        Object obj;
        int iD = AbstractC0115Ga.d(this.a, this.c, i);
        if (iD < 0 || (obj = this.b[iD]) == MO.j) {
            return null;
        }
        return obj;
    }

    public final void d(int i, Object obj) {
        int iD = AbstractC0115Ga.d(this.a, this.c, i);
        if (iD >= 0) {
            this.b[iD] = obj;
            return;
        }
        int i2 = ~iD;
        int i3 = this.c;
        if (i2 < i3) {
            Object[] objArr = this.b;
            if (objArr[i2] == MO.j) {
                this.a[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.a.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.a, i7);
            AbstractC0500aq.l(iArrCopyOf, "copyOf(this, newSize)");
            this.a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.b, i7);
            AbstractC0500aq.l(objArrCopyOf, "copyOf(this, newSize)");
            this.b = objArrCopyOf;
        }
        int i8 = this.c;
        if (i8 - i2 != 0) {
            int[] iArr = this.a;
            int i9 = i2 + 1;
            AbstractC2540d4.V(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.b;
            AbstractC2540d4.W(objArr2, i9, objArr2, i2, this.c);
        }
        this.a[i2] = i;
        this.b[i2] = obj;
        this.c++;
    }

    public final String toString() {
        int i = this.c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.a[i3]);
            sb.append('=');
            Object obj = this.b[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC0500aq.l(string, "buffer.toString()");
        return string;
    }
}
