package com.google.android.gms.internal.auth;

import android.util.Log;
import defpackage.AbstractC3264qG;

/* loaded from: classes.dex */
final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l, boolean z) {
        super(zzczVar, str, l, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbO = AbstractC3264qG.o("Invalid long value for ", zzc(), ": ");
            sbO.append((String) obj);
            Log.e("PhenotypeFlag", sbO.toString());
            return null;
        }
    }
}
