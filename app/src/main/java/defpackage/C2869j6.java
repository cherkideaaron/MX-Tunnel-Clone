package defpackage;

import java.util.Arrays;

/* renamed from: j6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2869j6 extends AbstractC3285qj {
    public final byte[] a;
    public final byte[] b;

    public C2869j6(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3285qj)) {
            return false;
        }
        AbstractC3285qj abstractC3285qj = (AbstractC3285qj) obj;
        boolean z = abstractC3285qj instanceof C2869j6;
        if (Arrays.equals(this.a, z ? ((C2869j6) abstractC3285qj).a : ((C2869j6) abstractC3285qj).a)) {
            if (Arrays.equals(this.b, z ? ((C2869j6) abstractC3285qj).b : ((C2869j6) abstractC3285qj).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
