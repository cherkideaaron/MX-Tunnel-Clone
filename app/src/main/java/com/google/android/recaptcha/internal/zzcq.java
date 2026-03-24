package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import defpackage.AbstractC0136He;
import defpackage.InterfaceC3493uc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class zzcq {

    @Nullable
    private static zzcv zza;

    @NotNull
    public static final zzcv zza(@NotNull Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    @Nullable
    public static final Object zzb(@NotNull Application application, @NotNull String str, long j, @NotNull InterfaceC3493uc interfaceC3493uc) {
        return zzcv.zzh(zza(application), str, j, null, null, null, interfaceC3493uc, 28, null);
    }

    @NotNull
    public static final Task zzc(@NotNull Application application, @NotNull String str, long j) {
        return zzas.zza(AbstractC0136He.c(zza(application).zzd().zza(), new zzco(application, str, j, null)));
    }

    @Nullable
    public static final Object zzd(@NotNull Application application, @NotNull String str, @NotNull InterfaceC3493uc interfaceC3493uc) {
        zzcv zzcvVarZza = zza(application);
        return zzcv.zzh(zzcvVarZza, str, 0L, null, zzcvVarZza.zzf, zzch.zzb, interfaceC3493uc, 2, null);
    }

    @NotNull
    public static final Task zze(@NotNull Application application, @NotNull String str) {
        return zzas.zza(AbstractC0136He.c(zza(application).zzd().zza(), new zzcp(application, str, null)));
    }
}
