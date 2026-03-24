package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.JP;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzabl implements zzafv<zzahv> {
    final /* synthetic */ zzaar zza;
    private final /* synthetic */ zzajb zzb;
    private final /* synthetic */ zzael zzc;

    public zzabl(zzaar zzaarVar, zzajb zzajbVar, zzael zzaelVar) {
        this.zzb = zzajbVar;
        this.zzc = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zza = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        this.zzb.zzb(true);
        this.zzb.zza(zzahvVar.zzc());
        this.zza.zza.zza(this.zzb, new zzabo(this, this.zzc, this));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzc.zza(JP.b(str));
    }
}
