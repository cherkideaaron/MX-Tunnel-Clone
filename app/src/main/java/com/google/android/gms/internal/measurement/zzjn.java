package com.google.android.gms.internal.measurement;

import android.content.Context;
import defpackage.AbstractC3264qG;
import defpackage.JH;

/* loaded from: classes2.dex */
final class zzjn extends zzkh {
    private final Context zza;
    private final JH zzb;

    public zzjn(Context context, JH jh) {
        this.zza = context;
        this.zzb = jh;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzkh) {
            zzkh zzkhVar = (zzkh) obj;
            if (this.zza.equals(zzkhVar.zza())) {
                JH jh = this.zzb;
                JH jhZzb = zzkhVar.zzb();
                if (jh != null ? jh.equals(jhZzb) : jhZzb == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        JH jh = this.zzb;
        return (iHashCode * 1000003) ^ (jh == null ? 0 : jh.hashCode());
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        AbstractC3264qG.v(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    public final JH zzb() {
        return this.zzb;
    }
}
