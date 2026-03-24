package defpackage;

import android.window.OnBackInvokedCallback;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Zw {
    public static final Zw a = new Zw();

    @NotNull
    public final OnBackInvokedCallback a(@NotNull InterfaceC2631en interfaceC2631en, @NotNull InterfaceC2631en interfaceC2631en2, @NotNull InterfaceC0606cn interfaceC0606cn, @NotNull InterfaceC0606cn interfaceC0606cn2) {
        AbstractC0500aq.m(interfaceC2631en, "onBackStarted");
        AbstractC0500aq.m(interfaceC2631en2, "onBackProgressed");
        AbstractC0500aq.m(interfaceC0606cn, "onBackInvoked");
        AbstractC0500aq.m(interfaceC0606cn2, "onBackCancelled");
        return new Yw(interfaceC2631en, interfaceC2631en2, interfaceC0606cn, interfaceC0606cn2);
    }
}
