package defpackage;

/* renamed from: uJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3483uJ {
    public final long a;
    public final long b;
    public final int c;

    public C3483uJ(long j, long j2, int i) {
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3483uJ)) {
            return false;
        }
        C3483uJ c3483uJ = (C3483uJ) obj;
        return this.a == c3483uJ.a && this.b == c3483uJ.b && this.c == c3483uJ.c;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return ((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.a);
        sb.append(", ModelVersion=");
        sb.append(this.b);
        sb.append(", TopicCode=");
        return AbstractC3264qG.w("Topic { ", AbstractC3264qG.j(sb, this.c, " }"));
    }
}
