package defpackage;

/* loaded from: classes2.dex */
public final class VB extends AbstractC3071mp {
    public final transient AbstractC3016lp d;
    public final transient AbstractC2906jp e;

    public VB(AbstractC3016lp abstractC3016lp, WB wb) {
        this.d = abstractC3016lp;
        this.e = wb;
    }

    @Override // defpackage.AbstractC2743gp
    public final int a(Object[] objArr) {
        return this.e.a(objArr);
    }

    @Override // defpackage.AbstractC2743gp, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // defpackage.AbstractC3071mp
    public final AbstractC2906jp e() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final HK iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((XB) this.d).f;
    }
}
