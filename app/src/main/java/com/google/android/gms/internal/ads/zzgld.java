package com.google.android.gms.internal.ads;

import defpackage.As;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
final class zzgld implements zzgky {
    private final zzgct zza;
    private final zzgct zzb;
    private final zzgct zzc;
    private final zzgct zzd;
    private final zzika zze;
    private final zzika zzf;
    private final File zzg;
    private final ExecutorService zzh;
    private final zzgoe zzi;

    public zzgld(zzgct zzgctVar, zzgct zzgctVar2, zzika zzikaVar, zzgct zzgctVar3, zzgct zzgctVar4, zzika zzikaVar2, File file, ExecutorService executorService, zzgoe zzgoeVar) {
        this.zza = zzgctVar;
        this.zzc = zzgctVar2;
        this.zze = zzikaVar;
        this.zzb = zzgctVar3;
        this.zzd = zzgctVar4;
        this.zzf = zzikaVar2;
        this.zzg = file;
        this.zzh = executorService;
        this.zzi = zzgoeVar;
    }

    private final As zzj(byte[] bArr) {
        As asZzc = this.zzd.zzc(bArr);
        this.zzi.zze(15305, asZzc);
        return asZzc;
    }

    private final As zzk(zzgdu zzgduVar) {
        As asZzc = this.zzb.zzc(zzgduVar);
        this.zzi.zze(15303, asZzc);
        return asZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final As zza() {
        return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzglc
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new Boolean(this.zza.zzf());
            }
        }, this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final As zzb() {
        As asZzb = this.zza.zzb();
        this.zzi.zze(15302, asZzb);
        return asZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final As zzc(final zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        As asZzc = ((zzgct) this.zzf.zzb()).zzc(bArr);
        this.zzi.zze(15307, asZzc);
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzgzo.zzl(asZzc, zzj(bArr2))), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzglb
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zzi(zzgduVar, (List) obj);
            }
        }, zzhaf.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final As zzd(final zzgdu zzgduVar, byte[] bArr) {
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzj(bArr)), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgla
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zzh(zzgduVar, (Void) obj);
            }
        }, zzhaf.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgky
    public final As zze() {
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzk(zzgzg.zzw(this.zza.zzb()), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgkz
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzg((zzgdu) obj);
            }
        }, zzhaf.zza());
        this.zzi.zze(15314, zzgzgVar);
        return zzgzgVar;
    }

    public final /* synthetic */ boolean zzf() {
        File fileZza;
        try {
            zzgct zzgctVar = this.zzb;
            File fileZza2 = zzgctVar.zza();
            if (fileZza2.exists()) {
                File fileZza3 = ((zzgct) this.zzf.zzb()).zza();
                File fileZza4 = ((zzgct) this.zze.zzb()).zza();
                try {
                    if (fileZza3.exists()) {
                        File parentFile = fileZza4.getParentFile();
                        if (parentFile != null) {
                            zzfws.zze(parentFile);
                        }
                        zzgxm.zzb(fileZza4);
                        zzgxm.zzc(fileZza3, fileZza4);
                    }
                    File fileZza5 = this.zzd.zza();
                    File fileZza6 = this.zzc.zza();
                    try {
                        if (fileZza5.exists()) {
                            zzgxm.zzb(fileZza6);
                            zzgxm.zzc(fileZza5, fileZza6);
                        }
                        fileZza = this.zza.zza();
                    } catch (IOException | SecurityException e) {
                        this.zzi.zzd(15312, e);
                    }
                    try {
                        if (fileZza2.exists()) {
                            zzgxm.zzb(fileZza);
                            zzgxm.zzc(fileZza2, fileZza);
                        }
                        this.zzb.zza().delete();
                        ((zzgct) this.zzf.zzb()).zza().delete();
                        this.zzd.zza().delete();
                        return true;
                    } catch (IOException | SecurityException e2) {
                        this.zzi.zzd(15313, e2);
                        zzgctVar = this.zzb;
                        zzgctVar.zza().delete();
                        ((zzgct) this.zzf.zzb()).zza().delete();
                        this.zzd.zza().delete();
                        return false;
                    }
                } catch (IOException e3) {
                    e = e3;
                    this.zzi.zzd(15311, e);
                    zzgctVar = this.zzb;
                    zzgctVar.zza().delete();
                    ((zzgct) this.zzf.zzb()).zza().delete();
                    this.zzd.zza().delete();
                    return false;
                } catch (SecurityException e4) {
                    e = e4;
                    this.zzi.zzd(15311, e);
                    zzgctVar = this.zzb;
                    zzgctVar.zza().delete();
                    ((zzgct) this.zzf.zzb()).zza().delete();
                    this.zzd.zza().delete();
                    return false;
                }
            }
            zzgctVar.zza().delete();
            ((zzgct) this.zzf.zzb()).zza().delete();
            this.zzd.zza().delete();
            return false;
        } catch (Throwable th) {
            this.zzb.zza().delete();
            ((zzgct) this.zzf.zzb()).zza().delete();
            this.zzd.zza().delete();
            throw th;
        }
    }

    public final /* synthetic */ zzfwq zzg(zzgdu zzgduVar) {
        if (zzgduVar == null || zzgduVar.equals(zzgdu.zzg())) {
            return null;
        }
        zzbcp zzbcpVarZza = zzgduVar.zza();
        File fileZza = ((zzgct) this.zze.zzb()).zza();
        zzgct zzgctVar = this.zzc;
        return new zzfwq(zzbcpVarZza, fileZza, zzgctVar.zza(), this.zzg);
    }

    public final /* synthetic */ As zzh(zzgdu zzgduVar, Void r2) {
        return zzk(zzgduVar);
    }

    public final /* synthetic */ As zzi(zzgdu zzgduVar, List list) {
        return zzk(zzgduVar);
    }
}
