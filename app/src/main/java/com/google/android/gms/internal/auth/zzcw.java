package com.google.android.gms.internal.auth;

import android.util.Log;
import defpackage.AbstractC3264qG;

/* loaded from: classes.dex */
final class zzcw extends zzdc {
    public zzcw(zzcz zzczVar, String str, Boolean bool, boolean z) {
        super(zzczVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        if (zzcb.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzcb.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        StringBuilder sbO = AbstractC3264qG.o("Invalid boolean value for ", zzc(), ": ");
        sbO.append((String) obj);
        Log.e("PhenotypeFlag", sbO.toString());
        return null;
    }
}
