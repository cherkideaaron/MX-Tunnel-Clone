package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC3296qu;
import defpackage.C0036Bg;
import defpackage.C0222Mf;
import defpackage.C0302Ra;
import defpackage.C0319Sa;
import defpackage.C3007lg;
import defpackage.C3663xk;
import defpackage.GH;
import defpackage.InterfaceC0227Mk;
import defpackage.InterfaceC0261Ok;
import defpackage.InterfaceC0531bK;
import defpackage.InterfaceC2729gb;
import defpackage.InterfaceC3505uo;
import defpackage.KA;
import defpackage.Vs;
import defpackage.ZJ;
import java.util.Arrays;
import java.util.List;

@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(KA ka, InterfaceC2729gb interfaceC2729gb) {
        C3663xk c3663xk = (C3663xk) interfaceC2729gb.a(C3663xk.class);
        Vs.u(interfaceC2729gb.a(InterfaceC0261Ok.class));
        return new FirebaseMessaging(c3663xk, interfaceC2729gb.c(C3007lg.class), interfaceC2729gb.c(InterfaceC3505uo.class), (InterfaceC0227Mk) interfaceC2729gb.a(InterfaceC0227Mk.class), interfaceC2729gb.f(ka), (GH) interfaceC2729gb.a(GH.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C0319Sa> getComponents() {
        KA ka = new KA(ZJ.class, InterfaceC0531bK.class);
        C0302Ra c0302RaB = C0319Sa.b(FirebaseMessaging.class);
        c0302RaB.a = LIBRARY_NAME;
        c0302RaB.a(C0036Bg.c(C3663xk.class));
        c0302RaB.a(new C0036Bg(0, 0, InterfaceC0261Ok.class));
        c0302RaB.a(C0036Bg.a(C3007lg.class));
        c0302RaB.a(C0036Bg.a(InterfaceC3505uo.class));
        c0302RaB.a(C0036Bg.c(InterfaceC0227Mk.class));
        c0302RaB.a(new C0036Bg(ka, 0, 1));
        c0302RaB.a(C0036Bg.c(GH.class));
        c0302RaB.f = new C0222Mf(ka, 1);
        c0302RaB.c(1);
        return Arrays.asList(c0302RaB.b(), AbstractC3296qu.l(LIBRARY_NAME, "25.0.1"));
    }
}
