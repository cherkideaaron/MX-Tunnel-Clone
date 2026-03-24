package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzabf {
    public static final zzaaz zza = new zzaaz(2, -9223372036854775807L, null);
    public static final zzaaz zzb = new zzaaz(3, -9223372036854775807L, null);
    private final zzabl zzc = a.a(zzfj.zzf("ExoPlayer:Loader:ProgressiveMediaPeriod"), zzaay.zza);
    private zzaba zzd;
    private IOException zze;

    public zzabf(String str) {
    }

    public static zzaaz zza(boolean z, long j) {
        return new zzaaz(z ? 1 : 0, j, null);
    }

    public final boolean zzb() {
        return this.zze != null;
    }

    public final void zzc() {
        this.zze = null;
    }

    public final long zzd(zzabb zzabbVar, zzaax zzaaxVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.zze = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new zzaba(this, looperMyLooper, zzabbVar, zzaaxVar, i, jElapsedRealtime).zzb(0L);
        return jElapsedRealtime;
    }

    public final boolean zze() {
        return this.zzd != null;
    }

    public final void zzf() {
        zzaba zzabaVar = this.zzd;
        zzabaVar.getClass();
        zzabaVar.zzc(false);
    }

    public final void zzg(zzabc zzabcVar) {
        zzaba zzabaVar = this.zzd;
        if (zzabaVar != null) {
            zzabaVar.zzc(true);
        }
        zzabl zzablVar = this.zzc;
        zzablVar.execute(new zzabd(zzabcVar));
        zzablVar.zza();
    }

    public final void zzh(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null) {
            throw iOException;
        }
        zzaba zzabaVar = this.zzd;
        if (zzabaVar != null) {
            zzabaVar.zza(i);
        }
    }

    public final /* synthetic */ zzabl zzi() {
        return this.zzc;
    }

    public final /* synthetic */ zzaba zzj() {
        return this.zzd;
    }

    public final /* synthetic */ void zzk(zzaba zzabaVar) {
        this.zzd = zzabaVar;
    }

    public final /* synthetic */ void zzl(IOException iOException) {
        this.zze = iOException;
    }
}
