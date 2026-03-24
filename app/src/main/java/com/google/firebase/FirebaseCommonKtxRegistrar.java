package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC0219Mc;
import defpackage.AbstractC3437ta;
import defpackage.B7;
import defpackage.C0036Bg;
import defpackage.C0108Fk;
import defpackage.C0302Ra;
import defpackage.C0319Sa;
import defpackage.C0360Uh;
import defpackage.C3397so;
import defpackage.InterfaceC3538vK;
import defpackage.KA;
import defpackage.Tr;
import defpackage.U6;
import java.util.List;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<C0319Sa> getComponents() {
        C0302Ra c0302RaA = C0319Sa.a(new KA(U6.class, AbstractC0219Mc.class));
        c0302RaA.a(new C0036Bg(new KA(U6.class, Executor.class), 1, 0));
        c0302RaA.f = C0108Fk.c;
        C0319Sa c0319SaB = c0302RaA.b();
        C0302Ra c0302RaA2 = C0319Sa.a(new KA(Tr.class, AbstractC0219Mc.class));
        c0302RaA2.a(new C0036Bg(new KA(Tr.class, Executor.class), 1, 0));
        c0302RaA2.f = C3397so.c;
        C0319Sa c0319SaB2 = c0302RaA2.b();
        C0302Ra c0302RaA3 = C0319Sa.a(new KA(B7.class, AbstractC0219Mc.class));
        c0302RaA3.a(new C0036Bg(new KA(B7.class, Executor.class), 1, 0));
        c0302RaA3.f = C0360Uh.d;
        C0319Sa c0319SaB3 = c0302RaA3.b();
        C0302Ra c0302RaA4 = C0319Sa.a(new KA(InterfaceC3538vK.class, AbstractC0219Mc.class));
        c0302RaA4.a(new C0036Bg(new KA(InterfaceC3538vK.class, Executor.class), 1, 0));
        c0302RaA4.f = C0108Fk.d;
        return AbstractC3437ta.Y(c0319SaB, c0319SaB2, c0319SaB3, c0302RaA4.b());
    }
}
