package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class Y7 implements Iterator {
    public int a = 0;
    public final int b;
    public final /* synthetic */ C0519b8 c;

    public Y7(C0519b8 c0519b8) {
        this.c = c0519b8;
        this.b = c0519b8.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i >= this.b) {
            throw new NoSuchElementException();
        }
        this.a = i + 1;
        return Byte.valueOf(this.c.f(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
