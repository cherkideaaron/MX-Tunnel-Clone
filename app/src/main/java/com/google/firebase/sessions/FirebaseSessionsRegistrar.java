package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC0219Mc;
import defpackage.AbstractC0500aq;
import defpackage.AbstractC3296qu;
import defpackage.AbstractC3437ta;
import defpackage.B7;
import defpackage.C0036Bg;
import defpackage.C0215Lp;
import defpackage.C0220Md;
import defpackage.C0302Ra;
import defpackage.C0319Sa;
import defpackage.C0390Wd;
import defpackage.C0397Wk;
import defpackage.C0412Xi;
import defpackage.C0495al;
import defpackage.C2570dg;
import defpackage.C2629el;
import defpackage.C2684fl;
import defpackage.C2737gj;
import defpackage.C2790hh;
import defpackage.C3112nb;
import defpackage.C3663xk;
import defpackage.C3711ye;
import defpackage.InterfaceC0168Jc;
import defpackage.InterfaceC0227Mk;
import defpackage.InterfaceC0448Zk;
import defpackage.InterfaceC0531bK;
import defpackage.InterfaceC2729gb;
import defpackage.InterfaceC3148oA;
import defpackage.InterfaceC3258qA;
import defpackage.KA;
import defpackage.U6;
import java.util.List;
import org.jetbrains.annotations.NotNull;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    @NotNull
    public static final String LIBRARY_NAME = "fire-sessions";

    @NotNull
    private static final C2629el Companion = new C2629el();

    @NotNull
    private static final KA appContext = KA.a(Context.class);

    @NotNull
    private static final KA firebaseApp = KA.a(C3663xk.class);

    @NotNull
    private static final KA firebaseInstallationsApi = KA.a(InterfaceC0227Mk.class);

    @NotNull
    private static final KA backgroundDispatcher = new KA(U6.class, AbstractC0219Mc.class);

    @NotNull
    private static final KA blockingDispatcher = new KA(B7.class, AbstractC0219Mc.class);

    @NotNull
    private static final KA transportFactory = KA.a(InterfaceC0531bK.class);

    @NotNull
    private static final KA firebaseSessionsComponent = KA.a(InterfaceC0448Zk.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0397Wk getComponents$lambda$0(InterfaceC2729gb interfaceC2729gb) {
        return (C0397Wk) ((C3711ye) ((InterfaceC0448Zk) interfaceC2729gb.g(firebaseSessionsComponent))).p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC0448Zk getComponents$lambda$1(InterfaceC2729gb interfaceC2729gb) {
        Object objG = interfaceC2729gb.g(appContext);
        AbstractC0500aq.l(objG, "get(...)");
        Object objG2 = interfaceC2729gb.g(backgroundDispatcher);
        AbstractC0500aq.l(objG2, "get(...)");
        Object objG3 = interfaceC2729gb.g(blockingDispatcher);
        AbstractC0500aq.l(objG3, "get(...)");
        Object objG4 = interfaceC2729gb.g(firebaseApp);
        AbstractC0500aq.l(objG4, "get(...)");
        Object objG5 = interfaceC2729gb.g(firebaseInstallationsApi);
        AbstractC0500aq.l(objG5, "get(...)");
        InterfaceC3258qA interfaceC3258qAF = interfaceC2729gb.f(transportFactory);
        AbstractC0500aq.l(interfaceC3258qAF, "getProvider(...)");
        C3711ye c3711ye = new C3711ye();
        c3711ye.a = C0215Lp.a((C3663xk) objG4);
        C0215Lp c0215LpA = C0215Lp.a((Context) objG);
        c3711ye.b = c0215LpA;
        c3711ye.c = C2790hh.a(new C2737gj(c0215LpA, 2));
        c3711ye.d = C2790hh.a(AbstractC0500aq.d);
        c3711ye.e = C0215Lp.a((InterfaceC0227Mk) objG5);
        c3711ye.f = C2790hh.a(new C2737gj(c3711ye.a, 1));
        C0215Lp c0215LpA2 = C0215Lp.a((InterfaceC0168Jc) objG3);
        c3711ye.g = c0215LpA2;
        c3711ye.h = C2790hh.a(new C0495al(c3711ye.f, c0215LpA2, 3));
        c3711ye.i = C0215Lp.a((InterfaceC0168Jc) objG2);
        c3711ye.j = C2790hh.a(new C0495al(c3711ye.c, C2790hh.a(new C2570dg(c3711ye.d, c3711ye.e, c3711ye.f, c3711ye.h, C2790hh.a(new C0390Wd(c3711ye.i, c3711ye.d, C2790hh.a(new C0495al(c3711ye.b, c3711ye.g, 0)), 3)), 1)), 5));
        InterfaceC3148oA interfaceC3148oAA = C2790hh.a(AbstractC3296qu.c);
        c3711ye.k = interfaceC3148oAA;
        c3711ye.l = C2790hh.a(new C0495al(c3711ye.d, interfaceC3148oAA, 4));
        c3711ye.m = C2790hh.a(new C2570dg(c3711ye.a, c3711ye.e, c3711ye.j, C2790hh.a(new C0412Xi(C0215Lp.a(interfaceC3258qAF), 0)), c3711ye.i, 3));
        c3711ye.n = C2790hh.a(new C0390Wd(c3711ye.b, c3711ye.g, C2790hh.a(new C0412Xi(c3711ye.l, 2)), 1));
        InterfaceC3148oA interfaceC3148oAA2 = C2790hh.a(new C3112nb(c3711ye.j, c3711ye.l, c3711ye.m, c3711ye.d, c3711ye.n, C2790hh.a(new C0495al(c3711ye.b, c3711ye.k, 2)), c3711ye.i));
        c3711ye.o = interfaceC3148oAA2;
        c3711ye.p = C2790hh.a(new C2684fl(c3711ye.a, c3711ye.j, c3711ye.i, C2790hh.a(new C2737gj(interfaceC3148oAA2, 3))));
        return c3711ye;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<C0319Sa> getComponents() {
        C0302Ra c0302RaB = C0319Sa.b(C0397Wk.class);
        c0302RaB.a = LIBRARY_NAME;
        c0302RaB.a(C0036Bg.b(firebaseSessionsComponent));
        c0302RaB.f = new C0220Md(22);
        c0302RaB.c(2);
        C0319Sa c0319SaB = c0302RaB.b();
        C0302Ra c0302RaB2 = C0319Sa.b(InterfaceC0448Zk.class);
        c0302RaB2.a = "fire-sessions-component";
        c0302RaB2.a(C0036Bg.b(appContext));
        c0302RaB2.a(C0036Bg.b(backgroundDispatcher));
        c0302RaB2.a(C0036Bg.b(blockingDispatcher));
        c0302RaB2.a(C0036Bg.b(firebaseApp));
        c0302RaB2.a(C0036Bg.b(firebaseInstallationsApi));
        c0302RaB2.a(new C0036Bg(transportFactory, 1, 1));
        c0302RaB2.f = new C0220Md(23);
        return AbstractC3437ta.Y(c0319SaB, c0302RaB2.b(), AbstractC3296qu.l(LIBRARY_NAME, "3.0.4"));
    }
}
