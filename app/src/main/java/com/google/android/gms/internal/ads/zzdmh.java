package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzbgj;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzdmh implements zzdbf, zzdir {
    private final zzccn zza;
    private final Context zzb;
    private final zzccq zzc;
    private final View zzd;
    private String zze;
    private final zzbgj.zza.EnumC0004zza zzf;
    private final zzfir zzg;

    public zzdmh(zzccn zzccnVar, Context context, zzccq zzccqVar, View view, zzbgj.zza.EnumC0004zza enumC0004zza, zzfir zzfirVar) {
        this.zza = zzccnVar;
        this.zzb = context;
        this.zzc = zzccqVar;
        this.zzd = view;
        this.zzf = enumC0004zza;
        this.zzg = zzfirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzd(zzcag zzcagVar, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzccq zzccqVar = this.zzc;
        Context context = this.zzb;
        if (zzccqVar.zza(context) && this.zzg.zzaG) {
            try {
                zzccqVar.zzo(context, zzccqVar.zzj(context), this.zza.zzb(), zzcagVar.zzb(), zzcagVar.zzc());
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdJ() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzds() {
        if (this.zzg.zzaG) {
            this.zza.zza(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdt() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.zzg.zzaG) {
            View view = this.zzd;
            if (view != null && this.zze != null) {
                this.zzc.zzg(view.getContext(), this.zze);
            }
            this.zza.zza(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzh() {
        zzbgj.zza.EnumC0004zza enumC0004zza = this.zzf;
        if (enumC0004zza != zzbgj.zza.EnumC0004zza.APP_OPEN && this.zzg.zzaG) {
            String strZzf = this.zzc.zzf(this.zzb);
            this.zze = strZzf;
            this.zze = String.valueOf(strZzf).concat(enumC0004zza == zzbgj.zza.EnumC0004zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }
}
