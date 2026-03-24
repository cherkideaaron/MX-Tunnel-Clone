package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import defpackage.Vs;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
final class zzpr {
    public static final zzpr zza;
    public final int zzb;
    public final int zzc;
    private final zzgup zzd;

    static {
        zzpr zzprVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzguo zzguoVar = new zzguo();
            for (int i = 1; i <= 10; i++) {
                zzguoVar.zzf(Integer.valueOf(zzfj.zzB(i)));
            }
            zzprVar = new zzpr(2, zzguoVar.zzi());
        } else {
            zzprVar = new zzpr(2, 10);
        }
        zza = zzprVar;
    }

    public zzpr(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpr)) {
            return false;
        }
        zzpr zzprVar = (zzpr) obj;
        return this.zzb == zzprVar.zzb && this.zzc == zzprVar.zzc && Objects.equals(this.zzd, zzprVar.zzd);
    }

    public final int hashCode() {
        zzgup zzgupVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzgupVar == null ? 0 : zzgupVar.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(i2).length() + 15 + strValueOf.length() + 1);
        Vs.x(sb, "AudioProfile[format=", i, ", maxChannelCount=", i2);
        return Vs.o(sb, ", channelMasks=", strValueOf, "]");
    }

    public final boolean zza(int i) {
        zzgup zzgupVar = this.zzd;
        if (zzgupVar == null) {
            return i <= this.zzc;
        }
        int iZzB = zzfj.zzB(i);
        if (iZzB == 0) {
            return false;
        }
        return zzgupVar.contains(Integer.valueOf(iZzB));
    }

    public final int zzb(int i, zzd zzdVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (Build.VERSION.SDK_INT < 29) {
            Integer num = (Integer) zzps.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i2 = this.zzb;
        for (int i3 = 10; i3 > 0; i3--) {
            int iZzB = zzfj.zzB(i3);
            if (iZzB != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i).setChannelMask(iZzB).build(), zzdVar.zza())) {
                return i3;
            }
        }
        return 0;
    }

    public zzpr(int i, Set set) {
        this.zzb = i;
        zzgup zzgupVarZzo = zzgup.zzo(set);
        this.zzd = zzgupVarZzo;
        zzgwt it = zzgupVarZzo.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = iMax;
    }
}
