package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzaw implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    public zzaw(zzax zzaxVar, Context context, String str, boolean z, boolean z2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
        Objects.requireNonNull(zzaxVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zza;
        AlertDialog.Builder builderZzP = zzs.zzP(context);
        builderZzP.setMessage(this.zzb);
        builderZzP.setTitle(this.zzc ? "Error" : "Info");
        if (this.zzd) {
            builderZzP.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderZzP.setPositiveButton("Learn More", new zzav(this, context));
            builderZzP.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderZzP.create().show();
    }
}
