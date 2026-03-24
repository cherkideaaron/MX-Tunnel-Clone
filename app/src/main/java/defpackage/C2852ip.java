package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: ip, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2852ip extends AbstractC2906jp {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ AbstractC2906jp e;

    public C2852ip(AbstractC2906jp abstractC2906jp, int i, int i2) {
        this.e = abstractC2906jp;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.AbstractC2743gp
    public final Object[] b() {
        return this.e.b();
    }

    @Override // defpackage.AbstractC2743gp
    public final int c() {
        return this.e.d() + this.c + this.d;
    }

    @Override // defpackage.AbstractC2743gp
    public final int d() {
        return this.e.d() + this.c;
    }

    @Override // defpackage.AbstractC2906jp, java.util.List
    /* renamed from: g */
    public final AbstractC2906jp subList(int i, int i2) {
        AbstractC0115Ga.k(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0115Ga.h(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.AbstractC2906jp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.AbstractC2906jp, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.AbstractC2906jp, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
