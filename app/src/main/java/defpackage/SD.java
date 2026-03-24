package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class SD {
    public static final Class a;
    public static final FK b;
    public static final FK c;

    static {
        Class<?> cls;
        Class<?> cls2;
        C2928kA c2928kA = C2928kA.c;
        FK fk = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            C2928kA c2928kA2 = C2928kA.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                fk = (FK) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = fk;
        c = new FK();
    }

    public static void A(FK fk, Object obj, Object obj2) {
        fk.getClass();
        AbstractC0247Nn abstractC0247Nn = (AbstractC0247Nn) obj;
        EK ek = abstractC0247Nn.unknownFields;
        EK ek2 = ((AbstractC0247Nn) obj2).unknownFields;
        EK ek3 = EK.f;
        if (!ek3.equals(ek2)) {
            if (ek3.equals(ek)) {
                int i = ek.a + ek2.a;
                int[] iArrCopyOf = Arrays.copyOf(ek.b, i);
                System.arraycopy(ek2.b, 0, iArrCopyOf, ek.a, ek2.a);
                Object[] objArrCopyOf = Arrays.copyOf(ek.c, i);
                System.arraycopy(ek2.c, 0, objArrCopyOf, ek.a, ek2.a);
                ek = new EK(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                ek.getClass();
                if (!ek2.equals(ek3)) {
                    if (!ek.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = ek.a + ek2.a;
                    ek.a(i2);
                    System.arraycopy(ek2.b, 0, ek.b, ek.a, ek2.a);
                    System.arraycopy(ek2.c, 0, ek.c, ek.a, ek2.a);
                    ek.a = i2;
                }
            }
        }
        abstractC0247Nn.unknownFields = ek;
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void C(int i, List list, C2524cp c2524cp, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3221pa c3221pa = (C3221pa) c2524cp.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3221pa.G0(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        c3221pa.U0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = C3221pa.o;
            i3++;
        }
        c3221pa.W0(i3);
        while (i2 < list.size()) {
            c3221pa.E0(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void D(int i, List list, C2524cp c2524cp) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2524cp.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((C3221pa) c2524cp.b).I0(i, (C0519b8) list.get(i2));
        }
    }

    public static void E(int i, List list, C2524cp c2524cp, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3221pa c3221pa = (C3221pa) c2524cp.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                c3221pa.getClass();
                c3221pa.M0(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        c3221pa.U0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = C3221pa.o;
            i3 += 8;
        }
        c3221pa.W0(i3);
        while (i2 < list.size()) {
            c3221pa.N0(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void F(int i, List list, C2524cp c2524cp, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3221pa c3221pa = (C3221pa) c2524cp.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3221pa.O0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c3221pa.U0(i, 2);
        int iA0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA0 += C3221pa.A0(((Integer) list.get(i3)).intValue());
        }
        c3221pa.W0(iA0);
        while (i2 < list.size()) {
            c3221pa.P0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void G(int i, List list, C2524cp c2524cp, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3221pa c3221pa = (C3221pa) c2524cp.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3221pa.K0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c3221pa.U0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C3221pa.o;
            i3 += 4;
        }
        c3221pa.W0(i3);
        while (i2 < list.size()) {
            c3221pa.L0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void H(int i, List list, C2524cp c2524cp, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3221pa c3221pa = (C3221pa) c2524cp.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3221pa.M0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c3221pa.U0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C3221pa.o;
            i3 += 8;
        }
        c3221pa.W0(i3);
        while (i2 < list.size()) {
            c3221pa.N0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void I(int i, List list, C2524cp c2524cp, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3221pa c3221pa = (C3221pa) c2524cp.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                c3221pa.getClass();
                c3221pa.K0(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        c3221pa.U0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = C3221pa.o;
            i3 += 4;
        }
        c3221pa.W0(i3);
        while (i2 < list.size()) {
            c3221pa.L0(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void J(int i, List list, C2524cp c2524cp, PD pd) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2524cp.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c2524cp.E(i, list.get(i2), pd);
        }
    }

    public static void K(int i, List list, C2524cp c2524cp, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3221pa c3221pa = (C3221pa) c2524cp.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3221pa.O0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c3221pa.U0(i, 2);
        int iA0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA0 += C3221pa.A0(((Integer) list.get(i3)).intValue());
        }
        c3221pa.W0(iA0);
        while (i2 < list.size()) {
            c3221pa.P0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void L(int i, List list, C2524cp c2524cp, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3221pa c3221pa = (C3221pa) c2524cp.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3221pa.X0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c3221pa.U0(i, 2);
        int iA0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA0 += C3221pa.A0(((Long) list.get(i3)).longValue());
        }
        c3221pa.W0(iA0);
        while (i2 < list.size()) {
            c3221pa.Y0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void M(int i, List list, C2524cp c2524cp, PD pd) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2524cp.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            c2524cp.H(i, list.get(i2), pd);
        }
    }

    public static void N(int i, List list, C2524cp c2524cp, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3221pa c3221pa = (C3221pa) c2524cp.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3221pa.K0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c3221pa.U0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C3221pa.o;
            i3 += 4;
        }
        c3221pa.W0(i3);
        while (i2 < list.size()) {
            c3221pa.L0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void O(int i, List list, C2524cp c2524cp, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3221pa c3221pa = (C3221pa) c2524cp.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3221pa.M0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c3221pa.U0(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C3221pa.o;
            i3 += 8;
        }
        c3221pa.W0(i3);
        while (i2 < list.size()) {
            c3221pa.N0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void P(int i, List list, C2524cp c2524cp, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3221pa c3221pa = (C3221pa) c2524cp.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                c3221pa.V0(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        c3221pa.U0(i, 2);
        int iY0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iY0 += C3221pa.y0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c3221pa.W0(iY0);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            c3221pa.W0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void Q(int i, List list, C2524cp c2524cp, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3221pa c3221pa = (C3221pa) c2524cp.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                c3221pa.X0(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        c3221pa.U0(i, 2);
        int iA0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iA0 += C3221pa.A0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c3221pa.W0(iA0);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            c3221pa.Y0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void R(int i, List list, C2524cp c2524cp) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2524cp.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((C3221pa) c2524cp.b).S0(i, (String) list.get(i2));
        }
    }

    public static void S(int i, List list, C2524cp c2524cp, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3221pa c3221pa = (C3221pa) c2524cp.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3221pa.V0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c3221pa.U0(i, 2);
        int iY0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iY0 += C3221pa.y0(((Integer) list.get(i3)).intValue());
        }
        c3221pa.W0(iY0);
        while (i2 < list.size()) {
            c3221pa.W0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void T(int i, List list, C2524cp c2524cp, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C3221pa c3221pa = (C3221pa) c2524cp.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c3221pa.X0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c3221pa.U0(i, 2);
        int iA0 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iA0 += C3221pa.A0(((Long) list.get(i3)).longValue());
        }
        c3221pa.W0(iA0);
        while (i2 < list.size()) {
            c3221pa.Y0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C3221pa.g0(i) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW0 = C3221pa.w0(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int size2 = ((C0519b8) list.get(i2)).size();
            iW0 += C3221pa.y0(size2) + size2;
        }
        return iW0;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3221pa.w0(i) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA0 = 0;
        for (int i = 0; i < size; i++) {
            iA0 += C3221pa.A0(((Integer) list.get(i)).intValue());
        }
        return iA0;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C3221pa.k0(i) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C3221pa.l0(i) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i, List list, PD pd) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iN0 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iN0 += C3221pa.n0(i, (AbstractC3733z) list.get(i2), pd);
        }
        return iN0;
    }

    public static int k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3221pa.w0(i) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA0 = 0;
        for (int i = 0; i < size; i++) {
            iA0 += C3221pa.A0(((Integer) list.get(i)).intValue());
        }
        return iA0;
    }

    public static int m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C3221pa.w0(i) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA0 = 0;
        for (int i = 0; i < size; i++) {
            iA0 += C3221pa.A0(((Long) list.get(i)).longValue());
        }
        return iA0;
    }

    public static int o(int i, Object obj, PD pd) {
        int iW0 = C3221pa.w0(i);
        int iB = ((AbstractC3733z) obj).b(pd);
        return C3221pa.y0(iB) + iB + iW0;
    }

    public static int p(int i, List list, PD pd) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW0 = C3221pa.w0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iB = ((AbstractC3733z) list.get(i2)).b(pd);
            iW0 += C3221pa.y0(iB) + iB;
        }
        return iW0;
    }

    public static int q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3221pa.w0(i) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY0 = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iY0 += C3221pa.y0((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iY0;
    }

    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3221pa.w0(i) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA0 = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iA0 += C3221pa.A0((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iA0;
    }

    public static int u(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW0 = C3221pa.w0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C0519b8) {
                int size2 = ((C0519b8) obj).size();
                iW0 = C3221pa.y0(size2) + size2 + iW0;
            } else {
                iW0 = C3221pa.v0((String) obj) + iW0;
            }
        }
        return iW0;
    }

    public static int v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3221pa.w0(i) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY0 = 0;
        for (int i = 0; i < size; i++) {
            iY0 += C3221pa.y0(((Integer) list.get(i)).intValue());
        }
        return iY0;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3221pa.w0(i) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iA0 = 0;
        for (int i = 0; i < size; i++) {
            iA0 += C3221pa.A0(((Long) list.get(i)).longValue());
        }
        return iA0;
    }

    public static Object z(Object obj, int i, InterfaceC0351Tp interfaceC0351Tp, Object obj2, FK fk) {
        return obj2;
    }
}
