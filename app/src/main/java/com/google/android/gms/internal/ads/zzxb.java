package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class zzxb extends zzvs {
    private static final zzak zza;
    private final zzwm[] zzb;
    private final List zzc;
    private final zzbf[] zzd;
    private final ArrayList zze;
    private int zzf = -1;
    private long[][] zzg;
    private zzwz zzh;
    private final zzvv zzi;

    static {
        zzz zzzVar = new zzz();
        zzzVar.zza("MergingMediaSource");
        zza = zzzVar.zzc();
    }

    public zzxb(boolean z, boolean z2, zzvv zzvvVar, zzwm... zzwmVarArr) {
        this.zzb = zzwmVarArr;
        this.zzi = zzvvVar;
        this.zze = new ArrayList(Arrays.asList(zzwmVarArr));
        this.zzc = new ArrayList(zzwmVarArr.length);
        int i = 0;
        while (true) {
            int length = zzwmVarArr.length;
            if (i >= length) {
                this.zzd = new zzbf[length];
                this.zzg = new long[0][];
                new HashMap();
                zzgvu.zzb(8).zzb(2).zza();
                return;
            }
            this.zzc.add(new ArrayList());
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvj, com.google.android.gms.internal.ads.zzwm
    public final void zzA(zzak zzakVar) {
        this.zzb[0].zzA(zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzD(zzwi zzwiVar) {
        zzwy zzwyVar = (zzwy) zzwiVar;
        int i = 0;
        while (true) {
            zzwm[] zzwmVarArr = this.zzb;
            if (i >= zzwmVarArr.length) {
                return;
            }
            List list = (List) this.zzc.get(i);
            zzwi zzwiVarZza = zzwyVar.zza(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((zzxa) list.get(i2)).zzb().equals(zzwiVarZza)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            zzwmVarArr[i].zzD(zzwyVar.zza(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final zzwi zzG(zzwk zzwkVar, zzaan zzaanVar, long j) {
        zzbf[] zzbfVarArr = this.zzd;
        zzwm[] zzwmVarArr = this.zzb;
        int length = zzwmVarArr.length;
        zzwi[] zzwiVarArr = new zzwi[length];
        int iZze = zzbfVarArr[0].zze(zzwkVar.zza);
        for (int i = 0; i < length; i++) {
            zzwk zzwkVarZza = zzwkVar.zza(zzbfVarArr[i].zzf(iZze));
            zzwiVarArr[i] = zzwmVarArr[i].zzG(zzwkVarZza, zzaanVar, j - this.zzg[iZze][i]);
            ((List) this.zzc.get(i)).add(new zzxa(zzwkVarZza, zzwiVarArr[i], null));
        }
        return new zzwy(this.zzi, this.zzg[iZze], zzwiVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final zzak zzJ() {
        zzwm[] zzwmVarArr = this.zzb;
        return zzwmVarArr.length > 0 ? zzwmVarArr[0].zzJ() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvs, com.google.android.gms.internal.ads.zzvj
    public final void zza(zzhz zzhzVar) {
        super.zza(zzhzVar);
        int i = 0;
        while (true) {
            zzwm[] zzwmVarArr = this.zzb;
            if (i >= zzwmVarArr.length) {
                return;
            }
            zzv(Integer.valueOf(i), zzwmVarArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvs, com.google.android.gms.internal.ads.zzvj
    public final void zzd() {
        super.zzd();
        Arrays.fill(this.zzd, (Object) null);
        this.zzf = -1;
        this.zzh = null;
        ArrayList arrayList = this.zze;
        arrayList.clear();
        Collections.addAll(arrayList, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvs, com.google.android.gms.internal.ads.zzwm
    public final void zzt() throws zzwz {
        zzwz zzwzVar = this.zzh;
        if (zzwzVar != null) {
            throw zzwzVar;
        }
        super.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final /* bridge */ /* synthetic */ void zzu(Object obj, zzwm zzwmVar, zzbf zzbfVar) {
        int iZzc;
        Integer num = (Integer) obj;
        if (this.zzh != null) {
            return;
        }
        if (this.zzf == -1) {
            iZzc = zzbfVar.zzc();
            this.zzf = iZzc;
        } else {
            int iZzc2 = zzbfVar.zzc();
            int i = this.zzf;
            if (iZzc2 != i) {
                this.zzh = new zzwz(0);
                return;
            }
            iZzc = i;
        }
        if (this.zzg.length == 0) {
            this.zzg = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iZzc, this.zzd.length);
        }
        ArrayList arrayList = this.zze;
        arrayList.remove(zzwmVar);
        zzbf[] zzbfVarArr = this.zzd;
        zzbfVarArr[num.intValue()] = zzbfVar;
        if (arrayList.isEmpty()) {
            zze(zzbfVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final /* bridge */ /* synthetic */ zzwk zzx(Object obj, zzwk zzwkVar) {
        int iIntValue = ((Integer) obj).intValue();
        List list = this.zzc;
        List list2 = (List) list.get(iIntValue);
        for (int i = 0; i < list2.size(); i++) {
            if (((zzxa) list2.get(i)).zza().equals(zzwkVar)) {
                return ((zzxa) ((List) list.get(0)).get(i)).zza();
            }
        }
        return null;
    }
}
