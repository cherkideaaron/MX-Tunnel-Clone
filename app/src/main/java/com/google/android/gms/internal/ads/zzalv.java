package com.google.android.gms.internal.ads;

import defpackage.AbstractC3219pQ;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
final class zzalv extends zzalt {
    private zzalu zza;
    private int zzb;
    private boolean zzc;
    private zzagm zzd;
    private zzagk zze;

    @Override // com.google.android.gms.internal.ads.zzalt
    public final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final long zzb(zzer zzerVar) {
        if ((zzerVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzerVar.zzi()[0];
        zzalu zzaluVar = this.zza;
        zzaluVar.getClass();
        int i = !zzaluVar.zzd[(b >> 1) & (255 >>> (8 - zzaluVar.zze))].zza ? zzaluVar.zza.zze : zzaluVar.zza.zzf;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzerVar.zzj() < zzerVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzerVar.zzi(), zzerVar.zze() + 4);
            zzerVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzerVar.zzf(zzerVar.zze() + 4);
        }
        long j = i2;
        byte[] bArrZzi = zzerVar.zzi();
        bArrZzi[zzerVar.zze() - 4] = (byte) (j & 255);
        bArrZzi[zzerVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        bArrZzi[zzerVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        bArrZzi[zzerVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzer zzerVar, long j, zzalr zzalrVar) throws zzat {
        zzalu zzaluVar;
        int i;
        int iZzb;
        int i2;
        zzagm zzagmVar;
        if (this.zza != null) {
            zzalrVar.zza.getClass();
            return false;
        }
        zzagm zzagmVar2 = this.zzd;
        int i3 = 4;
        if (zzagmVar2 == null) {
            zzagn.zzd(1, zzerVar, false);
            int iZzI = zzerVar.zzI();
            int iZzs = zzerVar.zzs();
            int iZzI2 = zzerVar.zzI();
            int iZzC = zzerVar.zzC();
            int i4 = iZzC <= 0 ? -1 : iZzC;
            int iZzC2 = zzerVar.zzC();
            int i5 = iZzC2 <= 0 ? -1 : iZzC2;
            int iZzC3 = zzerVar.zzC();
            int i6 = iZzC3 <= 0 ? -1 : iZzC3;
            int iZzs2 = zzerVar.zzs();
            this.zzd = new zzagm(iZzI, iZzs, iZzI2, i4, i5, i6, (int) Math.pow(2.0d, iZzs2 & 15), (int) Math.pow(2.0d, (iZzs2 & 240) >> 4), 1 == (zzerVar.zzs() & 1), Arrays.copyOf(zzerVar.zzi(), zzerVar.zze()));
        } else {
            zzagk zzagkVar = this.zze;
            if (zzagkVar == null) {
                this.zze = zzagn.zzb(zzerVar, true, true);
            } else {
                byte[] bArr = new byte[zzerVar.zze()];
                System.arraycopy(zzerVar.zzi(), 0, bArr, 0, zzerVar.zze());
                int i7 = zzagmVar2.zza;
                int i8 = 5;
                zzagn.zzd(5, zzerVar, false);
                int iZzs3 = zzerVar.zzs() + 1;
                zzagj zzagjVar = new zzagj(zzerVar.zzi());
                zzagjVar.zzc(zzerVar.zzg() * 8);
                int i9 = 0;
                while (true) {
                    int i10 = 2;
                    int i11 = 16;
                    if (i9 >= iZzs3) {
                        zzagm zzagmVar3 = zzagmVar2;
                        int i12 = 6;
                        int iZzb2 = zzagjVar.zzb(6) + 1;
                        for (int i13 = 0; i13 < iZzb2; i13++) {
                            if (zzagjVar.zzb(16) != 0) {
                                throw zzat.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i14 = 1;
                        int iZzb3 = zzagjVar.zzb(6) + 1;
                        int i15 = 0;
                        while (true) {
                            int i16 = 3;
                            if (i15 < iZzb3) {
                                int iZzb4 = zzagjVar.zzb(i11);
                                if (iZzb4 == 0) {
                                    i2 = iZzb3;
                                    int i17 = 8;
                                    zzagjVar.zzc(8);
                                    zzagjVar.zzc(16);
                                    zzagjVar.zzc(16);
                                    zzagjVar.zzc(6);
                                    zzagjVar.zzc(8);
                                    int iZzb5 = zzagjVar.zzb(4) + 1;
                                    int i18 = 0;
                                    while (i18 < iZzb5) {
                                        zzagjVar.zzc(i17);
                                        i18++;
                                        i17 = 8;
                                    }
                                } else {
                                    if (iZzb4 != i14) {
                                        StringBuilder sb = new StringBuilder(AbstractC3219pQ.a(iZzb4, 41));
                                        sb.append("floor type greater than 1 not decodable: ");
                                        sb.append(iZzb4);
                                        throw zzat.zzb(sb.toString(), null);
                                    }
                                    int iZzb6 = zzagjVar.zzb(i8);
                                    int[] iArr = new int[iZzb6];
                                    int i19 = -1;
                                    for (int i20 = 0; i20 < iZzb6; i20++) {
                                        int iZzb7 = zzagjVar.zzb(4);
                                        iArr[i20] = iZzb7;
                                        if (iZzb7 > i19) {
                                            i19 = iZzb7;
                                        }
                                    }
                                    int i21 = i19 + 1;
                                    int[] iArr2 = new int[i21];
                                    int i22 = 0;
                                    while (i22 < i21) {
                                        iArr2[i22] = zzagjVar.zzb(i16) + 1;
                                        int iZzb8 = zzagjVar.zzb(i10);
                                        int i23 = 8;
                                        if (iZzb8 > 0) {
                                            zzagjVar.zzc(8);
                                        }
                                        int i24 = iZzb3;
                                        int i25 = 0;
                                        for (int i26 = 1; i25 < (i26 << iZzb8); i26 = 1) {
                                            zzagjVar.zzc(i23);
                                            i25++;
                                            i23 = 8;
                                        }
                                        i22++;
                                        iZzb3 = i24;
                                        i10 = 2;
                                        i16 = 3;
                                    }
                                    i2 = iZzb3;
                                    zzagjVar.zzc(i10);
                                    int iZzb9 = zzagjVar.zzb(4);
                                    int i27 = 0;
                                    int i28 = 0;
                                    for (int i29 = 0; i29 < iZzb6; i29++) {
                                        i27 += iArr2[iArr[i29]];
                                        while (i28 < i27) {
                                            zzagjVar.zzc(iZzb9);
                                            i28++;
                                        }
                                    }
                                }
                                i15++;
                                iZzb3 = i2;
                                i12 = 6;
                                i10 = 2;
                                i11 = 16;
                                i14 = 1;
                                i8 = 5;
                            } else {
                                int i30 = 1;
                                int iZzb10 = zzagjVar.zzb(i12) + 1;
                                int i31 = 0;
                                while (i31 < iZzb10) {
                                    if (zzagjVar.zzb(16) > 2) {
                                        throw zzat.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzagjVar.zzc(24);
                                    zzagjVar.zzc(24);
                                    zzagjVar.zzc(24);
                                    int iZzb11 = zzagjVar.zzb(i12) + i30;
                                    int i32 = 8;
                                    zzagjVar.zzc(8);
                                    int[] iArr3 = new int[iZzb11];
                                    for (int i33 = 0; i33 < iZzb11; i33++) {
                                        iArr3[i33] = ((zzagjVar.zza() ? zzagjVar.zzb(5) : 0) * 8) + zzagjVar.zzb(3);
                                    }
                                    int i34 = 0;
                                    while (i34 < iZzb11) {
                                        int i35 = 0;
                                        while (i35 < i32) {
                                            if ((iArr3[i34] & (1 << i35)) != 0) {
                                                zzagjVar.zzc(i32);
                                            }
                                            i35++;
                                            i32 = 8;
                                        }
                                        i34++;
                                        i32 = 8;
                                    }
                                    i31++;
                                    i12 = 6;
                                    i30 = 1;
                                }
                                int iZzb12 = zzagjVar.zzb(i12) + 1;
                                for (int i36 = 0; i36 < iZzb12; i36++) {
                                    int iZzb13 = zzagjVar.zzb(16);
                                    if (iZzb13 != 0) {
                                        StringBuilder sb2 = new StringBuilder(AbstractC3219pQ.a(iZzb13, 41));
                                        sb2.append("mapping type other than 0 not supported: ");
                                        sb2.append(iZzb13);
                                        zzee.zze("VorbisUtil", sb2.toString());
                                    } else {
                                        if (zzagjVar.zza()) {
                                            i = 1;
                                            iZzb = zzagjVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            iZzb = 1;
                                        }
                                        if (zzagjVar.zza()) {
                                            int iZzb14 = zzagjVar.zzb(8) + i;
                                            for (int i37 = 0; i37 < iZzb14; i37++) {
                                                int i38 = i7 - 1;
                                                zzagjVar.zzc(zzagn.zza(i38));
                                                zzagjVar.zzc(zzagn.zza(i38));
                                            }
                                        }
                                        if (zzagjVar.zzb(2) != 0) {
                                            throw zzat.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i39 = 0; i39 < i7; i39++) {
                                                zzagjVar.zzc(4);
                                            }
                                        }
                                        for (int i40 = 0; i40 < iZzb; i40++) {
                                            zzagjVar.zzc(8);
                                            zzagjVar.zzc(8);
                                            zzagjVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb15 = zzagjVar.zzb(6);
                                int i41 = iZzb15 + 1;
                                zzagl[] zzaglVarArr = new zzagl[i41];
                                for (int i42 = 0; i42 < i41; i42++) {
                                    zzaglVarArr[i42] = new zzagl(zzagjVar.zza(), zzagjVar.zzb(16), zzagjVar.zzb(16), zzagjVar.zzb(8));
                                }
                                if (!zzagjVar.zza()) {
                                    throw zzat.zzb("framing bit after modes not set as expected", null);
                                }
                                zzaluVar = new zzalu(zzagmVar3, zzagkVar, bArr, zzaglVarArr, zzagn.zza(iZzb15));
                            }
                        }
                    } else {
                        if (zzagjVar.zzb(24) != 5653314) {
                            int iZzd = zzagjVar.zzd();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzd).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(iZzd);
                            throw zzat.zzb(sb3.toString(), null);
                        }
                        int iZzb16 = zzagjVar.zzb(16);
                        int iZzb17 = zzagjVar.zzb(24);
                        if (zzagjVar.zza()) {
                            zzagjVar.zzc(5);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzagjVar.zzb(zzagn.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZza = zzagjVar.zza();
                            for (int i43 = 0; i43 < iZzb17; i43++) {
                                if (!zZza || zzagjVar.zza()) {
                                    zzagjVar.zzc(5);
                                }
                            }
                        }
                        int iZzb19 = zzagjVar.zzb(i3);
                        if (iZzb19 > 2) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(iZzb19).length() + 42);
                            sb4.append("lookup type greater than 2 not decodable: ");
                            sb4.append(iZzb19);
                            throw zzat.zzb(sb4.toString(), null);
                        }
                        if (iZzb19 != 1) {
                            if (iZzb19 != 2) {
                                zzagmVar = zzagmVar2;
                            }
                            i9++;
                            zzagmVar2 = zzagmVar;
                            i3 = 4;
                        } else {
                            i10 = iZzb19;
                        }
                        zzagjVar.zzc(32);
                        zzagjVar.zzc(32);
                        int iZzb20 = zzagjVar.zzb(i3) + 1;
                        zzagjVar.zzc(1);
                        zzagmVar = zzagmVar2;
                        zzagjVar.zzc((int) ((i10 == 1 ? iZzb16 != 0 ? (long) Math.floor(Math.pow(iZzb17, 1.0d / iZzb16)) : 0L : iZzb16 * iZzb17) * iZzb20));
                        i9++;
                        zzagmVar2 = zzagmVar;
                        i3 = 4;
                    }
                }
            }
        }
        zzaluVar = null;
        this.zza = zzaluVar;
        if (zzaluVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzagm zzagmVar4 = zzaluVar.zza;
        arrayList.add(zzagmVar4.zzg);
        arrayList.add(zzaluVar.zzc);
        zzap zzapVarZzc = zzagn.zzc(zzguf.zzr(zzaluVar.zzb.zza));
        zzt zztVar = new zzt();
        zztVar.zzl("audio/ogg");
        zztVar.zzm("audio/vorbis");
        zztVar.zzh(zzagmVar4.zzd);
        zztVar.zzi(zzagmVar4.zzc);
        zztVar.zzE(zzagmVar4.zza);
        zztVar.zzF(zzagmVar4.zzb);
        zztVar.zzp(arrayList);
        zztVar.zzk(zzapVarZzc);
        zzalrVar.zza = zztVar.zzM();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    public final void zzj(long j) {
        super.zzj(j);
        this.zzc = j != 0;
        zzagm zzagmVar = this.zzd;
        this.zzb = zzagmVar != null ? zzagmVar.zze : 0;
    }
}
