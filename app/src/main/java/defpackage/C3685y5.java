package defpackage;

/* renamed from: y5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3685y5 extends AbstractC3004ld {
    public final String a;
    public final String b;
    public final String c;

    public C3685y5(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3004ld)) {
            return false;
        }
        AbstractC3004ld abstractC3004ld = (AbstractC3004ld) obj;
        if (this.a.equals(((C3685y5) abstractC3004ld).a)) {
            C3685y5 c3685y5 = (C3685y5) abstractC3004ld;
            if (this.b.equals(c3685y5.b) && this.c.equals(c3685y5.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.a);
        sb.append(", libraryName=");
        sb.append(this.b);
        sb.append(", buildId=");
        return AbstractC3264qG.l(sb, this.c, "}");
    }
}
