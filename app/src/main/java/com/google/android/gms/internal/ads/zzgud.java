package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgud extends zzgsc {
    private final zzguf zza;

    public zzgud(zzguf zzgufVar, int i) {
        super(zzgufVar.size(), i);
        this.zza = zzgufVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgsc
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
