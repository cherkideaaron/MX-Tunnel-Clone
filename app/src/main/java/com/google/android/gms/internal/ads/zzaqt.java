package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.AbstractC0434Yn;
import defpackage.U7;
import java.util.List;

/* loaded from: classes.dex */
final class zzaqt extends zzaqr {
    private int zza = 0;
    private final Context zzb;
    private final String zzc;
    private zzbcx zzd;
    private ServiceConnection zze;

    public zzaqt(Context context) {
        this.zzb = context.getApplicationContext();
        this.zzc = (U7.c() && SdkExtensions.getExtensionVersion(34) >= 8 && Process.isSdkSandbox()) ? AbstractC0434Yn.q(context.getSystemService(AbstractC0434Yn.D())).getClientPackageName() : context.getPackageName();
    }

    @Override // com.google.android.gms.internal.ads.zzaqr
    public final boolean zza() {
        return (this.zza != 2 || this.zzd == null || this.zze == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzaqr
    public final void zzb(zzaqu zzaquVar) {
        ServiceInfo serviceInfo;
        if (zza()) {
            zzaqw.zza("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            zzaquVar.zza(0);
            return;
        }
        int i = this.zza;
        if (i == 1) {
            zzaqw.zzb("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            zzaquVar.zza(3);
            return;
        }
        if (i == 3) {
            zzaqw.zzb("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            zzaquVar.zza(3);
            return;
        }
        zzaqw.zza("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context = this.zzb;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.zza = 0;
            zzaqw.zza("InstallReferrerClient", "Install Referrer service unavailable on device.");
            zzaquVar.zza(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", UserVerificationMethods.USER_VERIFY_PATTERN).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    zzaqs zzaqsVar = new zzaqs(this, zzaquVar, null);
                    this.zze = zzaqsVar;
                    try {
                        if (this.zzb.bindService(intent2, zzaqsVar, 1)) {
                            zzaqw.zza("InstallReferrerClient", "Service was bonded successfully.");
                            return;
                        }
                        zzaqw.zzb("InstallReferrerClient", "Connection to service is blocked.");
                        this.zza = 0;
                        zzaquVar.zza(1);
                        return;
                    } catch (SecurityException unused) {
                        zzaqw.zzb("InstallReferrerClient", "No permission to connect to service.");
                        this.zza = 0;
                        zzaquVar.zza(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        zzaqw.zzb("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
        this.zza = 0;
        zzaquVar.zza(2);
    }

    @Override // com.google.android.gms.internal.ads.zzaqr
    public final void zzc() {
        this.zza = 3;
        if (this.zze != null) {
            zzaqw.zza("InstallReferrerClient", "Unbinding from service.");
            this.zzb.unbindService(this.zze);
            this.zze = null;
        }
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzaqr
    public final zzaqv zzd() throws RemoteException {
        if (!zza()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.zzc);
        try {
            return new zzaqv(this.zzd.zze(bundle));
        } catch (RemoteException e) {
            zzaqw.zzb("InstallReferrerClient", "RemoteException getting install referrer information");
            this.zza = 0;
            throw e;
        }
    }

    public final /* synthetic */ void zze(int i) {
        this.zza = i;
    }

    public final /* synthetic */ void zzf(zzbcx zzbcxVar) {
        this.zzd = zzbcxVar;
    }
}
