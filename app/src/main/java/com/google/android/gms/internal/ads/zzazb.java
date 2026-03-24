package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public final class zzazb {
    protected volatile Boolean zzb;
    private final zzbak zzc;
    private static final ConditionVariable zzd = new ConditionVariable();
    protected static volatile zzfxd zza = null;
    private static volatile Random zze = null;

    public zzazb(zzbak zzbakVar) {
        this.zzc = zzbakVar;
        zzbakVar.zzd().execute(new zzaza(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zze == null) {
                synchronized (zzazb.class) {
                    try {
                        if (zze == null) {
                            zze = new Random();
                        }
                    } finally {
                    }
                }
            }
            return zze.nextInt();
        }
    }

    public final void zza(int i, int i2, long j, String str, Exception exc) {
        try {
            zzd.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzavm zzavmVarZza = zzavq.zza();
            zzavmVarZza.zza(this.zzc.zza.getPackageName());
            zzavmVarZza.zzb(j);
            if (str != null) {
                zzavmVarZza.zze(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzavmVarZza.zzc(stringWriter.toString());
                zzavmVarZza.zzd(exc.getClass().getName());
            }
            zzfxc zzfxcVarZza = zza.zza(((zzavq) zzavmVarZza.zzbu()).zzaN());
            zzfxcVarZza.zzc(i);
            if (i2 != -1) {
                zzfxcVarZza.zzb(i2);
            }
            zzfxcVarZza.zza();
        } catch (Exception unused) {
        }
    }

    public final /* synthetic */ zzbak zzb() {
        return this.zzc;
    }
}
