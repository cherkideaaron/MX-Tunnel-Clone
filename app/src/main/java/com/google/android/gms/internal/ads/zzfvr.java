package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* loaded from: classes.dex */
public final class zzfvr {
    private final Context zza;
    private final Looper zzb;

    public zzfvr(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfwb zzfwbVarZza = zzfwd.zza();
        Context context = this.zza;
        zzfwbVarZza.zza(context.getPackageName());
        zzfwbVarZza.zzc(2);
        zzfvz zzfvzVarZza = zzfwa.zza();
        zzfvzVarZza.zza(str);
        zzfvzVarZza.zzb(2);
        zzfwbVarZza.zzb(zzfvzVarZza);
        new zzfvs(context, this.zzb, (zzfwd) zzfwbVarZza.zzbu()).zza();
    }
}
