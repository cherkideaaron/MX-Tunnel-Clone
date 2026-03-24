package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzco {
    private static final zzdf zza = zzdf.zzk("UMP_CoMoAdStoragePurposeConsentStatus", "UMP_CoMoAdUserDataPurposeConsentStatus", "UMP_CoMoAdPersonalizationPurposeConsentStatus", "UMP_CoMoAnalyticsStoragePurposeConsentStatus", "IABTCF_gdprApplies");
    private final Context zzc;
    private final Map zzb = new HashMap();
    private final Map zzd = new HashMap();

    public zzco(Context context) {
        this.zzc = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences.Editor zzf(String str) {
        Map map = this.zzd;
        if (!map.containsKey(str)) {
            map.put(str, this.zzc.getSharedPreferences(str, 0).edit());
        }
        return (SharedPreferences.Editor) map.get(str);
    }

    public final Map zzb() {
        return this.zzb;
    }

    public final void zzc() {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((SharedPreferences.Editor) it.next()).commit();
        }
    }

    public final void zzd() {
        this.zzb.clear();
    }

    public final boolean zze(String str, Object obj) {
        String str2;
        float fFloatValue;
        zzcn zzcnVarZza = zzcp.zza(this.zzc, str);
        if (zzcnVarZza == null) {
            return false;
        }
        SharedPreferences.Editor editorZzf = zzf(zzcnVarZza.zza);
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            String str3 = zzcnVarZza.zzb;
            editorZzf.putInt(str3, num.intValue());
            if (!zza.contains(str3)) {
                return true;
            }
            this.zzb.put(str3, num);
            return true;
        }
        if (obj instanceof Long) {
            editorZzf.putLong(zzcnVarZza.zzb, ((Long) obj).longValue());
            return true;
        }
        if (obj instanceof Double) {
            str2 = zzcnVarZza.zzb;
            fFloatValue = ((Double) obj).floatValue();
        } else {
            if (!(obj instanceof Float)) {
                if (obj instanceof Boolean) {
                    editorZzf.putBoolean(zzcnVarZza.zzb, ((Boolean) obj).booleanValue());
                    return true;
                }
                if (!(obj instanceof String)) {
                    return false;
                }
                editorZzf.putString(zzcnVarZza.zzb, (String) obj);
                return true;
            }
            str2 = zzcnVarZza.zzb;
            fFloatValue = ((Float) obj).floatValue();
        }
        editorZzf.putFloat(str2, fFloatValue);
        return true;
    }
}
