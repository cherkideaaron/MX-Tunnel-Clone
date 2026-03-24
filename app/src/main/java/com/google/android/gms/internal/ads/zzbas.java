package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbas implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzbat zza;

    public zzbas(zzbat zzbatVar) {
        Objects.requireNonNull(zzbatVar);
        this.zza = zzbatVar;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        boolean z2;
        zzbat zzbatVar = this.zza;
        if (z) {
            zzbatVar.zze(System.currentTimeMillis());
            z2 = true;
        } else {
            long jZzf = zzbatVar.zzf();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jZzf > 0 && jCurrentTimeMillis >= zzbatVar.zzf()) {
                zzbatVar.zzg(jCurrentTimeMillis - zzbatVar.zzf());
            }
            z2 = false;
        }
        zzbatVar.zzh(z2);
    }
}
