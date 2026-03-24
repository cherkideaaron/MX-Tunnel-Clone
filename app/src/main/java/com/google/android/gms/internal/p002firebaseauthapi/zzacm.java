package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.JP;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzacm implements zzafv<zzahv> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzael zzb;
    private final /* synthetic */ zzaar zzc;

    public zzacm(zzaar zzaarVar, String str, zzael zzaelVar) {
        this.zza = str;
        this.zzb = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzc = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        zzahv zzahvVar2 = zzahvVar;
        String strZzc = zzahvVar2.zzc();
        zzail zzailVar = new zzail();
        zzailVar.zzd(strZzc).zzf(this.zza);
        zzaar.zza(this.zzc, this.zzb, zzahvVar2, zzailVar, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzb.zza(JP.b(str));
    }
}
