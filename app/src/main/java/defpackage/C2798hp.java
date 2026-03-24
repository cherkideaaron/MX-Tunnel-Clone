package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: hp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2798hp extends HK implements ListIterator {
    public final int a;
    public int b;
    public final AbstractC2906jp c;

    public C2798hp(AbstractC2906jp abstractC2906jp, int i) {
        int size = abstractC2906jp.size();
        AbstractC0115Ga.j(i, size);
        this.a = size;
        this.b = i;
        this.c = abstractC2906jp;
    }

    public final Object a(int i) {
        return this.c.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.b = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
