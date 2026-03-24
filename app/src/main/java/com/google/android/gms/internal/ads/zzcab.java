package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class zzcab {
    private final WeakHashMap zza = new WeakHashMap();

    public final Future zza(Context context) {
        return zzcei.zza.zzc(new zzbzz(this, context));
    }

    public final /* synthetic */ WeakHashMap zzb() {
        return this.zza;
    }
}
