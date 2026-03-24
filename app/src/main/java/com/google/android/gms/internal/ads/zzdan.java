package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzdan {
    private Context zza;
    private zzfjk zzb;
    private Bundle zzc;
    private zzfjd zzd;
    private zzdag zze;
    private zzekl zzf;
    private int zzg = 0;

    public final zzdan zza(Context context) {
        this.zza = context;
        return this;
    }

    public final zzdan zzb(zzfjk zzfjkVar) {
        this.zzb = zzfjkVar;
        return this;
    }

    public final zzdan zzc(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzdan zzd(zzdag zzdagVar) {
        this.zze = zzdagVar;
        return this;
    }

    public final zzdao zze() {
        return new zzdao(this, null);
    }

    public final zzdan zzf(zzfjd zzfjdVar) {
        this.zzd = zzfjdVar;
        return this;
    }

    public final zzdan zzg(zzekl zzeklVar) {
        this.zzf = zzeklVar;
        return this;
    }

    public final zzdan zzh(int i) {
        this.zzg = i;
        return this;
    }

    public final /* synthetic */ Context zzi() {
        return this.zza;
    }

    public final /* synthetic */ zzfjk zzj() {
        return this.zzb;
    }

    public final /* synthetic */ Bundle zzk() {
        return this.zzc;
    }

    public final /* synthetic */ zzfjd zzl() {
        return this.zzd;
    }

    public final /* synthetic */ zzdag zzm() {
        return this.zze;
    }

    public final /* synthetic */ zzekl zzn() {
        return this.zzf;
    }

    public final /* synthetic */ int zzo() {
        return this.zzg;
    }
}
