package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;

/* loaded from: classes.dex */
public final class zzqe {
    private final zzv zza;
    private AudioDeviceInfo zzc;
    private zzd zzb = zzd.zza;
    private int zzd = 0;
    private int zze = -1;
    private int zzf = -1;

    public zzqe(zzv zzvVar) {
        this.zza = zzvVar;
    }

    public final zzqe zza(zzd zzdVar) {
        this.zzb = zzdVar;
        return this;
    }

    public final zzqe zzb(AudioDeviceInfo audioDeviceInfo) {
        this.zzc = audioDeviceInfo;
        return this;
    }

    public final zzqe zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzqe zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzqe zze(int i) {
        this.zzf = -1;
        return this;
    }

    public final /* synthetic */ zzv zzf() {
        return this.zza;
    }

    public final /* synthetic */ zzd zzg() {
        return this.zzb;
    }

    public final /* synthetic */ AudioDeviceInfo zzh() {
        return this.zzc;
    }

    public final /* synthetic */ int zzi() {
        return this.zzd;
    }

    public final /* synthetic */ int zzj() {
        return this.zze;
    }

    public final /* synthetic */ int zzk() {
        return this.zzf;
    }
}
