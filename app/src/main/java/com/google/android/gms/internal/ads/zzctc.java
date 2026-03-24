package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import defpackage.Vs;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzctc implements zzbde {
    private zzcjl zza;
    private final Executor zzb;
    private final zzcso zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcsr zzg = new zzcsr();

    public zzctc(Executor executor, zzcso zzcsoVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcsoVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject jSONObjectZza = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzf(jSONObjectZza);
                    }
                });
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e);
        }
    }

    public final void zza(zzcjl zzcjlVar) {
        this.zza = zzcjlVar;
    }

    public final void zzb() {
        this.zze = false;
    }

    public final void zzd() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zzdj(zzbdd zzbddVar) {
        boolean z = this.zzf ? false : zzbddVar.zzj;
        zzcsr zzcsrVar = this.zzg;
        zzcsrVar.zza = z;
        zzcsrVar.zzd = this.zzd.elapsedRealtime();
        zzcsrVar.zzf = zzbddVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z) {
        this.zzf = z;
    }

    public final /* synthetic */ void zzf(JSONObject jSONObject) {
        String string = jSONObject.toString();
        String strO = Vs.o(new StringBuilder(string.length() + 31), "Calling AFMA_updateActiveView(", string, ")");
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd(strO);
        this.zza.zzb("AFMA_updateActiveView", jSONObject);
    }
}
