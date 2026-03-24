package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.Vs;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zziw extends zzau {
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final zzv zzf;
    public final int zzg;
    public final zzwk zzh;
    final boolean zzi;

    private zziw(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, null, false);
    }

    public static zziw zza(IOException iOException, int i) {
        return new zziw(0, iOException, i);
    }

    public static zziw zzb(Throwable th, String str, int i, zzv zzvVar, int i2, zzwk zzwkVar, boolean z, int i3) {
        return new zziw(1, th, null, i3, str, i, zzvVar, zzvVar == null ? 4 : i2, zzwkVar, z);
    }

    public static zziw zzc(RuntimeException runtimeException, int i) {
        return new zziw(2, runtimeException, i);
    }

    public final zziw zzd(zzwk zzwkVar) {
        String message = getMessage();
        String str = zzfj.zza;
        return new zziw(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzwkVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zziw(int i, Throwable th, String str, int i2, String str2, int i3, zzv zzvVar, int i4, zzwk zzwkVar, boolean z) {
        String strO;
        String str3;
        if (i == 0) {
            strO = "Source error";
        } else if (i != 1) {
            strO = "Unexpected runtime error";
        } else {
            String strValueOf = String.valueOf(zzvVar);
            String str4 = zzfj.zza;
            if (i4 == 0) {
                str3 = "NO";
            } else if (i4 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                str3 = "YES";
            }
            StringBuilder sb = new StringBuilder(str3.length() + strValueOf.length() + Vs.f(String.valueOf(str2).length() + 14, 9, String.valueOf(i3)) + 19);
            sb.append(str2);
            sb.append(" error, index=");
            sb.append(i3);
            sb.append(", format=");
            strO = Vs.o(sb, strValueOf, ", format_supported=", str3);
        }
        this(TextUtils.isEmpty(null) ? strO : strO.concat(": null"), th, i2, i, str2, i3, zzvVar, i4, zzwkVar, SystemClock.elapsedRealtime(), z);
    }

    private zziw(String str, Throwable th, int i, int i2, String str2, int i3, zzv zzvVar, int i4, zzwk zzwkVar, long j, boolean z) {
        boolean z2;
        super(str, th, i, Bundle.EMPTY, j);
        int i5 = i2;
        if (!z) {
            z2 = true;
        } else if (i5 == 1) {
            i5 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        zzgrc.zza(z2);
        zzgrc.zza(th != null);
        this.zzc = i5;
        this.zzd = str2;
        this.zze = i3;
        this.zzf = zzvVar;
        this.zzg = i4;
        this.zzh = zzwkVar;
        this.zzi = z;
    }
}
