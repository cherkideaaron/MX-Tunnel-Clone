package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class WB extends AbstractC2906jp {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public WB(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0115Ga.h(i, this.e);
        Object obj = this.c[(i * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
