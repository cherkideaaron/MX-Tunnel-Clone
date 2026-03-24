package com.google.android.gms.internal.ads;

import defpackage.AbstractC3264qG;
import defpackage.As;
import defpackage.Vs;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
abstract class zzgyn extends zzgzf implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    As zza;
    Object zzb;

    public zzgyn(As as, Object obj) {
        as.getClass();
        this.zza = as;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        As as = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (as == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (as.isCancelled()) {
            zzk(as);
            return;
        }
        try {
            try {
                Object objZzf = zzf(obj, zzgzo.zzs(as));
                this.zzb = null;
                zze(objZzf);
            } catch (Throwable th) {
                try {
                    zzhag.zza(th);
                    zzb(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e) {
            zzb(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            zzb(e2.getCause());
        } catch (Exception e3) {
            zzb(e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String zzd() {
        String strO;
        As as = this.zza;
        Object obj = this.zzb;
        String strZzd = super.zzd();
        if (as != null) {
            String string = as.toString();
            strO = Vs.o(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strO = "";
        }
        if (obj == null) {
            if (strZzd != null) {
                return strO.concat(strZzd);
            }
            return null;
        }
        int length = strO.length();
        String string2 = obj.toString();
        return AbstractC3264qG.m(new StringBuilder(string2.length() + length + 10 + 1), strO, "function=[", string2, "]");
    }

    public abstract void zze(Object obj);

    public abstract Object zzf(Object obj, Object obj2);
}
