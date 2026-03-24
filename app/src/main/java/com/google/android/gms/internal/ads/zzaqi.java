package com.google.android.gms.internal.ads;

import defpackage.Vs;
import java.math.RoundingMode;

/* loaded from: classes.dex */
final class zzaqi implements zzaqh {
    private final zzaex zza;
    private final zzagh zzb;
    private final zzaql zzc;
    private final zzv zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaqi(zzaex zzaexVar, zzagh zzaghVar, zzaql zzaqlVar, String str, int i) throws zzat {
        this.zza = zzaexVar;
        this.zzb = zzaghVar;
        this.zzc = zzaqlVar;
        int i2 = zzaqlVar.zzb * zzaqlVar.zze;
        int i3 = zzaqlVar.zzd;
        int i4 = i2 / 8;
        if (i3 != i4) {
            throw zzat.zzb(Vs.n(new StringBuilder(String.valueOf(i4).length() + 28 + String.valueOf(i3).length()), "Expected block size: ", i4, "; got: ", i3), null);
        }
        int i5 = zzaqlVar.zzc * i4;
        int i6 = i5 * 8;
        int iMax = Math.max(i4, i5 / 10);
        this.zze = iMax;
        zzt zztVar = new zzt();
        zztVar.zzl("audio/wav");
        zztVar.zzm(str);
        zztVar.zzh(i6);
        zztVar.zzi(i6);
        zztVar.zzn(iMax);
        zztVar.zzE(zzaqlVar.zzb);
        zztVar.zzF(zzaqlVar.zzc);
        zztVar.zzG(i);
        this.zzd = zztVar.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(int i, long j) {
        zzaqo zzaqoVar = new zzaqo(this.zzc, 1, i, j);
        this.zza.zzw(zzaqoVar);
        zzagh zzaghVar = this.zzb;
        zzaghVar.zzz(this.zzd);
        zzaghVar.zzN(zzaqoVar.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final boolean zzc(zzaev zzaevVar, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.zzg) < (i2 = this.zze)) {
            int iZza = this.zzb.zza(zzaevVar, (int) Math.min(i2 - i, j2), true);
            if (iZza == -1) {
                j2 = 0;
            } else {
                this.zzg += iZza;
                j2 -= iZza;
            }
        }
        zzaql zzaqlVar = this.zzc;
        int i3 = this.zzg;
        int i4 = zzaqlVar.zzd;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long jZzt = this.zzf + zzfj.zzt(this.zzh, 1000000L, zzaqlVar.zzc, RoundingMode.DOWN);
            int i6 = i5 * i4;
            int i7 = this.zzg - i6;
            this.zzb.zze(jZzt, 1, i6, i7, null);
            this.zzh += i5;
            this.zzg = i7;
        }
        return j2 <= 0;
    }
}
