package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: fG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2661fG implements Iterator {
    public int a = -1;
    public boolean b;
    public Iterator c;
    public final /* synthetic */ C2552dG d;

    public C2661fG(C2552dG c2552dG) {
        this.d = c2552dG;
    }

    public final Iterator a() {
        if (this.c == null) {
            this.c = this.d.b.entrySet().iterator();
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a + 1;
        C2552dG c2552dG = this.d;
        if (i >= c2552dG.a.size()) {
            return !c2552dG.b.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        C2552dG c2552dG = this.d;
        return (Map.Entry) (i < c2552dG.a.size() ? c2552dG.a.get(this.a) : a().next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.b = false;
        int i = C2552dG.f;
        C2552dG c2552dG = this.d;
        c2552dG.c();
        if (this.a >= c2552dG.a.size()) {
            a().remove();
            return;
        }
        int i2 = this.a;
        this.a = i2 - 1;
        c2552dG.i(i2);
    }
}
