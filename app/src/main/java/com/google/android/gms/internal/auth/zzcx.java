package com.google.android.gms.internal.auth;

import android.util.Log;
import defpackage.AbstractC3264qG;

/* loaded from: classes.dex */
final class zzcx extends zzdc {
    public zzcx(zzcz zzczVar, String str, Double d, boolean z) {
        super(zzczVar, str, d, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbO = AbstractC3264qG.o("Invalid double value for ", zzc(), ": ");
            sbO.append((String) obj);
            Log.e("PhenotypeFlag", sbO.toString());
            return null;
        }
    }
}
