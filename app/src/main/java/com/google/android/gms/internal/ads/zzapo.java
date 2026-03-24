package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes.dex */
public final class zzapo implements zzaqc {
    private final zzapn zza;
    private final zzer zzb = new zzer(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzapo(zzapn zzapnVar) {
        this.zza = zzapnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
        this.zza.zza(zzfgVar, zzaexVar, zzaqbVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zzb() {
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    public final void zzc(zzer zzerVar, int i) {
        int i2 = i & 1;
        int iZzg = i2 != 0 ? zzerVar.zzg() + zzerVar.zzs() : -1;
        if (this.zzf) {
            if (i2 == 0) {
                return;
            }
            this.zzf = false;
            zzerVar.zzh(iZzg);
            this.zzd = 0;
        }
        while (zzerVar.zzd() > 0) {
            int i3 = this.zzd;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iZzs = zzerVar.zzs();
                    zzerVar.zzh(zzerVar.zzg() - 1);
                    if (iZzs == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int iMin = Math.min(zzerVar.zzd(), 3 - this.zzd);
                zzer zzerVar2 = this.zzb;
                zzerVar.zzm(zzerVar2.zzi(), this.zzd, iMin);
                int i4 = this.zzd + iMin;
                this.zzd = i4;
                if (i4 == 3) {
                    zzerVar2.zzh(0);
                    zzerVar2.zzf(3);
                    zzerVar2.zzk(1);
                    int iZzs2 = zzerVar2.zzs();
                    boolean z = (iZzs2 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
                    int iZzs3 = zzerVar2.zzs();
                    this.zze = z;
                    this.zzc = (((iZzs2 & 15) << 8) | iZzs3) + 3;
                    int iZzj = zzerVar2.zzj();
                    int i5 = this.zzc;
                    if (iZzj < i5) {
                        int iZzj2 = zzerVar2.zzj();
                        zzerVar2.zzc(Math.min(4098, Math.max(i5, iZzj2 + iZzj2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zzerVar.zzd(), this.zzc - this.zzd);
                zzer zzerVar3 = this.zzb;
                zzerVar.zzm(zzerVar3.zzi(), this.zzd, iMin2);
                int i6 = this.zzd + iMin2;
                this.zzd = i6;
                int i7 = this.zzc;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.zze) {
                        if (zzfj.zzG(zzerVar3.zzi(), 0, i7, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        i7 = this.zzc - 4;
                    }
                    zzerVar3.zzf(i7);
                    zzerVar3.zzh(0);
                    this.zza.zzb(zzerVar3);
                    this.zzd = 0;
                }
            }
        }
    }
}
