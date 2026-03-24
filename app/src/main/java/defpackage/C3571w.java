package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3571w extends C3517v implements ListIterator {
    public final /* synthetic */ AbstractC3679y d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3571w(AbstractC3679y abstractC3679y, int i) {
        super(abstractC3679y);
        this.d = abstractC3679y;
        int iA = abstractC3679y.a();
        if (i < 0 || i > iA) {
            throw new IndexOutOfBoundsException(AbstractC3264qG.e(i, iA, "index: ", ", size: "));
        }
        this.b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
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
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
