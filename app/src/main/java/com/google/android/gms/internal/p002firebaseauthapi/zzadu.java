package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.AbstractC2814i4;
import defpackage.BP;
import defpackage.C3220pR;
import defpackage.LQ;
import defpackage.MQ;

/* loaded from: classes2.dex */
final class zzadu extends zzaff<Object, MQ> {
    private final zzajb zzv;

    public zzadu(AbstractC2814i4 abstractC2814i4, String str) {
        super(2);
        Preconditions.checkNotNull(abstractC2814i4, "credential cannot be null");
        this.zzv = LQ.a(abstractC2814i4, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "signInWithCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        BP bpZza = zzacq.zza(this.zzc, this.zzk);
        ((MQ) this.zze).a(this.zzj, bpZza);
        zzb(new C3220pR(bpZza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
