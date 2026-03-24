package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzikw;
import defpackage.C3170oe;
import defpackage.R2;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzk implements zzbie {
    final /* synthetic */ zzbif zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ Uri zzd;

    public zzk(zzs zzsVar, zzbif zzbifVar, Bundle bundle, Context context, Uri uri) {
        this.zza = zzbifVar;
        this.zzb = bundle;
        this.zzc = context;
        this.zzd = uri;
        Objects.requireNonNull(zzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbie
    public final void zza() {
        zzbif zzbifVar = this.zza;
        C3170oe c3170oe = new C3170oe(zzbifVar.zzc());
        zzs.zzak(c3170oe, this.zzb);
        R2 r2A = c3170oe.a();
        Context context = this.zzc;
        String strZza = zzikw.zza(context);
        Intent intent = (Intent) r2A.b;
        intent.setPackage(strZza);
        intent.setData(this.zzd);
        context.startActivity(intent, (Bundle) r2A.c);
        zzbifVar.zzb((Activity) context);
    }
}
