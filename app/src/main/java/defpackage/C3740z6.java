package defpackage;

/* renamed from: z6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3740z6 {
    public final Integer a;

    public C3740z6(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3740z6)) {
            return false;
        }
        C3740z6 c3740z6 = (C3740z6) obj;
        Integer num = this.a;
        return num == null ? c3740z6.a == null : num.equals(c3740z6.a);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.a + "}";
    }
}
