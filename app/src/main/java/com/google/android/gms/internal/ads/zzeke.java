package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import defpackage.As;
import defpackage.C0417Xn;
import defpackage.C3699yJ;

/* loaded from: classes.dex */
public final class zzeke {
    private final Context zza;

    public zzeke(Context context) {
        this.zza = context;
    }

    public final As zza(boolean z) {
        try {
            if (MobileAds.ERROR_DOMAIN.length() <= 0) {
                throw new IllegalStateException("adsSdkName must be set".toString());
            }
            C0417Xn c0417Xn = new C0417Xn(MobileAds.ERROR_DOMAIN, z);
            C3699yJ c3699yJA = C3699yJ.a(this.zza);
            return c3699yJA != null ? c3699yJA.b(c0417Xn) : zzgzo.zzc(new IllegalStateException());
        } catch (Exception e) {
            return zzgzo.zzc(e);
        }
    }
}
