package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdso extends zzblg {
    private final String zza;
    private final zzdoc zzb;
    private final zzdoh zzc;

    public zzdso(String str, zzdoc zzdocVar, zzdoh zzdohVar) {
        this.zza = str;
        this.zzb = zzdocVar;
        this.zzc = zzdohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final IObjectWrapper zzb() {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final String zzc() {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final List zzd() {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final String zze() {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final zzbks zzf() {
        return this.zzc.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final String zzg() {
        return this.zzc.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final double zzh() {
        return this.zzc.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final String zzi() {
        return this.zzc.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final String zzj() {
        return this.zzc.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final Bundle zzk() {
        return this.zzc.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final void zzl() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final com.google.android.gms.ads.internal.client.zzed zzm() {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final void zzn(Bundle bundle) {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final boolean zzo(Bundle bundle) {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final void zzp(Bundle bundle) {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final zzbkl zzq() {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final IObjectWrapper zzr() {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzblh
    public final String zzs() {
        return this.zza;
    }
}
