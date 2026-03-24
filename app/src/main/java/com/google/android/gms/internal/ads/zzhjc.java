package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;
import defpackage.Vs;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zzhjc {
    private static final Logger zza = Logger.getLogger(zzhjc.class.getName());
    private static final zzhjc zzd = new zzhjc();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    public static zzhjc zza() {
        return zzd;
    }

    private final synchronized zzhba zzg(String str) {
        ConcurrentMap concurrentMap;
        concurrentMap = this.zzb;
        if (!concurrentMap.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb.toString());
        }
        return (zzhba) concurrentMap.get(str);
    }

    private final synchronized void zzh(zzhba zzhbaVar, boolean z, boolean z2) {
        try {
            String strZzb = zzhbaVar.zzb();
            if (z2) {
                ConcurrentMap concurrentMap = this.zzc;
                if (concurrentMap.containsKey(strZzb) && !((Boolean) concurrentMap.get(strZzb)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(strZzb));
                }
            }
            ConcurrentMap concurrentMap2 = this.zzb;
            zzhba zzhbaVar2 = (zzhba) concurrentMap2.get(strZzb);
            if (zzhbaVar2 != null && !zzhbaVar2.getClass().equals(zzhbaVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(strZzb));
                throw new GeneralSecurityException("typeUrl (" + strZzb + ") is already registered with " + zzhbaVar2.getClass().getName() + ", cannot be re-registered with " + zzhbaVar.getClass().getName());
            }
            concurrentMap2.putIfAbsent(strZzb, zzhbaVar);
            this.zzc.put(strZzb, Boolean.valueOf(z2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(zzhba zzhbaVar, boolean z) {
        zzf(zzhbaVar, 1, z);
    }

    public final zzhba zzc(String str, Class cls) throws GeneralSecurityException {
        zzhba zzhbaVarZzg = zzg(str);
        if (zzhbaVarZzg.zzc().equals(cls)) {
            return zzhbaVarZzg;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzhbaVarZzg.getClass());
        String string = zzhbaVarZzg.zzc().toString();
        StringBuilder sb = new StringBuilder(Vs.f(name.length() + 53, 23, strValueOf) + string.length());
        AbstractC3264qG.v(sb, "Primitive type ", name, " not supported by key manager of type ", strValueOf);
        throw new GeneralSecurityException(AbstractC3264qG.l(sb, ", which only supports: ", string));
    }

    public final zzhba zzd(String str) {
        return zzg(str);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzc.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzhba zzhbaVar, int i, boolean z) {
        if (!zzhid.zza(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzhbaVar, false, z);
    }
}
