package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdqj implements zzdop, zzdgh {
    private final zzbui zza;
    private final zzdbx zzb;
    private final zzddy zzc;
    private final zzdbd zzd;
    private final zzdjk zze;
    private final Context zzf;
    private final zzfir zzg;
    private final VersionInfoParcel zzh;
    private final zzfjk zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = true;
    private final zzbue zzm;
    private final zzbuf zzn;

    public zzdqj(zzbue zzbueVar, zzbuf zzbufVar, zzbui zzbuiVar, zzdbx zzdbxVar, zzddy zzddyVar, zzdbd zzdbdVar, zzdjk zzdjkVar, Context context, zzfir zzfirVar, VersionInfoParcel versionInfoParcel, zzfjk zzfjkVar) {
        this.zzm = zzbueVar;
        this.zzn = zzbufVar;
        this.zza = zzbuiVar;
        this.zzb = zzdbxVar;
        this.zzc = zzddyVar;
        this.zzd = zzdbdVar;
        this.zze = zzdjkVar;
        this.zzf = context;
        this.zzg = zzfirVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzfjkVar;
    }

    private static final HashMap zzB(Map map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            synchronized (map) {
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        View view = (View) ((WeakReference) entry.getValue()).get();
                        if (view != null) {
                            map2.put((String) entry.getKey(), view);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return map2;
    }

    private final void zzi(View view) {
        try {
            zzbui zzbuiVar = this.zza;
            if (zzbuiVar != null && !zzbuiVar.zzu()) {
                zzbuiVar.zzw(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmj)).booleanValue()) {
                    this.zze.zzdu();
                    return;
                }
                return;
            }
            zzbue zzbueVar = this.zzm;
            if (zzbueVar != null && !zzbueVar.zzq()) {
                zzbueVar.zzn(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmj)).booleanValue()) {
                    this.zze.zzdu();
                    return;
                }
                return;
            }
            zzbuf zzbufVar = this.zzn;
            if (zzbufVar == null || zzbufVar.zzo()) {
                return;
            }
            zzbufVar.zzl(ObjectWrapper.wrap(view));
            this.zzd.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmj)).booleanValue()) {
                this.zze.zzdu();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call handleClick", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzA() {
        try {
            zzbui zzbuiVar = this.zza;
            if (zzbuiVar != null) {
                zzbuiVar.zzC();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call destroy", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf A[Catch: RemoteException -> 0x002b, JSONException -> 0x0047, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0047, blocks: (B:49:0x00b4, B:50:0x00c9, B:52:0x00cf), top: B:73:0x00b4 }] */
    @Override // com.google.android.gms.internal.ads.zzdop
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(android.view.View r9, java.util.Map r10, java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdqj.zza(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzb(View view, Map map) {
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            zzbui zzbuiVar = this.zza;
            if (zzbuiVar != null) {
                zzbuiVar.zzy(iObjectWrapperWrap);
                return;
            }
            zzbue zzbueVar = this.zzm;
            if (zzbueVar != null) {
                zzbueVar.zzs(iObjectWrapperWrap);
                return;
            }
            zzbuf zzbufVar = this.zzn;
            if (zzbufVar != null) {
                zzbufVar.zzq(iObjectWrapperWrap);
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzc(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.zzk && this.zzg.zzL) {
            return;
        }
        zzi(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzd(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgh
    public final void zzdG() {
        try {
            zzbui zzbuiVar = this.zza;
            if (zzbuiVar == null || !zzbuiVar.zzt()) {
                return;
            }
            zzfir zzfirVar = this.zzg;
            if (zzfirVar.zze != 4 && !zzfirVar.zzaD) {
                return;
            }
            zzbuiVar.zzv();
            this.zzb.zza();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to report impression from an adapter", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgh
    public final void zzdH() {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zze(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzf(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        String str;
        if (!this.zzk) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            str = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.";
        } else if (this.zzg.zzL) {
            zzi(view2);
            return;
        } else {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            str = "Custom click reporting for 3p ads failed. Ad unit id not in allow list.";
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzi(str);
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzg() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final boolean zzh() {
        return this.zzg.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzj(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzk(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final JSONObject zzl(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final JSONObject zzm(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzn() {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzo(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzp(zzbmj zzbmjVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzr(com.google.android.gms.ads.internal.client.zzdj zzdjVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzs(com.google.android.gms.ads.internal.client.zzdf zzdfVar) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzt() {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final int zzu() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final boolean zzv() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzw(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzj) {
                this.zzj = com.google.android.gms.ads.internal.zzt.zzo().zzg(this.zzf, this.zzh.afmaVersion, this.zzg.zzC.toString(), this.zzi.zzg);
            }
            if (this.zzl) {
                zzbui zzbuiVar = this.zza;
                if (zzbuiVar == null) {
                    zzbue zzbueVar = this.zzm;
                    if (zzbueVar != null && !zzbueVar.zzp()) {
                        zzbueVar.zzm();
                        this.zzb.zza();
                        return;
                    }
                    zzbuf zzbufVar = this.zzn;
                    if (zzbufVar == null || zzbufVar.zzn()) {
                        return;
                    }
                    zzbufVar.zzk();
                    this.zzb.zza();
                    return;
                }
                zzfir zzfirVar = this.zzg;
                if (zzfirVar.zzaD) {
                    if (zzbuiVar.zzt()) {
                        return;
                    }
                    zzbuiVar.zzv();
                    this.zzb.zza();
                    return;
                }
                if (zzbuiVar.zzt() && zzfirVar.zze == 4) {
                    this.zzc.zza();
                } else {
                    zzbuiVar.zzv();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzx(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final void zzy() {
    }

    @Override // com.google.android.gms.internal.ads.zzdop
    public final boolean zzz(Bundle bundle) {
        return false;
    }
}
