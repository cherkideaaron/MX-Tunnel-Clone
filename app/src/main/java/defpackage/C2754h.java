package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2754h implements InterfaceC0100Fc {
    public final float a;

    public C2754h(float f) {
        this.a = f;
    }

    @Override // defpackage.InterfaceC0100Fc
    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2754h) && this.a == ((C2754h) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        return this.a + "px";
    }
}
