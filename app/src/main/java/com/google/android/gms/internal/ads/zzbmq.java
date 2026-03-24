package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzbmq extends zzblv {
    final /* synthetic */ zzbms zza;

    public /* synthetic */ zzbmq(zzbms zzbmsVar, byte[] bArr) {
        Objects.requireNonNull(zzbmsVar);
        this.zza = zzbmsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zze(zzblm zzblmVar, String str) {
        zzbms zzbmsVar = this.zza;
        if (zzbmsVar.zzd() == null) {
            return;
        }
        zzbmsVar.zzd().zzc(zzbmsVar.zze(zzblmVar), str);
    }
}
