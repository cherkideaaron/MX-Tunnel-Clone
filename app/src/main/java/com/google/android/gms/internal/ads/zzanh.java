package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class zzanh {
    public static zzani zza(zzani zzaniVar, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (zzaniVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzani) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzani zzaniVar2 = new zzani();
                while (i < length2) {
                    zzaniVar2.zzr((zzani) map.get(strArr[i]));
                    i++;
                }
                return zzaniVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzaniVar.zzr((zzani) map.get(strArr[0]));
                return zzaniVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    zzaniVar.zzr((zzani) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return zzaniVar;
    }
}
