package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: pI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3211pI {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public C3211pI(String str, String str2, String str3, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3211pI.class != obj.getClass()) {
            return false;
        }
        C3211pI c3211pI = (C3211pI) obj;
        if (this.a.equals(c3211pI.a) && this.b.equals(c3211pI.b) && this.c.equals(c3211pI.c) && this.d.equals(c3211pI.d)) {
            return this.e.equals(c3211pI.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + "', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
    }
}
