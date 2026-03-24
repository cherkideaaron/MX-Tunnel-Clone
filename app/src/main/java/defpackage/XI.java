package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class XI {

    @NotNull
    public static final WI Companion = new WI();
    public final long a;
    public final long b;
    public final long c;

    public /* synthetic */ XI(int i, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            AbstractC2883jK.O(i, 1, VI.a.d());
            throw null;
        }
        this.a = j;
        this.b = (i & 2) == 0 ? 1000 * j : j2;
        if ((i & 4) == 0) {
            this.c = j / 1000;
        } else {
            this.c = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof XI) && this.a == ((XI) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "Time(ms=" + this.a + ')';
    }

    public XI(long j) {
        this.a = j;
        long j2 = 1000;
        this.b = j * j2;
        this.c = j / j2;
    }
}
