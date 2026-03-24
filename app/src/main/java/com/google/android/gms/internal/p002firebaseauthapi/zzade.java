package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.BP;
import defpackage.C3220pR;
import defpackage.MQ;
import defpackage.Py;

/* loaded from: classes2.dex */
final class zzade extends zzaff<Object, MQ> {
    private final Py zzv;

    public zzade(Py py) {
        super(2);
        Preconditions.checkNotNull(py, "credential cannot be null");
        this.zzv = py;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "linkPhoneAuthCredential";
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
        zzaeoVar.zza(new zzahz(((BP) this.zzd).a.zzf(), zzafw.zza(this.zzv)), this.zzb);
    }
}
