package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3083n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarOverlayLayout b;

    public /* synthetic */ RunnableC3083n0(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.a = i;
        this.b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.C = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.D);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.C = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.D);
                break;
        }
    }
}
