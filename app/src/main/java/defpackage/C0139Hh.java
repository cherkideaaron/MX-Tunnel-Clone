package defpackage;

/* renamed from: Hh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0139Hh implements Comparable {
    public static final long b;
    public static final long c;
    public static final /* synthetic */ int d = 0;
    public final long a;

    static {
        int i = AbstractC0156Ih.a;
        b = AbstractC2883jK.r(4611686018427387903L);
        c = AbstractC2883jK.r(-4611686018427387903L);
    }

    public static final void a(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        CharSequence charSequenceSubSequence;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strValueOf = String.valueOf(i2);
            AbstractC0500aq.m(strValueOf, "<this>");
            if (i3 < 0) {
                throw new IllegalArgumentException(Vs.l(i3, "Desired length ", " is less than zero."));
            }
            if (i3 <= strValueOf.length()) {
                charSequenceSubSequence = strValueOf.subSequence(0, strValueOf.length());
            } else {
                StringBuilder sb2 = new StringBuilder(i3);
                int length = i3 - strValueOf.length();
                int i4 = 1;
                if (1 <= length) {
                    while (true) {
                        sb2.append('0');
                        if (i4 == length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                sb2.append((CharSequence) strValueOf);
                charSequenceSubSequence = sb2;
            }
            String string = charSequenceSubSequence.toString();
            int i5 = -1;
            int length2 = string.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i6 = length2 - 1;
                    if (string.charAt(length2) != '0') {
                        i5 = length2;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length2 = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (z || i7 >= 3) {
                sb.append((CharSequence) string, 0, ((i5 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) string, 0, i7);
            }
        }
        sb.append(str);
    }

    public static int b(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            return j < 0 ? -i : i;
        }
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static final int c(long j) {
        if (d(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
    }

    public static final boolean d(long j) {
        return j == b || j == c;
    }

    public static final long e(long j, EnumC0173Jh enumC0173Jh) {
        AbstractC0500aq.m(enumC0173Jh, "unit");
        if (j == b) {
            return Long.MAX_VALUE;
        }
        if (j == c) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        EnumC0173Jh enumC0173Jh2 = (((int) j) & 1) == 0 ? EnumC0173Jh.b : EnumC0173Jh.c;
        AbstractC0500aq.m(enumC0173Jh2, "sourceUnit");
        return enumC0173Jh.a.convert(j2, enumC0173Jh2.a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return b(this.a, ((C0139Hh) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0139Hh) {
            return this.a == ((C0139Hh) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        boolean z;
        int iE;
        int i;
        StringBuilder sb;
        int i2;
        String str;
        boolean z2;
        StringBuilder sb2;
        int i3;
        long j = this.a;
        if (j == 0) {
            return "0s";
        }
        if (j == b) {
            return "Infinity";
        }
        if (j == c) {
            return "-Infinity";
        }
        boolean z3 = j < 0;
        StringBuilder sb3 = new StringBuilder();
        if (z3) {
            sb3.append('-');
        }
        if (j < 0) {
            j = (((int) j) & 1) + ((-(j >> 1)) << 1);
            int i4 = AbstractC0156Ih.a;
        }
        long jE = e(j, EnumC0173Jh.m);
        if (d(j)) {
            z = z3;
            iE = 0;
        } else {
            z = z3;
            iE = (int) (e(j, EnumC0173Jh.f) % 24);
        }
        int iE2 = d(j) ? 0 : (int) (e(j, EnumC0173Jh.e) % 60);
        int iE3 = d(j) ? 0 : (int) (e(j, EnumC0173Jh.d) % 60);
        int iC = c(j);
        boolean z4 = jE != 0;
        boolean z5 = iE != 0;
        boolean z6 = iE2 != 0;
        boolean z7 = (iE3 == 0 && iC == 0) ? false : true;
        if (z4) {
            sb3.append(jE);
            sb3.append('d');
            i = 1;
        } else {
            i = 0;
        }
        if (z5 || (z4 && (z6 || z7))) {
            int i5 = i + 1;
            if (i > 0) {
                sb3.append(' ');
            }
            sb3.append(iE);
            sb3.append('h');
            i = i5;
        }
        if (z6 || (z7 && (z5 || z4))) {
            int i6 = i + 1;
            if (i > 0) {
                sb3.append(' ');
            }
            sb3.append(iE2);
            sb3.append('m');
            i = i6;
        }
        if (z7) {
            int i7 = i + 1;
            if (i > 0) {
                sb3.append(' ');
            }
            if (iE3 != 0 || z4 || z5 || z6) {
                sb = sb3;
                i2 = 9;
                str = "s";
                z2 = false;
                sb2 = sb;
                i3 = iE3;
            } else if (iC >= 1000000) {
                i3 = iC / 1000000;
                iC %= 1000000;
                i2 = 6;
                str = "ms";
                sb2 = sb3;
                sb = sb3;
                z2 = false;
            } else {
                sb = sb3;
                if (iC >= 1000) {
                    i3 = iC / 1000;
                    iC %= 1000;
                    i2 = 3;
                    str = "us";
                    z2 = false;
                    sb2 = sb;
                } else {
                    sb.append(iC);
                    sb.append("ns");
                    i = i7;
                }
            }
            a(sb2, i3, iC, i2, str, z2);
            i = i7;
        } else {
            sb = sb3;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
