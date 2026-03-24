package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.C0428Yh;
import defpackage.JP;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzaav implements zzafv<zzahv> {
    private final /* synthetic */ C0428Yh zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzael zzc;
    private final /* synthetic */ zzaar zzd;

    public zzaav(zzaar zzaarVar, C0428Yh c0428Yh, String str, zzael zzaelVar) {
        this.zza = c0428Yh;
        this.zzb = str;
        this.zzc = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzd = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        this.zzd.zza(new zzagx(this.zza, zzahvVar.zzc(), this.zzb), this.zzc);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzc.zza(JP.b(str));
    }
}
