package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* renamed from: zj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3770zj extends Rw {
    public static final Sw d;
    public float b = 0.0f;
    public float c = 0.0f;

    static {
        Sw swA = Sw.a(UserVerificationMethods.USER_VERIFY_HANDPRINT, new C3770zj());
        d = swA;
        swA.f = 0.5f;
    }

    @Override // defpackage.Rw
    public final Rw a() {
        return new C3770zj();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3770zj)) {
            return false;
        }
        C3770zj c3770zj = (C3770zj) obj;
        return this.b == c3770zj.b && this.c == c3770zj.c;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) ^ Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return this.b + "x" + this.c;
    }
}
