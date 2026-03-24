package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzxw {
    private final zzaan zza;
    private final zzer zzb = new zzer(32);
    private zzxv zzc;
    private zzxv zzd;
    private zzxv zze;
    private long zzf;

    public zzxw(zzaan zzaanVar) {
        this.zza = zzaanVar;
        zzxv zzxvVar = new zzxv(0L, 65536);
        this.zzc = zzxvVar;
        this.zzd = zzxvVar;
        this.zze = zzxvVar;
    }

    private final int zzi(int i) {
        zzxv zzxvVar = this.zze;
        if (zzxvVar.zzc == null) {
            zzaal zzaalVarZza = this.zza.zza();
            zzxv zzxvVar2 = new zzxv(this.zze.zzb, 65536);
            zzxvVar.zzc = zzaalVarZza;
            zzxvVar.zzd = zzxvVar2;
        }
        return Math.min(i, (int) (this.zze.zzb - this.zzf));
    }

    private final void zzj(int i) {
        long j = this.zzf + i;
        this.zzf = j;
        zzxv zzxvVar = this.zze;
        if (j == zzxvVar.zzb) {
            this.zze = zzxvVar.zzd;
        }
    }

    private static zzxv zzk(zzxv zzxvVar, zzih zzihVar, zzxx zzxxVar, zzer zzerVar) {
        zzxv zzxvVarZzm;
        int iZzt;
        if (zzihVar.zzk()) {
            long j = zzxxVar.zzb;
            zzerVar.zza(1);
            zzxv zzxvVarZzm2 = zzm(zzxvVar, j, zzerVar.zzi(), 1);
            long j2 = j + 1;
            byte b = zzerVar.zzi()[0];
            int i = b & 128;
            int i2 = b & 127;
            zzie zzieVar = zzihVar.zzb;
            byte[] bArr = zzieVar.zza;
            if (bArr == null) {
                zzieVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i != 0;
            zzxvVarZzm = zzm(zzxvVarZzm2, j2, zzieVar.zza, i2);
            long j3 = j2 + i2;
            if (z) {
                zzerVar.zza(2);
                zzxvVarZzm = zzm(zzxvVarZzm, j3, zzerVar.zzi(), 2);
                j3 += 2;
                iZzt = zzerVar.zzt();
            } else {
                iZzt = 1;
            }
            int[] iArr = zzieVar.zzd;
            if (iArr == null || iArr.length < iZzt) {
                iArr = new int[iZzt];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzieVar.zze;
            if (iArr3 == null || iArr3.length < iZzt) {
                iArr3 = new int[iZzt];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i3 = iZzt * 6;
                zzerVar.zza(i3);
                zzxvVarZzm = zzm(zzxvVarZzm, j3, zzerVar.zzi(), i3);
                j3 += i3;
                zzerVar.zzh(0);
                for (int i4 = 0; i4 < iZzt; i4++) {
                    iArr2[i4] = zzerVar.zzt();
                    iArr4[i4] = zzerVar.zzH();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzxxVar.zza - ((int) (j3 - zzxxVar.zzb));
            }
            zzagg zzaggVar = zzxxVar.zzc;
            String str = zzfj.zza;
            zzieVar.zza(iZzt, iArr2, iArr4, zzaggVar.zzb, zzieVar.zza, zzaggVar.zza, zzaggVar.zzc, zzaggVar.zzd);
            long j4 = zzxxVar.zzb;
            int i5 = (int) (j3 - j4);
            zzxxVar.zzb = j4 + i5;
            zzxxVar.zza -= i5;
        } else {
            zzxvVarZzm = zzxvVar;
        }
        if (!zzihVar.zze()) {
            zzihVar.zzj(zzxxVar.zza);
            return zzl(zzxvVarZzm, zzxxVar.zzb, zzihVar.zzc, zzxxVar.zza);
        }
        zzerVar.zza(4);
        zzxv zzxvVarZzm3 = zzm(zzxvVarZzm, zzxxVar.zzb, zzerVar.zzi(), 4);
        int iZzH = zzerVar.zzH();
        zzxxVar.zzb += 4;
        zzxxVar.zza -= 4;
        zzihVar.zzj(iZzH);
        zzxv zzxvVarZzl = zzl(zzxvVarZzm3, zzxxVar.zzb, zzihVar.zzc, iZzH);
        zzxxVar.zzb += iZzH;
        int i6 = zzxxVar.zza - iZzH;
        zzxxVar.zza = i6;
        ByteBuffer byteBuffer = zzihVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i6) {
            zzihVar.zzf = ByteBuffer.allocate(i6);
        } else {
            zzihVar.zzf.clear();
        }
        return zzl(zzxvVarZzl, zzxxVar.zzb, zzihVar.zzf, zzxxVar.zza);
    }

    private static zzxv zzl(zzxv zzxvVar, long j, ByteBuffer byteBuffer, int i) {
        zzxv zzxvVarZzn = zzn(zzxvVar, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (zzxvVarZzn.zzb - j));
            byteBuffer.put(zzxvVarZzn.zzc.zza, zzxvVarZzn.zzb(j), iMin);
            i -= iMin;
            j += iMin;
            if (j == zzxvVarZzn.zzb) {
                zzxvVarZzn = zzxvVarZzn.zzd;
            }
        }
        return zzxvVarZzn;
    }

    private static zzxv zzm(zzxv zzxvVar, long j, byte[] bArr, int i) {
        zzxv zzxvVarZzn = zzn(zzxvVar, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (zzxvVarZzn.zzb - j));
            System.arraycopy(zzxvVarZzn.zzc.zza, zzxvVarZzn.zzb(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += iMin;
            if (j == zzxvVarZzn.zzb) {
                zzxvVarZzn = zzxvVarZzn.zzd;
            }
        }
        return zzxvVarZzn;
    }

    private static zzxv zzn(zzxv zzxvVar, long j) {
        while (j >= zzxvVar.zzb) {
            zzxvVar = zzxvVar.zzd;
        }
        return zzxvVar;
    }

    public final void zza() {
        zzxv zzxvVar = this.zzc;
        if (zzxvVar.zzc != null) {
            this.zza.zzc(zzxvVar);
            zzxvVar.zzc();
        }
        this.zzc.zza(0L, 65536);
        zzxv zzxvVar2 = this.zzc;
        this.zzd = zzxvVar2;
        this.zze = zzxvVar2;
        this.zzf = 0L;
        this.zza.zzd();
    }

    public final void zzb() {
        this.zzd = this.zzc;
    }

    public final void zzc(zzih zzihVar, zzxx zzxxVar) {
        this.zzd = zzk(this.zzd, zzihVar, zzxxVar, this.zzb);
    }

    public final void zzd(zzih zzihVar, zzxx zzxxVar) {
        zzk(this.zzd, zzihVar, zzxxVar, this.zzb);
    }

    public final void zze(long j) {
        zzxv zzxvVar;
        if (j != -1) {
            while (true) {
                zzxvVar = this.zzc;
                if (j < zzxvVar.zzb) {
                    break;
                }
                this.zza.zzb(zzxvVar.zzc);
                this.zzc = this.zzc.zzc();
            }
            if (this.zzd.zza < zzxvVar.zza) {
                this.zzd = zzxvVar;
            }
        }
    }

    public final long zzf() {
        return this.zzf;
    }

    public final int zzg(zzj zzjVar, int i, boolean z) throws EOFException {
        int iZzi = zzi(i);
        zzxv zzxvVar = this.zze;
        int iZza = zzjVar.zza(zzxvVar.zzc.zza, zzxvVar.zzb(this.zzf), iZzi);
        if (iZza != -1) {
            zzj(iZza);
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzh(zzer zzerVar, int i) {
        while (i > 0) {
            int iZzi = zzi(i);
            zzxv zzxvVar = this.zze;
            zzerVar.zzm(zzxvVar.zzc.zza, zzxvVar.zzb(this.zzf), iZzi);
            i -= iZzi;
            zzj(iZzi);
        }
    }
}
