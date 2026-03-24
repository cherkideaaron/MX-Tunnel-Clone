package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final /* synthetic */ class zzetb implements zzgyw {
    static final /* synthetic */ zzetb zza = new zzetb();

    private /* synthetic */ zzetb() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ As zza(Object obj) {
        return zzgzo.zza(((Throwable) obj) instanceof TimeoutException ? new zzete(Integer.toString(17)) : new zzete(null));
    }
}
