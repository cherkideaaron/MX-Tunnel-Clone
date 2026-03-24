package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;
import java.util.Collections;

/* loaded from: classes.dex */
final class zzahh extends zzahm {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzahh(zzagh zzaghVar) {
        super(zzaghVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final boolean zza(zzer zzerVar) throws zzahl {
        if (this.zzc) {
            zzerVar.zzk(1);
        } else {
            int iZzs = zzerVar.zzs();
            int i = iZzs >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(iZzs >> 2) & 3];
                zzt zztVar = new zzt();
                zztVar.zzl("video/x-flv");
                zztVar.zzm("audio/mpeg");
                zztVar.zzE(1);
                zztVar.zzF(i2);
                this.zza.zzz(zztVar.zzM());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                zzt zztVar2 = new zzt();
                zztVar2.zzl("video/x-flv");
                zztVar2.zzm(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zztVar2.zzE(1);
                zztVar2.zzF(8000);
                this.zza.zzz(zztVar2.zzM());
                this.zzd = true;
            } else if (i != 10) {
                throw new zzahl(AbstractC3264qG.k(new StringBuilder(String.valueOf(i).length() + 28), "Audio format not supported: ", i));
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final boolean zzb(zzer zzerVar, long j) {
        if (this.zze == 2) {
            int iZzd = zzerVar.zzd();
            zzagh zzaghVar = this.zza;
            zzaghVar.zzc(zzerVar, iZzd);
            zzaghVar.zze(j, 1, iZzd, 0, null);
            return true;
        }
        int iZzs = zzerVar.zzs();
        if (iZzs != 0 || this.zzd) {
            if (this.zze == 10 && iZzs != 1) {
                return false;
            }
            int iZzd2 = zzerVar.zzd();
            zzagh zzaghVar2 = this.zza;
            zzaghVar2.zzc(zzerVar, iZzd2);
            zzaghVar2.zze(j, 1, iZzd2, 0, null);
            return true;
        }
        int iZzd3 = zzerVar.zzd();
        byte[] bArr = new byte[iZzd3];
        zzerVar.zzm(bArr, 0, iZzd3);
        zzads zzadsVarZza = zzadt.zza(bArr);
        zzt zztVar = new zzt();
        zztVar.zzl("video/x-flv");
        zztVar.zzm("audio/mp4a-latm");
        zztVar.zzj(zzadsVarZza.zzc);
        zztVar.zzE(zzadsVarZza.zzb);
        zztVar.zzF(zzadsVarZza.zza);
        zztVar.zzp(Collections.singletonList(bArr));
        this.zza.zzz(zztVar.zzM());
        this.zzd = true;
        return false;
    }
}
