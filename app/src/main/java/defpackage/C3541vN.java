package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: vN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3541vN extends C3433tN {
    public C3541vN(AN an, WindowInsets windowInsets) {
        super(an, windowInsets);
    }

    @Override // defpackage.C3703yN
    public AN a() {
        return AN.g(null, this.c.consumeDisplayCutout());
    }

    @Override // defpackage.C3703yN
    public C2571dh e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C2571dh(displayCutout);
    }

    @Override // defpackage.AbstractC3379sN, defpackage.C3703yN
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3541vN)) {
            return false;
        }
        C3541vN c3541vN = (C3541vN) obj;
        return Objects.equals(this.c, c3541vN.c) && Objects.equals(this.g, c3541vN.g);
    }

    @Override // defpackage.C3703yN
    public int hashCode() {
        return this.c.hashCode();
    }
}
