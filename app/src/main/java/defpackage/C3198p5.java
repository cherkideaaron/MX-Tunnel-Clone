package defpackage;

/* renamed from: p5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3198p5 {
    public final int a;
    public final long b;

    public C3198p5(int i, long j) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3198p5)) {
            return false;
        }
        C3198p5 c3198p5 = (C3198p5) obj;
        return AbstractC3264qG.a(this.a, c3198p5.a) && this.b == c3198p5.b;
    }

    public final int hashCode() {
        int iA = (AbstractC3264qG.A(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return iA ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "BackendResponse{status=" + AbstractC3264qG.B(this.a) + ", nextRequestWaitMillis=" + this.b + "}";
    }
}
