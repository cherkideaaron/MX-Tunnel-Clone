package com.google.android.gms.internal.ads;

import defpackage.Vs;
import java.io.Serializable;

/* loaded from: classes.dex */
final class zzgrv implements Serializable, zzgru {
    final zzgru zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzgsb zzd = new zzgsb();

    public zzgrv(zzgru zzgruVar) {
        this.zza = zzgruVar;
    }

    public final String toString() {
        Object objO;
        if (this.zzb) {
            String strValueOf = String.valueOf(this.zzc);
            objO = Vs.o(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        } else {
            objO = this.zza;
        }
        String string = objO.toString();
        return Vs.o(new StringBuilder(string.length() + 19), "Suppliers.memoize(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                try {
                    if (!this.zzb) {
                        Object objZza = this.zza.zza();
                        this.zzc = objZza;
                        this.zzb = true;
                        return objZza;
                    }
                } finally {
                }
            }
        }
        return this.zzc;
    }
}
