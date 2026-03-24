package defpackage;

/* loaded from: classes.dex */
public final class Bs extends Es {
    public final C0051Ce a = C0051Ce.c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Bs.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((Bs) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Bs.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
