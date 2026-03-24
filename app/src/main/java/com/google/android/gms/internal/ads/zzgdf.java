package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class zzgdf {
    private final zzika zza;
    private final zzika zzb;
    private final ExecutorService zzc;
    private final zzika zzd;
    private As zze = null;

    public zzgdf(zzika zzikaVar, zzika zzikaVar2, ExecutorService executorService, zzika zzikaVar3) {
        this.zza = zzikaVar;
        this.zzb = zzikaVar2;
        this.zzc = executorService;
        this.zzd = zzikaVar3;
    }

    public final synchronized As zza() {
        try {
            As as = this.zze;
            if (as != null) {
                return as;
            }
            Set set = (Set) this.zzb.zzb();
            ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzgdd) it.next()).zza());
            }
            zzgoe zzgoeVar = (zzgoe) this.zzd.zzb();
            As asZzk = zzgzo.zzk(zzgzo.zzm(arrayList), zzgde.zza, this.zzc);
            zzgoeVar.zze(2, asZzk);
            this.zze = asZzk;
            Iterator it2 = ((Set) this.zza.zzb()).iterator();
            while (it2.hasNext()) {
                ((zzgdd) it2.next()).zza();
            }
            As as2 = this.zze;
            as2.getClass();
            return as2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized As zzb() {
        As as;
        as = this.zze;
        as.getClass();
        return as;
    }
}
