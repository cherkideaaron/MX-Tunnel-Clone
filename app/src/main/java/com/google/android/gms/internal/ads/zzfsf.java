package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.As;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzfsf extends zzfsa {
    public zzfsf(ClientApi clientApi, Context context, int i, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, Clock clock) {
        super(clientApi, context, i, zzfkgVar, zzftVar, zzceVar, scheduledExecutorService, zzfmyVar, zzfraVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    public final As zza(Context context) {
        zzcaz zzcazVarZzl;
        zzfqs zzfqsVar;
        zzbtt zzbttVarZzd = this.zzd.zzd();
        if (zzbttVarZzd == null || (zzcazVarZzl = this.zza.zzl(ObjectWrapper.wrap(context), this.zze.zza, zzbttVarZzd, this.zzc)) == null) {
            zzfqsVar = new zzfqs(1, "Failed to create a rewarded ad.");
        } else {
            zzhah zzhahVarZze = zzhah.zze();
            try {
                zzx(this.zze.zzc);
                zzcazVarZzl.zzc(this.zze.zzc, new zzfse(this, zzhahVarZze, zzcazVarZzl));
                return zzhahVarZze;
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to load rewarded ad.");
                zzfqsVar = new zzfqs(1, "remote exception");
            }
        }
        return zzgzo.zzc(zzfqsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    public final long zzb() {
        return ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzR)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzfsa
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzc(Object obj) {
        try {
            return ((zzcaz) obj).zzm();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for the rewarded ad.", e);
            return null;
        }
    }

    public zzfsf(String str, ClientApi clientApi, Context context, int i, zzfkg zzfkgVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, Clock clock, zzfqr zzfqrVar) {
        super(str, clientApi, context, i, zzfkgVar, zzftVar, zzchVar, scheduledExecutorService, zzfmyVar, zzfraVar, clock, zzfqrVar);
    }
}
