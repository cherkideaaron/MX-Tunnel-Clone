package defpackage;

import java.util.Iterator;

/* renamed from: Sg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0325Sg extends C0121Gg {
    public int m;

    public C0325Sg(ZM zm) {
        super(zm);
        this.e = zm instanceof C0129Go ? 2 : 3;
    }

    @Override // defpackage.C0121Gg
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            InterfaceC0053Cg interfaceC0053Cg = (InterfaceC0053Cg) it.next();
            interfaceC0053Cg.a(interfaceC0053Cg);
        }
    }
}
