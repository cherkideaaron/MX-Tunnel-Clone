package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.AbstractC3264qG;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzqj {
    private final Class<?> zza;
    private final Class<? extends zzqf> zzb;

    private zzqj(Class<?> cls, Class<? extends zzqf> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqj)) {
            return false;
        }
        zzqj zzqjVar = (zzqj) obj;
        return zzqjVar.zza.equals(this.zza) && zzqjVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return AbstractC3264qG.h(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }
}
