package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final /* synthetic */ class zzdro implements zzgqt {
    static final /* synthetic */ zzdro zza = new zzdro();

    private /* synthetic */ zzdro() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzbkd zzbkdVar : (List) obj) {
            if (zzbkdVar != null) {
                arrayList.add(zzbkdVar);
            }
        }
        return arrayList;
    }
}
