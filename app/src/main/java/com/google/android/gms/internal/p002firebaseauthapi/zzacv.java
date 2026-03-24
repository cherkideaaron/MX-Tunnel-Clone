package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.Av;
import defpackage.MQ;
import defpackage.Vs;

/* loaded from: classes2.dex */
final class zzacv extends zzaff<Void, MQ> {
    private final Av zzv;
    private final String zzw;
    private final String zzx;
    private final String zzy;

    public zzacv(Av av, String str, String str2, String str3) {
        super(2);
        Vs.u(Preconditions.checkNotNull(av));
        this.zzw = Preconditions.checkNotEmpty(str);
        this.zzx = str2;
        this.zzy = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        ((MQ) this.zze).a(this.zzj, zzacq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza((Av) null, this.zzw, this.zzx, this.zzy, this.zzb);
    }
}
