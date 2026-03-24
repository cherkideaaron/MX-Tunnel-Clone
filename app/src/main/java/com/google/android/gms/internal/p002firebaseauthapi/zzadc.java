package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.BP;
import defpackage.C0428Yh;
import defpackage.C3220pR;
import defpackage.MQ;

/* loaded from: classes2.dex */
final class zzadc extends zzaff<Object, MQ> {
    private final C0428Yh zzv;
    private final String zzw;

    public zzadc(C0428Yh c0428Yh, String str) {
        super(2);
        this.zzv = (C0428Yh) Preconditions.checkNotNull(c0428Yh, "credential cannot be null");
        Preconditions.checkNotEmpty(c0428Yh.a, "email cannot be null");
        Preconditions.checkNotEmpty(c0428Yh.b, "password cannot be null");
        this.zzw = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "linkEmailAuthCredential";
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
        C0428Yh c0428Yh = this.zzv;
        zzaeoVar.zza(c0428Yh.a, Preconditions.checkNotEmpty(c0428Yh.b), ((BP) this.zzd).a.zzf(), this.zzd.b(), this.zzw, this.zzb);
    }
}
