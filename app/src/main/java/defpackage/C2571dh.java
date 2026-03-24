package defpackage;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: dh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2571dh {
    public final DisplayCutout a;

    public C2571dh(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2571dh.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((C2571dh) obj).a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
