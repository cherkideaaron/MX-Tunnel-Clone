package defpackage;

import java.util.RandomAccess;

/* renamed from: x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3625x extends AbstractC3679y implements RandomAccess {
    public final AbstractC3679y a;
    public final int b;
    public final int c;

    public C3625x(AbstractC3679y abstractC3679y, int i, int i2) {
        AbstractC0500aq.m(abstractC3679y, "list");
        this.a = abstractC3679y;
        this.b = i;
        AbstractC0069Df.e(i, i2, abstractC3679y.a());
        this.c = i2 - i;
    }

    @Override // defpackage.AbstractC3679y
    public final int a() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC3264qG.e(i, i2, "index: ", ", size: "));
        }
        return this.a.get(this.b + i);
    }
}
