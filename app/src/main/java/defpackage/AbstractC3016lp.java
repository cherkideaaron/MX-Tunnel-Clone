package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: lp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3016lp implements Map, Serializable {
    public transient UB a;
    public transient VB b;
    public transient WB c;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        WB wb = this.c;
        if (wb == null) {
            XB xb = (XB) this;
            WB wb2 = new WB(xb.e, 1, xb.f);
            this.c = wb2;
            wb = wb2;
        }
        return wb.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        UB ub = this.a;
        if (ub != null) {
            return ub;
        }
        XB xb = (XB) this;
        UB ub2 = new UB(xb, xb.e, xb.f);
        this.a = ub2;
        return ub2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        UB ub = this.a;
        if (ub == null) {
            XB xb = (XB) this;
            UB ub2 = new UB(xb, xb.e, xb.f);
            this.a = ub2;
            ub = ub2;
        }
        Iterator it = ub.iterator();
        int i = 0;
        while (true) {
            C2798hp c2798hp = (C2798hp) it;
            if (!c2798hp.hasNext()) {
                return i;
            }
            Object next = c2798hp.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((XB) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        VB vb = this.b;
        if (vb != null) {
            return vb;
        }
        XB xb = (XB) this;
        VB vb2 = new VB(xb, new WB(xb.e, 0, xb.f));
        this.b = vb2;
        return vb2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i = ((XB) this).f;
        if (i < 0) {
            throw new IllegalArgumentException(Vs.k(i, "size cannot be negative but was: "));
        }
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        HK it = ((UB) entrySet()).iterator();
        boolean z = true;
        while (true) {
            C2798hp c2798hp = (C2798hp) it;
            if (!c2798hp.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) c2798hp.next();
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        WB wb = this.c;
        if (wb != null) {
            return wb;
        }
        XB xb = (XB) this;
        WB wb2 = new WB(xb.e, 1, xb.f);
        this.c = wb2;
        return wb2;
    }
}
