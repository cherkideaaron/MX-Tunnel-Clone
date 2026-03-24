package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: vt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3564vt {
    public static final C3125no a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [Ib] */
    static {
        String property;
        Object next;
        int i = AbstractC3101nI.a;
        C3125no c3125noA = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        Iterator itQ = Vs.q();
        AbstractC0500aq.m(itQ, "<this>");
        C3042mE c3042mE = new C3042mE(itQ, 1);
        if (!(c3042mE instanceof C0150Ib)) {
            c3042mE = new C0150Ib(c3042mE);
        }
        List listU = AbstractC2987lE.U(c3042mE);
        Iterator it = listU.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iB = ((C1) next).b();
                do {
                    Object next2 = it.next();
                    int iB2 = ((C1) next2).b();
                    if (iB < iB2) {
                        next = next2;
                        iB = iB2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        C1 c1 = (C1) next;
        if (c1 != null) {
            try {
                c3125noA = c1.a(listU);
            } catch (Throwable unused2) {
                c1.c();
            }
            if (c3125noA != null) {
                a = c3125noA;
                return;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
