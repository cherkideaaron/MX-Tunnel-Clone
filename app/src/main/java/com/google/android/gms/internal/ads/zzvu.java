package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzvu implements zzye {
    private final zzguf zza;
    private long zzb;

    public zzvu(List list, List list2) {
        int i = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        zzgrc.zza(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgucVar.zzf(new zzvt((zzye) list.get(i2), (List) list2.get(i2)));
        }
        this.zza = zzgucVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void zzg(long j) {
        int i = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i >= zzgufVar.size()) {
                return;
            }
            ((zzvt) zzgufVar.get(i)).zzg(j);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i >= zzgufVar.size()) {
                break;
            }
            zzvt zzvtVar = (zzvt) zzgufVar.get(i);
            long jZzi = zzvtVar.zzi();
            if ((zzvtVar.zza().contains(1) || zzvtVar.zza().contains(2) || zzvtVar.zza().contains(4)) && jZzi != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzi);
            }
            if (jZzi != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzi);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.zzb = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.zzb;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i >= zzgufVar.size()) {
                break;
            }
            long jZzl = ((zzvt) zzgufVar.get(i)).zzl();
            if (jZzl != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzl);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        boolean zZzm;
        boolean z = false;
        do {
            long jZzl = zzl();
            if (jZzl == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            zZzm = false;
            while (true) {
                zzguf zzgufVar = this.zza;
                if (i >= zzgufVar.size()) {
                    break;
                }
                long jZzl2 = ((zzvt) zzgufVar.get(i)).zzl();
                boolean z2 = jZzl2 != Long.MIN_VALUE && jZzl2 <= zzllVar.zza;
                if (jZzl2 == jZzl || z2) {
                    zZzm |= ((zzvt) zzgufVar.get(i)).zzm(zzllVar);
                }
                i++;
            }
            z |= zZzm;
        } while (zZzm);
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        int i = 0;
        while (true) {
            zzguf zzgufVar = this.zza;
            if (i >= zzgufVar.size()) {
                return false;
            }
            if (((zzvt) zzgufVar.get(i)).zzn()) {
                return true;
            }
            i++;
        }
    }
}
