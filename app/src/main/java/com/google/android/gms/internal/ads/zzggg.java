package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class zzggg implements zzgha {
    private final Map zza;
    private final zzawg zzb;
    private final zzgoc zzc;
    private final long zzd;

    public zzggg(zzawg zzawgVar, Map map, zzgbf zzgbfVar, zzgoe zzgoeVar) {
        this.zza = map;
        this.zzb = zzawgVar;
        this.zzc = zzgoeVar.zza(112);
        this.zzd = zzgbfVar.zzj();
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zza();
        return null;
    }

    public final Void zza() {
        zzaxg zzaxgVar;
        try {
            try {
                this.zzc.zza();
                As as = (As) this.zza.get("gs");
                if (as != null && (zzaxgVar = (zzaxg) as.get(this.zzd, TimeUnit.MILLISECONDS)) != null) {
                    zzawg zzawgVar = this.zzb;
                    synchronized (zzawgVar) {
                        zzawgVar.zzad(zzaxgVar.zzh());
                        zzawgVar.zzN(zzaxgVar.zzd());
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e) {
                this.zzc.zzb(e);
            }
            this.zzc.zzc();
            return null;
        } catch (Throwable th) {
            this.zzc.zzc();
            throw th;
        }
    }
}
