package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC3296qu;
import defpackage.C0036Bg;
import defpackage.C0220Md;
import defpackage.C0302Ra;
import defpackage.C0319Sa;
import defpackage.C0346Tk;
import defpackage.C2848il;
import defpackage.C3007lg;
import defpackage.C3663xk;
import defpackage.InterfaceC0385Vp;
import defpackage.InterfaceC0436Yp;
import defpackage.InterfaceC2729gb;
import defpackage.InterfaceC3505uo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class FirestoreRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    /* JADX INFO: Access modifiers changed from: private */
    public static C2848il lambda$getComponents$0(InterfaceC2729gb interfaceC2729gb) {
        C3663xk c3663xk = (C3663xk) interfaceC2729gb.a(C3663xk.class);
        interfaceC2729gb.h(InterfaceC0385Vp.class);
        interfaceC2729gb.h(InterfaceC0436Yp.class);
        interfaceC2729gb.c(C3007lg.class);
        interfaceC2729gb.c(InterfaceC3505uo.class);
        C2848il c2848il = new C2848il();
        new HashMap();
        c3663xk.a();
        Preconditions.checkNotNull(c2848il);
        c3663xk.j.add(c2848il);
        return c2848il;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C0319Sa> getComponents() {
        C0302Ra c0302RaB = C0319Sa.b(C2848il.class);
        c0302RaB.a = LIBRARY_NAME;
        c0302RaB.a(C0036Bg.c(C3663xk.class));
        c0302RaB.a(C0036Bg.c(Context.class));
        c0302RaB.a(C0036Bg.a(InterfaceC3505uo.class));
        c0302RaB.a(C0036Bg.a(C3007lg.class));
        c0302RaB.a(new C0036Bg(0, 2, InterfaceC0385Vp.class));
        c0302RaB.a(new C0036Bg(0, 2, InterfaceC0436Yp.class));
        c0302RaB.a(new C0036Bg(0, 0, C0346Tk.class));
        c0302RaB.f = new C0220Md(24);
        return Arrays.asList(c0302RaB.b(), AbstractC3296qu.l(LIBRARY_NAME, "26.1.0"));
    }
}
