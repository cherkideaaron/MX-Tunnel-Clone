package defpackage;

import java.util.List;

/* renamed from: a6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0462a6 extends AbstractC0101Fd {
    public final List a;

    public C0462a6(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0101Fd)) {
            return false;
        }
        return this.a.equals(((C0462a6) ((AbstractC0101Fd) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.a + "}";
    }
}
