package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: Mb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0218Mb {
    public final ArrayList a = new ArrayList();
    public Object b;
    public final AbstractC0595cc c;
    public InterfaceC0201Lb d;

    public AbstractC0218Mb(AbstractC0595cc abstractC0595cc) {
        this.c = abstractC0595cc;
    }

    public abstract boolean a(C2834iO c2834iO);

    public abstract boolean b(Object obj);

    public final void c(Collection collection) {
        this.a.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C2834iO c2834iO = (C2834iO) it.next();
            if (a(c2834iO)) {
                this.a.add(c2834iO.a);
            }
        }
        if (this.a.isEmpty()) {
            this.c.b(this);
        } else {
            AbstractC0595cc abstractC0595cc = this.c;
            synchronized (abstractC0595cc.c) {
                try {
                    if (abstractC0595cc.d.add(this)) {
                        if (abstractC0595cc.d.size() == 1) {
                            abstractC0595cc.e = abstractC0595cc.a();
                            C3130nt.d().a(AbstractC0595cc.f, String.format("%s: initial state = %s", abstractC0595cc.getClass().getSimpleName(), abstractC0595cc.e), new Throwable[0]);
                            abstractC0595cc.d();
                        }
                        Object obj = abstractC0595cc.e;
                        this.b = obj;
                        d(this.d, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.d, this.b);
    }

    public final void d(InterfaceC0201Lb interfaceC0201Lb, Object obj) {
        if (this.a.isEmpty() || interfaceC0201Lb == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ((QN) interfaceC0201Lb).b(this.a);
            return;
        }
        ArrayList arrayList = this.a;
        QN qn = (QN) interfaceC0201Lb;
        synchronized (qn.c) {
            try {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (qn.a(str)) {
                        C3130nt.d().a(QN.d, "Constraints met for " + str, new Throwable[0]);
                        arrayList2.add(str);
                    }
                }
                PN pn = qn.a;
                if (pn != null) {
                    pn.f(arrayList2);
                }
            } finally {
            }
        }
    }
}
