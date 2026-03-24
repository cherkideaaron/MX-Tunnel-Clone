package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import defpackage.AbstractC3264qG;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzahx {
    public static long zza(String str) {
        zzahw zzahwVarZzb = zzb(str);
        return zzahwVarZzb.zza().longValue() - zzahwVarZzb.zzb().longValue();
    }

    private static zzahw zzb(String str) {
        Preconditions.checkNotEmpty(str);
        List<String> listZza = zzt.zza('.').zza((CharSequence) str);
        if (listZza.size() < 2) {
            throw new RuntimeException(AbstractC3264qG.w("Invalid idToken ", str));
        }
        try {
            return zzahw.zza(new String(Base64Utils.decodeUrlSafeNoPadding(listZza.get(1)), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Unable to decode token", e);
        }
    }
}
