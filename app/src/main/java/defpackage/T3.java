package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class T3 extends AbstractList implements List {
    public static final Object[] d = new Object[0];
    public int a;
    public Object[] b = d;
    public int c;

    public final void a(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = collection.size() + this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC3264qG.e(i, i2, "index: ", ", size: "));
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        g();
        b(this.c + 1);
        int iF = f(this.a + i);
        int i3 = this.c;
        if (i < ((i3 + 1) >> 1)) {
            if (iF == 0) {
                Object[] objArr = this.b;
                AbstractC0500aq.m(objArr, "<this>");
                iF = objArr.length;
            }
            int i4 = iF - 1;
            int i5 = this.a;
            if (i5 == 0) {
                Object[] objArr2 = this.b;
                AbstractC0500aq.m(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i5 - 1;
            }
            int i6 = this.a;
            Object[] objArr3 = this.b;
            if (i4 >= i6) {
                objArr3[length] = objArr3[i6];
                AbstractC2540d4.W(objArr3, i6, objArr3, i6 + 1, i4 + 1);
            } else {
                AbstractC2540d4.W(objArr3, i6 - 1, objArr3, i6, objArr3.length);
                Object[] objArr4 = this.b;
                objArr4[objArr4.length - 1] = objArr4[0];
                AbstractC2540d4.W(objArr4, 0, objArr4, 1, i4 + 1);
            }
            this.b[i4] = obj;
            this.a = length;
        } else {
            int iF2 = f(this.a + i3);
            Object[] objArr5 = this.b;
            if (iF < iF2) {
                AbstractC2540d4.W(objArr5, iF + 1, objArr5, iF, iF2);
            } else {
                AbstractC2540d4.W(objArr5, 1, objArr5, 0, iF2);
                Object[] objArr6 = this.b;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC2540d4.W(objArr6, iF + 1, objArr6, iF, objArr6.length - 1);
            }
            this.b[iF] = obj;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        AbstractC0500aq.m(collection, "elements");
        int i2 = this.c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(AbstractC3264qG.e(i, i2, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.c) {
            return addAll(collection);
        }
        g();
        b(collection.size() + this.c);
        int iF = f(this.a + this.c);
        int iF2 = f(this.a + i);
        int size = collection.size();
        if (i < ((this.c + 1) >> 1)) {
            int i3 = this.a;
            int length = i3 - size;
            if (iF2 < i3) {
                Object[] objArr = this.b;
                AbstractC2540d4.W(objArr, length, objArr, i3, objArr.length);
                Object[] objArr2 = this.b;
                if (size >= iF2) {
                    AbstractC2540d4.W(objArr2, objArr2.length - size, objArr2, 0, iF2);
                } else {
                    AbstractC2540d4.W(objArr2, objArr2.length - size, objArr2, 0, size);
                    Object[] objArr3 = this.b;
                    AbstractC2540d4.W(objArr3, 0, objArr3, size, iF2);
                }
            } else if (length >= 0) {
                Object[] objArr4 = this.b;
                AbstractC2540d4.W(objArr4, length, objArr4, i3, iF2);
            } else {
                Object[] objArr5 = this.b;
                length += objArr5.length;
                int i4 = iF2 - i3;
                int length2 = objArr5.length - length;
                if (length2 >= i4) {
                    AbstractC2540d4.W(objArr5, length, objArr5, i3, iF2);
                } else {
                    AbstractC2540d4.W(objArr5, length, objArr5, i3, i3 + length2);
                    Object[] objArr6 = this.b;
                    AbstractC2540d4.W(objArr6, 0, objArr6, this.a + length2, iF2);
                }
            }
            this.a = length;
            a(d(iF2 - size), collection);
        } else {
            int length3 = iF2 + size;
            if (iF2 < iF) {
                int i5 = size + iF;
                Object[] objArr7 = this.b;
                if (i5 <= objArr7.length) {
                    AbstractC2540d4.W(objArr7, length3, objArr7, iF2, iF);
                } else if (length3 >= objArr7.length) {
                    length3 -= objArr7.length;
                    AbstractC2540d4.W(objArr7, length3, objArr7, iF2, iF);
                } else {
                    int length4 = iF - (i5 - objArr7.length);
                    AbstractC2540d4.W(objArr7, 0, objArr7, length4, iF);
                    Object[] objArr8 = this.b;
                    AbstractC2540d4.W(objArr8, length3, objArr8, iF2, length4);
                }
            } else {
                Object[] objArr9 = this.b;
                AbstractC2540d4.W(objArr9, size, objArr9, 0, iF);
                Object[] objArr10 = this.b;
                if (length3 >= objArr10.length) {
                    AbstractC2540d4.W(objArr10, length3 - objArr10.length, objArr10, iF2, objArr10.length);
                } else {
                    AbstractC2540d4.W(objArr10, 0, objArr10, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.b;
                    AbstractC2540d4.W(objArr11, length3, objArr11, iF2, objArr11.length - size);
                }
            }
            a(iF2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        g();
        b(this.c + 1);
        int length = this.a;
        if (length == 0) {
            Object[] objArr = this.b;
            AbstractC0500aq.m(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.a = i;
        this.b[i] = obj;
        this.c++;
    }

    public final void addLast(Object obj) {
        g();
        b(this.c + 1);
        this.b[f(this.a + this.c)] = obj;
        this.c++;
    }

    public final void b(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i < 10) {
                i = 10;
            }
            this.b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        AbstractC2540d4.W(objArr, 0, objArr2, this.a, objArr.length);
        Object[] objArr3 = this.b;
        int length2 = objArr3.length;
        int i3 = this.a;
        AbstractC2540d4.W(objArr3, length2 - i3, objArr2, 0, i3);
        this.a = 0;
        this.b = objArr2;
    }

    public final int c(int i) {
        AbstractC0500aq.m(this.b, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            g();
            e(this.a, f(this.a + this.c));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    public final void e(int i, int i2) {
        Object[] objArr = this.b;
        if (i < i2) {
            AbstractC2540d4.Y(objArr, i, i2);
        } else {
            AbstractC2540d4.Y(objArr, i, objArr.length);
            AbstractC2540d4.Y(this.b, 0, i2);
        }
    }

    public final int f(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void g() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC3264qG.e(i, i2, "index: ", ", size: "));
        }
        return this.b[f(this.a + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int iF = f(this.a + this.c);
        int length = this.a;
        if (length < iF) {
            while (length < iF) {
                if (!AbstractC0500aq.b(obj, this.b[length])) {
                    length++;
                }
            }
            return -1;
        }
        if (length < iF) {
            return -1;
        }
        int length2 = this.b.length;
        while (true) {
            if (length >= length2) {
                for (int i = 0; i < iF; i++) {
                    if (AbstractC0500aq.b(obj, this.b[i])) {
                        length = i + this.b.length;
                    }
                }
                return -1;
            }
            if (AbstractC0500aq.b(obj, this.b[length])) {
                break;
            }
            length++;
        }
        return length - this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int iF = f(this.a + this.c);
        int i = this.a;
        if (i < iF) {
            length = iF - 1;
            if (i <= length) {
                while (!AbstractC0500aq.b(obj, this.b[length])) {
                    if (length != i) {
                        length--;
                    }
                }
                return length - this.a;
            }
            return -1;
        }
        if (i > iF) {
            int i2 = iF - 1;
            while (true) {
                if (-1 >= i2) {
                    Object[] objArr = this.b;
                    AbstractC0500aq.m(objArr, "<this>");
                    length = objArr.length - 1;
                    int i3 = this.a;
                    if (i3 <= length) {
                        while (!AbstractC0500aq.b(obj, this.b[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                    }
                } else {
                    if (AbstractC0500aq.b(obj, this.b[i2])) {
                        length = i2 + this.b.length;
                        break;
                    }
                    i2--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC3264qG.e(i, i2, "index: ", ", size: "));
        }
        if (i == AbstractC3437ta.X(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        g();
        int iF = f(this.a + i);
        Object[] objArr = this.b;
        Object obj = objArr[iF];
        if (i < (this.c >> 1)) {
            int i3 = this.a;
            if (iF >= i3) {
                AbstractC2540d4.W(objArr, i3 + 1, objArr, i3, iF);
            } else {
                AbstractC2540d4.W(objArr, 1, objArr, 0, iF);
                Object[] objArr2 = this.b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.a;
                AbstractC2540d4.W(objArr2, i4 + 1, objArr2, i4, objArr2.length - 1);
            }
            Object[] objArr3 = this.b;
            int i5 = this.a;
            objArr3[i5] = null;
            this.a = c(i5);
        } else {
            int iF2 = f(AbstractC3437ta.X(this) + this.a);
            Object[] objArr4 = this.b;
            int i6 = iF + 1;
            if (iF <= iF2) {
                AbstractC2540d4.W(objArr4, iF, objArr4, i6, iF2 + 1);
            } else {
                AbstractC2540d4.W(objArr4, iF, objArr4, i6, objArr4.length);
                Object[] objArr5 = this.b;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC2540d4.W(objArr5, 0, objArr5, 1, iF2 + 1);
            }
            this.b[iF2] = null;
        }
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iF;
        AbstractC0500aq.m(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iF2 = f(this.a + this.c);
            int i = this.a;
            if (i < iF2) {
                iF = i;
                while (i < iF2) {
                    Object obj = this.b[i];
                    if (!collection.contains(obj)) {
                        this.b[iF] = obj;
                        iF++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                AbstractC2540d4.Y(this.b, iF, iF2);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (!collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iF = f(i2);
                for (int i3 = 0; i3 < iF2; i3++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.b[iF] = obj3;
                        iF = c(iF);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                g();
                this.c = d(iF - this.a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        Object[] objArr = this.b;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = c(i);
        this.c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        int iF = f(AbstractC3437ta.X(this) + this.a);
        Object[] objArr = this.b;
        Object obj = objArr[iF];
        objArr[iF] = null;
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        AbstractC0069Df.e(i, i2, this.c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.c) {
            clear();
            return;
        }
        if (i3 == 1) {
            remove(i);
            return;
        }
        g();
        if (i < this.c - i2) {
            int iF = f((i - 1) + this.a);
            int iF2 = f((i2 - 1) + this.a);
            while (i > 0) {
                int i4 = iF + 1;
                int iMin = Math.min(i, Math.min(i4, iF2 + 1));
                Object[] objArr = this.b;
                int i5 = iF2 - iMin;
                int i6 = iF - iMin;
                AbstractC2540d4.W(objArr, i5 + 1, objArr, i6 + 1, i4);
                iF = d(i6);
                iF2 = d(i5);
                i -= iMin;
            }
            int iF3 = f(this.a + i3);
            e(this.a, iF3);
            this.a = iF3;
        } else {
            int iF4 = f(this.a + i2);
            int iF5 = f(this.a + i);
            int i7 = this.c;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.b;
                i2 = Math.min(i7, Math.min(objArr2.length - iF4, objArr2.length - iF5));
                Object[] objArr3 = this.b;
                int i8 = iF4 + i2;
                AbstractC2540d4.W(objArr3, iF5, objArr3, iF4, i8);
                iF4 = f(i8);
                iF5 = f(iF5 + i2);
            }
            int iF6 = f(this.a + this.c);
            e(d(iF6 - i3), iF6);
        }
        this.c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iF;
        AbstractC0500aq.m(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iF2 = f(this.a + this.c);
            int i = this.a;
            if (i < iF2) {
                iF = i;
                while (i < iF2) {
                    Object obj = this.b[i];
                    if (collection.contains(obj)) {
                        this.b[iF] = obj;
                        iF++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                AbstractC2540d4.Y(this.b, iF, iF2);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iF = f(i2);
                for (int i3 = 0; i3 < iF2; i3++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[iF] = obj3;
                        iF = c(iF);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                g();
                this.c = d(iF - this.a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC3264qG.e(i, i2, "index: ", ", size: "));
        }
        int iF = f(this.a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[iF];
        objArr[iF] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        AbstractC0500aq.m(objArr, "array");
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            AbstractC0500aq.k(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iF = f(this.a + this.c);
        int i2 = this.a;
        if (i2 < iF) {
            AbstractC2540d4.X(this.b, i2, objArr, iF, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            AbstractC2540d4.W(objArr2, 0, objArr, this.a, objArr2.length);
            Object[] objArr3 = this.b;
            AbstractC2540d4.W(objArr3, objArr3.length - this.a, objArr, 0, iF);
        }
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC0500aq.m(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        g();
        b(collection.size() + this.c);
        a(f(this.a + this.c), collection);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }
}
