package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: vH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3535vH extends AbstractC2883jK {
    public static String U(String str) {
        int i;
        Comparable comparable;
        AbstractC0500aq.m(str, "<this>");
        List listU = AbstractC2987lE.U(new C3042mE(str, 2));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listU) {
            if (true ^ AbstractC3481uH.j0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC3491ua.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                char cCharAt = str2.charAt(length2);
                if (!(Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(length2));
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listU.size();
        int iX = AbstractC3437ta.X(listU);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listU) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str3 = (String) obj2;
            String strC0 = ((i == 0 || i == iX) && AbstractC3481uH.j0(str3)) ? null : AbstractC3481uH.c0(iIntValue, str3);
            if (strC0 != null) {
                arrayList3.add(strC0);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length3);
        AbstractC3383sa.b0(arrayList3, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }
}
