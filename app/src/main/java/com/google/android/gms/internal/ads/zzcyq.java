package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzcyq implements zzdel, zzdjy {
    private zzbzn zza;
    private final Context zzc;
    private final zzfor zzd;
    private final VersionInfoParcel zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    public zzcyq(Context context, zzfor zzforVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zzc = context;
        this.zzd = zzforVar;
        this.zze = versionInfoParcel;
        this.zzf = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.zzb
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lb
            goto La7
        Lb:
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbje.zzo
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 2
            if (r0 == 0) goto L1c
        L1a:
            r3 = r2
            goto L68
        L1c:
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbje.zzp
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 3
            if (r0 == 0) goto L2c
            goto L68
        L2c:
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbje.zzn
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3c
        L3a:
            r3 = r1
            goto L68
        L3c:
            com.google.android.gms.internal.ads.zzcdu r0 = com.google.android.gms.ads.internal.zzt.zzh()
            com.google.android.gms.ads.internal.util.zzg r0 = r0.zzo()
            com.google.android.gms.internal.ads.zzcdp r0 = r0.zzi()
            java.lang.String r0 = r0.zzd()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3a
            r4.<init>(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "local_flag_write"
            java.lang.String r0 = r4.optString(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r4 = "client"
            boolean r4 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r4 == 0) goto L60
            goto L1a
        L60:
            java.lang.String r4 = "service"
            boolean r0 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r0 == 0) goto L3a
        L68:
            int r3 = r3 + (-1)
            if (r3 == r1) goto L80
            if (r3 == r2) goto L6f
            goto La7
        L6f:
            android.content.Context r0 = r6.zzc
            com.google.android.gms.internal.ads.zzfor r2 = r6.zzd
            com.google.android.gms.internal.ads.zzbsq r3 = com.google.android.gms.ads.internal.zzt.zzr()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()
            com.google.android.gms.internal.ads.zzbsz r0 = r3.zza(r0, r4, r2)
            goto L90
        L80:
            android.content.Context r0 = r6.zzc
            com.google.android.gms.internal.ads.zzfor r2 = r6.zzd
            com.google.android.gms.internal.ads.zzbsq r3 = com.google.android.gms.ads.internal.zzt.zzr()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()
            com.google.android.gms.internal.ads.zzbsz r0 = r3.zzb(r0, r4, r2)
        L90:
            java.lang.String r2 = "google.afma.sdkConstants.getSdkConstants"
            com.google.android.gms.internal.ads.zzbst r3 = com.google.android.gms.internal.ads.zzbsw.zza
            com.google.android.gms.internal.ads.zzbsp r0 = r0.zza(r2, r3, r3)
            android.content.Context r2 = r6.zzc
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3 = r6.zze
            java.util.concurrent.Executor r4 = r6.zzf
            com.google.android.gms.internal.ads.zzbzq r5 = new com.google.android.gms.internal.ads.zzbzq
            r5.<init>(r2, r0, r3, r4)
            r6.zza = r5
            r6.zzg = r1
        La7:
            boolean r0 = r6.zzg
            if (r0 != 0) goto Lac
            goto Ld5
        Lac:
            com.google.android.gms.internal.ads.zzbzn r0 = r6.zza
            if (r0 == 0) goto Ld5
            As r0 = r0.zzb()
            boolean r1 = r6.zzh
            if (r1 != 0) goto Ld0
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbiw.zzi
            java.lang.Object r1 = r1.zze()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Ld0
            com.google.android.gms.internal.ads.zzcyp r1 = new com.google.android.gms.internal.ads.zzcyp
            r1.<init>()
            java.util.concurrent.Executor r2 = r6.zzf
            r0.addListener(r1, r2)
        Ld0:
            java.lang.String r1 = "persistFlagsClient"
            com.google.android.gms.internal.ads.zzcel.zza(r0, r1)
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcyq.zzc():void");
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbj zzbjVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdO(zzbzu zzbzuVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdP(zzfjc zzfjcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zze(String str) {
        zzc();
    }

    public final /* synthetic */ void zzf() {
        zzbgp.zze(this.zzc);
        this.zzh = true;
    }
}
