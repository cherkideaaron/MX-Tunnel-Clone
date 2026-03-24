package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* renamed from: dN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2559dN extends AbstractC3296qu {
    public final /* synthetic */ int j;
    public final /* synthetic */ C2668fN k;

    public /* synthetic */ C2559dN(C2668fN c2668fN, int i) {
        this.j = i;
        this.k = c2668fN;
    }

    @Override // defpackage.InterfaceC2940kM
    public final void c() {
        View view;
        C2668fN c2668fN = this.k;
        switch (this.j) {
            case 0:
                if (c2668fN.A && (view = c2668fN.s) != null) {
                    view.setTranslationY(0.0f);
                    c2668fN.p.setTranslationY(0.0f);
                }
                c2668fN.p.setVisibility(8);
                c2668fN.p.setTransitioning(false);
                c2668fN.E = null;
                E0 e0 = c2668fN.w;
                if (e0 != null) {
                    e0.c(c2668fN.v);
                    c2668fN.v = null;
                    c2668fN.w = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c2668fN.o;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = UL.a;
                    KL.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                c2668fN.E = null;
                c2668fN.p.requestLayout();
                break;
        }
    }
}
