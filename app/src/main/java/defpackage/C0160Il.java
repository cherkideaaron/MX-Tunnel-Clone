package defpackage;

import java.util.List;
import java.util.Objects;

/* renamed from: Il, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160Il {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0160Il)) {
            return false;
        }
        C0160Il c0160Il = (C0160Il) obj;
        return Objects.equals(this.a, c0160Il.a) && Objects.equals(this.b, c0160Il.b) && Objects.equals(this.c, c0160Il.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
