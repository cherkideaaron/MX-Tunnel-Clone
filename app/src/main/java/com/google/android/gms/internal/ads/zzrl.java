package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import defpackage.Vs;

/* loaded from: classes.dex */
final class zzrl {
    private final zzrk zza;
    private final int zzb;
    private final zzsj zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    public zzrl(AudioTrack audioTrack, zzsj zzsjVar) {
        this.zza = new zzrk(audioTrack);
        this.zzb = audioTrack.getSampleRate();
        this.zzc = zzsjVar;
        zzf(0);
    }

    private final void zzf(int i) {
        this.zzd = i;
        long j = 10000;
        if (i == 0) {
            this.zzg = 0L;
            this.zzh = -1L;
            this.zzi = -9223372036854775807L;
            this.zze = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.zzf = 10000L;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.zzf = j;
    }

    private final long zzg(long j, float f) {
        zzrk zzrkVar = this.zza;
        return zzh(zzrkVar.zzc(), zzrkVar.zzb(), j, f);
    }

    private final long zzh(long j, long j2, long j3, float f) {
        long j4 = j3 - j2;
        return zzfj.zzv(j4, f) + zzfj.zzr(j, this.zzb);
    }

    public final void zza(long j, float f, long j2) {
        boolean z;
        int i;
        StringBuilder sb;
        if (j - this.zzg < this.zzf) {
            return;
        }
        this.zzg = j;
        zzrk zzrkVar = this.zza;
        boolean zZza = zzrkVar.zza();
        if (zZza) {
            long jZzb = zzrkVar.zzb();
            long jZzg = zzg(j, f);
            if (Math.abs(jZzb - j) > 5000000) {
                zzsj zzsjVar = this.zzc;
                long jZzc = zzrkVar.zzc();
                long jZzq = ((zzrw) zzsjVar).zza.zzq();
                int length = String.valueOf(jZzc).length();
                int length2 = String.valueOf(jZzb).length();
                int length3 = String.valueOf(j).length();
                int length4 = length + 52 + length2 + 2 + length3 + 2 + String.valueOf(j2).length() + 2;
                z = zZza;
                sb = new StringBuilder(length4 + String.valueOf(jZzq).length());
                Vs.y(sb, "Spurious audio timestamp (system clock mismatch): ", jZzc, ", ");
                sb.append(jZzb);
                Vs.y(sb, ", ", j, ", ");
                sb.append(j2);
                sb.append(", ");
                sb.append(jZzq);
            } else {
                z = zZza;
                if (Math.abs(jZzg - j2) > 5000000) {
                    zzsj zzsjVar2 = this.zzc;
                    long jZzc2 = zzrkVar.zzc();
                    long jZzq2 = ((zzrw) zzsjVar2).zza.zzq();
                    int length5 = String.valueOf(jZzc2).length();
                    int length6 = String.valueOf(jZzb).length();
                    int length7 = String.valueOf(j).length();
                    sb = new StringBuilder(length5 + 54 + length6 + 2 + length7 + 2 + String.valueOf(j2).length() + 2 + String.valueOf(jZzq2).length());
                    Vs.y(sb, "Spurious audio timestamp (frame position mismatch): ", jZzc2, ", ");
                    sb.append(jZzb);
                    Vs.y(sb, ", ", j, ", ");
                    sb.append(j2);
                    sb.append(", ");
                    sb.append(jZzq2);
                } else if (this.zzd == 4) {
                    i = 0;
                    zzf(i);
                }
            }
            zzee.zzc("AudioTrackAudioOutput", sb.toString());
            i = 4;
            zzf(i);
        } else {
            z = zZza;
        }
        int i2 = this.zzd;
        if (i2 == 0) {
            if (!z) {
                if (j - this.zze > 500000) {
                    zzf(3);
                    return;
                }
                return;
            } else {
                if (zzrkVar.zzb() >= this.zze) {
                    this.zzh = zzrkVar.zzc();
                    this.zzi = zzrkVar.zzb();
                    zzf(1);
                    return;
                }
                return;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                if (z) {
                    return;
                }
                zzf(0);
                return;
            } else {
                if (i2 == 3 && z) {
                    zzf(0);
                    return;
                }
                return;
            }
        }
        if (!z) {
            zzf(0);
            return;
        }
        long jZzc3 = zzrkVar.zzc();
        long j3 = this.zzh;
        if (jZzc3 > j3) {
            if (Math.abs(zzg(j, f) - zzh(j3, this.zzi, j, f)) < 1000) {
                zzf(2);
                return;
            }
        }
        if (j - this.zze > 2000000) {
            zzf(3);
        } else {
            this.zzh = zzrkVar.zzc();
            this.zzi = zzrkVar.zzb();
        }
    }

    public final boolean zzb() {
        return this.zzd == 2;
    }

    public final boolean zzc() {
        int i = this.zzd;
        return i == 0 || i == 1;
    }

    public final void zzd() {
        zzf(0);
    }

    public final long zze(long j, float f) {
        return zzg(j, f);
    }
}
