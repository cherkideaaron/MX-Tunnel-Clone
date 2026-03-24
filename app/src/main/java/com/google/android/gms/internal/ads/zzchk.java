package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzchk implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final boolean zza(zzcge zzcgeVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzchj zzchjVar = (zzchj) it.next();
            if (zzchjVar.zza == zzcgeVar) {
                arrayList.add(zzchjVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzchj) it2.next()).zzb.zzl();
        }
        return true;
    }

    public final zzchj zzb(zzcge zzcgeVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzchj zzchjVar = (zzchj) it.next();
            if (zzchjVar.zza == zzcgeVar) {
                return zzchjVar;
            }
        }
        return null;
    }

    public final void zzc(zzchj zzchjVar) {
        this.zza.add(zzchjVar);
    }

    public final void zzd(zzchj zzchjVar) {
        this.zza.remove(zzchjVar);
    }
}
