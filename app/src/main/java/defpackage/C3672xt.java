package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: xt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3672xt extends AbstractC3111na implements Iterator {
    public final /* synthetic */ int e;

    public C3672xt(C3780zt c3780zt, int i) {
        this.e = i;
        AbstractC0500aq.m(c3780zt, "map");
        this.d = c3780zt;
        this.b = -1;
        this.c = c3780zt.n;
        h();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                b();
                int i = this.a;
                C3780zt c3780zt = (C3780zt) this.d;
                if (i >= c3780zt.f) {
                    throw new NoSuchElementException();
                }
                this.a = i + 1;
                this.b = i;
                C3726yt c3726yt = new C3726yt(c3780zt, i);
                h();
                return c3726yt;
            case 1:
                b();
                int i2 = this.a;
                C3780zt c3780zt2 = (C3780zt) this.d;
                if (i2 >= c3780zt2.f) {
                    throw new NoSuchElementException();
                }
                this.a = i2 + 1;
                this.b = i2;
                Object obj = c3780zt2.a[i2];
                h();
                return obj;
            default:
                b();
                int i3 = this.a;
                C3780zt c3780zt3 = (C3780zt) this.d;
                if (i3 >= c3780zt3.f) {
                    throw new NoSuchElementException();
                }
                this.a = i3 + 1;
                this.b = i3;
                Object[] objArr = c3780zt3.b;
                AbstractC0500aq.j(objArr);
                Object obj2 = objArr[this.b];
                h();
                return obj2;
        }
    }
}
