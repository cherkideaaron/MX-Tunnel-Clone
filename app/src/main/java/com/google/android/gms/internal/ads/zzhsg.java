package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzhsg extends zzhuu {
    private final zzhse zza;
    private final zzhsc zzb;
    private final zzhsd zzc;
    private final zzhsf zzd;

    public /* synthetic */ zzhsg(zzhse zzhseVar, zzhsc zzhscVar, zzhsd zzhsdVar, zzhsf zzhsfVar, byte[] bArr) {
        this.zza = zzhseVar;
        this.zzb = zzhscVar;
        this.zzc = zzhsdVar;
        this.zzd = zzhsfVar;
    }

    public static zzhsb zzb() {
        return new zzhsb(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhsg)) {
            return false;
        }
        zzhsg zzhsgVar = (zzhsg) obj;
        return zzhsgVar.zza == this.zza && zzhsgVar.zzb == this.zzb && zzhsgVar.zzc == this.zzc && zzhsgVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhsg.class, this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final String toString() {
        String string = this.zzd.toString();
        int length = string.length();
        String string2 = this.zzc.toString();
        int length2 = string2.length();
        String string3 = this.zza.toString();
        int length3 = string3.length();
        String string4 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + string4.length() + 1);
        AbstractC3264qG.v(sb, "ECDSA Parameters (variant: ", string, ", hashType: ", string2);
        AbstractC3264qG.v(sb, ", encoding: ", string3, ", curve: ", string4);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzd != zzhsf.zzd;
    }

    public final zzhse zzc() {
        return this.zza;
    }

    public final zzhsc zzd() {
        return this.zzb;
    }

    public final zzhsd zze() {
        return this.zzc;
    }

    public final zzhsf zzf() {
        return this.zzd;
    }
}
