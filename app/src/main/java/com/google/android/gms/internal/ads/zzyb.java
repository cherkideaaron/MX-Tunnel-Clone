package com.google.android.gms.internal.ads;

import defpackage.DP;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzyb implements zzagh {
    private boolean zzB;
    private final zzxw zza;
    private final zzto zzd;
    private final zztj zze;
    private zzya zzf;
    private zzv zzg;
    private zzth zzh;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzw;
    private zzv zzz;
    private final zzxx zzb = new zzxx();
    private int zzi = 1000;
    private long[] zzj = new long[1000];
    private long[] zzk = new long[1000];
    private long[] zzn = new long[1000];
    private int[] zzm = new int[1000];
    private int[] zzl = new int[1000];
    private zzagg[] zzo = new zzagg[1000];
    private final zzyi zzc = new zzyi(zzxy.zza);
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private long zzv = Long.MIN_VALUE;
    private boolean zzy = true;
    private boolean zzx = true;
    private boolean zzA = true;

    public zzyb(zzaan zzaanVar, zzto zztoVar, zztj zztjVar) {
        this.zzd = zztoVar;
        this.zze = zztjVar;
        this.zza = new zzxw(zzaanVar);
    }

    private final synchronized void zzA() {
        this.zzs = 0;
        this.zza.zzb();
    }

    private final synchronized int zzB(zzlh zzlhVar, zzih zzihVar, boolean z, boolean z2, zzxx zzxxVar) {
        try {
            zzihVar.zzd = false;
            if (!zzH()) {
                if (!z2 && !this.zzw) {
                    zzv zzvVar = this.zzz;
                    if (zzvVar == null || (!z && zzvVar == this.zzg)) {
                        return -3;
                    }
                    zzI(zzvVar, zzlhVar);
                    return -5;
                }
                zzihVar.zzg(4);
                zzihVar.zze = Long.MIN_VALUE;
                return -4;
            }
            zzv zzvVar2 = ((zzxz) this.zzc.zza(this.zzq + this.zzs)).zza;
            if (!z && zzvVar2 == this.zzg) {
                int iZzM = zzM(this.zzs);
                if (!zzJ(iZzM)) {
                    zzihVar.zzd = true;
                    return -3;
                }
                zzihVar.zzg(this.zzm[iZzM]);
                if (this.zzs == this.zzp - 1 && (z2 || this.zzw)) {
                    zzihVar.zzh(536870912);
                }
                zzihVar.zze = this.zzn[iZzM];
                zzxxVar.zza = this.zzl[iZzM];
                zzxxVar.zzb = this.zzk[iZzM];
                zzxxVar.zzc = this.zzo[iZzM];
                return -4;
            }
            zzI(zzvVar2, zzlhVar);
            return -5;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized boolean zzC(zzv zzvVar) {
        try {
            this.zzy = false;
            if (Objects.equals(zzvVar, this.zzz)) {
                return false;
            }
            zzyi zzyiVar = this.zzc;
            if (!zzyiVar.zzf() && ((zzxz) zzyiVar.zzc()).zza.equals(zzvVar)) {
                zzvVar = ((zzxz) zzyiVar.zzc()).zza;
            }
            this.zzz = zzvVar;
            boolean z = this.zzA;
            zzv zzvVar2 = this.zzz;
            this.zzA = z & zzas.zzd(zzvVar2.zzo, zzvVar2.zzk);
            this.zzB = false;
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized long zzD(long j, boolean z, boolean z2) {
        int i;
        try {
            int i2 = this.zzp;
            if (i2 != 0) {
                long[] jArr = this.zzn;
                int i3 = this.zzr;
                if (j >= jArr[i3]) {
                    if (z2 && (i = this.zzs) != i2) {
                        i2 = i + 1;
                    }
                    int iZzK = zzK(i3, i2, j, false);
                    if (iZzK != -1) {
                        return zzL(iZzK);
                    }
                }
            }
            return -1L;
        } finally {
        }
    }

    private final synchronized long zzE() {
        int i = this.zzp;
        if (i == 0) {
            return -1L;
        }
        return zzL(i);
    }

    private final void zzF() {
        if (this.zzh != null) {
            this.zzh = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzG(long j, int i, long j2, int i2, zzagg zzaggVar) {
        try {
            int i3 = this.zzp;
            if (i3 > 0) {
                int iZzM = zzM(i3 - 1);
                zzgrc.zza(this.zzk[iZzM] + ((long) this.zzl[iZzM]) <= j2);
            }
            this.zzw = (536870912 & i) != 0;
            this.zzv = Math.max(this.zzv, j);
            int iZzM2 = zzM(this.zzp);
            this.zzn[iZzM2] = j;
            this.zzk[iZzM2] = j2;
            this.zzl[iZzM2] = i2;
            this.zzm[iZzM2] = i;
            this.zzo[iZzM2] = zzaggVar;
            this.zzj[iZzM2] = 0;
            zzyi zzyiVar = this.zzc;
            if (zzyiVar.zzf() || !((zzxz) zzyiVar.zzc()).zza.equals(this.zzz)) {
                zzv zzvVar = this.zzz;
                zzvVar.getClass();
                zzyiVar.zzb(this.zzq + this.zzp, new zzxz(zzvVar, zztn.zzb, null));
            }
            int i4 = this.zzp + 1;
            this.zzp = i4;
            int i5 = this.zzi;
            if (i4 == i5) {
                int i6 = i5 + 1000;
                long[] jArr = new long[i6];
                long[] jArr2 = new long[i6];
                long[] jArr3 = new long[i6];
                int[] iArr = new int[i6];
                int[] iArr2 = new int[i6];
                zzagg[] zzaggVarArr = new zzagg[i6];
                int i7 = this.zzr;
                int i8 = i5 - i7;
                System.arraycopy(this.zzk, i7, jArr2, 0, i8);
                System.arraycopy(this.zzn, this.zzr, jArr3, 0, i8);
                System.arraycopy(this.zzm, this.zzr, iArr, 0, i8);
                System.arraycopy(this.zzl, this.zzr, iArr2, 0, i8);
                System.arraycopy(this.zzo, this.zzr, zzaggVarArr, 0, i8);
                System.arraycopy(this.zzj, this.zzr, jArr, 0, i8);
                int i9 = this.zzr;
                System.arraycopy(this.zzk, 0, jArr2, i8, i9);
                System.arraycopy(this.zzn, 0, jArr3, i8, i9);
                System.arraycopy(this.zzm, 0, iArr, i8, i9);
                System.arraycopy(this.zzl, 0, iArr2, i8, i9);
                System.arraycopy(this.zzo, 0, zzaggVarArr, i8, i9);
                System.arraycopy(this.zzj, 0, jArr, i8, i9);
                this.zzk = jArr2;
                this.zzn = jArr3;
                this.zzm = iArr;
                this.zzl = iArr2;
                this.zzo = zzaggVarArr;
                this.zzj = jArr;
                this.zzr = 0;
                this.zzi = i6;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean zzH() {
        return this.zzs != this.zzp;
    }

    private final void zzI(zzv zzvVar, zzlh zzlhVar) {
        zzv zzvVar2 = this.zzg;
        zzq zzqVar = zzvVar2 == null ? null : zzvVar2.zzs;
        this.zzg = zzvVar;
        zzq zzqVar2 = zzvVar.zzs;
        zzto zztoVar = this.zzd;
        zzlhVar.zzb = zzvVar.zzb(zztoVar.zzb(zzvVar));
        zzlhVar.zza = this.zzh;
        if (zzvVar2 == null || !Objects.equals(zzqVar, zzqVar2)) {
            zzth zzthVarZza = zztoVar.zza(this.zze, zzvVar);
            this.zzh = zzthVarZza;
            zzlhVar.zza = zzthVarZza;
        }
    }

    private final boolean zzJ(int i) {
        if (this.zzh != null) {
            return (this.zzm[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final int zzK(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.zzn[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.zzm[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.zzi) {
                i = 0;
            }
        }
        return i3;
    }

    private final long zzL(int i) {
        long j = this.zzu;
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int iZzM = zzM(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                jMax = Math.max(jMax, this.zzn[iZzM]);
                if ((this.zzm[iZzM] & 1) != 0) {
                    break;
                }
                iZzM--;
                if (iZzM == -1) {
                    iZzM = this.zzi - 1;
                }
            }
        }
        this.zzu = Math.max(j, jMax);
        this.zzp -= i;
        int i3 = this.zzq + i;
        this.zzq = i3;
        int i4 = this.zzr + i;
        this.zzr = i4;
        int i5 = this.zzi;
        if (i4 >= i5) {
            this.zzr = i4 - i5;
        }
        int i6 = this.zzs - i;
        this.zzs = i6;
        if (i6 < 0) {
            this.zzs = 0;
        }
        this.zzc.zzd(i3);
        if (this.zzp != 0) {
            return this.zzk[this.zzr];
        }
        int i7 = this.zzr;
        if (i7 == 0) {
            i7 = this.zzi;
        }
        return this.zzk[i7 - 1] + this.zzl[r12];
    }

    private final int zzM(int i) {
        int i2 = this.zzr + i;
        int i3 = this.zzi;
        return i2 < i3 ? i2 : i2 - i3;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final /* synthetic */ void zzN(long j) {
        DP.a(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final /* synthetic */ int zza(zzj zzjVar, int i, boolean z) {
        return DP.b(this, zzjVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzb(zzj zzjVar, int i, boolean z, int i2) {
        return this.zza.zzg(zzjVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final /* synthetic */ void zzc(zzer zzerVar, int i) {
        DP.c(this, zzerVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzd(zzer zzerVar, int i, int i2) {
        this.zza.zzh(zzerVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, int i, int i2, int i3, zzagg zzaggVar) {
        if (this.zzx) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.zzx = false;
            }
        }
        if (this.zzA) {
            if (j < this.zzt) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.zzB) {
                    zzee.zzc("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzz)));
                    this.zzB = true;
                }
                i |= 1;
            }
        }
        zzG(j, i, (this.zza.zzf() - i2) - i3, i2, zzaggVar);
    }

    public final void zzf() {
        zzg(true);
        zzF();
    }

    public final void zzg(boolean z) {
        this.zza.zza();
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzx = true;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = Long.MIN_VALUE;
        this.zzw = false;
        this.zzc.zze();
        if (z) {
            this.zzz = null;
            this.zzy = true;
            this.zzA = true;
        }
    }

    public final void zzh(long j) {
        this.zzt = j;
    }

    public final int zzi() {
        return this.zzq + this.zzp;
    }

    public final void zzj() {
        zzx();
        zzF();
    }

    public final void zzk() {
        zzth zzthVar = this.zzh;
        if (zzthVar != null) {
            throw zzthVar.zza();
        }
    }

    public final int zzl() {
        return this.zzq;
    }

    public final int zzm() {
        return this.zzq + this.zzs;
    }

    public final synchronized zzv zzn() {
        if (this.zzy) {
            return null;
        }
        return this.zzz;
    }

    public final synchronized long zzo() {
        return this.zzv;
    }

    public final synchronized boolean zzp() {
        return this.zzw;
    }

    public final synchronized boolean zzq(boolean z) {
        boolean z2 = true;
        if (zzH()) {
            if (((zzxz) this.zzc.zza(this.zzq + this.zzs)).zza != this.zzg) {
                return true;
            }
            return zzJ(zzM(this.zzs));
        }
        if (!z && !this.zzw) {
            zzv zzvVar = this.zzz;
            if (zzvVar == null) {
                z2 = false;
            } else if (zzvVar == this.zzg) {
                return false;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r9 != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzr(com.google.android.gms.internal.ads.zzlh r9, com.google.android.gms.internal.ads.zzih r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = r1
            goto L9
        L7:
            r0 = 0
            r5 = r0
        L9:
            com.google.android.gms.internal.ads.zzxx r0 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            r7 = r0
            int r9 = r2.zzB(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3b
            boolean r9 = r10.zzb()
            if (r9 != 0) goto L2a
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L32
            if (r9 == 0) goto L2c
            com.google.android.gms.internal.ads.zzxw r9 = r8.zza
            r9.zzd(r10, r0)
        L2a:
            r9 = r12
            goto L3b
        L2c:
            com.google.android.gms.internal.ads.zzxw r9 = r8.zza
            r9.zzc(r10, r0)
            goto L35
        L32:
            if (r9 == 0) goto L35
            goto L2a
        L35:
            int r9 = r8.zzs
            int r9 = r9 + r1
            r8.zzs = r9
            return r12
        L3b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyb.zzr(com.google.android.gms.internal.ads.zzlh, com.google.android.gms.internal.ads.zzih, int, boolean):int");
    }

    public final synchronized boolean zzs(int i) {
        zzA();
        int i2 = this.zzq;
        if (i >= i2 && i <= this.zzp + i2) {
            this.zzt = Long.MIN_VALUE;
            this.zzs = i - i2;
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:30:0x0057, B:27:0x0049), top: B:37:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:30:0x0057, B:27:0x0049), top: B:37:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0001, B:5:0x0011, B:7:0x0019, B:11:0x0023, B:13:0x0028, B:15:0x002e, B:17:0x0036, B:20:0x003d, B:30:0x0057, B:27:0x0049), top: B:37:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzt(long r11, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            r10.zzA()     // Catch: java.lang.Throwable -> L40
            int r0 = r10.zzs     // Catch: java.lang.Throwable -> L40
            int r2 = r10.zzM(r0)     // Catch: java.lang.Throwable -> L40
            boolean r1 = r10.zzH()     // Catch: java.lang.Throwable -> L40
            r7 = 0
            if (r1 == 0) goto L60
            long[] r1 = r10.zzn     // Catch: java.lang.Throwable -> L40
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L40
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 < 0) goto L60
            long r3 = r10.zzv     // Catch: java.lang.Throwable -> L40
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            r8 = 1
            if (r1 <= 0) goto L23
            if (r13 == 0) goto L60
            r13 = r8
        L23:
            boolean r1 = r10.zzA     // Catch: java.lang.Throwable -> L40
            r9 = -1
            if (r1 == 0) goto L49
            int r1 = r10.zzp     // Catch: java.lang.Throwable -> L40
            int r1 = r1 - r0
            r0 = r7
        L2c:
            if (r0 >= r1) goto L44
            long[] r3 = r10.zzn     // Catch: java.lang.Throwable -> L40
            r4 = r3[r2]     // Catch: java.lang.Throwable -> L40
            int r3 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r3 >= 0) goto L42
            int r2 = r2 + 1
            int r3 = r10.zzi     // Catch: java.lang.Throwable -> L40
            if (r2 != r3) goto L3d
            r2 = r7
        L3d:
            int r0 = r0 + 1
            goto L2c
        L40:
            r11 = move-exception
            goto L62
        L42:
            r1 = r0
            goto L54
        L44:
            if (r13 == 0) goto L47
            goto L54
        L47:
            r1 = r9
            goto L54
        L49:
            int r13 = r10.zzp     // Catch: java.lang.Throwable -> L40
            int r3 = r13 - r0
            r6 = 1
            r1 = r10
            r4 = r11
            int r1 = r1.zzK(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L40
        L54:
            if (r1 != r9) goto L57
            goto L60
        L57:
            r10.zzt = r11     // Catch: java.lang.Throwable -> L40
            int r11 = r10.zzs     // Catch: java.lang.Throwable -> L40
            int r11 = r11 + r1
            r10.zzs = r11     // Catch: java.lang.Throwable -> L40
            monitor-exit(r10)
            return r8
        L60:
            monitor-exit(r10)
            return r7
        L62:
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyb.zzt(long, boolean):boolean");
    }

    public final synchronized int zzu(long j, boolean z) {
        int i = this.zzs;
        int iZzM = zzM(i);
        if (zzH() && j >= this.zzn[iZzM]) {
            if (j > this.zzv && z) {
                return this.zzp - i;
            }
            int iZzK = zzK(iZzM, this.zzp - i, j, true);
            if (iZzK == -1) {
                return 0;
            }
            return iZzK;
        }
        return 0;
    }

    public final synchronized void zzv(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.zzs + i <= this.zzp) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzgrc.zza(z);
        this.zzs += i;
    }

    public final void zzw(long j, boolean z, boolean z2) {
        this.zza.zze(zzD(j, false, z2));
    }

    public final void zzx() {
        this.zza.zze(zzE());
    }

    public final void zzy(zzya zzyaVar) {
        this.zzf = zzyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzz(zzv zzvVar) {
        boolean zZzC = zzC(zzvVar);
        zzya zzyaVar = this.zzf;
        if (zzyaVar == null || !zZzC) {
            return;
        }
        zzyaVar.zzy(zzvVar);
    }
}
