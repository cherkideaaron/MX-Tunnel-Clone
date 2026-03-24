package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbhc implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzh = new JSONObject((String) zzbhg.zza(new zzgru() { // from class: com.google.android.gms.internal.ads.zzbgz
                    @Override // com.google.android.gms.internal.ads.zzgru
                    public final /* synthetic */ Object zza() {
                        return sharedPreferences.getString("flag_configuration", "{}");
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0125 A[Catch: all -> 0x000e, DONT_GENERATE, TRY_ENTER, TryCatch #3 {all -> 0x000e, blocks: (B:7:0x0008, B:9:0x000c, B:13:0x0011, B:15:0x0016, B:16:0x0018, B:18:0x002a, B:19:0x002e, B:20:0x0030, B:47:0x00a3, B:48:0x00aa, B:57:0x00d9, B:58:0x00e0, B:72:0x0125, B:73:0x012c, B:86:0x016e, B:87:0x0175, B:89:0x0177, B:90:0x017e, B:22:0x0045, B:37:0x0063, B:39:0x006c, B:40:0x0074, B:42:0x007a, B:44:0x008a, B:46:0x009f, B:50:0x00ac, B:52:0x00b0, B:54:0x00c0, B:56:0x00d5, B:60:0x00e2, B:70:0x0121, B:75:0x012e, B:77:0x013b, B:79:0x0149, B:80:0x0152, B:82:0x0160, B:84:0x0164, B:85:0x0167, B:63:0x00f3, B:65:0x0101, B:67:0x0109, B:68:0x0114, B:26:0x004c, B:32:0x0059), top: B:100:0x0008, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012e A[Catch: all -> 0x0053, TRY_ENTER, TryCatch #1 {all -> 0x0053, blocks: (B:22:0x0045, B:37:0x0063, B:39:0x006c, B:40:0x0074, B:42:0x007a, B:44:0x008a, B:46:0x009f, B:50:0x00ac, B:52:0x00b0, B:54:0x00c0, B:56:0x00d5, B:60:0x00e2, B:70:0x0121, B:75:0x012e, B:77:0x013b, B:79:0x0149, B:80:0x0152, B:82:0x0160, B:84:0x0164, B:85:0x0167, B:63:0x00f3, B:65:0x0101, B:67:0x0109, B:68:0x0114, B:26:0x004c, B:32:0x0059), top: B:97:0x0045, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhc.zza(android.content.Context):void");
    }

    public final boolean zzb() {
        return this.zzi;
    }

    public final boolean zzc() {
        return this.zzj;
    }

    public final Object zzd(final zzbgv zzbgvVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                try {
                    if (!this.zza) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbgvVar.zzf();
            }
        }
        if (zzbgvVar.zzm() != 2) {
            return (zzbgvVar.zzm() == 1 && this.zzh.has(zzbgvVar.zze())) ? zzbgvVar.zzc(this.zzh) : zzbhg.zza(new zzgru() { // from class: com.google.android.gms.internal.ads.zzbhb
                @Override // com.google.android.gms.internal.ads.zzgru
                public final /* synthetic */ Object zza() {
                    return this.zza.zzf(zzbgvVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbgvVar.zzf() : zzbgvVar.zza(bundle);
    }

    public final Object zze(zzbgv zzbgvVar) {
        return (this.zzd || this.zza) ? zzd(zzbgvVar) : zzbgvVar.zzf();
    }

    public final /* synthetic */ Object zzf(zzbgv zzbgvVar) {
        return zzbgvVar.zzd(this.zze);
    }
}
