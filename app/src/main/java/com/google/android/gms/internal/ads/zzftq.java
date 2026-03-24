package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzftq extends BroadcastReceiver {
    final /* synthetic */ zzftr zza;

    public zzftq(zzftr zzftrVar) {
        Objects.requireNonNull(zzftrVar);
        this.zza = zzftrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzftr zzftrVar;
        boolean zZzf;
        boolean z;
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            zzftrVar = this.zza;
            zZzf = zzftrVar.zzf();
            z = true;
        } else {
            if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                return;
            }
            zzftrVar = this.zza;
            zZzf = zzftrVar.zzf();
            z = false;
        }
        zzftrVar.zzd(z, zZzf);
        zzftrVar.zze(z);
    }
}
