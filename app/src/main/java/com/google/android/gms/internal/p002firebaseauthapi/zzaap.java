package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.C3382sQ;

/* loaded from: classes2.dex */
public final class zzaap {
    private final Status zza;
    private final C3382sQ zzb;
    private final String zzc;
    private final String zzd;

    @SafeParcelable.Constructor
    public zzaap(Status status, C3382sQ c3382sQ, String str, String str2) {
        this.zza = status;
        this.zzb = c3382sQ;
        this.zzc = str;
        this.zzd = str2;
    }

    public final Status zza() {
        return this.zza;
    }

    public final C3382sQ zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzd;
    }
}
