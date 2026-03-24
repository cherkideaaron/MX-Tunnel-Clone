package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC3296qu;
import defpackage.B7;
import defpackage.C0036Bg;
import defpackage.C0108Fk;
import defpackage.C0285Qa;
import defpackage.C0302Ra;
import defpackage.C0319Sa;
import defpackage.C0550bl;
import defpackage.C2575dl;
import defpackage.C2949kd;
import defpackage.C3663xk;
import defpackage.InterfaceC0227Mk;
import defpackage.InterfaceC0363Uk;
import defpackage.InterfaceC3411t1;
import defpackage.KA;
import defpackage.OE;
import defpackage.Tr;
import defpackage.U6;
import defpackage.Vv;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;
    public final KA a = new KA(U6.class, ExecutorService.class);
    public final KA b = new KA(B7.class, ExecutorService.class);
    public final KA c = new KA(Tr.class, ExecutorService.class);

    static {
        OE oe = OE.a;
        Map map = C2575dl.b;
        if (map.containsKey(oe)) {
            Log.d("FirebaseSessions", "Dependency " + oe + " already added.");
            return;
        }
        map.put(oe, new C0550bl(new Vv(true)));
        Log.d("FirebaseSessions", "Dependency to " + oe + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C0302Ra c0302RaB = C0319Sa.b(C0108Fk.class);
        c0302RaB.a = "fire-cls";
        c0302RaB.a(C0036Bg.c(C3663xk.class));
        c0302RaB.a(C0036Bg.c(InterfaceC0227Mk.class));
        c0302RaB.a(C0036Bg.b(this.a));
        c0302RaB.a(C0036Bg.b(this.b));
        c0302RaB.a(C0036Bg.b(this.c));
        c0302RaB.a(new C0036Bg(0, 2, C2949kd.class));
        c0302RaB.a(new C0036Bg(0, 2, InterfaceC3411t1.class));
        c0302RaB.a(new C0036Bg(0, 2, InterfaceC0363Uk.class));
        c0302RaB.f = new C0285Qa(this, 2);
        c0302RaB.c(2);
        return Arrays.asList(c0302RaB.b(), AbstractC3296qu.l("fire-cls", "20.0.4"));
    }
}
