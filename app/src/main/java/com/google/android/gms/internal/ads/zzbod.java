package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final /* synthetic */ class zzbod implements zzboh {
    static final /* synthetic */ zzbod zza = new zzbod();

    private /* synthetic */ zzbod() {
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        zzcle zzcleVar = (zzcle) obj;
        zzboh zzbohVar = zzbog.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int i = Integer.parseInt(str);
            int i2 = Integer.parseInt(str2);
            int i3 = Integer.parseInt(str3);
            zzazh zzazhVarZzS = zzcleVar.zzS();
            if (zzazhVarZzS != null) {
                zzazhVarZzS.zzb().zze(i, i2, i3);
            }
        } catch (NumberFormatException unused) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse touch parameters from gmsg.");
        }
    }
}
