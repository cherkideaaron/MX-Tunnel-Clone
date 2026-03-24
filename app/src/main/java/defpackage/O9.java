package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class O9 implements InterfaceC0100Fc {
    public final float a;

    public O9(float f) {
        this.a = f;
    }

    @Override // defpackage.InterfaceC0100Fc
    public final float a(RectF rectF) {
        float fMin = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f = this.a;
        if (f < 0.0f) {
            return 0.0f;
        }
        return f > fMin ? fMin : f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof O9) && this.a == ((O9) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
