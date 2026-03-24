package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* renamed from: Zn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0451Zn {
    public final List a;
    public final List b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0451Zn(List list) {
        this(list, C0055Ci.a);
        AbstractC0500aq.m(list, "topics");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0451Zn)) {
            return false;
        }
        List list = this.a;
        C0451Zn c0451Zn = (C0451Zn) obj;
        if (list.size() == c0451Zn.a.size()) {
            List list2 = this.b;
            if (list2.size() == c0451Zn.b.size()) {
                return AbstractC0500aq.b(new HashSet(list), new HashSet(c0451Zn.a)) && AbstractC0500aq.b(new HashSet(list2), new HashSet(c0451Zn.b));
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return "GetTopicsResponse: Topics=" + this.a + ", EncryptedTopics=" + this.b;
    }

    public C0451Zn(List list, List list2) {
        AbstractC0500aq.m(list, "topics");
        this.a = list;
        this.b = list2;
    }
}
