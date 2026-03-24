package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class S3 implements Collection {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public S3(Z3 z3) {
        this.b = z3;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((Z3) this.b).clear();
                return;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                return AbstractC2540d4.U((Object[]) this.b, obj);
            default:
                return ((Z3) this.b).b(obj) >= 0;
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                AbstractC0500aq.m(collection, "elements");
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        if (!AbstractC2540d4.U((Object[]) this.b, it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                return ((Object[]) this.b).length == 0;
            default:
                return ((Z3) this.b).isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                Object[] objArr = (Object[]) this.b;
                AbstractC0500aq.m(objArr, "array");
                return new C3517v(objArr);
            default:
                return new W3((Z3) this.b, 1);
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                Z3 z3 = (Z3) this.b;
                int iB = z3.b(obj);
                if (iB < 0) {
                    return false;
                }
                z3.h(iB);
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                Z3 z3 = (Z3) this.b;
                int i = z3.c;
                int i2 = 0;
                boolean z = false;
                while (i2 < i) {
                    if (collection.contains(z3.j(i2))) {
                        z3.h(i2);
                        i2--;
                        i--;
                        z = true;
                    }
                    i2++;
                }
                return z;
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                Z3 z3 = (Z3) this.b;
                int i = z3.c;
                int i2 = 0;
                boolean z = false;
                while (i2 < i) {
                    if (!collection.contains(z3.j(i2))) {
                        z3.h(i2);
                        i2--;
                        i--;
                        z = true;
                    }
                    i2++;
                }
                return z;
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                return ((Object[]) this.b).length;
            default:
                return ((Z3) this.b).c;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
            case 0:
                Object[] objArr = (Object[]) this.b;
                AbstractC0500aq.m(objArr, "<this>");
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
                AbstractC0500aq.l(objArrCopyOf, "copyOf(...)");
                return objArrCopyOf;
            default:
                Z3 z3 = (Z3) this.b;
                int i = z3.c;
                Object[] objArr2 = new Object[i];
                for (int i2 = 0; i2 < i; i2++) {
                    objArr2[i2] = z3.j(i2);
                }
                return objArr2;
        }
    }

    public S3(Object[] objArr) {
        AbstractC0500aq.m(objArr, "values");
        this.b = objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 0:
                AbstractC0500aq.m(objArr, "array");
                return AbstractC3296qu.U(this, objArr);
            default:
                Z3 z3 = (Z3) this.b;
                int i = z3.c;
                if (objArr.length < i) {
                    objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
                }
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = z3.j(i2);
                }
                if (objArr.length > i) {
                    objArr[i] = null;
                }
                return objArr;
        }
    }
}
