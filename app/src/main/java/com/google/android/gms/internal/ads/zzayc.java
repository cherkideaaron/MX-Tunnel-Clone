package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import defpackage.AbstractC2817i7;
import java.util.List;

/* loaded from: classes.dex */
public final class zzayc implements PackageManager$OnChecksumsReadyListener {
    final zzhah zza = zzhah.zze();

    public final void onChecksumsReady(List list) {
        if (list != null) {
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ApkChecksum apkChecksumG = AbstractC2817i7.g(list.get(i));
                    if (apkChecksumG.getType() == 8) {
                        zzhah zzhahVar = this.zza;
                        zzgxa zzgxaVarZzi = zzgxa.zzn().zzi();
                        byte[] value = apkChecksumG.getValue();
                        zzhahVar.zza(zzgxaVarZzi.zzj(value, 0, value.length));
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        this.zza.zza("");
    }
}
