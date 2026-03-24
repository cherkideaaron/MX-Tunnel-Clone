package defpackage;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Xw {
    public static final Xw a = new Xw();

    @NotNull
    public final OnBackInvokedCallback a(@NotNull InterfaceC0606cn interfaceC0606cn) {
        AbstractC0500aq.m(interfaceC0606cn, "onBackInvoked");
        return new C3628x2(interfaceC0606cn, 1);
    }

    public final void b(@NotNull Object obj, int i, @NotNull Object obj2) {
        AbstractC0500aq.m(obj, "dispatcher");
        AbstractC0500aq.m(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(@NotNull Object obj, @NotNull Object obj2) {
        AbstractC0500aq.m(obj, "dispatcher");
        AbstractC0500aq.m(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
