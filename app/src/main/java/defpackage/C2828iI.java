package defpackage;

/* renamed from: iI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2828iI {
    public final String a;
    public final int b;

    public C2828iI(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2828iI)) {
            return false;
        }
        C2828iI c2828iI = (C2828iI) obj;
        if (this.b != c2828iI.b) {
            return false;
        }
        return this.a.equals(c2828iI.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
