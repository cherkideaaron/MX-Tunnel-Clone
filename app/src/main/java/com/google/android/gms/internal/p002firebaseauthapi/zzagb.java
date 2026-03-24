package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.util.DefaultClock;
import defpackage.Ry;
import defpackage.Z3;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzagb {
    private static final Map<String, zzagd> zza = new Z3();

    public static Ry zza(String str, Ry ry, zzaff zzaffVar) {
        zza(str, zzaffVar);
        return new zzaga(ry, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzaff zzaffVar) {
        zza.put(str, new zzagd(zzaffVar, DefaultClock.getInstance().currentTimeMillis()));
    }

    public static boolean zza(String str, Ry ry, Activity activity, Executor executor) {
        Map<String, zzagd> map = zza;
        if (!map.containsKey(str)) {
            zza(str, null);
            return false;
        }
        zzagd zzagdVar = map.get(str);
        if (DefaultClock.getInstance().currentTimeMillis() - zzagdVar.zzb >= 120000) {
            zza(str, null);
            return false;
        }
        zzaff zzaffVar = zzagdVar.zza;
        if (zzaffVar == null) {
            return true;
        }
        zzaffVar.zza(ry, activity, executor, str);
        return true;
    }
}
