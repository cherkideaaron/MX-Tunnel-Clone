package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC3296qu;
import defpackage.Ar;
import defpackage.C0036Bg;
import defpackage.C0302Ra;
import defpackage.C0319Sa;
import defpackage.C0573c8;
import defpackage.C2610eK;
import defpackage.InterfaceC0531bK;
import defpackage.InterfaceC2729gb;
import defpackage.KA;
import defpackage.LH;
import defpackage.ZJ;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC0531bK lambda$getComponents$0(InterfaceC2729gb interfaceC2729gb) {
        C2610eK.b((Context) interfaceC2729gb.a(Context.class));
        return C2610eK.a().c(C0573c8.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC0531bK lambda$getComponents$1(InterfaceC2729gb interfaceC2729gb) {
        C2610eK.b((Context) interfaceC2729gb.a(Context.class));
        return C2610eK.a().c(C0573c8.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC0531bK lambda$getComponents$2(InterfaceC2729gb interfaceC2729gb) {
        C2610eK.b((Context) interfaceC2729gb.a(Context.class));
        return C2610eK.a().c(C0573c8.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0319Sa> getComponents() {
        C0302Ra c0302RaB = C0319Sa.b(InterfaceC0531bK.class);
        c0302RaB.a = LIBRARY_NAME;
        c0302RaB.a(C0036Bg.c(Context.class));
        c0302RaB.f = new LH(8);
        C0319Sa c0319SaB = c0302RaB.b();
        C0302Ra c0302RaA = C0319Sa.a(new KA(Ar.class, InterfaceC0531bK.class));
        c0302RaA.a(C0036Bg.c(Context.class));
        c0302RaA.f = new LH(9);
        C0319Sa c0319SaB2 = c0302RaA.b();
        C0302Ra c0302RaA2 = C0319Sa.a(new KA(ZJ.class, InterfaceC0531bK.class));
        c0302RaA2.a(C0036Bg.c(Context.class));
        c0302RaA2.f = new LH(10);
        return Arrays.asList(c0319SaB, c0319SaB2, c0302RaA2.b(), AbstractC3296qu.l(LIBRARY_NAME, "19.0.0"));
    }
}
