package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbai implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbak zzb;

    public zzbai(zzbak zzbakVar, int i, boolean z) {
        this.zza = i;
        Objects.requireNonNull(zzbakVar);
        this.zzb = zzbakVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        zzaxg zzaxgVarZza;
        int i = this.zza;
        zzbak zzbakVar = this.zzb;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            Context context = zzbakVar.zza;
            zzaxgVarZza = zzfvo.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused2) {
            zzaxgVarZza = null;
        }
        zzbak zzbakVar2 = this.zzb;
        zzbakVar2.zzs(zzaxgVarZza);
        int i2 = this.zza;
        if (i2 < 4) {
            if (zzaxgVarZza != null && zzaxgVarZza.zza() && !zzaxgVarZza.zzb().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzaxgVarZza.zzg() && zzaxgVarZza.zzh().zza() && zzaxgVarZza.zzh().zzb() != -2) {
                return;
            }
            zzbakVar2.zzp(i2 + 1, true);
        }
    }
}
