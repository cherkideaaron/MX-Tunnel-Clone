package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzbqb implements zzgyw {
    final /* synthetic */ zzbpt zza;

    public zzbqb(zzbqf zzbqfVar, zzbpt zzbptVar) {
        this.zza = zzbptVar;
        Objects.requireNonNull(zzbqfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* bridge */ /* synthetic */ As zza(Object obj) {
        zzcen zzcenVar = new zzcen();
        ((zzbpz) obj).zze(this.zza, new zzbqa(this, zzcenVar));
        return zzcenVar;
    }
}
