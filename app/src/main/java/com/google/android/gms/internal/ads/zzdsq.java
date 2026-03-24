package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdsq extends zzbli {
    private final String zza;
    private final zzdoc zzb;
    private final zzdoh zzc;

    public zzdsq(String str, zzdoc zzdocVar, zzdoh zzdohVar) {
        this.zza = str;
        this.zzb = zzdocVar;
        this.zzc = zzdohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final IObjectWrapper zzb() {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final String zzc() {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final List zzd() {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final String zze() {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final zzbks zzf() {
        return this.zzc.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final String zzg() {
        return this.zzc.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final String zzh() {
        return this.zzc.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final Bundle zzi() {
        return this.zzc.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzj() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final com.google.android.gms.ads.internal.client.zzed zzk() {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzl(Bundle bundle) {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final boolean zzm(Bundle bundle) {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final void zzn(Bundle bundle) {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final zzbkl zzo() {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final IObjectWrapper zzp() {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzblj
    public final String zzq() {
        return this.zza;
    }
}
