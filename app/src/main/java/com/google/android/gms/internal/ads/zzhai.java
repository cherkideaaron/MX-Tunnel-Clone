package com.google.android.gms.internal.ads;

import defpackage.As;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzhai implements Runnable {
    zzhak zza;

    public zzhai(zzhak zzhakVar) {
        this.zza = zzhakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        As asZzf;
        zzhak zzhakVar = this.zza;
        if (zzhakVar == null || (asZzf = zzhakVar.zzf()) == null) {
            return;
        }
        this.zza = null;
        if (asZzf.isDone()) {
            zzhakVar.zzk(asZzf);
            return;
        }
        try {
            ScheduledFuture scheduledFutureZzx = zzhakVar.zzx();
            zzhakVar.zzy(null);
            String string = "Timed out";
            if (scheduledFutureZzx != null) {
                try {
                    long jAbs = Math.abs(scheduledFutureZzx.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        StringBuilder sb = new StringBuilder(String.valueOf(jAbs).length() + 55);
                        sb.append("Timed out (timeout delayed by ");
                        sb.append(jAbs);
                        sb.append(" ms after scheduled time)");
                        string = sb.toString();
                    }
                } catch (Throwable th) {
                    zzhakVar.zzb(new zzhaj(string, null));
                    throw th;
                }
            }
            String string2 = asZzf.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 2 + string2.length());
            sb2.append(string);
            sb2.append(": ");
            sb2.append(string2);
            zzhakVar.zzb(new zzhaj(sb2.toString(), null));
        } finally {
            asZzf.cancel(true);
        }
    }
}
