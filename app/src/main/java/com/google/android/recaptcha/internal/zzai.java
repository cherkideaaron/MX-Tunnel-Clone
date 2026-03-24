package com.google.android.recaptcha.internal;

import defpackage.AbstractC0136He;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class zzai extends TimerTask {
    final /* synthetic */ zzan zza;

    public zzai(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        zzan zzanVar = this.zza;
        AbstractC0136He.y(zzanVar.zzb, new zzaj(zzanVar, null));
    }
}
