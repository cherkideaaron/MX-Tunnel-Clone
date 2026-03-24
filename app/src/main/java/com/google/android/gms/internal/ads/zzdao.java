package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzdao {
    private final Context zza;
    private final zzfjk zzb;
    private final Bundle zzc;
    private final zzfjd zzd;
    private final zzdag zze;
    private final zzekl zzf;
    private final int zzg;

    public /* synthetic */ zzdao(zzdan zzdanVar, byte[] bArr) {
        this.zza = zzdanVar.zzi();
        this.zzb = zzdanVar.zzj();
        this.zzc = zzdanVar.zzk();
        this.zzd = zzdanVar.zzl();
        this.zze = zzdanVar.zzm();
        this.zzf = zzdanVar.zzn();
        this.zzg = zzdanVar.zzo();
    }

    public final zzdan zza() {
        zzdan zzdanVar = new zzdan();
        zzdanVar.zza(this.zza);
        zzdanVar.zzb(this.zzb);
        zzdanVar.zzc(this.zzc);
        zzdanVar.zzd(this.zze);
        zzdanVar.zzg(this.zzf);
        return zzdanVar;
    }

    public final zzfjk zzb() {
        return this.zzb;
    }

    public final zzfjd zzc() {
        return this.zzd;
    }

    public final Bundle zzd() {
        return this.zzc;
    }

    public final zzdag zze() {
        return this.zze;
    }

    public final Context zzf(Context context) {
        return this.zza;
    }

    public final zzekl zzg(String str) {
        zzekl zzeklVar = this.zzf;
        return zzeklVar != null ? zzeklVar : new zzekl(str);
    }

    public final int zzh() {
        return this.zzg;
    }
}
