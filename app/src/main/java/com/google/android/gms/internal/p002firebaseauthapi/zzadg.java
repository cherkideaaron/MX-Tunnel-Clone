package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.AbstractC2814i4;
import defpackage.BP;
import defpackage.LQ;
import defpackage.MQ;

/* loaded from: classes2.dex */
final class zzadg extends zzaff<Void, MQ> {
    private final zzajb zzv;

    public zzadg(AbstractC2814i4 abstractC2814i4, String str) {
        super(2);
        Preconditions.checkNotNull(abstractC2814i4, "credential cannot be null");
        this.zzv = LQ.a(abstractC2814i4, str).zza(false);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "reauthenticateWithCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        BP bpZza = zzacq.zza(this.zzc, this.zzk);
        if (!((BP) this.zzd).b.a.equalsIgnoreCase(bpZza.b.a)) {
            zza(new Status(17024));
        } else {
            ((MQ) this.zze).a(this.zzj, bpZza);
            zzb(null);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzv, this.zzb);
    }
}
