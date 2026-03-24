package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.BP;
import defpackage.C0428Yh;
import defpackage.C3220pR;
import defpackage.MQ;

/* loaded from: classes2.dex */
final class zzadv extends zzaff<Object, MQ> {
    private final zzagx zzv;

    public zzadv(C0428Yh c0428Yh, String str) {
        super(2);
        Preconditions.checkNotNull(c0428Yh, "credential cannot be null");
        this.zzv = new zzagx(c0428Yh, null, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "sendSignInLinkToEmail";
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
