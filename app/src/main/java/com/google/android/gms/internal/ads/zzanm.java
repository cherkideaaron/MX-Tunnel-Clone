package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class zzanm implements zzamf {
    private final zzer zza = new zzer();
    private final zzer zzb = new zzer();
    private final zzanl zzc;
    private Inflater zzd;

    public zzanm(List list) {
        zzanl zzanlVar = new zzanl();
        this.zzc = zzanlVar;
        zzanlVar.zza(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i, int i2, zzame zzameVar, zzdr zzdrVar) {
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i2 + i);
        zzerVar.zzh(i);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        zzer zzerVar2 = this.zzb;
        if (zzfj.zzL(zzerVar, zzerVar2, this.zzd)) {
            zzerVar.zzb(zzerVar2.zzi(), zzerVar2.zze());
        }
        zzanl zzanlVar = this.zzc;
        zzanlVar.zzd();
        int iZzd = zzerVar.zzd();
        zzcx zzcxVarZzc = null;
        if (iZzd >= 2 && zzerVar.zzt() == iZzd) {
            zzanlVar.zzb(zzerVar);
            zzcxVarZzc = zzanlVar.zzc(zzerVar);
        }
        zzdrVar.zza(new zzalx(zzcxVarZzc != null ? zzguf.zzj(zzcxVarZzc) : zzguf.zzi(), -9223372036854775807L, 5000000L));
    }
}
