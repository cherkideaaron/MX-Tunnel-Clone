package com.google.android.gms.internal.ads;

import defpackage.Vs;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzhlj {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhlj(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhlj)) {
            return false;
        }
        zzhlj zzhljVar = (zzhlj) obj;
        return zzhljVar.zza.equals(this.zza) && zzhljVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        Class cls = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String simpleName2 = cls.getSimpleName();
        return Vs.o(new StringBuilder(simpleName.length() + 26 + simpleName2.length()), simpleName, " with serialization type: ", simpleName2);
    }
}
