package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.JP;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzabp implements zzafv<zzahl> {
    private final /* synthetic */ zzafv zza;
    private final /* synthetic */ zzahv zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzael zzd;
    private final /* synthetic */ zzabq zze;

    public zzabp(zzabq zzabqVar, zzafv zzafvVar, zzahv zzahvVar, String str, zzael zzaelVar) {
        this.zza = zzafvVar;
        this.zzb = zzahvVar;
        this.zzc = str;
        this.zzd = zzaelVar;
        Objects.requireNonNull(zzabqVar);
        this.zze = zzabqVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahl zzahlVar) {
        List<zzahk> listZza = zzahlVar.zza();
        if (listZza == null || listZza.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzahk zzahkVar = listZza.get(0);
        zzail zzailVar = new zzail();
        zzailVar.zzd(this.zzb.zzc()).zza(this.zzc);
        zzaar.zza(this.zze.zza, this.zzd, this.zzb, zzahkVar, zzailVar, this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzd.zza(JP.b(str));
    }
}
