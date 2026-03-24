package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import defpackage.As;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
final class zzgkn implements zzgkg {
    private final Context zza;
    private final zzika zzb;
    private final zzgkx zzc;
    private final zzgoe zzd;
    private final ExecutorService zze;
    private final zzgje zzf;
    private final zzfvh zzg;

    public zzgkn(Context context, zzika zzikaVar, zzgkx zzgkxVar, zzgoe zzgoeVar, ExecutorService executorService, zzgje zzgjeVar, zzfvh zzfvhVar) {
        this.zza = context;
        this.zzb = zzikaVar;
        this.zzc = zzgkxVar;
        this.zzd = zzgoeVar;
        this.zze = executorService;
        this.zzf = zzgjeVar;
        this.zzg = zzfvhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgds zzf(int i) {
        zzgdr zzgdrVarZzd = zzgds.zzd();
        zzgdrVarZzd.zze(i);
        return (zzgds) zzgdrVarZzd.zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzgkg
    public final As zza() {
        final zzika zzikaVar = this.zzb;
        Objects.requireNonNull(zzikaVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzgki
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzikaVar.zzb();
            }
        };
        ExecutorService executorService = this.zze;
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzk(zzgzg.zzw(zzgzo.zzd(callable, executorService)), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgkm
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zzb((zzbch) obj);
                return new Integer(0);
            }
        }, zzhaf.zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgkj
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ As zza(Object obj) {
                return this.zza.zzc((Integer) obj);
            }
        }, zzhaf.zza()), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgkk
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzd((zzgdu) obj);
            }
        }, executorService), zzgkh.class, zzgkl.zza, zzhaf.zza());
        this.zzd.zze(15202, zzgzgVar);
        return zzgzgVar;
    }

    public final /* synthetic */ int zzb(zzbch zzbchVar) {
        if (zzfwe.zza(zzbchVar)) {
            return 0;
        }
        this.zzd.zzc(15204, zzbchVar.name());
        throw new zzgkh(null);
    }

    public final /* synthetic */ As zzc(Integer num) {
        return this.zzc.zzb();
    }

    public final /* synthetic */ zzgds zzd(zzgdu zzgduVar) {
        int i;
        zzgoe zzgoeVar;
        int i2;
        String strZza = zzgduVar.zza().zza();
        String strZzb = zzgduVar.zza().zzb();
        zzgoc zzgocVarZza = this.zzd.zza(15203);
        try {
            zzgocVarZza.zza();
            zzfwv zzfwvVarZza = zzfvq.zza(this.zza, 1, (zzbch) this.zzb.zzb(), strZza, strZzb, "1", this.zzg);
            zzgocVarZza.zzc();
            int i3 = 2;
            if (zzfwvVarZza.zzc == 2) {
                this.zzd.zzb(15208);
                return zzf(4);
            }
            byte[] bArr = zzfwvVarZza.zzb;
            if (bArr == null || bArr.length == 0) {
                this.zzd.zzb(5010);
                i = 8;
            } else {
                try {
                    zzbcj zzbcjVarZze = zzbcj.zze(bArr, zzibb.zzb());
                    if (zzbcjVarZze.zza().zza().isEmpty() || zzbcjVarZze.zza().zzb().isEmpty() || zzbcjVarZze.zzc().zzy().length == 0) {
                        zzgoeVar = this.zzd;
                        i2 = 15207;
                    } else {
                        if (zzgduVar.equals(zzgdu.zzg()) || !TextUtils.equals(zzgduVar.zza().zza(), zzbcjVarZze.zza().zza()) || !TextUtils.equals(zzgduVar.zza().zzb(), zzbcjVarZze.zza().zzb())) {
                            int i4 = zzfwvVarZza.zzc;
                            if (i4 == 4) {
                                if (this.zzf.zza(zzbcjVarZze.zzb().zzy())) {
                                    i4 = 4;
                                } else {
                                    this.zzd.zzb(15206);
                                    i = 12;
                                }
                            }
                            zzgdr zzgdrVarZzd = zzgds.zzd();
                            if (i4 == 2) {
                                i3 = 4;
                            } else if (i4 != 3) {
                                i3 = i4 != 4 ? i4 != 6 ? 1 : 5 : 3;
                            }
                            zzgdrVarZzd.zze(i3);
                            zzgdt zzgdtVarZze = zzgdu.zze();
                            zzgdtVarZze.zza(zzbcjVarZze.zza());
                            zzgdtVarZze.zzc((zzbch) this.zzb.zzb());
                            zzgdrVarZzd.zza((zzgdu) zzgdtVarZze.zzbu());
                            zzgdrVarZzd.zzd(zzbcjVarZze.zzb());
                            zzgdrVarZzd.zzc(zzbcjVarZze.zzc());
                            return (zzgds) zzgdrVarZzd.zzbu();
                        }
                        zzgoeVar = this.zzd;
                        i2 = 15209;
                    }
                    zzgoeVar.zzb(i2);
                    i = 11;
                } catch (zzicg e) {
                    this.zzd.zzd(15205, e);
                    i = 9;
                } catch (NullPointerException unused) {
                    this.zzd.zzb(15210);
                    i = 10;
                }
            }
            return zzf(i);
        } catch (Throwable th) {
            try {
                zzgocVarZza.zzb(th);
                throw th;
            } catch (Throwable th2) {
                zzgocVarZza.zzc();
                throw th2;
            }
        }
    }
}
