package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.util.Log;
import defpackage.C0099Fb;
import defpackage.C0116Gb;
import defpackage.C0551bm;
import defpackage.EnumC0082Eb;
import defpackage.InterfaceC0048Cb;
import defpackage.InterfaceC0065Db;

/* loaded from: classes.dex */
public final class zzj {
    private final zzaq zza;
    private final zzw zzb;
    private final zzbo zzc;
    private final Object zzd = new Object();
    private final Object zze = new Object();
    private boolean zzf = false;
    private boolean zzg = false;
    private C0116Gb zzh = new C0116Gb(new C0099Fb());

    public zzj(zzaq zzaqVar, zzw zzwVar, zzbo zzboVar) {
        this.zza = zzaqVar;
        this.zzb = zzwVar;
        this.zzc = zzboVar;
    }

    public final boolean canRequestAds() {
        zzaq zzaqVar = this.zza;
        if (!zzaqVar.zzk()) {
            int iZza = !zzc() ? 0 : zzaqVar.zza();
            if (iZza != 1 && iZza != 3) {
                return false;
            }
        }
        return true;
    }

    public final int getConsentStatus() {
        if (zzc()) {
            return this.zza.zza();
        }
        return 0;
    }

    public final EnumC0082Eb getPrivacyOptionsRequirementStatus() {
        return !zzc() ? EnumC0082Eb.a : this.zza.zzb();
    }

    public final boolean isConsentFormAvailable() {
        return this.zzc.zzf();
    }

    public final void requestConsentInfoUpdate(Activity activity, C0116Gb c0116Gb, InterfaceC0065Db interfaceC0065Db, InterfaceC0048Cb interfaceC0048Cb) {
        synchronized (this.zzd) {
            this.zzf = true;
        }
        this.zzh = c0116Gb;
        this.zzb.zzc(activity, c0116Gb, interfaceC0065Db, interfaceC0048Cb);
    }

    public final void reset() {
        this.zzc.zzd(null);
        this.zza.zze();
        synchronized (this.zzd) {
            this.zzf = false;
        }
    }

    public final void zza(Activity activity) {
        if (zzc() && !zzd()) {
            zzb(true);
            this.zzb.zzc(activity, this.zzh, new InterfaceC0065Db() { // from class: com.google.android.gms.internal.consent_sdk.zzh
                @Override // defpackage.InterfaceC0065Db
                public final void onConsentInfoUpdateSuccess() {
                    this.zza.zzb(false);
                }
            }, new InterfaceC0048Cb() { // from class: com.google.android.gms.internal.consent_sdk.zzi
                @Override // defpackage.InterfaceC0048Cb
                public final void onConsentInfoUpdateFailure(C0551bm c0551bm) {
                    this.zza.zzb(false);
                }
            });
            return;
        }
        Log.w("UserMessagingPlatform", "Retry request is not executed. consentInfoUpdateHasBeenCalled=" + zzc() + ", retryRequestIsInProgress=" + zzd());
    }

    public final void zzb(boolean z) {
        synchronized (this.zze) {
            this.zzg = z;
        }
    }

    public final boolean zzc() {
        boolean z;
        synchronized (this.zzd) {
            z = this.zzf;
        }
        return z;
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzg;
        }
        return z;
    }
}
