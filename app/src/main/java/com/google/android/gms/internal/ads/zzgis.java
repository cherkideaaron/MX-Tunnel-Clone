package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzgis {
    private final zzgmu zza;
    private final zzgkg zzb;
    private final zzgkx zzc;
    private final zzgoe zzd;
    private final zzgcl zze;
    private final boolean zzf;
    private final long zzg;
    private final long zzh;

    public zzgis(zzgmu zzgmuVar, zzgkg zzgkgVar, zzgkx zzgkxVar, zzgoe zzgoeVar, zzgcl zzgclVar, boolean z, long j, long j2) {
        this.zza = zzgmuVar;
        this.zzb = zzgkgVar;
        this.zzc = zzgkxVar;
        this.zzd = zzgoeVar;
        this.zze = zzgclVar;
        this.zzf = z;
        this.zzg = j;
        this.zzh = j2;
    }

    private final As zzh(final int i) {
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzk(zzgzg.zzw(this.zzb.zza()), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgij
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                zzgds zzgdsVar = (zzgds) obj;
                this.zza.zzd(zzgdsVar);
                return zzgdsVar;
            }
        }, zzhaf.zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgik
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zze((zzgds) obj);
            }
        }, zzhaf.zza()), zzgil.zza, zzhaf.zza()), zzgie.class, zzgim.zza, zzhaf.zza()), zzgif.class, zzgin.zza, zzhaf.zza()), zzgid.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgio
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzf(i, (zzgid) obj);
            }
        }, zzhaf.zza());
        this.zzd.zze(1002, zzgzgVar);
        return zzgzgVar;
    }

    public final void zza(long j) {
        if (j > 0) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgiq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            }, j);
        } else {
            zzb();
        }
    }

    public final As zzb() {
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzg(zzgzg.zzw(this.zzc.zzb()), Throwable.class, zzgih.zza, zzhaf.zza());
        final zzgmu zzgmuVar = this.zza;
        Objects.requireNonNull(zzgmuVar);
        return (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzk(zzgzgVar, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgig
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return new Boolean(zzgmuVar.zza((zzgdu) obj));
            }
        }, zzhaf.zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgii
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zzc((Boolean) obj);
            }
        }, zzhaf.zza());
    }

    public final /* synthetic */ As zzc(Boolean bool) {
        if (bool.booleanValue()) {
            return zzh(0);
        }
        this.zzd.zzb(1003);
        return zzgzo.zza(zzgir.RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID);
    }

    public final /* synthetic */ zzgds zzd(zzgds zzgdsVar) {
        int iZzj = zzgdsVar.zzj() - 1;
        if (iZzj == 1 || iZzj == 2) {
            return zzgdsVar;
        }
        if (iZzj == 3) {
            zzgoe zzgoeVar = this.zzd;
            int iZzj2 = zzgdsVar.zzj() - 1;
            StringBuilder sb = new StringBuilder(String.valueOf(iZzj2).length());
            sb.append(iZzj2);
            zzgoeVar.zzc(1004, sb.toString());
            throw new zzgif(zzgdsVar.zzj() - 1);
        }
        if (iZzj != 12) {
            zzgoe zzgoeVar2 = this.zzd;
            int iZzj3 = zzgdsVar.zzj() - 1;
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj3).length());
            sb2.append(iZzj3);
            zzgoeVar2.zzc(1005, sb2.toString());
            throw new zzgie(zzgdsVar.zzj() - 1);
        }
        zzgoe zzgoeVar3 = this.zzd;
        int iZzj4 = zzgdsVar.zzj() - 1;
        StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj4).length());
        sb3.append(iZzj4);
        zzgoeVar3.zzc(1005, sb3.toString());
        throw new zzgid(zzgdsVar.zzj() - 1);
    }

    public final /* synthetic */ As zze(zzgds zzgdsVar) {
        if (zzgdsVar.zzj() == 2) {
            return this.zzc.zzd(zzgdsVar.zza(), zzgdsVar.zzb().zzy());
        }
        if (zzgdsVar.zzj() == 3) {
            return this.zzc.zzc(zzgdsVar.zza(), zzgdsVar.zzc().zzy(), zzgdsVar.zzb().zzy());
        }
        throw new AssertionError("Unreachable");
    }

    public final /* synthetic */ zzgir zzf(final int i, zzgid zzgidVar) {
        if (this.zzf && i < this.zzg) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgip
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg(i);
                }
            }, this.zzh * ((long) Math.pow(2.0d, i)));
        }
        return zzgir.RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION;
    }

    public final /* synthetic */ void zzg(int i) {
        zzh(i + 1);
    }
}
