package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ZB implements InterfaceC0100Fc {
    public final float a;

    public ZB(float f) {
        this.a = f;
    }

    @Override // defpackage.InterfaceC0100Fc
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZB) && this.a == ((ZB) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        return AbstractC3264qG.j(new StringBuilder(), (int) (this.a * 100.0f), "%");
    }
}
