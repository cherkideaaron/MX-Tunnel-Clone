package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.Bv;
import defpackage.C3382sQ;
import defpackage.TP;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzaas {

    @SafeParcelable.Field(getter = "getMfaPendingCredential", id = 1)
    private String zza;

    @SafeParcelable.Field(getter = "getMfaInfoList", id = 2)
    private List<zzahy> zzb;

    @SafeParcelable.Field(getter = "getDefaultOAuthCredential", id = 3)
    private C3382sQ zzc;

    @SafeParcelable.Constructor
    public zzaas(String str, List<zzahy> list, C3382sQ c3382sQ) {
        this.zza = str;
        this.zzb = list;
        this.zzc = c3382sQ;
    }

    public final C3382sQ zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final List<Bv> zzc() {
        return TP.c(this.zzb);
    }
}
