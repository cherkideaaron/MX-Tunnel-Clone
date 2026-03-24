package com.google.android.recaptcha.internal;

import defpackage.AbstractC0136He;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class zzep extends TimerTask {
    final /* synthetic */ zzes zza;

    public zzep(zzes zzesVar) {
        this.zza = zzesVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzes zzesVar = this.zza;
        AbstractC0136He.y(zzesVar.zzd, new zzeq(zzesVar, null));
    }
}
