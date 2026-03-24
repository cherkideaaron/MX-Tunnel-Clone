package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: d4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2540d4 extends AbstractC2883jK {
    public static boolean U(Object[] objArr, Object obj) {
        int i;
        AbstractC0500aq.m(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i = 0;
            while (i < length) {
                if (objArr[i] == null) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            int length2 = objArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (AbstractC0500aq.b(obj, objArr[i2])) {
                    i = i2;
                    break;
                }
            }
            i = -1;
        }
        return i >= 0;
    }

    public static void V(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        AbstractC0500aq.m(iArr, "<this>");
        AbstractC0500aq.m(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void W(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        AbstractC0500aq.m(objArr, "<this>");
        AbstractC0500aq.m(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void X(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        W(objArr, 0, objArr2, i, i2);
    }

    public static final void Y(Object[] objArr, int i, int i2) {
        AbstractC0500aq.m(objArr, "<this>");
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static String Z(Object[] objArr) {
        AbstractC0500aq.m(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ",");
            }
            AbstractC2883jK.f(sb, obj, null);
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public static List a0(long[] jArr) {
        AbstractC0500aq.m(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return C0055Ci.a;
        }
        if (length == 1) {
            return AbstractC0115Ga.I(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static List b0(Object[] objArr) {
        AbstractC0500aq.m(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new S3(objArr)) : AbstractC0115Ga.I(objArr[0]) : C0055Ci.a;
    }
}
