package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhpg extends zzibr implements zzidd {
    private static final zzhpg zzd;
    private static volatile zzidk zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhpg zzhpgVar = new zzhpg();
        zzd = zzhpgVar;
        zzibr.zzbu(zzhpg.class, zzhpgVar);
    }

    private zzhpg() {
    }

    public static zzhpf zzb() {
        return (zzhpf) zzd.zzbn();
    }

    public static zzhpg zzc() {
        return zzd;
    }

    public final zzhpt zza() {
        zzhpt zzhptVarZzb = zzhpt.zzb(this.zza);
        return zzhptVarZzb == null ? zzhpt.UNRECOGNIZED : zzhptVarZzb;
    }

    public final /* synthetic */ void zzd(zzhpt zzhptVar) {
        this.zza = zzhptVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhpg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhpf(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zze;
        if (zzibmVar == null) {
            synchronized (zzhpg.class) {
                try {
                    zzibmVar = zze;
                    if (zzibmVar == null) {
                        zzibmVar = new zzibm(zzd);
                        zze = zzibmVar;
                    }
                } finally {
                }
            }
        }
        return zzibmVar;
    }

    public final int zzg() {
        int i = this.zzb;
        int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzh() {
        int i = this.zzc;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final /* synthetic */ void zzi(int i) {
        this.zzb = zzhps.zza(i);
    }

    public final /* synthetic */ void zzj(int i) {
        this.zzc = zzhpl.zza(i);
    }
}
