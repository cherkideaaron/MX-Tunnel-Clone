package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: Yj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0430Yj {
    public final String a;
    public final Map b;

    public C0430Yj(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static C0430Yj a(String str) {
        return new C0430Yj(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0430Yj)) {
            return false;
        }
        C0430Yj c0430Yj = (C0430Yj) obj;
        return this.a.equals(c0430Yj.a) && this.b.equals(c0430Yj.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
