package defpackage;

import com.google.android.gms.common.internal.Objects;

/* renamed from: Wp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0402Wp {
    public String a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0402Wp) {
            return Objects.equal(this.a, ((C0402Wp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("token", this.a).toString();
    }
}
