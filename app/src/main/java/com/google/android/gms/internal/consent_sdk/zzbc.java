package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import defpackage.InterfaceC0014Ab;
import defpackage.InterfaceC0031Bb;
import defpackage.JP;
import defpackage.XK;
import defpackage.YK;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzbc implements InterfaceC0031Bb {
    private final Application zzb;
    private final zzbx zzc;
    private final zzaq zzd;
    private final zzbq zze;
    private final zzdt zzf;
    private Dialog zzg;
    private zzbv zzh;
    private final AtomicBoolean zzi = new AtomicBoolean();
    private final AtomicReference zzj = new AtomicReference();
    private final AtomicReference zzk = new AtomicReference();
    private final AtomicReference zzl = new AtomicReference();
    boolean zza = false;

    public zzbc(Application application, zzad zzadVar, zzbx zzbxVar, zzaq zzaqVar, zzbq zzbqVar, zzdt zzdtVar) {
        this.zzb = application;
        this.zzc = zzbxVar;
        this.zzd = zzaqVar;
        this.zze = zzbqVar;
        this.zzf = zzdtVar;
    }

    private final void zzk() {
        Dialog dialog = this.zzg;
        if (dialog != null) {
            dialog.dismiss();
            this.zzg = null;
        }
        this.zzc.zza(null);
        zzaz zzazVar = (zzaz) this.zzl.getAndSet(null);
        if (zzazVar != null) {
            zzazVar.zzb();
        }
    }

    @Override // defpackage.InterfaceC0031Bb
    public final void show(Activity activity, InterfaceC0014Ab interfaceC0014Ab) {
        zzcs.zza();
        if (!this.zzi.compareAndSet(false, true)) {
            new zzg(3, true != this.zza ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").zza();
            interfaceC0014Ab.a();
            return;
        }
        this.zzh.zzc();
        zzaz zzazVar = new zzaz(this, activity);
        this.zzb.registerActivityLifecycleCallbacks(zzazVar);
        this.zzl.set(zzazVar);
        this.zzc.zza(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.zzh);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            new zzg(3, "Activity with null windows is passed in.").zza();
            interfaceC0014Ab.a();
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        JP.a(window, false);
        this.zzk.set(interfaceC0014Ab);
        dialog.show();
        this.zzg = dialog;
        this.zzh.zzd("UMP_messagePresented", "");
    }

    public final zzbv zzc() {
        return this.zzh;
    }

    public final void zzf(YK yk, XK xk) {
        zzbv zzbvVarZzb = ((zzbw) this.zzf).zza();
        this.zzh = zzbvVarZzb;
        zzbvVarZzb.setBackgroundColor(0);
        zzbvVarZzb.getSettings().setJavaScriptEnabled(true);
        zzbvVarZzb.getSettings().setAllowFileAccess(false);
        zzbvVarZzb.getSettings().setAllowContentAccess(false);
        zzbvVarZzb.setWebViewClient(new zzbt(zzbvVarZzb, null));
        this.zzj.set(new zzba(yk, xk, 0 == true ? 1 : 0));
        zzbv zzbvVar = this.zzh;
        zzbq zzbqVar = this.zze;
        zzbvVar.loadDataWithBaseURL(zzbqVar.zza(), zzbqVar.zzb(), "text/html", "UTF-8", null);
        zzcs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzay
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(new zzg(4, "Web view timed out."));
            }
        }, 10000L);
    }

    public final void zzg(int i) {
        zzk();
        InterfaceC0014Ab interfaceC0014Ab = (InterfaceC0014Ab) this.zzk.getAndSet(null);
        if (interfaceC0014Ab == null) {
            return;
        }
        this.zzd.zzg(i);
        interfaceC0014Ab.a();
    }

    public final void zzh(zzg zzgVar) {
        zzk();
        InterfaceC0014Ab interfaceC0014Ab = (InterfaceC0014Ab) this.zzk.getAndSet(null);
        if (interfaceC0014Ab == null) {
            return;
        }
        zzgVar.zza();
        interfaceC0014Ab.a();
    }

    public final void zzi() {
        zzba zzbaVar = (zzba) this.zzj.getAndSet(null);
        if (zzbaVar == null) {
            return;
        }
        zzbaVar.onConsentFormLoadSuccess(this);
    }

    public final void zzj(zzg zzgVar) {
        zzba zzbaVar = (zzba) this.zzj.getAndSet(null);
        if (zzbaVar == null) {
            return;
        }
        zzbaVar.onConsentFormLoadFailure(zzgVar.zza());
    }
}
