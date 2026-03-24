package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class OC implements Iterator {
    public int a;
    public Object b;
    public int c;
    public int d;
    public final /* synthetic */ PC e;

    public OC(PC pc) {
        this.e = pc;
        this.c = pc.a();
        this.d = pc.c;
    }

    public final boolean a() {
        this.a = 3;
        int i = this.c;
        if (i == 0) {
            this.a = 2;
        } else {
            PC pc = this.e;
            Object[] objArr = pc.a;
            int i2 = this.d;
            this.b = objArr[i2];
            this.a = 1;
            this.d = (i2 + 1) % pc.b;
            this.c = i - 1;
        }
        return this.a == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        if (i == 0) {
            return a();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i != 1 && (i == 2 || !a())) {
            throw new NoSuchElementException();
        }
        this.a = 0;
        return this.b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
