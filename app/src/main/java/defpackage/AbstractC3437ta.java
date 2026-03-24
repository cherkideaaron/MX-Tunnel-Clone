package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: ta, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3437ta extends AbstractC0115Ga {
    public static int X(List list) {
        AbstractC0500aq.m(list, "<this>");
        return list.size() - 1;
    }

    public static List Y(Object... objArr) {
        if (objArr.length <= 0) {
            return C0055Ci.a;
        }
        List listAsList = Arrays.asList(objArr);
        AbstractC0500aq.l(listAsList, "asList(...)");
        return listAsList;
    }
}
