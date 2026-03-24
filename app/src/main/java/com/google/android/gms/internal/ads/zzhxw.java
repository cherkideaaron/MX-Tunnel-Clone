package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* loaded from: classes.dex */
public final class zzhxw implements zzhbs {
    static final zzhiu zza;
    private static final byte[] zzb = new byte[0];
    private static final byte[] zzc = {0};

    static {
        zzhit zzhitVarZza = zzhiu.zza();
        zzhitVarZza.zza(zzhxn.SHA256, zzhtw.zza);
        zzhitVarZza.zza(zzhxn.SHA384, zzhtw.zzb);
        zzhitVarZza.zza(zzhxn.SHA512, zzhtw.zzc);
        zza = zzhitVarZza.zzb();
    }

    public static zzhbs zzb(zzhuc zzhucVar) {
        try {
            return zzhvz.zzd(zzhucVar);
        } catch (NoSuchProviderException unused) {
            return new zzhxv((RSAPublicKey) ((KeyFactory) zzhxe.zzf.zzb("RSA")).generatePublic(new RSAPublicKeySpec(zzhucVar.zzd(), zzhucVar.zzf().zzd())), (zzhxn) zza.zzb(zzhucVar.zzf().zzf()), zzhucVar.zze().zzc(), zzhucVar.zzf().zze().equals(zzhtx.zzc) ? zzc : zzb, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
