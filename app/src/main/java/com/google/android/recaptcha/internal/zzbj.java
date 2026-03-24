package com.google.android.recaptcha.internal;

import defpackage.AbstractC3264qG;
import defpackage.AbstractC3481uH;
import defpackage.Vs;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    @NotNull
    public final String toString() {
        return Vs.o(AbstractC3264qG.p("avgExecutionTime: ", AbstractC3481uH.l0(10, String.valueOf(this.zzb / this.zza)), " us| maxExecutionTime: ", AbstractC3481uH.l0(10, String.valueOf(this.zzc)), " us| totalTime: "), AbstractC3481uH.l0(10, String.valueOf(this.zzb)), " us| #Usages: ", AbstractC3481uH.l0(5, String.valueOf(this.zza)));
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NotNull zzbj zzbjVar) {
        Long lValueOf = Long.valueOf(this.zzb);
        Long lValueOf2 = Long.valueOf(zzbjVar.zzb);
        if (lValueOf == lValueOf2) {
            return 0;
        }
        return lValueOf.compareTo(lValueOf2);
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i) {
        this.zza = i;
    }
}
