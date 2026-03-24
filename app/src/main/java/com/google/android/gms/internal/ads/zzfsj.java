package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class zzfsj {
    public static zzfsj zze(zzfsk zzfskVar, zzfsl zzfslVar) {
        zzfuh.zza();
        return new zzfsn(zzfskVar, zzfslVar, UUID.randomUUID().toString());
    }

    public abstract void zza();

    public abstract void zzb(View view);

    public abstract void zzc();

    public abstract void zzd(View view, zzfsq zzfsqVar, String str);
}
