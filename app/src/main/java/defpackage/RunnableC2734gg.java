package defpackage;

import android.view.View;
import androidx.fragment.app.l;
import androidx.fragment.app.z;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: gg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2734gg implements Runnable {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final Object c;
    public final Object d;

    public RunnableC2734gg(Qr qr, Hr hr) {
        AbstractC0500aq.m(qr, "registry");
        AbstractC0500aq.m(hr, "event");
        this.c = qr;
        this.d = hr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2827iH c2827iH;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (this.a) {
            case 0:
                l lVar = ((z) obj).c;
                l lVar2 = ((z) obj2).c;
                C0229Mm c0229Mm = AbstractC0144Hm.a;
                if (!this.b) {
                    lVar.getEnterTransitionCallback();
                    break;
                } else {
                    lVar2.getEnterTransitionCallback();
                    break;
                }
            case 1:
                if (!this.b) {
                    ((Qr) obj).e((Hr) obj2);
                    this.b = true;
                    break;
                }
                break;
            default:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj2;
                WL wl = swipeDismissBehavior.a;
                View view = (View) obj;
                if (wl != null && wl.g()) {
                    view.postOnAnimation(this);
                    break;
                } else if (this.b && (c2827iH = swipeDismissBehavior.b) != null) {
                    c2827iH.y(view);
                    break;
                }
                break;
        }
    }

    public RunnableC2734gg(z zVar, z zVar2, boolean z, Z3 z3) {
        this.c = zVar;
        this.d = zVar2;
        this.b = z;
    }

    public RunnableC2734gg(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.d = swipeDismissBehavior;
        this.c = view;
        this.b = z;
    }
}
