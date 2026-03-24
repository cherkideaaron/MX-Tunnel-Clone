package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* renamed from: pw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3243pw {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3243pw)) {
            return false;
        }
        C3243pw c3243pw = (C3243pw) obj;
        return this.a == c3243pw.a && this.b == c3243pw.b && this.c == c3243pw.c && this.d == c3243pw.d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        boolean z = this.b;
        ?? r1 = this.a;
        int i = r1;
        if (z) {
            i = r1 + 16;
        }
        int i2 = i;
        if (this.c) {
            i2 = i + UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        return this.d ? i2 + 4096 : i2;
    }

    public final String toString() {
        return "[ Connected=" + this.a + " Validated=" + this.b + " Metered=" + this.c + " NotRoaming=" + this.d + " ]";
    }
}
