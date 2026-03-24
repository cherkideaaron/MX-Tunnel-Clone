package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzhit {
    final Map zza = new HashMap();
    final Map zzb = new HashMap();

    private zzhit() {
    }

    public final zzhit zza(Enum r2, Object obj) {
        this.zza.put(r2, obj);
        this.zzb.put(obj, r2);
        return this;
    }

    public final zzhiu zzb() {
        return new zzhiu(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }

    public /* synthetic */ zzhit(byte[] bArr) {
    }
}
