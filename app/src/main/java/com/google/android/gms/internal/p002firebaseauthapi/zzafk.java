package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import defpackage.Ry;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzafk implements zzafm {
    private final /* synthetic */ Status zza;

    public zzafk(zzafh zzafhVar, Status status) {
        this.zza = status;
        Objects.requireNonNull(zzafhVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafm
    public final void zza(Ry ry, Object... objArr) {
        ry.onVerificationFailed(zzaen.zza(this.zza));
    }
}
