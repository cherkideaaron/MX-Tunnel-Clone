package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
final class zzgvp extends zzgvt {
    final /* synthetic */ Comparator zza;

    public zzgvp(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final Map zza() {
        return new TreeMap(this.zza);
    }
}
