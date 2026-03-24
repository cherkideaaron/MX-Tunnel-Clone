package com.google.android.recaptcha.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.AbstractC0069Df;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class zzen {

    @Nullable
    private static zzqk zza;

    @NotNull
    private final String zzb;

    @NotNull
    private final String zzc;

    @NotNull
    private final String zzd;

    @Nullable
    private final String zze;

    @NotNull
    private final zzeo zzf;

    @NotNull
    private final Context zzg;

    @Nullable
    private final Integer zzh;

    @NotNull
    private final String zzi = zzqb.zzc(zzqb.zzb(System.currentTimeMillis()));
    private final long zzj = System.currentTimeMillis();

    @NotNull
    private final int zzk;

    @NotNull
    private final int zzl;

    public zzen(@NotNull int i, @NotNull String str, @NotNull int i2, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5, @NotNull zzeo zzeoVar, @NotNull zzcc zzccVar, @NotNull Context context, @Nullable Integer num) {
        this.zzk = i;
        this.zzb = str;
        this.zzl = i2;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = zzeoVar;
        this.zzg = context;
        this.zzh = num;
    }

    private final void zzc(int i, zzqq zzqqVar) throws PackageManager.NameNotFoundException, MissingResourceException {
        String iSO3Language;
        int i2;
        PackageInfo packageInfo;
        int i3;
        String iSO3Country = "";
        zzra zzraVarZzi = zzrc.zzi();
        zzraVarZzi.zzy(this.zzk);
        zzraVarZzi.zzq(this.zzc);
        zzraVarZzi.zzt(this.zzd);
        zzraVarZzi.zzz(this.zzl);
        String str = this.zze;
        if (str != null) {
            zzraVarZzi.zzx(str);
        }
        Integer num = this.zzh;
        if (num != null) {
            zzraVarZzi.zzv(num.intValue());
        }
        if (zzqqVar != null) {
            zzraVarZzi.zzs(zzqqVar);
        }
        zzraVarZzi.zzA(i);
        zzraVarZzi.zzw(this.zzi);
        zzraVarZzi.zzr(System.currentTimeMillis() - this.zzj);
        int i4 = zzav.zza;
        for (zzax zzaxVar : ((zzaz) AbstractC0069Df.G(zzel.zza).getValue()).zza()) {
            zzraVarZzi.zzf(0);
        }
        int i5 = zzbk.zza;
        int i6 = this.zzk - 2;
        zzbk.zza((i6 != 4 ? i6 != 5 ? i6 != 6 ? i6 != 7 ? i6 != 14 ? zzbl.zza : zzbl.zzf : zzbl.zze : zzbl.zzd : zzbl.zzc : zzbl.zzb).zza(), zzraVarZzi.zze() * 1000);
        Context context = this.zzg;
        Set setZza = zzbe.zza(context);
        zzqk zzqkVar = zza;
        if (zzqkVar == null) {
            zzqh zzqhVarZzf = zzqk.zzf();
            int i7 = Build.VERSION.SDK_INT;
            zzqhVarZzf.zzf(i7);
            String strValueOf = "unknown";
            String strValueOf2 = (i7 < 33 ? (i3 = context.getPackageManager().getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).metaData.getInt("com.google.android.gms.version", -1)) != -1 : (i3 = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)).metaData.getInt("com.google.android.gms.version", -1)) != -1) ? String.valueOf(i3) : "unknown";
            zzqhVarZzf.zzs(strValueOf2);
            zzqhVarZzf.zzu("18.6.1");
            zzqhVarZzf.zzr(Build.MODEL);
            zzqhVarZzf.zzt(Build.MANUFACTURER);
            try {
                i2 = Build.VERSION.SDK_INT;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (i2 >= 33) {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
            } else if (i2 >= 28) {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } else {
                strValueOf = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                zzqhVarZzf.zzq(strValueOf);
                zzqkVar = (zzqk) zzqhVarZzf.zzk();
            }
            strValueOf = String.valueOf(packageInfo.getLongVersionCode());
            zzqhVarZzf.zzq(strValueOf);
            zzqkVar = (zzqk) zzqhVarZzf.zzk();
        }
        zza = zzqkVar;
        zzqh zzqhVar = (zzqh) zzqkVar.zzr();
        zzqhVar.zze(setZza);
        zzqk zzqkVar2 = (zzqk) zzqhVar.zzk();
        try {
            iSO3Language = Locale.getDefault().getISO3Language();
        } catch (MissingResourceException unused2) {
            iSO3Language = "";
        }
        try {
            iSO3Country = Locale.getDefault().getISO3Country();
        } catch (MissingResourceException unused3) {
        }
        String str2 = this.zzb;
        zzrm zzrmVarZzf = zzro.zzf();
        zzrmVarZzf.zzr(str2);
        zzrmVarZzf.zze(zzqkVar2);
        zzrmVarZzf.zzq(iSO3Language);
        zzrmVarZzf.zzf(iSO3Country);
        zzraVarZzi.zzu((zzro) zzrmVarZzf.zzk());
        zztw zztwVarZzi = zztx.zzi();
        zztwVarZzi.zze(zzraVarZzi);
        this.zzf.zza((zztx) zztwVarZzi.zzk());
    }

    public final void zza() throws PackageManager.NameNotFoundException, MissingResourceException {
        zzc(3, null);
    }

    public final void zzb(@NotNull zzbd zzbdVar) throws PackageManager.NameNotFoundException, MissingResourceException {
        zzqo zzqoVarZzg = zzqq.zzg();
        zzqoVarZzg.zzr(String.valueOf(zzbdVar.zzb().zza()));
        zzqoVarZzg.zze(zzbdVar.zza().zza());
        zzqoVarZzg.zzq(zzbdVar.zzc().getErrorCode().getErrorCode());
        String strZzd = zzbdVar.zzd();
        if (strZzd != null) {
            zzqoVarZzg.zzf(strZzd);
        }
        zzc(4, (zzqq) zzqoVarZzg.zzk());
    }
}
