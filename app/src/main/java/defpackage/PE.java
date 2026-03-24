package defpackage;

/* loaded from: classes2.dex */
public final class PE {
    public final String a;

    public PE(String str) {
        AbstractC0500aq.m(str, "sessionId");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PE) && AbstractC0500aq.b(this.a, ((PE) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ')';
    }
}
