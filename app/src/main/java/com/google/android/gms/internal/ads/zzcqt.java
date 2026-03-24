package com.google.android.gms.internal.ads;

import defpackage.As;
import defpackage.C0451Zn;

/* loaded from: classes.dex */
final /* synthetic */ class zzcqt implements zzgyw {
    static final /* synthetic */ zzcqt zza = new zzcqt();

    private /* synthetic */ zzcqt() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ As zza(Object obj) {
        Throwable th = (Throwable) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlS)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(th, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "GetTopicsApiWithRecordObservationActionHandler");
        }
        return zzgzo.zza(new C0451Zn(zzguf.zzi()));
    }
}
