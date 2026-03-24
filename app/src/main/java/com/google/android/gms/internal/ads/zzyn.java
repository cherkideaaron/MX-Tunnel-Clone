package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzyn {
    public static final zzyn zza = new zzyn(new zzbg[0]);
    public final int zzb;
    private final zzguf zzc;
    private int zzd;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
    }

    public zzyn(zzbg... zzbgVarArr) {
        this.zzc = zzguf.zzr(zzbgVarArr);
        this.zzb = zzbgVarArr.length;
        int i = 0;
        while (i < this.zzc.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.zzc.size(); i3++) {
                if (((zzbg) this.zzc.get(i)).equals(this.zzc.get(i3))) {
                    zzee.zzf("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzyn.class == obj.getClass()) {
            zzyn zzynVar = (zzyn) obj;
            if (this.zzb == zzynVar.zzb && this.zzc.equals(zzynVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zzc.hashCode();
        this.zzd = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzbg zza(int i) {
        return (zzbg) this.zzc.get(i);
    }

    public final int zzb(zzbg zzbgVar) {
        int iIndexOf = this.zzc.indexOf(zzbgVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final zzguf zzc() {
        return zzguf.zzq(zzgvf.zzc(this.zzc, zzym.zza));
    }
}
