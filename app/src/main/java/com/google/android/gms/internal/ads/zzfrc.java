package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.As;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzfrc extends zzfsa {
    public zzfrc(ClientApi clientApi, Context context, int i, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, Clock clock) {
        super(clientApi, context, i, zzfkgVar, zzftVar, zzceVar, scheduledExecutorService, zzfmyVar, zzfraVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    public final As zza(Context context) {
        com.google.android.gms.ads.internal.client.zzbx zzbxVarZzc;
        zzfqs zzfqsVar;
        zzbtt zzbttVarZzd = this.zzd.zzd();
        if (zzbttVarZzd == null || (zzbxVarZzc = this.zza.zzc(ObjectWrapper.wrap(context), new com.google.android.gms.ads.internal.client.zzr(), this.zze.zza, zzbttVarZzd, this.zzc)) == null) {
            zzfqsVar = new zzfqs(1, "Failed to create an interstitial ad manager.");
        } else {
            zzhah zzhahVarZze = zzhah.zze();
            try {
                zzx(this.zze.zzc);
                zzbxVarZzc.zzQ(this.zze.zzc, new zzfrb(this, zzhahVarZze, zzbxVarZzc));
                return zzhahVarZze;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load interstitial ad.", e);
                zzfqsVar = new zzfqs(1, "remote exception");
            }
        }
        return zzgzo.zzc(zzfqsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    public final long zzb() {
        return ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzQ)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzc(Object obj) {
        try {
            return ((com.google.android.gms.ads.internal.client.zzbx) obj).zzt();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for  the interstitial ad.", e);
            return null;
        }
    }

    public zzfrc(String str, ClientApi clientApi, Context context, int i, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, Clock clock, zzfqr zzfqrVar) {
        super(str, clientApi, context, i, zzfkgVar, zzftVar, zzchVar, scheduledExecutorService, zzfmyVar, zzfraVar, clock, zzfqrVar);
    }
}
