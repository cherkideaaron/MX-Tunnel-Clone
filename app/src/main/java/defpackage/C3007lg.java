package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: lg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3007lg {
    public final String a;
    public final C0607co b;

    public C3007lg(Set set, C0607co c0607co) {
        this.a = b(set);
        this.b = c0607co;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C3254q6 c3254q6 = (C3254q6) it.next();
            sb.append(c3254q6.a);
            sb.append('/');
            sb.append(c3254q6.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        C0607co c0607co = this.b;
        synchronized (((HashSet) c0607co.a)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) c0607co.a);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        return str + ' ' + b(c0607co.D());
    }
}
