package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzidq extends zziag {
    final zzids zza;
    zziai zzb;
    final /* synthetic */ zzidt zzc;

    public zzidq(zzidt zzidtVar) {
        Objects.requireNonNull(zzidtVar);
        this.zzc = zzidtVar;
        this.zza = new zzids(zzidtVar, null);
        this.zzb = zzb();
    }

    private final zziai zzb() {
        zzids zzidsVar = this.zza;
        if (zzidsVar.hasNext()) {
            return zzidsVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zziai
    public final byte zza() {
        zziai zziaiVar = this.zzb;
        if (zziaiVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zziaiVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}
