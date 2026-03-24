package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzlf implements Handler.Callback, zzwh, zzaai, zzmb, zzit, zzmf, zzcc, zzacp {
    private static final long zza = zzfj.zzp(10000);
    private zzmt zzA;
    private boolean zzC;
    private boolean zzD;
    private zzle zzE;
    private int zzF;
    private zzmd zzG;
    private zzlc zzH;
    private boolean zzI;
    private boolean zzK;
    private boolean zzL;
    private boolean zzN;
    private boolean zzQ;
    private int zzR;
    private zzle zzS;
    private long zzT;
    private long zzU;
    private int zzV;
    private boolean zzW;
    private zziw zzX;
    private zzjg zzZ;
    private boolean zzab;
    private final zzip zzad;
    private final zzmp[] zzb;
    private final zzmn[] zzc;
    private final boolean[] zzd;
    private final zzaaj zze;
    private final zzaak zzf;
    private final zzlj zzg;
    private final zzaas zzh;
    private final zzdx zzi;
    private final zzme zzj;
    private final Looper zzk;
    private final zzbe zzl;
    private final zzbd zzm;
    private final long zzn;
    private final zziu zzo;
    private final ArrayList zzp;
    private final zzdn zzq;
    private final zzld zzr;
    private final zzlq zzs;
    private final zzmc zzt;
    private final long zzu;
    private final zzpq zzv;
    private final zzmx zzw;
    private final zzdx zzx;
    private final boolean zzy;
    private final zzcd zzz;
    private long zzaa = -9223372036854775807L;
    private int zzO = 0;
    private boolean zzP = false;
    private boolean zzJ = false;
    private float zzac = 1.0f;
    private zzms zzB = zzms.zza;
    private long zzY = -9223372036854775807L;
    private long zzM = -9223372036854775807L;

    public zzlf(Context context, zzml[] zzmlVarArr, zzml[] zzmlVarArr2, zzaaj zzaajVar, zzaak zzaakVar, zzlj zzljVar, zzaas zzaasVar, int i, boolean z, zzmx zzmxVar, zzmt zzmtVar, zzip zzipVar, long j, boolean z2, boolean z3, Looper looper, zzdn zzdnVar, zzld zzldVar, zzpq zzpqVar, zzme zzmeVar, zzjg zzjgVar, final zzacp zzacpVar) {
        this.zzr = zzldVar;
        this.zze = zzaajVar;
        this.zzf = zzaakVar;
        this.zzg = zzljVar;
        this.zzh = zzaasVar;
        int i2 = 0;
        this.zzA = zzmtVar;
        this.zzad = zzipVar;
        this.zzu = j;
        this.zzq = zzdnVar;
        this.zzv = zzpqVar;
        this.zzZ = zzjgVar;
        this.zzw = zzmxVar;
        this.zzn = zzljVar.zzf(zzpqVar);
        zzljVar.zzg(zzpqVar);
        zzbf zzbfVar = zzbf.zza;
        zzmd zzmdVarZza = zzmd.zza(zzaakVar);
        this.zzG = zzmdVarZza;
        this.zzH = new zzlc(zzmdVarZza);
        int length = zzmlVarArr.length;
        this.zzc = new zzmn[2];
        this.zzd = new boolean[2];
        zzmm zzmmVarZzg = zzaajVar.zzg();
        this.zzb = new zzmp[2];
        boolean z4 = false;
        for (int i3 = 2; i2 < i3; i3 = 2) {
            zzmlVarArr[i2].zzc(i2, zzpqVar, zzdnVar);
            this.zzc[i2] = zzmlVarArr[i2].zzb();
            this.zzc[i2].zzv(zzmmVarZzg);
            zzml zzmlVar = zzmlVarArr2[i2];
            if (zzmlVar != null) {
                zzmlVar.zzc(i2, zzpqVar, zzdnVar);
                z4 = true;
            }
            this.zzb[i2] = new zzmp(zzmlVarArr[i2], zzmlVarArr2[i2], i2);
            i2++;
        }
        this.zzy = z4;
        this.zzo = new zziu(this, zzdnVar);
        this.zzp = new ArrayList();
        this.zzl = new zzbe();
        this.zzm = new zzbd();
        zzaajVar.zzr(this, zzaasVar);
        this.zzW = true;
        zzdx zzdxVarZzd = zzdnVar.zzd(looper, null);
        this.zzx = zzdxVarZzd;
        this.zzs = new zzlq(zzmxVar, zzdxVarZzd, new zzky(this), zzjgVar);
        this.zzt = new zzmc(this, zzmxVar, zzdxVarZzd, zzpqVar);
        zzme zzmeVar2 = new zzme(null);
        this.zzj = zzmeVar2;
        Looper looperZza = zzmeVar2.zza();
        this.zzk = looperZza;
        zzdx zzdxVarZzd2 = zzdnVar.zzd(looperZza, this);
        this.zzi = zzdxVarZzd2;
        this.zzz = new zzcd(context, looperZza, this);
        zzdxVarZzd2.zzd(35, new zzacp() { // from class: com.google.android.gms.internal.ads.zzku
            @Override // com.google.android.gms.internal.ads.zzacp
            public final /* synthetic */ void zzcS(long j2, long j3, zzv zzvVar, MediaFormat mediaFormat) {
                this.zza.zzcS(j2, j3, zzvVar, mediaFormat);
            }
        }).zza();
    }

    private final void zzA(IOException iOException, int i) {
        zzlq zzlqVar = this.zzs;
        zziw zziwVarZza = zziw.zza(iOException, i);
        zzln zzlnVarZzm = zzlqVar.zzm();
        if (zzlnVarZzm != null) {
            zziwVarZza = zziwVarZza.zzd(zzlnVarZzm.zzg.zza);
        }
        zzee.zzf("ExoPlayerImplInternal", "Playback error", zziwVarZza);
        zzW(false, false);
        this.zzG = this.zzG.zzf(zziwVarZza);
    }

    private final void zzB(int i) {
        zzmd zzmdVar = this.zzG;
        if (zzmdVar.zze != i) {
            if (i != 2) {
                this.zzY = -9223372036854775807L;
            }
            this.zzG = zzmdVar.zze(i);
        }
    }

    private final void zzC() {
        this.zzH.zzb(this.zzG);
        if (this.zzH.zzd()) {
            this.zzr.zza(this.zzH);
            this.zzH = new zzlc(this.zzG);
        }
    }

    private final void zzD(float f) {
        this.zzac = f;
        float fZza = this.zzz.zza() * f;
        int i = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzmpVarArr[i].zzL(fZza);
            i++;
        }
    }

    private final void zzE(boolean z, int i, boolean z2, int i2) {
        this.zzH.zza(z2 ? 1 : 0);
        zzG(z, i, i2);
    }

    private final void zzF() {
        zzmd zzmdVar = this.zzG;
        zzG(zzmdVar.zzl, zzmdVar.zzn, zzmdVar.zzm);
    }

    private final void zzG(boolean z, int i, int i2) {
        zzH(z, this.zzz.zzc(z, this.zzG.zze), i, i2);
    }

    private final void zzH(boolean z, int i, int i2, int i3) {
        boolean z2;
        if (!z) {
            z2 = false;
        } else if (i != -1) {
            z2 = true;
        } else {
            i = -1;
            z2 = false;
        }
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.zzC;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        zzmd zzmdVar = this.zzG;
        if (zzmdVar.zzl == z2 && zzmdVar.zzn == i2 && zzmdVar.zzm == i3) {
            return;
        }
        this.zzG = zzmdVar.zzi(z2, i3, i2);
        zzaC(false, false);
        zzlq zzlqVar = this.zzs;
        for (zzln zzlnVarZzm = zzlqVar.zzm(); zzlnVarZzm != null; zzlnVarZzm = zzlnVarZzm.zzp()) {
            for (zzaac zzaacVar : zzlnVarZzm.zzr().zzc) {
            }
        }
        if (!zzax()) {
            zzK();
            zzL();
            boolean z4 = this.zzG.zzp;
            zzlqVar.zzf(this.zzT);
            return;
        }
        int i4 = this.zzG.zze;
        if (i4 == 3) {
            this.zzo.zza();
            zzJ();
            this.zzi.zzh(2);
        } else if (i4 == 2) {
            this.zzi.zzh(2);
        }
    }

    private final void zzI(boolean z) throws zziw {
        zzwk zzwkVar = this.zzs.zzm().zzg.zza;
        long jZzT = zzT(zzwkVar, this.zzG.zzs, true, false);
        if (jZzT != this.zzG.zzs) {
            zzmd zzmdVar = this.zzG;
            this.zzG = zzao(zzwkVar, jZzT, zzmdVar.zzc, zzmdVar.zzd, z, 5);
        }
    }

    private final void zzJ() {
        zzln zzlnVarZzm = this.zzs.zzm();
        if (zzlnVarZzm == null) {
            return;
        }
        zzaak zzaakVarZzr = zzlnVarZzm.zzr();
        int i = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            if (zzaakVarZzr.zza(i)) {
                zzmpVarArr[i].zzv();
            }
            i++;
        }
    }

    private final void zzK() {
        this.zzo.zzb();
        int i = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzmpVarArr[i].zzw();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a9, code lost:
    
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzL() {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzL():void");
    }

    private final void zzM(zzav zzavVar) {
        this.zzi.zzk(16);
        this.zzo.zzi(zzavVar);
    }

    private final void zzN(final int i, final boolean z) {
        boolean[] zArr = this.zzd;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.zzx.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(i, z);
                }
            });
        }
    }

    private final long zzO(zzbf zzbfVar, Object obj, long j) {
        int i = zzbfVar.zzo(obj, this.zzm).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i, zzbeVar, 0L);
        if (zzbeVar.zzf == -9223372036854775807L || !zzbeVar.zzb() || !zzbeVar.zzi) {
            return -9223372036854775807L;
        }
        long j2 = zzbeVar.zzg;
        String str = zzfj.zza;
        return zzfj.zzq((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - zzbeVar.zzf) - j;
    }

    private final boolean zzP(zzbf zzbfVar, zzwk zzwkVar) {
        if (!zzwkVar.zzb() && !zzbfVar.zzg()) {
            int i = zzbfVar.zzo(zzwkVar.zza, this.zzm).zzc;
            zzbe zzbeVar = this.zzl;
            zzbfVar.zzb(i, zzbeVar, 0L);
            if (zzbeVar.zzb() && zzbeVar.zzi && zzbeVar.zzf != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j) {
        if (zzw()) {
            jMin = this.zzG.zze != 3 ? zza : 1000L;
            zzmp[] zzmpVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                jMin = Math.min(jMin, zzfj.zzp(zzmpVarArr[i].zzk(this.zzT, this.zzU)));
            }
            if (this.zzG.zzj()) {
                zzlq zzlqVar = this.zzs;
                if ((zzlqVar.zzm() != null ? zzlqVar.zzm().zzp() : null) != null) {
                    if (this.zzT + (zzfj.zzq(jMin) * this.zzG.zzo.zzb) >= r0.zzc()) {
                        jMin = Math.min(jMin, zza);
                    }
                }
            }
        } else if (this.zzG.zze != 3 || zzax()) {
            jMin = zza;
        }
        this.zzi.zzj(2, j + jMin);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba A[Catch: all -> 0x00bd, TryCatch #1 {all -> 0x00bd, blocks: (B:27:0x00b0, B:29:0x00ba, B:34:0x00c3, B:36:0x00c9, B:37:0x00cc, B:39:0x00d4, B:41:0x00e0, B:43:0x00e8, B:47:0x00f0, B:51:0x0101, B:52:0x0105, B:54:0x010d, B:56:0x011d, B:60:0x0126, B:62:0x012c, B:64:0x0130, B:66:0x0135, B:68:0x013d, B:70:0x0143, B:73:0x014c, B:77:0x0156, B:71:0x0147), top: B:94:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzR(com.google.android.gms.internal.ads.zzle r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzR(com.google.android.gms.internal.ads.zzle):void");
    }

    private final long zzS(zzwk zzwkVar, long j, boolean z) {
        zzlq zzlqVar = this.zzs;
        return zzT(zzwkVar, j, zzlqVar.zzm() != zzlqVar.zzn(), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zzT(com.google.android.gms.internal.ads.zzwk r10, long r11, boolean r13, boolean r14) throws com.google.android.gms.internal.ads.zziw {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzT(com.google.android.gms.internal.ads.zzwk, long, boolean, boolean):long");
    }

    private final void zzU(long j, boolean z) {
        zzln zzlnVarZzm = this.zzs.zzm();
        long jZza = j + (zzlnVarZzm == null ? 1000000000000L : zzlnVarZzm.zza());
        this.zzT = jZza;
        this.zzo.zzc(jZza);
        zzmp[] zzmpVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            zzmpVarArr[i].zzE(zzlnVarZzm, this.zzT, z);
        }
        for (zzln zzlnVarZzm2 = r0.zzm(); zzlnVarZzm2 != null; zzlnVarZzm2 = zzlnVarZzm2.zzp()) {
            for (zzaac zzaacVar : zzlnVarZzm2.zzr().zzc) {
            }
        }
    }

    private final void zzV() {
        int i = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzmpVarArr[i].zzz(this.zzC ? this.zzB : null);
            i++;
        }
    }

    private final void zzW(boolean z, boolean z2) {
        zzX(z || !this.zzQ, false, true, false);
        this.zzH.zza(z2 ? 1 : 0);
        this.zzg.zzc(this.zzv);
        this.zzz.zzc(this.zzG.zzl, 1);
        zzB(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009f A[PHI: r2 r7 r9
      0x009f: PHI (r2v2 com.google.android.gms.internal.ads.zzwk) = (r2v1 com.google.android.gms.internal.ads.zzwk), (r2v6 com.google.android.gms.internal.ads.zzwk) binds: [B:28:0x0074, B:30:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r7v3 long) = (r7v2 long), (r7v11 long) binds: [B:28:0x0074, B:30:0x0099] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r9v2 long) = (r9v1 long), (r9v5 long) binds: [B:28:0x0074, B:30:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4 A[PHI: r3
      0x00e4: PHI (r3v3 com.google.android.gms.internal.ads.zzbf) = 
      (r3v2 com.google.android.gms.internal.ads.zzbf)
      (r3v2 com.google.android.gms.internal.ads.zzbf)
      (r3v11 com.google.android.gms.internal.ads.zzbf)
      (r3v11 com.google.android.gms.internal.ads.zzbf)
     binds: [B:34:0x00ac, B:36:0x00b0, B:38:0x00c1, B:40:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzX(boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzX(boolean, boolean, boolean, boolean):void");
    }

    private final Pair zzY(zzbf zzbfVar) {
        long j = 0;
        if (zzbfVar.zzg()) {
            return Pair.create(zzmd.zzb(), 0L);
        }
        int iZzk = zzbfVar.zzk(this.zzP);
        zzbe zzbeVar = this.zzl;
        zzbd zzbdVar = this.zzm;
        Pair pairZzm = zzbfVar.zzm(zzbeVar, zzbdVar, iZzk, -9223372036854775807L);
        zzwk zzwkVarZzy = this.zzs.zzy(zzbfVar, pairZzm.first, 0L);
        long jLongValue = ((Long) pairZzm.second).longValue();
        if (zzwkVarZzy.zzb()) {
            zzbfVar.zzo(zzwkVarZzy.zza, zzbdVar);
            if (zzwkVarZzy.zzc == zzbdVar.zzd(zzwkVarZzy.zzb)) {
                zzbdVar.zzj();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(zzwkVarZzy, Long.valueOf(j));
    }

    private final void zzZ(zzbf zzbfVar, zzbf zzbfVar2) {
        if (zzbfVar.zzg() && zzbfVar2.zzg()) {
            return;
        }
        ArrayList arrayList = this.zzp;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            Object obj = ((zzlb) arrayList.get(size)).zzb;
            String str = zzfj.zza;
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaA, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (!this.zzC) {
            return false;
        }
        boolean z = this.zzB.zzg;
        return true;
    }

    private static boolean zzaB(zzmd zzmdVar, zzbd zzbdVar) {
        zzwk zzwkVar = zzmdVar.zzb;
        zzbf zzbfVar = zzmdVar.zza;
        return zzbfVar.zzg() || zzbfVar.zzo(zzwkVar.zza, zzbdVar).zzf;
    }

    private final void zzaC(boolean z, boolean z2) {
        this.zzL = z;
        long jElapsedRealtime = -9223372036854775807L;
        if (z && !z2) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.zzM = jElapsedRealtime;
    }

    private static Pair zzaD(zzbf zzbfVar, zzle zzleVar, boolean z, int i, boolean z2, zzbe zzbeVar, zzbd zzbdVar) {
        Pair pairZzm;
        int iZzr;
        long j;
        zzbf zzbfVar2 = zzleVar.zza;
        if (zzbfVar.zzg()) {
            return null;
        }
        zzbf zzbfVar3 = true == zzbfVar2.zzg() ? zzbfVar : zzbfVar2;
        try {
            pairZzm = zzbfVar3.zzm(zzbeVar, zzbdVar, zzleVar.zzb, zzleVar.zzc);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (zzbfVar.equals(zzbfVar3)) {
            return pairZzm;
        }
        if (zzbfVar.zze(pairZzm.first) == -1) {
            iZzr = zzr(zzbeVar, zzbdVar, i, z2, pairZzm.first, zzbfVar3, zzbfVar);
            if (iZzr != -1) {
                j = -9223372036854775807L;
            }
            return null;
        }
        if (!zzbfVar3.zzo(pairZzm.first, zzbdVar).zzf || zzbfVar3.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn != zzbfVar3.zze(pairZzm.first)) {
            return pairZzm;
        }
        iZzr = zzbfVar.zzo(pairZzm.first, zzbdVar).zzc;
        j = zzleVar.zzc;
        return zzbfVar.zzm(zzbeVar, zzbdVar, iZzr, j);
    }

    private static final void zzaE(zzmh zzmhVar) {
        zzmhVar.zzh();
        try {
            zzmhVar.zza().zzx(zzmhVar.zzc(), zzmhVar.zze());
        } finally {
            zzmhVar.zzi(true);
        }
    }

    private static final boolean zzaF(zzln zzlnVar) {
        if (zzlnVar != null) {
            try {
                if (zzlnVar.zze) {
                    zzyc[] zzycVarArr = zzlnVar.zzc;
                    for (int i = 0; i < 2; i++) {
                        zzyc zzycVar = zzycVarArr[i];
                        if (zzycVar != null) {
                            zzycVar.zzc();
                        }
                    }
                } else {
                    zzlnVar.zza.zzc();
                }
                if (zzlnVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() {
        int i = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzb;
            if (i >= 2) {
                this.zzaa = -9223372036854775807L;
                return;
            }
            int iZzd = zzmpVarArr[i].zzd();
            zzmpVarArr[i].zzA(this.zzo);
            zzN(i, false);
            this.zzR -= iZzd;
            i++;
        }
    }

    private final void zzab() {
        if (this.zzy && zzaz()) {
            zzmp[] zzmpVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                zzmp zzmpVar = zzmpVarArr[i];
                int iZzd = zzmpVar.zzd();
                zzmpVar.zzC(this.zzo);
                this.zzR -= iZzd - zzmpVar.zzd();
            }
            this.zzaa = -9223372036854775807L;
        }
    }

    private final void zzac() throws zziw {
        zzad();
        zzI(true);
    }

    private final void zzad() throws zziw {
        zziu zziuVar = this.zzo;
        float f = zziuVar.zzj().zzb;
        zzlq zzlqVar = this.zzs;
        zzln zzlnVarZzm = zzlqVar.zzm();
        zzln zzlnVarZzn = zzlqVar.zzn();
        zzaak zzaakVar = null;
        boolean z = true;
        while (zzlnVarZzm != null && zzlnVarZzm.zze) {
            zzmd zzmdVar = this.zzG;
            zzaak zzaakVarZzk = zzlnVarZzm.zzk(f, zzmdVar.zza, zzmdVar.zzl);
            zzaak zzaakVar2 = zzlnVarZzm == zzlqVar.zzm() ? zzaakVarZzk : zzaakVar;
            zzaak zzaakVarZzr = zzlnVarZzm.zzr();
            boolean z2 = false;
            if (zzaakVarZzr != null) {
                zzaac[] zzaacVarArr = zzaakVarZzk.zzc;
                if (zzaakVarZzr.zzc.length == zzaacVarArr.length) {
                    for (int i = 0; i < zzaacVarArr.length; i++) {
                        if (zzaakVarZzk.zzb(zzaakVarZzr, i)) {
                        }
                    }
                    if (zzlnVarZzm != zzlnVarZzn) {
                        z2 = true;
                    }
                    z &= z2;
                    zzlnVarZzm = zzlnVarZzm.zzp();
                    zzaakVar = zzaakVar2;
                }
            }
            int i2 = 2;
            if (z) {
                zzln zzlnVarZzm2 = zzlqVar.zzm();
                int iZzs = zzlqVar.zzs(zzlnVarZzm2) & 1;
                zzmp[] zzmpVarArr = this.zzb;
                boolean[] zArr = new boolean[2];
                zzaakVar2.getClass();
                long jZzm = zzlnVarZzm2.zzm(zzaakVar2, this.zzG.zzs, 1 == iZzs, zArr);
                zzmd zzmdVar2 = this.zzG;
                boolean z3 = (zzmdVar2.zze == 4 || jZzm == zzmdVar2.zzs) ? false : true;
                zzmd zzmdVar3 = this.zzG;
                zzln zzlnVar = zzlnVarZzm2;
                this.zzG = zzao(zzmdVar3.zzb, jZzm, zzmdVar3.zzc, zzmdVar3.zzd, z3, 5);
                if (z3) {
                    zzU(jZzm, true);
                }
                zzab();
                i2 = 2;
                boolean[] zArr2 = new boolean[2];
                int i3 = 0;
                while (i3 < 2) {
                    int iZzd = zzmpVarArr[i3].zzd();
                    zArr2[i3] = zzmpVarArr[i3].zzM();
                    zzln zzlnVar2 = zzlnVar;
                    zzmpVarArr[i3].zzD(zzlnVar2.zzc[i3], zziuVar, this.zzT, zArr[i3]);
                    if (iZzd - zzmpVarArr[i3].zzd() > 0) {
                        zzN(i3, false);
                    }
                    this.zzR -= iZzd - zzmpVarArr[i3].zzd();
                    i3++;
                    zzlnVar = zzlnVar2;
                }
                zzaq(zArr2, this.zzT);
                zzlnVar.zzh = true;
            } else {
                zzlqVar.zzs(zzlnVarZzm);
                if (zzlnVarZzm.zze) {
                    long jMax = Math.max(zzlnVarZzm.zzg.zzb, this.zzT - zzlnVarZzm.zza());
                    if (this.zzy && zzaz() && zzlqVar.zzo() == zzlnVarZzm) {
                        zzab();
                    }
                    zzlnVarZzm.zzl(zzaakVarZzk, jMax, false);
                }
            }
            zzas(true);
            if (this.zzG.zze != 4) {
                zzam();
                zzL();
                this.zzi.zzh(i2);
                return;
            }
            return;
        }
    }

    private final boolean zzae() {
        zzln zzlnVarZzm = this.zzs.zzm();
        long j = zzlnVarZzm.zzg.zze;
        if (!zzlnVarZzm.zze) {
            return false;
        }
        if (j == -9223372036854775807L || this.zzG.zzs < j) {
            return true;
        }
        return !zzax();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0432  */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzaf(com.google.android.gms.internal.ads.zzbf r33, boolean r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.zzaf(com.google.android.gms.internal.ads.zzbf, boolean):void");
    }

    private final void zzag(zzbf zzbfVar, zzwk zzwkVar, zzbf zzbfVar2, zzwk zzwkVar2, long j, boolean z) {
        if (!zzP(zzbfVar, zzwkVar)) {
            zzav zzavVar = zzwkVar.zzb() ? zzav.zza : this.zzG.zzo;
            if (this.zzo.zzj().equals(zzavVar)) {
                return;
            }
            zzM(zzavVar);
            zzal(this.zzG.zzo, zzavVar.zzb, false, false);
            return;
        }
        Object obj = zzwkVar.zza;
        zzbd zzbdVar = this.zzm;
        int i = zzbfVar.zzo(obj, zzbdVar).zzc;
        zzbe zzbeVar = this.zzl;
        zzbfVar.zzb(i, zzbeVar, 0L);
        zzip zzipVar = this.zzad;
        zzaf zzafVar = zzbeVar.zzj;
        String str = zzfj.zza;
        zzipVar.zza(zzafVar);
        if (j != -9223372036854775807L) {
            zzipVar.zzb(zzO(zzbfVar, obj, j));
            return;
        }
        if (!Objects.equals(!zzbfVar2.zzg() ? zzbfVar2.zzb(zzbfVar2.zzo(zzwkVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb : null, zzbeVar.zzb) || z) {
            zzipVar.zzb(-9223372036854775807L);
        }
    }

    private final long zzah(zzln zzlnVar) {
        if (zzlnVar == null) {
            return 0L;
        }
        long jZza = zzlnVar.zza();
        if (zzlnVar.zze) {
            int i = 0;
            while (true) {
                zzmp[] zzmpVarArr = this.zzb;
                if (i >= 2) {
                    break;
                }
                if (zzmpVarArr[i].zzp(zzlnVar)) {
                    long jZzf = zzmpVarArr[i].zzf(zzlnVar);
                    if (jZzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jZza = Math.max(jZzf, jZza);
                }
                i++;
            }
        }
        return jZza;
    }

    private final void zzai() {
        zzlq zzlqVar = this.zzs;
        zzlqVar.zzt();
        zzln zzlnVarZzl = zzlqVar.zzl();
        if (zzlnVarZzl != null) {
            if (!zzlnVarZzl.zzd || zzlnVarZzl.zze) {
                zzwi zzwiVar = zzlnVarZzl.zza;
                if (zzwiVar.zzn()) {
                    return;
                }
                if (this.zzg.zzj(this.zzv, this.zzG.zza, zzlnVarZzl.zzg.zza, zzlnVarZzl.zze ? zzwiVar.zzi() : 0L)) {
                    if (!zzlnVarZzl.zzd) {
                        zzlnVarZzl.zzt(this, zzlnVarZzl.zzg.zzb);
                        return;
                    }
                    zzlk zzlkVar = new zzlk();
                    zzlkVar.zza(this.zzT - zzlnVarZzl.zza());
                    zzlkVar.zzb(this.zzo.zzj().zzb);
                    zzlkVar.zzc(this.zzM);
                    zzlnVarZzl.zzj(new zzll(zzlkVar, null));
                }
            }
        }
    }

    private final void zzaj() {
        zzln zzlnVarZzm = this.zzs.zzm();
        boolean z = false;
        if (zzlnVarZzm != null && zzlnVarZzm.zzg.zzi && this.zzJ) {
            z = true;
        }
        this.zzK = z;
    }

    private final void zzak(zzav zzavVar, boolean z) {
        zzal(zzavVar, zzavVar.zzb, true, z);
    }

    private final void zzal(zzav zzavVar, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.zzH.zza(1);
            }
            zzmd zzmdVar = this.zzG;
            this.zzG = new zzmd(zzmdVar.zza, zzmdVar.zzb, zzmdVar.zzc, zzmdVar.zzd, zzmdVar.zze, zzmdVar.zzf, zzmdVar.zzg, zzmdVar.zzh, zzmdVar.zzi, zzmdVar.zzj, zzmdVar.zzk, zzmdVar.zzl, zzmdVar.zzm, zzmdVar.zzn, zzavVar, zzmdVar.zzq, zzmdVar.zzr, zzmdVar.zzs, zzmdVar.zzt, false);
        }
        float f2 = zzavVar.zzb;
        zzln zzlnVarZzm = this.zzs.zzm();
        while (true) {
            i = 0;
            if (zzlnVarZzm == null) {
                break;
            }
            zzaac[] zzaacVarArr = zzlnVarZzm.zzr().zzc;
            int length = zzaacVarArr.length;
            while (i < length) {
                zzaac zzaacVar = zzaacVarArr[i];
                i++;
            }
            zzlnVarZzm = zzlnVarZzm.zzp();
        }
        zzmp[] zzmpVarArr = this.zzb;
        while (i < 2) {
            zzmpVarArr[i].zzm(f, f2);
            i++;
        }
    }

    private final void zzam() {
        long jZza;
        long jZza2;
        zzlq zzlqVar;
        boolean zZzh;
        zzlq zzlqVar2 = this.zzs;
        if (zzaF(zzlqVar2.zzk())) {
            zzln zzlnVarZzk = zzlqVar2.zzk();
            long jZzau = zzau(zzlnVarZzk.zzg());
            if (zzlnVarZzk == zzlqVar2.zzm()) {
                jZza = this.zzT;
                jZza2 = zzlnVarZzk.zza();
            } else {
                jZza = this.zzT - zzlnVarZzk.zza();
                jZza2 = zzlnVarZzk.zzg.zzb;
            }
            zzlqVar = zzlqVar2;
            zzli zzliVar = new zzli(this.zzv, this.zzG.zza, zzlnVarZzk.zzg.zza, jZza - jZza2, jZzau, this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzlnVarZzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM);
            zzlj zzljVar = this.zzg;
            zZzh = zzljVar.zzh(zzliVar);
            zzln zzlnVarZzm = zzlqVar.zzm();
            if (!zZzh && zzlnVarZzm.zze && jZzau < 500000 && this.zzn > 0) {
                zzlnVarZzm.zza.zzf(this.zzG.zzs, false);
                zZzh = zzljVar.zzh(zzliVar);
            }
        } else {
            zzlqVar = zzlqVar2;
            zZzh = false;
        }
        this.zzN = zZzh;
        if (zZzh) {
            zzln zzlnVarZzk2 = zzlqVar.zzk();
            zzlnVarZzk2.getClass();
            zzlk zzlkVar = new zzlk();
            zzlkVar.zza(this.zzT - zzlnVarZzk2.zza());
            zzlkVar.zzb(this.zzo.zzj().zzb);
            zzlkVar.zzc(this.zzM);
            zzlnVarZzk2.zzj(new zzll(zzlkVar, null));
        }
        zzan();
    }

    private final void zzan() {
        zzln zzlnVarZzk = this.zzs.zzk();
        boolean z = true;
        if (!this.zzN && (zzlnVarZzk == null || !zzlnVarZzk.zza.zzn())) {
            z = false;
        }
        zzmd zzmdVar = this.zzG;
        if (z != zzmdVar.zzg) {
            this.zzG = zzmdVar.zzg(z);
        }
    }

    private final zzmd zzao(zzwk zzwkVar, long j, long j2, long j3, boolean z, int i) {
        List listZzi;
        zzyn zzynVar;
        zzaak zzaakVar;
        zzln zzlnVarZzm;
        int i2 = 0;
        this.zzW = (!this.zzW && j == this.zzG.zzs && zzwkVar.equals(this.zzG.zzb)) ? false : true;
        zzaj();
        zzmd zzmdVar = this.zzG;
        zzyn zzynVar2 = zzmdVar.zzh;
        zzaak zzaakVar2 = zzmdVar.zzi;
        List list = zzmdVar.zzj;
        if (this.zzt.zzb()) {
            zzlq zzlqVar = this.zzs;
            zzln zzlnVarZzm2 = zzlqVar.zzm();
            zzyn zzynVarZzq = zzlnVarZzm2 == null ? zzyn.zza : zzlnVarZzm2.zzq();
            zzaak zzaakVarZzr = zzlnVarZzm2 == null ? this.zzf : zzlnVarZzm2.zzr();
            zzaac[] zzaacVarArr = zzaakVarZzr.zzc;
            zzguc zzgucVar = new zzguc();
            boolean z2 = false;
            for (zzaac zzaacVar : zzaacVarArr) {
                if (zzaacVar != null) {
                    zzap zzapVar = zzaacVar.zzb(0).zzl;
                    if (zzapVar == null) {
                        zzgucVar.zzf(new zzap(-9223372036854775807L, new zzao[0]));
                    } else {
                        zzgucVar.zzf(zzapVar);
                        z2 = true;
                    }
                }
            }
            zzguf zzgufVarZzi = z2 ? zzgucVar.zzi() : zzguf.zzi();
            if (zzlnVarZzm2 != null) {
                zzlo zzloVar = zzlnVarZzm2.zzg;
                if (zzloVar.zzc != j2) {
                    zzlnVarZzm2.zzg = zzloVar.zzb(j2);
                }
            }
            if (zzlqVar.zzm() == zzlqVar.zzn() && (zzlnVarZzm = zzlqVar.zzm()) != null) {
                zzaak zzaakVarZzr2 = zzlnVarZzm.zzr();
                while (true) {
                    zzmp[] zzmpVarArr = this.zzb;
                    if (i2 >= 2) {
                        break;
                    }
                    if (zzaakVarZzr2.zza(i2)) {
                        if (zzmpVarArr[i2].zze() != 1) {
                            break;
                        }
                        int i3 = zzaakVarZzr2.zzb[i2].zzb;
                    }
                    i2++;
                }
            }
            listZzi = zzgufVarZzi;
            zzynVar = zzynVarZzq;
            zzaakVar = zzaakVarZzr;
        } else if (zzwkVar.equals(this.zzG.zzb)) {
            listZzi = list;
            zzynVar = zzynVar2;
            zzaakVar = zzaakVar2;
        } else {
            zzaakVar = this.zzf;
            zzynVar = zzyn.zza;
            listZzi = zzguf.zzi();
        }
        if (z) {
            this.zzH.zzc(i);
        }
        return this.zzG.zzc(zzwkVar, j, j2, j3, zzat(), zzynVar, zzaakVar, listZzi);
    }

    private final void zzap() throws zziw {
        zzaq(new boolean[2], this.zzs.zzn().zzc());
    }

    private final void zzaq(boolean[] zArr, long j) throws zziw {
        zzmp[] zzmpVarArr;
        zzln zzlnVarZzn = this.zzs.zzn();
        zzaak zzaakVarZzr = zzlnVarZzn.zzr();
        int i = 0;
        while (true) {
            zzmpVarArr = this.zzb;
            if (i >= 2) {
                break;
            }
            if (!zzaakVarZzr.zza(i)) {
                zzmpVarArr[i].zzG();
            }
            i++;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzaakVarZzr.zza(i2) && !zzmpVarArr[i2].zzp(zzlnVarZzn)) {
                zzar(zzlnVarZzn, i2, zArr[i2], j);
            }
        }
    }

    private final void zzar(zzln zzlnVar, int i, boolean z, long j) throws zziw {
        zzmp zzmpVar = this.zzb[i];
        if (zzmpVar.zzM()) {
            return;
        }
        boolean z2 = zzlnVar == this.zzs.zzm();
        zzaak zzaakVarZzr = zzlnVar.zzr();
        zzmo zzmoVar = zzaakVarZzr.zzb[i];
        zzaac zzaacVar = zzaakVarZzr.zzc[i];
        boolean z3 = zzax() && this.zzG.zze == 3;
        boolean z4 = !z && z3;
        this.zzR++;
        zzmpVar.zzx(zzmoVar, zzaacVar, zzlnVar.zzc[i], this.zzT, z4, z2, j, zzlnVar.zza(), zzlnVar.zzg.zza, this.zzo);
        zzmpVar.zzy(11, new zzkt(this), zzlnVar);
        if (z3 && z2) {
            zzmpVar.zzv();
        }
    }

    private final void zzas(boolean z) {
        zzln zzlnVarZzk = this.zzs.zzk();
        zzwk zzwkVar = zzlnVarZzk == null ? this.zzG.zzb : zzlnVarZzk.zzg.zza;
        boolean z2 = !this.zzG.zzk.equals(zzwkVar);
        if (z2) {
            this.zzG = this.zzG.zzh(zzwkVar);
        }
        zzmd zzmdVar = this.zzG;
        zzmdVar.zzq = zzlnVarZzk == null ? zzmdVar.zzs : zzlnVarZzk.zzf();
        this.zzG.zzr = zzat();
        if ((z2 || z) && zzlnVarZzk != null && zzlnVarZzk.zze) {
            zzaw(zzlnVarZzk.zzg.zza, zzlnVarZzk.zzq(), zzlnVarZzk.zzr());
        }
    }

    private final long zzat() {
        return zzau(this.zzG.zzq);
    }

    private final long zzau(long j) {
        zzln zzlnVarZzk = this.zzs.zzk();
        if (zzlnVarZzk == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzT - zzlnVarZzk.zza()));
    }

    private final long zzav(zzln zzlnVar) {
        zzgrc.zzi(zzlnVar.zze);
        return (long) ((zzlnVar.zzc() - this.zzT) / this.zzo.zzj().zzb);
    }

    private final void zzaw(zzwk zzwkVar, zzyn zzynVar, zzaak zzaakVar) {
        zzlq zzlqVar = this.zzs;
        zzln zzlnVarZzk = zzlqVar.zzk();
        zzlnVarZzk.getClass();
        zzln zzlnVarZzm = zzlqVar.zzm();
        long jZza = this.zzT - zzlnVarZzk.zza();
        if (zzlnVarZzk != zzlnVarZzm) {
            jZza -= zzlnVarZzk.zzg.zzb;
        }
        this.zzg.zzb(new zzli(this.zzv, this.zzG.zza, zzwkVar, jZza, zzau(zzlnVarZzk.zzf()), this.zzo.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzlnVarZzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM), zzynVar, zzaakVar.zzc);
    }

    private final boolean zzax() {
        zzmd zzmdVar = this.zzG;
        return zzmdVar.zzl && zzmdVar.zzn == 0;
    }

    private final void zzay(int i) {
        zzmp zzmpVar = this.zzb[i];
        try {
            zzln zzlnVarZzm = this.zzs.zzm();
            zzlnVarZzm.getClass();
            zzmpVar.zzu(zzlnVarZzm);
        } catch (IOException | RuntimeException e) {
            zzmpVar.zze();
            throw e;
        }
    }

    private final boolean zzaz() {
        if (!this.zzy) {
            return false;
        }
        zzmp[] zzmpVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            if (zzmpVarArr[i].zzc()) {
                return true;
            }
        }
        return false;
    }

    public static int zzr(zzbe zzbeVar, zzbd zzbdVar, int i, boolean z, Object obj, zzbf zzbfVar, zzbf zzbfVar2) {
        Object obj2 = zzbfVar.zzb(zzbfVar.zzo(obj, zzbdVar).zzc, zzbeVar, 0L).zzb;
        for (int i2 = 0; i2 < zzbfVar2.zza(); i2++) {
            if (zzbfVar2.zzb(i2, zzbeVar, 0L).zzb.equals(obj2)) {
                return i2;
            }
        }
        int iZze = zzbfVar.zze(obj);
        int iZzc = zzbfVar.zzc();
        int iZzl = iZze;
        int i3 = 0;
        int iZze2 = -1;
        while (true) {
            if (i3 >= iZzc || iZze2 != -1) {
                break;
            }
            iZzl = zzbfVar.zzl(iZzl, zzbdVar, zzbeVar, i, z);
            if (iZzl == -1) {
                iZze2 = -1;
                break;
            }
            iZze2 = zzbfVar2.zze(zzbfVar.zzf(iZzl));
            i3++;
        }
        if (iZze2 == -1) {
            return -1;
        }
        return zzbfVar2.zzd(iZze2, zzbdVar, false).zzc;
    }

    public static final /* synthetic */ void zzz(zzmh zzmhVar) {
        try {
            zzaE(zzmhVar);
        } catch (zziw e) {
            zzee.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Not initialized variable reg: 16, insn: 0x08fd: MOVE (r13 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]), block:B:484:0x08fc */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x059b A[Catch: IOException -> 0x002a, zzvk -> 0x002e, zzhc -> 0x0032, zzat -> 0x0036, zztg -> 0x003a, RuntimeException -> 0x0874, zziw -> 0x0888, TRY_LEAVE, TryCatch #16 {RuntimeException -> 0x0874, blocks: (B:207:0x0471, B:210:0x0481, B:224:0x04c3, B:229:0x04d8, B:269:0x058d, B:357:0x0704, B:389:0x078c, B:392:0x0799, B:394:0x079d, B:396:0x07a3, B:398:0x07a9, B:400:0x07b3, B:405:0x07bd, B:407:0x07c6, B:418:0x07f5, B:272:0x059b, B:336:0x06ca, B:340:0x06d4, B:228:0x04d5), top: B:707:0x0471 }] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x065b A[Catch: RuntimeException -> 0x0022, IOException -> 0x002a, zzvk -> 0x002e, zzhc -> 0x0032, zzat -> 0x0036, zztg -> 0x003a, zziw -> 0x003e, TryCatch #9 {RuntimeException -> 0x0022, blocks: (B:7:0x0016, B:8:0x001c, B:25:0x0042, B:27:0x0048, B:28:0x004e, B:30:0x0058, B:32:0x005e, B:34:0x0062, B:36:0x006a, B:37:0x006f, B:39:0x0073, B:40:0x007d, B:42:0x008a, B:43:0x0091, B:44:0x0094, B:46:0x009d, B:47:0x00a5, B:48:0x00a7, B:49:0x00ac, B:50:0x00bb, B:51:0x00c4, B:55:0x00d5, B:56:0x00dd, B:58:0x00ec, B:59:0x00f4, B:64:0x0103, B:62:0x00fc, B:65:0x0108, B:69:0x0124, B:70:0x0137, B:71:0x013c, B:72:0x014d, B:73:0x0160, B:74:0x0165, B:75:0x016a, B:79:0x0171, B:81:0x017a, B:83:0x0186, B:84:0x0189, B:85:0x018e, B:86:0x0199, B:87:0x01a9, B:88:0x01bd, B:89:0x01cf, B:91:0x01de, B:92:0x01e2, B:93:0x01f0, B:95:0x01ff, B:96:0x021b, B:97:0x022b, B:98:0x0234, B:100:0x0246, B:101:0x0252, B:102:0x0262, B:104:0x026e, B:107:0x0279, B:108:0x027d, B:109:0x0288, B:113:0x028f, B:115:0x0297, B:117:0x029b, B:119:0x02a0, B:122:0x02ac, B:126:0x02b3, B:128:0x02c3, B:129:0x02c8, B:131:0x02cb, B:132:0x02d0, B:134:0x02e2, B:135:0x02e7, B:137:0x02ea, B:138:0x02ef, B:139:0x02f4, B:141:0x0300, B:142:0x030a, B:144:0x0310, B:152:0x032c, B:157:0x037e, B:173:0x03a5, B:175:0x03ab, B:177:0x03b3, B:179:0x03d0, B:182:0x03d6, B:191:0x0409, B:195:0x041a, B:196:0x0427, B:199:0x042c, B:200:0x0433, B:201:0x043d, B:202:0x0451, B:212:0x048e, B:214:0x0498, B:216:0x04a0, B:220:0x04b5, B:222:0x04bb, B:223:0x04c0, B:217:0x04a6, B:219:0x04aa, B:226:0x04c7, B:232:0x04df, B:234:0x04e3, B:236:0x04e7, B:238:0x04ed, B:240:0x04f3, B:242:0x04f9, B:244:0x04ff, B:246:0x0507, B:248:0x0513, B:250:0x051c, B:251:0x0521, B:253:0x0525, B:255:0x052b, B:257:0x0533, B:259:0x053b, B:261:0x0561, B:262:0x056a, B:264:0x0573, B:266:0x0581, B:359:0x070a, B:361:0x0710, B:364:0x0718, B:365:0x0722, B:368:0x0727, B:373:0x074d, B:375:0x0753, B:377:0x075b, B:379:0x076a, B:383:0x0777, B:384:0x077c, B:403:0x07b9, B:409:0x07d8, B:411:0x07e1, B:413:0x07e9, B:274:0x05a1, B:277:0x05ad, B:280:0x05b6, B:282:0x05ba, B:284:0x05c2, B:285:0x05c5, B:287:0x05cb, B:289:0x05d5, B:291:0x05dd, B:293:0x05eb, B:295:0x05f3, B:297:0x05ff, B:299:0x0630, B:301:0x0634, B:305:0x0645, B:334:0x06be, B:307:0x064f, B:309:0x0653, B:314:0x065b, B:316:0x0663, B:318:0x0680, B:321:0x0689, B:325:0x0693, B:328:0x069b, B:329:0x06a3, B:331:0x06a9, B:338:0x06d0, B:344:0x06da, B:347:0x06e3, B:349:0x06e9, B:353:0x06f7, B:355:0x06fe), top: B:705:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x069b A[Catch: RuntimeException -> 0x0022, IOException -> 0x002a, zzvk -> 0x002e, zzhc -> 0x0032, zzat -> 0x0036, zztg -> 0x003a, zziw -> 0x003e, LOOP:19: B:326:0x0698->B:328:0x069b, LOOP_END, TryCatch #9 {RuntimeException -> 0x0022, blocks: (B:7:0x0016, B:8:0x001c, B:25:0x0042, B:27:0x0048, B:28:0x004e, B:30:0x0058, B:32:0x005e, B:34:0x0062, B:36:0x006a, B:37:0x006f, B:39:0x0073, B:40:0x007d, B:42:0x008a, B:43:0x0091, B:44:0x0094, B:46:0x009d, B:47:0x00a5, B:48:0x00a7, B:49:0x00ac, B:50:0x00bb, B:51:0x00c4, B:55:0x00d5, B:56:0x00dd, B:58:0x00ec, B:59:0x00f4, B:64:0x0103, B:62:0x00fc, B:65:0x0108, B:69:0x0124, B:70:0x0137, B:71:0x013c, B:72:0x014d, B:73:0x0160, B:74:0x0165, B:75:0x016a, B:79:0x0171, B:81:0x017a, B:83:0x0186, B:84:0x0189, B:85:0x018e, B:86:0x0199, B:87:0x01a9, B:88:0x01bd, B:89:0x01cf, B:91:0x01de, B:92:0x01e2, B:93:0x01f0, B:95:0x01ff, B:96:0x021b, B:97:0x022b, B:98:0x0234, B:100:0x0246, B:101:0x0252, B:102:0x0262, B:104:0x026e, B:107:0x0279, B:108:0x027d, B:109:0x0288, B:113:0x028f, B:115:0x0297, B:117:0x029b, B:119:0x02a0, B:122:0x02ac, B:126:0x02b3, B:128:0x02c3, B:129:0x02c8, B:131:0x02cb, B:132:0x02d0, B:134:0x02e2, B:135:0x02e7, B:137:0x02ea, B:138:0x02ef, B:139:0x02f4, B:141:0x0300, B:142:0x030a, B:144:0x0310, B:152:0x032c, B:157:0x037e, B:173:0x03a5, B:175:0x03ab, B:177:0x03b3, B:179:0x03d0, B:182:0x03d6, B:191:0x0409, B:195:0x041a, B:196:0x0427, B:199:0x042c, B:200:0x0433, B:201:0x043d, B:202:0x0451, B:212:0x048e, B:214:0x0498, B:216:0x04a0, B:220:0x04b5, B:222:0x04bb, B:223:0x04c0, B:217:0x04a6, B:219:0x04aa, B:226:0x04c7, B:232:0x04df, B:234:0x04e3, B:236:0x04e7, B:238:0x04ed, B:240:0x04f3, B:242:0x04f9, B:244:0x04ff, B:246:0x0507, B:248:0x0513, B:250:0x051c, B:251:0x0521, B:253:0x0525, B:255:0x052b, B:257:0x0533, B:259:0x053b, B:261:0x0561, B:262:0x056a, B:264:0x0573, B:266:0x0581, B:359:0x070a, B:361:0x0710, B:364:0x0718, B:365:0x0722, B:368:0x0727, B:373:0x074d, B:375:0x0753, B:377:0x075b, B:379:0x076a, B:383:0x0777, B:384:0x077c, B:403:0x07b9, B:409:0x07d8, B:411:0x07e1, B:413:0x07e9, B:274:0x05a1, B:277:0x05ad, B:280:0x05b6, B:282:0x05ba, B:284:0x05c2, B:285:0x05c5, B:287:0x05cb, B:289:0x05d5, B:291:0x05dd, B:293:0x05eb, B:295:0x05f3, B:297:0x05ff, B:299:0x0630, B:301:0x0634, B:305:0x0645, B:334:0x06be, B:307:0x064f, B:309:0x0653, B:314:0x065b, B:316:0x0663, B:318:0x0680, B:321:0x0689, B:325:0x0693, B:328:0x069b, B:329:0x06a3, B:331:0x06a9, B:338:0x06d0, B:344:0x06da, B:347:0x06e3, B:349:0x06e9, B:353:0x06f7, B:355:0x06fe), top: B:705:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x06a9 A[Catch: RuntimeException -> 0x0022, IOException -> 0x002a, zzvk -> 0x002e, zzhc -> 0x0032, zzat -> 0x0036, zztg -> 0x003a, zziw -> 0x003e, TryCatch #9 {RuntimeException -> 0x0022, blocks: (B:7:0x0016, B:8:0x001c, B:25:0x0042, B:27:0x0048, B:28:0x004e, B:30:0x0058, B:32:0x005e, B:34:0x0062, B:36:0x006a, B:37:0x006f, B:39:0x0073, B:40:0x007d, B:42:0x008a, B:43:0x0091, B:44:0x0094, B:46:0x009d, B:47:0x00a5, B:48:0x00a7, B:49:0x00ac, B:50:0x00bb, B:51:0x00c4, B:55:0x00d5, B:56:0x00dd, B:58:0x00ec, B:59:0x00f4, B:64:0x0103, B:62:0x00fc, B:65:0x0108, B:69:0x0124, B:70:0x0137, B:71:0x013c, B:72:0x014d, B:73:0x0160, B:74:0x0165, B:75:0x016a, B:79:0x0171, B:81:0x017a, B:83:0x0186, B:84:0x0189, B:85:0x018e, B:86:0x0199, B:87:0x01a9, B:88:0x01bd, B:89:0x01cf, B:91:0x01de, B:92:0x01e2, B:93:0x01f0, B:95:0x01ff, B:96:0x021b, B:97:0x022b, B:98:0x0234, B:100:0x0246, B:101:0x0252, B:102:0x0262, B:104:0x026e, B:107:0x0279, B:108:0x027d, B:109:0x0288, B:113:0x028f, B:115:0x0297, B:117:0x029b, B:119:0x02a0, B:122:0x02ac, B:126:0x02b3, B:128:0x02c3, B:129:0x02c8, B:131:0x02cb, B:132:0x02d0, B:134:0x02e2, B:135:0x02e7, B:137:0x02ea, B:138:0x02ef, B:139:0x02f4, B:141:0x0300, B:142:0x030a, B:144:0x0310, B:152:0x032c, B:157:0x037e, B:173:0x03a5, B:175:0x03ab, B:177:0x03b3, B:179:0x03d0, B:182:0x03d6, B:191:0x0409, B:195:0x041a, B:196:0x0427, B:199:0x042c, B:200:0x0433, B:201:0x043d, B:202:0x0451, B:212:0x048e, B:214:0x0498, B:216:0x04a0, B:220:0x04b5, B:222:0x04bb, B:223:0x04c0, B:217:0x04a6, B:219:0x04aa, B:226:0x04c7, B:232:0x04df, B:234:0x04e3, B:236:0x04e7, B:238:0x04ed, B:240:0x04f3, B:242:0x04f9, B:244:0x04ff, B:246:0x0507, B:248:0x0513, B:250:0x051c, B:251:0x0521, B:253:0x0525, B:255:0x052b, B:257:0x0533, B:259:0x053b, B:261:0x0561, B:262:0x056a, B:264:0x0573, B:266:0x0581, B:359:0x070a, B:361:0x0710, B:364:0x0718, B:365:0x0722, B:368:0x0727, B:373:0x074d, B:375:0x0753, B:377:0x075b, B:379:0x076a, B:383:0x0777, B:384:0x077c, B:403:0x07b9, B:409:0x07d8, B:411:0x07e1, B:413:0x07e9, B:274:0x05a1, B:277:0x05ad, B:280:0x05b6, B:282:0x05ba, B:284:0x05c2, B:285:0x05c5, B:287:0x05cb, B:289:0x05d5, B:291:0x05dd, B:293:0x05eb, B:295:0x05f3, B:297:0x05ff, B:299:0x0630, B:301:0x0634, B:305:0x0645, B:334:0x06be, B:307:0x064f, B:309:0x0653, B:314:0x065b, B:316:0x0663, B:318:0x0680, B:321:0x0689, B:325:0x0693, B:328:0x069b, B:329:0x06a3, B:331:0x06a9, B:338:0x06d0, B:344:0x06da, B:347:0x06e3, B:349:0x06e9, B:353:0x06f7, B:355:0x06fe), top: B:705:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x07b9 A[Catch: RuntimeException -> 0x0022, IOException -> 0x002a, zzvk -> 0x002e, zzhc -> 0x0032, zzat -> 0x0036, zztg -> 0x003a, zziw -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #9 {RuntimeException -> 0x0022, blocks: (B:7:0x0016, B:8:0x001c, B:25:0x0042, B:27:0x0048, B:28:0x004e, B:30:0x0058, B:32:0x005e, B:34:0x0062, B:36:0x006a, B:37:0x006f, B:39:0x0073, B:40:0x007d, B:42:0x008a, B:43:0x0091, B:44:0x0094, B:46:0x009d, B:47:0x00a5, B:48:0x00a7, B:49:0x00ac, B:50:0x00bb, B:51:0x00c4, B:55:0x00d5, B:56:0x00dd, B:58:0x00ec, B:59:0x00f4, B:64:0x0103, B:62:0x00fc, B:65:0x0108, B:69:0x0124, B:70:0x0137, B:71:0x013c, B:72:0x014d, B:73:0x0160, B:74:0x0165, B:75:0x016a, B:79:0x0171, B:81:0x017a, B:83:0x0186, B:84:0x0189, B:85:0x018e, B:86:0x0199, B:87:0x01a9, B:88:0x01bd, B:89:0x01cf, B:91:0x01de, B:92:0x01e2, B:93:0x01f0, B:95:0x01ff, B:96:0x021b, B:97:0x022b, B:98:0x0234, B:100:0x0246, B:101:0x0252, B:102:0x0262, B:104:0x026e, B:107:0x0279, B:108:0x027d, B:109:0x0288, B:113:0x028f, B:115:0x0297, B:117:0x029b, B:119:0x02a0, B:122:0x02ac, B:126:0x02b3, B:128:0x02c3, B:129:0x02c8, B:131:0x02cb, B:132:0x02d0, B:134:0x02e2, B:135:0x02e7, B:137:0x02ea, B:138:0x02ef, B:139:0x02f4, B:141:0x0300, B:142:0x030a, B:144:0x0310, B:152:0x032c, B:157:0x037e, B:173:0x03a5, B:175:0x03ab, B:177:0x03b3, B:179:0x03d0, B:182:0x03d6, B:191:0x0409, B:195:0x041a, B:196:0x0427, B:199:0x042c, B:200:0x0433, B:201:0x043d, B:202:0x0451, B:212:0x048e, B:214:0x0498, B:216:0x04a0, B:220:0x04b5, B:222:0x04bb, B:223:0x04c0, B:217:0x04a6, B:219:0x04aa, B:226:0x04c7, B:232:0x04df, B:234:0x04e3, B:236:0x04e7, B:238:0x04ed, B:240:0x04f3, B:242:0x04f9, B:244:0x04ff, B:246:0x0507, B:248:0x0513, B:250:0x051c, B:251:0x0521, B:253:0x0525, B:255:0x052b, B:257:0x0533, B:259:0x053b, B:261:0x0561, B:262:0x056a, B:264:0x0573, B:266:0x0581, B:359:0x070a, B:361:0x0710, B:364:0x0718, B:365:0x0722, B:368:0x0727, B:373:0x074d, B:375:0x0753, B:377:0x075b, B:379:0x076a, B:383:0x0777, B:384:0x077c, B:403:0x07b9, B:409:0x07d8, B:411:0x07e1, B:413:0x07e9, B:274:0x05a1, B:277:0x05ad, B:280:0x05b6, B:282:0x05ba, B:284:0x05c2, B:285:0x05c5, B:287:0x05cb, B:289:0x05d5, B:291:0x05dd, B:293:0x05eb, B:295:0x05f3, B:297:0x05ff, B:299:0x0630, B:301:0x0634, B:305:0x0645, B:334:0x06be, B:307:0x064f, B:309:0x0653, B:314:0x065b, B:316:0x0663, B:318:0x0680, B:321:0x0689, B:325:0x0693, B:328:0x069b, B:329:0x06a3, B:331:0x06a9, B:338:0x06d0, B:344:0x06da, B:347:0x06e3, B:349:0x06e9, B:353:0x06f7, B:355:0x06fe), top: B:705:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x07d8 A[Catch: RuntimeException -> 0x0022, IOException -> 0x002a, zzvk -> 0x002e, zzhc -> 0x0032, zzat -> 0x0036, zztg -> 0x003a, zziw -> 0x003e, TRY_ENTER, TryCatch #9 {RuntimeException -> 0x0022, blocks: (B:7:0x0016, B:8:0x001c, B:25:0x0042, B:27:0x0048, B:28:0x004e, B:30:0x0058, B:32:0x005e, B:34:0x0062, B:36:0x006a, B:37:0x006f, B:39:0x0073, B:40:0x007d, B:42:0x008a, B:43:0x0091, B:44:0x0094, B:46:0x009d, B:47:0x00a5, B:48:0x00a7, B:49:0x00ac, B:50:0x00bb, B:51:0x00c4, B:55:0x00d5, B:56:0x00dd, B:58:0x00ec, B:59:0x00f4, B:64:0x0103, B:62:0x00fc, B:65:0x0108, B:69:0x0124, B:70:0x0137, B:71:0x013c, B:72:0x014d, B:73:0x0160, B:74:0x0165, B:75:0x016a, B:79:0x0171, B:81:0x017a, B:83:0x0186, B:84:0x0189, B:85:0x018e, B:86:0x0199, B:87:0x01a9, B:88:0x01bd, B:89:0x01cf, B:91:0x01de, B:92:0x01e2, B:93:0x01f0, B:95:0x01ff, B:96:0x021b, B:97:0x022b, B:98:0x0234, B:100:0x0246, B:101:0x0252, B:102:0x0262, B:104:0x026e, B:107:0x0279, B:108:0x027d, B:109:0x0288, B:113:0x028f, B:115:0x0297, B:117:0x029b, B:119:0x02a0, B:122:0x02ac, B:126:0x02b3, B:128:0x02c3, B:129:0x02c8, B:131:0x02cb, B:132:0x02d0, B:134:0x02e2, B:135:0x02e7, B:137:0x02ea, B:138:0x02ef, B:139:0x02f4, B:141:0x0300, B:142:0x030a, B:144:0x0310, B:152:0x032c, B:157:0x037e, B:173:0x03a5, B:175:0x03ab, B:177:0x03b3, B:179:0x03d0, B:182:0x03d6, B:191:0x0409, B:195:0x041a, B:196:0x0427, B:199:0x042c, B:200:0x0433, B:201:0x043d, B:202:0x0451, B:212:0x048e, B:214:0x0498, B:216:0x04a0, B:220:0x04b5, B:222:0x04bb, B:223:0x04c0, B:217:0x04a6, B:219:0x04aa, B:226:0x04c7, B:232:0x04df, B:234:0x04e3, B:236:0x04e7, B:238:0x04ed, B:240:0x04f3, B:242:0x04f9, B:244:0x04ff, B:246:0x0507, B:248:0x0513, B:250:0x051c, B:251:0x0521, B:253:0x0525, B:255:0x052b, B:257:0x0533, B:259:0x053b, B:261:0x0561, B:262:0x056a, B:264:0x0573, B:266:0x0581, B:359:0x070a, B:361:0x0710, B:364:0x0718, B:365:0x0722, B:368:0x0727, B:373:0x074d, B:375:0x0753, B:377:0x075b, B:379:0x076a, B:383:0x0777, B:384:0x077c, B:403:0x07b9, B:409:0x07d8, B:411:0x07e1, B:413:0x07e9, B:274:0x05a1, B:277:0x05ad, B:280:0x05b6, B:282:0x05ba, B:284:0x05c2, B:285:0x05c5, B:287:0x05cb, B:289:0x05d5, B:291:0x05dd, B:293:0x05eb, B:295:0x05f3, B:297:0x05ff, B:299:0x0630, B:301:0x0634, B:305:0x0645, B:334:0x06be, B:307:0x064f, B:309:0x0653, B:314:0x065b, B:316:0x0663, B:318:0x0680, B:321:0x0689, B:325:0x0693, B:328:0x069b, B:329:0x06a3, B:331:0x06a9, B:338:0x06d0, B:344:0x06da, B:347:0x06e3, B:349:0x06e9, B:353:0x06f7, B:355:0x06fe), top: B:705:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0826 A[Catch: IOException -> 0x002a, zzvk -> 0x002e, zzhc -> 0x0032, zzat -> 0x0036, zztg -> 0x003a, RuntimeException -> 0x0839, zziw -> 0x083d, TryCatch #24 {zziw -> 0x083d, RuntimeException -> 0x0839, blocks: (B:447:0x087e, B:461:0x08a4, B:471:0x08dc, B:420:0x0814, B:422:0x0826, B:424:0x082c, B:426:0x0831, B:432:0x0843, B:434:0x084a, B:435:0x084d, B:436:0x0856, B:438:0x085a, B:440:0x0860, B:441:0x0865), top: B:719:0x0814 }] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0831 A[Catch: IOException -> 0x002a, zzvk -> 0x002e, zzhc -> 0x0032, zzat -> 0x0036, zztg -> 0x003a, RuntimeException -> 0x0839, zziw -> 0x083d, LOOP:12: B:425:0x082f->B:426:0x0831, LOOP_END, TryCatch #24 {zziw -> 0x083d, RuntimeException -> 0x0839, blocks: (B:447:0x087e, B:461:0x08a4, B:471:0x08dc, B:420:0x0814, B:422:0x0826, B:424:0x082c, B:426:0x0831, B:432:0x0843, B:434:0x084a, B:435:0x084d, B:436:0x0856, B:438:0x085a, B:440:0x0860, B:441:0x0865), top: B:719:0x0814 }] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x084a A[Catch: IOException -> 0x002a, zzvk -> 0x002e, zzhc -> 0x0032, zzat -> 0x0036, zztg -> 0x003a, RuntimeException -> 0x0839, zziw -> 0x083d, TryCatch #24 {zziw -> 0x083d, RuntimeException -> 0x0839, blocks: (B:447:0x087e, B:461:0x08a4, B:471:0x08dc, B:420:0x0814, B:422:0x0826, B:424:0x082c, B:426:0x0831, B:432:0x0843, B:434:0x084a, B:435:0x084d, B:436:0x0856, B:438:0x085a, B:440:0x0860, B:441:0x0865), top: B:719:0x0814 }] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x085a A[Catch: IOException -> 0x002a, zzvk -> 0x002e, zzhc -> 0x0032, zzat -> 0x0036, zztg -> 0x003a, RuntimeException -> 0x0839, zziw -> 0x083d, TryCatch #24 {zziw -> 0x083d, RuntimeException -> 0x0839, blocks: (B:447:0x087e, B:461:0x08a4, B:471:0x08dc, B:420:0x0814, B:422:0x0826, B:424:0x082c, B:426:0x0831, B:432:0x0843, B:434:0x084a, B:435:0x084d, B:436:0x0856, B:438:0x085a, B:440:0x0860, B:441:0x0865), top: B:719:0x0814 }] */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0a2d A[Catch: IOException -> 0x002a, zzvk -> 0x002e, zzhc -> 0x0032, zzat -> 0x0036, zztg -> 0x003a, RuntimeException -> 0x08f7, zziw -> 0x08fb, TryCatch #26 {zziw -> 0x08fb, RuntimeException -> 0x08f7, blocks: (B:493:0x0915, B:475:0x08e6, B:477:0x08ed, B:485:0x0901, B:491:0x0911, B:500:0x0932, B:502:0x0938, B:506:0x0945, B:515:0x0972, B:517:0x0979, B:519:0x097d, B:546:0x0a21, B:548:0x0a2d, B:567:0x0a80, B:570:0x0a88, B:572:0x0a8c, B:574:0x0a96, B:575:0x0a99, B:576:0x0a9f, B:578:0x0aa5, B:580:0x0aae, B:582:0x0ab8, B:584:0x0abe, B:586:0x0ac9, B:587:0x0acd, B:594:0x0aed, B:596:0x0af3, B:600:0x0afd, B:611:0x0b16, B:608:0x0b0f, B:610:0x0b13, B:588:0x0ad0, B:591:0x0ade, B:592:0x0ae6, B:549:0x0a3a, B:551:0x0a41, B:553:0x0a45, B:557:0x0a4e, B:559:0x0a5e, B:561:0x0a64, B:563:0x0a6e, B:564:0x0a73, B:565:0x0a78, B:566:0x0a7d, B:522:0x098b, B:524:0x098f, B:526:0x09a1, B:528:0x09ac, B:530:0x09b6, B:534:0x09bf, B:536:0x09c9, B:542:0x09d4, B:508:0x094d, B:510:0x0951, B:511:0x095c, B:513:0x0962, B:499:0x0929, B:617:0x0b2a, B:621:0x0b35), top: B:705:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0a41 A[Catch: IOException -> 0x002a, zzvk -> 0x002e, zzhc -> 0x0032, zzat -> 0x0036, zztg -> 0x003a, RuntimeException -> 0x08f7, zziw -> 0x08fb, TryCatch #26 {zziw -> 0x08fb, RuntimeException -> 0x08f7, blocks: (B:493:0x0915, B:475:0x08e6, B:477:0x08ed, B:485:0x0901, B:491:0x0911, B:500:0x0932, B:502:0x0938, B:506:0x0945, B:515:0x0972, B:517:0x0979, B:519:0x097d, B:546:0x0a21, B:548:0x0a2d, B:567:0x0a80, B:570:0x0a88, B:572:0x0a8c, B:574:0x0a96, B:575:0x0a99, B:576:0x0a9f, B:578:0x0aa5, B:580:0x0aae, B:582:0x0ab8, B:584:0x0abe, B:586:0x0ac9, B:587:0x0acd, B:594:0x0aed, B:596:0x0af3, B:600:0x0afd, B:611:0x0b16, B:608:0x0b0f, B:610:0x0b13, B:588:0x0ad0, B:591:0x0ade, B:592:0x0ae6, B:549:0x0a3a, B:551:0x0a41, B:553:0x0a45, B:557:0x0a4e, B:559:0x0a5e, B:561:0x0a64, B:563:0x0a6e, B:564:0x0a73, B:565:0x0a78, B:566:0x0a7d, B:522:0x098b, B:524:0x098f, B:526:0x09a1, B:528:0x09ac, B:530:0x09b6, B:534:0x09bf, B:536:0x09c9, B:542:0x09d4, B:508:0x094d, B:510:0x0951, B:511:0x095c, B:513:0x0962, B:499:0x0929, B:617:0x0b2a, B:621:0x0b35), top: B:705:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0a5e A[Catch: IOException -> 0x002a, zzvk -> 0x002e, zzhc -> 0x0032, zzat -> 0x0036, zztg -> 0x003a, RuntimeException -> 0x08f7, zziw -> 0x08fb, TryCatch #26 {zziw -> 0x08fb, RuntimeException -> 0x08f7, blocks: (B:493:0x0915, B:475:0x08e6, B:477:0x08ed, B:485:0x0901, B:491:0x0911, B:500:0x0932, B:502:0x0938, B:506:0x0945, B:515:0x0972, B:517:0x0979, B:519:0x097d, B:546:0x0a21, B:548:0x0a2d, B:567:0x0a80, B:570:0x0a88, B:572:0x0a8c, B:574:0x0a96, B:575:0x0a99, B:576:0x0a9f, B:578:0x0aa5, B:580:0x0aae, B:582:0x0ab8, B:584:0x0abe, B:586:0x0ac9, B:587:0x0acd, B:594:0x0aed, B:596:0x0af3, B:600:0x0afd, B:611:0x0b16, B:608:0x0b0f, B:610:0x0b13, B:588:0x0ad0, B:591:0x0ade, B:592:0x0ae6, B:549:0x0a3a, B:551:0x0a41, B:553:0x0a45, B:557:0x0a4e, B:559:0x0a5e, B:561:0x0a64, B:563:0x0a6e, B:564:0x0a73, B:565:0x0a78, B:566:0x0a7d, B:522:0x098b, B:524:0x098f, B:526:0x09a1, B:528:0x09ac, B:530:0x09b6, B:534:0x09bf, B:536:0x09c9, B:542:0x09d4, B:508:0x094d, B:510:0x0951, B:511:0x095c, B:513:0x0962, B:499:0x0929, B:617:0x0b2a, B:621:0x0b35), top: B:705:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0a87  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0afc  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0b46  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0b4a  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0b93  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0bac  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x0c0e  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x0c12  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x0c1d  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x070a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlf.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zza(float f) {
        this.zzi.zzh(34);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zzb(int i) {
        this.zzi.zze(33, i, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzit
    public final void zzc(zzav zzavVar) {
        this.zzi.zzd(16, zzavVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzacp
    public final void zzcS(long j, long j2, zzv zzvVar, MediaFormat mediaFormat) {
        if (this.zzD) {
            this.zzi.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzi.zzc(29).zza();
    }

    public final void zze(boolean z, int i, int i2) {
        this.zzi.zze(1, z ? 1 : 0, (i2 << 4) | 1).zza();
    }

    public final void zzf(zzbf zzbfVar, int i, long j) {
        this.zzi.zzd(3, new zzle(zzbfVar, i, j)).zza();
    }

    public final void zzg(zzms zzmsVar) {
        this.zzi.zzd(38, zzmsVar).zza();
    }

    public final void zzh() {
        this.zzi.zzc(6).zza();
    }

    public final void zzi(zzd zzdVar, boolean z) {
        this.zzi.zzf(31, 0, 0, zzdVar).zza();
    }

    public final void zzj(float f) {
        this.zzi.zzd(32, Float.valueOf(f)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public final void zzk(zzmh zzmhVar) {
        if (!this.zzI && this.zzk.getThread().isAlive()) {
            this.zzi.zzd(14, zzmhVar).zza();
        } else {
            zzee.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzmhVar.zzi(false);
        }
    }

    public final boolean zzl(Object obj, long j) {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        zzdq zzdqVar = new zzdq(this.zzq);
        this.zzi.zzd(30, new Pair(obj, zzdqVar)).zza();
        if (j != -9223372036854775807L) {
            return zzdqVar.zze(j);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzI || !this.zzk.getThread().isAlive()) {
            return true;
        }
        this.zzI = true;
        zzdq zzdqVar = new zzdq(this.zzq);
        this.zzi.zzd(7, zzdqVar).zza();
        return zzdqVar.zze(this.zzu);
    }

    public final Looper zzn() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzo() {
        zzdx zzdxVar = this.zzi;
        zzdxVar.zzk(2);
        zzdxVar.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzp(zzwi zzwiVar) {
        this.zzi.zzd(8, zzwiVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final void zzq() {
        this.zzi.zzh(10);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final /* bridge */ /* synthetic */ void zzs(zzye zzyeVar) {
        this.zzi.zzd(9, (zzwi) zzyeVar).zza();
    }

    public final /* synthetic */ zzln zzt(zzlo zzloVar, long j) {
        zzaan zzaanVarZze = this.zzg.zze(this.zzv);
        long j2 = this.zzZ.zzb;
        zzaak zzaakVar = this.zzf;
        zzmc zzmcVar = this.zzt;
        return new zzln(this.zzc, j, this.zze, zzaanVarZze, zzmcVar, zzloVar, zzaakVar, -9223372036854775807L);
    }

    public final /* synthetic */ void zzu(int i, boolean z) {
        this.zzw.zzB(i, this.zzb[i].zze(), z);
    }

    public final /* synthetic */ void zzv(int i) {
        this.zzw.zzW(i);
    }

    public final /* synthetic */ zzdx zzx() {
        return this.zzi;
    }

    public final void zzy(List list, int i, long j, zzyf zzyfVar) {
        this.zzi.zzd(17, new zzkz(list, zzyfVar, i, j, null)).zza();
    }
}
