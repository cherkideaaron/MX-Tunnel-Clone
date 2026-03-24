package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.AbstractC0137Hf;
import defpackage.AbstractC0500aq;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class zzfza {

    @NotNull
    private final zzfyw zza;

    public /* synthetic */ zzfza(zzfyw zzfywVar, AbstractC0137Hf abstractC0137Hf) {
        this.zza = zzfywVar;
    }

    public final /* synthetic */ zzfyy zza() {
        zzibr zzibrVarZzbu = this.zza.zzbu();
        AbstractC0500aq.l(zzibrVarZzbu, "build(...)");
        return (zzfyy) zzibrVarZzbu;
    }

    public final /* synthetic */ zziev zzb() {
        Map mapZzb = this.zza.zzb();
        AbstractC0500aq.l(mapZzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zziev(mapZzb);
    }

    public final void zzc(@NotNull zziev zzievVar, @NotNull String str, @NotNull zzfyu zzfyuVar) {
        AbstractC0500aq.m(zzievVar, "<this>");
        AbstractC0500aq.m(str, "key");
        AbstractC0500aq.m(zzfyuVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.zza.zzc(str, zzfyuVar);
    }

    public final /* synthetic */ void zzd(zziev zzievVar, String str) {
        AbstractC0500aq.m(zzievVar, "<this>");
        AbstractC0500aq.m(str, "key");
        this.zza.zza(str);
    }
}
