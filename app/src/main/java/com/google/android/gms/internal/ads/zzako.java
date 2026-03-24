package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.api.Api;
import defpackage.AP;
import defpackage.Vs;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzako implements zzaeu {
    private static final byte[] zza = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzv zzb;
    private long zzA;
    private long zzB;
    private zzakn zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzaex zzI;
    private zzagh[] zzJ;
    private zzagh[] zzK;
    private boolean zzL;
    private long zzM;
    private final zzamd zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzer zzg;
    private final zzer zzh;
    private final zzer zzi;
    private final byte[] zzj;
    private final zzer zzk;
    private final zzahz zzl;
    private final zzer zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzgq zzp;
    private final zzaej zzq;
    private zzguf zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private zzer zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        zzt zztVar = new zzt();
        zztVar.zzm("application/x-emsg");
        zzb = zztVar.zzM();
    }

    @Deprecated
    public zzako() {
        this(zzamd.zza, 32, null, null, zzguf.zzi(), null);
    }

    private final void zzi() {
        this.zzs = 0;
        this.zzv = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r7 = zzn(r9.zzb);
        r8 = r9.zzd(1836475768);
        r8.getClass();
        r15 = new android.util.SparseArray();
        r8 = r8.zzb;
        r10 = r8.size();
        r14 = r4;
        r16 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r14 >= r10) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzfv) r8.get(r14);
        r5 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (r5 != 1953654136) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        r1 = r1.zza;
        r1.zzh(r11);
        r1 = android.util.Pair.create(java.lang.Integer.valueOf(r1.zzB()), new com.google.android.gms.internal.ads.zzaki(r1.zzB() - 1, r1.zzB(), r1.zzB(), r1.zzB()));
        r15.put(((java.lang.Integer) r1.first).intValue(), (com.google.android.gms.internal.ads.zzaki) r1.second);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0097, code lost:
    
        if (r5 != 1835362404) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
    
        r1 = r1.zza;
        r1.zzh(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
    
        if (com.google.android.gms.internal.ads.zzakh.zza(r1.zzB()) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a8, code lost:
    
        r11 = r1.zzz();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        r16 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
    
        r11 = r1.zzJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b4, code lost:
    
        r14 = r14 + r6;
        r11 = 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b8, code lost:
    
        r1 = r9.zzd(1835365473);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bf, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c1, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzakh.zze(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c7, code lost:
    
        r3 = new com.google.android.gms.internal.ads.zzafn();
        r5 = r9.zzc(1969517665);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d3, code lost:
    
        if (r5 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d5, code lost:
    
        r14 = com.google.android.gms.internal.ads.zzakh.zzc(r5);
        r3.zza(r14);
        r18 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x07e2, code lost:
    
        zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x07e5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00df, code lost:
    
        r18 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e1, code lost:
    
        r8 = r9.zzc(1836476516);
        r8.getClass();
        r10 = new com.google.android.gms.internal.ads.zzao[r6];
        r10[r4] = com.google.android.gms.internal.ads.zzakh.zzd(r8.zza);
        r5 = new com.google.android.gms.internal.ads.zzap(-9223372036854775807L, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0104, code lost:
    
        if ((r0.zzd & 16) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0106, code lost:
    
        r14 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0108, code lost:
    
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0109, code lost:
    
        r7 = r15;
        r8 = com.google.android.gms.internal.ads.zzakh.zzb(r9, r3, r16, r7, r14, false, new com.google.android.gms.internal.ads.zzakj(r0), false);
        r9 = r8.size();
        r10 = r0.zzf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012b, code lost:
    
        if (r10.size() != 0) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012d, code lost:
    
        r11 = com.google.android.gms.internal.ads.zzakr.zza(r8);
        r12 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0132, code lost:
    
        if (r12 >= r9) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0134, code lost:
    
        r13 = (com.google.android.gms.internal.ads.zzalf) r8.get(r12);
        r14 = r13.zza;
        r15 = r0.zzI;
        r2 = r14.zzb;
        r15 = r15.zzu(r12, r2);
        r20 = r7;
        r6 = r14.zze;
        r15.zzN(r6);
        r4 = r14.zzg;
        r21 = r8;
        r8 = r4.zza();
        r8.zzl(r11);
        com.google.android.gms.internal.ads.zzakq.zzb(r2, r3, r8);
        com.google.android.gms.internal.ads.zzakq.zza(r2, r1, r8, r4.zzl, r18, r5);
        r2 = r14.zza;
        r10.put(r2, new com.google.android.gms.internal.ads.zzakn(r15, r13, zzo(r20, r2), r8.zzM()));
        r0.zzA = java.lang.Math.max(r0.zzA, r6);
        r12 = r12 + 1;
        r7 = r20;
        r8 = r21;
        r3 = r3;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0195, code lost:
    
        r0.zzI.zzv();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a3, code lost:
    
        if (r10.size() != r9) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01a5, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a7, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a8, code lost:
    
        com.google.android.gms.internal.ads.zzgrc.zzi(r1);
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ac, code lost:
    
        if (r1 >= r9) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ae, code lost:
    
        r3 = (com.google.android.gms.internal.ads.zzalf) r8.get(r1);
        r5 = r3.zza.zza;
        ((com.google.android.gms.internal.ads.zzakn) r10.get(r5)).zza(r3, zzo(r7, r5));
        r1 = r1 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzj(long r57) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 2022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzako.zzj(long):void");
    }

    private static int zzk(int i) throws zzat {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw zzat.zzb(sb.toString(), null);
    }

    private static void zzl(zzer zzerVar, int i, zzale zzaleVar) throws zzat {
        zzerVar.zzh(i + 8);
        int iZzB = zzerVar.zzB();
        int i2 = zzakh.zza;
        if ((iZzB & 1) != 0) {
            throw zzat.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iZzB & 2) != 0;
        int iZzH = zzerVar.zzH();
        if (iZzH == 0) {
            Arrays.fill(zzaleVar.zzl, 0, zzaleVar.zze, false);
            return;
        }
        int i3 = zzaleVar.zze;
        if (iZzH != i3) {
            throw zzat.zzb(Vs.n(new StringBuilder(String.valueOf(iZzH).length() + 58 + String.valueOf(i3).length()), "Senc sample count ", iZzH, " is different from fragment sample count", i3), null);
        }
        Arrays.fill(zzaleVar.zzl, 0, iZzH, z);
        zzaleVar.zza(zzerVar.zzd());
        zzer zzerVar2 = zzaleVar.zzn;
        zzerVar.zzm(zzerVar2.zzi(), 0, zzerVar2.zze());
        zzerVar2.zzh(0);
        zzaleVar.zzo = false;
    }

    private static Pair zzm(zzer zzerVar, long j) throws zzat {
        long jZzJ;
        long jZzJ2;
        zzerVar.zzh(8);
        int iZza = zzakh.zza(zzerVar.zzB());
        zzerVar.zzk(4);
        long jZzz = zzerVar.zzz();
        if (iZza == 0) {
            jZzJ = zzerVar.zzz();
            jZzJ2 = zzerVar.zzz();
        } else {
            jZzJ = zzerVar.zzJ();
            jZzJ2 = zzerVar.zzJ();
        }
        long j2 = jZzJ;
        long j3 = jZzJ2 + j;
        long jZzt = zzfj.zzt(j2, 1000000L, jZzz, RoundingMode.DOWN);
        zzerVar.zzk(2);
        int iZzt = zzerVar.zzt();
        int[] iArr = new int[iZzt];
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        long[] jArr3 = new long[iZzt];
        long j4 = jZzt;
        int i = 0;
        long j5 = j2;
        while (i < iZzt) {
            int iZzB = zzerVar.zzB();
            if ((Integer.MIN_VALUE & iZzB) != 0) {
                throw zzat.zzb("Unhandled indirect reference", null);
            }
            long jZzz2 = zzerVar.zzz();
            iArr[i] = iZzB & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            jArr[i] = j3;
            jArr3[i] = j4;
            long j6 = j5 + jZzz2;
            long[] jArr4 = jArr3;
            long[] jArr5 = jArr2;
            int i2 = iZzt;
            long jZzt2 = zzfj.zzt(j6, 1000000L, jZzz, RoundingMode.DOWN);
            jArr5[i] = jZzt2 - jArr4[i];
            zzerVar.zzk(4);
            j3 += r1[i];
            i++;
            iArr = iArr;
            jArr2 = jArr5;
            jArr = jArr;
            iZzt = i2;
            jArr3 = jArr4;
            j5 = j6;
            j4 = jZzt2;
        }
        return Pair.create(Long.valueOf(jZzt), new zzaei(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzq zzn(java.util.List r18) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzako.zzn(java.util.List):com.google.android.gms.internal.ads.zzq");
    }

    private static final zzaki zzo(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzaki) sparseArray.valueAt(0);
        }
        zzaki zzakiVar = (zzaki) sparseArray.get(i);
        zzakiVar.getClass();
        return zzakiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) {
        zzagc zzagcVarZza = zzalb.zza(zzaevVar);
        this.zzr = zzagcVarZza != null ? zzguf.zzj(zzagcVarZza) : zzguf.zzi();
        return zzagcVarZza == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ List zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        int i;
        int i2 = this.zzd;
        if ((i2 & 32) == 0) {
            zzaexVar = new zzamg(zzaexVar, this.zzc);
        }
        this.zzI = zzaexVar;
        zzi();
        zzagh[] zzaghVarArr = new zzagh[2];
        this.zzJ = zzaghVarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            zzaghVarArr[0] = this.zzI.zzu(100, 5);
            i = 1;
            i3 = FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS;
        } else {
            i = 0;
        }
        zzagh[] zzaghVarArr2 = (zzagh[]) zzfj.zzb(this.zzJ, i);
        this.zzJ = zzaghVarArr2;
        for (zzagh zzaghVar : zzaghVarArr2) {
            zzaghVar.zzz(zzb);
        }
        List list = this.zze;
        this.zzK = new zzagh[list.size()];
        while (i4 < this.zzK.length) {
            zzagh zzaghVarZzu = this.zzI.zzu(i3, 3);
            zzaghVarZzu.zzz((zzv) list.get(i4));
            this.zzK[i4] = zzaghVarZzu;
            i4++;
            i3++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f7, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzb("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fa, code lost:
    
        if (r26.zzH == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fc, code lost:
    
        r7 = r26.zzi;
        r7.zza(r4);
        r27.zzc(r7.zzi(), 0, r26.zzF);
        r6.zzc(r7, r26.zzF);
        r4 = r26.zzF;
        r5 = com.google.android.gms.internal.ads.zzgm.zza(r7.zzi(), r7.zze());
        r7.zzh(0);
        r7.zzf(r5);
        r5 = r3.zzg.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0229, code lost:
    
        if (r5 != (-1)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x022b, code lost:
    
        r5 = r26.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0231, code lost:
    
        if (r5.zzb() == 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0233, code lost:
    
        r5.zza(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0237, code lost:
    
        r9 = r26.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x023d, code lost:
    
        if (r9.zzb() == r5) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x023f, code lost:
    
        r9.zza(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0242, code lost:
    
        r5 = r26.zzp;
        r5.zzc(r10, r7);
        r9 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x024d, code lost:
    
        if ((r2.zzg() & 4) == 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x024f, code lost:
    
        r5.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0253, code lost:
    
        r9 = r5;
        r4 = r6.zza(r27, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0259, code lost:
    
        r26.zzE += r4;
        r26.zzF -= r4;
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0265, code lost:
    
        r1 = r2.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x026b, code lost:
    
        if (r26.zzG != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x026d, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0270, code lost:
    
        r20 = r1;
        r1 = r2.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0276, code lost:
    
        if (r1 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0278, code lost:
    
        r23 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x027d, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x027f, code lost:
    
        r6.zze(r10, r20, r26.zzD, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x028c, code lost:
    
        r1 = r26.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0292, code lost:
    
        if (r1.isEmpty() != false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0294, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzakm) r1.removeFirst();
        r3 = r26.zzy;
        r4 = r1.zzc;
        r26.zzy = r3 - r4;
        r5 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02a5, code lost:
    
        if (r1.zzb == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02a7, code lost:
    
        r5 = r5 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02a8, code lost:
    
        r1 = r26.zzJ;
        r3 = r1.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ac, code lost:
    
        if (r7 >= r3) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02ae, code lost:
    
        r1[r7].zze(r5, 1, r4, r26.zzy, null);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02c6, code lost:
    
        if (r2.zzh() != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02c8, code lost:
    
        r26.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02cb, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02cc, code lost:
    
        r26.zzs = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02cf, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x056b, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzc("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        r5 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        if (r26.zzs != 3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        r26.zzD = r2.zzf();
        r3 = r2.zzd.zza.zzg.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
    
        if (java.util.Objects.equals(r3, "video/avc") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
    
        java.util.Objects.equals(r3, "video/hevc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
    
        r26.zzG = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r2.zzf >= r2.zzi) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
    
        r27.zzf(r26.zzD);
        r1 = r2.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
    
        if (r1 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c8, code lost:
    
        r3 = r2.zzb;
        r5 = r3.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ce, code lost:
    
        if (r1 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d0, code lost:
    
        r5.zzk(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
    
        if (r3.zzb(r2.zzf) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00db, code lost:
    
        r5.zzk(r5.zzt() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e8, code lost:
    
        if (r2.zzh() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ea, code lost:
    
        r26.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ec, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f5, code lost:
    
        if (r2.zzd.zza.zzh != 1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f7, code lost:
    
        r26.zzD -= 8;
        r27.zzf(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010e, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzg.zzo) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0110, code lost:
    
        r26.zzE = r2.zzi(r26.zzD, 7);
        r3 = r26.zzD;
        r8 = r26.zzk;
        com.google.android.gms.internal.ads.zzady.zzc(r3, r8);
        r2.zza.zzc(r8, 7);
        r3 = r26.zzE + 7;
        r26.zzE = r3;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012c, code lost:
    
        r6 = 0;
        r3 = r2.zzi(r26.zzD, 0);
        r26.zzE = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0135, code lost:
    
        r26.zzD += r3;
        r26.zzs = 4;
        r26.zzF = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013e, code lost:
    
        r3 = r2.zzd.zza;
        r6 = r2.zza;
        r10 = r2.zzd();
        r8 = r3.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014a, code lost:
    
        if (r8 != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014c, code lost:
    
        r3 = r26.zzE;
        r5 = r26.zzD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0150, code lost:
    
        if (r3 >= r5) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0152, code lost:
    
        r26.zzE += r6.zza(r27, r5 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015e, code lost:
    
        r13 = r26.zzh;
        r14 = r13.zzi();
        r14[0] = 0;
        r14[1] = 0;
        r14[2] = 0;
        r12 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0172, code lost:
    
        if (r26.zzE >= r26.zzD) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0174, code lost:
    
        r4 = r26.zzF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0176, code lost:
    
        if (r4 != 0) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017b, code lost:
    
        if (r26.zzK.length > 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017f, code lost:
    
        if (r26.zzG != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0182, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0184, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzgm.zzc(r3.zzg);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0191, code lost:
    
        if ((r8 + r4) <= (r26.zzD - r26.zzE)) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0194, code lost:
    
        r27.zzc(r14, r12, r8 + r4);
        r13.zzh(0);
        r9 = r13.zzB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a1, code lost:
    
        if (r9 < 0) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a3, code lost:
    
        r26.zzF = r9 - r4;
        r9 = r26.zzg;
        r9.zzh(0);
        r6.zzc(r9, r5);
        r26.zzE += r5;
        r26.zzD += r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01bb, code lost:
    
        if (r26.zzK.length <= 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bd, code lost:
    
        if (r4 <= 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c7, code lost:
    
        if (com.google.android.gms.internal.ads.zzgm.zzb(r3.zzg, r14[r5]) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c9, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cb, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cc, code lost:
    
        r26.zzH = r7;
        r6.zzc(r13, r4);
        r26.zzE += r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d6, code lost:
    
        if (r4 <= 0) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01da, code lost:
    
        if (r26.zzG != false) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e2, code lost:
    
        if (com.google.android.gms.internal.ads.zzgm.zzd(r14, r5, r4, r3.zzg) == false) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e4, code lost:
    
        r26.zzG = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0572 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzd(com.google.android.gms.internal.ads.zzaev r27, com.google.android.gms.internal.ads.zzafv r28) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 1891
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzako.zzd(com.google.android.gms.internal.ads.zzaev, com.google.android.gms.internal.ads.zzafv):int");
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j, long j2) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((zzakn) sparseArray.valueAt(i)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j2;
        this.zzn.clear();
        zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ zzaeu zzg() {
        return AP.b(this);
    }

    public final /* synthetic */ void zzh(long j, zzer zzerVar) {
        zzaeh.zza(j, zzerVar, this.zzK);
    }

    public zzako(zzamd zzamdVar, int i, zzfg zzfgVar, zzalc zzalcVar, List list, zzagh zzaghVar) {
        this.zzc = zzamdVar;
        this.zzd = i;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzahz();
        this.zzm = new zzer(16);
        this.zzg = new zzer(zzgm.zza);
        this.zzh = new zzer(6);
        this.zzi = new zzer();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzer(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzguf.zzi();
        this.zzA = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzI = zzaex.zza;
        this.zzJ = new zzagh[0];
        this.zzK = new zzagh[0];
        this.zzp = new zzgq(new zzgp() { // from class: com.google.android.gms.internal.ads.zzakl
            @Override // com.google.android.gms.internal.ads.zzgp
            public final /* synthetic */ void zza(long j, zzer zzerVar) {
                this.zza.zzh(j, zzerVar);
            }
        });
        this.zzq = new zzaej();
        this.zzM = -1L;
    }
}
