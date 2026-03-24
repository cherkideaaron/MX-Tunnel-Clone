package defpackage;

/* renamed from: w6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3578w6 {
    public final long a;
    public final J6 b;
    public final C2761h6 c;

    public C3578w6(long j, J6 j6, C2761h6 c2761h6) {
        this.a = j;
        if (j6 == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = j6;
        this.c = c2761h6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3578w6)) {
            return false;
        }
        C3578w6 c3578w6 = (C3578w6) obj;
        return this.a == c3578w6.a && this.b.equals(c3578w6.b) && this.c.equals(c3578w6.c);
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
