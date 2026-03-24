package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public final class zzcft {
    private final Context zza;
    private final zzcge zzb;
    private final ViewGroup zzc;
    private final zzdxz zzd;
    private zzcfs zze;

    public zzcft(Context context, ViewGroup viewGroup, zzcjl zzcjlVar, zzdxz zzdxzVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcjlVar;
        this.zze = null;
        this.zzd = zzdxzVar;
    }

    public final Integer zza() {
        zzcfs zzcfsVar = this.zze;
        if (zzcfsVar != null) {
            return zzcfsVar.zzl();
        }
        return null;
    }

    public final void zzb(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcfs zzcfsVar = this.zze;
        if (zzcfsVar != null) {
            zzcfsVar.zzn(i, i2, i3, i4);
        }
    }

    public final void zzc(int i, int i2, int i3, int i4, int i5, boolean z, zzcgd zzcgdVar) {
        if (this.zze != null) {
            return;
        }
        zzcge zzcgeVar = this.zzb;
        zzbhl.zza(zzcgeVar.zzq().zzc(), zzcgeVar.zzi(), "vpr2");
        zzcfs zzcfsVar = new zzcfs(this.zza, zzcgeVar, i5, z, zzcgeVar.zzq().zzc(), zzcgdVar, this.zzd);
        this.zze = zzcfsVar;
        this.zzc.addView(zzcfsVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zze.zzn(i, i2, i3, i4);
        zzcgeVar.zzdn(false);
    }

    public final zzcfs zzd() {
        return this.zze;
    }

    public final void zze() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcfs zzcfsVar = this.zze;
        if (zzcfsVar != null) {
            zzcfsVar.zzr();
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcfs zzcfsVar = this.zze;
        if (zzcfsVar != null) {
            zzcfsVar.zzE();
            this.zzc.removeView(this.zze);
            this.zze = null;
        }
    }

    public final void zzg(int i) {
        zzcfs zzcfsVar = this.zze;
        if (zzcfsVar != null) {
            zzcfsVar.zzm(i);
        }
    }
}
