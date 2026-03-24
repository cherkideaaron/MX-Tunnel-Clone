package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class SB extends AbstractC2906jp {
    public static final SB e = new SB(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public SB(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.AbstractC2906jp, defpackage.AbstractC2743gp
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.AbstractC2743gp
    public final Object[] b() {
        return this.c;
    }

    @Override // defpackage.AbstractC2743gp
    public final int c() {
        return this.d;
    }

    @Override // defpackage.AbstractC2743gp
    public final int d() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0115Ga.h(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
