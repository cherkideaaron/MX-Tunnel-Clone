package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class At extends AbstractSet implements Set {
    public final /* synthetic */ int a;
    public final C3780zt b;

    public At(C3780zt c3780zt, int i) {
        this.a = i;
        switch (i) {
            case 1:
                AbstractC0500aq.m(c3780zt, "backing");
                this.b = c3780zt;
                break;
            default:
                AbstractC0500aq.m(c3780zt, "backing");
                this.b = c3780zt;
                break;
        }
    }

    public final int a() {
        switch (this.a) {
        }
        return this.b.o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                AbstractC0500aq.m((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                AbstractC0500aq.m(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                AbstractC0500aq.m(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                break;
            default:
                this.b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                AbstractC0500aq.m(entry, "element");
                return this.b.f(entry);
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                AbstractC0500aq.m(collection, "elements");
                return this.b.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.a) {
        }
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                C3780zt c3780zt = this.b;
                c3780zt.getClass();
                return new C3672xt(c3780zt, 0);
            default:
                C3780zt c3780zt2 = this.b;
                c3780zt2.getClass();
                return new C3672xt(c3780zt2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    AbstractC0500aq.m(entry, "element");
                    C3780zt c3780zt = this.b;
                    c3780zt.getClass();
                    c3780zt.c();
                    int iH = c3780zt.h(entry.getKey());
                    if (iH >= 0) {
                        Object[] objArr = c3780zt.b;
                        AbstractC0500aq.j(objArr);
                        if (AbstractC0500aq.b(objArr[iH], entry.getValue())) {
                            c3780zt.l(iH);
                            break;
                        }
                    }
                }
                break;
            default:
                C3780zt c3780zt2 = this.b;
                c3780zt2.c();
                int iH2 = c3780zt2.h(obj);
                if (iH2 >= 0) {
                    c3780zt2.l(iH2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                AbstractC0500aq.m(collection, "elements");
                this.b.c();
                break;
            default:
                AbstractC0500aq.m(collection, "elements");
                this.b.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                AbstractC0500aq.m(collection, "elements");
                this.b.c();
                break;
            default:
                AbstractC0500aq.m(collection, "elements");
                this.b.c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
