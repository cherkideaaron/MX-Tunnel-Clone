package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzhh implements zzhb {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzhb zzc;
    private zzhb zzd;
    private zzhb zze;
    private zzhb zzf;
    private zzhb zzg;
    private zzhb zzh;
    private zzhb zzi;
    private zzhb zzj;
    private zzhb zzk;

    public zzhh(Context context, zzhb zzhbVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzhbVar;
    }

    private final zzhb zzf() {
        if (this.zze == null) {
            zzgs zzgsVar = new zzgs(this.zza);
            this.zze = zzgsVar;
            zzg(zzgsVar);
        }
        return this.zze;
    }

    private final void zzg(zzhb zzhbVar) {
        int i = 0;
        while (true) {
            List list = this.zzb;
            if (i >= list.size()) {
                return;
            }
            zzhbVar.zze((zzhz) list.get(i));
            i++;
        }
    }

    private static final void zzh(zzhb zzhbVar, zzhz zzhzVar) {
        if (zzhbVar != null) {
            zzhbVar.zze(zzhzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) {
        zzhb zzhbVar = this.zzk;
        zzhbVar.getClass();
        return zzhbVar.zza(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    @Override // com.google.android.gms.internal.ads.zzhb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzhf r5) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhh.zzb(com.google.android.gms.internal.ads.zzhf):long");
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        zzhb zzhbVar = this.zzk;
        if (zzhbVar == null) {
            return null;
        }
        return zzhbVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        zzhb zzhbVar = this.zzk;
        if (zzhbVar != null) {
            try {
                zzhbVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
        zzhzVar.getClass();
        this.zzc.zze(zzhzVar);
        this.zzb.add(zzhzVar);
        zzh(this.zzd, zzhzVar);
        zzh(this.zze, zzhzVar);
        zzh(this.zzf, zzhzVar);
        zzh(this.zzg, zzhzVar);
        zzh(this.zzh, zzhzVar);
        zzh(this.zzi, zzhzVar);
        zzh(this.zzj, zzhzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Map zzj() {
        zzhb zzhbVar = this.zzk;
        return zzhbVar == null ? Collections.emptyMap() : zzhbVar.zzj();
    }
}
