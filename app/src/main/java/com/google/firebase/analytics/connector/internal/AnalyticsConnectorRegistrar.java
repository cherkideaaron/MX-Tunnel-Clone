package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC3296qu;
import defpackage.C0036Bg;
import defpackage.C0302Ra;
import defpackage.C0319Sa;
import defpackage.C0378Vi;
import defpackage.C0587cM;
import defpackage.C2611eL;
import defpackage.C3465u1;
import defpackage.C3663xk;
import defpackage.ExecutorC0342Tg;
import defpackage.GH;
import defpackage.InterfaceC2729gb;
import defpackage.InterfaceC3411t1;
import java.util.Arrays;
import java.util.List;

@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC3411t1 lambda$getComponents$0(InterfaceC2729gb interfaceC2729gb) {
        C3663xk c3663xk = (C3663xk) interfaceC2729gb.a(C3663xk.class);
        Context context = (Context) interfaceC2729gb.a(Context.class);
        GH gh = (GH) interfaceC2729gb.a(GH.class);
        Preconditions.checkNotNull(c3663xk);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(gh);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (C3465u1.c == null) {
            synchronized (C3465u1.class) {
                try {
                    if (C3465u1.c == null) {
                        Bundle bundle = new Bundle(1);
                        c3663xk.a();
                        if ("[DEFAULT]".equals(c3663xk.b)) {
                            ((C0378Vi) gh).a(ExecutorC0342Tg.c, C0587cM.a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", c3663xk.j());
                        }
                        C3465u1.c = new C3465u1(zzfb.zza(context, bundle).zzb());
                    }
                } finally {
                }
            }
        }
        return C3465u1.c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @KeepForSdk
    public List<C0319Sa> getComponents() {
        C0302Ra c0302RaB = C0319Sa.b(InterfaceC3411t1.class);
        c0302RaB.a(C0036Bg.c(C3663xk.class));
        c0302RaB.a(C0036Bg.c(Context.class));
        c0302RaB.a(C0036Bg.c(GH.class));
        c0302RaB.f = C2611eL.c;
        c0302RaB.c(2);
        return Arrays.asList(c0302RaB.b(), AbstractC3296qu.l("fire-analytics", "23.0.0"));
    }
}
