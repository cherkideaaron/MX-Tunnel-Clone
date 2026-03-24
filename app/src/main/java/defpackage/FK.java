package defpackage;

/* loaded from: classes.dex */
public final class FK {
    public static EK a(Object obj) {
        AbstractC0247Nn abstractC0247Nn = (AbstractC0247Nn) obj;
        EK ek = abstractC0247Nn.unknownFields;
        if (ek != EK.f) {
            return ek;
        }
        EK ek2 = new EK(0, new int[8], new Object[8], true);
        abstractC0247Nn.unknownFields = ek2;
        return ek2;
    }

    public static void b(Object obj) {
        EK ek = ((AbstractC0247Nn) obj).unknownFields;
        if (ek.e) {
            ek.e = false;
        }
    }

    public static boolean c(int i, C0463a7 c0463a7, Object obj) throws C2744gq {
        int i2 = c0463a7.a;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        AbstractC3111na abstractC3111na = (AbstractC3111na) c0463a7.d;
        if (i4 == 0) {
            c0463a7.z(0);
            ((EK) obj).c(i3 << 3, Long.valueOf(abstractC3111na.t()));
            return true;
        }
        if (i4 == 1) {
            c0463a7.z(1);
            ((EK) obj).c((i3 << 3) | 1, Long.valueOf(abstractC3111na.q()));
            return true;
        }
        if (i4 == 2) {
            ((EK) obj).c((i3 << 3) | 2, c0463a7.h());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw C2744gq.b();
            }
            c0463a7.z(5);
            ((EK) obj).c(5 | (i3 << 3), Integer.valueOf(abstractC3111na.p()));
            return true;
        }
        EK ek = new EK(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new C2744gq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0463a7.d() != Integer.MAX_VALUE && c(i7, c0463a7, ek)) {
        }
        if (i6 != c0463a7.a) {
            throw new C2744gq("Protocol message end-group tag did not match expected tag.");
        }
        if (ek.e) {
            ek.e = false;
        }
        ((EK) obj).c(i5 | 3, ek);
        return true;
    }
}
