package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.Api;
import defpackage.VQ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class zzaaa extends zzaag implements zzmm {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgvz zzc = zzgvz.zzc(zzzg.zza);
    public final Context zza;
    private final Object zzd;
    private zzzl zze;
    private Thread zzf;
    private zzzp zzg;
    private zzd zzh;
    private Boolean zzi;
    private final zzyt zzj;

    public zzaaa(Context context) {
        zzyt zzytVar = new zzyt();
        zzzl zzzlVar = zzzl.zzJ;
        this.zzd = new Object();
        byte[] bArr = null;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzytVar;
        if (!(zzzlVar instanceof zzzl)) {
            zzzk zzzkVar = new zzzk(zzzlVar, bArr);
            zzzkVar.zzx((zzbl) zzzlVar);
            zzzlVar = new zzzl(zzzkVar, bArr);
        }
        this.zze = zzzlVar;
        this.zzh = zzd.zza;
        if (this.zze.zzU && context == null) {
            zzee.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static String zzi(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static int zzj(zzv zzvVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzvVar.zzd)) {
            return 4;
        }
        String strZzi = zzi(str);
        String strZzi2 = zzi(zzvVar.zzd);
        if (strZzi2 == null || strZzi == null) {
            return (z && strZzi2 == null) ? 1 : 0;
        }
        if (strZzi2.startsWith(strZzi) || strZzi.startsWith(strZzi2)) {
            return 3;
        }
        String str2 = zzfj.zza;
        return strZzi2.split("-", 2)[0].equals(strZzi.split("-", 2)[0]) ? 2 : 0;
    }

    public static /* synthetic */ int zzm(int i, int i2) {
        return (i == 0 || i != i2) ? Integer.bitCount(i & i2) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ int zzn(com.google.android.gms.internal.ads.zzv r5, com.google.android.gms.internal.ads.zzguf r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L2a
            r2 = r0
        L9:
            java.util.List r3 = r5.zzc
            int r4 = r3.size()
            if (r2 >= r4) goto L27
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.zzx r3 = (com.google.android.gms.internal.ads.zzx) r3
            java.lang.String r3 = r3.zzb
            java.lang.Object r4 = r6.get(r1)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            goto L2d
        L24:
            int r2 = r2 + 1
            goto L9
        L27:
            int r1 = r1 + 1
            goto L2
        L2a:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaa.zzn(com.google.android.gms.internal.ads.zzv, com.google.android.gms.internal.ads.zzguf):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final void zzl() {
        boolean z;
        zzzp zzzpVar;
        synchronized (this.zzd) {
            try {
                z = false;
                if (this.zze.zzU && Build.VERSION.SDK_INT >= 32 && (zzzpVar = this.zzg) != null && zzzpVar.zza()) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            zzs();
        }
    }

    private static void zzv(zzyn zzynVar, zzbl zzblVar, Map map) {
        for (int i = 0; i < zzynVar.zzb; i++) {
            if (((zzbh) zzblVar.zzH.get(zzynVar.zza(i))) != null) {
                throw null;
            }
        }
    }

    private static final Pair zzw(int i, zzaaf zzaafVar, int[][][] iArr, zzzr zzzrVar, Comparator comparator) {
        RandomAccess randomAccessZzj;
        boolean z;
        zzaaf zzaafVar2 = zzaafVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < 2) {
            if (i == zzaafVar2.zza(i2)) {
                zzyn zzynVarZzb = zzaafVar2.zzb(i2);
                for (int i3 = 0; i3 < zzynVarZzb.zzb; i3++) {
                    zzbg zzbgVarZza = zzynVarZzb.zza(i3);
                    List listZza = zzzrVar.zza(i2, zzbgVarZza, iArr[i2][i3]);
                    int i4 = zzbgVarZza.zza;
                    boolean[] zArr = new boolean[i4];
                    int i5 = 0;
                    while (i5 < i4) {
                        int i6 = i5 + 1;
                        zzzs zzzsVar = (zzzs) listZza.get(i5);
                        int iZza = zzzsVar.zza();
                        if (!zArr[i5] && iZza != 0) {
                            if (iZza == 1) {
                                randomAccessZzj = zzguf.zzj(zzzsVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzzsVar);
                                for (int i7 = i6; i7 < i4; i7++) {
                                    zzzs zzzsVar2 = (zzzs) listZza.get(i7);
                                    if (zzzsVar2.zza() == 2 && zzzsVar.zzc(zzzsVar2)) {
                                        arrayList2.add(zzzsVar2);
                                        z = true;
                                        zArr[i7] = true;
                                    } else {
                                        z = true;
                                    }
                                }
                                randomAccessZzj = arrayList2;
                            }
                            arrayList.add(randomAccessZzj);
                        }
                        i5 = i6;
                    }
                }
            }
            i2++;
            zzaafVar2 = zzaafVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((zzzs) list.get(i8)).zzc;
        }
        zzzs zzzsVar3 = (zzzs) list.get(0);
        return Pair.create(new zzaab(zzzsVar3.zzb, iArr2, 0), Integer.valueOf(zzzsVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzmm
    public final void zza(zzml zzmlVar) {
        synchronized (this.zzd) {
            boolean z = this.zze.zzY;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final void zzb() {
        zzzp zzzpVar;
        synchronized (this.zzd) {
            try {
                Thread thread = this.zzf;
                if (thread != null) {
                    zzgrc.zzj(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzzpVar = this.zzg) != null) {
            zzzpVar.zze();
            this.zzg = null;
        }
        super.zzb();
    }

    public final zzzl zzc() {
        zzzl zzzlVar;
        synchronized (this.zzd) {
            zzzlVar = this.zze;
        }
        return zzzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final boolean zzd() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final void zze(zzd zzdVar) {
        if (this.zzh.equals(zzdVar)) {
            return;
        }
        this.zzh = zzdVar;
        zzl();
    }

    public final void zzf(zzzk zzzkVar) {
        boolean z;
        zzzl zzzlVar = new zzzl(zzzkVar, null);
        synchronized (this.zzd) {
            z = !this.zze.equals(zzzlVar);
            this.zze = zzzlVar;
        }
        if (z) {
            if (zzzlVar.zzU && this.zza == null) {
                zzee.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaaj
    public final zzmm zzg() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzaag
    public final Pair zzh(zzaaf zzaafVar, int[][][] iArr, final int[] iArr2, zzwk zzwkVar, zzbf zzbfVar) {
        final zzzl zzzlVar;
        final boolean z;
        final String str;
        final String languageTag;
        int i;
        zzaac zzaacVarZza;
        int i2;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        Context context3;
        int i3 = 1;
        synchronized (this.zzd) {
            this.zzf = Thread.currentThread();
            zzzlVar = this.zze;
        }
        if (this.zzi == null && (context3 = this.zza) != null) {
            this.zzi = Boolean.valueOf(zzfj.zzM(context3));
        }
        if (zzzlVar.zzU && Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzzp(this.zza, this, this.zzi);
        }
        int i4 = 2;
        zzaab[] zzaabVarArr = new zzaab[2];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 >= 2) {
                z = false;
                break;
            }
            if (zzaafVar.zza(i6) == 2 && zzaafVar.zzb(i6).zzb > 0) {
                z = true;
                break;
            }
            i6++;
        }
        Pair pairZzw = zzw(1, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzzc
            @Override // com.google.android.gms.internal.ads.zzzr
            public final /* synthetic */ List zza(int i7, zzbg zzbgVar, int[] iArr3) {
                zzzc zzzcVar = this;
                final zzaaa zzaaaVar = zzzcVar.zza;
                final zzzl zzzlVar2 = zzzlVar;
                zzgrd zzgrdVar = new zzgrd() { // from class: com.google.android.gms.internal.ads.zzzf
                    @Override // com.google.android.gms.internal.ads.zzgrd
                    public final /* synthetic */ boolean zza(Object obj) {
                        return zzaaaVar.zzk(zzzlVar2, (zzv) obj);
                    }
                };
                int i8 = iArr2[i7];
                int i9 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                int i10 = 0;
                while (i10 < zzbgVar.zza) {
                    zzgucVar.zzf(new zzyx(i7, zzbgVar, i10, zzzlVar2, iArr3[i10], z, zzgrdVar, i8));
                    i10++;
                    zzzcVar = this;
                }
                return zzgucVar.zzi();
            }
        }, zzyy.zza);
        if (pairZzw != null) {
            zzaabVarArr[((Integer) pairZzw.second).intValue()] = (zzaab) pairZzw.first;
        }
        if (pairZzw == null) {
            str = null;
        } else {
            Object obj = pairZzw.first;
            str = ((zzaab) obj).zza.zza(((zzaab) obj).zzb[0]).zzd;
        }
        int i7 = zzzlVar.zzw.zzb;
        final Point pointZzO = (!zzzlVar.zzk || (context2 = this.zza) == null) ? null : zzfj.zzO(context2);
        Pair pairZzw2 = zzw(2, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzzh
            /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
            @Override // com.google.android.gms.internal.ads.zzzr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final /* synthetic */ java.util.List zza(int r20, com.google.android.gms.internal.ads.zzbg r21, int[] r22) {
                /*
                    Method dump skipped, instructions count: 212
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzh.zza(int, com.google.android.gms.internal.ads.zzbg, int[]):java.util.List");
            }
        }, zzzb.zza);
        int i8 = 4;
        Pair pairZzw3 = pairZzw2 == null ? zzw(4, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzze
            @Override // com.google.android.gms.internal.ads.zzzr
            public final /* synthetic */ List zza(int i9, zzbg zzbgVar, int[] iArr3) {
                int i10 = zzaaa.zzb;
                int i11 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                for (int i12 = 0; i12 < zzbgVar.zza; i12++) {
                    zzgucVar.zzf(new zzzi(i9, zzbgVar, i12, zzzlVar, iArr3[i12]));
                }
                return zzgucVar.zzi();
            }
        }, zzyz.zza) : null;
        if (pairZzw3 != null) {
            zzaabVarArr[((Integer) pairZzw3.second).intValue()] = (zzaab) pairZzw3.first;
        } else if (pairZzw2 != null) {
            zzaabVarArr[((Integer) pairZzw2.second).intValue()] = (zzaab) pairZzw2.first;
        }
        if (!zzzlVar.zzB || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = null;
        } else {
            String str2 = zzfj.zza;
            languageTag = locale.toLanguageTag();
        }
        int i9 = 3;
        Pair pairZzw4 = zzw(3, zzaafVar, iArr, new zzzr() { // from class: com.google.android.gms.internal.ads.zzzd
            @Override // com.google.android.gms.internal.ads.zzzr
            public final /* synthetic */ List zza(int i10, zzbg zzbgVar, int[] iArr3) {
                int i11 = zzaaa.zzb;
                int i12 = zzguf.zzd;
                zzguc zzgucVar = new zzguc();
                for (int i13 = 0; i13 < zzbgVar.zza; i13++) {
                    String str3 = languageTag;
                    int i14 = i13;
                    zzgucVar.zzf(new zzzq(i10, zzbgVar, i14, zzzlVar, iArr3[i13], str, str3));
                }
                return zzgucVar.zzi();
            }
        }, zzza.zza);
        if (pairZzw4 != null) {
            zzaabVarArr[((Integer) pairZzw4.second).intValue()] = (zzaab) pairZzw4.first;
        }
        int i10 = 0;
        while (i10 < i4) {
            int iZza = zzaafVar.zza(i10);
            if (iZza != i4 && iZza != i3 && iZza != i9 && iZza != i8) {
                zzyn zzynVarZzb = zzaafVar.zzb(i10);
                int[][] iArr3 = iArr[i10];
                int i11 = i5;
                int i12 = i11;
                zzbg zzbgVar = null;
                zzzj zzzjVar = null;
                while (i11 < zzynVarZzb.zzb) {
                    zzbg zzbgVarZza = zzynVarZzb.zza(i11);
                    int[] iArr4 = iArr3[i11];
                    zzzj zzzjVar2 = zzzjVar;
                    for (int i13 = i5; i13 < zzbgVarZza.zza; i13++) {
                        if (VQ.c(iArr4[i13], zzzlVar.zzV)) {
                            zzzj zzzjVar3 = new zzzj(zzbgVarZza.zza(i13), iArr4[i13]);
                            if (zzzjVar2 == null || zzzjVar3.compareTo(zzzjVar2) > 0) {
                                zzzjVar2 = zzzjVar3;
                                zzbgVar = zzbgVarZza;
                                i12 = i13;
                            }
                        }
                        i3 = 1;
                    }
                    i11 += i3;
                    zzzjVar = zzzjVar2;
                    i5 = 0;
                }
                zzaabVarArr[i10] = zzbgVar == null ? null : new zzaab(zzbgVar, new int[]{i12}, 0);
                i3 = 1;
            }
            i10 += i3;
            i4 = 2;
            i5 = 0;
            i9 = 3;
            i8 = 4;
        }
        HashMap map = new HashMap();
        int i14 = 2;
        for (int i15 = 0; i15 < 2; i15 += i3) {
            zzv(zzaafVar.zzb(i15), zzzlVar, map);
        }
        zzv(zzaafVar.zze(), zzzlVar, map);
        for (int i16 = 0; i16 < 2; i16 += i3) {
            if (((zzbh) map.get(Integer.valueOf(zzaafVar.zza(i16)))) != null) {
                throw null;
            }
        }
        int i17 = 0;
        while (i17 < i14) {
            zzyn zzynVarZzb2 = zzaafVar.zzb(i17);
            if (zzzlVar.zzb(i17, zzynVarZzb2)) {
                if (zzzlVar.zzc(i17, zzynVarZzb2) != null) {
                    throw null;
                }
                zzaabVarArr[i17] = null;
            }
            i17++;
            i14 = 2;
        }
        int i18 = 0;
        for (int i19 = i14; i18 < i19; i19 = 2) {
            int iZza2 = zzaafVar.zza(i18);
            if (zzzlVar.zza(i18) || zzzlVar.zzI.contains(Integer.valueOf(iZza2))) {
                zzaabVarArr[i18] = null;
                i2 = 1;
            } else {
                i2 = 1;
            }
            i18 += i2;
        }
        zzyt zzytVar = this.zzj;
        zzaas zzaasVarZzt = zzt();
        zzguf zzgufVarZzd = zzyu.zzd(zzaabVarArr);
        int i20 = 2;
        zzaac[] zzaacVarArr = new zzaac[2];
        int i21 = 0;
        while (i21 < i20) {
            zzaab zzaabVar = zzaabVarArr[i21];
            if (zzaabVar != null) {
                int[] iArr5 = zzaabVar.zzb;
                int length = iArr5.length;
                if (length == 0) {
                    i = i21;
                    i21 = i + 1;
                    i20 = 2;
                } else {
                    if (length == 1) {
                        zzaacVarZza = new zzaad(zzaabVar.zza, iArr5[0], 0, 0, null);
                        i = i21;
                    } else {
                        i = i21;
                        zzaacVarZza = zzytVar.zza(zzaabVar.zza, iArr5, 0, zzaasVarZzt, (zzguf) zzgufVarZzd.get(i21));
                    }
                    zzaacVarArr[i] = zzaacVarZza;
                }
            } else {
                i = i21;
            }
            i21 = i + 1;
            i20 = 2;
        }
        zzmo[] zzmoVarArr = new zzmo[i20];
        for (int i22 = 0; i22 < i20; i22++) {
            zzmoVarArr[i22] = (zzzlVar.zza(i22) || zzzlVar.zzI.contains(Integer.valueOf(zzaafVar.zza(i22))) || (zzaafVar.zza(i22) != -2 && zzaacVarArr[i22] == null)) ? null : zzmo.zza;
        }
        return Pair.create(zzmoVarArr, zzaacVarArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final /* synthetic */ boolean zzk(zzzl zzzlVar, zzv zzvVar) {
        zzzp zzzpVar;
        zzzp zzzpVar2;
        if (!zzzlVar.zzU) {
            return true;
        }
        Boolean bool = this.zzi;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        int i = zzvVar.zzG;
        char c = 65535;
        if (i == -1 || i <= 2) {
            return true;
        }
        String str = zzvVar.zzo;
        if (str != null) {
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals("audio/eac3-joc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 187078296:
                    if (str.equals("audio/ac3")) {
                        c = 0;
                        break;
                    }
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1504578661:
                    if (str.equals("audio/eac3")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if ((c == 0 || c == 1 || c == 2 || c == 3) && (Build.VERSION.SDK_INT < 32 || (zzzpVar2 = this.zzg) == null || !zzzpVar2.zza())) {
                return true;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzzpVar = this.zzg) != null && zzzpVar.zza() && zzzpVar.zzb() && this.zzg.zzc()) {
            return this.zzg.zzd(this.zzh, zzvVar);
        }
        return false;
    }
}
