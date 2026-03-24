package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbbj extends zzbby {
    private final zzazn zzh;
    private final long zzi;
    private final long zzj;

    public zzbbj(zzbak zzbakVar, String str, String str2, zzawg zzawgVar, int i, int i2, zzazn zzaznVar, long j, long j2) {
        super(zzbakVar, "MHYgRB9ZLJ711MlDBgDgyPDdkDVVlHwuqDeF/1i1ByNixJnhURH1lj12DYAv6vPJ", "+dsC4zlVzClLb/gffysp/RM/1OAwcqKcuzzXTv3qmQk=", zzawgVar, i, 11);
        this.zzh = zzaznVar;
        this.zzi = j;
        this.zzj = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzbby
    public final void zza() {
        zzazn zzaznVar = this.zzh;
        if (zzaznVar != null) {
            zzazl zzazlVar = new zzazl((String) this.zze.invoke(null, zzaznVar.zzb(), Long.valueOf(this.zzi), Long.valueOf(this.zzj)));
            zzawg zzawgVar = this.zzd;
            synchronized (zzawgVar) {
                try {
                    zzawgVar.zzf(zzazlVar.zza.longValue());
                    if (zzazlVar.zzb.longValue() >= 0) {
                        zzawgVar.zzW(zzazlVar.zzb.longValue());
                    }
                    if (zzazlVar.zzc.longValue() >= 0) {
                        zzawgVar.zzX(zzazlVar.zzc.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
