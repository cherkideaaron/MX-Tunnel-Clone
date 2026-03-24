package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.C0142Hk;
import defpackage.Py;
import defpackage.Qy;
import defpackage.Ry;

/* loaded from: classes2.dex */
final class zzaga extends Ry {
    private final /* synthetic */ Ry zza;
    private final /* synthetic */ String zzb;

    public zzaga(Ry ry, String str) {
        this.zza = ry;
        this.zzb = str;
    }

    @Override // defpackage.Ry
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzagb.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // defpackage.Ry
    public final void onCodeSent(String str, Qy qy) {
        this.zza.onCodeSent(str, qy);
    }

    @Override // defpackage.Ry
    public final void onVerificationCompleted(Py py) {
        zzagb.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(py);
    }

    @Override // defpackage.Ry
    public final void onVerificationFailed(C0142Hk c0142Hk) {
        zzagb.zza.remove(this.zzb);
        this.zza.onVerificationFailed(c0142Hk);
    }
}
