package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import defpackage.Vs;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* loaded from: classes.dex */
public final class zzank implements zzamf {
    private final zzer zza = new zzer();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzank(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = "sans-serif";
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.zze = true == "Serif".equals(zzfj.zzj(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.zzg = i;
        boolean z = (bArr[0] & 32) != 0;
        this.zzb = z;
        if (z) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        StyleSpan styleSpan;
        Object underlineSpan;
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 == 0) {
                if (i8 != 0) {
                    styleSpan = new StyleSpan(2);
                    spannableStringBuilder.setSpan(styleSpan, i3, i4, i6);
                }
                z = false;
            } else if (i8 != 0) {
                styleSpan = new StyleSpan(3);
                spannableStringBuilder.setSpan(styleSpan, i3, i4, i6);
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                z = false;
            }
            if ((i & 4) != 0) {
                underlineSpan = new UnderlineSpan();
            } else if (i7 != 0 || z) {
                return;
            } else {
                underlineSpan = new StyleSpan(0);
            }
            spannableStringBuilder.setSpan(underlineSpan, i3, i4, i6);
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i, int i2, zzame zzameVar, zzdr zzdrVar) {
        String strZzK;
        int i3;
        float f;
        int i4;
        float f2;
        int i5;
        int length;
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i + i2);
        zzerVar.zzh(i);
        int i6 = 1;
        int i7 = 0;
        int i8 = 2;
        zzgrc.zza(zzerVar.zzd() >= 2);
        int iZzt = zzerVar.zzt();
        if (iZzt == 0) {
            strZzK = "";
        } else {
            int iZzg = zzerVar.zzg();
            Charset charsetZzR = zzerVar.zzR();
            int iZzg2 = zzerVar.zzg() - iZzg;
            if (charsetZzR == null) {
                charsetZzR = StandardCharsets.UTF_8;
            }
            strZzK = zzerVar.zzK(iZzt - iZzg2, charsetZzR);
        }
        if (strZzK.isEmpty()) {
            zzdrVar.zza(new zzalx(zzguf.zzi(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strZzK);
        int i9 = this.zzc;
        zzb(spannableStringBuilder, i9, 0, 0, spannableStringBuilder.length(), 16711680);
        int i10 = this.zzd;
        zzc(spannableStringBuilder, i10, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.zze;
        int length2 = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
        }
        float fMax = this.zzf;
        while (zzerVar.zzd() >= 8) {
            int iZzg3 = zzerVar.zzg();
            int iZzB = zzerVar.zzB();
            int iZzB2 = zzerVar.zzB();
            if (iZzB2 == 1937013100) {
                zzgrc.zza(zzerVar.zzd() >= i8 ? i6 : i7);
                int iZzt2 = zzerVar.zzt();
                int i11 = i7;
                while (i11 < iZzt2) {
                    zzgrc.zza(zzerVar.zzd() >= 12 ? i6 : i7);
                    int iZzt3 = zzerVar.zzt();
                    int iZzt4 = zzerVar.zzt();
                    zzerVar.zzk(i8);
                    int iZzs = zzerVar.zzs();
                    zzerVar.zzk(i6);
                    int iZzB3 = zzerVar.zzB();
                    if (iZzt4 > spannableStringBuilder.length()) {
                        int length3 = spannableStringBuilder.length();
                        i5 = iZzt2;
                        f2 = fMax;
                        StringBuilder sb = new StringBuilder(Vs.f(String.valueOf(iZzt4).length() + 44, 2, String.valueOf(length3)));
                        sb.append("Truncating styl end (");
                        sb.append(iZzt4);
                        sb.append(") to cueText.length() (");
                        sb.append(length3);
                        sb.append(").");
                        zzee.zzc("Tx3gParser", sb.toString());
                        length = spannableStringBuilder.length();
                    } else {
                        f2 = fMax;
                        i5 = iZzt2;
                        length = iZzt4;
                    }
                    if (iZzt3 >= length) {
                        StringBuilder sb2 = new StringBuilder(Vs.f(String.valueOf(iZzt3).length() + 36, 2, String.valueOf(length)));
                        sb2.append("Ignoring styl with start (");
                        sb2.append(iZzt3);
                        sb2.append(") >= end (");
                        sb2.append(length);
                        sb2.append(").");
                        zzee.zzc("Tx3gParser", sb2.toString());
                    } else {
                        int i12 = length;
                        zzb(spannableStringBuilder, iZzs, i9, iZzt3, i12, 0);
                        zzc(spannableStringBuilder, iZzB3, i10, iZzt3, i12, 0);
                    }
                    i11++;
                    iZzt2 = i5;
                    i6 = 1;
                    fMax = f2;
                    i7 = 0;
                    i8 = 2;
                }
                i3 = i6;
                f = fMax;
                i4 = i8;
            } else {
                i3 = i6;
                f = fMax;
                if (iZzB2 == 1952608120 && this.zzb) {
                    i4 = 2;
                    zzgrc.zza(zzerVar.zzd() >= 2 ? i3 : 0);
                    float fZzt = zzerVar.zzt();
                    int i13 = this.zzg;
                    String str2 = zzfj.zza;
                    fMax = Math.max(0.0f, Math.min(fZzt / i13, 0.95f));
                    zzerVar.zzh(iZzg3 + iZzB);
                    i6 = i3;
                    i8 = i4;
                    i7 = 0;
                } else {
                    i4 = 2;
                }
            }
            fMax = f;
            zzerVar.zzh(iZzg3 + iZzB);
            i6 = i3;
            i8 = i4;
            i7 = 0;
        }
        zzcw zzcwVar = new zzcw();
        zzcwVar.zza(spannableStringBuilder);
        zzcwVar.zzf(fMax, 0);
        zzcwVar.zzg(0);
        zzdrVar.zza(new zzalx(zzguf.zzj(zzcwVar.zzr()), -9223372036854775807L, -9223372036854775807L));
    }
}
