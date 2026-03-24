package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import defpackage.C0116Gb;
import defpackage.C3762zb;
import defpackage.R2;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class zzn {
    private final Application zza;
    private final zzaq zzb;

    public zzn(Application application, zzaq zzaqVar) {
        this.zza = application;
        this.zzb = zzaqVar;
    }

    public final zzcj zzc(Activity activity, C0116Gb c0116Gb) {
        c0116Gb.getClass();
        R2 r2 = new R2(this.zza);
        boolean z = true;
        if (!zzcu.zza(true) && !((ArrayList) r2.b).contains(zzcm.zza((Context) r2.c))) {
            z = false;
        }
        return zzp.zza(new zzp(this, activity, new C3762zb(z, r2), c0116Gb, null));
    }
}
