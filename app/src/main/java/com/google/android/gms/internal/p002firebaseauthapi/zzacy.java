package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.AbstractC2739gl;
import defpackage.Av;
import defpackage.BP;
import defpackage.C3220pR;
import defpackage.MQ;
import defpackage.Vs;

/* loaded from: classes2.dex */
final class zzacy extends zzaff<Object, MQ> {
    private final Av zzv;
    private final String zzw;
    private final String zzx;

    public zzacy(Av av, String str, String str2) {
        super(2);
        Vs.u(Preconditions.checkNotNull(av));
        this.zzw = Preconditions.checkNotEmpty(str);
        this.zzx = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        BP bpZza = zzacq.zza(this.zzc, this.zzk);
        AbstractC2739gl abstractC2739gl = this.zzd;
        if (abstractC2739gl != null && !((BP) abstractC2739gl).b.a.equalsIgnoreCase(bpZza.b.a)) {
            zza(new Status(17024));
        } else {
            ((MQ) this.zze).a(this.zzj, bpZza);
            zzb(new C3220pR(bpZza));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(this.zzw, (Av) null, this.zzx, this.zzb);
    }
}
