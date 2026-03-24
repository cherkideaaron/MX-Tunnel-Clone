package defpackage;

import java.util.LinkedHashMap;

/* renamed from: Yd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0424Yd {
    public final LinkedHashMap a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC0424Yd) && AbstractC0500aq.b(this.a, ((AbstractC0424Yd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ')';
    }
}
