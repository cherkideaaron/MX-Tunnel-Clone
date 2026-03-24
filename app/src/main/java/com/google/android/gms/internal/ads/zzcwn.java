package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzcwn implements zzens {
    public final List zza;

    public zzcwn(zzcwf zzcwfVar) {
        this.zza = Collections.singletonList(zzgzo.zza(zzcwfVar));
    }

    public static zzekg zza(zzemm zzemmVar) {
        return new zzekh(zzemmVar, zzcwm.zza);
    }

    public static zzekg zzb(zzekg zzekgVar) {
        return new zzekh(zzekgVar, zzcwl.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzens
    public final void zzm() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgzo.zzr((As) it.next(), new zzcwk(this), zzhaf.zza());
        }
    }

    public zzcwn(List list) {
        this.zza = list;
    }
}
