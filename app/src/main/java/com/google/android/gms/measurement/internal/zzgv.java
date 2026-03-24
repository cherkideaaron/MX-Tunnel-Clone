package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import defpackage.AbstractC3264qG;

/* loaded from: classes2.dex */
public final class zzgv {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final Bundle zzd;

    public zzgv(String str, String str2, Bundle bundle, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j;
    }

    public static zzgv zza(zzbg zzbgVar) {
        return new zzgv(zzbgVar.zza, zzbgVar.zzc, zzbgVar.zzb.zzf(), zzbgVar.zzd);
    }

    public final String toString() {
        String str = this.zzb;
        String string = this.zzd.toString();
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        AbstractC3264qG.v(sb, "origin=", str, ",name=", str2);
        return AbstractC3264qG.l(sb, ",params=", string);
    }

    public final zzbg zzb() {
        return new zzbg(this.zza, new zzbe(new Bundle(this.zzd)), this.zzb, this.zzc);
    }
}
