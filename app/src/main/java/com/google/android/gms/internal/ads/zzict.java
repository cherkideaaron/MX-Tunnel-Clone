package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzict implements zzidv {
    private static final zzida zzb = new zzicr();
    private final zzida zza;

    public zzict() {
        zzibk zzibkVarZza = zzibk.zza();
        int i = zziaa.zza;
        zzics zzicsVar = new zzics(zzibkVarZza, zzb);
        byte[] bArr = zzice.zzb;
        this.zza = zzicsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzidv
    public final zzidu zza(Class cls) {
        int i = zzidw.zza;
        if (!zzibr.class.isAssignableFrom(cls)) {
            int i2 = zziaa.zza;
        }
        zzicz zziczVarZzc = this.zza.zzc(cls);
        if (zziczVarZzc.zza()) {
            int i3 = zziaa.zza;
            return zzidg.zzh(zzidw.zzF(), zzibe.zza(), zziczVarZzc.zzb());
        }
        int i4 = zziaa.zza;
        return zzidf.zzm(cls, zziczVarZzc, zzidj.zza(), zzicp.zza(), zzidw.zzF(), zziczVarZzc.zzc() + (-1) != 1 ? zzibe.zza() : null, zzicy.zza());
    }
}
