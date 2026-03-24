package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class A5 extends AbstractC3224pd {
    public final List a;
    public final String b;

    public A5(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3224pd)) {
            return false;
        }
        AbstractC3224pd abstractC3224pd = (AbstractC3224pd) obj;
        if (this.a.equals(((A5) abstractC3224pd).a)) {
            String str = this.b;
            String str2 = ((A5) abstractC3224pd).b;
            if (str == null) {
                if (str2 == null) {
                    return true;
                }
            } else if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        return AbstractC3264qG.l(sb, this.b, "}");
    }
}
