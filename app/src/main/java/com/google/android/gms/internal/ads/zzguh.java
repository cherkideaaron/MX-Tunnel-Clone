package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzguh {
    Object[] zza;
    int zzb;
    zzgug zzc;

    public zzguh() {
        this(4);
    }

    private final void zze(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzgua.zze(length, i2));
        }
    }

    private final zzgui zzf(boolean z) {
        zzgug zzgugVar;
        zzgug zzgugVar2;
        if (z && (zzgugVar2 = this.zzc) != null) {
            throw zzgugVar2.zza();
        }
        zzgwf zzgwfVarZzk = zzgwf.zzk(this.zzb, this.zza, this);
        if (!z || (zzgugVar = this.zzc) == null) {
            return zzgwfVarZzk;
        }
        throw zzgugVar.zza();
    }

    public final zzguh zza(Object obj, Object obj2) {
        zze(this.zzb + 1);
        zzgtb.zza(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    public final zzguh zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zze(((Collection) iterable).size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzgui zzc() {
        return zzf(true);
    }

    public final zzgui zzd() {
        return zzf(false);
    }

    public zzguh(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}
