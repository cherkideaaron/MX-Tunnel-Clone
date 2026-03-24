package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzics implements zzida {
    private final zzida[] zza;

    public zzics(zzida... zzidaVarArr) {
        this.zza = zzidaVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final boolean zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final zzicz zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzida zzidaVar = this.zza[i];
            if (zzidaVar.zzb(cls)) {
                return zzidaVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
