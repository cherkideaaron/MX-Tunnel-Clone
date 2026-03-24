package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzase {
    public final Object zza;
    public final zzarh zzb;
    public final zzash zzc;
    public boolean zzd;

    private zzase(zzash zzashVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzashVar;
    }

    public static zzase zza(Object obj, zzarh zzarhVar) {
        return new zzase(obj, zzarhVar);
    }

    public static zzase zzb(zzash zzashVar) {
        return new zzase(zzashVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }

    private zzase(Object obj, zzarh zzarhVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzarhVar;
        this.zzc = null;
    }
}
