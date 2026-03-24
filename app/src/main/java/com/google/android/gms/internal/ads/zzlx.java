package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzlx implements zzwv, zztk {
    final /* synthetic */ zzmc zza;
    private final zzlz zzb;

    public zzlx(zzmc zzmcVar, zzlz zzlzVar) {
        Objects.requireNonNull(zzmcVar);
        this.zza = zzmcVar;
        this.zzb = zzlzVar;
    }

    private final Pair zzf(int i, zzwk zzwkVar) {
        zzwk zzwkVarZza;
        zzwk zzwkVar2 = null;
        if (zzwkVar != null) {
            zzlz zzlzVar = this.zzb;
            int i2 = 0;
            while (true) {
                List list = zzlzVar.zzc;
                if (i2 >= list.size()) {
                    zzwkVarZza = null;
                    break;
                }
                if (((zzwk) list.get(i2)).zzd == zzwkVar.zzd) {
                    Object obj = zzwkVar.zza;
                    Object obj2 = zzlzVar.zzb;
                    int i3 = zzmj.zzb;
                    zzwkVarZza = zzwkVar.zza(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (zzwkVarZza == null) {
                return null;
            }
            zzwkVar2 = zzwkVarZza;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzwkVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzai(int i, zzwk zzwkVar, final zzwb zzwbVar, final zzwg zzwgVar, final int i2) {
        final Pair pairZzf = zzf(0, zzwkVar);
        if (pairZzf != null) {
            zzmc zzmcVar = this.zza;
            zzmcVar.zzk().zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzai(((Integer) pair.first).intValue(), (zzwk) pair.second, zzwbVar, zzwgVar, i2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzaj(int i, zzwk zzwkVar, final zzwb zzwbVar, final zzwg zzwgVar) {
        final Pair pairZzf = zzf(0, zzwkVar);
        if (pairZzf != null) {
            zzmc zzmcVar = this.zza;
            zzmcVar.zzk().zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzls
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzaj(((Integer) pair.first).intValue(), (zzwk) pair.second, zzwbVar, zzwgVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzak(int i, zzwk zzwkVar, final zzwb zzwbVar, final zzwg zzwgVar) {
        final Pair pairZzf = zzf(0, zzwkVar);
        if (pairZzf != null) {
            zzmc zzmcVar = this.zza;
            zzmcVar.zzk().zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzak(((Integer) pair.first).intValue(), (zzwk) pair.second, zzwbVar, zzwgVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzal(int i, zzwk zzwkVar, final zzwb zzwbVar, final zzwg zzwgVar, final IOException iOException, final boolean z) {
        final Pair pairZzf = zzf(0, zzwkVar);
        if (pairZzf != null) {
            zzmc zzmcVar = this.zza;
            zzmcVar.zzk().zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzal(((Integer) pair.first).intValue(), (zzwk) pair.second, zzwbVar, zzwgVar, iOException, z);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void zzam(int i, zzwk zzwkVar, final zzwg zzwgVar) {
        final Pair pairZzf = zzf(0, zzwkVar);
        if (pairZzf != null) {
            zzmc zzmcVar = this.zza;
            zzmcVar.zzk().zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzj().zzam(((Integer) pair.first).intValue(), (zzwk) pair.second, zzwgVar);
                }
            });
        }
    }
}
