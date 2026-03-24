package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.Py;
import defpackage.Ry;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzafi implements zzafm {
    private final /* synthetic */ Py zza;

    public zzafi(zzafh zzafhVar, Py py) {
        this.zza = py;
        Objects.requireNonNull(zzafhVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafm
    public final void zza(Ry ry, Object... objArr) {
        ry.onVerificationCompleted(this.zza);
    }
}
