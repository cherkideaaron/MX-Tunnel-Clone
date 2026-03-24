package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.BP;
import defpackage.C3220pR;
import defpackage.MQ;

/* loaded from: classes2.dex */
final class zzadr extends zzaff<Object, MQ> {
    private final String zzv;

    public zzadr(String str) {
        super(2);
        this.zzv = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "signInAnonymously";
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
        zzaeoVar.zzd(this.zzv, this.zzb);
    }
}
