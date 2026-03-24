package defpackage;

import java.util.List;

/* renamed from: rI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3320rI {
    public final String a;
    public final boolean b;
    public final List c;

    public C3320rI(List list, String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3320rI.class != obj.getClass()) {
            return false;
        }
        C3320rI c3320rI = (C3320rI) obj;
        if (this.b != c3320rI.b || !this.c.equals(c3320rI.c)) {
            return false;
        }
        String str = this.a;
        boolean zStartsWith = str.startsWith("index_");
        String str2 = c3320rI.a;
        return zStartsWith ? str2.startsWith("index_") : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.a + "', unique=" + this.b + ", columns=" + this.c + '}';
    }
}
