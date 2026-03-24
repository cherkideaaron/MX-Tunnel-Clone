package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: m6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3034m6 {
    public final String a;
    public final List b;

    public C3034m6(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3034m6)) {
            return false;
        }
        C3034m6 c3034m6 = (C3034m6) obj;
        return this.a.equals(c3034m6.a) && this.b.equals(c3034m6.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
