package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: j1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2864j1 implements InterfaceC0100Fc {
    public final InterfaceC0100Fc a;
    public final float b;

    public C2864j1(float f, InterfaceC0100Fc interfaceC0100Fc) {
        while (interfaceC0100Fc instanceof C2864j1) {
            interfaceC0100Fc = ((C2864j1) interfaceC0100Fc).a;
            f += ((C2864j1) interfaceC0100Fc).b;
        }
        this.a = interfaceC0100Fc;
        this.b = f;
    }

    @Override // defpackage.InterfaceC0100Fc
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2864j1)) {
            return false;
        }
        C2864j1 c2864j1 = (C2864j1) obj;
        return this.a.equals(c2864j1.a) && this.b == c2864j1.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
