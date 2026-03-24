package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.AbstractC2739gl;
import defpackage.BP;
import defpackage.C0428Yh;
import defpackage.C3220pR;
import defpackage.MQ;

/* loaded from: classes2.dex */
final class zzadd extends zzaff<Object, MQ> {
    private final C0428Yh zzv;

    public zzadd(C0428Yh c0428Yh) {
        super(2);
        this.zzv = (C0428Yh) Preconditions.checkNotNull(c0428Yh, "credential cannot be null");
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
        AbstractC2739gl abstractC2739gl = this.zzd;
        c0428Yh.getClass();
        c0428Yh.d = ((BP) abstractC2739gl).a.zzf();
        c0428Yh.e = true;
        zzaeoVar.zza(new zzagx(c0428Yh, null, null), this.zzb);
    }
}
