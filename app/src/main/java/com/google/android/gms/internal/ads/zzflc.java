package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;

/* loaded from: classes.dex */
final class zzflc {
    private final zzflb zza = new zzflb();
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;

    public final void zza() {
        this.zzd++;
    }

    public final void zzb() {
        this.zze++;
    }

    public final void zzc() {
        this.zzb++;
        this.zza.zza = true;
    }

    public final void zzd() {
        this.zzc++;
        this.zza.zzb = true;
    }

    public final void zze() {
        this.zzf++;
    }

    public final zzflb zzf() {
        zzflb zzflbVar = this.zza;
        zzflb zzflbVarClone = zzflbVar.clone();
        zzflbVar.zza = false;
        zzflbVar.zzb = false;
        return zzflbVarClone;
    }

    public final String zzg() {
        StringBuilder sb = new StringBuilder("\n\tPool does not exist: ");
        sb.append(this.zzd);
        sb.append("\n\tNew pools created: ");
        sb.append(this.zzb);
        sb.append("\n\tPools removed: ");
        sb.append(this.zzc);
        sb.append("\n\tEntries added: ");
        sb.append(this.zzf);
        sb.append("\n\tNo entries retrieved: ");
        return AbstractC3264qG.j(sb, this.zze, "\n");
    }
}
