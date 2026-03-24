package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhbu {
    public static zzhbk zza(String str) throws GeneralSecurityException {
        try {
            try {
                try {
                    zzhql zzhqlVarZze = zzhql.zze(zzhay.zza(str).zzb().zzaN(), zzibb.zza());
                    for (zzhqk zzhqkVar : zzhqlVarZze.zzb()) {
                        if (zzhqkVar.zzb().zzc() == zzhqb.UNKNOWN_KEYMATERIAL || zzhqkVar.zzb().zzc() == zzhqb.SYMMETRIC || zzhqkVar.zzb().zzc() == zzhqb.ASYMMETRIC_PRIVATE) {
                            throw new GeneralSecurityException("keyset contains key material of type " + zzhqkVar.zzb().zzc().name() + " for type url " + zzhqkVar.zzb().zza());
                        }
                    }
                    return zzhbk.zza(zzhqlVarZze);
                } catch (zzicg unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (zzicg unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }
}
