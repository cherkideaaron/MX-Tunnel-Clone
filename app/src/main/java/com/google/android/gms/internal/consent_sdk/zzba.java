package com.google.android.gms.internal.consent_sdk;

import defpackage.C0551bm;
import defpackage.InterfaceC0031Bb;
import defpackage.XK;
import defpackage.YK;

/* loaded from: classes.dex */
final class zzba implements YK, XK {
    private final YK zza;
    private final XK zzb;

    public /* synthetic */ zzba(YK yk, XK xk, zzbb zzbbVar) {
        this.zza = yk;
        this.zzb = xk;
    }

    @Override // defpackage.XK
    public final void onConsentFormLoadFailure(C0551bm c0551bm) {
        this.zzb.onConsentFormLoadFailure(c0551bm);
    }

    @Override // defpackage.YK
    public final void onConsentFormLoadSuccess(InterfaceC0031Bb interfaceC0031Bb) {
        this.zza.onConsentFormLoadSuccess(interfaceC0031Bb);
    }
}
