package defpackage;

import java.util.Iterator;

/* renamed from: rD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3315rD extends AbstractC3369sD implements Iterator {
    public C3261qD a;
    public boolean b = true;
    public final /* synthetic */ C3423tD c;

    public C3315rD(C3423tD c3423tD) {
        this.c = c3423tD;
    }

    @Override // defpackage.AbstractC3369sD
    public final void a(C3261qD c3261qD) {
        C3261qD c3261qD2 = this.a;
        if (c3261qD == c3261qD2) {
            C3261qD c3261qD3 = c3261qD2.d;
            this.a = c3261qD3;
            this.b = c3261qD3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        C3261qD c3261qD = this.a;
        return (c3261qD == null || c3261qD.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C3261qD c3261qD;
        if (this.b) {
            this.b = false;
            c3261qD = this.c.a;
        } else {
            C3261qD c3261qD2 = this.a;
            c3261qD = c3261qD2 != null ? c3261qD2.c : null;
        }
        this.a = c3261qD;
        return this.a;
    }
}
