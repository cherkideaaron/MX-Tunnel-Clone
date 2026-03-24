package defpackage;

import java.util.Locale;

/* renamed from: oI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3156oI {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public final int e;
    public final String f;
    public final int g;

    public C3156oI(int i, String str, String str2, String str3, boolean z, int i2) {
        this.a = str;
        this.b = str2;
        this.d = z;
        this.e = i;
        int i3 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i3 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i3 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.c = i3;
        this.f = str3;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3156oI.class != obj.getClass()) {
            return false;
        }
        C3156oI c3156oI = (C3156oI) obj;
        if (this.e != c3156oI.e || !this.a.equals(c3156oI.a) || this.d != c3156oI.d) {
            return false;
        }
        String str = this.f;
        int i = this.g;
        int i2 = c3156oI.g;
        String str2 = c3156oI.f;
        if (i == 1 && i2 == 2 && str != null && !str.equals(str2)) {
            return false;
        }
        if (i != 2 || i2 != 1 || str2 == null || str2.equals(str)) {
            return (i == 0 || i != i2 || (str == null ? str2 == null : str.equals(str2))) && this.c == c3156oI.c;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.c) * 31) + (this.d ? 1231 : 1237)) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.a);
        sb.append("', type='");
        sb.append(this.b);
        sb.append("', affinity='");
        sb.append(this.c);
        sb.append("', notNull=");
        sb.append(this.d);
        sb.append(", primaryKeyPosition=");
        sb.append(this.e);
        sb.append(", defaultValue='");
        return AbstractC3264qG.l(sb, this.f, "'}");
    }
}
