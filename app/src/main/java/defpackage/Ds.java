package defpackage;

/* loaded from: classes.dex */
public final class Ds extends Es {
    public final C0051Ce a;

    public Ds(C0051Ce c0051Ce) {
        this.a = c0051Ce;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Ds.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((Ds) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Ds.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
