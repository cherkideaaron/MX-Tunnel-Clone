package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3517v implements Iterator {
    public final /* synthetic */ int a = 0;
    public int b;
    public final Object c;

    public C3517v(AbstractC3679y abstractC3679y) {
        this.c = abstractC3679y;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((AbstractC3679y) this.c).a()) {
                }
                break;
            default:
                if (this.b < ((Object[]) this.c).length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.b;
                this.b = i + 1;
                return ((AbstractC3679y) this.c).get(i);
            default:
                try {
                    Object[] objArr = (Object[]) this.c;
                    int i2 = this.b;
                    this.b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3517v(Object[] objArr) {
        AbstractC0500aq.m(objArr, "array");
        this.c = objArr;
    }
}
