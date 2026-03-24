package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class zzmb extends zzg {
    protected zzlu zza;
    private volatile zzlu zzb;
    private volatile zzlu zzc;
    private final Map zzd;
    private com.google.android.gms.internal.measurement.zzdf zze;
    private volatile boolean zzf;
    private volatile zzlu zzg;
    private zzlu zzh;
    private boolean zzi;
    private final Object zzj;

    public zzmb(zzic zzicVar) {
        super(zzicVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    private final void zzA(zzlu zzluVar, boolean z, long j) {
        zzic zzicVar = this.zzu;
        zzicVar.zzw().zzc(zzicVar.zzaZ().elapsedRealtime());
        if (!zzicVar.zzh().zzb.zzd(zzluVar != null && zzluVar.zzd, z, j) || zzluVar == null) {
            return;
        }
        zzluVar.zzd = false;
    }

    private final zzlu zzB(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        Preconditions.checkNotNull(zzdfVar);
        Integer numValueOf = Integer.valueOf(zzdfVar.zza);
        Map map = this.zzd;
        zzlu zzluVar = (zzlu) map.get(numValueOf);
        if (zzluVar == null) {
            zzlu zzluVar2 = new zzlu(null, zzi(zzdfVar.zzb, "Activity"), this.zzu.zzk().zzd());
            map.put(numValueOf, zzluVar2);
            zzluVar = zzluVar2;
        }
        return this.zzg != null ? this.zzg : zzluVar;
    }

    private final void zzy(String str, zzlu zzluVar, boolean z) {
        zzlu zzluVar2;
        zzlu zzluVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzluVar.zzb == null) {
            zzluVar2 = new zzlu(zzluVar.zza, str != null ? zzi(str, "Activity") : null, zzluVar.zzc, zzluVar.zze, zzluVar.zzf);
        } else {
            zzluVar2 = zzluVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzluVar2;
        zzic zzicVar = this.zzu;
        zzicVar.zzaW().zzj(new zzlw(this, zzluVar2, zzluVar3, zzicVar.zzaZ().elapsedRealtime(), z));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzz(com.google.android.gms.measurement.internal.zzlu r16, com.google.android.gms.measurement.internal.zzlu r17, long r18, boolean r20, android.os.Bundle r21) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r21
            r15.zzg()
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L2c
            long r8 = r1.zzc
            long r10 = r2.zzc
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 != 0) goto L2c
            java.lang.String r8 = r2.zzb
            java.lang.String r9 = r1.zzb
            boolean r8 = java.util.Objects.equals(r8, r9)
            if (r8 == 0) goto L2c
            java.lang.String r8 = r2.zza
            java.lang.String r9 = r1.zza
            boolean r8 = java.util.Objects.equals(r8, r9)
            if (r8 != 0) goto L2e
        L2c:
            r8 = r7
            goto L2f
        L2e:
            r8 = r6
        L2f:
            if (r20 == 0) goto L36
            com.google.android.gms.measurement.internal.zzlu r9 = r0.zza
            if (r9 == 0) goto L36
            r6 = r7
        L36:
            if (r8 == 0) goto Lc0
            android.os.Bundle r8 = new android.os.Bundle
            if (r5 == 0) goto L41
            r8.<init>(r5)
        L3f:
            r14 = r8
            goto L45
        L41:
            r8.<init>()
            goto L3f
        L45:
            com.google.android.gms.measurement.internal.zzpp.zzav(r1, r14, r7)
            if (r2 == 0) goto L63
            java.lang.String r5 = r2.zza
            if (r5 == 0) goto L53
            java.lang.String r8 = "_pn"
            r14.putString(r8, r5)
        L53:
            java.lang.String r5 = r2.zzb
            if (r5 == 0) goto L5c
            java.lang.String r8 = "_pc"
            r14.putString(r8, r5)
        L5c:
            long r8 = r2.zzc
            java.lang.String r2 = "_pi"
            r14.putLong(r2, r8)
        L63:
            r8 = 0
            if (r6 == 0) goto L82
            com.google.android.gms.measurement.internal.zzic r2 = r0.zzu
            com.google.android.gms.measurement.internal.zzoc r2 = r2.zzh()
            com.google.android.gms.measurement.internal.zzoa r2 = r2.zzb
            long r10 = r2.zzb
            long r10 = r3 - r10
            r2.zzb = r3
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 <= 0) goto L82
            com.google.android.gms.measurement.internal.zzic r2 = r0.zzu
            com.google.android.gms.measurement.internal.zzpp r2 = r2.zzk()
            r2.zzak(r14, r10)
        L82:
            com.google.android.gms.measurement.internal.zzic r2 = r0.zzu
            com.google.android.gms.measurement.internal.zzal r5 = r2.zzc()
            boolean r5 = r5.zzv()
            if (r5 != 0) goto L95
            java.lang.String r5 = "_mst"
            r10 = 1
            r14.putLong(r5, r10)
        L95:
            boolean r5 = r1.zze
            if (r7 == r5) goto L9c
            java.lang.String r10 = "auto"
            goto L9e
        L9c:
            java.lang.String r10 = "app"
        L9e:
            com.google.android.gms.common.util.Clock r2 = r2.zzaZ()
            long r11 = r2.currentTimeMillis()
            r20 = r11
            if (r5 == 0) goto Lb3
            long r11 = r1.zzf
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 != 0) goto Lb1
            goto Lb3
        Lb1:
            r12 = r11
            goto Lb5
        Lb3:
            r12 = r20
        Lb5:
            com.google.android.gms.measurement.internal.zzic r2 = r0.zzu
            java.lang.String r11 = "_vs"
            com.google.android.gms.measurement.internal.zzlj r9 = r2.zzj()
            r9.zzG(r10, r11, r12, r14)
        Lc0:
            if (r6 == 0) goto Lc7
            com.google.android.gms.measurement.internal.zzlu r2 = r0.zza
            r15.zzA(r2, r7, r3)
        Lc7:
            r0.zza = r1
            boolean r2 = r1.zze
            if (r2 == 0) goto Lcf
            r0.zzh = r1
        Lcf:
            com.google.android.gms.measurement.internal.zzic r2 = r0.zzu
            com.google.android.gms.measurement.internal.zznl r2 = r2.zzt()
            r2.zzG(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzmb.zzz(com.google.android.gms.measurement.internal.zzlu, com.google.android.gms.measurement.internal.zzlu, long, boolean, android.os.Bundle):void");
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    public final zzlu zzh(boolean z) {
        zzb();
        zzg();
        if (!z) {
            return this.zza;
        }
        zzlu zzluVar = this.zza;
        return zzluVar != null ? zzluVar : this.zzh;
    }

    public final String zzi(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str3 = length > 0 ? strArrSplit[length - 1] : "";
        zzic zzicVar = this.zzu;
        return str3.length() > zzicVar.zzc().zze(null, false) ? str3.substring(0, zzicVar.zzc().zze(null, false)) : str3;
    }

    public final void zzj(Bundle bundle, long j) {
        synchronized (this.zzj) {
            try {
                if (!this.zzi) {
                    this.zzu.zzaV().zzh().zza("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.zzu.zzc().zze(null, false))) {
                    this.zzu.zzaV().zzh().zzb("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.zzu.zzc().zze(null, false))) {
                    this.zzu.zzaV().zzh().zzb("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    com.google.android.gms.internal.measurement.zzdf zzdfVar = this.zze;
                    string2 = zzdfVar != null ? zzi(zzdfVar.zzb, "Activity") : "Activity";
                }
                zzlu zzluVar = this.zzb;
                if (this.zzf && zzluVar != null) {
                    this.zzf = false;
                    boolean zEquals = Objects.equals(zzluVar.zzb, string2);
                    boolean zEquals2 = Objects.equals(zzluVar.zza, string);
                    if (zEquals && zEquals2) {
                        this.zzu.zzaV().zzh().zza("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                zzic zzicVar = this.zzu;
                zzicVar.zzaV().zzk().zzc("Logging screen view with name, class", string == null ? "null" : string, string2 == null ? "null" : string2);
                zzlu zzluVar2 = this.zzb == null ? this.zzc : this.zzb;
                zzlu zzluVar3 = new zzlu(string, string2, zzicVar.zzk().zzd(), true, j);
                this.zzb = zzluVar3;
                this.zzc = zzluVar2;
                this.zzg = zzluVar3;
                zzicVar.zzaW().zzj(new zzlv(this, bundle, zzluVar3, zzluVar2, zzicVar.zzaZ().elapsedRealtime()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated
    public final void zzk(com.google.android.gms.internal.measurement.zzdf zzdfVar, String str, String str2) {
        zzic zzicVar = this.zzu;
        if (!zzicVar.zzc().zzv()) {
            zzicVar.zzaV().zzh().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzlu zzluVar = this.zzb;
        if (zzluVar == null) {
            zzicVar.zzaV().zzh().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.zzd;
        Integer numValueOf = Integer.valueOf(zzdfVar.zza);
        if (map.get(numValueOf) == null) {
            zzicVar.zzaV().zzh().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zzi(zzdfVar.zzb, "Activity");
        }
        String str3 = zzluVar.zzb;
        String str4 = zzluVar.zza;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            zzicVar.zzaV().zzh().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > zzicVar.zzc().zze(null, false))) {
            zzicVar.zzaV().zzh().zzb("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > zzicVar.zzc().zze(null, false))) {
            zzicVar.zzaV().zzh().zzb("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        zzicVar.zzaV().zzk().zzc("Setting current screen to name, class", str == null ? "null" : str, str2);
        zzlu zzluVar2 = new zzlu(str, str2, zzicVar.zzk().zzd());
        map.put(numValueOf, zzluVar2);
        zzy(zzdfVar.zzb, zzluVar2, true);
    }

    public final zzlu zzl() {
        return this.zzb;
    }

    public final void zzm(com.google.android.gms.internal.measurement.zzdf zzdfVar, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzu.zzc().zzv() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(Integer.valueOf(zzdfVar.zza), new zzlu(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), bundle2.getString("referrer_name"), bundle2.getLong(FacebookMediationAdapter.KEY_ID)));
    }

    public final void zzn(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        Object obj = this.zzj;
        synchronized (obj) {
            this.zzi = true;
            if (!Objects.equals(zzdfVar, this.zze)) {
                synchronized (obj) {
                    this.zze = zzdfVar;
                    this.zzf = false;
                    zzic zzicVar = this.zzu;
                    if (zzicVar.zzc().zzv()) {
                        this.zzg = null;
                        zzicVar.zzaW().zzj(new zzma(this));
                    }
                }
            }
        }
        zzic zzicVar2 = this.zzu;
        if (!zzicVar2.zzc().zzv()) {
            this.zzb = this.zzg;
            zzicVar2.zzaW().zzj(new zzlx(this));
            return;
        }
        zzy(zzdfVar.zzb, zzB(zzdfVar), false);
        zzd zzdVarZzw = this.zzu.zzw();
        zzic zzicVar3 = zzdVarZzw.zzu;
        zzicVar3.zzaW().zzj(new zzc(zzdVarZzw, zzicVar3.zzaZ().elapsedRealtime()));
    }

    public final void zzp(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        zzic zzicVar = this.zzu;
        long jElapsedRealtime = zzicVar.zzaZ().elapsedRealtime();
        if (!zzicVar.zzc().zzv()) {
            this.zzb = null;
            zzicVar.zzaW().zzj(new zzly(this, jElapsedRealtime));
        } else {
            zzlu zzluVarZzB = zzB(zzdfVar);
            this.zzc = this.zzb;
            this.zzb = null;
            zzicVar.zzaW().zzj(new zzlz(this, zzluVarZzB, jElapsedRealtime));
        }
    }

    public final void zzq(com.google.android.gms.internal.measurement.zzdf zzdfVar, Bundle bundle) {
        zzlu zzluVar;
        if (!this.zzu.zzc().zzv() || bundle == null || (zzluVar = (zzlu) this.zzd.get(Integer.valueOf(zzdfVar.zza))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(FacebookMediationAdapter.KEY_ID, zzluVar.zzc);
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, zzluVar.zza);
        bundle2.putString("referrer_name", zzluVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void zzs(com.google.android.gms.internal.measurement.zzdf zzdfVar) {
        synchronized (this.zzj) {
            try {
                if (Objects.equals(this.zze, zzdfVar)) {
                    this.zze = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.zzu.zzc().zzv()) {
            this.zzd.remove(Integer.valueOf(zzdfVar.zza));
        }
    }

    public final /* synthetic */ void zzt(Bundle bundle, zzlu zzluVar, zzlu zzluVar2, long j) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        zzz(zzluVar, zzluVar2, j, true, this.zzu.zzk().zzF(null, "screen_view", bundle, null, false));
    }

    public final /* synthetic */ void zzu(zzlu zzluVar, zzlu zzluVar2, long j, boolean z, Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        zzz(zzluVar, zzluVar2, j, z, null);
    }

    public final /* synthetic */ void zzv(zzlu zzluVar, boolean z, long j) {
        zzA(zzluVar, false, j);
    }

    public final /* synthetic */ zzlu zzw() {
        return this.zzh;
    }

    public final /* synthetic */ void zzx(zzlu zzluVar) {
        this.zzh = null;
    }
}
