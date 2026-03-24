package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.List;

/* loaded from: classes.dex */
final class zzgmj implements zzgmg {
    private final zzgct zza;
    private final zzgct zzb;
    private final zzika zzc;
    private final zzgoe zzd;

    public zzgmj(zzgct zzgctVar, zzgct zzgctVar2, zzika zzikaVar, zzgoe zzgoeVar) {
        this.zza = zzgctVar;
        this.zzb = zzgctVar2;
        this.zzc = zzikaVar;
        this.zzd = zzgoeVar;
    }

    private final As zzh(zzgdu zzgduVar) {
        As asZzc = this.zza.zzc(zzgduVar);
        this.zzd.zze(20303, asZzc);
        return asZzc;
    }

    private final As zzi(byte[] bArr) {
        As asZzc = this.zzb.zzc(bArr);
        this.zzd.zze(20305, asZzc);
        return asZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final As zza() {
        return zzgzo.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final As zzb() {
        As asZzb = this.zza.zzb();
        this.zzd.zze(20302, asZzb);
        return asZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final As zzc(final zzgdu zzgduVar, byte[] bArr, byte[] bArr2) {
        As asZzc = ((zzgct) this.zzc.zzb()).zzc(bArr);
        this.zzd.zze(20307, asZzc);
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzgzo.zzl(asZzc, zzi(bArr2))), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgmh
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zzg(zzgduVar, (List) obj);
            }
        }, zzhaf.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final As zzd(final zzgdu zzgduVar, byte[] bArr) {
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzi(bArr)), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgmi
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zzf(zzgduVar, (Void) obj);
            }
        }, zzhaf.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgmg
    public final As zze() {
        As asZzb = this.zzb.zzb();
        this.zzd.zze(20304, asZzb);
        return asZzb;
    }

    public final /* synthetic */ As zzf(zzgdu zzgduVar, Void r2) {
        return zzh(zzgduVar);
    }

    public final /* synthetic */ As zzg(zzgdu zzgduVar, List list) {
        return zzh(zzgduVar);
    }
}
