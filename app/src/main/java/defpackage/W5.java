package defpackage;

/* loaded from: classes2.dex */
public final class W5 extends AbstractC0050Cd {
    public final String a;

    public W5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0050Cd)) {
            return false;
        }
        return this.a.equals(((W5) ((AbstractC0050Cd) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC3264qG.l(new StringBuilder("Log{content="), this.a, "}");
    }
}
