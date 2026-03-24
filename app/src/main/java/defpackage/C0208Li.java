package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: Li, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208Li {
    public final byte[] a;
    public final String b;
    public final byte[] c;

    public C0208Li(byte[] bArr, String str, byte[] bArr2) {
        this.a = bArr;
        this.b = str;
        this.c = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0208Li)) {
            return false;
        }
        C0208Li c0208Li = (C0208Li) obj;
        return Arrays.equals(this.a, c0208Li.a) && this.b.contentEquals(c0208Li.b) && Arrays.equals(this.c, c0208Li.c);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.a)), this.b, Integer.valueOf(Arrays.hashCode(this.c)));
    }

    public final String toString() {
        return AbstractC3264qG.w("EncryptedTopic { ", "EncryptedTopic=" + CH.X(this.a) + ", KeyIdentifier=" + this.b + ", EncapsulatedKey=" + CH.X(this.c) + " }");
    }
}
