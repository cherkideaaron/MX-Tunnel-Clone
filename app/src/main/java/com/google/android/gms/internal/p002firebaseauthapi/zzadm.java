package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.BP;
import defpackage.MQ;
import defpackage.Py;

/* loaded from: classes2.dex */
final class zzadm extends zzaff<Void, MQ> {
    private final zzaan zzv;

    public zzadm(Py py, String str) {
        super(2);
        Preconditions.checkNotNull(py, "credential cannot be null");
        py.d = false;
        this.zzv = new zzaan(py, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "reauthenticateWithPhoneCredential";
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
