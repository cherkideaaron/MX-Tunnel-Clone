package defpackage;

/* renamed from: Ji, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174Ji {
    public final String a;

    public C0174Ji(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0174Ji)) {
            return false;
        }
        return this.a.equals(((C0174Ji) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC3264qG.l(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
