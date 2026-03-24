package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzfxa {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfxb zzc;
    private final zzfvh zzd;
    private final zzfvc zze;
    private final boolean zzf;
    private zzfwp zzg;
    private final Object zzh = new Object();

    public zzfxa(Context context, zzfxb zzfxbVar, zzfvh zzfvhVar, zzfvc zzfvcVar, boolean z) {
        this.zzb = context;
        this.zzc = zzfxbVar;
        this.zzd = zzfvhVar;
        this.zze = zzfvcVar;
        this.zzf = z;
    }

    private final synchronized Class zzd(zzfwq zzfwqVar) {
        try {
            if (zzfwqVar.zza() == null) {
                throw new zzfwz(4010, "mc");
            }
            String strZza = zzfwqVar.zza().zza();
            HashMap map = zza;
            Class cls = (Class) map.get(strZza);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.zze.zza(zzfwqVar.zzb())) {
                    throw new zzfwz(2026, "VM did not pass signature verification");
                }
                try {
                    File fileZzc = zzfwqVar.zzc();
                    if (!fileZzc.exists()) {
                        fileZzc.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(zzfwqVar.zzb().getAbsolutePath(), fileZzc.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strZza, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e) {
                    e = e;
                    throw new zzfwz(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    throw new zzfwz(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                } catch (SecurityException e3) {
                    e = e3;
                    throw new zzfwz(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                }
            } catch (GeneralSecurityException e4) {
                throw new zzfwz(2026, e4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean zza(zzfwq zzfwqVar) throws zzfwz {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfwp zzfwpVar = new zzfwp(zzd(zzfwqVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfwqVar.zzd(), null, new Bundle(), 2), zzfwqVar, this.zzc, this.zzd, this.zzf);
                if (!zzfwpVar.zzf()) {
                    throw new zzfwz(4000, "init failed");
                }
                int iZzh = zzfwpVar.zzh();
                if (iZzh != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzh).length() + 4);
                    sb.append("ci: ");
                    sb.append(iZzh);
                    throw new zzfwz(4001, sb.toString());
                }
                synchronized (this.zzh) {
                    zzfwp zzfwpVar2 = this.zzg;
                    if (zzfwpVar2 != null) {
                        try {
                            zzfwpVar2.zzg();
                        } catch (zzfwz e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                        this.zzg = zzfwpVar;
                    } else {
                        this.zzg = zzfwpVar;
                    }
                }
                this.zzd.zzb(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfwz(AdError.INTERNAL_ERROR_2004, e2);
            }
        } catch (zzfwz e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }

    public final zzfvk zzb() {
        zzfwp zzfwpVar;
        synchronized (this.zzh) {
            zzfwpVar = this.zzg;
        }
        return zzfwpVar;
    }

    public final zzfwq zzc() {
        synchronized (this.zzh) {
            try {
                zzfwp zzfwpVar = this.zzg;
                if (zzfwpVar == null) {
                    return null;
                }
                return zzfwpVar.zze();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
