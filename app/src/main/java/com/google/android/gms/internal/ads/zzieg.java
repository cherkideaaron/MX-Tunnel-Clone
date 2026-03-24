package com.google.android.gms.internal.ads;

import defpackage.AbstractC3219pQ;
import defpackage.AbstractC3264qG;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzieg {
    private static final zzieg zza = new zzieg(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzieg() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzieg zza() {
        return zza;
    }

    public static zzieg zzb() {
        return new zzieg();
    }

    public static zzieg zzc(zzieg zziegVar, zzieg zziegVar2) {
        int i = zziegVar.zzb + zziegVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zziegVar.zzc, i);
        System.arraycopy(zziegVar2.zzc, 0, iArrCopyOf, zziegVar.zzb, zziegVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zziegVar.zzd, i);
        System.arraycopy(zziegVar2.zzd, 0, objArrCopyOf, zziegVar.zzb, zziegVar2.zzb);
        return new zzieg(i, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zzn(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzieg)) {
            return false;
        }
        zzieg zziegVar = (zzieg) obj;
        int i = this.zzb;
        if (i == zziegVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zziegVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zziegVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzf(zzieu zzieuVar) {
        for (int i = 0; i < this.zzb; i++) {
            zzieuVar.zzv(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzg(zzieu zzieuVar) {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzieuVar.zzc(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzieuVar.zzj(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzieuVar.zzn(i4, (zzian) obj);
                } else if (i3 == 3) {
                    zzieuVar.zzt(i4);
                    ((zzieg) obj).zzg(zzieuVar);
                    zzieuVar.zzu(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new zzicf("Protocol message tag had invalid wire type."));
                    }
                    zzieuVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iD = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2] >>> 3;
            zzian zzianVar = (zzian) this.zzd[i2];
            int iZzA = zziaw.zzA(8);
            int iZzA2 = zziaw.zzA(i3) + zziaw.zzA(16);
            int iZzA3 = zziaw.zzA(24);
            int iZzc = zzianVar.zzc();
            iD = AbstractC3264qG.d(iZzA + iZzA, iZzA2, AbstractC3219pQ.b(iZzc, iZzc, iZzA3), iD);
        }
        this.zze = iD;
        return iD;
    }

    public final int zzi() {
        int iZzA;
        int iZzB;
        int iZzA2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iC = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.zzd[i2]).getClass();
                    iZzA2 = zziaw.zzA(i4 << 3) + 8;
                } else if (i5 == 2) {
                    int i6 = i4 << 3;
                    zzian zzianVar = (zzian) this.zzd[i2];
                    int iZzA3 = zziaw.zzA(i6);
                    int iZzc = zzianVar.zzc();
                    iC = AbstractC3219pQ.c(iZzc, iZzc, iZzA3, iC);
                } else if (i5 == 3) {
                    int iZzA4 = zziaw.zzA(i4 << 3);
                    iZzA = iZzA4 + iZzA4;
                    iZzB = ((zzieg) this.zzd[i2]).zzi();
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException(new zzicf("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i2]).getClass();
                    iZzA2 = zziaw.zzA(i4 << 3) + 4;
                }
                iC = iZzA2 + iC;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.zzd[i2]).longValue();
                iZzA = zziaw.zzA(i7);
                iZzB = zziaw.zzB(jLongValue);
            }
            iC = iZzB + iZzA + iC;
        }
        this.zze = iC;
        return iC;
    }

    public final void zzj(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzide.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzk(int i, Object obj) {
        zze();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final boolean zzl(int i, zziaq zziaqVar) throws zzicf {
        int iZza;
        zze();
        int i2 = i & 7;
        if (i2 == 0) {
            zzk(i, Long.valueOf(zziaqVar.zzg()));
            return true;
        }
        if (i2 == 1) {
            zzk(i, Long.valueOf(zziaqVar.zzi()));
            return true;
        }
        if (i2 == 2) {
            zzk(i, zziaqVar.zzn());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                zziaqVar.zzI();
                return false;
            }
            if (i2 != 5) {
                throw new zzicf("Protocol message tag had invalid wire type.");
            }
            zzk(i, Integer.valueOf(zziaqVar.zzj()));
            return true;
        }
        zzieg zziegVar = new zzieg();
        do {
            iZza = zziaqVar.zza();
            if (iZza == 0) {
                break;
            }
        } while (zziegVar.zzl(iZza, zziaqVar));
        zziaqVar.zzb(4 | ((i >>> 3) << 3));
        zzk(i, zziegVar);
        return true;
    }

    public final zzieg zzm(zzieg zziegVar) {
        if (zziegVar.equals(zza)) {
            return this;
        }
        zze();
        int i = this.zzb + zziegVar.zzb;
        zzn(i);
        System.arraycopy(zziegVar.zzc, 0, this.zzc, this.zzb, zziegVar.zzb);
        System.arraycopy(zziegVar.zzd, 0, this.zzd, this.zzb, zziegVar.zzb);
        this.zzb = i;
        return this;
    }

    private zzieg(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }
}
