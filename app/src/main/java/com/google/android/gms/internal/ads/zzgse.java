package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class zzgse extends zzgsv implements zzgva {
    public zzgse(Map map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    public final Collection zza(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    public final Collection zzb(Object obj, Collection collection) {
        return zzg(obj, (List) collection, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    public /* bridge */ /* synthetic */ Collection zzc() {
        throw null;
    }
}
