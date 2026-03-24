package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfpc extends zzibr implements zzidd {
    private static final zzfpc zzi;
    private static volatile zzidk zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    static {
        zzfpc zzfpcVar = new zzfpc();
        zzi = zzfpcVar;
        zzibr.zzbu(zzfpc.class, zzfpcVar);
    }

    private zzfpc() {
    }

    public static zzfpb zza() {
        return (zzfpb) zzi.zzbn();
    }

    public final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void zzc(long j) {
        this.zzb = j;
    }

    public final /* synthetic */ void zzd(long j) {
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    public final Object zzdc(zzibq zzibqVar, Object obj, Object obj2) {
        int iOrdinal = zzibqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzibr.zzbv(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iOrdinal == 3) {
            return new zzfpc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfpb(bArr);
        }
        if (iOrdinal == 5) {
            return zzi;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzidk zzibmVar = zzj;
        if (zzibmVar == null) {
            synchronized (zzfpc.class) {
                try {
                    zzibmVar = zzj;
                    if (zzibmVar == null) {
                        zzibmVar = new zzibm(zzi);
                        zzj = zzibmVar;
                    }
                } finally {
                }
            }
        }
        return zzibmVar;
    }

    public final /* synthetic */ void zze(boolean z) {
        this.zzd = z;
    }

    public final /* synthetic */ void zzg(long j) {
        this.zze = j;
    }

    public final /* synthetic */ void zzh(long j) {
        this.zzf = j;
    }

    public final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zzg = str;
    }

    public final /* synthetic */ void zzk(int i) {
        this.zzh = i - 2;
    }
}
