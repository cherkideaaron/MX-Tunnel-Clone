package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaru;
import com.google.android.gms.internal.ads.zzary;
import com.google.android.gms.internal.ads.zzase;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzcen;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbk extends zzary {
    private final zzcen zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbk(String str, Map map, zzcen zzcenVar) throws IOException {
        super(0, str, new zzbj(zzcenVar));
        this.zza = zzcenVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.zzb = zzlVar;
        zzlVar.zzb(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final zzase zzr(zzaru zzaruVar) {
        return zzase.zza(zzaruVar, zzasv.zza(zzaruVar));
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final /* bridge */ /* synthetic */ void zzs(Object obj) throws IOException {
        zzaru zzaruVar = (zzaru) obj;
        Map map = zzaruVar.zzc;
        int i = zzaruVar.zza;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = this.zzb;
        zzlVar.zzd(map, i);
        byte[] bArr = zzaruVar.zzb;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj() && bArr != null) {
            zzlVar.zzf(bArr);
        }
        this.zza.zzc(zzaruVar);
    }
}
