package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzfvp implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzfwj zza;
    private final String zzb;
    private final String zzc;
    private final zzbch zzd;
    private final LinkedBlockingQueue zze;
    private final HandlerThread zzf;
    private final zzfvh zzg;
    private final long zzh;

    public zzfvp(Context context, int i, zzbch zzbchVar, String str, String str2, String str3, zzfvh zzfvhVar) {
        this.zzb = str;
        this.zzd = zzbchVar;
        this.zzc = str2;
        this.zzg = zzfvhVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zzf = handlerThread;
        handlerThread.start();
        this.zzh = System.currentTimeMillis();
        zzfwj zzfwjVar = new zzfwj(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfwjVar;
        this.zze = new LinkedBlockingQueue();
        zzfwjVar.checkAvailabilityAndConnect();
    }

    private final void zzd(int i, long j, Exception exc) {
        zzfvh zzfvhVar = this.zzg;
        if (zzfvhVar != null) {
            zzfvhVar.zzc(i, System.currentTimeMillis() - j, exc);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfwo zzfwoVarZzc = zzc();
        if (zzfwoVarZzc != null) {
            try {
                zzfwv zzfwvVarZzg = zzfwoVarZzc.zzg(new zzfwt(1, this.zzd, this.zzb, this.zzc));
                zzd(5011, this.zzh, null);
                this.zze.put(zzfwvVarZzg);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) throws InterruptedException {
        try {
            zzd(4012, this.zzh, null);
            this.zze.put(new zzfwv(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) throws InterruptedException {
        try {
            zzd(4011, this.zzh, null);
            this.zze.put(new zzfwv(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final zzfwv zza(int i) {
        zzfwv zzfwvVar;
        try {
            zzfwvVar = (zzfwv) this.zze.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zzd(AdError.INTERSTITIAL_AD_TIMEOUT, this.zzh, e);
            zzfwvVar = null;
        }
        zzd(AuthApiStatusCodes.AUTH_TOKEN_ERROR, this.zzh, null);
        if (zzfwvVar != null) {
            zzfvh.zzg(zzfwvVar.zzc == 7 ? 3 : 2);
        }
        return zzfwvVar == null ? new zzfwv(null, 1) : zzfwvVar;
    }

    public final void zzb() {
        zzfwj zzfwjVar = this.zza;
        if (zzfwjVar != null) {
            if (zzfwjVar.isConnected() || zzfwjVar.isConnecting()) {
                zzfwjVar.disconnect();
            }
        }
    }

    public final zzfwo zzc() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
