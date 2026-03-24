package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class UB extends AbstractC3071mp {
    public final transient AbstractC3016lp d;
    public final transient Object[] e;
    public final transient int f = 0;
    public final transient int m;

    public UB(AbstractC3016lp abstractC3016lp, Object[] objArr, int i) {
        this.d = abstractC3016lp;
        this.e = objArr;
        this.m = i;
    }

    @Override // defpackage.AbstractC2743gp
    public final int a(Object[] objArr) {
        return e().a(objArr);
    }

    @Override // defpackage.AbstractC2743gp, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.d.get(key));
    }

    @Override // defpackage.AbstractC3071mp
    public final AbstractC2906jp h() {
        return new TB(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final HK iterator() {
        return e().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.m;
    }
}
