package com.google.android.recaptcha.internal;

import defpackage.AbstractC0136He;
import defpackage.DK;
import defpackage.EnumC0321Sc;
import defpackage.InterfaceC0304Rc;
import defpackage.InterfaceC3493uc;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzft implements zzfo {

    @NotNull
    private final InterfaceC0304Rc zza;

    @NotNull
    private final zzgf zzb;

    @NotNull
    private final zzhx zzc;

    @NotNull
    private final Map zzd;

    public zzft(@NotNull InterfaceC0304Rc interfaceC0304Rc, @NotNull zzgf zzgfVar, @NotNull zzhx zzhxVar, @NotNull Map map) {
        this.zza = interfaceC0304Rc;
        this.zzb = zzgfVar;
        this.zzc = zzhxVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzft zzftVar, zzuf zzufVar, zzgd zzgdVar) throws zzce {
        zzjh zzjhVarZzb = zzjh.zzb();
        int iZza = zzgdVar.zza();
        zzgx zzgxVar = (zzgx) zzftVar.zzd.get(Integer.valueOf(zzufVar.zzf()));
        if (zzgxVar == null) {
            throw new zzce(5, 2, null);
        }
        int iZzg = zzufVar.zzg();
        zzue[] zzueVarArr = (zzue[]) zzufVar.zzj().toArray(new zzue[0]);
        zzgxVar.zza(iZzg, zzgdVar, (zzue[]) Arrays.copyOf(zzueVarArr, zzueVarArr.length));
        if (iZza == zzgdVar.zza()) {
            zzgdVar.zzg(zzgdVar.zza() + 1);
        }
        zzjhVarZzb.zzf();
        long jZza = zzjhVarZzb.zza(TimeUnit.MICROSECONDS);
        int i = zzbk.zza;
        int iZzk = zzufVar.zzk();
        if (iZzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzbk.zza(iZzk - 2, jZza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzgd zzgdVar, InterfaceC3493uc interfaceC3493uc) throws Throwable {
        Object objH = AbstractC0136He.h(new zzfq(zzgdVar, list, this, null), interfaceC3493uc);
        return objH == EnumC0321Sc.a ? objH : DK.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzgd zzgdVar, InterfaceC3493uc interfaceC3493uc) throws Throwable {
        Object objH = AbstractC0136He.h(new zzfr(exc, zzgdVar, this, null), interfaceC3493uc);
        return objH == EnumC0321Sc.a ? objH : DK.a;
    }

    @Override // com.google.android.recaptcha.internal.zzfo
    public final void zza(@NotNull String str) {
        AbstractC0136He.y(this.zza, new zzfs(new zzgd(this.zzb), this, str, null));
    }
}
