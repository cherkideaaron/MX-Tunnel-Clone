package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzgpm extends zzgok {
    final /* synthetic */ zzgpo zza;
    private final zzgpt zzb;

    public zzgpm(zzgpo zzgpoVar, zzgpt zzgptVar) {
        Objects.requireNonNull(zzgpoVar);
        this.zza = zzgpoVar;
        this.zzb = zzgptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgol
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i2 = bundle.getInt("uiMode", 0);
        zzgpr zzgprVarZzd = zzgps.zzd();
        zzgprVarZzd.zza(i);
        if (string != null) {
            zzgprVarZzd.zzb(string);
        }
        zzgprVarZzd.zzc(i2);
        this.zzb.zza(zzgprVarZzd.zzd());
        if (i == 8157) {
            this.zza.zzd();
        }
    }
}
