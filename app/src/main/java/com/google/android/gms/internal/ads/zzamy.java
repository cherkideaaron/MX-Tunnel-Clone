package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import defpackage.Vs;
import java.util.Locale;

/* loaded from: classes.dex */
final class zzamy {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzamy(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f;
        this.zzf = z;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
        this.zzj = i2;
    }

    public static zzamy zza(String str, zzamw zzamwVar) throws NumberFormatException {
        float f;
        int i;
        zzgrc.zza(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i2 = zzamwVar.zzk;
        if (length != i2) {
            String str2 = zzfj.zza;
            Locale locale = Locale.US;
            zzee.zzc("SsaStyle", "Skipping malformed 'Style:' line (expected " + i2 + " values, found " + length + "): '" + str + "'");
            return null;
        }
        try {
            String strTrim = strArrSplit[zzamwVar.zza].trim();
            int i3 = zzamwVar.zzb;
            int iZzd = i3 != -1 ? zzd(strArrSplit[i3].trim()) : -1;
            int i4 = zzamwVar.zzc;
            Integer numZzb = i4 != -1 ? zzb(strArrSplit[i4].trim()) : null;
            int i5 = zzamwVar.zzd;
            Integer numZzb2 = i5 != -1 ? zzb(strArrSplit[i5].trim()) : null;
            int i6 = zzamwVar.zze;
            if (i6 != -1) {
                String strTrim2 = strArrSplit[i6].trim();
                try {
                    f = Float.parseFloat(strTrim2);
                } catch (NumberFormatException e) {
                    StringBuilder sb = new StringBuilder(String.valueOf(strTrim2).length() + 29);
                    sb.append("Failed to parse font size: '");
                    sb.append(strTrim2);
                    sb.append("'");
                    zzee.zzd("SsaStyle", sb.toString(), e);
                }
            } else {
                f = -3.4028235E38f;
            }
            int i7 = zzamwVar.zzf;
            boolean z = i7 != -1 && zze(strArrSplit[i7].trim());
            int i8 = zzamwVar.zzg;
            boolean z2 = i8 != -1 && zze(strArrSplit[i8].trim());
            int i9 = zzamwVar.zzh;
            boolean z3 = i9 != -1 && zze(strArrSplit[i9].trim());
            int i10 = zzamwVar.zzi;
            boolean z4 = i10 != -1 && zze(strArrSplit[i10].trim());
            int i11 = zzamwVar.zzj;
            if (i11 != -1) {
                String strTrim3 = strArrSplit[i11].trim();
                try {
                    int i12 = Integer.parseInt(strTrim3.trim());
                    if (i12 == 1 || i12 == 3) {
                        i = i12;
                    }
                } catch (NumberFormatException unused) {
                }
                zzee.zzc("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim3)));
                i = -1;
            } else {
                i = -1;
            }
            return new zzamy(strTrim, iZzd, numZzb, numZzb2, f, z, z2, z3, z4, i);
        } catch (RuntimeException e2) {
            zzee.zzd("SsaStyle", Vs.o(new StringBuilder(str.length() + 36), "Skipping malformed 'Style:' line: '", str, "'"), e2);
            return null;
        }
    }

    public static Integer zzb(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzgrc.zza(j <= 4294967295L);
            return Integer.valueOf(Color.argb(zzgxz.zza(((j >> 24) & 255) ^ 255), zzgxz.zza(j & 255), zzgxz.zza((j >> 8) & 255), zzgxz.zza((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            zzee.zzd("SsaStyle", Vs.o(new StringBuilder(String.valueOf(str).length() + 36), "Failed to parse color expression: '", str, "'"), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) throws NumberFormatException {
        int i;
        try {
            i = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return i;
            default:
                Vs.v(str, "Ignoring unknown alignment: ", "SsaStyle");
                return -1;
        }
    }

    private static boolean zze(String str) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            zzee.zzd("SsaStyle", Vs.o(new StringBuilder(String.valueOf(str).length() + 33), "Failed to parse boolean value: '", str, "'"), e);
            return false;
        }
    }
}
