package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzgnm extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzgno zza;

    public zzgnm(zzgno zzgnoVar) {
        Objects.requireNonNull(zzgnoVar);
        this.zza = zzgnoVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        zzgno zzgnoVar = this.zza;
        synchronized (zzgnoVar) {
            zzgnoVar.zzf(networkCapabilities);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        zzgno zzgnoVar = this.zza;
        synchronized (zzgnoVar) {
            zzgnoVar.zzf(null);
        }
    }
}
