package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.Ry;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzafl implements zzafm {
    private final /* synthetic */ String zza;

    public zzafl(zzafh zzafhVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzafhVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafm
    public final void zza(Ry ry, Object... objArr) {
        ry.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
