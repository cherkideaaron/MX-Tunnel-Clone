package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzenb {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcwi zzc;
    private final zzenr zzd;
    private final zzfqg zze;
    private final zzhah zzf = zzhah.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzenc zzh;
    private zzfjc zzi;

    public zzenb(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcwi zzcwiVar, zzenr zzenrVar, zzfqg zzfqgVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcwiVar;
        this.zzd = zzenrVar;
        this.zze = zzfqgVar;
    }

    private final synchronized As zzd(zzfir zzfirVar) {
        Iterator it = zzfirVar.zza.iterator();
        while (it.hasNext()) {
            zzekg zzekgVarZza = this.zzc.zza(zzfirVar.zzb, (String) it.next());
            if (zzekgVarZza != null && zzekgVarZza.zza(this.zzi, zzfirVar)) {
                return zzgzo.zzi(zzekgVarZza.zzb(this.zzi, zzfirVar), zzfirVar.zzR, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgzo.zzc(new zzecr(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zzb(zzfir zzfirVar) {
        As asZzd = zzd(zzfirVar);
        this.zzd.zze(this.zzi, zzfirVar, asZzd, this.zze);
        zzgzo.zzr(asZzd, new zzena(this, zzfirVar), this.zza);
    }

    public final synchronized As zza(zzfjc zzfjcVar) {
        try {
            if (!this.zzg.getAndSet(true)) {
                List list = zzfjcVar.zzb.zza;
                if (!list.isEmpty()) {
                    this.zzi = zzfjcVar;
                    zzenr zzenrVar = this.zzd;
                    this.zzh = new zzenc(zzfjcVar, zzenrVar, this.zzf);
                    zzenrVar.zzc(list);
                    zzenc zzencVar = this.zzh;
                    while (true) {
                        zzfir zzfirVarZza = zzencVar.zza();
                        if (zzfirVarZza == null) {
                            break;
                        }
                        zzb(zzfirVarZza);
                        zzencVar = this.zzh;
                    }
                } else {
                    this.zzf.zzb(new zzenv(3, zzeny.zzb(zzfjcVar)));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzf;
    }

    public final /* synthetic */ zzenc zzc() {
        return this.zzh;
    }
}
