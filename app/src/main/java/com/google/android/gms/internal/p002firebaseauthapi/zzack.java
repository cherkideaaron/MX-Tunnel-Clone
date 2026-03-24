package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.JP;
import defpackage.ZK;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzack implements zzafv<zzahv> {
    private final /* synthetic */ ZK zza;
    private final /* synthetic */ zzael zzb;
    private final /* synthetic */ zzaar zzc;

    public zzack(zzaar zzaarVar, ZK zk, zzael zzaelVar) {
        this.zza = zk;
        this.zzb = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzc = zzaarVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafv
    public final void zza(zzahv zzahvVar) {
        zzahv zzahvVar2 = zzahvVar;
        zzail zzailVar = new zzail();
        zzailVar.zzd(zzahvVar2.zzc());
        ZK zk = this.zza;
        if (zk.c || zk.a != null) {
            zzailVar.zzb(zk.a);
        }
        ZK zk2 = this.zza;
        if (zk2.d || zk2.e != null) {
            zzailVar.zzg(zk2.b);
        }
        zzaar.zza(this.zzc, this.zzb, zzahvVar2, zzailVar, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafs
    public final void zza(String str) {
        this.zzb.zza(JP.b(str));
    }
}
