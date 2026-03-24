package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class zzhbn {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzhbm zza(String str) throws GeneralSecurityException {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzhbm zzhbmVar = (zzhbm) it.next();
            if (zzhbmVar.zza()) {
                return zzhbmVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
