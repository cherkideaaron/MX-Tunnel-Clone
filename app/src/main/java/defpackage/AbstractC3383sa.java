package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: sa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3383sa extends AbstractC3707ya {
    public static boolean a0(Iterable iterable, Object obj) {
        int iIndexOf;
        AbstractC0500aq.m(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                if (AbstractC0500aq.b(obj, next)) {
                    iIndexOf = i;
                    break;
                }
                i++;
            }
        } else {
            iIndexOf = ((List) iterable).indexOf(obj);
        }
        return iIndexOf >= 0;
    }

    public static final void b0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC2631en interfaceC2631en) {
        AbstractC0500aq.m(iterable, "<this>");
        AbstractC0500aq.m(charSequence, "separator");
        AbstractC0500aq.m(charSequence2, "prefix");
        AbstractC0500aq.m(charSequence3, "postfix");
        AbstractC0500aq.m(charSequence4, "truncated");
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                AbstractC2883jK.f(sb, obj, interfaceC2631en);
            }
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String c0(Iterable iterable, String str, String str2, String str3, InterfaceC2631en interfaceC2631en, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            interfaceC2631en = null;
        }
        AbstractC0500aq.m(iterable, "<this>");
        AbstractC0500aq.m(str4, "separator");
        AbstractC0500aq.m(str5, "prefix");
        AbstractC0500aq.m(str6, "postfix");
        StringBuilder sb = new StringBuilder();
        b0(iterable, sb, str4, str5, str6, -1, "...", interfaceC2631en);
        return sb.toString();
    }

    public static Object d0(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC3437ta.X(list));
    }

    public static Object e0(List list) {
        AbstractC0500aq.m(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static List f0(int i, List list) {
        AbstractC0500aq.m(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(Vs.l(i, "Requested element count ", " is less than zero.").toString());
        }
        C0055Ci c0055Ci = C0055Ci.a;
        if (i == 0) {
            return c0055Ci;
        }
        if (i >= list.size()) {
            return j0(list);
        }
        if (i == 1) {
            if (list.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return AbstractC0115Ga.I(list.get(0));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : AbstractC0115Ga.I(arrayList.get(0)) : c0055Ci;
    }

    public static byte[] g0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void h0(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC0500aq.m(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] i0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List j0(Iterable iterable) {
        ArrayList arrayList;
        AbstractC0500aq.m(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        C0055Ci c0055Ci = C0055Ci.a;
        if (!z) {
            if (z) {
                arrayList = new ArrayList((Collection) iterable);
            } else {
                arrayList = new ArrayList();
                h0(iterable, arrayList);
            }
            int size = arrayList.size();
            return size != 0 ? size != 1 ? arrayList : AbstractC0115Ga.I(arrayList.get(0)) : c0055Ci;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c0055Ci;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return AbstractC0115Ga.I(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] k0(Collection collection) {
        AbstractC0500aq.m(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static Set l0(Iterable iterable) {
        AbstractC0500aq.m(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        C0089Ei c0089Ei = C0089Ei.a;
        if (!z) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            h0(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                return c0089Ei;
            }
            if (size != 1) {
                return linkedHashSet;
            }
            Set setSingleton = Collections.singleton(linkedHashSet.iterator().next());
            AbstractC0500aq.l(setSingleton, "singleton(...)");
            return setSingleton;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c0089Ei;
        }
        if (size2 != 1) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(Ht.U(collection.size()));
            h0(iterable, linkedHashSet2);
            return linkedHashSet2;
        }
        Set setSingleton2 = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        AbstractC0500aq.l(setSingleton2, "singleton(...)");
        return setSingleton2;
    }
}
