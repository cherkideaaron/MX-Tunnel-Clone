package com.google.android.recaptcha.internal;

import android.app.Application;
import defpackage.AbstractC3400sr;
import defpackage.InterfaceC0606cn;

/* loaded from: classes2.dex */
public final class zzdq extends AbstractC3400sr implements InterfaceC0606cn {
    public static final zzdq zza = new zzdq();

    public zzdq() {
        super(0);
    }

    @Override // defpackage.InterfaceC0606cn
    public final Object invoke() throws zzbd {
        int i = zzav.zza;
        Object objZzb = zzau.zza().zzb(735120228);
        if (objZzb != null) {
            return (Application) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
