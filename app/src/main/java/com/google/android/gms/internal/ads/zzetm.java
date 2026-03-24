package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzetm implements zzfax {
    private final Set zza;

    public zzetm(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final As zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzgzo.zza(new zzetl(arrayList, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 8;
    }
}
