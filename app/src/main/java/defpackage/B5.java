package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class B5 extends AbstractC3169od {
    public final String a;
    public final byte[] b;

    public B5(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3169od)) {
            return false;
        }
        AbstractC3169od abstractC3169od = (AbstractC3169od) obj;
        if (this.a.equals(((B5) abstractC3169od).a)) {
            if (Arrays.equals(this.b, (abstractC3169od instanceof B5 ? (B5) abstractC3169od : (B5) abstractC3169od).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
