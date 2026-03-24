package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class zzhql extends zzibr implements zzidd {
    private static final zzhql zzc;
    private static volatile zzidk zzd;
    private int zza;
    private zzicd zzb = zzibr.zzbM();

    static {
        zzhql zzhqlVar = new zzhql();
        zzc = zzhqlVar;
        zzibr.zzbu(zzhql.class, zzhqlVar);
    }

    private zzhql() {
    }

    public static zzhql zze(byte[] bArr, zzibb zzibbVar) {
        return (zzhql) zzibr.zzbV(zzc, bArr, zzibbVar);
    }

    public static zzhql zzg(InputStream inputStream, zzibb zzibbVar) {
        return (zzhql) zzibr.zzbX(zzc, inputStream, zzibbVar);
    }

    public static zzhqi zzh() {
        return (zzhqi) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final List zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    public final zzhqk zzd(int i) {
        return (zzhqk) this.zzb.get(i);
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhqk.class});
        }
        if (iOrdinal == 3) {
            return new zzhql();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhqi(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zzd;
        if (zzibmVar == null) {
            synchronized (zzhql.class) {
                try {
                    zzibmVar = zzd;
                    if (zzibmVar == null) {
                        zzibmVar = new zzibm(zzc);
                        zzd = zzibmVar;
                    }
                } finally {
                }
            }
        }
        return zzibmVar;
    }

    public final /* synthetic */ void zzi(int i) {
        this.zza = i;
    }

    public final /* synthetic */ void zzj(zzhqk zzhqkVar) {
        zzhqkVar.getClass();
        zzicd zzicdVar = this.zzb;
        if (!zzicdVar.zza()) {
            this.zzb = zzibr.zzbN(zzicdVar);
        }
        this.zzb.add(zzhqkVar);
    }
}
