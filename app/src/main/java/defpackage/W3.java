package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class W3 implements Iterator {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public W3(int i) {
        this.a = i;
    }

    public final Object a(int i) {
        switch (this.d) {
            case 0:
                return ((Z3) this.e).g(i);
            case 1:
                return ((Z3) this.e).j(i);
            default:
                return ((C0569c4) this.e).b[i];
        }
    }

    public final void b(int i) {
        switch (this.d) {
            case 0:
                ((Z3) this.e).h(i);
                break;
            case 1:
                ((Z3) this.e).h(i);
                break;
            default:
                ((C0569c4) this.e).a(i);
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a(this.b);
        this.b++;
        this.c = true;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("Call next() before removing an element.".toString());
        }
        int i = this.b - 1;
        this.b = i;
        b(i);
        this.a--;
        this.c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W3(Z3 z3, int i) {
        this(z3.c);
        this.d = i;
        this.e = z3;
        switch (i) {
            case 1:
                this(z3.c);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W3(C0569c4 c0569c4) {
        this(c0569c4.c);
        this.d = 2;
        this.e = c0569c4;
    }
}
