package com.google.android.gms.internal.auth;

/* loaded from: classes.dex */
final class zzfo implements zzgi {
    private static final zzfu zza = new zzfm();
    private final zzfu zzb;

    public zzfo() {
        zzfu zzfuVar;
        zzer zzerVarZza = zzer.zza();
        try {
            zzfuVar = (zzfu) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzfuVar = zza;
        }
        zzfn zzfnVar = new zzfn(zzerVarZza, zzfuVar);
        zzez.zzf(zzfnVar, "messageInfoFactory");
        this.zzb = zzfnVar;
    }

    private static boolean zzb(zzft zzftVar) {
        return zzftVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final zzgh zza(Class cls) {
        zzgb zzgbVarZza;
        zzfk zzfkVarZzc;
        zzgy zzgyVarZzb;
        zzel zzelVarZza;
        zzfr zzfrVarZza;
        zzgy zzgyVarZza;
        zzel zzelVarZza2;
        zzgj.zzg(cls);
        zzft zzftVarZzb = this.zzb.zzb(cls);
        if (zzftVarZzb.zzb()) {
            if (zzeu.class.isAssignableFrom(cls)) {
                zzgyVarZza = zzgj.zzc();
                zzelVarZza2 = zzen.zzb();
            } else {
                zzgyVarZza = zzgj.zza();
                zzelVarZza2 = zzen.zza();
            }
            return zzga.zzb(zzgyVarZza, zzelVarZza2, zzftVarZzb.zza());
        }
        if (zzeu.class.isAssignableFrom(cls)) {
            boolean zZzb = zzb(zzftVarZzb);
            zzgbVarZza = zzgc.zzb();
            zzfkVarZzc = zzfk.zzd();
            zzgyVarZzb = zzgj.zzc();
            zzelVarZza = zZzb ? zzen.zzb() : null;
            zzfrVarZza = zzfs.zzb();
        } else {
            boolean zZzb2 = zzb(zzftVarZzb);
            zzgbVarZza = zzgc.zza();
            zzfkVarZzc = zzfk.zzc();
            if (zZzb2) {
                zzgyVarZzb = zzgj.zza();
                zzelVarZza = zzen.zza();
            } else {
                zzgyVarZzb = zzgj.zzb();
                zzelVarZza = null;
            }
            zzfrVarZza = zzfs.zza();
        }
        return zzfz.zzj(cls, zzftVarZzb, zzgbVarZza, zzfkVarZzc, zzgyVarZzb, zzelVarZza, zzfrVarZza);
    }
}
