package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.Build;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.C0051Ce;
import defpackage.C0589cO;
import defpackage.C2675fc;
import defpackage.C2770hF;
import defpackage.C2834iO;
import defpackage.C3223pc;
import defpackage.C3397so;
import defpackage.C3472u8;
import defpackage.D3;
import java.util.HashMap;
import java.util.HashSet;

@KeepForSdk
/* loaded from: classes.dex */
public class WorkManagerUtil extends zzbn {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void zzb(Context context) {
        try {
            C0589cO.T(context.getApplicationContext(), new C2770hF(new C3397so(10)));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zze(IObjectWrapper iObjectWrapper, String str, String str2) {
        return zzg(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final void zzf(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            C0589cO c0589cOS = C0589cO.S(context);
            ((D3) c0589cOS.z).t(new C3472u8(c0589cOS));
            C3223pc c3223pc = new C3223pc();
            C2675fc c2675fc = new C2675fc();
            c2675fc.a = 1;
            c2675fc.f = -1L;
            c2675fc.g = -1L;
            c2675fc.h = new C3223pc();
            c2675fc.b = false;
            int i = Build.VERSION.SDK_INT;
            c2675fc.c = false;
            c2675fc.a = 2;
            c2675fc.d = false;
            c2675fc.e = false;
            if (i >= 24) {
                c2675fc.h = c3223pc;
                c2675fc.f = -1L;
                c2675fc.g = -1L;
            }
            D3 d3 = new D3(OfflinePingSender.class);
            ((C2834iO) d3.d).j = c2675fc;
            ((HashSet) d3.c).add("offline_ping_sender_work");
            c0589cOS.n(d3.i());
        } catch (IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws Throwable {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        C3223pc c3223pc = new C3223pc();
        C2675fc c2675fc = new C2675fc();
        c2675fc.a = 1;
        c2675fc.f = -1L;
        c2675fc.g = -1L;
        c2675fc.h = new C3223pc();
        c2675fc.b = false;
        int i = Build.VERSION.SDK_INT;
        c2675fc.c = false;
        c2675fc.a = 2;
        c2675fc.d = false;
        c2675fc.e = false;
        if (i >= 24) {
            c2675fc.h = c3223pc;
            c2675fc.f = -1L;
            c2675fc.g = -1L;
        }
        HashMap map = new HashMap();
        map.put("uri", zzaVar.zza);
        map.put("gws_query_id", zzaVar.zzb);
        map.put("image_url", zzaVar.zzc);
        C0051Ce c0051Ce = new C0051Ce(map);
        C0051Ce.c(c0051Ce);
        D3 d3 = new D3(OfflineNotificationPoster.class);
        C2834iO c2834iO = (C2834iO) d3.d;
        c2834iO.j = c2675fc;
        c2834iO.e = c0051Ce;
        ((HashSet) d3.c).add("offline_notification_work");
        try {
            C0589cO.S(context).n(d3.i());
            return true;
        } catch (IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
