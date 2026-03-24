package defpackage;

/* loaded from: classes2.dex */
public final class YB extends AbstractC3071mp {
    public static final Object[] o;
    public static final YB p;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int m;
    public final transient int n;

    static {
        Object[] objArr = new Object[0];
        o = objArr;
        p = new YB(objArr, 0, objArr, 0, 0);
    }

    public YB(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.d = objArr;
        this.e = i;
        this.f = objArr2;
        this.m = i2;
        this.n = i3;
    }

    @Override // defpackage.AbstractC2743gp
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i = this.n;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.AbstractC2743gp
    public final Object[] b() {
        return this.d;
    }

    @Override // defpackage.AbstractC2743gp
    public final int c() {
        return this.n;
    }

    @Override // defpackage.AbstractC2743gp, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int iY = AbstractC0069Df.Y(obj.hashCode());
                while (true) {
                    int i = iY & this.m;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iY = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC2743gp
    public final int d() {
        return 0;
    }

    @Override // defpackage.AbstractC3071mp
    public final AbstractC2906jp h() {
        return AbstractC2906jp.e(this.n, this.d);
    }

    @Override // defpackage.AbstractC3071mp, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final HK iterator() {
        return e().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }
}
