package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzhxu implements zzhbo {
    private static final byte[] zza = {0};
    private final zzhnp zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzhxu(zzhlp zzhlpVar) {
        this.zzb = zzhxr.zzb(zzhnn.zzc(zzhno.zzb(zzhlpVar.zzf().zzc()), zzhlpVar.zzd()));
        this.zzc = zzhlpVar.zzf().zzd();
        this.zzd = zzhlpVar.zze().zzc();
        if (zzhlpVar.zzf().zzf().equals(zzhlv.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzhbo zza(zzhlp zzhlpVar) {
        return new zzhxu(zzhlpVar);
    }

    public static zzhbo zzb(zzhmb zzhmbVar) {
        return new zzhxu(zzhmbVar);
    }

    public final byte[] zzc(byte[] bArr) {
        byte[] bArr2 = this.zze;
        return bArr2.length > 0 ? zzhwr.zza(this.zzd, this.zzb.zza(zzhwr.zza(bArr, bArr2), this.zzc)) : zzhwr.zza(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzhxu(zzhmb zzhmbVar) {
        String strValueOf = String.valueOf(zzhmbVar.zzf().zzg());
        this.zzb = new zzhxt("HMAC".concat(strValueOf), new SecretKeySpec(zzhmbVar.zzd().zzc(zzhax.zza()), "HMAC"));
        this.zzc = zzhmbVar.zzf().zzd();
        this.zzd = zzhmbVar.zze().zzc();
        if (zzhmbVar.zzf().zzf().equals(zzhmj.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzhxu(zzhnp zzhnpVar, int i) {
        this.zzb = zzhnpVar;
        this.zzc = i;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzhnpVar.zza(new byte[0], i);
    }
}
