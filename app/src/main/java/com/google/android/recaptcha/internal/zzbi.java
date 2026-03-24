package com.google.android.recaptcha.internal;

import defpackage.AbstractC0136He;
import defpackage.AbstractC0600ch;
import defpackage.AbstractC2883jK;
import defpackage.AbstractC3564vt;
import defpackage.C0545bg;
import defpackage.C3010lj;
import defpackage.C3385sc;
import defpackage.ExecutorC0273Pf;
import defpackage.IH;
import defpackage.InterfaceC0304Rc;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class zzbi {

    @NotNull
    private final InterfaceC0304Rc zza;

    @NotNull
    private final InterfaceC0304Rc zzb;

    @NotNull
    private final InterfaceC0304Rc zzc;

    @NotNull
    private final InterfaceC0304Rc zzd;

    public zzbi() {
        IH ih = new IH(null);
        C0545bg c0545bg = AbstractC0600ch.a;
        this.zza = new C3385sc(AbstractC2883jK.I(ih, AbstractC3564vt.a));
        C3385sc c3385scA = AbstractC0136He.a(new C3010lj(Executors.newSingleThreadExecutor()));
        AbstractC0136He.y(c3385scA, new zzbh(null));
        this.zzb = c3385scA;
        this.zzc = AbstractC0136He.a(ExecutorC0273Pf.c);
        C3385sc c3385scA2 = AbstractC0136He.a(new C3010lj(Executors.newSingleThreadExecutor()));
        AbstractC0136He.y(c3385scA2, new zzbg(null));
        this.zzd = c3385scA2;
    }

    @NotNull
    public final InterfaceC0304Rc zza() {
        return this.zzc;
    }

    @NotNull
    public final InterfaceC0304Rc zzb() {
        return this.zza;
    }

    @NotNull
    public final InterfaceC0304Rc zzc() {
        return this.zzd;
    }

    @NotNull
    public final InterfaceC0304Rc zzd() {
        return this.zzb;
    }
}
