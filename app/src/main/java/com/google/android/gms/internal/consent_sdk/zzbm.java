package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import defpackage.InterfaceC0014Ab;
import defpackage.InterfaceC0031Bb;
import defpackage.YK;

/* loaded from: classes.dex */
public final /* synthetic */ class zzbm implements YK {
    public final /* synthetic */ Activity zza;
    public final /* synthetic */ InterfaceC0014Ab zzb;

    public /* synthetic */ zzbm(Activity activity, InterfaceC0014Ab interfaceC0014Ab) {
        this.zza = activity;
        this.zzb = interfaceC0014Ab;
    }

    @Override // defpackage.YK
    public final void onConsentFormLoadSuccess(InterfaceC0031Bb interfaceC0031Bb) {
        interfaceC0031Bb.show(this.zza, this.zzb);
    }
}
