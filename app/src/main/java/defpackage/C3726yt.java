package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: yt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3726yt implements Map.Entry {
    public final C3780zt a;
    public final int b;
    public final int c;

    public C3726yt(C3780zt c3780zt, int i) {
        AbstractC0500aq.m(c3780zt, "map");
        this.a = c3780zt;
        this.b = i;
        this.c = c3780zt.n;
    }

    public final void a() {
        if (this.a.n != this.c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC0500aq.b(entry.getKey(), getKey()) && AbstractC0500aq.b(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.a.a[this.b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.a.b;
        AbstractC0500aq.j(objArr);
        return objArr[this.b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        C3780zt c3780zt = this.a;
        c3780zt.c();
        Object[] objArr = c3780zt.b;
        if (objArr == null) {
            int length = c3780zt.a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
            objArr = new Object[length];
            c3780zt.b = objArr;
        }
        int i = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
