package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class zzbgv {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    public /* synthetic */ zzbgv(int i, String str, Object obj, Object obj2, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        com.google.android.gms.ads.internal.client.zzbd.zzb().zza(this);
    }

    public static zzbgv zzh(int i, String str, int i2, int i3) {
        return new zzbgr(1, str, Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static zzbgv zzi(int i, String str, long j, long j2) {
        return new zzbgs(1, str, Long.valueOf(j), Long.valueOf(j2));
    }

    public static zzbgv zzj(int i, String str, float f, float f2) {
        return new zzbgt(1, str, Float.valueOf(f), Float.valueOf(f2));
    }

    public static zzbgv zzk(int i, String str) {
        zzbgu zzbguVar = new zzbgu(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzbd.zzb().zzb(zzbguVar);
        return zzbguVar;
    }

    public static zzbgv zzl(int i, String str) {
        zzbgu zzbguVar = new zzbgu(1, "gads:sdk_core_constants_service:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzbd.zzb().zzc(zzbguVar);
        return zzbguVar;
    }

    public abstract Object zza(Bundle bundle);

    public abstract void zzb(SharedPreferences.Editor editor, Object obj);

    public abstract Object zzc(JSONObject jSONObject);

    public abstract Object zzd(SharedPreferences sharedPreferences);

    public final String zze() {
        return this.zzb;
    }

    public final Object zzf() {
        return com.google.android.gms.ads.internal.client.zzbd.zzc().zzb() ? this.zzd : this.zzc;
    }

    public final Object zzg() {
        return com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(this);
    }

    public final int zzm() {
        return this.zza;
    }
}
