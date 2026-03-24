package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.BP;
import defpackage.MQ;
import defpackage.ZK;

/* loaded from: classes2.dex */
final class zzaei extends zzaff<Void, MQ> {
    private final ZK zzv;

    public zzaei(ZK zk) {
        super(2);
        this.zzv = (ZK) Preconditions.checkNotNull(zk, "request cannot be null");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "updateProfile";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        ((MQ) this.zze).a(this.zzj, zzacq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(((BP) this.zzd).a.zzf(), this.zzv, this.zzb);
    }
}
