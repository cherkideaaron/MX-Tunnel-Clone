package defpackage;

/* loaded from: classes2.dex */
public abstract class CH extends BH {
    public static String X(byte[] bArr) {
        AbstractC0500aq.m(bArr, "<this>");
        return new String(bArr, AbstractC3202p9.a);
    }

    public static boolean Y(int i, int i2, int i3, String str, String str2, boolean z) {
        AbstractC0500aq.m(str, "<this>");
        AbstractC0500aq.m(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static String Z(String str, String str2, String str3) {
        AbstractC0500aq.m(str, "<this>");
        AbstractC0500aq.m(str3, "newValue");
        int iE0 = AbstractC3481uH.e0(str, str2, 0, false);
        if (iE0 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iE0);
            sb.append(str3);
            i2 = iE0 + length;
            if (iE0 >= str.length()) {
                break;
            }
            iE0 = AbstractC3481uH.e0(str, str2, iE0 + i, false);
        } while (iE0 > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        AbstractC0500aq.l(string, "toString(...)");
        return string;
    }

    public static boolean a0(String str, String str2) {
        AbstractC0500aq.m(str, "<this>");
        AbstractC0500aq.m(str2, "prefix");
        return str.startsWith(str2);
    }
}
