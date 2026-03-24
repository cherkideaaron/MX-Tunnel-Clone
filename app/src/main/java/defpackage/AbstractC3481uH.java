package defpackage;

import java.util.NoSuchElementException;

/* renamed from: uH, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3481uH extends CH {
    public static boolean b0(String str, String str2) {
        return h0(str, str2, 0, false, 2) >= 0;
    }

    public static String c0(int i, String str) {
        AbstractC0500aq.m(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(Vs.l(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(i);
        AbstractC0500aq.l(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static int d0(CharSequence charSequence) {
        AbstractC0500aq.m(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int e0(CharSequence charSequence, String str, int i, boolean z) {
        AbstractC0500aq.m(charSequence, "<this>");
        AbstractC0500aq.m(str, "string");
        return (z || !(charSequence instanceof String)) ? f0(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int f0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C0249Np c0249Np;
        if (z2) {
            int iD0 = d0(charSequence);
            if (i > iD0) {
                i = iD0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            c0249Np = new C0249Np(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            c0249Np = new C0283Pp(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = c0249Np.c;
        int i4 = c0249Np.b;
        int i5 = c0249Np.a;
        if (z3 && (charSequence2 instanceof String)) {
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    String str = (String) charSequence2;
                    if (!CH.Y(0, i5, str.length(), str, (String) charSequence, z)) {
                        if (i5 == i4) {
                            break;
                        }
                        i5 += i3;
                    } else {
                        return i5;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            while (!m0(charSequence2, 0, charSequence, i5, charSequence2.length(), z)) {
                if (i5 != i4) {
                    i5 += i3;
                }
            }
            return i5;
        }
        return -1;
    }

    public static int g0(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        AbstractC0500aq.m(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? i0(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int h0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return e0(charSequence, str, i, z);
    }

    public static final int i0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        AbstractC0500aq.m(charSequence, "<this>");
        AbstractC0500aq.m(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int iD0 = d0(charSequence);
        if (i > iD0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (AbstractC3296qu.r(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iD0) {
                return -1;
            }
            i++;
        }
    }

    public static boolean j0(CharSequence charSequence) {
        AbstractC0500aq.m(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static int k0(String str, String str2) {
        int iD0 = d0(str);
        AbstractC0500aq.m(str, "<this>");
        return str.lastIndexOf(str2, iD0);
    }

    public static String l0(int i, String str) {
        CharSequence charSequenceSubSequence;
        AbstractC0500aq.m(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(Vs.l(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append((CharSequence) str);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(' ');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean m0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        AbstractC0500aq.m(charSequence, "<this>");
        AbstractC0500aq.m(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!AbstractC3296qu.r(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String n0(String str, String str2, String str3) {
        AbstractC0500aq.m(str2, "delimiter");
        AbstractC0500aq.m(str3, "missingDelimiterValue");
        int iH0 = h0(str, str2, 0, false, 6);
        if (iH0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(str2.length() + iH0, str.length());
        AbstractC0500aq.l(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String o0(String str, String str2) {
        AbstractC0500aq.m(str2, "missingDelimiterValue");
        int iLastIndexOf = str.lastIndexOf(46, d0(str));
        if (iLastIndexOf == -1) {
            return str2;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        AbstractC0500aq.l(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String p0(String str, String str2) {
        int iH0 = h0(str, str2, 0, false, 6);
        if (iH0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iH0);
        AbstractC0500aq.l(strSubstring, "substring(...)");
        return strSubstring;
    }
}
