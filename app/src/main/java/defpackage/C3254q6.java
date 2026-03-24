package defpackage;

/* renamed from: q6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3254q6 {
    public final String a;
    public final String b;

    public C3254q6(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3254q6)) {
            return false;
        }
        C3254q6 c3254q6 = (C3254q6) obj;
        return this.a.equals(c3254q6.a) && this.b.equals(c3254q6.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return AbstractC3264qG.l(sb, this.b, "}");
    }
}
