package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import defpackage.As;

/* loaded from: classes.dex */
final /* synthetic */ class zzfcf implements zzgyw {
    static final /* synthetic */ zzfcf zza = new zzfcf();

    private /* synthetic */ zzfcf() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ As zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return appSetIdInfo == null ? zzgzo.zza(new zzfch(null, -1)) : zzgzo.zza(new zzfch(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
