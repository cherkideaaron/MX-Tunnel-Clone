package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class zzaow implements zzaon {
    private final zzapq zza;
    private String zzb;
    private zzagh zzc;
    private zzaov zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzape zzg = new zzape(32, UserVerificationMethods.USER_VERIFY_PATTERN);
    private final zzape zzh = new zzape(33, UserVerificationMethods.USER_VERIFY_PATTERN);
    private final zzape zzi = new zzape(34, UserVerificationMethods.USER_VERIFY_PATTERN);
    private final zzape zzj = new zzape(39, UserVerificationMethods.USER_VERIFY_PATTERN);
    private final zzape zzk = new zzape(40, UserVerificationMethods.USER_VERIFY_PATTERN);
    private long zzm = -9223372036854775807L;
    private final zzer zzn = new zzer();

    public zzaow(zzapq zzapqVar, String str) {
        this.zza = zzapqVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(long j, int i, int i2, long j2) {
        this.zzd.zzb(j, i, i2, j2, this.zze);
        if (!this.zze) {
            this.zzg.zzc(i2);
            this.zzh.zzc(i2);
            this.zzi.zzc(i2);
        }
        this.zzj.zzc(i2);
        this.zzk.zzc(i2);
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzg(byte[] bArr, int i, int i2) {
        this.zzd.zzc(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zzd(bArr, i, i2);
            this.zzh.zzd(bArr, i, i2);
            this.zzi.zzd(bArr, i, i2);
        }
        this.zzj.zzd(bArr, i, i2);
        this.zzk.zzd(bArr, i, i2);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private final void zzh(long j, int i, int i2, long j2) {
        this.zzd.zzd(j, i, this.zze);
        if (!this.zze) {
            zzape zzapeVar = this.zzg;
            zzapeVar.zze(i2);
            zzape zzapeVar2 = this.zzh;
            zzapeVar2.zze(i2);
            zzape zzapeVar3 = this.zzi;
            zzapeVar3.zze(i2);
            if (zzapeVar.zzb() && zzapeVar2.zzb() && zzapeVar3.zzb()) {
                String str = this.zzb;
                int i3 = zzapeVar.zzb;
                byte[] bArr = new byte[zzapeVar2.zzb + i3 + zzapeVar3.zzb];
                System.arraycopy(zzapeVar.zza, 0, bArr, 0, i3);
                System.arraycopy(zzapeVar2.zza, 0, bArr, zzapeVar.zzb, zzapeVar2.zzb);
                System.arraycopy(zzapeVar3.zza, 0, bArr, zzapeVar.zzb + zzapeVar2.zzb, zzapeVar3.zzb);
                String strZzb = null;
                zzgg zzggVarZzg = zzgm.zzg(zzapeVar2.zza, 3, zzapeVar2.zzb, null);
                zzgb zzgbVar = zzggVarZzg.zzb;
                if (zzgbVar != null) {
                    int i4 = zzgbVar.zzf;
                    int[] iArr = zzgbVar.zze;
                    int i5 = zzgbVar.zzd;
                    strZzb = zzdo.zzb(zzgbVar.zza, zzgbVar.zzb, zzgbVar.zzc, i5, iArr, i4);
                }
                zzt zztVar = new zzt();
                zztVar.zza(str);
                zztVar.zzl("video/mp2t");
                zztVar.zzm("video/hevc");
                zztVar.zzj(strZzb);
                zztVar.zzt(zzggVarZzg.zze);
                zztVar.zzu(zzggVarZzg.zzf);
                zztVar.zzv(zzggVarZzg.zzg);
                zztVar.zzw(zzggVarZzg.zzh);
                zzh zzhVar = new zzh();
                zzhVar.zza(zzggVarZzg.zzk);
                zzhVar.zzb(zzggVarZzg.zzl);
                zzhVar.zzc(zzggVarZzg.zzm);
                zzhVar.zze(zzggVarZzg.zzc + 8);
                zzhVar.zzf(zzggVarZzg.zzd + 8);
                zztVar.zzC(zzhVar.zzg());
                zztVar.zzz(zzggVarZzg.zzi);
                zztVar.zzo(zzggVarZzg.zzj);
                zztVar.zzD(zzggVarZzg.zza + 1);
                zztVar.zzp(Collections.singletonList(bArr));
                zzv zzvVarZzM = zztVar.zzM();
                this.zzc.zzz(zzvVarZzM);
                int i6 = zzvVarZzM.zzq;
                zzgrc.zzi(i6 != -1);
                this.zza.zzb(i6);
                this.zze = true;
            }
        }
        zzape zzapeVar4 = this.zzj;
        if (zzapeVar4.zze(i2)) {
            int iZza = zzgm.zza(zzapeVar4.zza, zzapeVar4.zzb);
            zzer zzerVar = this.zzn;
            zzerVar.zzb(zzapeVar4.zza, iZza);
            zzerVar.zzk(5);
            this.zza.zzc(j2, zzerVar);
        }
        zzape zzapeVar5 = this.zzk;
        if (zzapeVar5.zze(i2)) {
            int iZza2 = zzgm.zza(zzapeVar5.zza, zzapeVar5.zzb);
            zzer zzerVar2 = this.zzn;
            zzerVar2.zzb(zzapeVar5.zza, iZza2);
            zzerVar2.zzk(5);
            this.zza.zzc(j2, zzerVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzgm.zzj(this.zzf);
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
        this.zzj.zza();
        this.zzk.zza();
        this.zza.zze();
        zzaov zzaovVar = this.zzd;
        if (zzaovVar != null) {
            zzaovVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzb = zzaqbVar.zzc();
        zzagh zzaghVarZzu = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        this.zzc = zzaghVarZzu;
        this.zzd = new zzaov(zzaghVarZzu);
        this.zza.zza(zzaexVar, zzaqbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j, int i) {
        this.zzm = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    @Override // com.google.android.gms.internal.ads.zzaon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzer r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = 3
            com.google.android.gms.internal.ads.zzagh r0 = r7.zzc
            r0.getClass()
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfj.zza
        La:
            int r0 = r19.zzd()
            if (r0 <= 0) goto L7c
            int r0 = r19.zzg()
            int r9 = r19.zze()
            byte[] r10 = r19.zzi()
            long r1 = r7.zzl
            int r3 = r19.zzd()
            long r3 = (long) r3
            long r1 = r1 + r3
            r7.zzl = r1
            com.google.android.gms.internal.ads.zzagh r1 = r7.zzc
            int r2 = r19.zzd()
            r11 = r19
            r1.zzc(r11, r2)
        L31:
            if (r0 >= r9) goto La
            boolean[] r1 = r7.zzf
            int r1 = com.google.android.gms.internal.ads.zzgm.zzi(r10, r0, r9, r1)
            if (r1 == r9) goto L79
            int r2 = r1 + 3
            r2 = r10[r2]
            r2 = r2 & 126(0x7e, float:1.77E-43)
            if (r1 <= 0) goto L4d
            int r3 = r1 + (-1)
            r4 = r10[r3]
            if (r4 != 0) goto L4d
            r1 = 4
            r13 = r1
            r12 = r3
            goto L4f
        L4d:
            r12 = r1
            r13 = r8
        L4f:
            int r1 = r12 - r0
            if (r1 <= 0) goto L56
            r7.zzg(r10, r0, r12)
        L56:
            int r14 = r9 - r12
            long r3 = r7.zzl
            long r5 = (long) r14
            long r15 = r3 - r5
            if (r1 >= 0) goto L62
            int r0 = -r1
        L60:
            r4 = r0
            goto L64
        L62:
            r0 = 0
            goto L60
        L64:
            int r17 = r2 >> 1
            long r5 = r7.zzm
            r0 = r18
            r1 = r15
            r3 = r14
            r0.zzh(r1, r3, r4, r5)
            long r5 = r7.zzm
            r4 = r17
            r0.zzf(r1, r3, r4, r5)
            int r0 = r12 + r13
            goto L31
        L79:
            r7.zzg(r10, r0, r9)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaow.zzd(com.google.android.gms.internal.ads.zzer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z) {
        this.zzc.getClass();
        String str = zzfj.zza;
        if (z) {
            this.zza.zzd();
            zzh(this.zzl, 0, 0, this.zzm);
            zzf(this.zzl, 0, 48, this.zzm);
        }
    }
}
