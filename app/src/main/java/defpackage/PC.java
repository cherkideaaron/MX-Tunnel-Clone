package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class PC extends AbstractC3679y implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public PC(Object[] objArr, int i) {
        this.a = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(Vs.k(i, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i <= objArr.length) {
            this.b = objArr.length;
            this.d = i;
        } else {
            throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
    }

    @Override // defpackage.AbstractC3679y
    public final int a() {
        return this.d;
    }

    public final void b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(Vs.k(i, "n shouldn't be negative but it is ").toString());
        }
        if (i > this.d) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + this.d).toString());
        }
        if (i > 0) {
            int i2 = this.c;
            int i3 = this.b;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.a;
            if (i2 > i4) {
                AbstractC2540d4.Y(objArr, i2, i3);
                i2 = 0;
            }
            AbstractC2540d4.Y(objArr, i2, i4);
            this.c = i4;
            this.d -= i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int iA = a();
        if (i < 0 || i >= iA) {
            throw new IndexOutOfBoundsException(AbstractC3264qG.e(i, iA, "index: ", ", size: "));
        }
        return this.a[(this.c + i) % this.b];
    }

    @Override // defpackage.AbstractC3679y, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new OC(this);
    }

    @Override // defpackage.AbstractC3679y, java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // defpackage.AbstractC3679y, java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        AbstractC0500aq.m(objArr, "array");
        int length = objArr.length;
        int i = this.d;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
            AbstractC0500aq.l(objArr, "copyOf(...)");
        }
        int i2 = this.d;
        int i3 = this.c;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.a;
            if (i5 >= i2 || i3 >= this.b) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
