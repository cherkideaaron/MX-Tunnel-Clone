package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC3296qu;
import defpackage.B7;
import defpackage.C0036Bg;
import defpackage.C0210Lk;
import defpackage.C0220Md;
import defpackage.C0285Qa;
import defpackage.C0302Ra;
import defpackage.C0319Sa;
import defpackage.C3397so;
import defpackage.C3663xk;
import defpackage.ExecutorC3152oE;
import defpackage.InterfaceC0227Mk;
import defpackage.InterfaceC2729gb;
import defpackage.InterfaceC3451to;
import defpackage.KA;
import defpackage.U6;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC0227Mk lambda$getComponents$0(InterfaceC2729gb interfaceC2729gb) {
        return new C0210Lk((C3663xk) interfaceC2729gb.a(C3663xk.class), interfaceC2729gb.c(InterfaceC3451to.class), (ExecutorService) interfaceC2729gb.g(new KA(U6.class, ExecutorService.class)), new ExecutorC3152oE((Executor) interfaceC2729gb.g(new KA(B7.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0319Sa> getComponents() {
        int i = 0;
        C0302Ra c0302RaB = C0319Sa.b(InterfaceC0227Mk.class);
        c0302RaB.a = LIBRARY_NAME;
        c0302RaB.a(C0036Bg.c(C3663xk.class));
        c0302RaB.a(C0036Bg.a(InterfaceC3451to.class));
        c0302RaB.a(new C0036Bg(new KA(U6.class, ExecutorService.class), 1, 0));
        c0302RaB.a(new C0036Bg(new KA(B7.class, Executor.class), 1, 0));
        c0302RaB.f = new C0220Md(20);
        C0319Sa c0319SaB = c0302RaB.b();
        C3397so c3397so = new C3397so(i);
        C0302Ra c0302RaB2 = C0319Sa.b(C3397so.class);
        c0302RaB2.e = 1;
        c0302RaB2.f = new C0285Qa(c3397so, i);
        return Arrays.asList(c0319SaB, c0302RaB2.b(), AbstractC3296qu.l(LIBRARY_NAME, "19.0.1"));
    }
}
