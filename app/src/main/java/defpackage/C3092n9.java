package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: n9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3092n9 implements Iterator {
    public final int a;
    public final int b;
    public boolean c;
    public int d;

    public C3092n9(char c, char c2, int i) {
        this.a = i;
        this.b = c2;
        boolean z = false;
        if (i <= 0 ? AbstractC0500aq.o(c, c2) >= 0 : AbstractC0500aq.o(c, c2) <= 0) {
            z = true;
        }
        this.c = z;
        this.d = z ? c : c2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i != this.b) {
            this.d = this.a + i;
        } else {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
        }
        return Character.valueOf((char) i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
