package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Objects;
import javax.crypto.Mac;

/* loaded from: classes.dex */
final class zzhxs extends ThreadLocal {
    final /* synthetic */ zzhxt zza;

    public zzhxs(zzhxt zzhxtVar) {
        Objects.requireNonNull(zzhxtVar);
        this.zza = zzhxtVar;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() throws InvalidKeyException {
        try {
            zzhxe zzhxeVar = zzhxe.zzb;
            zzhxt zzhxtVar = this.zza;
            Mac mac = (Mac) zzhxeVar.zzb(zzhxtVar.zzb());
            mac.init(zzhxtVar.zzc());
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
