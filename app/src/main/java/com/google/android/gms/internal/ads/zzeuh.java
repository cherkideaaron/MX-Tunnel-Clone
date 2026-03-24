package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import defpackage.As;

/* loaded from: classes.dex */
final /* synthetic */ class zzeuh implements zzgyw {
    static final /* synthetic */ zzeuh zza = new zzeuh();

    private /* synthetic */ zzeuh() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ As zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return appSetIdInfo == null ? zzgzo.zza(new zzeul(null, -1)) : zzgzo.zza(new zzeul(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
