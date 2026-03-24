package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zzico {
    public static final List zza(Object obj, long j) {
        zzicd zzicdVar = (zzicd) zziem.zzn(obj, j);
        if (zzicdVar.zza()) {
            return zzicdVar;
        }
        int size = zzicdVar.size();
        zzicd zzicdVarZzh = zzicdVar.zzh(size == 0 ? 10 : size + size);
        zziem.zzo(obj, j, zzicdVarZzh);
        return zzicdVarZzh;
    }
}
