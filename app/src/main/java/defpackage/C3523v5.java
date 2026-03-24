package defpackage;

import java.io.File;

/* renamed from: v5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3523v5 {
    public final AbstractC0186Kd a;
    public final String b;
    public final File c;

    public C3523v5(C3469u5 c3469u5, String str, File file) {
        this.a = c3469u5;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3523v5)) {
            return false;
        }
        C3523v5 c3523v5 = (C3523v5) obj;
        return this.a.equals(c3523v5.a) && this.b.equals(c3523v5.b) && this.c.equals(c3523v5.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
