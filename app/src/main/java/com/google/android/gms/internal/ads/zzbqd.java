package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import defpackage.AbstractC3264qG;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbqd implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzcen zza;
    final /* synthetic */ zzbqf zzb;

    public zzbqd(zzbqf zzbqfVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
        Objects.requireNonNull(zzbqfVar);
        this.zzb = zzbqfVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        try {
            this.zza.zzc(this.zzb.zzc().zzp());
        } catch (DeadObjectException e) {
            this.zza.zzd(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zza.zzd(new RuntimeException(AbstractC3264qG.k(new StringBuilder(String.valueOf(i).length() + 23), "onConnectionSuspended: ", i)));
    }
}
