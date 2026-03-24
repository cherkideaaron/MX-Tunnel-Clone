package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class zzalz {
    public static void zza(zzama zzamaVar, zzame zzameVar, zzdr zzdrVar) {
        for (int i = 0; i < zzamaVar.zza(); i++) {
            long jZzb = zzamaVar.zzb(i);
            List listZzc = zzamaVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i == zzamaVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = zzamaVar.zzb(i + 1) - zzamaVar.zzb(i);
                if (jZzb2 > 0) {
                    zzdrVar.zza(new zzalx(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
