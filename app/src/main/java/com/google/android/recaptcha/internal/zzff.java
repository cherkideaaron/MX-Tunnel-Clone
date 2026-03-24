package com.google.android.recaptcha.internal;

import defpackage.AbstractC0069Df;
import defpackage.AbstractC0136He;
import defpackage.CH;
import defpackage.InterfaceC3493uc;
import defpackage.InterfaceC3508ur;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class zzff {

    @NotNull
    private final InterfaceC3508ur zza;

    @NotNull
    private final InterfaceC3508ur zzb;

    @NotNull
    private final InterfaceC3508ur zzc;

    public zzff() {
        int i = zzav.zza;
        this.zza = AbstractC0069Df.G(zzfc.zza);
        this.zzb = AbstractC0069Df.G(zzfd.zza);
        this.zzc = AbstractC0069Df.G(zzfe.zza);
    }

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) zzffVar.zza.getValue();
    }

    public static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, InterfaceC3493uc interfaceC3493uc) throws Exception {
        String strZza;
        try {
            String strZzl = zzscVar.zzl();
            String strZzM = zzscVar.zzM();
            zzaq zzaqVarZzf = zzffVar.zzf();
            String strZzb = null;
            if (zzaqVarZzf != null && zzaqVarZzf.zzd(strZzM)) {
                zzen zzenVarZzf = zzekVar.zzf(25);
                try {
                    strZza = zzffVar.zzf().zza(strZzM);
                } catch (Exception e) {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzR, e.getMessage()));
                }
                if (strZza != null) {
                    zzenVarZzf.zza();
                    strZzb = strZza;
                } else {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
                }
            }
            if (strZzb == null) {
                zzaq zzaqVarZzf2 = zzffVar.zzf();
                if (zzaqVarZzf2 != null) {
                    zzaqVarZzf2.zzb();
                }
                zzen zzenVarZzf2 = zzekVar.zzf(23);
                try {
                    strZzb = zzffVar.zzg().zzb(strZzl);
                    zzenVarZzf2.zza();
                    zzen zzenVarZzf3 = zzekVar.zzf(24);
                    try {
                        zzaq zzaqVarZzf3 = zzffVar.zzf();
                        if (zzaqVarZzf3 != null) {
                            zzaqVarZzf3.zzc(strZzM, strZzb);
                        }
                        zzenVarZzf3.zza();
                    } catch (Exception e2) {
                        zzenVarZzf3.zzb(new zzbd(zzbb.zzk, zzba.zzT, e2.getMessage()));
                    }
                } catch (zzbd e3) {
                    zzenVarZzf2.zzb(e3);
                    throw e3;
                }
            }
            return CH.Z(zzscVar.zzk(), "JAVASCRIPT_TAG", strZzb);
        } catch (Exception e4) {
            if (e4 instanceof zzbd) {
                throw e4;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e4.getMessage());
        }
    }

    private final zzaq zzf() {
        return (zzaq) this.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) this.zzc.getValue();
    }

    @Nullable
    public final Object zzc(@NotNull String str, @NotNull zzto zztoVar, @NotNull InterfaceC3493uc interfaceC3493uc) {
        return AbstractC0136He.h(new zzfb(this, str, zztoVar, null), interfaceC3493uc);
    }

    @Nullable
    public final Object zzd(@NotNull zzsc zzscVar, @NotNull zzek zzekVar, @NotNull InterfaceC3493uc interfaceC3493uc) {
        return zze(this, zzscVar, zzekVar, interfaceC3493uc);
    }
}
