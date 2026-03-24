package com.google.android.gms.internal.measurement;

import defpackage.Vs;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzau extends zzav {
    public zzau() {
        this.zza.add(zzbk.BITWISE_AND);
        this.zza.add(zzbk.BITWISE_LEFT_SHIFT);
        this.zza.add(zzbk.BITWISE_NOT);
        this.zza.add(zzbk.BITWISE_OR);
        this.zza.add(zzbk.BITWISE_RIGHT_SHIFT);
        this.zza.add(zzbk.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.zza.add(zzbk.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao zza(String str, zzg zzgVar, List list) {
        zzah zzahVar;
        zzbk zzbkVar = zzbk.ADD;
        switch (zzh.zze(str).ordinal()) {
            case 4:
                zzahVar = new zzah(Double.valueOf(zzh.zzg(zzgVar.zza((zzao) Vs.j(zzbk.BITWISE_AND, 2, list, 0)).zzd().doubleValue()) & zzh.zzg(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue())));
                break;
            case 5:
                zzahVar = new zzah(Double.valueOf(zzh.zzg(zzgVar.zza((zzao) Vs.j(zzbk.BITWISE_LEFT_SHIFT, 2, list, 0)).zzd().doubleValue()) << ((int) (zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) & 31))));
                break;
            case 6:
                zzahVar = new zzah(Double.valueOf(~zzh.zzg(zzgVar.zza((zzao) Vs.j(zzbk.BITWISE_NOT, 1, list, 0)).zzd().doubleValue())));
                break;
            case 7:
                zzahVar = new zzah(Double.valueOf(zzh.zzg(zzgVar.zza((zzao) Vs.j(zzbk.BITWISE_OR, 2, list, 0)).zzd().doubleValue()) | zzh.zzg(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue())));
                break;
            case 8:
                zzahVar = new zzah(Double.valueOf(zzh.zzg(zzgVar.zza((zzao) Vs.j(zzbk.BITWISE_RIGHT_SHIFT, 2, list, 0)).zzd().doubleValue()) >> ((int) (zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) & 31))));
                break;
            case 9:
                zzahVar = new zzah(Double.valueOf(zzh.zzh(zzgVar.zza((zzao) Vs.j(zzbk.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list, 0)).zzd().doubleValue()) >>> ((int) (zzh.zzh(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue()) & 31))));
                break;
            case 10:
                zzahVar = new zzah(Double.valueOf(zzh.zzg(zzgVar.zza((zzao) Vs.j(zzbk.BITWISE_XOR, 2, list, 0)).zzd().doubleValue()) ^ zzh.zzg(zzgVar.zza((zzao) list.get(1)).zzd().doubleValue())));
                break;
            default:
                return zzb(str);
        }
        return zzahVar;
    }
}
