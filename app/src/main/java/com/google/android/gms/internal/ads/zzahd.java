package com.google.android.gms.internal.ads;

import defpackage.AbstractC3759zP;

/* loaded from: classes.dex */
final class zzahd implements zzaef {
    private final zzafh zza;
    private final int zzb;
    private final zzafb zzc = new zzafb();

    public /* synthetic */ zzahd(zzafh zzafhVar, int i, byte[] bArr) {
        this.zza = zzafhVar;
        this.zzb = i;
    }

    private final long zzc(zzaev zzaevVar) {
        while (zzaevVar.zzm() < zzaevVar.zzo() - 6) {
            zzafh zzafhVar = this.zza;
            int i = this.zzb;
            zzafb zzafbVar = this.zzc;
            long jZzm = zzaevVar.zzm();
            zzer zzerVar = new zzer(17);
            zzaevVar.zzi(zzerVar.zzi(), 0, 2);
            if (zzerVar.zzo() != i) {
                zzaevVar.zzl();
                zzaevVar.zzk((int) (jZzm - zzaevVar.zzn()));
            } else {
                zzerVar.zzf(zzaey.zzb(zzaevVar, zzerVar.zzi(), 2, 15) + 2);
                zzaevVar.zzl();
                zzaevVar.zzk((int) (jZzm - zzaevVar.zzn()));
                if (zzafc.zza(zzerVar, zzafhVar, i, zzafbVar)) {
                    break;
                }
            }
            zzaevVar.zzk(1);
        }
        if (zzaevVar.zzm() < zzaevVar.zzo() - 6) {
            return this.zzc.zza;
        }
        zzaevVar.zzk((int) (zzaevVar.zzo() - zzaevVar.zzm()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaee zza(zzaev zzaevVar, long j) {
        long jZzn = zzaevVar.zzn();
        long jZzc = zzc(zzaevVar);
        long jZzm = zzaevVar.zzm();
        zzaevVar.zzk(Math.max(6, this.zza.zzc));
        long jZzc2 = zzc(zzaevVar);
        return (jZzc > j || jZzc2 <= j) ? jZzc2 <= j ? zzaee.zzb(jZzc2, zzaevVar.zzm()) : zzaee.zza(jZzc, jZzn) : zzaee.zzc(jZzm);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final /* synthetic */ void zzb() {
        AbstractC3759zP.a(this);
    }
}
