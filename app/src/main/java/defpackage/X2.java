package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class X2 extends AbstractViewOnTouchListenerC2576dm {
    public final /* synthetic */ C2593e3 p;
    public final /* synthetic */ C2758h3 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X2(C2758h3 c2758h3, View view, C2593e3 c2593e3) {
        super(view);
        this.q = c2758h3;
        this.p = c2593e3;
    }

    @Override // defpackage.AbstractViewOnTouchListenerC2576dm
    public final RF b() {
        return this.p;
    }

    @Override // defpackage.AbstractViewOnTouchListenerC2576dm
    public final boolean c() {
        C2758h3 c2758h3 = this.q;
        if (c2758h3.getInternalPopup().b()) {
            return true;
        }
        c2758h3.f.m(c2758h3.getTextDirection(), c2758h3.getTextAlignment());
        return true;
    }
}
