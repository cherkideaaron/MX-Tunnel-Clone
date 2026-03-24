package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class zzdsv extends zzbml {
    private final String zza;
    private final zzdoc zzb;
    private final zzdoh zzc;
    private final zzdxz zzd;

    public zzdsv(String str, zzdoc zzdocVar, zzdoh zzdohVar, zzdxz zzdxzVar) {
        this.zza = str;
        this.zzb = zzdocVar;
        this.zzc = zzdohVar;
        this.zzd = zzdxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final boolean zzA() {
        zzdoh zzdohVar = this.zzc;
        return (zzdohVar.zzE().isEmpty() || zzdohVar.zzF() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzB(com.google.android.gms.ads.internal.client.zzdj zzdjVar) {
        this.zzb.zzA(zzdjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzC(com.google.android.gms.ads.internal.client.zzdf zzdfVar) {
        this.zzb.zzB(zzdfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzD() {
        this.zzb.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzE() {
        this.zzb.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final zzbkp zzF() {
        return this.zzb.zzP().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final boolean zzG() {
        return this.zzb.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final com.google.android.gms.ads.internal.client.zzea zzH() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhG)).booleanValue()) {
            return this.zzb.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzI(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        try {
            if (!zzdtVar.zzf()) {
                this.zzd.zzb();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzQ(zzdtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzJ(Bundle bundle) throws JSONException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzow)).booleanValue()) {
            this.zzb.zzR(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final long zzK() {
        zzdoc zzdocVar = this.zzb;
        if (zzdocVar == null || zzdocVar.zzo() == null) {
            return 0L;
        }
        return zzdocVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzL(long j) {
        zzdoc zzdocVar = this.zzb;
        if (zzdocVar == null || zzdocVar.zzo() == null) {
            return;
        }
        zzdocVar.zzo().zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zze() {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final List zzf() {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzg() {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final zzbks zzh() {
        return this.zzc.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzi() {
        return this.zzc.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzj() {
        return this.zzc.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final double zzk() {
        return this.zzc.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzl() {
        return this.zzc.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzm() {
        return this.zzc.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final com.google.android.gms.ads.internal.client.zzed zzn() {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final String zzo() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzp() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final zzbkl zzq() {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzr(Bundle bundle) {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final boolean zzs(Bundle bundle) {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzt(Bundle bundle) {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final IObjectWrapper zzu() {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final IObjectWrapper zzv() {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final Bundle zzw() {
        return this.zzc.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzx(zzbmj zzbmjVar) {
        this.zzb.zzy(zzbmjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final void zzy() {
        this.zzb.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbmm
    public final List zzz() {
        return zzA() ? this.zzc.zzE() : Collections.emptyList();
    }
}
