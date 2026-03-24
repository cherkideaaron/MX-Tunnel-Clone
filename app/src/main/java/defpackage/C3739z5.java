package defpackage;

/* renamed from: z5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3739z5 extends AbstractC3114nd {
    public final String a;
    public final String b;

    public C3739z5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3114nd)) {
            return false;
        }
        AbstractC3114nd abstractC3114nd = (AbstractC3114nd) obj;
        return this.a.equals(((C3739z5) abstractC3114nd).a) && this.b.equals(((C3739z5) abstractC3114nd).b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.a);
        sb.append(", value=");
        return AbstractC3264qG.l(sb, this.b, "}");
    }
}
