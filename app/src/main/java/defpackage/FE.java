package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class FE {

    @NotNull
    public static final EE Companion = new EE();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public /* synthetic */ FE(long j, String str, int i, int i2, String str2) {
        if (15 != (i & 15)) {
            AbstractC2883jK.O(i, 15, DE.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FE)) {
            return false;
        }
        FE fe = (FE) obj;
        return AbstractC0500aq.b(this.a, fe.a) && AbstractC0500aq.b(this.b, fe.b) && this.c == fe.c && this.d == fe.d;
    }

    public final int hashCode() {
        int iHashCode = (((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + this.c) * 31;
        long j = this.d;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public FE(long j, String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }
}
