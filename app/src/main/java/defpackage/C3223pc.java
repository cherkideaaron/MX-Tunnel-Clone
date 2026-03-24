package defpackage;

import java.util.HashSet;

/* renamed from: pc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3223pc {
    public final HashSet a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3223pc.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((C3223pc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
