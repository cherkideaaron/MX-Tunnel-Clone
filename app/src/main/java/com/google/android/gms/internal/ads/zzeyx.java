package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import defpackage.As;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeyx implements zzfax {
    private final zzgzy zza;
    private final zzfjk zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzeyx(zzgzy zzgzyVar, zzfjk zzfjkVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgzyVar;
        this.zzb = zzfjkVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final As zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzeyw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 26;
    }

    public final /* synthetic */ zzeyy zzc() {
        return new zzeyy(this.zzb, this.zzc, this.zzd);
    }
}
