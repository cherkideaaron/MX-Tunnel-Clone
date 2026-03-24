package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import defpackage.AbstractC2950ke;
import defpackage.AbstractServiceConnectionC3280qe;
import defpackage.C0214Lo;
import defpackage.C3333re;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbif {
    private C3333re zza;
    private AbstractC2950ke zzb;
    private AbstractServiceConnectionC3280qe zzc;
    private zzbie zzd;

    public static boolean zza(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i = 0; i < listQueryIntentActivities.size(); i++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(zzikw.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final void zzb(Activity activity) {
        AbstractServiceConnectionC3280qe abstractServiceConnectionC3280qe = this.zzc;
        if (abstractServiceConnectionC3280qe == null) {
            return;
        }
        activity.unbindService(abstractServiceConnectionC3280qe);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    public final C3333re zzc() {
        AbstractC2950ke abstractC2950ke = this.zzb;
        if (abstractC2950ke == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = abstractC2950ke.b(null);
        }
        return this.zza;
    }

    public final void zzd(zzbie zzbieVar) {
        this.zzd = zzbieVar;
    }

    public final void zze(Activity activity) {
        String strZza;
        if (this.zzb == null && (strZza = zzikw.zza(activity)) != null) {
            zzikx zzikxVar = new zzikx(this);
            this.zzc = zzikxVar;
            zzikxVar.setApplicationContext(activity.getApplicationContext());
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(strZza)) {
                intent.setPackage(strZza);
            }
            activity.bindService(intent, zzikxVar, 33);
        }
    }

    public final void zzf(AbstractC2950ke abstractC2950ke) {
        this.zzb = abstractC2950ke;
        abstractC2950ke.getClass();
        try {
            ((C0214Lo) abstractC2950ke.a).f();
        } catch (RemoteException unused) {
        }
        zzbie zzbieVar = this.zzd;
        if (zzbieVar != null) {
            zzbieVar.zza();
        }
    }

    public final void zzg() {
        this.zzb = null;
        this.zza = null;
    }
}
