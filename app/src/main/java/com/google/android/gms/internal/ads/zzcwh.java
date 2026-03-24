package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzcwh implements zzcwi {
    private final Map zza;

    public zzcwh(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final zzekg zza(int i, String str) {
        return (zzekg) this.zza.get(str);
    }
}
