package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: Gg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0121Gg implements InterfaceC0053Cg {
    public final ZM d;
    public int f;
    public int g;
    public ZM a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public C0325Sg i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public C0121Gg(ZM zm) {
        this.d = zm;
    }

    @Override // defpackage.InterfaceC0053Cg
    public final void a(InterfaceC0053Cg interfaceC0053Cg) {
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0121Gg) it.next()).j) {
                return;
            }
        }
        this.c = true;
        ZM zm = this.a;
        if (zm != null) {
            zm.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C0121Gg c0121Gg = null;
        int i = 0;
        while (it2.hasNext()) {
            C0121Gg c0121Gg2 = (C0121Gg) it2.next();
            if (!(c0121Gg2 instanceof C0325Sg)) {
                i++;
                c0121Gg = c0121Gg2;
            }
        }
        if (c0121Gg != null && i == 1 && c0121Gg.j) {
            C0325Sg c0325Sg = this.i;
            if (c0325Sg != null) {
                if (!c0325Sg.j) {
                    return;
                } else {
                    this.f = this.h * c0325Sg.g;
                }
            }
            d(c0121Gg.g + this.f);
        }
        ZM zm2 = this.a;
        if (zm2 != null) {
            zm2.a(this);
        }
    }

    public final void b(InterfaceC0053Cg interfaceC0053Cg) {
        this.k.add(interfaceC0053Cg);
        if (this.j) {
            interfaceC0053Cg.a(interfaceC0053Cg);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
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

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.g0);
        sb.append(":");
        sb.append(AbstractC3264qG.D(this.e));
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
