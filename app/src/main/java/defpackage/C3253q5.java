package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: q5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3253q5 extends AbstractC3525v7 {
    public final List a;

    public C3253q5(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3525v7)) {
            return false;
        }
        return this.a.equals(((C3253q5) ((AbstractC3525v7) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
