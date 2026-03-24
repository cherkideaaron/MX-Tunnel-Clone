package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class Yw implements OnBackAnimationCallback {
    public final /* synthetic */ InterfaceC2631en a;
    public final /* synthetic */ InterfaceC2631en b;
    public final /* synthetic */ InterfaceC0606cn c;
    public final /* synthetic */ InterfaceC0606cn d;

    public Yw(InterfaceC2631en interfaceC2631en, InterfaceC2631en interfaceC2631en2, InterfaceC0606cn interfaceC0606cn, InterfaceC0606cn interfaceC0606cn2) {
        this.a = interfaceC2631en;
        this.b = interfaceC2631en2;
        this.c = interfaceC0606cn;
        this.d = interfaceC0606cn2;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC0500aq.m(backEvent, "backEvent");
        this.b.invoke(new R6(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC0500aq.m(backEvent, "backEvent");
        this.a.invoke(new R6(backEvent));
    }
}
