package com.google.android.gms.internal.auth;

/* loaded from: classes.dex */
final class zzfi extends zzfk {
    private zzfi() {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfk
    public final void zza(Object obj, long j) {
        ((zzey) zzhi.zzf(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.auth.zzfk
    public final void zzb(Object obj, Object obj2, long j) {
        zzey zzeyVarZzd = (zzey) zzhi.zzf(obj, j);
        zzey zzeyVar = (zzey) zzhi.zzf(obj2, j);
        int size = zzeyVarZzd.size();
        int size2 = zzeyVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzeyVarZzd.zzc()) {
                zzeyVarZzd = zzeyVarZzd.zzd(size2 + size);
            }
            zzeyVarZzd.addAll(zzeyVar);
        }
        if (size > 0) {
            zzeyVar = zzeyVarZzd;
        }
        zzhi.zzp(obj, j, zzeyVar);
    }

    public /* synthetic */ zzfi(zzfh zzfhVar) {
        super(null);
    }
}
