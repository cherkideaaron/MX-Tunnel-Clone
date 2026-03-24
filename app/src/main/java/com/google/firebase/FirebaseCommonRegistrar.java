package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC3296qu;
import defpackage.C0036Bg;
import defpackage.C0220Md;
import defpackage.C0222Mf;
import defpackage.C0256Of;
import defpackage.C0302Ra;
import defpackage.C0319Sa;
import defpackage.C3007lg;
import defpackage.C3254q6;
import defpackage.C3346rr;
import defpackage.C3397so;
import defpackage.C3663xk;
import defpackage.InterfaceC3451to;
import defpackage.InterfaceC3505uo;
import defpackage.KA;
import defpackage.U6;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        C0302Ra c0302RaB = C0319Sa.b(C3007lg.class);
        c0302RaB.a(new C0036Bg(2, 0, C3254q6.class));
        c0302RaB.f = new C0220Md(7);
        arrayList.add(c0302RaB.b());
        KA ka = new KA(U6.class, Executor.class);
        C0302Ra c0302Ra = new C0302Ra(C0256Of.class, new Class[]{InterfaceC3451to.class, InterfaceC3505uo.class});
        c0302Ra.a(C0036Bg.c(Context.class));
        c0302Ra.a(C0036Bg.c(C3663xk.class));
        c0302Ra.a(new C0036Bg(2, 0, C3397so.class));
        c0302Ra.a(new C0036Bg(1, 1, C3007lg.class));
        c0302Ra.a(new C0036Bg(ka, 1, 0));
        c0302Ra.f = new C0222Mf(ka, 0);
        arrayList.add(c0302Ra.b());
        arrayList.add(AbstractC3296qu.l("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(AbstractC3296qu.l("fire-core", "22.0.1"));
        arrayList.add(AbstractC3296qu.l("device-name", a(Build.PRODUCT)));
        arrayList.add(AbstractC3296qu.l("device-model", a(Build.DEVICE)));
        arrayList.add(AbstractC3296qu.l("device-brand", a(Build.BRAND)));
        arrayList.add(AbstractC3296qu.u("android-target-sdk", new C0220Md(15)));
        arrayList.add(AbstractC3296qu.u("android-min-sdk", new C0220Md(16)));
        arrayList.add(AbstractC3296qu.u("android-platform", new C0220Md(17)));
        arrayList.add(AbstractC3296qu.u("android-installer", new C0220Md(18)));
        try {
            C3346rr.b.getClass();
            str = "2.1.10";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(AbstractC3296qu.l("kotlin", str));
        }
        return arrayList;
    }
}
