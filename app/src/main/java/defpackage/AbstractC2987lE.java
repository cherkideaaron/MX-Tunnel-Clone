package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: lE, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2987lE extends AbstractC3097nE {
    public static List U(InterfaceC2877jE interfaceC2877jE) {
        AbstractC0500aq.m(interfaceC2877jE, "<this>");
        Iterator it = interfaceC2877jE.iterator();
        if (!it.hasNext()) {
            return C0055Ci.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0115Ga.I(next);
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(next);
            if (!it.hasNext()) {
                return arrayList;
            }
            next = it.next();
        }
    }
}
