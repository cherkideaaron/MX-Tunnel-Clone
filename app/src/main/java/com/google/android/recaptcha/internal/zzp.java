package com.google.android.recaptcha.internal;

import android.content.pm.PackageManager;
import defpackage.AbstractC0069Df;
import defpackage.AbstractC0115Ga;
import defpackage.DK;
import defpackage.Ht;
import defpackage.InterfaceC3493uc;
import defpackage.InterfaceC3508ur;
import defpackage.Jy;
import java.util.MissingResourceException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class zzp implements zzy {

    @NotNull
    private final zzek zza;

    @NotNull
    private final InterfaceC3508ur zzb;
    private boolean zzc;

    public zzp(@NotNull zzek zzekVar) {
        this.zza = zzekVar;
        int i = zzav.zza;
        this.zzb = AbstractC0069Df.G(zzo.zza);
        this.zzc = true;
    }

    private final zzbf zzg() {
        return (zzbf) this.zzb.getValue();
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 25;
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
        String strZza = zzg().zza();
        zzenVarZzb.zza();
        zztf zztfVarZzf = zzti.zzf();
        zztg zztgVarZzf = zzth.zzf();
        zztgVarZzf.zzw(strZza);
        zztfVarZzf.zze(AbstractC0115Ga.I(zztgVarZzf.zzk()));
        return zzz.zza(this, (zzti) zztfVarZzf.zzk());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    @Nullable
    public final Object zzd(@NotNull zzse zzseVar, @NotNull InterfaceC3493uc interfaceC3493uc) throws PackageManager.NameNotFoundException, MissingResourceException {
        zzen zzenVarZzc = zzz.zzc(this);
        int length = zzseVar.zzl().length();
        DK dk = DK.a;
        if (length == 0) {
            this.zzc = false;
            zzenVarZzc.zzb(new zzbd(zzbb.zzb, zzba.zzab, null));
            return dk;
        }
        zzg().zzb(Ht.V(new Jy("_GRECAPTCHA_KC", zzseVar.zzl())));
        zzenVarZzc.zza();
        return dk;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(@NotNull zzsr zzsrVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzc;
    }
}
