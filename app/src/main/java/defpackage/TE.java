package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class TE extends HK {
    public int a = 2;
    public Object b;
    public final Iterator c;
    public final Iterator d;
    public final /* synthetic */ UE e;

    public TE(UE ue) {
        this.e = ue;
        this.c = ue.a.iterator();
        this.d = ue.b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i = this.a;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iA = AbstractC3264qG.A(i);
        if (iA == 0) {
            return true;
        }
        if (iA == 2) {
            return false;
        }
        this.a = 4;
        Iterator it = this.c;
        if (!it.hasNext()) {
            while (true) {
                Iterator it2 = this.d;
                if (!it2.hasNext()) {
                    this.a = 3;
                    next = null;
                    break;
                }
                next = it2.next();
                if (!this.e.a.contains(next)) {
                    break;
                }
            }
        } else {
            next = it.next();
        }
        this.b = next;
        if (this.a == 3) {
            return false;
        }
        this.a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = 2;
        Object obj = this.b;
        this.b = null;
        return obj;
    }
}
