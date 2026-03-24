package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import defpackage.AbstractC3264qG;
import java.io.IOException;

/* loaded from: classes.dex */
final class zzgaj {
    private static zzgaj zza;
    private final String zzb;
    private final SharedPreferences zzc;

    private zzgaj(Context context) {
        this.zzb = context.getPackageName();
        this.zzc = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public static zzgaj zza(Context context) {
        if (zza == null) {
            zza = new zzgaj(context);
        }
        return zza;
    }

    public final void zzb(String str, Object obj) throws IOException {
        SharedPreferences.Editor editorPutInt;
        if (obj instanceof String) {
            editorPutInt = this.zzc.edit().putString(str, (String) obj);
        } else if (obj instanceof Long) {
            editorPutInt = this.zzc.edit().putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Boolean) {
            editorPutInt = this.zzc.edit().putBoolean(str, ((Boolean) obj).booleanValue());
        } else {
            if (!(obj instanceof Integer)) {
                String strValueOf = String.valueOf(obj.getClass());
                String str2 = this.zzb;
                Log.e("GpidLifecycleSPHandler", AbstractC3264qG.m(new StringBuilder(strValueOf.length() + 33 + String.valueOf(str2).length()), "Unexpected object class ", strValueOf, " for app ", str2));
                String str3 = this.zzb;
                throw new IOException(AbstractC3264qG.m(new StringBuilder(str.length() + 25 + String.valueOf(str3).length()), "Failed to store ", str, " for app ", str3));
            }
            editorPutInt = this.zzc.edit().putInt(str, ((Integer) obj).intValue());
        }
        if (editorPutInt.commit()) {
            return;
        }
        String str32 = this.zzb;
        throw new IOException(AbstractC3264qG.m(new StringBuilder(str.length() + 25 + String.valueOf(str32).length()), "Failed to store ", str, " for app ", str32));
    }

    public final String zzc(String str, String str2) {
        return this.zzc.getString(str, null);
    }

    public final long zzd(String str, long j) {
        return this.zzc.getLong(str, -1L);
    }

    public final boolean zze(String str, boolean z) {
        return this.zzc.getBoolean(str, true);
    }

    public final void zzf(String str) throws IOException {
        if (this.zzc.edit().remove(str).commit()) {
            return;
        }
        String str2 = this.zzb;
        throw new IOException(AbstractC3264qG.m(new StringBuilder(str.length() + 26 + String.valueOf(str2).length()), "Failed to remove ", str, " for app ", str2));
    }

    public final boolean zzg(String str) {
        return this.zzc.contains(str);
    }
}
