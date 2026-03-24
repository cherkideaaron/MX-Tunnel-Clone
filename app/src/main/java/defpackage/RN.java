package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class RN extends LQ {
    public static final String f = C3130nt.f("WorkContinuationImpl");
    public final C0589cO a;
    public final List b;
    public final ArrayList c;
    public final ArrayList d = new ArrayList();
    public boolean e;

    public RN(C0589cO c0589cO, List list) {
        this.a = c0589cO;
        this.b = list;
        this.c = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String string = ((C3299qx) list.get(i)).a.toString();
            this.c.add(string);
            this.d.add(string);
        }
    }

    public static boolean b(RN rn, HashSet hashSet) {
        hashSet.addAll(rn.c);
        HashSet hashSetC = c(rn);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (hashSetC.contains((String) it.next())) {
                return true;
            }
        }
        hashSet.removeAll(rn.c);
        return false;
    }

    public static HashSet c(RN rn) {
        HashSet hashSet = new HashSet();
        rn.getClass();
        return hashSet;
    }
}
