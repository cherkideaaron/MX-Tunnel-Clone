package com.google.android.gms.internal.ads;

import defpackage.AP;
import java.util.List;

/* loaded from: classes.dex */
public final class zzaoi implements zzaeu {
    private final zzaoj zza;
    private final zzer zzb;
    private final zzer zzc;
    private final zzeq zzd;
    private zzaex zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzaoi() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzaev r11) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            com.google.android.gms.internal.ads.zzer r2 = r10.zzc
            byte[] r3 = r2.zzi()
            r4 = r11
            com.google.android.gms.internal.ads.zzael r4 = (com.google.android.gms.internal.ads.zzael) r4
            r5 = 10
            r4.zzh(r3, r0, r5, r0)
            r2.zzh(r0)
            int r3 = r2.zzx()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r3 == r5) goto L83
            r11.zzl()
            r3 = r11
            com.google.android.gms.internal.ads.zzael r3 = (com.google.android.gms.internal.ads.zzael) r3
            r3.zzj(r1, r0)
            long r4 = r10.zzg
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L30
            long r4 = (long) r1
            r10.zzg = r4
        L30:
            r4 = r0
            r6 = r4
            r5 = r1
        L33:
            byte[] r7 = r2.zzi()
            r8 = 2
            r3.zzh(r7, r0, r8, r0)
            r2.zzh(r0)
            int r7 = r2.zzt()
            boolean r7 = com.google.android.gms.internal.ads.zzaoj.zzf(r7)
            if (r7 != 0) goto L53
        L48:
            int r5 = r5 + 1
            r11.zzl()
            r3.zzj(r5, r0)
            r4 = r0
            r6 = r4
            goto L7c
        L53:
            r7 = 1
            int r4 = r4 + r7
            r8 = 4
            if (r4 < r8) goto L5e
            r9 = 188(0xbc, float:2.63E-43)
            if (r6 > r9) goto L5d
            goto L5e
        L5d:
            return r7
        L5e:
            byte[] r7 = r2.zzi()
            r3.zzh(r7, r0, r8, r0)
            com.google.android.gms.internal.ads.zzeq r7 = r10.zzd
            r8 = 14
            r7.zzf(r8)
            r8 = 13
            int r7 = r7.zzj(r8)
            r8 = 6
            if (r7 > r8) goto L76
            goto L48
        L76:
            int r8 = r7 + (-6)
            r3.zzj(r8, r0)
            int r6 = r6 + r7
        L7c:
            int r7 = r5 - r1
            r8 = 8192(0x2000, float:1.148E-41)
            if (r7 < r8) goto L33
            return r0
        L83:
            r3 = 3
            r2.zzk(r3)
            int r2 = r2.zzG()
            int r3 = r2 + 10
            int r1 = r1 + r3
            r4.zzj(r2, r0)
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoi.zza(com.google.android.gms.internal.ads.zzaev):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ List zzb() {
        return AP.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zze = zzaexVar;
        this.zza.zzb(zzaexVar, new zzaqb(Integer.MIN_VALUE, 0, 1));
        zzaexVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) {
        this.zze.getClass();
        zzer zzerVar = this.zzb;
        int iZza = zzaevVar.zza(zzerVar.zzi(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzw(new zzafx(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (iZza == -1) {
            return -1;
        }
        zzerVar.zzh(0);
        zzerVar.zzf(iZza);
        if (!this.zzh) {
            this.zza.zzc(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zzd(zzerVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j, long j2) {
        this.zzh = false;
        this.zza.zza();
        this.zzf = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final /* synthetic */ zzaeu zzg() {
        return AP.b(this);
    }

    public zzaoi(int i) {
        this.zza = new zzaoj(true, null, 0, "audio/mp4a-latm");
        this.zzb = new zzer(2048);
        this.zzg = -1L;
        zzer zzerVar = new zzer(10);
        this.zzc = zzerVar;
        byte[] bArrZzi = zzerVar.zzi();
        this.zzd = new zzeq(bArrZzi, bArrZzi.length);
    }
}
