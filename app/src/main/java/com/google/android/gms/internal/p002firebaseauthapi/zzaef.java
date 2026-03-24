package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.BP;
import defpackage.MQ;
import defpackage.Py;

/* loaded from: classes2.dex */
final class zzaef extends zzaff<Void, MQ> {
    private final Py zzv;

    public zzaef(Py py) {
        super(2);
        this.zzv = (Py) Preconditions.checkNotNull(py);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final String zza() {
        return "updatePhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaff
    public final void zzb() {
        ((MQ) this.zze).a(this.zzj, zzacq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafq
    public final void zza(TaskCompletionSource taskCompletionSource, zzaeo zzaeoVar) {
        this.zzg = new zzafp(this, taskCompletionSource);
        zzaeoVar.zza(new zzahz(((BP) this.zzd).a.zzf(), zzafw.zza(this.zzv)), this.zzb);
    }
}
