package defpackage;

import java.util.Map;

/* renamed from: qD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3261qD implements Map.Entry {
    public final Object a;
    public final Object b;
    public C3261qD c;
    public C3261qD d;

    public C3261qD(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3261qD)) {
            return false;
        }
        C3261qD c3261qD = (C3261qD) obj;
        return this.a.equals(c3261qD.a) && this.b.equals(c3261qD.b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.a + "=" + this.b;
    }
}
