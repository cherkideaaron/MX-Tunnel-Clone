package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* loaded from: classes.dex */
public class zzcue {
    private final zzcwd zza;
    private final View zzb;
    private final zzfis zzc;
    private final zzcjl zzd;

    public zzcue(View view, zzcjl zzcjlVar, zzcwd zzcwdVar, zzfis zzfisVar) {
        this.zzb = view;
        this.zzd = zzcjlVar;
        this.zza = zzcwdVar;
        this.zzc = zzfisVar;
    }

    public final zzcjl zza() {
        return this.zzd;
    }

    public final View zzb() {
        return this.zzb;
    }

    public final zzcwd zzc() {
        return this.zza;
    }

    public final zzfis zzd() {
        return this.zzc;
    }

    public zzdcr zze(Set set) {
        return new zzdcr(set);
    }
}
