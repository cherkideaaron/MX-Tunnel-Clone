package defpackage;

import java.util.Iterator;

/* renamed from: yI, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3698yI implements InterfaceC3644xI {
    public String a;

    @Override // defpackage.InterfaceC3644xI
    public final int a() {
        return 1;
    }

    @Override // defpackage.InterfaceC3644xI
    public final void b(D3 d3) {
        synchronized (d3) {
        }
        Iterator it = d3.l().iterator();
        while (it.hasNext()) {
            ((InterfaceC3752zI) it.next()).startTest(this);
        }
        d3.R(this, new C3588wG(this));
        Iterator it2 = d3.l().iterator();
        while (it2.hasNext()) {
            ((InterfaceC3752zI) it2.next()).endTest(this);
        }
    }

    public final String toString() {
        return this.a + "(" + getClass().getName() + ")";
    }
}
