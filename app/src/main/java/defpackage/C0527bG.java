package defpackage;

/* renamed from: bG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0527bG extends AbstractC3071mp {
    public final transient Object d;

    public C0527bG(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.AbstractC2743gp
    public final int a(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override // defpackage.AbstractC2743gp, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // defpackage.AbstractC3071mp, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final HK iterator() {
        return new C3072mq(this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.d.toString() + ']';
    }
}
