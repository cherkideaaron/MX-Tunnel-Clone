package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* renamed from: yC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3692yC {
    public final Resources a;
    public final Resources.Theme b;

    public C3692yC(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3692yC.class != obj.getClass()) {
            return false;
        }
        C3692yC c3692yC = (C3692yC) obj;
        return this.a.equals(c3692yC.a) && Objects.equals(this.b, c3692yC.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
