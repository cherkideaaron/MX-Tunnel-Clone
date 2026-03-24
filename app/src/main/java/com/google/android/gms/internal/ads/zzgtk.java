package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzgtk extends zzgsw {
    final /* synthetic */ zzgtm zza;
    private final Object zzb;
    private int zzc;

    public zzgtk(zzgtm zzgtmVar, int i) {
        Objects.requireNonNull(zzgtmVar);
        this.zza = zzgtmVar;
        this.zzb = zzgtmVar.zzo(i);
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i != -1) {
            zzgtm zzgtmVar = this.zza;
            if (i < zzgtmVar.size() && Objects.equals(this.zzb, zzgtmVar.zzo(this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgsw, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgsw, java.util.Map.Entry
    public final Object getValue() {
        zzgtm zzgtmVar = this.zza;
        Map mapZzc = zzgtmVar.zzc();
        if (mapZzc != null) {
            return mapZzc.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzgtmVar.zzp(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgsw, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzgtm zzgtmVar = this.zza;
        Map mapZzc = zzgtmVar.zzc();
        if (mapZzc != null) {
            return mapZzc.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            zzgtmVar.put(this.zzb, obj);
            return null;
        }
        Object objZzp = zzgtmVar.zzp(i);
        zzgtmVar.zzq(this.zzc, obj);
        return objZzp;
    }
}
