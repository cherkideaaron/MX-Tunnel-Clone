package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.AP;
import java.util.List;

/* loaded from: classes.dex */
final class zzaho implements zzaeu {
    private zzaex zzb;
    private zzahv zzc;
    private zzaev zzd;
    private zzagd zze;
    private zzakw zzf;
    private int zzh;
    private long zzi;
    private int zzj;
    private final zzer zza = new zzer(16);
    private long zzk = -1;
    private int zzg = 0;

    private final void zzh() {
        zzaex zzaexVar = this.zzb;
        zzaexVar.getClass();
        zzaexVar.zzv();
        this.zzb.zzw(new zzafx(-9223372036854775807L, 0L));
        this.zzg = 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzaev r13) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.zzer r0 = new com.google.android.gms.internal.ads.zzer
            r1 = 16
            r0.<init>(r1)
            r2 = 1
            r3 = r2
        L9:
            r4 = 8
            r0.zza(r4)
            byte[] r5 = r0.zzi()
            r6 = 0
            boolean r5 = r13.zzh(r5, r6, r4, r2)
            if (r5 != 0) goto L1b
        L19:
            r2 = r6
            goto L71
        L1b:
            long r7 = r0.zzz()
            int r5 = r0.zzB()
            r9 = 1
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 != 0) goto L3a
            byte[] r7 = r0.zzi()
            boolean r7 = r13.zzh(r7, r4, r4, r2)
            if (r7 != 0) goto L34
            goto L19
        L34:
            long r7 = r0.zzJ()
            r9 = r1
            goto L3b
        L3a:
            r9 = r4
        L3b:
            long r9 = (long) r9
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L41
            goto L19
        L41:
            long r7 = r7 - r9
            int r7 = (int) r7
            if (r3 == 0) goto L6c
            r3 = 1718909296(0x66747970, float:2.8862439E23)
            if (r5 != r3) goto L19
            if (r7 >= r4) goto L4d
            goto L19
        L4d:
            r3 = 4
            r0.zza(r3)
            byte[] r4 = r0.zzi()
            r5 = r13
            com.google.android.gms.internal.ads.zzael r5 = (com.google.android.gms.internal.ads.zzael) r5
            r5.zzh(r4, r6, r3, r6)
            int r3 = r0.zzB()
            r4 = 1751476579(0x68656963, float:4.333464E24)
            if (r3 == r4) goto L65
            goto L19
        L65:
            int r7 = r7 + (-4)
            r5.zzj(r7, r6)
        L6a:
            r3 = r6
            goto L9
        L6c:
            r3 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r5 != r3) goto L72
        L71:
            return r2
        L72:
            if (r7 == 0) goto L6a
            r3 = r13
            com.google.android.gms.internal.ads.zzael r3 = (com.google.android.gms.internal.ads.zzael) r3
            r3.zzj(r7, r6)
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaho.zza(com.google.android.gms.internal.ads.zzaev):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ List zzb() {
        return AP.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzb = zzaexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws zzat {
        while (true) {
            int i = this.zzg;
            if (i == 0) {
                if (this.zzj == 0) {
                    zzer zzerVar = this.zza;
                    if (!zzaevVar.zzb(zzerVar.zzi(), 0, 8, true)) {
                        zzh();
                        return -1;
                    }
                    this.zzj = 8;
                    zzerVar.zzh(0);
                    this.zzi = zzerVar.zzz();
                    this.zzh = zzerVar.zzB();
                }
                long jZzJ = this.zzi;
                if (jZzJ == 1) {
                    zzer zzerVar2 = this.zza;
                    zzaevVar.zzc(zzerVar2.zzi(), 8, 8);
                    this.zzj += 8;
                    jZzJ = zzerVar2.zzJ();
                    this.zzi = jZzJ;
                }
                if (this.zzh == 1836086884) {
                    long jZzn = zzaevVar.zzn();
                    this.zzk = jZzn;
                    long j = this.zzj;
                    zzahv zzahvVar = new zzahv(0L, jZzn - j, -9223372036854775807L, jZzn, jZzJ - j);
                    this.zzc = zzahvVar;
                    zzaex zzaexVar = this.zzb;
                    zzaexVar.getClass();
                    zzagh zzaghVarZzu = zzaexVar.zzu(UserVerificationMethods.USER_VERIFY_ALL, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzl("image/heic");
                    zztVar.zzk(new zzap(-9223372036854775807L, zzahvVar));
                    zzaghVarZzu.zzz(zztVar.zzM());
                    this.zzg = 2;
                } else {
                    this.zzg = 1;
                }
            } else if (i == 1) {
                zzaevVar.zzf((int) (this.zzi - this.zzj));
                this.zzj = 0;
                this.zzg = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        return -1;
                    }
                    if (this.zze == null || zzaevVar != this.zzd) {
                        this.zzd = zzaevVar;
                        this.zze = new zzagd(zzaevVar, this.zzk);
                    }
                    zzakw zzakwVar = this.zzf;
                    zzakwVar.getClass();
                    int iZzd = zzakwVar.zzd(this.zze, zzafvVar);
                    if (iZzd == 1) {
                        zzafvVar.zza += this.zzk;
                    }
                    return iZzd;
                }
                if (this.zzf == null) {
                    this.zzf = new zzakw(zzamd.zza, 8);
                }
                zzagd zzagdVar = new zzagd(zzaevVar, this.zzk);
                this.zze = zzagdVar;
                if (this.zzf.zza(zzagdVar)) {
                    zzakw zzakwVar2 = this.zzf;
                    long j2 = this.zzk;
                    zzaex zzaexVar2 = this.zzb;
                    zzaexVar2.getClass();
                    zzakwVar2.zzc(new zzagf(j2, zzaexVar2));
                    this.zzg = 3;
                } else {
                    zzh();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j, long j2) {
        if (j != 0) {
            if (this.zzg == 3) {
                zzakw zzakwVar = this.zzf;
                zzakwVar.getClass();
                zzakwVar.zze(j, j2);
                return;
            }
            return;
        }
        this.zzg = 0;
        this.zzj = 0;
        this.zzk = -1L;
        if (this.zzf != null) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
        if (this.zzf != null) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ zzaeu zzg() {
        return AP.b(this);
    }
}
