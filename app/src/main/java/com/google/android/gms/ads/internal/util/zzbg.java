package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzasc;
import com.google.android.gms.internal.ads.zzash;
import defpackage.AbstractC3264qG;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbg implements zzasc {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbi zzb;

    public zzbg(zzbl zzblVar, String str, zzbi zzbiVar) {
        this.zza = str;
        this.zzb = zzbiVar;
        Objects.requireNonNull(zzblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zza(zzash zzashVar) {
        String str = this.zza;
        String string = zzashVar.toString();
        String strM = AbstractC3264qG.m(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length()), "Failed to load URL: ", str, "\n", string);
        int i = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strM);
        this.zzb.zza((Object) null);
    }
}
