package com.google.firebase.auth;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC3296qu;
import defpackage.B7;
import defpackage.C0036Bg;
import defpackage.C0285Qa;
import defpackage.C0302Ra;
import defpackage.C0319Sa;
import defpackage.C2811i1;
import defpackage.C3397so;
import defpackage.C3597wP;
import defpackage.C3663xk;
import defpackage.InterfaceC0385Vp;
import defpackage.InterfaceC0436Yp;
import defpackage.InterfaceC2729gb;
import defpackage.InterfaceC3258qA;
import defpackage.InterfaceC3451to;
import defpackage.InterfaceC3538vK;
import defpackage.KA;
import defpackage.Tr;
import defpackage.U6;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static FirebaseAuth lambda$getComponents$0(KA ka, KA ka2, KA ka3, KA ka4, KA ka5, InterfaceC2729gb interfaceC2729gb) {
        C3663xk c3663xk = (C3663xk) interfaceC2729gb.a(C3663xk.class);
        InterfaceC3258qA interfaceC3258qAC = interfaceC2729gb.c(InterfaceC0436Yp.class);
        InterfaceC3258qA interfaceC3258qAC2 = interfaceC2729gb.c(InterfaceC3451to.class);
        return new C3597wP(c3663xk, interfaceC3258qAC, interfaceC3258qAC2, (Executor) interfaceC2729gb.g(ka2), (Executor) interfaceC2729gb.g(ka3), (ScheduledExecutorService) interfaceC2729gb.g(ka4), (Executor) interfaceC2729gb.g(ka5));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C0319Sa> getComponents() {
        int i = 0;
        KA ka = new KA(U6.class, Executor.class);
        KA ka2 = new KA(B7.class, Executor.class);
        KA ka3 = new KA(Tr.class, Executor.class);
        KA ka4 = new KA(Tr.class, ScheduledExecutorService.class);
        KA ka5 = new KA(InterfaceC3538vK.class, Executor.class);
        C0302Ra c0302Ra = new C0302Ra(FirebaseAuth.class, new Class[]{InterfaceC0385Vp.class});
        c0302Ra.a(C0036Bg.c(C3663xk.class));
        c0302Ra.a(new C0036Bg(1, 1, InterfaceC3451to.class));
        c0302Ra.a(new C0036Bg(ka, 1, 0));
        c0302Ra.a(new C0036Bg(ka2, 1, 0));
        c0302Ra.a(new C0036Bg(ka3, 1, 0));
        c0302Ra.a(new C0036Bg(ka4, 1, 0));
        c0302Ra.a(new C0036Bg(ka5, 1, 0));
        c0302Ra.a(C0036Bg.a(InterfaceC0436Yp.class));
        C2811i1 c2811i1 = new C2811i1();
        c2811i1.a = ka;
        c2811i1.b = ka2;
        c2811i1.c = ka3;
        c2811i1.d = ka4;
        c2811i1.e = ka5;
        c0302Ra.f = c2811i1;
        C0319Sa c0319SaB = c0302Ra.b();
        C3397so c3397so = new C3397so(i);
        C0302Ra c0302RaB = C0319Sa.b(C3397so.class);
        c0302RaB.e = 1;
        c0302RaB.f = new C0285Qa(c3397so, i);
        return Arrays.asList(c0319SaB, c0302RaB.b(), AbstractC3296qu.l("fire-auth", "24.0.1"));
    }
}
