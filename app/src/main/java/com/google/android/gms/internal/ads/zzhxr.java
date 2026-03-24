package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzhxr implements zzhnp {
    public static zzhnp zzb(zzhnn zzhnnVar) {
        zzhnp zzhnpVarZzb = zzhnt.zzb(zzhnnVar);
        try {
            return new zzhxq(zzhnpVarZzb, zzhnu.zzb(zzhnnVar), null);
        } catch (GeneralSecurityException unused) {
            return zzhnpVarZzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhnp
    public final byte[] zza(byte[] bArr, int i) {
        throw null;
    }
}
