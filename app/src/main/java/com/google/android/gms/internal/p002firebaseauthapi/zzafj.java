package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.Qy;
import defpackage.Ry;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzafj implements zzafm {
    private final /* synthetic */ String zza;

    public zzafj(zzafh zzafhVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzafhVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafm
    public final void zza(Ry ry, Object... objArr) {
        ry.onCodeSent(this.zza, new Qy());
    }
}
