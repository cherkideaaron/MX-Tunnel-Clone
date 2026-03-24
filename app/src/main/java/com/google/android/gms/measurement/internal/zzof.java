package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import defpackage.AbstractC2906jp;
import defpackage.AbstractC3016lp;
import defpackage.AbstractC3071mp;
import defpackage.C2798hp;
import defpackage.MO;
import defpackage.N2;
import defpackage.XB;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzof {
    static final AbstractC2906jp zza;
    public static final /* synthetic */ int zzb = 0;

    static {
        C2798hp c2798hp = AbstractC2906jp.b;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        MO.f(24, objArr);
        zza = AbstractC2906jp.e(24, objArr);
    }

    public static String zza(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static int zzb(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzc(com.google.android.gms.internal.measurement.zzkp r21, defpackage.AbstractC3016lp r22, defpackage.AbstractC3016lp r23, defpackage.AbstractC3071mp r24, char[] r25, int r26, int r27, int r28, int r29, int r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzof.zzc(com.google.android.gms.internal.measurement.zzkp, lp, lp, mp, char[], int, int, int, int, int, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean):boolean");
    }

    public static final Map zzd(AbstractC3016lp abstractC3016lp, AbstractC3016lp abstractC3016lp2, AbstractC3071mp abstractC3071mp, char[] cArr, int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        if (!z3) {
            return XB.m;
        }
        com.google.android.gms.internal.measurement.zzkp zzkpVar = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar = (com.google.android.gms.internal.measurement.zzkq) abstractC3016lp2.get(zzkpVar);
        com.google.android.gms.internal.measurement.zzkp zzkpVar2 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar2 = (com.google.android.gms.internal.measurement.zzkq) abstractC3016lp2.get(zzkpVar2);
        com.google.android.gms.internal.measurement.zzkp zzkpVar3 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        com.google.android.gms.internal.measurement.zzkq zzkqVar3 = (com.google.android.gms.internal.measurement.zzkq) abstractC3016lp2.get(zzkpVar3);
        com.google.android.gms.internal.measurement.zzkp zzkpVar4 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        com.google.android.gms.internal.measurement.zzkq zzkqVar4 = (com.google.android.gms.internal.measurement.zzkq) abstractC3016lp2.get(zzkpVar4);
        N2 n2 = new N2(4);
        n2.i("Version", "2");
        n2.i("VendorConsent", true != z ? "0" : "1");
        n2.i("VendorLegitimateInterest", true != z2 ? "0" : "1");
        n2.i("gdprApplies", i3 != 1 ? "0" : "1");
        n2.i("EnableAdvertiserConsentMode", i2 != 1 ? "0" : "1");
        n2.i("PolicyVersion", String.valueOf(i4));
        n2.i("CmpSdkID", String.valueOf(i));
        n2.i("PurposeOneTreatment", i5 != 1 ? "0" : "1");
        n2.i("PublisherCC", str);
        if (zzkqVar == null) {
            zzkqVar = com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED;
        }
        n2.i("PublisherRestrictions1", String.valueOf(zzkqVar.zza()));
        n2.i("PublisherRestrictions3", String.valueOf(zzkqVar2 != null ? zzkqVar2.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza()));
        n2.i("PublisherRestrictions4", String.valueOf(zzkqVar3 != null ? zzkqVar3.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza()));
        n2.i("PublisherRestrictions7", String.valueOf(zzkqVar4 != null ? zzkqVar4.zza() : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED.zza()));
        String strZzf = zzf(zzkpVar, abstractC3016lp, abstractC3016lp2, abstractC3071mp, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, true);
        String strZzf2 = zzf(zzkpVar2, abstractC3016lp, abstractC3016lp2, abstractC3071mp, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, true);
        String strZzf3 = zzf(zzkpVar3, abstractC3016lp, abstractC3016lp2, abstractC3071mp, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, true);
        String strZzf4 = zzf(zzkpVar4, abstractC3016lp, abstractC3016lp2, abstractC3071mp, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, true);
        MO.g("Purpose1", strZzf);
        MO.g("Purpose3", strZzf2);
        MO.g("Purpose4", strZzf3);
        MO.g("Purpose7", strZzf4);
        n2.j(XB.b(4, new Object[]{"Purpose1", strZzf, "Purpose3", strZzf2, "Purpose4", strZzf3, "Purpose7", strZzf4}, null).entrySet());
        n2.j(XB.b(5, new Object[]{"AuthorizePurpose1", true != zzc(zzkpVar, abstractC3016lp, abstractC3016lp2, abstractC3071mp, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, true) ? "0" : "1", "AuthorizePurpose3", true != zzc(zzkpVar2, abstractC3016lp, abstractC3016lp2, abstractC3071mp, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, true) ? "0" : "1", "AuthorizePurpose4", true != zzc(zzkpVar3, abstractC3016lp, abstractC3016lp2, abstractC3071mp, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, true) ? "0" : "1", "AuthorizePurpose7", true != zzc(zzkpVar4, abstractC3016lp, abstractC3016lp2, abstractC3071mp, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, true) ? "0" : "1", "PurposeDiagnostics", new String(cArr)}, null).entrySet());
        return n2.b();
    }

    private static final int zze(com.google.android.gms.internal.measurement.zzkp zzkpVar, AbstractC3016lp abstractC3016lp, AbstractC3016lp abstractC3016lp2, AbstractC3071mp abstractC3071mp, char[] cArr, int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzkpVar == com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final String zzf(com.google.android.gms.internal.measurement.zzkp zzkpVar, AbstractC3016lp abstractC3016lp, AbstractC3016lp abstractC3016lp2, AbstractC3071mp abstractC3071mp, char[] cArr, int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str2) || str2.length() < zzkpVar.zza()) ? "0" : String.valueOf(str2.charAt(zzkpVar.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= zzkpVar.zza()) {
            strValueOf = String.valueOf(str3.charAt(zzkpVar.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    private static final boolean zzg(com.google.android.gms.internal.measurement.zzkp zzkpVar, AbstractC3016lp abstractC3016lp, AbstractC3016lp abstractC3016lp2, AbstractC3071mp abstractC3071mp, char[] cArr, int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        char c;
        int iZze = zze(zzkpVar, abstractC3016lp, abstractC3016lp2, abstractC3071mp, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, true);
        if (!z) {
            c = '4';
        } else {
            if (str2.length() >= zzkpVar.zza()) {
                char cCharAt = str2.charAt(zzkpVar.zza() - 1);
                boolean z4 = cCharAt == '1';
                if (iZze > 0 && cArr[iZze] != '2') {
                    cArr[iZze] = cCharAt != '1' ? '6' : '1';
                }
                return z4;
            }
            c = '0';
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c;
        }
        return false;
    }

    private static final boolean zzh(com.google.android.gms.internal.measurement.zzkp zzkpVar, AbstractC3016lp abstractC3016lp, AbstractC3016lp abstractC3016lp2, AbstractC3071mp abstractC3071mp, char[] cArr, int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        char c;
        int iZze = zze(zzkpVar, abstractC3016lp, abstractC3016lp2, abstractC3071mp, cArr, i, i2, i3, i4, i5, str, str2, str3, z, z2, true);
        if (!z2) {
            c = '5';
        } else {
            if (str3.length() >= zzkpVar.zza()) {
                char cCharAt = str3.charAt(zzkpVar.zza() - 1);
                boolean z4 = cCharAt == '1';
                if (iZze > 0 && cArr[iZze] != '2') {
                    cArr[iZze] = cCharAt != '1' ? '7' : '1';
                }
                return z4;
            }
            c = '0';
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c;
        }
        return false;
    }

    private static final com.google.android.gms.internal.measurement.zzkq zzi(com.google.android.gms.internal.measurement.zzkp zzkpVar, AbstractC3016lp abstractC3016lp, AbstractC3016lp abstractC3016lp2, AbstractC3071mp abstractC3071mp, char[] cArr, int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        Object obj = com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED;
        Object obj2 = abstractC3016lp2.get(zzkpVar);
        if (obj2 != null) {
            obj = obj2;
        }
        return (com.google.android.gms.internal.measurement.zzkq) obj;
    }
}
