package defpackage;

import java.util.Iterator;

/* renamed from: pD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3206pD extends AbstractC3369sD implements Iterator {
    public C3261qD a;
    public C3261qD b;
    public final /* synthetic */ int c;

    public C3206pD(C3261qD c3261qD, C3261qD c3261qD2, int i) {
        this.c = i;
        this.a = c3261qD2;
        this.b = c3261qD;
    }

    @Override // defpackage.AbstractC3369sD
    public final void a(C3261qD c3261qD) {
        C3261qD c3261qDC = null;
        if (this.a == c3261qD && c3261qD == this.b) {
            this.b = null;
            this.a = null;
        }
        C3261qD c3261qD2 = this.a;
        if (c3261qD2 == c3261qD) {
            this.a = b(c3261qD2);
        }
        C3261qD c3261qD3 = this.b;
        if (c3261qD3 == c3261qD) {
            C3261qD c3261qD4 = this.a;
            if (c3261qD3 != c3261qD4 && c3261qD4 != null) {
                c3261qDC = c(c3261qD3);
            }
            this.b = c3261qDC;
        }
    }

    public final C3261qD b(C3261qD c3261qD) {
        switch (this.c) {
            case 0:
                return c3261qD.d;
            default:
                return c3261qD.c;
        }
    }

    public final C3261qD c(C3261qD c3261qD) {
        switch (this.c) {
            case 0:
                return c3261qD.c;
            default:
                return c3261qD.d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C3261qD c3261qD = this.b;
        C3261qD c3261qD2 = this.a;
        this.b = (c3261qD == c3261qD2 || c3261qD2 == null) ? null : c(c3261qD);
        return c3261qD;
    }
}
