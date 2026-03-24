package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: xO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3650xO {
    public static final InterfaceC3207pE a(InterfaceC3207pE interfaceC3207pE, C0108Fk c0108Fk) {
        AbstractC0500aq.m(interfaceC3207pE, "<this>");
        AbstractC0500aq.m(c0108Fk, "module");
        if (!AbstractC0500aq.b(interfaceC3207pE.e(), C3370sE.w)) {
            return interfaceC3207pE.isInline() ? a(interfaceC3207pE.i(0), c0108Fk) : interfaceC3207pE;
        }
        AbstractC0069Df.s(interfaceC3207pE);
        return interfaceC3207pE;
    }

    public static boolean b(String str) {
        X1 x1 = VM.a;
        Set<InterfaceC3384sb> setUnmodifiableSet = Collections.unmodifiableSet(Y1.c);
        HashSet hashSet = new HashSet();
        for (InterfaceC3384sb interfaceC3384sb : setUnmodifiableSet) {
            if (((Y1) interfaceC3384sb).a.equals(str)) {
                hashSet.add(interfaceC3384sb);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Y1 y1 = (Y1) ((InterfaceC3384sb) it.next());
            if (y1.a() || y1.b()) {
                return true;
            }
        }
        return false;
    }

    public static final EnumC3596wO c(C0284Pq c0284Pq, InterfaceC3207pE interfaceC3207pE) {
        AbstractC0500aq.m(c0284Pq, "<this>");
        AbstractC0500aq.m(interfaceC3207pE, "desc");
        MO moE = interfaceC3207pE.e();
        if (moE instanceof AbstractC0563bz) {
            return EnumC3596wO.f;
        }
        if (!AbstractC0500aq.b(moE, DH.x)) {
            if (!AbstractC0500aq.b(moE, DH.y)) {
                return EnumC3596wO.c;
            }
            InterfaceC3207pE interfaceC3207pEA = a(interfaceC3207pE.i(0), c0284Pq.b);
            MO moE2 = interfaceC3207pEA.e();
            if ((moE2 instanceof AbstractC3786zz) || AbstractC0500aq.b(moE2, C3370sE.x)) {
                return EnumC3596wO.e;
            }
            if (!c0284Pq.a.d) {
                throw AbstractC2883jK.b(interfaceC3207pEA);
            }
        }
        return EnumC3596wO.d;
    }
}
