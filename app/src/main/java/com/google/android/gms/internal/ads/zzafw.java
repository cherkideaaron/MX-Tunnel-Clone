package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;
import defpackage.Vs;

/* loaded from: classes.dex */
public final class zzafw {
    public final zzafz zza;
    public final zzafz zzb;

    public zzafw(zzafz zzafzVar, zzafz zzafzVar2) {
        this.zza = zzafzVar;
        this.zzb = zzafzVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafw.class == obj.getClass()) {
            zzafw zzafwVar = (zzafw) obj;
            if (this.zza.equals(zzafwVar.zza) && this.zzb.equals(zzafwVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        zzafz zzafzVar = this.zza;
        zzafz zzafzVar2 = this.zzb;
        String string = zzafzVar.toString();
        String strConcat = zzafzVar.equals(zzafzVar2) ? "" : ", ".concat(zzafzVar2.toString());
        return AbstractC3264qG.m(new StringBuilder(Vs.f(string.length() + 1, 1, strConcat)), "[", string, strConcat, "]");
    }
}
