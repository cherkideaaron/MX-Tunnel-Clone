package defpackage;

import java.util.Arrays;

/* renamed from: Gi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123Gi {
    public final C0174Ji a;
    public final byte[] b;

    public C0123Gi(C0174Ji c0174Ji, byte[] bArr) {
        if (c0174Ji == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = c0174Ji;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0123Gi)) {
            return false;
        }
        C0123Gi c0123Gi = (C0123Gi) obj;
        if (this.a.equals(c0123Gi.a)) {
            return Arrays.equals(this.b, c0123Gi.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
