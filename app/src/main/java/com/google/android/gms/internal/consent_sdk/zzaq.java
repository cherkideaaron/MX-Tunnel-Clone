package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import defpackage.EnumC0082Eb;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzaq {
    static final zzdf zza = zzdf.zzj("IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    private final Application zzb;
    private final SharedPreferences zzc;
    private final Set zzd;

    public zzaq(Application application) {
        this.zzb = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.zzc = sharedPreferences;
        this.zzd = new HashSet(sharedPreferences.getStringSet("written_values", Collections.emptySet()));
    }

    public final int zza() {
        return this.zzc.getInt("consent_status", 0);
    }

    public final EnumC0082Eb zzb() {
        return EnumC0082Eb.valueOf(this.zzc.getString("privacy_options_requirement_status", "UNKNOWN"));
    }

    public final Map zzc() {
        String strValueOf;
        String str;
        String string;
        Set<String> stringSet = this.zzc.getStringSet("stored_info", zzdf.zzi());
        if (stringSet.isEmpty()) {
            stringSet = zza;
        }
        HashMap map = new HashMap();
        for (String str2 : stringSet) {
            Application application = this.zzb;
            zzcn zzcnVarZza = zzcp.zza(application, str2);
            if (zzcnVarZza == null) {
                strValueOf = String.valueOf(str2);
                str = "Fetching request info: failed for key: ";
            } else {
                Object obj = application.getSharedPreferences(zzcnVarZza.zza, 0).getAll().get(zzcnVarZza.zzb);
                if (obj == null) {
                    strValueOf = String.valueOf(str2);
                    str = "Stored info not exists: ";
                } else {
                    if (obj instanceof Boolean) {
                        string = true != ((Boolean) obj).booleanValue() ? "0" : "1";
                    } else if (obj instanceof Number) {
                        string = obj.toString();
                    } else if (obj instanceof String) {
                        string = (String) obj;
                    } else {
                        strValueOf = String.valueOf(str2);
                        str = "Failed to fetch stored info: ";
                    }
                    map.put(str2, string);
                }
            }
            Log.d("UserMessagingPlatform", str.concat(strValueOf));
        }
        return map;
    }

    public final Set zzd() {
        return this.zzd;
    }

    public final void zze() {
        Application application = this.zzb;
        Set set = this.zzd;
        zzcp.zzb(application, set);
        set.clear();
        this.zzc.edit().remove("stored_info").remove("consent_status").remove("consent_type").remove("privacy_options_requirement_status").remove("is_pub_misconfigured").remove("written_values").commit();
    }

    public final void zzf() {
        this.zzc.edit().putStringSet("written_values", this.zzd).commit();
    }

    public final void zzg(int i) {
        this.zzc.edit().putInt("consent_status", i).commit();
    }

    public final void zzh(boolean z) {
        this.zzc.edit().putBoolean("is_pub_misconfigured", z).commit();
    }

    public final void zzi(EnumC0082Eb enumC0082Eb) {
        this.zzc.edit().putString("privacy_options_requirement_status", enumC0082Eb.name()).commit();
    }

    public final void zzj(Set set) {
        this.zzc.edit().putStringSet("stored_info", set).commit();
    }

    public final boolean zzk() {
        return this.zzc.getBoolean("is_pub_misconfigured", false);
    }
}
