package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: e7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2597e7 {
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final byte[] e;

    public C2597e7(String str, char[] cArr) {
        byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (!(c < 128)) {
                throw new IllegalArgumentException(AbstractC3296qu.I("Non-ASCII character: %s", Character.valueOf(c)));
            }
            if (!(bArr[c] == -1)) {
                throw new IllegalArgumentException(AbstractC3296qu.I("Duplicate character: %s", Character.valueOf(c)));
            }
            bArr[c] = (byte) i;
        }
        this.a = str;
        this.b = cArr;
        try {
            int iZ = AbstractC0136He.z(cArr.length, RoundingMode.UNNECESSARY);
            this.c = iZ;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZ);
            this.d = iZ >> iNumberOfTrailingZeros;
            this.e = bArr;
            boolean[] zArr = new boolean[1 << (3 - iNumberOfTrailingZeros)];
            for (int i2 = 0; i2 < this.d; i2++) {
                int i3 = i2 * 8;
                int i4 = this.c;
                RoundingMode roundingMode = RoundingMode.CEILING;
                roundingMode.getClass();
                if (i4 == 0) {
                    throw new ArithmeticException("/ by zero");
                }
                int i5 = i3 / i4;
                int i6 = i3 - (i4 * i5);
                if (i6 != 0) {
                    int i7 = ((i3 ^ i4) >> 31) | 1;
                    switch (AbstractC0232Mp.a[roundingMode.ordinal()]) {
                        case 1:
                            if (i6 != 0) {
                                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                            }
                            continue;
                        case 2:
                            break;
                        case 3:
                            if (i7 >= 0) {
                                continue;
                            }
                            break;
                        case 4:
                            break;
                        case 5:
                            if (i7 <= 0) {
                                continue;
                            }
                            break;
                        case 6:
                        case 7:
                        case 8:
                            int iAbs = Math.abs(i6);
                            int iAbs2 = iAbs - (Math.abs(i4) - iAbs);
                            if (iAbs2 != 0) {
                                if (iAbs2 <= 0) {
                                    break;
                                }
                            } else if (roundingMode != RoundingMode.HALF_UP) {
                                if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i5 & 1) != 0))) {
                                    break;
                                }
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                    i5 += i7;
                }
                zArr[i5] = true;
            }
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2597e7)) {
            return false;
        }
        C2597e7 c2597e7 = (C2597e7) obj;
        c2597e7.getClass();
        return Arrays.equals(this.b, c2597e7.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + 1237;
    }

    public final String toString() {
        return this.a;
    }
}
