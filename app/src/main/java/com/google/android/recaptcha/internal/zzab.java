package com.google.android.recaptcha.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import defpackage.AbstractC0115Ga;
import defpackage.DK;
import defpackage.InterfaceC3493uc;
import java.util.MissingResourceException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class zzab implements zzy {

    @NotNull
    private final zzek zza;

    public zzab(@NotNull zzek zzekVar) {
        this.zza = zzekVar;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    @NotNull
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    @Nullable
    public final Object zzc(@NotNull String str, @NotNull InterfaceC3493uc interfaceC3493uc) throws PackageManager.NameNotFoundException, MissingResourceException {
        zzen zzenVarZzb = zzz.zzb(this, str);
        int i = Build.VERSION.SDK_INT;
        zzenVarZzb.zza();
        zztf zztfVarZzf = zzti.zzf();
        zztg zztgVarZzf = zzth.zzf();
        zztgVarZzf.zzw(String.valueOf(i));
        zztfVarZzf.zze(AbstractC0115Ga.I(zztgVarZzf.zzk()));
        return zzz.zza(this, (zzti) zztfVarZzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    @Nullable
    public final Object zzd(@NotNull zzse zzseVar, @NotNull InterfaceC3493uc interfaceC3493uc) throws PackageManager.NameNotFoundException, MissingResourceException {
        zzz.zzc(this).zza();
        return DK.a;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(@NotNull zzsr zzsrVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return true;
    }
}
