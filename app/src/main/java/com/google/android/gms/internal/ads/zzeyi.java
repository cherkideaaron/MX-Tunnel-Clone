package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import defpackage.As;

/* loaded from: classes.dex */
public final class zzeyi implements zzfax {
    private final Context zza;
    private final Intent zzb;

    public zzeyi(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final As zza() {
        zzeyj zzeyjVar;
        com.google.android.gms.ads.internal.util.zze.zza("HsdpMigrationSignal.produce");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzom)).booleanValue()) {
            boolean z = false;
            try {
                if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                    com.google.android.gms.ads.internal.util.zze.zza("HSDP intent is supported");
                    z = true;
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "HsdpMigrationSignal.isHsdpMigrationSupported");
            }
            zzeyjVar = new zzeyj(Boolean.valueOf(z));
        } else {
            zzeyjVar = new zzeyj(null);
        }
        return zzgzo.zza(zzeyjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 60;
    }
}
