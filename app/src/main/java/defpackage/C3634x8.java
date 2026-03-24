package defpackage;

import android.graphics.Typeface;

/* renamed from: x8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3634x8 extends AbstractC0069Df {
    public final Typeface k;
    public final C2827iH l;
    public boolean m;

    public C3634x8(C2827iH c2827iH, Typeface typeface) {
        this.k = typeface;
        this.l = c2827iH;
    }

    @Override // defpackage.AbstractC0069Df
    public final void M(int i) {
        if (this.m) {
            return;
        }
        C3329ra c3329ra = (C3329ra) this.l.b;
        if (c3329ra.l(this.k)) {
            c3329ra.j(false);
        }
    }

    @Override // defpackage.AbstractC0069Df
    public final void N(Typeface typeface, boolean z) {
        if (this.m) {
            return;
        }
        C3329ra c3329ra = (C3329ra) this.l.b;
        if (c3329ra.l(typeface)) {
            c3329ra.j(false);
        }
    }
}
