package defpackage;

import java.util.Objects;

/* renamed from: h7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2762h7 {
    public static final C2707g7 c = new C2707g7("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    public final C2597e7 a;
    public final Character b;

    static {
        new C2707g7("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new C2762h7("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new C2762h7("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        new C2652f7(new C2597e7("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public C2762h7(C2597e7 c2597e7, Character ch) {
        c2597e7.getClass();
        this.a = c2597e7;
        if (ch != null) {
            char cCharValue = ch.charValue();
            byte[] bArr = c2597e7.e;
            if (cCharValue < bArr.length && bArr[cCharValue] != -1) {
                throw new IllegalArgumentException(AbstractC3296qu.I("Padding character %s was already in alphabet", ch));
            }
        }
        this.b = ch;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2762h7)) {
            return false;
        }
        C2762h7 c2762h7 = (C2762h7) obj;
        return this.a.equals(c2762h7.a) && Objects.equals(this.b, c2762h7.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ Objects.hashCode(this.b);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        C2597e7 c2597e7 = this.a;
        sb.append(c2597e7);
        if (8 % c2597e7.c != 0) {
            Character ch = this.b;
            if (ch == null) {
                str = ".omitPadding()";
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                str = "')";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public C2762h7(String str, String str2) {
        this(new C2597e7(str, str2.toCharArray()), (Character) '=');
    }
}
