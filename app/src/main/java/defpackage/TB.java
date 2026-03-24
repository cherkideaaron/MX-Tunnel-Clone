package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class TB extends AbstractC2906jp {
    public final /* synthetic */ UB c;

    public TB(UB ub) {
        this.c = ub;
    }

    @Override // java.util.List
    public final Object get(int i) {
        UB ub = this.c;
        AbstractC0115Ga.h(i, ub.m);
        int i2 = i * 2;
        int i3 = ub.f;
        Object[] objArr = ub.e;
        Object obj = objArr[i2 + i3];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.m;
    }
}
