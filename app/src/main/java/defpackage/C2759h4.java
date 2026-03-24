package defpackage;

/* renamed from: h4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2759h4 implements InterfaceC2873jA {
    public final int a;

    public C2759h4(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC2873jA.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC2873jA)) {
            return false;
        }
        C2759h4 c2759h4 = (C2759h4) ((InterfaceC2873jA) obj);
        if (this.a == c2759h4.a) {
            Object obj2 = EnumC2820iA.a;
            c2759h4.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.a) + (EnumC2820iA.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + EnumC2820iA.a + ')';
    }
}
