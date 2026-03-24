package defpackage;

/* renamed from: l9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2982l9 {
    public static final char[] a = new char[117];
    public static final byte[] b = new byte[126];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            a(i2, 'u');
        }
        a(8, 'b');
        a(9, 't');
        a(10, 'n');
        a(12, 'f');
        a(13, 'r');
        a(47, '/');
        a(34, '\"');
        a(92, '\\');
        while (true) {
            byte[] bArr = b;
            if (i >= 33) {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
            bArr[i] = 127;
            i++;
        }
    }

    public static void a(int i, char c) {
        if (c != 'u') {
            a[c] = (char) i;
        }
    }
}
