package com.google.android.recaptcha.internal;

import android.content.pm.PackageManager;
import android.webkit.JavascriptInterface;
import defpackage.C0166Ja;
import defpackage.DK;
import defpackage.InterfaceC0149Ia;
import java.util.MissingResourceException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class zzij {
    final /* synthetic */ zzja zza;

    @Nullable
    private Long zzb;

    @NotNull
    private final zzjh zzc = zzjh.zzb();

    public zzij(zzja zzjaVar) {
        this.zza = zzjaVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    @Nullable
    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(@NotNull String str) throws PackageManager.NameNotFoundException, MissingResourceException {
        zzja zzjaVar = this.zza;
        if (zzjaVar.zzq().zzb == null) {
            zzen zzenVar = zzjaVar.zzp;
            if (zzenVar != null) {
                zzenVar.zza();
            }
            this.zza.zzp = null;
        }
        zzb();
        zzrc zzrcVarZzl = zzrc.zzl(zzbt.zza(str));
        zztw zztwVarZzi = zztx.zzi();
        zztwVarZzi.zzf(zzrcVarZzl);
        this.zza.zzj.zze((zztx) zztwVarZzi.zzk());
    }

    @JavascriptInterface
    public final void zzlsm(@NotNull String str) {
        zzb();
        zztw zztwVarZzi = zztx.zzi();
        zztwVarZzi.zzq(zzrr.zzi(zzbt.zza(str)));
        this.zza.zzj.zze((zztx) zztwVarZzi.zzk());
    }

    @JavascriptInterface
    public final void zzoid(@NotNull String str) {
        zzb();
        zzts zztsVarZzg = zzts.zzg(zzbt.zza(str));
        zztsVarZzg.zzi().name();
        if (zztsVarZzg.zzi() != zztv.JS_CODE_SUCCESS) {
            zztsVarZzg.zzi().name();
            int i = zzbd.zza;
            zzbd zzbdVarZza = zzbc.zza(zztsVarZzg.zzi());
            this.zza.zzA().hashCode();
            ((C0166Ja) this.zza.zzA()).S(zzbdVarZza);
            return;
        }
        this.zza.zzA().hashCode();
        if (((C0166Ja) this.zza.zzA()).E(DK.a)) {
            return;
        }
        this.zza.zzA().hashCode();
    }

    @JavascriptInterface
    public final void zzrp(@NotNull String str) {
        zzb();
        zzfo zzfoVar = this.zza.zzb;
        if (zzfoVar == null) {
            zzfoVar = null;
        }
        zzfoVar.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(@NotNull String str) {
        zzb();
        zzsi zzsiVarZzi = zzsi.zzi(zzbt.zza(str));
        zzsiVarZzi.toString();
        InterfaceC0149Ia interfaceC0149Ia = (InterfaceC0149Ia) this.zza.zze.remove(zzsiVarZzi.zzk());
        if (interfaceC0149Ia != null) {
            ((C0166Ja) interfaceC0149Ia).E(zzsiVarZzi);
        }
    }
}
