package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class zzggq extends zzghb {
    private static volatile Long zza;
    private static final Object zzb = new Object();

    public zzggq(zzawg zzawgVar, zzgfx zzgfxVar, zzgoe zzgoeVar) {
        super("3oTRZjKQOSoYyvNcYQSsDbCCM8OIxNI6HsD2yraLy7cjC5n8lPLLp8aPMOPQzMR5", "MHRGFnzrWite6OUEzeDGE6xEKTeZ1rlshMbJC9yXOH8=", zzawgVar, zzgfxVar, zzgoeVar.zza(117));
    }

    @Override // com.google.android.gms.internal.ads.zzghb
    public final void zza(Method method, zzawg zzawgVar) {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        Long l = (Long) method.invoke("", null);
                        l.getClass();
                        zza = l;
                    }
                } finally {
                }
            }
        }
        synchronized (zzawgVar) {
            try {
                if (zza != null) {
                    zzawgVar.zzm(zza.longValue());
                }
            } finally {
            }
        }
    }
}
