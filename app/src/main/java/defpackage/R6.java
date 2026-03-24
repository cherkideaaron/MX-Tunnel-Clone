package defpackage;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class R6 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public R6(BackEvent backEvent) {
        AbstractC0500aq.m(backEvent, "backEvent");
        V1 v1 = V1.a;
        float fD = v1.d(backEvent);
        float fE = v1.e(backEvent);
        float fB = v1.b(backEvent);
        int iC = v1.c(backEvent);
        this.a = fD;
        this.b = fE;
        this.c = fB;
        this.d = iC;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}
