package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;
import defpackage.AbstractC2950ke;
import defpackage.AbstractServiceConnectionC3280qe;
import defpackage.C0214Lo;
import defpackage.C3333re;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzbid extends AbstractServiceConnectionC3280qe {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private Context zzc;
    private zzdxz zzd;
    private C3333re zze;
    private AbstractC2950ke zzf;

    private final void zzf(Context context) {
        String strA;
        if (this.zzf != null || context == null || (strA = AbstractC2950ke.a(context)) == null || strA.equals(context.getPackageName())) {
            return;
        }
        setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(strA)) {
            intent.setPackage(strA);
        }
        context.bindService(intent, this, 33);
    }

    @Override // defpackage.AbstractServiceConnectionC3280qe
    public final void onCustomTabsServiceConnected(ComponentName componentName, AbstractC2950ke abstractC2950ke) {
        this.zzf = abstractC2950ke;
        abstractC2950ke.getClass();
        try {
            ((C0214Lo) abstractC2950ke.a).f();
        } catch (RemoteException unused) {
        }
        this.zze = abstractC2950ke.b(new zzbia(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final void zza(Context context, zzdxz zzdxzVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdxzVar;
        zzf(context);
    }

    public final C3333re zzb() {
        if (this.zze == null) {
            zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbic
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
        }
        return this.zze;
    }

    public final void zzc(final int i) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfy)).booleanValue() || this.zzd == null) {
            return;
        }
        zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbib
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze(i);
            }
        });
    }

    public final /* synthetic */ void zzd() {
        zzf(this.zzc);
    }

    public final /* synthetic */ void zze(int i) {
        zzdxz zzdxzVar = this.zzd;
        if (zzdxzVar != null) {
            zzdxy zzdxyVarZza = zzdxzVar.zza();
            zzdxyVarZza.zzc("action", "cct_nav");
            zzdxyVarZza.zzc("cct_navs", String.valueOf(i));
            zzdxyVarZza.zzd();
        }
    }
}
