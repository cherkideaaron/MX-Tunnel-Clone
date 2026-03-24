package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.AbstractC3264qG;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes2.dex */
public final class zzal extends zzje {
    private Boolean zza;
    private String zzb;
    private zzak zzc;
    private Boolean zzd;

    public zzal(zzic zzicVar) {
        super(zzicVar);
        this.zzc = zzaj.zza;
    }

    public static final long zzF() {
        return ((Long) zzfy.zzd.zzb(null)).longValue();
    }

    public static final int zzG() {
        return Math.max(0, ((Integer) zzfy.zzi.zzb(null)).intValue());
    }

    public static final long zzH() {
        return ((Integer) zzfy.zzk.zzb(null)).intValue();
    }

    public static final long zzI() {
        return ((Long) zzfy.zzR.zzb(null)).longValue();
    }

    public static final long zzJ() {
        return ((Long) zzfy.zzM.zzb(null)).longValue();
    }

    private final String zzK(String str, String str2) {
        zzgs zzgsVarZzb;
        String str3;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            Preconditions.checkNotNull(str4);
            return str4;
        } catch (ClassNotFoundException e) {
            e = e;
            zzgsVarZzb = this.zzu.zzaV().zzb();
            str3 = "Could not find SystemProperties class";
            zzgsVarZzb.zzb(str3, e);
            return "";
        } catch (IllegalAccessException e2) {
            e = e2;
            zzgsVarZzb = this.zzu.zzaV().zzb();
            str3 = "Could not access SystemProperties.get()";
            zzgsVarZzb.zzb(str3, e);
            return "";
        } catch (NoSuchMethodException e3) {
            e = e3;
            zzgsVarZzb = this.zzu.zzaV().zzb();
            str3 = "Could not find SystemProperties.get() method";
            zzgsVarZzb.zzb(str3, e);
            return "";
        } catch (InvocationTargetException e4) {
            e = e4;
            zzgsVarZzb = this.zzu.zzaV().zzb();
            str3 = "SystemProperties.get() threw an exception";
            zzgsVarZzb.zzb(str3, e);
            return "";
        }
    }

    public final String zzA() {
        return zzK("debug.firebase.analytics.app", "");
    }

    public final String zzB() {
        return zzK("debug.deferred.deeplink", "");
    }

    public final boolean zzC(String str) {
        return "1".equals(this.zzc.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzD(String str) {
        return "1".equals(this.zzc.zza(str, "measurement.event_sampling_enabled"));
    }

    public final boolean zzE() {
        if (this.zza == null) {
            Boolean boolZzr = zzr("app_measurement_lite");
            this.zza = boolZzr;
            if (boolZzr == null) {
                this.zza = Boolean.FALSE;
            }
        }
        return this.zza.booleanValue() || !this.zzu.zzp();
    }

    public final void zza(zzak zzakVar) {
        this.zzc = zzakVar;
    }

    public final String zzb() {
        this.zzu.zzaU();
        return "FA";
    }

    public final int zzc() {
        return this.zzu.zzk().zzag(201500000, true) ? 100 : 25;
    }

    public final int zzd(String str) {
        return zzn(str, zzfy.zzX, 25, 100);
    }

    public final int zze(String str, boolean z) {
        if (z) {
            return zzn(str, zzfy.zzah, 100, 500);
        }
        return 500;
    }

    public final int zzf(String str, boolean z) {
        return Math.max(zze(str, z), UserVerificationMethods.USER_VERIFY_HANDPRINT);
    }

    public final int zzh(String str) {
        return zzn(str, zzfy.zzW, 500, 2000);
    }

    public final long zzi() {
        this.zzu.zzaU();
        return 133005L;
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzj() {
        if (this.zzd == null) {
            synchronized (this) {
                try {
                    if (this.zzd == null) {
                        zzic zzicVar = this.zzu;
                        ApplicationInfo applicationInfo = zzicVar.zzaY().getApplicationInfo();
                        String myProcessName = ProcessUtils.getMyProcessName();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z = false;
                            if (str != null && str.equals(myProcessName)) {
                                z = true;
                            }
                            this.zzd = Boolean.valueOf(z);
                        }
                        if (this.zzd == null) {
                            this.zzd = Boolean.TRUE;
                            zzicVar.zzaV().zzb().zza("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.zzd.booleanValue();
    }

    public final String zzk(String str, zzfx zzfxVar) {
        return (String) zzfxVar.zzb(TextUtils.isEmpty(str) ? null : this.zzc.zza(str, zzfxVar.zza()));
    }

    public final long zzl(String str, zzfx zzfxVar) {
        if (!TextUtils.isEmpty(str)) {
            String strZza = this.zzc.zza(str, zzfxVar.zza());
            if (!TextUtils.isEmpty(strZza)) {
                try {
                    return ((Long) zzfxVar.zzb(Long.valueOf(Long.parseLong(strZza)))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Long) zzfxVar.zzb(null)).longValue();
    }

    public final int zzm(String str, zzfx zzfxVar) {
        if (!TextUtils.isEmpty(str)) {
            String strZza = this.zzc.zza(str, zzfxVar.zza());
            if (!TextUtils.isEmpty(strZza)) {
                try {
                    return ((Integer) zzfxVar.zzb(Integer.valueOf(Integer.parseInt(strZza)))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Integer) zzfxVar.zzb(null)).intValue();
    }

    public final int zzn(String str, zzfx zzfxVar, int i, int i2) {
        return Math.max(Math.min(zzm(str, zzfxVar), i2), i);
    }

    public final double zzo(String str, zzfx zzfxVar) {
        if (!TextUtils.isEmpty(str)) {
            String strZza = this.zzc.zza(str, zzfxVar.zza());
            if (!TextUtils.isEmpty(strZza)) {
                try {
                    return ((Double) zzfxVar.zzb(Double.valueOf(Double.parseDouble(strZza)))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Double) zzfxVar.zzb(null)).doubleValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzp(java.lang.String r4, com.google.android.gms.measurement.internal.zzfx r5) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L12
        L7:
            java.lang.Object r4 = r5.zzb(r1)
        Lb:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L12:
            com.google.android.gms.measurement.internal.zzak r0 = r3.zzc
            java.lang.String r2 = r5.zza()
            java.lang.String r4 = r0.zza(r4, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L23
            goto L7
        L23:
            java.lang.String r0 = "1"
            boolean r4 = r0.equals(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r4 = r5.zzb(r4)
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzp(java.lang.String, com.google.android.gms.measurement.internal.zzfx):boolean");
    }

    public final Bundle zzq() {
        try {
            zzic zzicVar = this.zzu;
            if (zzicVar.zzaY().getPackageManager() == null) {
                zzicVar.zzaV().zzb().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(zzicVar.zzaY()).getApplicationInfo(zzicVar.zzaY().getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            zzicVar.zzaV().zzb().zza("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.zzu.zzaV().zzb().zzb("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final Boolean zzr(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle bundleZzq = zzq();
        if (bundleZzq == null) {
            AbstractC3264qG.t(this.zzu, "Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleZzq.containsKey(str)) {
            return Boolean.valueOf(bundleZzq.getBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzs(java.lang.String r4) throws android.content.res.Resources.NotFoundException {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            android.os.Bundle r0 = r3.zzq()
            r1 = 0
            if (r0 != 0) goto L15
            com.google.android.gms.measurement.internal.zzic r4 = r3.zzu
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            defpackage.AbstractC3264qG.t(r4, r0)
        L13:
            r4 = r1
            goto L24
        L15:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L1c
            goto L13
        L1c:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L24:
            if (r4 == 0) goto L50
            com.google.android.gms.measurement.internal.zzic r0 = r3.zzu     // Catch: android.content.res.Resources.NotFoundException -> L40
            android.content.Context r0 = r0.zzaY()     // Catch: android.content.res.Resources.NotFoundException -> L40
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L40
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L40
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L40
            if (r4 != 0) goto L3b
            return r1
        L3b:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L40
            return r4
        L40:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzic r0 = r3.zzu
            com.google.android.gms.measurement.internal.zzgu r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgs r0 = r0.zzb()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.zzb(r2, r4)
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzal.zzs(java.lang.String):java.util.List");
    }

    public final boolean zzt() {
        this.zzu.zzaU();
        Boolean boolZzr = zzr("firebase_analytics_collection_deactivated");
        return boolZzr != null && boolZzr.booleanValue();
    }

    public final boolean zzu() {
        Boolean boolZzr = zzr("google_analytics_adid_collection_enabled");
        return boolZzr == null || boolZzr.booleanValue();
    }

    public final boolean zzv() {
        Boolean boolZzr = zzr("google_analytics_automatic_screen_reporting_enabled");
        return boolZzr == null || boolZzr.booleanValue();
    }

    public final zzji zzw(String str, boolean z) {
        Object obj;
        Preconditions.checkNotEmpty(str);
        zzic zzicVar = this.zzu;
        Bundle bundleZzq = zzq();
        if (bundleZzq == null) {
            AbstractC3264qG.t(zzicVar, "Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleZzq.get(str);
        }
        if (obj == null) {
            return zzji.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return zzji.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return zzji.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return zzji.POLICY;
        }
        zzicVar.zzaV().zze().zzb("Invalid manifest metadata for", str);
        return zzji.UNINITIALIZED;
    }

    public final boolean zzx() {
        Boolean boolZzr = zzr("google_analytics_sgtm_upload_enabled");
        if (boolZzr == null) {
            return false;
        }
        return boolZzr.booleanValue();
    }

    public final void zzy(String str) {
        this.zzb = str;
    }

    public final String zzz() {
        return this.zzb;
    }
}
